package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * What a branch of a published field says on the page: what this repository wrote in it, what the field has
 * there besides, and what the publisher says each of them means.
 */
class TaxonomyBranchTest {

    private static String asWords(final String label) {
        return String.join(" ", io.github.fiftieshousewife.codesemantics.engine.reading
                .IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader, final String definition) {
        return new SkosConcept("x#" + label, label, "", broader, "class", "x.owl", definition, "");
    }

    private static final List<SkosConcept> TAXONOMY = List.of(
            concept("Constituent", "", "the class of syntactic constructions"),
            concept("Phrase", "Constituent", "one or more syntactic words below the clause"),
            concept("Coordination", "Constituent", "two or more conjuncts of equal status"),
            concept("TopologicalField", "", "regularities of the makro-structure of a sentence"));

    private static final TaxonomyTree TREE =
            TaxonomyTree.of(TAXONOMY, Map.of("Phrase", 67), TaxonomyBranchTest::asWords);

    private static String rendered() {
        return TREE.roots().stream().filter(TaxonomyTree.Node::touched)
                .map(root -> TaxonomyBranch.of(root).render())
                .reduce("", String::concat)
                + TaxonomyBranch.unreachedRoots(TREE).render();
    }

    @Test
    void namesAConceptTheRepositoryNeverWroteRatherThanCountingIt() {
        assertAll(
                () -> assertThat(rendered()).contains("coordination"),
                () -> assertThat(rendered())
                        .as("and says what the publisher says it is, which is what a count cannot")
                        .contains("two or more conjuncts of equal status"));
    }

    @Test
    void carriesThePublishersDefinitionOfAConceptTheRepositoryDoesWrite() {
        assertThat(rendered()).contains("one or more syntactic words below the clause");
    }

    @Test
    void opensWhatWasWrittenAndClosesWhatWasNot() {
        assertAll(
                () -> assertThat(TaxonomyBranch.of(TREE.roots().getFirst()).render())
                        .as("a branch this repository writes in stands open")
                        .contains("<details class=\"touched\" id=\"at-constituent\" open>"),
                () -> assertThat(rendered())
                        .as("and the field's own unwritten concepts wait behind a fold")
                        .contains("<details class=\"unwritten\">"));
    }

    @Test
    void countsTheConceptsBehindAFoldSoAReaderKnowsWhatOpeningItCosts() {
        assertThat(rendered()).contains("1 unwritten here");
    }

    @Test
    void drawsTheBranchesOfTheFieldTheRepositoryNeverEnters() {
        assertAll(
                () -> assertThat(rendered())
                        .as("the field's own apostrophe arrives escaped, as every character does")
                        .contains("1 of the field&#x27;s 2 branches this repository never enters"),
                () -> assertThat(rendered()).contains("topological field",
                        "regularities of the makro-structure of a sentence"));
    }

    @Test
    void saysNothingWhereThePublisherStatesNoDefinition() {
        final TaxonomyTree silent = TaxonomyTree.of(List.of(concept("Chunk", "", "")),
                Map.of("Chunk", 2), TaxonomyBranchTest::asWords);

        assertThat(TaxonomyBranch.of(silent.roots().getFirst()).render())
                .doesNotContain("definition");
    }
}
