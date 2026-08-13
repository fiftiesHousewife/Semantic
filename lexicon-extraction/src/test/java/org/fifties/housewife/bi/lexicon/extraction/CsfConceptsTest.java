package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class CsfConceptsTest {

    private static final OscalControl GOVERN = new OscalControl("GV", "function", "GOVERN", "GOVERN (GV)",
            "", "Risk is governed", "");

    private static final OscalControl CONTEXT = new OscalControl("GV.OC", "category",
            "Organizational Context", "Organizational Context (GV.OC)", "", "The circumstances", "GV");

    private static final OscalControl OUTCOME = new OscalControl("GV.OC-01", "subcategory", "GV.OC-01",
            "GV.OC-01", "", "The mission is understood", "GV.OC");

    private static final OscalControl WITHDRAWN = new OscalControl("ID.BE", "category",
            "Business Environment", "Business Environment (ID.BE)", "withdrawn", "", "ID");

    private final CsfConcepts concepts = new CsfConcepts();

    @Test
    void readsAConceptAsThePublisherIdentifiesAndDefinesIt() {
        assertThat(concepts.in(List.of(GOVERN, CONTEXT, OUTCOME)))
                .contains(new SkosConcept("GV.OC-01", "GV.OC-01", "", "GV.OC", "subcategory", "GV",
                        "The mission is understood"));
    }

    @Test
    void rollsAConceptUpToTheFunctionTheDocumentNestsItUnder() {
        assertThat(concepts.in(List.of(GOVERN, CONTEXT, OUTCOME))).extracting(SkosConcept::module)
                .containsOnly("GV");
    }

    @Test
    void leavesTheTopOfTheFrameworkWithNothingBroaderThanItself() {
        assertThat(concepts.in(List.of(GOVERN, CONTEXT, OUTCOME)).getFirst().broader()).isEmpty();
    }

    @Test
    void takesTheOtherLabelOnlyWhereThePublisherStatesADifferentOne() {
        final List<SkosConcept> read = concepts.in(List.of(GOVERN, CONTEXT, OUTCOME));
        assertAll(
                () -> assertThat(read.get(1).altLabel()).isEqualTo("Organizational Context (GV.OC)"),
                () -> assertThat(read.get(2).altLabel()).isEmpty());
    }

    @Test
    void dropsAConceptThePublisherStatesAsWithdrawn() {
        assertThat(concepts.in(List.of(GOVERN, CONTEXT, OUTCOME, WITHDRAWN)))
                .extracting(SkosConcept::concept).doesNotContain("ID.BE");
    }

    @Test
    void refusesAConceptNestedUnderOneTheCatalogNeverStates() {
        assertThatThrownBy(() -> concepts.in(List.of(OUTCOME)))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("GV.OC");
    }
}
