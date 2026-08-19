package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RegisteredFormatsTest {

    private final RegisteredFormats formats = RegisteredFormats.fromClasspath();

    @Test
    void statesTheSubtypeOfARegisteredIdentifier() {
        assertAll(
                () -> assertThat(formats.names("pdf")).isTrue(),
                () -> assertThat(formats.names("jpeg")).isTrue(),
                () -> assertThat(formats.names("html")).isTrue(),
                () -> assertThat(formats.names("json")).isTrue());
    }

    @Test
    void statesEachPartOfAStructuredSuffix() {
        assertAll(
                () -> assertThat(formats.names("rdf")).isTrue(),
                () -> assertThat(formats.names("xml")).isTrue());
    }

    @Test
    void readsAWordInWhateverCaseAnIdentifierWroteIt() {
        assertThat(formats.names("PDF")).isTrue();
    }

    @Test
    void refusesASubtypeARegistrationTreeOtherThanTheStandardsTreeCarries() {
        assertAll(
                () -> assertThat(formats.names("vnd")).isFalse(),
                () -> assertThat(formats.names("acucobol")).isFalse(),
                () -> assertThat(formats.names("prs")).isFalse());
    }

    @Test
    void refusesAWordTheRegistryStatesNowhere() {
        assertThat(formats.names("ontology")).isFalse();
    }

    @Test
    void statesNothingAboutAnEmptyRun() {
        assertThat(formats.namesAll(List.of())).isFalse();
    }

    @Test
    void claimsARunOnlyWhereTheRegistryStatesEveryWordOfIt() {
        assertAll(
                () -> assertThat(formats.namesAll(List.of("rdf", "xml"))).isTrue(),
                () -> assertThat(formats.namesAll(List.of("rdf", "ontology"))).isFalse());
    }
}
