package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SkosTsvTest {

    private static final SkosConcept OUTCOME = new SkosConcept("GV.OC-01", "GV.OC-01", "", "GV.OC",
            "subcategory", "GV", "The mission is understood", "");

    private static final SkosConcept FUNCTION = new SkosConcept("GV", "GOVERN", "GOVERN (GV)", "",
            "function", "GV", "Risk is governed", "");

    private final SkosTsv tsv = new SkosTsv();

    @Test
    void writesAConceptsPropertiesInTheOrderTheColumnsAreNamedIn() {
        assertThat(tsv.render(List.of(OUTCOME)))
                .isEqualTo("GV.OC-01\tGV.OC-01\t\tGV.OC\tsubcategory\tGV\tThe mission is understood\t\n");
    }

    @Test
    void sortsByConceptSoAReExtractionShowsWhatTheSourceChanged() {
        assertThat(tsv.render(List.of(OUTCOME, FUNCTION))).startsWith("GV\tGOVERN\t");
    }

    @Test
    void refusesAFieldThatWouldBeReadBackAsAColumnOrARowNobodyWrote() {
        assertThatThrownBy(() -> tsv.render(List.of(new SkosConcept("GV", "GOVERN", "", "", "function", "GV",
                "Risk is\tgoverned", ""))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Risk is");
    }

    @Test
    void refusesAConceptThatWouldBeReadBackAsTheHeaderRatherThanAsARow() {
        assertThatThrownBy(() -> tsv.render(List.of(new SkosConcept("#Noun", "Noun", "", "", "class",
                "olia.owl", "", ""))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("#Noun");
    }

    @Test
    void namesTheColumnsItWritesSoAHeaderCanStateThem() {
        assertThat(SkosTsv.COLUMNS)
                .isEqualTo("concept, prefLabel, altLabel, broader, kind, module, definition, note");
    }
}
