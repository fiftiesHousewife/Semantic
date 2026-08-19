package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.theme.ProbabilityOfSuperiority.Expectation;
import io.github.fiftieshousewife.codesemantics.engine.theme.ProbabilityOfSuperiority.Scored;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProbabilityOfSuperiorityTest {

    private final ProbabilityOfSuperiority superiority = new ProbabilityOfSuperiority();

    private static Scored meeting(final String topic, final double score) {
        return new Scored(topic, score, Expectation.MEETS_IT);
    }

    private static Scored notMeeting(final String topic, final double score) {
        return new Scored(topic, score, Expectation.DOES_NOT);
    }

    @Test
    void reportsCertaintyWhereEveryMarkedTopicOutscoresEveryUnmarkedOne() {
        assertThat(superiority.of(List.of(meeting("a", 9.0), meeting("b", 8.0),
                notMeeting("c", 1.0), notMeeting("d", 0.0))).chance()).isEqualTo(1.0);
    }

    @Test
    void reportsNothingWhereEveryMarkedTopicIsOutscoredByEveryUnmarkedOne() {
        assertThat(superiority.of(List.of(meeting("a", 0.0), meeting("b", 1.0),
                notMeeting("c", 8.0), notMeeting("d", 9.0))).chance()).isEqualTo(0.0);
    }

    @Test
    void reportsChanceWhereEveryTopicScoresTheSame() {
        assertThat(superiority.of(List.of(meeting("a", 0.0), meeting("b", 0.0),
                notMeeting("c", 0.0), notMeeting("d", 0.0))).chance())
                .isEqualTo(ProbabilityOfSuperiority.Superiority.CHANCE);
    }

    @Test
    void countsATiedPairAsHalf() {
        assertThat(superiority.of(List.of(meeting("a", 5.0), notMeeting("b", 5.0))).chance())
                .isEqualTo(ProbabilityOfSuperiority.Superiority.CHANCE);
    }

    @Test
    void readsTheOneMarkedTopicAboveTwoOfThreeUnmarkedOnes() {
        assertThat(superiority.of(List.of(meeting("a", 5.0),
                notMeeting("b", 9.0), notMeeting("c", 4.0), notMeeting("d", 1.0))).chance())
                .isCloseTo(2.0 / 3.0, within(1e-12));
    }

    @Test
    void carriesTheGroupSizesTheStatisticRestsOn() {
        final var found = superiority.of(List.of(meeting("a", 5.0), notMeeting("b", 1.0),
                notMeeting("c", 0.0)));
        assertAll(
                () -> assertThat(found.meeting()).isEqualTo(1),
                () -> assertThat(found.notMeeting()).isEqualTo(2),
                () -> assertThat(found.beatsChance()).isTrue());
    }

    @Test
    void refusesAnExpectationNoTopicMeets() {
        assertThatThrownBy(() -> superiority.of(List.of(notMeeting("a", 1.0), notMeeting("b", 0.0))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("no pair to compare");
    }

    @Test
    void refusesAnExpectationEveryTopicMeets() {
        assertThatThrownBy(() -> superiority.of(List.of(meeting("a", 1.0), meeting("b", 0.0))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("no pair to compare");
    }
}
