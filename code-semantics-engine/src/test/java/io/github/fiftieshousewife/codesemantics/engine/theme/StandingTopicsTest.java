package io.github.fiftieshousewife.codesemantics.engine.theme;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * What a phrase is left standing with once its topics are scored. The coverage stub knows no word, so every
 * word is fully spoken for and the shares below are the scores alone.
 */
class StandingTopicsTest {

    private final SenseCoverage coverage =
            new SenseCoverage(new StatedSenses(Map.of(), Map.of()), word -> Set.of());

    private final StandingTopics standing = new StandingTopics();

    @Test
    void normalisesTheScoresOfTheTopicsThatStandToOneUnit() {
        standing.keep("cryptography", 3.0, Set.of("cipher"));
        standing.keep("publishing", 1.0, Set.of("source"));

        final PhraseReading reading = standing.readingAt(coverage);

        assertAll(
                () -> assertThat(reading.shareByTopic()).containsEntry("cryptography", 0.75),
                () -> assertThat(reading.shareByTopic()).containsEntry("publishing", 0.25),
                () -> assertThat(reading.agreementByTopic()).containsEntry("cryptography", Set.of("cipher")));
    }

    @Test
    void readsNothingForAPhraseEveryTopicOfWhichWasRefusedAndStillNamesTheRules() {
        standing.refuse("tennis", List.of(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO));

        final PhraseReading reading = standing.readingAt(coverage);

        assertAll(
                () -> assertThat(reading.isEmpty()).isTrue(),
                () -> assertThat(reading.refused()).hasSize(1),
                () -> assertThat(reading.refused().getFirst().topic()).isEqualTo("tennis"));
    }

    @Test
    void recordsOneRefusalPerRuleThatRemovedTheTopic() {
        standing.keep("cryptography", 1.0, Set.of("cipher"));
        standing.refuse("tennis", List.of(RefusalRule.values()));

        assertThat(standing.readingAt(coverage).refused()).hasSize(RefusalRule.values().length);
    }
}
