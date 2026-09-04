package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedPathsTest {

    @Test
    void placesAConceptWithNoStatedParentUnderTheModuleItsPublisherFilesItIn() {
        final List<SkosConcept> flat = List.of(
                concept("AccountType", "", "shared"), concept("ReasonCode", "", "doc"),
                concept("ReportId", "", "msg"), concept("CompoundingFrequency", "", "mktenv"));

        assertAll(
                () -> assertThat(paths(flat).above("AccountType")).containsExactly("shared"),
                () -> assertThat(paths(flat).above("ReasonCode")).containsExactly("doc"));
    }

    @Test
    void keepsTwoConceptsApartThatTheirPublisherStatesNothingAboveAndFilesSeparately() {
        final List<SkosConcept> flat = List.of(
                concept("AccountType", "", "shared"), concept("ReasonCode", "", "doc"));
        final StatedPaths stated = paths(flat);

        assertThat(stated.above("AccountType")).isNotEqualTo(stated.above("ReasonCode"));
    }

    @Test
    void leavesAStatedChainAloneRatherThanAddingTheModuleOverIt() {
        final List<SkosConcept> deep = List.of(
                concept("SwapLeg", "CashflowTerms", "DER"), concept("CashflowTerms", "", "DER"),
                concept("Bond", "", "SEC"), concept("Equity", "", "SEC"), concept("Loan", "", "LOAN"));

        assertThat(paths(deep).above("SwapLeg"))
                .as("a stated parent is a better answer than a filing, and reading both puts an ontology "
                        + "file name over six concepts on OLiA's discourse relations")
                .containsExactly("CashflowTerms");
    }

    @Test
    void leavesOffAModuleAnOutrightMajorityOfTheVocabularyIsFiledUnder() {
        final List<SkosConcept> lopsided = List.of(
                concept("Value", "", "FND"), concept("QuantitativeValue", "Value", "FND"),
                concept("PresentValue", "QuantitativeValue", "FND"), concept("Bond", "", "SEC"));

        assertAll(
                () -> assertThat(paths(lopsided).sharedModules()).containsExactly("FND"),
                () -> assertThat(paths(lopsided).above("Value"))
                        .as("FIBO files 71% of its concepts' chains in FND, which names only the "
                                + "vocabulary that matched")
                        .isEmpty(),
                () -> assertThat(paths(lopsided).above("Bond")).containsExactly("SEC"));
    }

    @Test
    void readsTheModuleOfTheBroadestRowWhereTheChainTopsOutInALabelTheSourceDoesNotPublish() {
        final List<SkosConcept> imported = List.of(
                concept("ServiceProvider", "FunctionalEntity", "BE"),
                concept("FunctionalEntity", "", ""), concept("Elsewhere", "", "SEC"));

        assertAll(
                () -> assertThat(paths(imported).moduleOf("Elsewhere")).hasValue("SEC"),
                () -> assertThat(paths(imported).moduleOf("ServiceProvider"))
                        .as("FIBO states PartyRole and Classifier above 228 rows and publishes neither, so "
                                + "the broadest row is the last one that can be asked")
                        .isEmpty());
    }

    @Test
    void statesNoModuleWhereTheBroadestRowIsFiledInNone() {
        final List<SkosConcept> commons = List.of(
                concept("ServiceProvider", "LegalEntity", "BE"), concept("LegalEntity", "", ""));

        assertAll(
                () -> assertThat(paths(commons).moduleOf("ServiceProvider")).isEmpty(),
                () -> assertThat(paths(commons).above("ServiceProvider")).containsExactly("LegalEntity"));
    }

    @Test
    void asksNothingOfAVocabularyThatStatesNoModuleAtAll() {
        final List<SkosConcept> plain = List.of(
                concept("public keys", "public key cryptography", ""),
                concept("public key cryptography", "", ""));

        assertAll(
                () -> assertThat(paths(plain).sharedModules()).isEmpty(),
                () -> assertThat(paths(plain).above("public keys"))
                        .containsExactly("public key cryptography"));
    }

    private static StatedPaths paths(final List<SkosConcept> published) {
        return new StatedPaths(StatedAncestry.over(published), published);
    }

    private static SkosConcept concept(final String label, final String broader, final String module) {
        return new SkosConcept("urn:" + label, label, "", broader, "class", module, "", "");
    }
}
