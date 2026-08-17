package io.github.fiftieshousewife.codesemantics.engine.term;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CitedWordTest {

    private final CitedWord cited = CitedWord.fromClasspath();

    @Test
    void refusesALetterTheSplitterProducedThatNoResourceStatesAsAWordOrAnInitialism() {
        assertAll(
                () -> assertThat(cited.states("n")).isFalse(),
                () -> assertThat(cited.states("c")).isFalse(),
                () -> assertThat(cited.states("p")).isFalse());
    }

    @Test
    void refusesAWordEnglishItselfIsWrittenIn() {
        assertAll(
                () -> assertThat(cited.states("it")).isFalse(),
                () -> assertThat(cited.states("its")).isFalse(),
                () -> assertThat(cited.states("the")).isFalse());
    }

    @Test
    void keepsAWordCommonEnoughToBeRankedAndSpecificEnoughToMean() {
        assertAll(
                () -> assertThat(cited.states("email")).isTrue(),
                () -> assertThat(cited.states("server")).isTrue(),
                () -> assertThat(cited.states("encoding")).isTrue(),
                () -> assertThat(cited.states("semantics")).isTrue());
    }

    @Test
    void statesAWordTheDictionaryCarries() {
        assertAll(
                () -> assertThat(cited.states("verb")).isTrue(),
                () -> assertThat(cited.states("phrase")).isTrue(),
                () -> assertThat(cited.states("parse")).isTrue());
    }

    @Test
    void statesAnAcronymThePublishedRegistryCarriesEvenWhereNoDictionaryDoes() {
        assertAll(
                () -> assertThat(cited.states("xml")).isTrue(),
                () -> assertThat(cited.states("html")).isTrue(),
                () -> assertThat(cited.states("http")).isTrue());
    }

    @Test
    void asksWithoutRegardToTheCaseAnIdentifierHappenedToUse() {
        assertAll(
                () -> assertThat(cited.states("XML")).isTrue(),
                () -> assertThat(cited.states("Verb")).isTrue());
    }
}
