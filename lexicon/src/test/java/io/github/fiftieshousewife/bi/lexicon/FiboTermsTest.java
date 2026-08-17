package io.github.fiftieshousewife.bi.lexicon;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FiboTermsTest {

    private final FiboTerms terms = FiboTerms.fromClasspath();

    @Test
    void statesTheVocabularyOfTheFinancialIndustry() {
        assertThat(terms.terms()).hasSize(1833)
                .contains("InterestRateSwap", "AssetBackedSecurity", "Bond", "CreditDefaultSwap");
    }

    @Test
    void namesTheOntologysOwnIdentifierRatherThanTheUriItIsPublishedAt() {
        assertAll(
                () -> assertThat(terms.conceptsOf("interestrateswap").getFirst().prefLabel())
                        .as("FIBO separates a concept URI with slashes and states no fragment, so the term "
                                + "is the last path segment. Read as though it were a fragment, every term "
                                + "in this file was the whole URI.")
                        .isEqualTo("InterestRateSwap"),
                () -> assertThat(terms.conceptsOf("interestrateswap").getFirst().concept())
                        .isEqualTo("https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"
                                + "InterestRateSwap"));
    }

    @Test
    void carriesTheHierarchyThePublisherStates() {
        assertAll(
                () -> assertThat(terms.conceptsOf("interestrateswap").getFirst().broader())
                        .isEqualTo("InterestRateDerivative"),
                () -> assertThat(withA(SkosConcept::broader))
                        .as("A FIGURE THAT MATTERS FOR WHAT COMES NEXT. OLiA's hierarchy is sparse and a "
                                + "rule keyed on a publisher's own placement clears its bar there by one "
                                + "branch. FIBO states a parent for 1,559 of its 1,833 concepts, so it is "
                                + "the vocabulary on which a tree-level reading can actually be tested.")
                        .isEqualTo(1559));
    }

    @Test
    void carriesWhatThePublisherSaysEachConceptMeans() {
        assertAll(
                () -> assertThat(withA(SkosConcept::definition)).isEqualTo(1792),
                () -> assertThat(terms.conceptsOf("interestrateswap").getFirst().definition())
                        .isEqualTo("swap in which the reference (underlier) for at least one leg is an "
                                + "interest rate"),
                () -> assertThat(withA(SkosConcept::note))
                        .as("and where it took them from, which is what makes a match citable to a "
                                + "standard outside the ontology")
                        .isEqualTo(1058));
    }

    @Test
    void filesEachConceptUnderTheModuleThePublisherFilesItUnder() {
        assertThat(terms.conceptsOf("interestrateswap").getFirst().module()).isEqualTo("DER");
    }

    @Test
    void abstainsOnATermTheOntologyDoesNotState() {
        assertThat(terms.conceptsOf("adjectivephrase"))
                .as("a finance ontology knows nothing about grammar, and the out-of-domain arm is the "
                        + "whole reason this vocabulary is bundled")
                .isEmpty();
    }

    private long withA(final Function<SkosConcept, String> property) {
        return terms.concepts().stream().map(property).filter(stated -> !stated.isEmpty()).count();
    }
}
