package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class LemmaRunsTest {

    private final LemmaRuns lemmas = LemmaRuns.fromClasspath();

    @Test
    void readsEveryWordOfARunAsTheFormTheDictionaryHeadsItsEntryWith() {
        assertAll(
                () -> assertThat(lemmas.of(List.of("noun", "phrases"))).hasValue(List.of("noun", "phrase")),
                () -> assertThat(lemmas.of(List.of("base", "forms"))).hasValue(List.of("base", "form")));
    }

    @Test
    void leavesARunAlreadyWrittenInDictionaryFormsAsItStands() {
        assertThat(lemmas.of(List.of("common", "noun"))).hasValue(List.of("common", "noun"));
    }

    @Test
    void keepsTwoWordsApartWhereOnlyTheirSensesAgree() {
        assertThat(lemmas.of(List.of("subject"))).isNotEqualTo(lemmas.of(List.of("topic")));
    }

    @Test
    void abstainsWhereAnyWordOfTheRunHasNoDictionaryForm() {
        assertAll(
                () -> assertThat(lemmas.of(List.of("jwnlexception", "phrase"))).isEmpty(),
                () -> assertThat(lemmas.of(List.of("phrase", "of"))).isEmpty());
    }

    @Test
    void abstainsOnNoWordsAtAll() {
        assertThat(lemmas.of(List.of())).isEmpty();
    }

    @Test
    void saysItAnsweredOnDictionaryFormsRatherThanOnMeanings() {
        assertThat(lemmas.rung()).isEqualTo(TermRung.LEMMAS);
    }
}
