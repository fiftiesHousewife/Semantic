package io.github.fiftieshousewife.codesemantics.lexicon;

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
                        .as("FpML declares Scheme a simple type, so it is a format constraint and not a "
                                + "subject the walk may climb to")
                        .isEmpty(),
                () -> assertThat(terms.conceptsOf("verificationmethod").getFirst().note())
                        .as("the publisher stated it, so it is kept out of the subject walk rather than "
                                + "thrown away")
                        .isEqualTo("Scheme"),
                () -> assertThat(withA(SkosConcept::broader))
                        .as("554 of the 1,405 types state a base that is another complex type. The other "
                                + "235 extend one of FpML's own simple types — 195 extend Scheme alone — "
                                + "and those bases are stated in note, because a page grouping 510 "
                                + "sightings of account type under a name for a string describes nothing.")
                        .isEqualTo(554),
                () -> assertThat(withA(SkosConcept::note)).isEqualTo(235));
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
