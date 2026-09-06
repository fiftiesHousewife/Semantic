package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CsrcConceptsTest {

    private static final String EXPORT = """
            {"totalRecords": 5, "comment": "stated by the publisher", "parentTerms": [
              {"term": "XML Signature", "link": "https://csrc.nist.gov/glossary/term/xml_signature",
               "definitions": [
                 {"text": "A mechanism for ensuring the origin and\\n   integrity of XML documents.",
                  "sources": [{"text": "NIST SP 800-95"}]},
                 {"text": "A mechanism for ensuring the origin and integrity of XML documents.",
                  "sources": [{"text": "NIST SP 800-95 again"}]}]},
              {"term": ".csv", "link": "https://csrc.nist.gov/glossary/term/_csv",
               "abbrSyn": [{"text": "Comma-Separated Value", "link": "csv"}],
               "definitions": null},
              {"term": "American&nbsp;Society for Testing &amp; Materials",
               "link": "https://csrc.nist.gov/glossary/term/astm",
               "definitions": null},
              {"term": "{<i>X</i>}", "link": "https://csrc.nist.gov/glossary/term/brace_x",
               "note": "(C.F.D.)",
               "seeAlso": [{"text": "<em>Sample</em>", "link": "sample"}],
               "definitions": null},
              {"term": "special character", "link": "https://csrc.nist.gov/glossary/term/special_character",
               "definitions": [
                 {"text": "Any of ! { | } ~ on a keyboard.", "sources": [{"text": "NIST SP 800-63-3"}]},
                 {"text": "A character no rule here refuses.", "sources": [{"text": "NIST SP 800-63-3"}]}]}
            ]}
            """;

    private static CsrcConcepts.Read read() {
        return new CsrcConcepts().in(EXPORT.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void readsATermAsOneConceptAtTheGlossarysPermalink() {
        assertThat(read().concepts())
                .filteredOn(concept -> concept.prefLabel().equals("XML Signature"))
                .extracting(SkosConcept::concept)
                .containsExactly("https://csrc.nist.gov/glossary/term/xml_signature");
    }

    @Test
    void joinsTheStatedDefinitionsAndAnExactRepeatIsOneStatement() {
        assertThat(read().concepts())
                .filteredOn(concept -> concept.concept().endsWith("xml_signature"))
                .extracting(SkosConcept::definition)
                .containsExactly("A mechanism for ensuring the origin and integrity of XML documents.");
    }

    @Test
    void poolsTheStatedAbbreviationsAndSynonymsIntoAltLabel() {
        assertThat(read().concepts())
                .filteredOn(concept -> concept.concept().endsWith("_csv"))
                .extracting(SkosConcept::altLabel)
                .containsExactly("Comma-Separated Value");
    }

    @Test
    void carriesTheTextTheExportsHtmlRendersAs() {
        assertAll(
                () -> assertThat(read().concepts())
                        .filteredOn(concept -> concept.concept().endsWith("astm"))
                        .extracting(SkosConcept::prefLabel)
                        .containsExactly("American Society for Testing & Materials"),
                () -> assertThat(read().concepts())
                        .filteredOn(concept -> concept.concept().endsWith("brace_x"))
                        .extracting(SkosConcept::prefLabel)
                        .containsExactly("{ X }"));
    }

    @Test
    void carriesTheGlossarysNoteAndItsSeeAlsoTargetsInNote() {
        assertThat(read().concepts())
                .filteredOn(concept -> concept.concept().endsWith("brace_x"))
                .extracting(SkosConcept::note)
                .containsExactly("(C.F.D.)" + SkosConcept.STATEMENTS + "Sample");
    }

    @Test
    void setsAsideAStatementCarryingTheSeparatorAndKeepsTheRowsOthers() {
        assertAll(
                () -> assertThat(read().concepts())
                        .filteredOn(concept -> concept.concept().endsWith("special_character"))
                        .extracting(SkosConcept::definition)
                        .containsExactly("A character no rule here refuses."),
                () -> assertThat(read().statementsSetAside())
                        .containsExactly("Any of ! { | } ~ on a keyboard."));
    }

    @Test
    void statesNoBroaderAndNoModuleBecauseTheGlossaryStatesNoHierarchy() {
        assertAll(
                () -> assertThat(read().concepts()).extracting(SkosConcept::broader).containsOnly(""),
                () -> assertThat(read().concepts()).extracting(SkosConcept::module).containsOnly(""),
                () -> assertThat(read().concepts()).extracting(SkosConcept::kind).containsOnly("term"));
    }
}
