package io.github.fiftieshousewife.codesemantics.engine.theme;

import io.github.fiftieshousewife.codesemantics.name.WordRanks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordSpecificityTest {

    private final WordSpecificity specificity = WordSpecificity.fromClasspath();

    private final WordRanks ranks = WordRanks.fromClasspath();

    @Test
    void weighsTheCommonestWordInEnglishAboveZero() {
        assertAll(
                () -> assertThat(ranks.rank("the"))
                        .as("the list is ordered most frequent first")
                        .isOne(),
                () -> assertThat(specificity.of("the"))
                        .as("it is a weight and never a gate, so the commonest word still votes at the "
                                + "smallest weight the list can express; a weight of exactly zero sends "
                                + "the geometric mean of any phrase holding it to negative infinity")
                        .isGreaterThan(0.0));
    }

    @Test
    void weighsARarerWordAboveACommonerOne() {
        assertThat(specificity.of("lexicon")).isGreaterThan(specificity.of("word"));
    }

    @Test
    void weighsAWordTheListDoesNotCarryAsHighAsTheListCanSay() {
        assertThat(specificity.of("swaption")).isEqualTo(1.0);
    }

    @Test
    void boundsEveryWeightByTheListsOwnLength() {
        assertThat(ranks.words().stream().mapToDouble(specificity::of).max().orElseThrow())
                .as("log(rank + 1) / log(size + 1) reaches 1 at the last rank the list states and never "
                        + "passes it, so the bound follows from the list rather than from a constant")
                .isLessThanOrEqualTo(1.0);
    }
}
