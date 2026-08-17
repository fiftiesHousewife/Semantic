package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedDepthTest {

    private static String asWords(final String label) {
        return String.join(" ", IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("x#" + label, label, "", broader, "class", "x.owl", "", "");
    }

    private static final List<SkosConcept> TAXONOMY = List.of(
            concept("MorphosyntacticCategory", ""),
            concept("Noun", "MorphosyntacticCategory"),
            concept("CommonNoun", "Noun"),
            concept("ProperNoun", "Noun"),
            concept("FamilyName", "ProperNoun"),
            concept("Verb", "MorphosyntacticCategory"));

    private static StatedDepth depth() {
        return StatedDepth.of(TaxonomyTree.of(TAXONOMY, Map.of(), StatedDepthTest::asWords));
    }

    @Test
    void countsTheRungsThePublisherStatesBetweenAConceptAndTheRootOfItsBranch() {
        final StatedDepth depth = depth();

        assertAll(
                () -> assertThat(depth.below("MorphosyntacticCategory")).isZero(),
                () -> assertThat(depth.below("Noun")).isEqualTo(1),
                () -> assertThat(depth.below("CommonNoun")).isEqualTo(2),
                () -> assertThat(depth.below("FamilyName")).isEqualTo(3));
    }

    @Test
    void readsAConceptTheSourceStatesNoParentForAsStandingAtItsOwnRoot() {
        assertThat(StatedDepth.of(TaxonomyTree.of(List.of(concept("Verb", "AnOntologyThisOneImports")),
                Map.of(), StatedDepthTest::asWords)).below("Verb")).isZero();
    }

    @Test
    void readsAConceptTheSourceDoesNotStateAtAllAsStandingAtItsOwnRoot() {
        assertThat(depth().below("Diacritic")).isZero();
    }

    @Test
    void boundsADepthByTheDeepestChainTheSourceItselfStates() {
        final StatedDepth depth = depth();

        assertAll(
                () -> assertThat(depth.deepest()).isEqualTo(3),
                () -> assertThat(depth.share("FamilyName")).isEqualTo(1.0),
                () -> assertThat(depth.share("MorphosyntacticCategory")).isZero(),
                () -> assertThat(depth.share("Noun")).isCloseTo(1.0 / 3, within(1e-9)));
    }

    @Test
    void readsAFlatSourceAsHavingNoDepthToShareRatherThanDividingByZero() {
        final StatedDepth depth = StatedDepth.of(TaxonomyTree.of(List.of(concept("Verb", ""),
                concept("Noun", "")), Map.of(), StatedDepthTest::asWords));

        assertAll(
                () -> assertThat(depth.deepest()).isZero(),
                () -> assertThat(depth.share("Verb")).isZero());
    }
}
