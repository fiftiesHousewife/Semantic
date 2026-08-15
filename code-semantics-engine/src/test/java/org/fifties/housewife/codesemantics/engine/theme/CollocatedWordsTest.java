package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reading a phrase in the units a resource publishes it in, over an index small enough to state what the
 * walk was told and a dictionary large enough to answer which words carry a subject.
 */
class CollocatedWordsTest {

    private final CollocatedWords collocated = new CollocatedWords(
            new PublishedPhrases(Set.of("noun_phrase", "part_of_speech", "adjective_phrase_marker",
                    "to_the", "read_in", "phrase_marker")),
            ContentWords.fromClasspath());

    @Test
    void readsAPublishedRunAsOneWord() {
        assertThat(collocated.of(List.of("noun", "phrase", "topics")))
                .containsExactly("noun_phrase", "topics");
    }

    @Test
    void leavesAPhraseNoResourcePublishesExactlyAsItWasWritten() {
        assertThat(collocated.of(List.of("scope", "divergence"))).containsExactly("scope", "divergence");
    }

    @Test
    void keepsAWordInsideARunThatHoldsNoSubjectOnItsOwn() {
        assertThat(collocated.of(List.of("part", "of", "speech")))
                .as("English builds a noun phrase with a preposition inside it")
                .containsExactly("part_of_speech");
    }

    @Test
    void refusesARunThatBeginsOrEndsOnAWordHoldingASentenceTogether() {
        assertAll(
                () -> assertThat(collocated.of(List.of("close", "to", "the", "expected")))
                        .containsExactly("close", "to", "the", "expected"),
                () -> assertThat(collocated.of(List.of("read", "in")))
                        .as("a particle at the edge makes a fragment of a sentence, not a term")
                        .containsExactly("read", "in"));
    }

    @Test
    void takesTheLongestRunAtEachPositionSoAShorterOneInsideItIsNotReadInstead() {
        assertThat(collocated.of(List.of("adjective", "phrase", "marker")))
                .containsExactly("adjective_phrase_marker");
    }

    @Test
    void readsARunOnceSoNoWordIsCountedInTwoOfThem() {
        assertThat(collocated.of(List.of("noun", "phrase", "marker")))
                .as("phrase belongs to the run that claimed it, and marker stands alone after it")
                .containsExactly("noun_phrase", "marker");
    }

    @Test
    void foldsTheCaseARunWasWrittenInBecauseTheResourcesAreKeyedWithout() {
        assertThat(collocated.of(List.of("Noun", "Phrase"))).containsExactly("noun_phrase");
    }

    @Test
    void readsNothingOutOfAPhraseWithNoWords() {
        assertThat(collocated.of(List.of())).isEmpty();
    }

    @Test
    void readsTheBundledResourcesWithoutBeingToldWhatTheyHold() {
        assertAll(
                () -> assertThat(CollocatedWords.fromClasspath().of(List.of("part", "of", "speech")))
                        .as("a term two bundled resources publish is read as the term it is")
                        .containsExactly("part_of_speech"),
                () -> assertThat(PublishedPhrases.fromClasspath().longestRun())
                        .as("the bound on the walk is the longest run the resources themselves state")
                        .isGreaterThan(1));
    }
}
