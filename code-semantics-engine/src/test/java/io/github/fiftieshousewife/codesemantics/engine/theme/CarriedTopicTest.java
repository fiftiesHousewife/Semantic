package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CarriedTopicTest {

    private final TopicWitnesses witnesses = new TopicWitnesses();

    private void recorded(final String word, final double mass, final int times) {
        for (int seen = 0; seen < times; seen++) {
            witnesses.record("law", word, word + "Name", "A.java:1", EvidenceSource.WORDNET_DOMAIN, mass);
        }
    }

    @Test
    void statesTheShareOfTheTopicEachWordCarriedRatherThanHowOftenItWasWritten() {
        recorded("file", 0.01, 100);
        recorded("claim", 1.0, 10);

        final List<TopicWitnesses.CarriedTopic> carried = witnesses.carrying("law", 2);

        assertAll(
                () -> assertThat(carried).extracting(TopicWitnesses.CarriedTopic::word)
                        .containsExactly("claim", "file"),
                () -> assertThat(carried.getFirst().share()).isEqualTo(10.0 / 11.0, within(1e-9)),
                () -> assertThat(carried.getFirst().occurrences()).isEqualTo(10),
                () -> assertThat(carried.getLast().occurrences()).isEqualTo(100),
                () -> assertThat(carried.getLast().share()).isEqualTo(1.0 / 11.0, within(1e-9)));
    }

    @Test
    void ordersByTheShareItPrintsSoAReaderCanCheckTheOrder() {
        recorded("summary", 2.0, 1);
        recorded("witness", 5.0, 1);
        recorded("cite", 1.0, 1);

        assertThat(witnesses.carrying("law", 3))
                .extracting(TopicWitnesses.CarriedTopic::share)
                .isSortedAccordingTo(java.util.Comparator.reverseOrder());
    }

    @Test
    void sharesOfEveryCarryingWordSumToOneBecauseAShareBoundsItself() {
        recorded("summary", 2.0, 1);
        recorded("witness", 5.0, 1);
        recorded("cite", 1.0, 1);

        assertThat(witnesses.carrying("law", Integer.MAX_VALUE).stream()
                .mapToDouble(TopicWitnesses.CarriedTopic::share).sum()).isEqualTo(1.0, within(1e-9));
    }

    @Test
    void carriesNothingForATopicNoWordWasRecordedFor() {
        assertThat(witnesses.carrying("law", 4)).isEmpty();
    }

    private static org.assertj.core.data.Offset<Double> within(final double tolerance) {
        return org.assertj.core.data.Offset.offset(tolerance);
    }
}
