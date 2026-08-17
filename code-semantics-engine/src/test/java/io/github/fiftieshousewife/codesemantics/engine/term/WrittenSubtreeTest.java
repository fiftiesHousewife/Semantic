package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WrittenSubtreeTest {

    private static SkosConcept topic(final String label, final String broader) {
        return new SkosConcept(label, label, "", broader, "topic", "", "", "");
    }

    /** A branch whose leaves a repository writes, and one it does not touch. */
    private static final List<SkosConcept> PUBLISHED = List.of(
            topic("document processing", ""),
            topic("xml", "document processing"),
            topic("html", "document processing"),
            topic("css", "document processing"),
            topic("astrophysics", ""),
            topic("pulsars", "astrophysics"),
            topic("quasars", "astrophysics"));

    private static List<WrittenSubtree> branches(final Map<String, Integer> written) {
        return WrittenSubtree.in(TaxonomyTree.of(PUBLISHED, written, label -> label), WrittenMass.fromClasspath());
    }

    @Test
    void namesTheBranchTheWrittenLeavesSitUnderRatherThanTheLeaves() {
        final List<WrittenSubtree> ranked = branches(Map.of("xml", 20, "html", 15, "css", 5));

        assertThat(ranked.getFirst().concept())
                .as("the repository never writes document processing and that is what it is about")
                .isEqualTo("document processing");
    }

    @Test
    void statesReachAsAShareOfTheSubtreeThePublisherStated() {
        final WrittenSubtree filled = branches(Map.of("xml", 1, "html", 1, "css", 1)).getFirst();

        assertAll(
                () -> assertThat(filled.conceptsBelow()).isEqualTo(4),
                () -> assertThat(filled.reach()).isEqualTo(0.75),
                () -> assertThat(filled.reach()).isBetween(0.0, 1.0));
    }

    @Test
    void reachesOneWhereEveryConceptOfABranchIsWritten() {
        assertThat(branches(Map.of("document processing", 1, "xml", 1, "html", 1, "css", 1)))
                .filteredOn(branch -> branch.concept().equals("document processing"))
                .singleElement()
                .satisfies(branch -> assertThat(branch.reach()).isEqualTo(1.0));
    }

    @Test
    void ranksABranchNothingWasWrittenUnderBelowOneThatWasFilled() {
        final List<WrittenSubtree> ranked = branches(Map.of("xml", 9, "html", 9, "css", 9));

        assertThat(ranked).extracting(WrittenSubtree::concept)
                .doesNotContainSequence("astrophysics", "document processing");
    }

    @Test
    void countsAConceptOnceHoweverManyParentsThePublisherStatesItBeneath() {
        final List<SkosConcept> polyHierarchy = List.of(
                topic("document processing", ""),
                topic("markup", "document processing"),
                topic("xml", "markup" + SkosConcept.STATEMENTS + "document processing"));

        assertThat(WrittenSubtree.in(TaxonomyTree.of(polyHierarchy, Map.of("xml", 4), label -> label),
                WrittenMass.fromClasspath()))
                .filteredOn(branch -> branch.concept().equals("document processing"))
                .singleElement()
                .satisfies(branch -> assertThat(branch.conceptsBelow()).isEqualTo(3));
    }

    @Test
    void ranksABranchRestingOnOneWrittenConceptBelowOneSeveralOfWhoseConceptsWereWritten() {
        final List<WrittenSubtree> ranked =
                branches(Map.of("xml", 30, "html", 30, "css", 30, "pulsars", 100));

        assertThat(ranked).extracting(WrittenSubtree::concept)
                .containsSubsequence("document processing", "astrophysics");
    }

    @Test
    void saysNothingAboutALeafBecauseALeafFillsItselfEntirely() {
        assertThat(branches(Map.of("xml", 40)))
                .filteredOn(branch -> branch.concept().equals("xml"))
                .singleElement()
                .satisfies(leaf -> assertThat(leaf.weight()).isZero());
    }
}
