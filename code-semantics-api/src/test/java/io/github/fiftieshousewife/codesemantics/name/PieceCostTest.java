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
    void refusesATwoLetterPieceWithoutACitationWhateverItsRank() {
        assertAll(
                () -> assertThat(frequencyAlone.of("id")).isEqualTo(PieceCost.UNPARSEABLE),
                () -> assertThat(frequencyAlone.of("of"))
                        .as("the commonest two-letter entries are the words English supplies, and a "
                                + "function word evidences no split")
                        .isEqualTo(PieceCost.UNPARSEABLE));
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
