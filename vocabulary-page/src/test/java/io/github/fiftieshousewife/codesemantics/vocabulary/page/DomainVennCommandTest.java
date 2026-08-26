package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DomainVennCommandTest {

    @Test
    void overlapsTheSignificantWordsOfASmallRepositoryByTheirStatedDomains(@TempDir final Path root)
            throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("Pricer.java"),
                "package a; /** Prices a coupon. */ class Pricer { int couponPrice; int lemmaParser; "
                        + "int grammarLexicon; int phonemeSyntax; }");

        final DomainOverlap overlap = DomainVennCommand.overlap(RepositoryReading.of(root));

        assertAll(
                () -> assertThat(overlap.repository()).isEqualTo(root.getFileName().toString()),
                () -> assertThat(overlap.domains())
                        .as("a tiny tree still yields at least one domain to draw")
                        .isNotEmpty(),
                () -> assertThat(overlap.regions())
                        .as("every overlap of the drawn domains is reported, empty or not")
                        .hasSize((1 << overlap.domains().size()) - 1));
    }

    @Test
    void writesOnePageEmbeddingTheStylesheetAndTheScript(@TempDir final Path reports) throws IOException {
        final DomainOverlap overlap = new DomainOverlap("a-repository", List.of(), List.of(), List.of(), 0, 0, 0, 0.0);

        final Path page = DomainVennCommand.wrote(reports, overlap, 0);

        assertAll(
                () -> assertThat(page).exists(),
                () -> assertThat(Files.readString(page))
                        .contains("a-repository")
                        .contains("<style>")
                        .contains("<script>"));
    }
}
