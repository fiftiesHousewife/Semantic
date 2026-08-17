package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BroaderConceptsTest {

    private static SkosConcept statingBroader(final String broader) {
        return new SkosConcept("c", "C", "", broader, "topic", "", "", "");
    }

    @Test
    void statesTheOneParentASourceStatesOnce() {
        assertThat(statingBroader("parent").broaderConcepts()).containsExactly("parent");
    }

    @Test
    void statesEveryParentAPolyHierarchyStates() {
        assertThat(statingBroader("machine learning | statistics | linguistics").broaderConcepts())
                .containsExactly("machine learning", "statistics", "linguistics");
    }

    @Test
    void statesNoParentWhereTheSourceStatesNone() {
        assertAll(
                () -> assertThat(statingBroader("").broaderConcepts()).isEmpty(),
                () -> assertThat(statingBroader("   ").broaderConcepts()).isEmpty());
    }

    @Test
    void keepsTheOrderThePublisherWroteThemIn() {
        assertThat(statingBroader("b | a | c").broaderConcepts()).containsExactly("b", "a", "c");
    }
}
