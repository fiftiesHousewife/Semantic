package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class RankCorrelationTest {

    private final RankCorrelation correlation = new RankCorrelation();

    private static TopicDistribution reading(final Map<String, Double> mass) {
        return TopicDistribution.ofCitedMass(mass);
    }

    @Test
    void readsTwoReadingsThatRankTheirTopicsAlikeAsWhollyAgreeing() {
        assertThat(correlation.between(
                reading(Map.of("linguistics", 3.0, "music", 2.0, "geology", 1.0)),
                reading(Map.of("linguistics", 9.0, "music", 4.0, "geology", 2.0))).orElseThrow())
                .isCloseTo(1.0, offset(1e-12));
    }

    @Test
    void readsAReversedRankingAsWhollyDisagreeing() {
        assertThat(correlation.between(
                reading(Map.of("linguistics", 3.0, "music", 2.0, "geology", 1.0)),
                reading(Map.of("linguistics", 1.0, "music", 2.0, "geology", 3.0))).orElseThrow())
                .isCloseTo(-1.0, offset(1e-12));
    }

    @Test
    void ranksATopicOneReadingNeverNamedBelowEveryTopicItDid() {
        assertThat(correlation.between(reading(Map.of("linguistics", 1.0)), reading(Map.of("music", 1.0)))
                .orElseThrow())
                .isCloseTo(-1.0, offset(1e-12));
    }

    @Test
    void sharesOneRankBetweenTheTopicsAReadingHoldsEqually() {
        assertAll(
                () -> assertThat(correlation.between(
                        reading(Map.of("linguistics", 2.0, "music", 2.0, "geology", 1.0)),
                        reading(Map.of("linguistics", 2.0, "music", 2.0, "geology", 1.0))).orElseThrow())
                        .as("a tie against the same tie is agreement, not a coin toss")
                        .isCloseTo(1.0, offset(1e-12)),
                () -> assertThat(correlation.between(
                        reading(Map.of("linguistics", 2.0, "music", 2.0, "geology", 1.0)),
                        reading(Map.of("linguistics", 2.0, "music", 1.0, "geology", 2.0))).orElseThrow())
                        .isCloseTo(-0.5, offset(1e-12)));
    }

    @Test
    void staysInsideTheBoundItsOwnDefinitionGivesIt() {
        assertThat(correlation.between(
                reading(Map.of("linguistics", 5.0, "music", 1.0, "geology", 4.0, "law", 2.0)),
                reading(Map.of("linguistics", 1.0, "music", 5.0, "geology", 2.0, "law", 4.0))).orElseThrow())
                .isBetween(-1.0, 1.0);
    }

    @Test
    void saysNothingWhereARankingHasNoOrderToCorrelate() {
        assertAll(
                () -> assertThat(correlation.between(
                        reading(Map.of("linguistics", 1.0, "music", 1.0)),
                        reading(Map.of("linguistics", 2.0, "music", 1.0))))
                        .as("every topic tied on one side leaves the correlation undefined rather than zero")
                        .isEmpty(),
                () -> assertThat(correlation.between(reading(Map.of("linguistics", 1.0)),
                        reading(Map.of("linguistics", 2.0)))).isEmpty(),
                () -> assertThat(correlation.between(TopicDistribution.NOTHING, TopicDistribution.NOTHING))
                        .isEmpty());
    }
}
