package org.fifties.housewife.codesemantics.model;

import org.junit.jupiter.api.Test;

import java.util.stream.DoubleStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PooledLogOddsTest {

    @Test
    void poolsSignedWeightsBySummation() {
        assertThat(PooledLogOdds.pool(DoubleStream.of(2.0, -0.5, 1.0))).isEqualTo(2.5);
    }

    @Test
    void anEmptyPoolCarriesNoEvidence() {
        assertThat(PooledLogOdds.pool(DoubleStream.empty())).isZero();
    }

    @Test
    void zeroEvidenceSquashesToZeroNotTheLogisticMidpoint() {
        assertThat(PooledLogOdds.squash(0.0, 2.5)).isZero();
    }

    @Test
    void evidenceAgainstGradesTheScoreBelowZeroInsteadOfClamping() {
        assertAll(
                () -> assertThat(PooledLogOdds.squash(-3.7, 2.5)).isNegative(),
                () -> assertThat(PooledLogOdds.squash(-9.4, 2.5)).isLessThan(PooledLogOdds.squash(-3.7, 2.5)),
                () -> assertThat(PooledLogOdds.squash(-9.4, 2.5)).isGreaterThan(-1.0));
    }

    @Test
    void theSquashStaysBelowOneFarPastTheRealEvidenceRange() {
        assertThat(PooledLogOdds.squash(36.0, 1.0)).isLessThan(1.0);
    }

    @Test
    void theSquashRisesMonotonicallyWithPooledEvidence() {
        assertAll(
                () -> assertThat(PooledLogOdds.squash(1.0, 2.5)).isGreaterThan(PooledLogOdds.squash(0.5, 2.5)),
                () -> assertThat(PooledLogOdds.squash(2.0, 2.5)).isGreaterThan(PooledLogOdds.squash(1.0, 2.5)),
                () -> assertThat(PooledLogOdds.squash(6.0, 2.5)).isGreaterThan(PooledLogOdds.squash(2.0, 2.5)));
    }

    @Test
    void theScaleSetsHowManyPooledUnitsMapToOneSquashUnit() {
        assertThat(PooledLogOdds.squash(5.0, 2.5)).isEqualTo(PooledLogOdds.squash(2.0, 1.0));
    }

    @Test
    void unsquashInvertsTheSquashAtAnyScale() {
        assertAll(
                () -> assertThat(PooledLogOdds.unsquash(PooledLogOdds.squash(3.7, 2.5), 2.5))
                        .isCloseTo(3.7, org.assertj.core.data.Offset.offset(1e-12)),
                () -> assertThat(PooledLogOdds.unsquash(PooledLogOdds.squash(-1.3, 1.0), 1.0))
                        .isCloseTo(-1.3, org.assertj.core.data.Offset.offset(1e-12)),
                () -> assertThat(PooledLogOdds.unsquash(0.0, 2.5)).isZero());
    }

    @Test
    void supportReadsEvidenceForAsTheUnitScaleSquash() {
        assertThat(PooledLogOdds.support(1.7)).isEqualTo(PooledLogOdds.squash(1.7, 1.0));
    }

    @Test
    void supportClampsEvidenceAgainstToZero() {
        assertThat(PooledLogOdds.support(-3.7)).isZero();
    }
}
