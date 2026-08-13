package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fifties.housewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.junit.jupiter.api.Assertions.assertAll;

class SensedTermsTest {

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
    void holdsEveryTermOfTheSourceThatReadsAsOneMeaning() {
        assertThat(sensing("word class", "part of speech").conceptsOf(List.of("form", "class")))
                .extracting("prefLabel").containsExactlyInAnyOrder("word class", "part of speech");
    }

    @Test
    void abstainsWhereTheRunHasNoMeaningToCompare() {
        assertThat(sensing("common noun").conceptsOf(List.of("jwnlexception"))).isEmpty();
    }

    @Test
    void abstainsWhereTheSourceStatesNothingOfThatMeaning() {
        assertThat(sensing("common noun").conceptsOf(List.of("interest", "rate"))).isEmpty();
    }

    @Test
    void keepsWhatTheSourceStatesAboutItsOwnTerms() {
        final TermIndex sensed = SensedTerms.over(
                publishing(SOURCE, "common noun").stating("common noun", "noun"), SenseRuns.fromClasspath());

        assertAll(
                () -> assertThat(sensed.source()).isEqualTo(SOURCE),
                () -> assertThat(sensed.broaderOf("common noun")).hasValue("noun"),
                () -> assertThat(sensed.terms()).containsExactly(List.of("common", "noun")),
                () -> assertThat(sensed.longestTerm()).isEqualTo(2));
    }

    @Test
    void saysItAnsweredOnMeaningsRatherThanOnWords() {
        assertThat(sensing("noun").rung()).isEqualTo(TermRung.SENSES);
    }

    private static TermIndex sensing(final String... terms) {
        return SensedTerms.over(publishing(SOURCE, terms), SenseRuns.fromClasspath());
    }
}
