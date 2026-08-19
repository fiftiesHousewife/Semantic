package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedDefinitionsTest {

    private static SkosConcept statingDefinition(final String definition) {
        return new SkosConcept("c", "C", "", "", "topic", "", definition, "");
    }

    @Test
    void statesTheOneAccountASourceGivesOnce() {
        assertThat(statingDefinition("what the topic covers").definitions())
                .containsExactly("what the topic covers");
    }

    @Test
    void separatesEveryAccountASourceStatesMoreThanOnce() {
        assertThat(statingDefinition("a description of the cluster | Zircon, Geochronology, Tectonics")
                .definitions())
                .containsExactly("a description of the cluster", "Zircon, Geochronology, Tectonics");
    }

    @Test
    void statesNoAccountWhereTheSourceGivesNone() {
        assertAll(
                () -> assertThat(statingDefinition("").definitions()).isEmpty(),
                () -> assertThat(statingDefinition("   ").definitions()).isEmpty());
    }

    @Test
    void keepsTheOrderThePublisherWroteThemIn() {
        assertThat(statingDefinition("second | first | third").definitions())
                .containsExactly("second", "first", "third");
    }
}
