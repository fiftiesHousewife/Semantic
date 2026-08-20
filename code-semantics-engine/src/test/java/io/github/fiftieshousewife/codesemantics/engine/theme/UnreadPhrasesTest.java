package io.github.fiftieshousewife.codesemantics.engine.theme;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class UnreadPhrasesTest {

    private final UnreadPhrases unread = new UnreadPhrases();

    @Test
    void keepsTheRunItselfAndCountsHowOftenItWasWritten() {
        unread.record(UnreadReason.NO_RESOURCE_STATED_A_TOPIC, "jwnl exception", "Lexicon.java:12");
        unread.record(UnreadReason.NO_RESOURCE_STATED_A_TOPIC, "jwnl exception", "Reading.java:40");

        assertAll(
                () -> assertThat(unread.all()).singleElement()
                        .extracting(UnreadPhrases.UnreadPhrase::phrase).isEqualTo("jwnl exception"),
                () -> assertThat(unread.all().getFirst().occurrences()).isEqualTo(2),
                () -> assertThat(unread.all().getFirst().firstSite())
                        .as("the first place it was written, so a reader starts where the reading did")
                        .isEqualTo("Lexicon.java:12"));
    }

    @Test
    void keepsTheTwoReasonsApartForTheSameRun() {
        unread.record(UnreadReason.NO_WORD_REACHED_A_RESOURCE, "id", "Concept.java:3");
        unread.record(UnreadReason.NO_RESOURCE_STATED_A_TOPIC, "id", "Concept.java:3");

        assertAll(
                () -> assertThat(unread.all()).hasSize(2),
                () -> assertThat(unread.runsUnreadFor(UnreadReason.NO_WORD_REACHED_A_RESOURCE)).isEqualTo(1),
                () -> assertThat(unread.runsUnreadFor(UnreadReason.NO_RESOURCE_STATED_A_TOPIC)).isEqualTo(1));
    }

    @Test
    void ordersTheRunWrittenMostOftenFirst() {
        unread.record(UnreadReason.NO_RESOURCE_STATED_A_TOPIC, "once", "A.java:1");
        unread.record(UnreadReason.NO_RESOURCE_STATED_A_TOPIC, "twice", "A.java:2");
        unread.record(UnreadReason.NO_RESOURCE_STATED_A_TOPIC, "twice", "A.java:3");

        assertThat(unread.all()).extracting(UnreadPhrases.UnreadPhrase::phrase)
                .containsExactly("twice", "once");
    }
}
