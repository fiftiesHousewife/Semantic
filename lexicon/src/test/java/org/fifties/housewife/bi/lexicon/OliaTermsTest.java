package org.fifties.housewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class OliaTermsTest {

    private final OliaTerms terms = OliaTerms.fromClasspath();

    @Test
    void statesTheVocabularyOfLinguisticAnnotation() {
        assertThat(terms.terms()).hasSize(1197)
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
    void statesNothingBroaderWhereTheOntologyNamesNoSuperclass() {
        assertThat(terms.conceptsOf("commonnoun").getFirst().broader())
                .as("CommonNoun's only superclass is an anonymous restriction, which states a condition "
                        + "rather than a parent")
                .isEmpty();
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
