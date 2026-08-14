package org.fifties.housewife.codesemantics.engine.term;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedAncestryTest {

    private final StatedAncestry ancestry = new StatedAncestry(LinguisticTerms.fromClasspath());

    @Test
    void climbsToTheBroadestConceptTheOntologyStatesAboveATerm() {
        assertThat(ancestry.of("Contrast")).containsExactly("Relation", "PragmaticRelation",
                "DiscourseRelation", "CoherenceRelation", "Comparison", "ContrastiveComparison", "Contrast");
    }

    @Test
    void placesTheVocabularyAProgramWritesUnderTheBranchesItsPublisherStates() {
        assertAll(
                () -> assertThat(ancestry.of("Verb"))
                        .as("these read as roots of their own until the extraction learned RDF's second "
                                + "spelling of a superclass, which cost 627 of the ontology's 1,422 edges")
                        .containsExactly("MorphosyntacticCategory", "Verb"),
                () -> assertThat(ancestry.of("CommonNoun"))
                        .containsExactly("MorphosyntacticCategory", "Noun", "CommonNoun"),
                () -> assertThat(ancestry.rootOf("Phrase")).isEqualTo("Constituent"),
                () -> assertThat(ancestry.rootOf("Token")).isEqualTo("OrthographicEntity"));
    }

    @Test
    void tellsTwoMatchedTermsApartByTheBranchTheirPublisherPutThemIn() {
        assertAll(
                () -> assertThat(ancestry.rootOf("Summary")).isEqualTo("Relation"),
                () -> assertThat(ancestry.rootOf("Sentence")).isEqualTo("LinguisticConcept"),
                () -> assertThat(ancestry.rootOf("Person")).isEqualTo("SemanticFeature"),
                () -> assertThat(ancestry.rootOf("Noun")).isEqualTo("MorphosyntacticCategory"));
    }

    @Test
    void asksTheOntologyInWhateverCaseTheTermArrivesIn() {
        assertThat(ancestry.of("contrast")).hasSize(7);
    }

    @Test
    void stopsWhereATaxonomyStatesAConceptAboveItself() {
        final TermIndex cycle = PublishedTerms.publishing("a taxonomy stating a cycle", "loop", "knot")
                .stating("Loop", "Knot").stating("Knot", "Loop");

        assertThat(new StatedAncestry(cycle).of("Loop")).containsExactly("Knot", "Loop");
    }
}
