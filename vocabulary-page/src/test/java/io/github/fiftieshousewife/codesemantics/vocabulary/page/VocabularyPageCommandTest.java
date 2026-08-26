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
    void funnelsASmallRepositoryFromItsNamesToItsMeanings(@TempDir final Path root) throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("Pricer.java"),
                "package a; /** Prices a coupon. */ class Pricer { int couponPrice; int lemmaParser; "
                        + "int grammarLexicon; int phonemeSyntax; }");
        final RepositoryReading reading = RepositoryReading.of(root);

        final VocabularyFunnel funnel = VocabularyFunnel.of(reading);

        assertAll(
                () -> assertThat(funnel.repository()).isEqualTo(root.getFileName().toString()),
                () -> assertThat(funnel.field())
                        .as("every rule can only narrow")
                        .isGreaterThanOrEqualTo(funnel.signals()),
                () -> assertThat(funnel.signals()).isGreaterThanOrEqualTo(funnel.words()),
                () -> assertThat(funnel.words()).isGreaterThanOrEqualTo(funnel.tiles().size()),
                () -> assertThat(funnel.field() - funnel.belowChance() - funnel.withinError()
                        - funnel.languageSupplied())
                        .as("the counts account for every word between the field and the signals")
                        .isEqualTo(funnel.signals()),
                () -> assertThat(funnel.tiles().stream()
                        .flatMap(tile -> tile.members().stream()))
                        .as("the tiles hold exactly the words the domain pages draw")
                        .containsExactlyInAnyOrderElementsOf(SignificantWords.of(reading).words().stream()
                                .map(ScoredWord::word)
                                .toList()));
    }

    @Test
    void writesOnePageEmbeddingTheStylesheetAndTheScript(@TempDir final Path reports) throws IOException {
        final VocabularyFunnel funnel = new VocabularyFunnel("a-repository", 10, 4, 1, 1, 4, 3, List.of(), List.of(), List.of());

        final Path page = VocabularyPageCommand.wrote(reports, funnel, List.of("linguistics"));

        assertAll(
                () -> assertThat(page).exists(),
                () -> assertThat(Files.readString(page))
                        .contains("a-repository")
                        .contains("<style>")
                        .contains("<script>"));
    }
}
