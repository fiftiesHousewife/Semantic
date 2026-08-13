package org.fifties.housewife.codesemantics.engine.term;

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
    void readsEachWordSeparatelyWhereTheDictionaryHoldsNoEntryForTheRun() {
        assertThat(senses.of(List.of("base", "form"))).hasValueSatisfying(run -> assertThat(run).hasSize(2));
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
