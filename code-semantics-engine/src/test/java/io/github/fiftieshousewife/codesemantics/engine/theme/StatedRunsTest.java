package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedRunsTest {

    private final StatedRuns stated = new StatedRuns(new PublishedPhrases(
            Set.of("noun_phrase", "adjective_phrase_marker", "task_id", "pass_through")));

    @Test
    void readsAStatedRunAsOneWord() {
        assertThat(stated.of(List.of("noun", "phrase", "topics")))
                .containsExactly("noun_phrase", "topics");
    }

    @Test
    void leavesARunNoPublisherStatesExactlyAsItWasWritten() {
        assertThat(stated.of(List.of("scope", "divergence"))).containsExactly("scope", "divergence");
    }

    @Test
    void takesTheLongestRunAtEachPositionSoAShorterOneInsideItIsNotReadInstead() {
        assertThat(stated.of(List.of("adjective", "phrase", "marker")))
                .containsExactly("adjective_phrase_marker");
    }

    @Test
    void readsARunWhoseEdgeWordCarriesNoDictionaryEntry() {
        assertAll(
                () -> assertThat(stated.of(List.of("task", "id")))
                        .as("a table that counts votes on nothing, so it needs no edge rule")
                        .containsExactly("task_id"),
                () -> assertThat(stated.of(List.of("pass", "through")))
                        .containsExactly("pass_through"),
                () -> assertThat(CollocatedWords.fromClasspath().of(List.of("task", "id")))
                        .as("the reading that votes still refuses both, which is the whole difference")
                        .containsExactly("task", "id"));
    }

    @Test
    void foldsTheCaseARunWasWrittenInBecauseTheResourcesAreKeyedWithout() {
        assertThat(stated.of(List.of("Noun", "Phrase"))).containsExactly("noun_phrase");
    }

    @Test
    void readsNothingOutOfAPhraseWithNoWords() {
        assertThat(stated.of(List.of())).isEmpty();
    }

    @Test
    void statesEveryRunAnyBundledPublisherStates() {
        assertAll(
                () -> assertThat(StatedRuns.fromClasspath().of(List.of("part", "of", "speech")))
                        .as("a dictionary run")
                        .containsExactly("part_of_speech"),
                () -> assertThat(StatedRuns.fromClasspath().of(List.of("cap", "floor")))
                        .as("a run only a term vocabulary states")
                        .containsExactly("cap_floor"));
    }
}
