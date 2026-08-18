package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TaxonomyTreeTest {

    /** The splitter the match itself uses, so a page shows the form the reading matched on. */
    private static String asWords(final String label) {
        return String.join(" ", io.github.fiftieshousewife.codesemantics.engine.reading
                .IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("x#" + label, label, "", broader, "class", "x.owl", "", "");
    }

    private static final List<SkosConcept> TAXONOMY = List.of(
            concept("MorphosyntacticCategory", ""),
            concept("Noun", "MorphosyntacticCategory"),
            concept("CommonNoun", "Noun"),
            concept("Verb", "MorphosyntacticCategory"),
            concept("Relation", ""),
            concept("Contrast", "Relation"));

    @Test
    void buildsTheHierarchyThePublisherStatesInItsBroaderColumn() {
        final TaxonomyTree tree = TaxonomyTree.of(TAXONOMY, Map.of(), TaxonomyTreeTest::asWords);

        assertAll(
                () -> assertThat(tree.roots()).extracting(TaxonomyTree.Node::label)
                        .containsExactly("MorphosyntacticCategory", "Relation"),
                () -> assertThat(tree.roots().getFirst().conceptsBelow()).isEqualTo(4),
                () -> assertThat(tree.concepts()).isEqualTo(6));
    }

    @Test
    void countsDistinctConceptsWrittenRatherThanTimesWritten() {
        final TaxonomyTree tree = TaxonomyTree.of(TAXONOMY,
                Map.of("CommonNoun", 400, "Contrast", 3, "Relation", 2), TaxonomyTreeTest::asWords);

        assertAll(
                () -> assertThat(tree.roots().getFirst().conceptsWritten())
                        .as("four hundred occurrences of one concept is one concept")
                        .isEqualTo(1),
                () -> assertThat(tree.roots().getLast().conceptsWritten())
                        .as("where two different concepts under a branch is two")
                        .isEqualTo(2));
    }

    @Test
    void rollsWhatWasWrittenUpToTheBranchThatContainsIt() {
        final TaxonomyTree tree = TaxonomyTree.of(TAXONOMY, Map.of("CommonNoun", 5), TaxonomyTreeTest::asWords);

        assertAll(
                () -> assertThat(tree.roots().getFirst().writtenBelow())
                        .as("a branch is evidenced by everything beneath it, which is what a hierarchy is for")
                        .isEqualTo(5),
                () -> assertThat(tree.roots().getFirst().touched()).isTrue(),
                () -> assertThat(tree.roots().getLast().touched()).isFalse());
    }

    @Test
    void namesTheConceptsABranchsClaimRestsOn() {
        final TaxonomyTree tree = TaxonomyTree.of(TAXONOMY, Map.of("CommonNoun", 5, "Verb", 9), TaxonomyTreeTest::asWords);

        assertThat(tree.roots().getFirst().writtenHere()).extracting(TaxonomyTree.Node::label)
                .containsExactly("Verb", "CommonNoun");
    }

    @Test
    void readsEachLabelOnceHoweverManyParentsStateTheConcept() {
        final Map<String, Integer> read = new java.util.HashMap<>();
        TaxonomyTree.of(List.of(
                concept("Root", ""),
                concept("Left", "Root"),
                concept("Right", "Root"),
                concept("Shared", "Left | Right"),
                concept("Beneath", "Shared")),
                Map.of(), label -> {
                    read.merge(label, 1, Integer::sum);
                    return label;
                });

        assertThat(read).allSatisfy((label, times) -> assertThat(times).as(label).isEqualTo(1));
    }

    @Test
    void standsAConceptAtItsOwnRootWhereTheSourceDoesNotCarryItsStatedParent() {
        final TaxonomyTree tree = TaxonomyTree.of(List.of(concept("Orphan", "SomethingImported")), Map.of(), TaxonomyTreeTest::asWords);

        assertThat(tree.roots()).extracting(TaxonomyTree.Node::label).containsExactly("Orphan");
    }
}
