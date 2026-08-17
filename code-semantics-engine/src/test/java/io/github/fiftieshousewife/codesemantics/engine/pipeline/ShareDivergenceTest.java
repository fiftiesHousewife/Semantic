package io.github.fiftieshousewife.codesemantics.engine.pipeline;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class ShareDivergenceTest {

    private final ShareDivergence divergence = new ShareDivergence();

    @Test
    void readsNoDistanceBetweenADistributionAndItself() {
        final Map<String, Double> reading = Map.of("word", 0.6, "topic", 0.4);

        assertThat(divergence.between(reading, reading)).isCloseTo(0.0, offset(1e-12));
    }

    @Test
    void readsOneBitBetweenTwoDistributionsSharingNothing() {
        assertThat(divergence.between(Map.of("word", 1.0), Map.of("buffer", 1.0)))
                .as("the maximum follows from the definition and is attained only where the supports "
                        + "are disjoint")
                .isCloseTo(1.0, offset(1e-12));
    }

    @Test
    void decomposesIntoTermsThatSumToTheWholeDistance() {
        final Map<String, Double> left = Map.of("word", 0.7, "topic", 0.2, "buffer", 0.1);
        final Map<String, Double> right = Map.of("word", 0.2, "topic", 0.3, "buffer", 0.5);

        assertThat(divergence.support(left, right).stream()
                .mapToDouble(key -> divergence.at(key, left, right)).sum())
                .isCloseTo(divergence.between(left, right), offset(1e-12));
    }

    @Test
    void readsEveryTermAsNonNegativeSoAShareOfTheDistanceIsBounded() {
        final Map<String, Double> left = Map.of("word", 0.9, "topic", 0.1);
        final Map<String, Double> right = Map.of("word", 0.1, "topic", 0.9);

        assertThat(divergence.support(left, right))
                .allSatisfy(key -> assertThat(divergence.at(key, left, right)).isNotNegative());
    }

    @Test
    void readsTheSameDistanceWhicheverSideIsGivenFirst() {
        final Map<String, Double> left = Map.of("word", 0.8, "topic", 0.2);
        final Map<String, Double> right = Map.of("word", 0.3, "buffer", 0.7);

        assertAll(
                () -> assertThat(divergence.between(left, right))
                        .isCloseTo(divergence.between(right, left), offset(1e-12)),
                () -> assertThat(divergence.support(left, right)).containsExactlyInAnyOrder("word", "topic",
                        "buffer"));
    }
}
