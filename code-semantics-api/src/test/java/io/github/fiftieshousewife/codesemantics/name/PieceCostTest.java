package io.github.fiftieshousewife.codesemantics.name;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PieceCostTest {

    private final PieceCost frequencyAlone = new PieceCost(WordRanks.fromClasspath(), CitedTokens.NONE);

    @Test
    void pricesACommonWordBelowARarerOne() {
        assertThat(frequencyAlone.of("event")).isLessThan(frequencyAlone.of("archive"));
    }

    @Test
    void refusesAPieceNothingReads() {
        assertAll(
                () -> assertThat(frequencyAlone.of("qzxfgh")).isEqualTo(PieceCost.UNPARSEABLE),
                () -> assertThat(frequencyAlone.reads("qzxfgh")).isFalse(),
                () -> assertThat(frequencyAlone.reads("event")).isTrue());
    }

    @Test
    void refusesATwoLetterPieceTooRareToCountAsAWord() {
        assertAll(
                () -> assertThat(frequencyAlone.of("id"))
                        .as("id ranks 4690, and a two-letter piece must rank inside 1000 to count")
                        .isEqualTo(PieceCost.UNPARSEABLE),
                () -> assertThat(frequencyAlone.reads("of")).isTrue());
    }

    @Test
    void pricesACitedTokenTheFrequencyListRefuses() {
        final PieceCost citing = new PieceCost(WordRanks.fromClasspath(), "id"::equals);

        assertAll(
                () -> assertThat(citing.reads("id")).isTrue(),
                () -> assertThat(citing.of("id")).isLessThan(citing.of("archive")));
    }

    @Test
    void pricesAResidualAboveAnyWordItCouldHaveRead() {
        assertAll(
                () -> assertThat(frequencyAlone.residualCost()).isGreaterThan(frequencyAlone.of("archive")),
                () -> assertThat(frequencyAlone.residualCost()).isLessThan(PieceCost.UNPARSEABLE));
    }
}
