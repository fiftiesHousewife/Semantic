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
                () -> assertThat(withA(SkosConcept::broader)).isEqualTo(789));
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
