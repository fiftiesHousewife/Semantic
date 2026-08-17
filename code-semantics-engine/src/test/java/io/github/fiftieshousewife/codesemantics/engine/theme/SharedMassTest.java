package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class SharedMassTest {

    private static final TopicDistribution BROAD =
            new TopicDistribution(Map.of("computing", 0.5, "linguistics", 0.3, "law", 0.2), 0.0);

    private static final TopicDistribution NARROW =
            new TopicDistribution(Map.of("linguistics", 1.0), 0.0);

    private static final TopicDistribution ELSEWHERE =
            new TopicDistribution(Map.of("astronomy", 1.0), 0.0);

    private final SharedMass mass = new SharedMass();

    @Test
    void countsPerTopicTheMassBothPutThere() {
        assertThat(mass.sharedBy(BROAD, NARROW)).isCloseTo(0.3, offset(1e-9));
    }

    @Test
    void sharesEverythingWithItselfAndNothingWithSomethingElsewhere() {
        assertAll(
                () -> assertThat(mass.sharedBy(BROAD, BROAD)).isCloseTo(1.0, offset(1e-9)),
                () -> assertThat(mass.sharedBy(BROAD, ELSEWHERE)).isCloseTo(0.0, offset(1e-9)));
    }

    @Test
    void reportsADistanceBoundedByTheFactThatSharesSumToOne() {
        assertAll(
                () -> assertThat(mass.between(BROAD, BROAD)).isCloseTo(0.0, offset(1e-9)),
                () -> assertThat(mass.between(BROAD, ELSEWHERE)).isCloseTo(1.0, offset(1e-9)),
                () -> assertThat(mass.between(BROAD, NARROW)).isBetween(0.0, 1.0));
    }

    @Test
    void doesNotPunishASubjectForBeingNarrowerThanTheScopeItIsComparedWith() {
        assertThat(mass.between(BROAD, NARROW))
                .as("a narrow reading squarely inside a broad one is nearer than one outside it")
                .isLessThan(mass.between(BROAD, ELSEWHERE));
    }

    @Test
    void namesTheTopicsTheAgreementIsMadeOfLargestFirst() {
        assertThat(mass.contributions(BROAD, new TopicDistribution(
                Map.of("computing", 0.4, "linguistics", 0.6), 0.0)))
                .extracting(SharedMass.Shared::topic)
                .containsExactly("computing", "linguistics");
    }

    @Test
    void statesTheAgreementAsSharesOfItselfSoTheTopicsSumToOne() {
        assertThat(mass.sharesOf(BROAD, NARROW).values().stream().mapToDouble(Double::doubleValue).sum())
                .isCloseTo(1.0, offset(1e-9));
    }

    @Test
    void sharesNothingOutWhereThereWasNoAgreementToShare() {
        assertThat(mass.sharesOf(BROAD, ELSEWHERE)).isEmpty();
    }
}
