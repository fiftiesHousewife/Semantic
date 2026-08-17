package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FunctionWordsTest {

    private final FunctionWords language = FunctionWords.fromClasspath();

    @Test
    void readsAPrepositionInsideACompoundNameAsSomethingTheLanguagePutThere() {
        assertAll(
                () -> assertThat(language.includes("by")).isTrue(),
                () -> assertThat(language.includes("from")).isTrue(),
                () -> assertThat(language.includes("than")).isTrue(),
                () -> assertThat(language.includes("rather")).isTrue());
    }

    @Test
    void answersForNoDeterminerTheDictionaryHappensToCarryAsAnAdjective() {
        assertAll(
                () -> assertThat(language.includes("every")).isFalse(),
                () -> assertThat(language.includes("each")).isFalse(),
                () -> assertThat(language.includes("no")).isFalse());
    }

    @Test
    void keepsAWordThisRepositoryCoinedThoughNoDictionaryCarriesItEither() {
        assertAll(
                () -> assertThat(language.includes("tsv")).isFalse(),
                () -> assertThat(language.includes("synset")).isFalse(),
                () -> assertThat(language.includes("skos")).isFalse());
    }

    @Test
    void keepsAnOrdinaryEnglishNounAProgramMayWellBeAbout() {
        assertAll(
                () -> assertThat(language.includes("class")).isFalse(),
                () -> assertThat(language.includes("word")).isFalse(),
                () -> assertThat(language.includes("part")).isFalse());
    }

    @Test
    void keepsAPropertyTheAuthorNamedThingsForThoughNoNounOrVerbEntryCarriesIt() {
        assertAll(
                () -> assertThat(language.includes("broader")).isFalse(),
                () -> assertThat(language.includes("nearest")).isFalse(),
                () -> assertThat(language.includes("canonical")).isFalse(),
                () -> assertThat(language.includes("shortest")).isFalse());
    }

    @Test
    void answersForNoSingleLetterBecauseTheDictionaryCarriesTheAlphabetAsNouns() {
        assertAll(
                () -> assertThat(language.includes("e")).isFalse(),
                () -> assertThat(language.includes("s")).isFalse());
    }
}
