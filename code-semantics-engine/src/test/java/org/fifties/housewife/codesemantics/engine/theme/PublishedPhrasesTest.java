package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The runs of words the bundled topical resources publish as entries of their own, and the bound the walk
 * over them takes from the resources rather than from anyone's choice.
 */
class PublishedPhrasesTest {

    @Test
    void statesOnlyTheRunsItWasGiven() {
        final PublishedPhrases phrases = new PublishedPhrases(Set.of("noun_phrase"));
        assertAll(
                () -> assertThat(phrases.states("noun_phrase")).isTrue(),
                () -> assertThat(phrases.states("noun")).isFalse(),
                () -> assertThat(phrases.states("phrase_noun"))
                        .as("a run stated in one order is not stated in the other")
                        .isFalse());
    }

    @Test
    void takesItsBoundFromTheLongestRunTheResourcesPublish() {
        assertThat(new PublishedPhrases(Set.of("noun_phrase", "part_of_speech")).longestRun()).isEqualTo(3);
    }

    @Test
    void boundsAWalkAtOneWordWhenNothingIsPublishedAtAll() {
        assertThat(new PublishedPhrases(Set.of()).longestRun())
                .as("an index with nothing in it can never make two words into one")
                .isEqualTo(1);
    }

    @Test
    void poolsTheCollocationsOfBothBundledResources() {
        final PublishedPhrases bundled = PublishedPhrases.fromClasspath();
        assertAll(
                () -> assertThat(bundled.states("double_fault"))
                        .as("the sense-labelled resource's own written form")
                        .isTrue(),
                () -> assertThat(bundled.states("pull_request"))
                        .as("a term only the headword resource carries")
                        .isTrue(),
                () -> assertThat(bundled.states("segmenter_repository"))
                        .as("two words this repository writes and no resource states together")
                        .isFalse(),
                () -> assertThat(bundled.size()).isGreaterThan(1000));
    }
}
