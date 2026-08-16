package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PolyHierarchyTest {

    private static SkosConcept topic(final String label, final String broader) {
        return new SkosConcept(label, label, "", broader, "topic", "", "", "");
    }

    /** Two roots, and one topic the publisher states beneath both of them. */
    private static final List<SkosConcept> PUBLISHED = List.of(
            topic("machine learning", ""),
            topic("linguistics", ""),
            topic("word embedding", "machine learning | linguistics"));

    private static TaxonomyTree tree(final Map<String, Integer> written) {
        return TaxonomyTree.of(PUBLISHED, written, label -> label);
    }

    @Test
    void placesAConceptBeneathEveryParentItsPublisherStates() {
        final TaxonomyTree tree = tree(Map.of("word embedding", 1));

        assertAll(
                () -> assertThat(tree.roots()).extracting(TaxonomyTree.Node::label)
                        .containsExactlyInAnyOrder("machine learning", "linguistics"),
                () -> assertThat(tree.roots()).allSatisfy(root ->
                        assertThat(root.children()).extracting(TaxonomyTree.Node::label)
                                .containsExactly("word embedding")));
    }

    @Test
    void countsAConceptOnceHoweverManyParentsReachIt() {
        assertThat(tree(Map.of("word embedding", 4)).written())
                .as("a concept written four times is written four times, not eight because two parents hold it")
                .isEqualTo(4);
    }

    @Test
    void countsEveryConceptOnceInTheTotalItReports() {
        assertThat(tree(Map.of()).concepts()).isEqualTo(3);
    }

    @Test
    void stillReadsASourceStatingOneParentPerConcept() {
        final TaxonomyTree tree = TaxonomyTree.of(
                List.of(topic("noun", ""), topic("common noun", "noun")), Map.of("common noun", 2),
                label -> label);

        assertAll(
                () -> assertThat(tree.roots()).singleElement()
                        .satisfies(root -> assertThat(root.label()).isEqualTo("noun")),
                () -> assertThat(tree.written()).isEqualTo(2));
    }

    @Test
    void doesNotRecurseForeverWhereTwoConceptsAreStatedBeneathEachOther() {
        final TaxonomyTree tree = TaxonomyTree.of(
                List.of(topic("a", "b"), topic("b", "a")), Map.of("a", 1), label -> label);

        assertThat(tree.concepts()).isEqualTo(2);
    }
}
