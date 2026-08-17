package io.github.fiftieshousewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class OscalCatalogTest {

    private static final String DOCUMENT = """
            {"catalog": {
              "metadata": {"title": "A framework", "version": "1.2.0"},
              "groups": [{
                "id": "GV", "class": "function", "title": "GOVERN",
                "props": [{"name": "label", "value": "GOVERN (GV)"}],
                "parts": [{"id": "GV_overview", "name": "overview", "prose": "Risk is governed"}],
                "controls": [{
                  "id": "GV.OC", "class": "category", "title": "Organizational Context",
                  "props": [{"name": "label", "value": "Organizational Context (GV.OC)"}],
                  "parts": [{"name": "statement", "prose": "The circumstances are understood"}],
                  "controls": [{
                    "id": "GV.OC-01", "class": "subcategory", "title": "GV.OC-01",
                    "props": [{"name": "label", "value": "GV.OC-01"}],
                    "parts": [{"name": "statement", "prose": "The mission is understood"},
                              {"name": "example", "prose": "Share the mission"}]}]},
                  {"id": "ID.BE", "class": "category", "title": "Business Environment",
                   "props": [{"name": "label", "value": "Business Environment (ID.BE)"},
                             {"name": "status", "value": "withdrawn"}],
                   "parts": [{"id": "ID.BE_statement", "name": "statement"}]}]}]}}
            """;

    private final OscalCatalog catalog = new OscalCatalog(DOCUMENT);

    @Test
    void readsTheVersionThePublisherStampsTheDocumentWith() {
        assertThat(catalog.version()).isEqualTo("1.2.0");
    }

    @Test
    void readsEveryGroupAndControlTheCatalogStates() {
        assertThat(catalog.controls()).extracting(OscalControl::id)
                .containsExactly("GV", "GV.OC", "GV.OC-01", "ID.BE");
    }

    @Test
    void readsANodeAsThePublisherLabelsAndClassifiesIt() {
        assertAll(
                () -> assertThat(control("GV.OC").kind()).isEqualTo("category"),
                () -> assertThat(control("GV.OC").title()).isEqualTo("Organizational Context"),
                () -> assertThat(control("GV.OC").label()).isEqualTo("Organizational Context (GV.OC)"));
    }

    @Test
    void carriesTheNodeEachOneWasNestedUnderRatherThanInferringItLater() {
        assertAll(
                () -> assertThat(control("GV").broader()).isEmpty(),
                () -> assertThat(control("GV.OC").broader()).isEqualTo("GV"),
                () -> assertThat(control("GV.OC-01").broader()).isEqualTo("GV.OC"));
    }

    @Test
    void definesAControlByItsStatementAndAFunctionByItsOverview() {
        assertAll(
                () -> assertThat(control("GV").definition()).isEqualTo("Risk is governed"),
                () -> assertThat(control("GV.OC-01").definition()).isEqualTo("The mission is understood"));
    }

    @Test
    void readsTheStatusThePublisherStatesRatherThanJudgingItHere() {
        assertAll(
                () -> assertThat(control("ID.BE").withdrawn()).isTrue(),
                () -> assertThat(control("GV.OC").withdrawn()).isFalse(),
                () -> assertThat(control("ID.BE").definition()).isEmpty());
    }

    @Test
    void refusesADocumentStatingNoCatalogRatherThanReadingItAsEmpty() {
        assertThatThrownBy(() -> new OscalCatalog("{\"profile\": {}}"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("catalog");
    }

    private OscalControl control(final String id) {
        return catalog.controls().stream().filter(control -> id.equals(control.id())).findFirst()
                .orElseThrow();
    }
}
