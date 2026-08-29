package io.github.fiftieshousewife.bi.lexicon;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FpmlTermsTest {

    private final FpmlTerms terms = FpmlTerms.fromClasspath();

    @Test
    void statesTheVocabularyADerivativesTradingSystemWrites() {
        assertThat(terms.terms()).hasSize(1405)
                .contains("Swap", "Swaption", "CreditDefaultSwap", "CapFloor", "FxSwap");
    }

    @Test
    void carriesTheExtensionHierarchyThePublisherStates() {
        assertAll(
                () -> assertThat(terms.conceptsOf("creditdefaultswap").getFirst().broader())
                        .isEqualTo("Product"),
                () -> assertThat(terms.conceptsOf("verificationmethod").getFirst().broader())
                        .as("FpML states this type's base in its own namespace, and a simple type is "
                                + "still what the publisher stated")
                        .isEqualTo("Scheme"),
                () -> assertThat(withA(SkosConcept::broader))
                        .as("789 of the 1,405 types state a base FpML writes in its own namespace; 616 "
                                + "state none at all. It was 554 while a base naming one of FpML's own "
                                + "simple types — 195 extend Scheme alone — was written as no base.")
                        .isEqualTo(789));
    }

    @Test
    void carriesWhatThePublisherSaysEachTypeMeans() {
        assertAll(
                () -> assertThat(withA(SkosConcept::definition)).isEqualTo(1181),
                () -> assertThat(terms.conceptsOf("swap").getFirst().definition())
                        .startsWith("A type defining swap streams and additional payments"));
    }

    @Test
    void filesEachTypeUnderItsSchemaFilesOwnProductArea() {
        assertAll(
                () -> assertThat(terms.conceptsOf("swap").getFirst().module()).isEqualTo("ird"),
                () -> assertThat(terms.conceptsOf("fxswap").getFirst().module()).isEqualTo("fx"));
    }

    @Test
    void abstainsOnATermTheSchemaDoesNotState() {
        assertThat(terms.conceptsOf("adjectivephrase")).isEmpty();
    }

    private long withA(final Function<SkosConcept, String> property) {
        return terms.concepts().stream().map(property).filter(stated -> !stated.isEmpty()).count();
    }
}
