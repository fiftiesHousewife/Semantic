package org.fifties.housewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DictionaryWordsTest {

    private final DictionaryWords dictionary = DictionaryWords.fromClasspath();

    @Test
    void carriesTheRunsTheFrequencyListIsTooShortToHold() {
        assertAll(
                () -> assertThat(dictionary.carries("synset")).isTrue(),
                () -> assertThat(dictionary.carries("headword")).isTrue(),
                () -> assertThat(dictionary.carries("superclass")).isTrue(),
                () -> assertThat(dictionary.carries("sunburst")).isTrue());
    }

    @Test
    void carriesAnInflectionThroughTheDictionarysOwnMorphology() {
        assertAll(
                () -> assertThat(dictionary.carries("abstains")).isTrue(),
                () -> assertThat(dictionary.carries("collocated")).isTrue(),
                () -> assertThat(dictionary.carries("collocations")).isTrue());
    }

    @Test
    void carriesAPropertyAsReadilyAsAThingOrAnAction() {
        assertAll(
                () -> assertThat(dictionary.carries("insensitive")).isTrue(),
                () -> assertThat(dictionary.carries("malformed")).isTrue(),
                () -> assertThat(dictionary.carries("callable")).isTrue());
    }

    @Test
    void carriesNothingItWasNotAskedAbout() {
        assertAll(
                () -> assertThat(dictionary.carries("classpath")).isFalse(),
                () -> assertThat(dictionary.carries("qzxfgh")).isFalse());
    }
}
