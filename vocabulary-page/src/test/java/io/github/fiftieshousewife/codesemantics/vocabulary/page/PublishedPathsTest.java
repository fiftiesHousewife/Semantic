package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

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

    private static final PublishedPaths DOMINATED = new PublishedPaths(List.of(
            concept("Everything", "", ""),
            concept("Rates", "Everything", ""),
            concept("InterestRate", "Rates", ""),
            concept("Valuation", "Everything", "")));

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
    void climbsIntoTheStatedModuleWhereTheChainTopsOutWithoutAParent() {
        assertThat(PATHS.pathOf("PresentValue"))
                .containsExactly("FND", "MonetaryAmount", "PresentValue");
    }

    @Test
    void namesALevelHoldingTheMajorityOfTheSchemeAsItsField() {
        assertThat(DOMINATED.fieldLevels()).containsExactly("Everything");
    }

    @Test
    void passesOverTheLevelAnOutrightMajorityOfTheSchemeSitsBeneath() {
        assertThat(DOMINATED.pathPastTheFieldOf("InterestRate"))
                .containsExactly("Rates", "InterestRate");
    }

    @Test
    void keepsAConceptThatItselfNamesTheFieldRatherThanLeavingItNoPath() {
        assertThat(DOMINATED.pathPastTheFieldOf("Everything")).containsExactly("Everything");
    }

    @Test
    void leavesAPathAloneWhereNoLevelHoldsAMajority() {
        assertThat(PATHS.pathPastTheFieldOf("InterestRateSwap"))
                .containsExactly("Agreement", "Contract", "InterestRateSwap");
    }

    @Test
    void namesTheBroadestStatedLevelAsTheRoot() {
        assertThat(PATHS.rootOf("PresentValue")).isEqualTo("FND");
    }
}
