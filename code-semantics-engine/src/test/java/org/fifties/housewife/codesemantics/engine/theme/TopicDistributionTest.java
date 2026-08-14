package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicDistributionTest {

    private static final double NOTHING_UNPLACED = 0.0;

    private static double total(final TopicDistribution distribution) {
        return distribution.shareByTopic().values().stream().mapToDouble(Double::doubleValue).sum();
    }

    @Test
    void readsMassAsSharesOfEverythingThatWasObserved() {
        final TopicDistribution distribution =
                TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0), NOTHING_UNPLACED);

        assertAll(
                () -> assertThat(distribution.shareOf("linguistics")).isEqualTo(0.75),
                () -> assertThat(distribution.shareOf("music")).isEqualTo(0.25),
                () -> assertThat(distribution.unplaced()).isZero(),
                () -> assertThat(total(distribution)).isCloseTo(1.0, offset(1e-12)));
    }

    @Test
    void readsAFileHalfOfWhichNothingCouldPlaceAsSharesSummingToAHalf() {
        final TopicDistribution distribution =
                TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0), 4.0);

        assertAll(
                () -> assertThat(total(distribution))
                        .as("what nothing could place sits in the denominator rather than vanishing from it")
                        .isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(distribution.unplaced()).isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(distribution.shareOf("linguistics")).isCloseTo(0.375, offset(1e-12)));
    }

    @Test
    void readsWhatWasPlacedAsADistributionOfItsOwn() {
        final TopicDistribution placed =
                TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0), 4.0).amongWhatWasPlaced();

        assertAll(
                () -> assertThat(total(placed)).isCloseTo(1.0, offset(1e-12)),
                () -> assertThat(placed.unplaced()).isZero(),
                () -> assertThat(placed.shareOf("linguistics")).isCloseTo(0.75, offset(1e-12)));
    }

    @Test
    void readsATopicNothingCommittedMassToAsZeroRatherThanAsMissing() {
        assertThat(TopicDistribution.of(Map.of("linguistics", 1.0), NOTHING_UNPLACED).shareOf("music"))
                .isZero();
    }

    @Test
    void hasNoDistributionAtAllWhenNothingCarriedMass() {
        assertAll(
                () -> assertThat(TopicDistribution.of(Map.of(), NOTHING_UNPLACED).isEmpty()).isTrue(),
                () -> assertThat(TopicDistribution.of(Map.of("music", 0.0), NOTHING_UNPLACED).isEmpty())
                        .isTrue());
    }

    @Test
    void readsAFileNothingCouldPlaceAnythingInAsWhollyUnplaced() {
        final TopicDistribution distribution = TopicDistribution.of(Map.of(), 7.0);

        assertAll(
                () -> assertThat(distribution.unplaced()).isEqualTo(1.0),
                () -> assertThat(distribution.isEmpty())
                        .as("a reading with no topic in it is still not a reading")
                        .isTrue());
    }

    @Test
    void refusesAnUnplacedShareThatIsNotAShare() {
        assertAll(
                () -> assertThatThrownBy(() -> new TopicDistribution(Map.of(), -0.5))
                        .isInstanceOf(IllegalArgumentException.class),
                () -> assertThatThrownBy(() -> new TopicDistribution(Map.of(), 1.5))
                        .isInstanceOf(IllegalArgumentException.class));
    }

    @Test
    void meansItsFilesEquallyHoweverBigTheyAre() {
        final TopicDistribution first = TopicDistribution.of(Map.of("linguistics", 100.0), NOTHING_UNPLACED);
        final TopicDistribution second = TopicDistribution.of(Map.of("music", 1.0), NOTHING_UNPLACED);

        assertThat(TopicDistribution.meanOf(List.of(first, second)).shareOf("linguistics"))
                .as("a file is one observation, and its mass does not buy it a bigger vote")
                .isEqualTo(0.5);
    }

    @Test
    void meansWhatItsFilesCouldNotPlaceAsItMeansWhatTheyCould() {
        final TopicDistribution read = TopicDistribution.of(Map.of("linguistics", 1.0), NOTHING_UNPLACED);
        final TopicDistribution half = TopicDistribution.of(Map.of("linguistics", 1.0), 1.0);

        assertThat(TopicDistribution.meanOf(List.of(read, half)).unplaced())
                .isCloseTo(0.25, offset(1e-12));
    }

    @Test
    void removesAFileThatCarriedNoReadingRatherThanEnteringItAsUniform() {
        final TopicDistribution read = TopicDistribution.of(Map.of("linguistics", 1.0), NOTHING_UNPLACED);
        final TopicDistribution silent = TopicDistribution.of(Map.of(), NOTHING_UNPLACED);

        assertAll(
                () -> assertThat(TopicDistribution.meanOf(List.of(read, silent)).shareOf("linguistics"))
                        .isEqualTo(1.0),
                () -> assertThat(TopicDistribution.meanOf(List.of(silent, silent)).isEmpty()).isTrue());
    }

    @Test
    void meansToADistributionThatSumsToOneLessWhatCouldNotBePlaced() {
        final TopicDistribution mean = TopicDistribution.meanOf(List.of(
                TopicDistribution.of(Map.of("linguistics", 3.0, "music", 1.0), NOTHING_UNPLACED),
                TopicDistribution.of(Map.of("music", 1.0, "law", 1.0), 2.0)));

        assertAll(
                () -> assertThat(mean.unplaced()).isCloseTo(0.25, offset(1e-12)),
                () -> assertThat(total(mean)).isCloseTo(0.75, offset(1e-12)));
    }

    @Test
    void readsTheSupportOfAComparisonAsEitherSidesTopics() {
        assertThat(TopicDistribution.support(
                TopicDistribution.of(Map.of("linguistics", 1.0), NOTHING_UNPLACED),
                TopicDistribution.of(Map.of("music", 1.0), NOTHING_UNPLACED)))
                .containsExactlyInAnyOrder("linguistics", "music");
    }
}
