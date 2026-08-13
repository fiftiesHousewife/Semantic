package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fifties.housewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.junit.jupiter.api.Assertions.assertAll;

class NormalisedTermsTest {

    private static final String SOURCE = "a taxonomy";

    @Test
    void findsATermUnderAWordThePublisherDidNotWrite() {
        assertThat(sensing("noun phrase").conceptsOf(List.of("nominal", "phrase")))
                .extracting("prefLabel").containsExactly("noun phrase");
    }

    @Test
    void findsATermTheRepositoryWroteInTheSameWordsAsThePublisher() {
        assertThat(sensing("common noun").conceptsOf(List.of("common", "noun"))).hasSize(1);
    }

    @Test
    void findsATermThePublisherWroteInTheSingularAndTheRepositoryInThePlural() {
        assertThat(lemmatising("noun phrase").conceptsOf(List.of("noun", "phrases")))
                .extracting("prefLabel").containsExactly("noun phrase");
    }

    @Test
    void keepsTwoWordsApartWhereOnlyTheirSensesAgree() {
        assertAll(
                () -> assertThat(lemmatising("topic").conceptsOf(List.of("subject"))).isEmpty(),
                () -> assertThat(sensing("topic").conceptsOf(List.of("subject"))).isNotEmpty());
    }

    @Test
    void holdsEveryTermOfTheSourceThatReadsAsOneNormalForm() {
        assertThat(sensing("word class", "part of speech").conceptsOf(List.of("form", "class")))
                .extracting("prefLabel").containsExactlyInAnyOrder("word class", "part of speech");
    }

    @Test
    void abstainsWhereTheRunHasNoNormalFormToCompare() {
        assertAll(
                () -> assertThat(sensing("common noun").conceptsOf(List.of("jwnlexception"))).isEmpty(),
                () -> assertThat(lemmatising("common noun").conceptsOf(List.of("jwnlexception"))).isEmpty());
    }

    @Test
    void abstainsWhereTheSourceStatesNothingOfThatNormalForm() {
        assertThat(sensing("common noun").conceptsOf(List.of("interest", "rate"))).isEmpty();
    }

    @Test
    void keepsWhatTheSourceStatesAboutItsOwnTerms() {
        final TermIndex normalised = NormalisedTerms.over(
                publishing(SOURCE, "common noun").stating("common noun", "noun"), SenseRuns.fromClasspath());

        assertAll(
                () -> assertThat(normalised.source()).isEqualTo(SOURCE),
                () -> assertThat(normalised.broaderOf("common noun")).hasValue("noun"),
                () -> assertThat(normalised.terms()).containsExactly(List.of("common", "noun")),
                () -> assertThat(normalised.longestTerm()).isEqualTo(2));
    }

    @Test
    void saysWhichRungItAnsweredOn() {
        assertAll(
                () -> assertThat(sensing("noun").rung()).isEqualTo(TermRung.SENSES),
                () -> assertThat(lemmatising("noun").rung()).isEqualTo(TermRung.LEMMAS));
    }

    private static TermIndex sensing(final String... terms) {
        return NormalisedTerms.over(publishing(SOURCE, terms), SenseRuns.fromClasspath());
    }

    private static TermIndex lemmatising(final String... terms) {
        return NormalisedTerms.over(publishing(SOURCE, terms), LemmaRuns.fromClasspath());
    }
}
