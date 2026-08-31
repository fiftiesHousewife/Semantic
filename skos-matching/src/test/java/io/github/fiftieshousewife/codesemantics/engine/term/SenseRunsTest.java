package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SenseRunsTest {

    private final SenseRuns senses = SenseRuns.fromClasspath();

    @Test
    void readsARunTheDictionaryHoldsAsOneEntryAsOneSense() {
        assertThat(senses.of(List.of("noun", "phrase"))).hasValueSatisfying(run -> assertThat(run).hasSize(1));
    }

    @Test
    void readsNothingWhereTheDictionaryHoldsNoEntryForTheWholeRun() {
        assertThat(senses.of(List.of("base", "form")))
                .as("reading a run word by word made two words sharing a commonest sense into one word, "
                        + "and where the two runs carry the same words it only repeats the lemma rung")
                .isEmpty();
    }

    @Test
    void refusesToReadOneWordAsAnotherTheyShareASenseWith() {
        assertAll(
                () -> assertThat(senses.of(List.of("set", "window")))
                        .as("set and put share a sense, and FIBO's PutWindow is not a window anything "
                                + "is set in")
                        .isEqualTo(senses.of(List.of("put", "window"))).isEmpty(),
                () -> assertThat(senses.of(List.of("packet", "header")))
                        .as("packet and package share one, and FpML's PackageHeader is not a packet "
                                + "header")
                        .isEmpty());
    }

    @Test
    void putsTwoSpellingsOfOneMeaningOnOneRun() {
        assertAll(
                () -> assertThat(senses.of(List.of("nominal", "phrase")))
                        .isEqualTo(senses.of(List.of("noun", "phrase"))),
                () -> assertThat(senses.of(List.of("word", "class")))
                        .isEqualTo(senses.of(List.of("part", "of", "speech"))));
    }

    @Test
    void keepsApartTwoRunsTheDictionaryDistinguishes() {
        assertThat(senses.of(List.of("common", "noun"))).isNotEqualTo(senses.of(List.of("proper", "noun")));
    }

    @Test
    void abstainsWhereAnyWordOfTheRunIsOneTheDictionaryDoesNotKnow() {
        assertAll(
                () -> assertThat(senses.of(List.of("jwnlexception", "phrase"))).isEmpty(),
                () -> assertThat(senses.of(List.of("phrase", "qzxv"))).isEmpty());
    }

    @Test
    void abstainsOnNoWordsAtAll() {
        assertThat(senses.of(List.of())).isEmpty();
    }
}
