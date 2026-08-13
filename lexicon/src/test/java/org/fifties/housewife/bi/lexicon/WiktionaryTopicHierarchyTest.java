package org.fifties.housewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WiktionaryTopicHierarchyTest {

    private final WiktionaryTopicHierarchy hierarchy = WiktionaryTopicHierarchy.fromClasspath();

    @Test
    void statesTheBroaderTopicsATopicGeneralisesToInOneStep() {
        assertAll(
                () -> assertThat(hierarchy.broaderThan("computing")).containsExactlyInAnyOrder(
                        "engineering", "mathematics"),
                () -> assertThat(hierarchy.broaderThan("engineering")).containsExactly("physical-sciences"),
                () -> assertThat(hierarchy.broaderThan("linguistics")).containsExactly("human-sciences"));
    }

    @Test
    void reachesEveryBroaderTopicByGeneralisingRepeatedly() {
        assertThat(hierarchy.ancestorsOf("computing"))
                .as("the labels a headword given computing arrives already carrying")
                .containsExactlyInAnyOrder("engineering", "mathematics", "natural-sciences",
                        "physical-sciences", "sciences");
    }

    @Test
    void aTopicNothingGeneralisesToCarriesNothingWithIt() {
        assertAll(
                () -> assertThat(hierarchy.broaderThan("sciences")).isEmpty(),
                () -> assertThat(hierarchy.ancestorsOf("sciences")).isEmpty());
    }

    @Test
    void neverReadsATopicAsBroaderThanItself() {
        assertAll(hierarchy.ancestorsOf("computing").stream()
                .map(topic -> () -> assertThat(hierarchy.ancestorsOf(topic)).doesNotContain(topic)));
    }

    @Test
    void anUnknownTopicGeneralisesToNothingRatherThanToAGuess() {
        assertAll(
                () -> assertThat(hierarchy.broaderThan("no-such-topic")).isEmpty(),
                () -> assertThat(hierarchy.ancestorsOf("no-such-topic")).isEmpty());
    }

    @Test
    void lookupIsCaseInsensitive() {
        assertThat(hierarchy.ancestorsOf("Computing")).contains("sciences");
    }
}
