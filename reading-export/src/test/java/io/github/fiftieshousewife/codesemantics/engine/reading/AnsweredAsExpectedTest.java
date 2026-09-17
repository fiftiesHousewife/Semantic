package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AnsweredAsExpectedTest {

    private final AnsweredAsExpected expected = new AnsweredAsExpected();

    @Test
    void readsAVocabularyFiringOnAPositiveControlAsTheResultItWasAddedFor() {
        assertAll(
                () -> assertThat(expected.of("positive-control", List.of("FIBO"))).isTrue(),
                () -> assertThat(expected.of("positive-control", List.of())).isFalse());
    }

    @Test
    void readsSilenceOnANegativeControlAsTheResultItWasAddedFor() {
        assertAll(
                () -> assertThat(expected.of("negative-control", List.of())).isTrue(),
                () -> assertThat(expected.of("negative-control", List.of("CSO"))).isFalse());
    }

    @Test
    void scoresNeitherWayForAMemberHereToDemonstrateSomethingElse() {
        assertAll(
                () -> assertThat(expected.scores("no-taxonomy")).isFalse(),
                () -> assertThat(expected.scores("degenerate")).isFalse(),
                () -> assertThat(expected.scores("positive-control")).isTrue(),
                () -> assertThat(expected.scores("negative-control")).isTrue());
    }

    @Test
    void countsEachControlSeparatelyBecauseFiringAndStayingSilentAreDifferentClaims() {
        final AnsweredAsExpected.Tally tally = new AnsweredAsExpected.Tally();
        tally.add("positive-control", List.of("FIBO"));
        tally.add("positive-control", List.of());
        tally.add("negative-control", List.of());
        tally.add("negative-control", List.of("PRONOM"));
        tally.add("no-taxonomy", List.of("CSO"));

        assertAll(
                () -> assertThat(tally.positives()).isEqualTo(2),
                () -> assertThat(tally.positivesFiring()).isEqualTo(1),
                () -> assertThat(tally.negatives()).isEqualTo(2),
                () -> assertThat(tally.negativesSilent()).isEqualTo(1),
                () -> assertThat(tally.unscored())
                        .as("a member here for another reason is counted and not scored")
                        .isEqualTo(1));
    }
}
