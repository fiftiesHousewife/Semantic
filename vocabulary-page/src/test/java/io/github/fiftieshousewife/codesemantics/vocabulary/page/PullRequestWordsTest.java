package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PullRequestWordsTest {

    private final PullRequestWords words = new PullRequestWords();

    @Test
    void mergesTheFormsADictionaryCallsOneWord() {
        final PullRequestWords.Merged merged = words
                .of(pullRequest(1, "tballison", List.of("component", "components")))
                .getFirst();

        assertAll(
                () -> assertThat(merged.word()).isEqualTo("component"),
                () -> assertThat(merged.forms()).containsExactly("component", "components"),
                () -> assertThat(merged.occurrences())
                        .as("both forms are the same word written twice, so their counts add")
                        .isEqualTo(24),
                () -> assertThat(merged.inDictionary()).isTrue());
    }

    @Test
    void keepsAWordNoDictionaryCarriesInTheFormItWasWritten() {
        final List<PullRequestWords.Merged> merged =
                words.of(pullRequest(1, "tballison", List.of("qzxv")));

        assertAll(
                () -> assertThat(merged).hasSize(1),
                () -> assertThat(merged.getFirst().word()).isEqualTo("qzxv"),
                () -> assertThat(merged.getFirst().inDictionary()).isFalse());
    }

    @Test
    void readsOnlyTheWordsADictionaryCarriesWhereMeaningIsAsked() {
        assertThat(words.carryingMeaning(pullRequest(1, "tballison", List.of("qzxv", "parser"))))
                .extracting(PullRequestWords.Merged::word)
                .containsExactly("parser");
    }

    @Test
    void ranksTheStrongestClaimFirst() {
        assertThat(words.of(pullRequest(1, "tballison", List.of("parser", "loader"))))
                .extracting(PullRequestWords.Merged::word)
                .hasSize(2);
    }
}
