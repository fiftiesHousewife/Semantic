package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.fifties.housewife.codesemantics.name.WordSegmenter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class LegibilityReadingTest {

    private final LegibilityReading reading = new LegibilityReading(
            new CitedWords(List.of(new ResourceCitation(EvidenceSource.WORD_FREQUENCY,
                    Set.of("page", "cursor", "next", "example", "the", "of")::contains))),
            new IdentifierWords(WordSegmenter.fromClasspath()));

    private static Path write(final Path root, final String path, final String source) throws IOException {
        final Path file = root.resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, source);
        return file;
    }

    private static ParsedRepository parsed(final Path root, final SourceScope... scopes) {
        return ParsedRepository.of(root, List.of(scopes));
    }

    @Test
    void readsEveryScopeAndTheSameOccurrencesAgainAsOneRepository(@TempDir final Path root) throws IOException {
        final Path main = write(root, "engine/src/main/java/Page.java",
                "package example.main;\nclass Page { int cursor; }\n");
        final Path test = write(root, "engine/src/test/java/PageTest.java",
                "package example.test;\nclass PageTest { int dsl; }\n");

        final RepositoryLegibility read = reading.of(parsed(root,
                new SourceScope("main", List.of(main)), new SourceScope("test", List.of(test))));

        assertAll(
                () -> assertThat(read.scopes()).extracting(ScopeLegibility::name).containsExactly("main", "test"),
                () -> assertThat(read.repository().files()).isEqualTo(2),
                () -> assertThat(read.repository().counts().words())
                        .isEqualTo(read.scopes().stream().mapToInt(scope -> scope.counts().words()).sum()),
                () -> assertThat(read.repository().counts().distinctWords())
                        .as("page is one surface across two scopes and several occurrences")
                        .isLessThan(read.scopes().stream()
                                .mapToInt(scope -> scope.counts().distinctWords()).sum()));
    }

    @Test
    void readsWhatWasDeclaredAndWrittenAndNothingThatWasMerelyUsed(@TempDir final Path root)
            throws IOException {
        final Path file = write(root, "engine/src/main/java/Page.java", """
                package example;
                import java.util.List;
                /** The next page. */
                class Page {
                    private final List<String> cursor = List.of();
                }
                """);

        final RepositoryLegibility read = reading.of(parsed(root, new SourceScope("main", List.of(file))));

        assertAll(
                () -> assertThat(read.repository().counts().declarations())
                        .as("Page and cursor, and neither List nor String nor the java.util import")
                        .isEqualTo(2),
                () -> assertThat(read.repository().unread().occurrences()).doesNotContainKeys("list", "string"),
                () -> assertThat(read.repository().counts().proseWords())
                        .as("the next page")
                        .isEqualTo(3));
    }

    @Test
    void recordsWhatTheReadingCostRatherThanEstimatingIt(@TempDir final Path root) throws IOException {
        final Path file = write(root, "engine/src/main/java/Page.java", "class Page { }\n");

        assertThat(reading.of(parsed(root, new SourceScope("main", List.of(file)))).elapsed())
                .isGreaterThanOrEqualTo(Duration.ZERO);
    }

    @Test
    void namesTheFileItCouldNotReadRatherThanSkippingIt(@TempDir final Path root) {
        final Path missing = root.resolve("engine/src/main/java/Absent.java");

        assertThatThrownBy(() -> parsed(root, new SourceScope("main", List.of(missing))))
                .isInstanceOf(UncheckedIOException.class)
                .hasMessageContaining("Absent.java");
    }

    @Test
    void sitesAnUnreadWordAtThePathAndLineItWasWritten(@TempDir final Path root) throws IOException {
        final Path file = write(root, "engine/src/main/java/Page.java", "class Page {\n    int dsl;\n}\n");

        final RepositoryLegibility read = reading.of(parsed(root, new SourceScope("main", List.of(file))));

        assertThat(read.repository().unread().firstSite())
                .containsEntry("dsl", Path.of("engine/src/main/java/Page.java") + ":2");
    }

    @Test
    void readsAnEmptyRepositoryAsNoReadingRatherThanADivisionByZero(@TempDir final Path root) {
        final RepositoryLegibility read = reading.of(parsed(root));

        assertAll(
                () -> assertThat(read.scopes()).isEmpty(),
                () -> assertThat(read.repository().files()).isZero(),
                () -> assertThat(read.repository().counts().legibility()).isZero());
    }
}
