package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicDistributionTest {

    private static double total(final TopicDistribution distribution) {
        return distribution.shareByTopic().values().stream().mapToDouble(Double::doubleValue).sum();
    }

    @Test
    void readsMassAsSharesThatSumToOne() {
        final TopicDistribution distribution = TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0));

        assertAll(
                () -> assertThat(distribution.shareOf("linguistics")).isEqualTo(0.75),
                () -> assertThat(distribution.shareOf("music")).isEqualTo(0.25),
                () -> assertThat(total(distribution)).isCloseTo(1.0, offset(1e-12)));
    }

    @Test
    void readsATopicNothingCommittedMassToAsZeroRatherThanAsMissing() {
        assertThat(TopicDistribution.of(Map.of("linguistics", 1.0)).shareOf("music")).isZero();
    }

    @Test
    void hasNoDistributionAtAllWhenNothingCarriedMass() {
        assertAll(
                () -> assertThat(TopicDistribution.of(Map.of()).isEmpty()).isTrue(),
                () -> assertThat(TopicDistribution.of(Map.of("music", 0.0)).isEmpty()).isTrue());
    }

    @Test
    void meansItsFilesEquallyHoweverBigTheyAre() {
        final TopicDistribution first = TopicDistribution.of(Map.of("linguistics", 100.0));
        final TopicDistribution second = TopicDistribution.of(Map.of("music", 1.0));

        assertThat(TopicDistribution.meanOf(List.of(first, second)).shareOf("linguistics"))
                .as("a file is one observation, and its mass does not buy it a bigger vote")
                .isEqualTo(0.5);
    }

    @Test
    void removesAFileThatCarriedNoReadingRatherThanEnteringItAsUniform() {
        final TopicDistribution read = TopicDistribution.of(Map.of("linguistics", 1.0));
        final TopicDistribution silent = TopicDistribution.of(Map.of());

        assertAll(
                () -> assertThat(TopicDistribution.meanOf(List.of(read, silent)).shareOf("linguistics"))
                        .isEqualTo(1.0),
                () -> assertThat(TopicDistribution.meanOf(List.of(silent, silent)).isEmpty()).isTrue());
    }

    @Test
    void meansToADistributionThatItselfSumsToOne() {
        final TopicDistribution mean = TopicDistribution.meanOf(List.of(
                TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0)),
                TopicDistribution.of(Map.of("music", 1.0, "law", 1.0))));

        assertThat(total(mean)).isCloseTo(1.0, offset(1e-12));
    }

    @Test
    void readsTheSupportOfAComparisonAsEitherSidesTopics() {
        assertThat(TopicDistribution.support(
                TopicDistribution.of(Map.of("linguistics", 1.0)),
                TopicDistribution.of(Map.of("music", 1.0))))
                .containsExactlyInAnyOrder("linguistics", "music");
    }
}
