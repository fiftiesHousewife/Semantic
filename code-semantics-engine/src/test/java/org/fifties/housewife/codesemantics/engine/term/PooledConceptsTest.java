package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PooledConceptsTest {

    private static SkosConcept topic(final String label, final String broader) {
        return new SkosConcept(label, label, "", broader, "topic", "", "", "");
    }

    private static final List<SkosConcept> PUBLISHED = List.of(
            topic("natural language processing", ""),
            topic("parse", "natural language processing"),
            topic("parsing", "natural language processing"),
            topic("parse trees", "parsing"));

    private final PooledConcepts pooled = PooledConcepts.fromClasspath();

    @Test
    void keepsOneConceptWhereASourcePublishesAWordAndItsInflections() {
        assertThat(pooled.in(PUBLISHED)).extracting(SkosConcept::prefLabel)
                .containsExactly("natural language processing", "parse", "parse trees");
    }

    @Test
    void movesAChildOfAFoldedConceptUnderTheLabelThatWasKept() {
        assertThat(pooled.in(PUBLISHED))
                .filteredOn(concept -> concept.prefLabel().equals("parse trees"))
                .singleElement()
                .satisfies(concept -> assertThat(concept.broaderConcepts()).containsExactly("parse"));
    }

    @Test
    void addsTheWritingOfEveryFoldedLabelToTheOneThatWasKept() {
        assertThat(pooled.writtenUnder(Map.of("parse", 30, "parsing", 12), PUBLISHED))
                .containsExactly(Map.entry("parse", 42));
    }

    @Test
    void refusesToStateAConceptBeneathTheLabelItWasFoldedInto() {
        final List<SkosConcept> nested = List.of(topic("descriptor", ""), topic("descriptors", "descriptor"));

        assertAll(
                () -> assertThat(pooled.in(nested)).hasSize(1),
                () -> assertThat(pooled.in(nested).getFirst().broaderConcepts()).isEmpty());
    }
}
