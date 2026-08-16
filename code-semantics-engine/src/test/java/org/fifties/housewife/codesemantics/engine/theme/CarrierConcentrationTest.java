package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class CarrierConcentrationTest {

    private final CarrierConcentration concentration = new CarrierConcentration();

    @Test
    void readsATopicOneWordCarriesEntirelyAsFullyConcentrated() {
        assertThat(concentration.of(Map.of("verdict", 9.0))).isEqualTo(1.0);
    }

    @Test
    void readsATopicSpreadEvenlyAcrossItsCarriersAsUnconcentrated() {
        assertAll(
                () -> assertThat(concentration.of(Map.of("a", 1.0, "b", 1.0))).isEqualTo(0.0, within(1e-9)),
                () -> assertThat(concentration.of(Map.of("a", 2.0, "b", 2.0, "c", 2.0, "d", 2.0)))
                        .isEqualTo(0.0, within(1e-9)));
    }

    @Test
    void risesAsOneCarrierTakesMoreOfTheTopic() {
        assertThat(concentration.of(Map.of("word", 8.0, "other", 2.0)))
                .isGreaterThan(concentration.of(Map.of("word", 6.0, "other", 4.0)));
    }

    @Test
    void staysInsideTheBoundTheEvenSpreadOfItsOwnCarriersGivesIt() {
        assertThat(concentration.of(Map.of("a", 5.0, "b", 3.0, "c", 1.0, "d", 1.0))).isBetween(0.0, 1.0);
    }

    @Test
    void readsATopicNoWordCarriedAsCarryingNothing() {
        assertAll(
                () -> assertThat(concentration.of(Map.of())).isEqualTo(0.0),
                () -> assertThat(concentration.of(Map.of("a", 0.0))).isEqualTo(0.0));
    }

    @Test
    void countsTheCarriersATopicWouldNeedToBeSpreadThisThinly() {
        assertAll(
                () -> assertThat(concentration.effectiveCarriers(Map.of("a", 1.0, "b", 1.0)))
                        .isEqualTo(2.0, within(1e-9)),
                () -> assertThat(concentration.effectiveCarriers(Map.of("a", 9.0, "b", 1.0)))
                        .isLessThan(2.0));
    }
}
