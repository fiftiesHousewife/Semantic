package org.fifties.housewife.codesemantics.engine.parse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ParsedRepositoryTest {

    private static Path write(final Path root, final String path, final String source) throws IOException {
        final Path file = root.resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, source);
        return file;
    }

    private static ParsedRepository of(final Path root, final Path... files) {
        return ParsedRepository.of(root, List.of(new SourceScope("main", List.of(files))));
    }

    @Test
    void keepsTheDependenciesARepositoryChoseAndSetsAsideTheRest(@TempDir final Path root) throws IOException {
        final Path file = write(root, "Reading.java", """
                package example.engine;
                import java.util.List;
                import example.engine.other.Thing;
                import net.sf.extjwnl.data.POS;
                class Reading { }
                """);
        write(root, "Thing.java", "package example.engine.other;\nclass Thing { }\n");

        final ParsedRepository parsed = ParsedRepository.of(root,
                List.of(new SourceScope("main", List.of(file, root.resolve("Thing.java")))));

        assertAll(
                () -> assertThat(parsed.files().getFirst().occurrences())
                        .filteredOn(occurrence -> occurrence.form() == NameForm.IMPORT)
                        .extracting(NameOccurrence::text)
                        .containsExactly("net.sf.extjwnl.data.POS"),
                () -> assertThat(parsed.importsFrom(ImportOrigin.PLATFORM)).isOne(),
                () -> assertThat(parsed.importsFrom(ImportOrigin.INTERNAL)).isOne(),
                () -> assertThat(parsed.importsFrom(ImportOrigin.EXTERNAL)).isOne());
    }

    @Test
    void carriesEachFilesScopeAndLengthForTheScopesToBeReadOver(@TempDir final Path root) throws IOException {
        final Path file = write(root, "Reading.java", "package example;\nclass Reading { }\n");

        assertThat(of(root, file).files())
                .singleElement()
                .satisfies(parsed -> assertAll(
                        () -> assertThat(parsed.scope()).isEqualTo("main"),
                        () -> assertThat(parsed.path()).isEqualTo("Reading.java"),
                        () -> assertThat(parsed.lines()).isEqualTo(2),
                        () -> assertThat(parsed.sound()).isTrue(),
                        () -> assertThat(parsed.occurrencesOf(NameForm.TYPE)).isOne()));
    }

    @Test
    void countsAFileThatDidNotParseCleanlyAndStillReadsWhatItRecovered(@TempDir final Path root)
            throws IOException {
        final Path broken = write(root, "Broken.java",
                "package example;\nclass Broken {\n    int cursor;\n    void read() { int x = ; }\n}\n");
        final Path sound = write(root, "Sound.java", "package example;\nclass Sound { }\n");

        final ParsedRepository parsed = of(root, broken, sound);

        assertAll(
                () -> assertThat(parsed.unsoundFiles()).isOne(),
                () -> assertThat(parsed.files()).hasSize(2),
                () -> assertThat(parsed.files().getFirst().occurrences())
                        .as("a reading that dropped what it could not parse perfectly would report a "
                                + "smaller corpus without saying so")
                        .extracting(NameOccurrence::text)
                        .contains("cursor"));
    }

    @Test
    void readsNothingFromAnEmptyTree(@TempDir final Path root) {
        final ParsedRepository parsed = ParsedRepository.of(root, List.of());

        assertAll(
                () -> assertThat(parsed.files()).isEmpty(),
                () -> assertThat(parsed.unsoundFiles()).isZero(),
                () -> assertThat(parsed.importsFrom(ImportOrigin.EXTERNAL)).isZero());
    }
}
