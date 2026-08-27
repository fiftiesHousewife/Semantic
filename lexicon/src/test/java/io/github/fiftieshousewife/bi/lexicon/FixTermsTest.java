package io.github.fiftieshousewife.bi.lexicon;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FixTermsTest {

    private final FixTerms terms = FixTerms.fromClasspath();

    @Test
    void statesTheVocabularyAnElectronicTradingSystemWrites() {
        assertThat(terms.terms()).hasSize(7170)
                .contains("NewOrderSingle", "ExecutionReport", "OrderQty", "SettlDate",
                        "AllocationInstruction");
    }

    @Test
    void carriesTheSectionAndCategoryHierarchyThePublisherStates() {
        assertAll(
                () -> assertThat(terms.conceptsOf("newordersingle").getFirst().broader())
                        .isEqualTo("SingleGeneralOrderHandling"),
                () -> assertThat(terms.conceptsOf("newordersingle").getFirst().module())
                        .isEqualTo("Trade"),
                () -> assertThat(withA(SkosConcept::broader)).isEqualTo(959));
    }

    @Test
    void carriesWhatThePublisherSaysEachNameMeans() {
        assertAll(
                () -> assertThat(withA(SkosConcept::definition)).isEqualTo(7003),
                () -> assertThat(terms.conceptsOf("orderqty").getFirst().definition())
                        .startsWith("Quantity ordered."));
    }

    @Test
    void carriesThePublishersOwnAbbreviatedNameAsAltLabel() {
        assertThat(terms.conceptsOf("orderqty").getFirst().altLabel()).isEqualTo("Qty");
    }

    @Test
    void abstainsOnATermTheProtocolDoesNotState() {
        assertThat(terms.conceptsOf("adjectivephrase")).isEmpty();
    }

    private long withA(final Function<SkosConcept, String> property) {
        return terms.concepts().stream().map(property).filter(stated -> !stated.isEmpty()).count();
    }
}
