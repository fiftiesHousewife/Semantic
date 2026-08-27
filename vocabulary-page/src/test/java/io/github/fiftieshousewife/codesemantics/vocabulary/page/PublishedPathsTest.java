package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;

class PublishedPathsTest {

    private static SkosConcept concept(final String label, final String broader, final String module) {
        return new SkosConcept("urn:" + label, label, "", broader, "class", module, "", "");
    }

    private static final PublishedPaths PATHS = new PublishedPaths(List.of(
            concept("Agreement", "", ""),
            concept("Contract", "Agreement", ""),
            concept("InterestRateSwap", "Contract", "DER"),
            concept("MonetaryAmount", "", "FND"),
            concept("PresentValue", "MonetaryAmount", "FND"),
            concept("Term Deposit", "Loans and Deposits", "Products")));

    @Test
    void climbsTheStatedBroaderChainRootFirst() {
        assertThat(PATHS.pathOf("InterestRateSwap"))
                .containsExactly("Agreement", "Contract", "InterestRateSwap");
    }

    @Test
    void standsAConceptWithNoStatedLevelsAboveAtItsOwnRoot() {
        assertThat(PATHS.pathOf("Agreement")).containsExactly("Agreement");
    }

    @Test
    void drawsTheNameOnlyLevelsOverATopWhoseBroaderIsNotARow() {
        assertThat(PATHS.pathOf("Term Deposit"))
                .containsExactly("Products", "Loans and Deposits", "Term Deposit");
    }

    @Test
    void standsATopWithAModuleCodeAndNoParentAtItsOwnRoot() {
        assertThat(PATHS.pathOf("PresentValue"))
                .containsExactly("MonetaryAmount", "PresentValue");
    }

    @Test
    void namesALevelHoldingTheMajorityOfTheSchemeAsItsField() {
        final PublishedPaths dominated = new PublishedPaths(List.of(
                concept("Everything", "", ""),
                concept("Rates", "Everything", ""),
                concept("InterestRate", "Rates", ""),
                concept("Valuation", "Everything", "")));

        assertThat(dominated.fieldLevels()).containsExactly("Everything");
    }

    @Test
    void namesTheBroadestStatedLevelAsTheRoot() {
        assertThat(PATHS.rootOf("PresentValue")).isEqualTo("MonetaryAmount");
    }
}
