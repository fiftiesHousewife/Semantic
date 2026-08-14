package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Map;

import org.fifties.housewife.codesemantics.engine.theme.JensenShannon.Contribution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class JensenShannonTest {

    private final JensenShannon divergence = new JensenShannon();

    private static TopicDistribution distribution(final Map<String, Double> mass) {
        return TopicDistribution.ofCitedMass(mass);
    }

    @Test
    void readsNoDistanceBetweenAScopeAndItself() {
        final TopicDistribution scope = distribution(Map.of("linguistics", 3.0, "music", 1.0));

        assertAll(
                () -> assertThat(divergence.divergence(scope, scope)).isCloseTo(0.0, offset(1e-12)),
                () -> assertThat(divergence.contributions(scope, scope))
                        .as("a scope identical to its reference has nothing to rank")
                        .isEmpty());
    }

    @Test
    void reachesExactlyOneBitWhenTheTwoSupportsAreDisjoint() {
        assertThat(divergence.divergence(distribution(Map.of("linguistics", 1.0)),
                distribution(Map.of("jewellery", 1.0))))
                .as("the maximum follows from the definition and is never chosen")
                .isCloseTo(1.0, offset(1e-12));
    }

    @Test
    void staysWithinItsOwnBoundForAnyPairOfDistributions() {
        assertThat(divergence.divergence(distribution(Map.of("linguistics", 3.0, "music", 1.0)),
                distribution(Map.of("music", 1.0, "law", 9.0))))
                .isBetween(0.0, 1.0);
    }

    @Test
    void readsTheSameDistanceInEitherDirection() {
        final TopicDistribution scope = distribution(Map.of("linguistics", 3.0, "music", 1.0));
        final TopicDistribution reference = distribution(Map.of("music", 1.0, "law", 9.0));

        assertThat(divergence.divergence(scope, reference))
                .isCloseTo(divergence.divergence(reference, scope), offset(1e-12));
    }

    @Test
    void decomposesIntoContributionsThatSumToTheWhole() {
        final TopicDistribution scope = distribution(Map.of("linguistics", 3.0, "music", 1.0));
        final TopicDistribution reference = distribution(Map.of("music", 1.0, "law", 9.0));

        assertAll(
                () -> assertThat(divergence.contributions(scope, reference).stream()
                        .mapToDouble(Contribution::bits).sum())
                        .isCloseTo(divergence.divergence(scope, reference), offset(1e-12)),
                () -> assertThat(divergence.contributions(scope, reference).stream()
                        .mapToDouble(Contribution::shareOfDivergence).sum())
                        .as("each topic's share of the difference is bounded and they sum to one")
                        .isCloseTo(1.0, offset(1e-12)),
                () -> assertThat(divergence.contributions(scope, reference))
                        .allSatisfy(contribution -> assertThat(contribution.bits()).isNotNegative()));
    }

    @Test
    void ranksTheTopicAccountingForMostOfTheDifferenceFirst() {
        assertThat(divergence.contributions(distribution(Map.of("linguistics", 9.0, "music", 1.0)),
                distribution(Map.of("music", 1.0, "linguistics", 1.0))))
                .first()
                .extracting(Contribution::topic)
                .isEqualTo("music");
    }

    @Test
    void reportsDirectionAsASignAndNeverFoldsItIntoTheMagnitude() {
        final TopicDistribution scope = distribution(Map.of("linguistics", 9.0, "music", 1.0));
        final TopicDistribution reference = distribution(Map.of("linguistics", 1.0, "music", 1.0));

        assertAll(
                () -> assertThat(divergence.contributions(scope, reference))
                        .filteredOn(contribution -> "linguistics".equals(contribution.topic()))
                        .allSatisfy(contribution -> assertThat(contribution.concentratedInScope()).isTrue()),
                () -> assertThat(divergence.contributions(scope, reference))
                        .filteredOn(contribution -> "music".equals(contribution.topic()))
                        .allSatisfy(contribution -> assertThat(contribution.concentratedInScope()).isFalse()));
    }

    @Test
    void readsNoDistanceBetweenTwoScopesThatDifferOnlyInHowMuchTheyCouldPlace() {
        final TopicDistribution read = TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0), 0.0);
        final TopicDistribution barelyRead =
                TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0), 36.0);

        assertAll(
                () -> assertThat(divergence.divergence(read, barelyRead))
                        .as("how much of a scope nobody could read is not a subject the other is far from")
                        .isCloseTo(0.0, offset(1e-12)),
                () -> assertThat(divergence.contributions(barelyRead, read))
                        .allSatisfy(contribution ->
                                assertThat(contribution.bits()).isCloseTo(0.0, offset(1e-12))));
    }

    @Test
    void comparesSharesOfWhatEachSidePlacedRatherThanOfWhatItObserved() {
        final TopicDistribution scope = TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0), 4.0);
        final TopicDistribution reference = distribution(Map.of("linguistics", 1.0, "music", 1.0));

        assertThat(divergence.contributions(scope, reference))
                .filteredOn(contribution -> "linguistics".equals(contribution.topic()))
                .singleElement()
                .satisfies(contribution -> assertThat(contribution.scopeShare()).isEqualTo(0.75));
    }

    @Test
    void ranksASingleDistributionsOwnTopicsLargestFirst() {
        assertThat(JensenShannon.ranked(distribution(Map.of("music", 1.0, "linguistics", 3.0))))
                .first()
                .extracting(Map.Entry::getKey)
                .isEqualTo("linguistics");
    }
}
