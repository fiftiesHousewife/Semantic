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
                () -> assertThat(terms.conceptsOf("maturitydate").getFirst().broader())
                        .isEqualTo("Common"),
                () -> assertThat(terms.conceptsOf("rawdata").getFirst().broader())
                        .as("a field the containers name in three sections is placed in all three, not "
                                + "nowhere")
                        .isEqualTo("Session | EventCommunication | UserManagement"),
                () -> assertThat(withA(SkosConcept::broader))
                        .as("6,627 of the 7,170 rows state a placement; the 543 that do not are the 535 "
                                + "fields no container carrying a category names, and eight sections and "
                                + "categories at the top of Orchestra's own tree. It was 6,337 while a "
                                + "field named in several sections was written as placed nowhere.")
                        .isEqualTo(6627));
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
