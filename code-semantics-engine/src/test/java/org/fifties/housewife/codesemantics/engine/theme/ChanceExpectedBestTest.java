package org.fifties.housewife.codesemantics.engine.theme;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ChanceExpectedBestTest {

    private static final int DRAWN = 999;

    @Test
    void asksMoreOfAWinnerTheLargerTheFieldItBeat() {
        assertAll(
                () -> assertThat(ChanceExpectedBest.nearestIn(1, DRAWN))
                        .as("a field of one is judged against the middle of the draws")
                        .isEqualTo(499),
                () -> assertThat(ChanceExpectedBest.nearestIn(9, DRAWN)).isEqualTo(99),
                () -> assertThat(ChanceExpectedBest.nearestIn(152, DRAWN)).isEqualTo(6));
    }

    @Test
    void readsTheSameQuantileFromTheFarEndForAStatisticWhereLargerIsFurther() {
        assertAll(
                () -> assertThat(ChanceExpectedBest.furthestIn(1, DRAWN)).isEqualTo(499),
                () -> assertThat(ChanceExpectedBest.furthestIn(9, DRAWN)).isEqualTo(899),
                () -> assertThat(ChanceExpectedBest.furthestIn(152, DRAWN)).isEqualTo(992));
    }

    @Test
    void staysInsideAFieldOfDrawsTooSmallToHoldItsOwnQuantile() {
        assertAll(
                () -> assertThat(ChanceExpectedBest.nearestIn(2, 1)).isZero(),
                () -> assertThat(ChanceExpectedBest.furthestIn(2, 1)).isZero());
    }
}
