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

class SynsetCloudCommandTest {

    @Test
    void gathersASmallRepositoriesSignificantWordsUnderTheirSenses(@TempDir final Path root)
            throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("Pricer.java"),
                "package a; /** Prices a coupon. */ class Pricer { int couponPrice; int lemmaParser; "
                        + "int grammarLexicon; int phonemeSyntax; }");

        final SynsetCloud cloud = SynsetCloudCommand.cloud(RepositoryReading.of(root));

        assertAll(
                () -> assertThat(cloud.repository()).isEqualTo(root.getFileName().toString()),
                () -> assertThat(cloud.senses()).isNotEmpty(),
                () -> assertThat(cloud.senses())
                        .as("the strongest meaning leads")
                        .isSortedAccordingTo((one, two) -> Double.compare(two.claim(), one.claim())));
    }

    @Test
    void writesOnePageEmbeddingTheStylesheetAndTheScript(@TempDir final Path reports) throws IOException {
        final SynsetCloud cloud = new SynsetCloud("a-repository", List.of(), 0, 0);

        final Path page = SynsetCloudCommand.wrote(reports, cloud, 0, List.of());

        assertAll(
                () -> assertThat(page).exists(),
                () -> assertThat(Files.readString(page))
                        .contains("a-repository")
                        .contains("<style>")
                        .contains("<script>"));
    }
}
