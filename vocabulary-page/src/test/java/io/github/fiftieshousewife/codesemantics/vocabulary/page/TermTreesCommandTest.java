package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermTreesCommandTest {

    @Test
    void ranksTheTreesByThePhraseOccurrencesEachFound(@TempDir final Path folder) throws IOException {
        final ReadingFolder reading = PublishedReadingFixture.wrote(folder);

        final List<TermTree> trees = TermTreesCommand.trees(reading);

        assertAll(
                () -> assertThat(trees).extracting(TermTree::vocabulary)
                        .containsExactly("FIBO", "BIAN", "CSO", "CWE", "FIX", "FpML", "OLiA"),
                () -> assertThat(trees.stream()
                        .filter(tree -> tree.vocabulary().equals("FIBO"))
                        .findFirst().orElseThrow().singleWordTerms()).isEqualTo(1),
                () -> assertThat(trees.stream()
                        .filter(tree -> tree.vocabulary().equals("BIAN"))
                        .findFirst().orElseThrow().roots()).isNotEmpty());
    }

    @Test
    void writesOnePageHoldingEveryVocabularysTree(@TempDir final Path folder, @TempDir final Path reports)
            throws IOException {
        final ReadingFolder reading = PublishedReadingFixture.wrote(folder);

        final Path page = TermTreesCommand.wrote(reports, "a-repository",
                TermTreesCommand.trees(reading));

        assertAll(
                () -> assertThat(page).exists(),
                () -> assertThat(reports.resolve("term-trees.json")).exists(),
                () -> assertThat(Files.readString(page))
                        .contains("a-repository")
                        .contains("FIBO")
                        .contains("BIAN")
                        .contains("Term Deposit")
                        .doesNotContain(">coupon<"));
    }
}
