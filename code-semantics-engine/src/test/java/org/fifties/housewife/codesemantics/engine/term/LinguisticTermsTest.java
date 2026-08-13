package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class LinguisticTermsTest {

    private final LinguisticTerms terms = LinguisticTerms.fromClasspath();

    @Test
    void holdsATermByTheWordsItsOwnIdentifierReadsAs() {
        assertAll(
                () -> assertThat(terms.conceptsOf(List.of("adjective", "phrase"))).isNotEmpty(),
                () -> assertThat(terms.conceptsOf(List.of("adjectivephrase")))
                        .as("the ontology's spelling is not the key; the words behind it are")
                        .isEmpty());
    }

    @Test
    void namesTheOntologysOwnConceptForATermItMatched() {
        assertThat(terms.conceptsOf(List.of("common", "noun")))
                .extracting(SkosConcept::concept)
                .containsExactly("http://purl.org/olia/olia.owl#CommonNoun");
    }

    @Test
    void carriesBothConceptsWhereTheOntologyStatesATermInTwoOfItsModules() {
        assertThat(terms.conceptsOf(List.of("semantic", "feature")))
                .extracting(SkosConcept::module)
                .containsExactlyInAnyOrder("olia.owl", "olia-top.owl");
    }

    @Test
    void reachesAsFarAsTheLongestTermTheOntologyStatesAndNoFurther() {
        assertThat(terms.longestTerm()).isEqualTo(5);
    }

    @Test
    void namesTheOntologyThatStatedItsTerms() {
        assertThat(terms.source()).isEqualTo("OLiA");
    }

    @Test
    void abstainsOnARunOfWordsTheOntologyDoesNotPublish() {
        assertThat(terms.conceptsOf(List.of("interest", "rate", "swap"))).isEmpty();
    }

    @Test
    void holdsOneRunOfWordsForEveryTermExceptTheOneStatedTwice() {
        assertThat(terms.terms())
                .as("1,197 terms, and only SemanticFeature is published in two modules at once")
                .hasSize(1196);
    }
}
