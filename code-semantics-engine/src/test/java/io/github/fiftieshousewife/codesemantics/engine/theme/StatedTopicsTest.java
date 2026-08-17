package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedTopicsTest {

    private static final Map<String, Set<String>> HIERARCHY = Map.of(
            "computing", Set.of("engineering", "mathematics", "natural-sciences", "physical-sciences",
                    "sciences"),
            "engineering", Set.of("natural-sciences", "physical-sciences"),
            "physical-sciences", Set.of("natural-sciences"),
            "mathematics", Set.of("sciences"),
            "tennis", Set.of("sports", "hobbies"));

    private static final BroaderTopics BROADER = topic -> HIERARCHY.getOrDefault(topic, Set.of());

    private static StatedTopics over(final Set<String> labels) {
        return new StatedTopics(word -> labels, BROADER);
    }

    @Test
    void keepsOnlyTheLabelTheOthersWereDerivedFrom() {
        assertThat(over(Set.of("computing", "engineering", "mathematics", "natural-sciences",
                "physical-sciences", "sciences")).of("bot"))
                .as("one statement about the word, published as its closure, is one reading of the word")
                .containsExactly("computing");
    }

    @Test
    void keepsEveryLabelNothingElseImplies() {
        assertThat(over(Set.of("computing", "tennis", "sports")).of("serve"))
                .as("sports is implied by tennis; computing and tennis imply nothing of each other")
                .containsExactlyInAnyOrder("computing", "tennis");
    }

    @Test
    void keepsEveryLabelWhereTheHierarchyIsSilent() {
        assertThat(over(Set.of("law", "religion")).of("cite"))
                .as("a hierarchy that says nothing about two labels has not said they are one")
                .containsExactlyInAnyOrder("law", "religion");
    }

    @Test
    void keepsEveryLabelWhereEachIsImpliedByAnother() {
        assertThat(new StatedTopics(word -> Set.of("here", "there"),
                topic -> Set.of("here", "there")).of("circular"))
                .as("a fold that cancels itself has said nothing, and the word is read as it was labelled")
                .containsExactlyInAnyOrder("here", "there");
    }

    @Test
    void carriesAnUnknownWordThroughAsUnclaimed() {
        assertThat(over(Set.of()).of("extjwnl")).isEmpty();
    }

    @Test
    void foldsTheBundledVocabularyAgainstTheBundledHierarchy() {
        assertAll(
                () -> assertThat(HeadwordTopics.fromClasspath().of("parse"))
                        .as("what the resource publishes is a closure over its own hierarchy")
                        .containsExactlyInAnyOrder("computing", "engineering", "human-sciences",
                                "linguistics", "mathematics", "natural-sciences", "physical-sciences",
                                "sciences"),
                () -> assertThat(StatedTopics.fromClasspath().of("parse"))
                        .as("and what it states of the word is the two labels the other six came from")
                        .containsExactlyInAnyOrder("computing", "linguistics"));
    }
}
