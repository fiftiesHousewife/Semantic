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

class VocabularyPageCommandTest {

    @Test
    void stagesEveryPipelineStageOfASmallRepository(@TempDir final Path root) throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("Pricer.java"),
                "package a; /** Prices a trade. */ class Pricer { int tradePrice; int couponSchedule; }");

        final StagedVocabulary staged = VocabularyPageCommand.staged(RepositoryReading.of(root));

        assertAll(
                () -> assertThat(staged.repository()).isEqualTo(root.getFileName().toString()),
                () -> assertThat(staged.stages())
                        .as("one panel per pipeline stage, in the order the stages run")
                        .isNotEmpty(),
                () -> assertThat(staged.stages().getFirst().words())
                        .as("the first stage holds the whole population the pipeline entered with")
                        .isGreaterThanOrEqualTo(staged.stages().getLast().words()));
    }

    @Test
    void writesOnePageEmbeddingTheStylesheetAndTheScript(@TempDir final Path reports) throws IOException {
        final StagedVocabulary staged = new StagedVocabulary("a-repository", 1, List.of());

        final Path page = VocabularyPageCommand.wrote(reports, staged);

        assertAll(
                () -> assertThat(page).exists(),
                () -> assertThat(Files.readString(page))
                        .contains("a-repository")
                        .contains("<style>")
                        .as("the stylesheet and the script are carried whole, so the page opens anywhere")
                        .contains("<script>"));
    }
}
