package org.fifties.housewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class OliaTermsTest {

    private final OliaTerms terms = OliaTerms.fromClasspath();

    @Test
    void statesTheVocabularyOfLinguisticAnnotation() {
        assertThat(terms.terms()).hasSize(1312)
                .contains("Noun", "Verb", "Phrase", "CommonNoun", "AdjectivePhrase", "Determiner");
    }

    @Test
    void findsATermWhateverCaseItIsAskedIn() {
        assertAll(
                () -> assertThat(terms.conceptsOf("commonnoun")).isNotEmpty(),
                () -> assertThat(terms.conceptsOf("CommonNoun")).isNotEmpty(),
                () -> assertThat(terms.conceptsOf("COMMONNOUN")).isNotEmpty());
    }

    @Test
    void namesTheOntologysOwnIdentifierRatherThanANormalisedCopyOfIt() {
        assertAll(
                () -> assertThat(terms.conceptsOf("commonnoun").getFirst().prefLabel())
                        .isEqualTo("CommonNoun"),
                () -> assertThat(terms.conceptsOf("commonnoun").getFirst().concept())
                        .isEqualTo("http://purl.org/olia/olia.owl#CommonNoun"));
    }

    @Test
    void carriesTheClassTheOntologyStatesATermBeneath() {
        assertThat(terms.conceptsOf("pragmaticfeature").getFirst().broader())
                .isEqualTo("LinguisticConcept");
    }

    @Test
    void statesTheSuperclassTheOntologyNamesHoweverItSpellsIt() {
        assertThat(terms.conceptsOf("commonnoun").getFirst().broader())
                .as("written as a class nested inside the subClassOf rather than as a reference on it — "
                        + "the spelling this extraction could not read, and 627 of the ontology's 1,422 "
                        + "superclasses are written that way")
                .isEqualTo("Noun");
    }

    @Test
    void abstainsOnATermTheOntologyDoesNotState() {
        assertThat(terms.conceptsOf("interestrateswap")).isEmpty();
    }

    @Test
    void carriesTheTermsARelativeReferenceWouldOtherwiseHaveHidden() {
        assertThat(terms.conceptsOf("questionword"))
                .as("a concept written as a bare fragment reads back as a comment unless it is resolved")
                .isNotEmpty();
    }
}
