package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedSiblingsTest {

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
            concept("Verb", "MorphosyntacticCategory"),
            concept("UsageAndFrequencyFeature", ""),
            concept("Preferred", "UsageAndFrequencyFeature"),
            concept("RarelyUsed", "UsageAndFrequencyFeature"));

    private static StatedSiblings after(final Map<String, Integer> written) {
        return StatedSiblings.of(TaxonomyTree.of(TAXONOMY, written, StatedSiblingsTest::asWords));
    }

    @Test
    void countsTheOtherConceptsTheRepositoryWroteInTheBranchThePublisherStatesATermUnder() {
        final StatedSiblings siblings = after(Map.of("Noun", 29, "Verb", 33, "Preferred", 1));

        assertAll(
                () -> assertThat(siblings.writtenBeside("Verb")).isEqualTo(1),
                () -> assertThat(siblings.branchOf("Verb")).isEqualTo("MorphosyntacticCategory"));
    }

    @Test
    void findsNothingBesideAConceptAloneInTheBranchItsPublisherPlacedItIn() {
        final StatedSiblings siblings = after(Map.of("Noun", 29, "Verb", 33, "Preferred", 1));

        assertAll(
                () -> assertThat(siblings.writtenBeside("Preferred")).isZero(),
                () -> assertThat(siblings.branchOf("Preferred")).isEqualTo("UsageAndFrequencyFeature"));
    }

    @Test
    void findsNothingBesideAConceptWhoseOnlyCompanyIsNestedBelowOneOfItsSiblings() {
        assertThat(after(Map.of("Verb", 33, "CommonNoun", 4)).writtenBeside("Verb"))
                .as("CommonNoun sits under Noun, not beside Verb — climb far enough and everything meets")
                .isZero();
    }

    @Test
    void readsAConceptTheSourceStatesNoParentForAsItsOwnBranch() {
        final StatedSiblings siblings = after(Map.of("MorphosyntacticCategory", 4, "Noun", 29));

        assertAll(
                () -> assertThat(siblings.writtenBeside("MorphosyntacticCategory")).isEqualTo(1),
                () -> assertThat(siblings.branchOf("MorphosyntacticCategory"))
                        .isEqualTo("MorphosyntacticCategory"));
    }

    @Test
    void keepsTheAccompaniedPlacementOfAConceptItsPublisherStatesUnderTwoParents() {
        final List<SkosConcept> polyHierarchy = List.of(
                concept("Accompanied", ""),
                concept("Alone", ""),
                concept("Term", "Accompanied | Alone"),
                concept("Sibling", "Accompanied"));
        final StatedSiblings siblings = StatedSiblings.of(TaxonomyTree.of(polyHierarchy,
                Map.of("Term", 1, "Sibling", 1), StatedSiblingsTest::asWords));

        assertAll(
                () -> assertThat(siblings.writtenBeside("Term"))
                        .as("Sibling stands written beside Term under Accompanied, whichever parent the "
                                + "walk met last")
                        .isEqualTo(1),
                () -> assertThat(siblings.branchOf("Term")).isEqualTo("Accompanied"));
    }

    @Test
    void findsNothingBesideATermTheTaxonomyDoesNotCarry() {
        assertThat(after(Map.of("Verb", 33)).writtenBeside("SomethingImported")).isZero();
    }

    @Test
    void countsDistinctConceptsBesideRatherThanTimesWritten() {
        assertThat(after(Map.of("Verb", 400)).writtenBeside("Verb"))
                .as("four hundred occurrences of one concept is still one concept")
                .isZero();
    }
}
