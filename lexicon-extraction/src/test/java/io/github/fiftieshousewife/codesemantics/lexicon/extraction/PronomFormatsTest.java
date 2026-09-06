package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PronomFormatsTest {

    private static final String SIGNATURE_FILE = """
            <?xml version="1.0" encoding="UTF-8"?>
            <FFSignatureFile DateCreated="2026-09-02T09:52:22" Version="125"
                xmlns="http://www.nationalarchives.gov.uk/pronom/SignatureFile">
              <InternalSignatureCollection>
                <InternalSignature ID="9" Specificity="Specific"/>
              </InternalSignatureCollection>
              <FileFormatCollection>
                <FileFormat ID="8" MIMEType="application/pdf" Name="Acrobat PDF 1.4 - Portable Document Format"
                    PUID="fmt/18" Version="1.4">
                  <InternalSignatureID>123</InternalSignatureID>
                  <Extension>pdf</Extension>
                </FileFormat>
                <FileFormat ID="13" Name="Online Description Tool Format" PUID="x-fmt/3">
                  <Extension>odt</Extension>
                </FileFormat>
                <FileFormat ID="40" MIMEType="application/xhtml+xml, text/html"
                    Name="Extensible Hypertext Markup Language" PUID="fmt/102" Version="1.0">
                  <Extension>xhtml</Extension>
                  <Extension>html</Extension>
                </FileFormat>
              </FileFormatCollection>
            </FFSignatureFile>
            """;

    private static List<SkosConcept> read() {
        return new PronomFormats().in(SIGNATURE_FILE.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void readsAFormatAsOneConceptAtItsPuidsPermalink() {
        assertThat(read())
                .filteredOn(concept -> concept.prefLabel().equals("Acrobat PDF 1.4 - Portable Document Format"))
                .extracting(SkosConcept::concept)
                .containsExactly("https://www.nationalarchives.gov.uk/PRONOM/fmt/18");
    }

    @Test
    void poolsTheStatedExtensionsAndMediaTypesIntoAltLabel() {
        assertThat(read()).filteredOn(concept -> concept.concept().endsWith("fmt/102"))
                .extracting(SkosConcept::altLabel)
                .containsExactly("xhtml | html | application/xhtml+xml | text/html");
    }

    @Test
    void carriesTheStatedVersionInNoteAndNothingWhereNoneIsStated() {
        assertAll(
                () -> assertThat(read()).filteredOn(concept -> concept.concept().endsWith("fmt/18"))
                        .extracting(SkosConcept::note)
                        .containsExactly("version 1.4"),
                () -> assertThat(read()).filteredOn(concept -> concept.concept().endsWith("x-fmt/3"))
                        .extracting(SkosConcept::note)
                        .containsExactly(""));
    }

    @Test
    void statesNoBroaderAndNoDefinitionBecauseTheFileStatesNone() {
        assertAll(
                () -> assertThat(read()).extracting(SkosConcept::broader).containsOnly(""),
                () -> assertThat(read()).extracting(SkosConcept::definition).containsOnly(""),
                () -> assertThat(read()).extracting(SkosConcept::kind).containsOnly("format"));
    }
}
