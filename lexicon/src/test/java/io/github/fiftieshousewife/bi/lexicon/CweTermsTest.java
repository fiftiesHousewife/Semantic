package io.github.fiftieshousewife.bi.lexicon;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CweTermsTest {

    private final CweTerms terms = CweTerms.fromClasspath();

    @Test
    void statesEveryNameThePublisherStatesEachOnce() {
        assertAll(
                () -> assertThat(terms.concepts()).hasSize(959),
                () -> assertThat(terms.terms()).hasSize(1143)
                        .contains("Use After Free", "Cross-site Scripting", "XSS"));
    }

    @Test
    void answersTheCommonNameWithTheWeaknessItQuotesItOn() {
        assertThat(terms.conceptsOf("cross-site scripting").getFirst().concept())
                .isEqualTo("https://cwe.mitre.org/data/definitions/79.html");
    }

    @Test
    void carriesTheResearchViewHierarchyThePublisherStates() {
        assertAll(
                () -> assertThat(terms.conceptsOf("use after free").getFirst().broader())
                        .isEqualTo("Expired Pointer Dereference"),
                () -> assertThat(withA(SkosConcept::broader)).isEqualTo(924));
    }

    @Test
    void carriesWhatThePublisherSaysEachWeaknessMeans() {
        assertAll(
                () -> assertThat(withA(SkosConcept::definition)).isEqualTo(959),
                () -> assertThat(terms.conceptsOf("use after free").getFirst().kind())
                        .isEqualTo("Variant"));
    }

    @Test
    void abstainsOnATermTheEnumerationDoesNotState() {
        assertThat(terms.conceptsOf("adjectivephrase")).isEmpty();
    }

    private long withA(final Function<SkosConcept, String> property) {
        return terms.concepts().stream().map(property).filter(stated -> !stated.isEmpty()).count();
    }
}
