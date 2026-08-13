package org.fifties.housewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SqlFunctionsTest {

    private final SqlFunctions functions = SqlFunctions.fromClasspath();

    @Test
    void namesTheFunctionsTheEngineAnswersTo() {
        assertAll(
                () -> assertThat(functions.names("abs")).isTrue(),
                () -> assertThat(functions.names("avg")).isTrue(),
                () -> assertThat(functions.names("ABS")).isTrue());
    }

    @Test
    void doesNotNameTokensThatAreNotFunctionsOfTheLanguage() {
        assertAll(
                () -> assertThat(functions.names("prct")).isFalse(),
                () -> assertThat(functions.names("desc")).isFalse(),
                () -> assertThat(functions.names("qty")).isFalse());
    }

    @Test
    void describesOnlyThePhraseItsOwnEntryStatesTheWordsFor() {
        assertAll(
                () -> assertThat(functions.describes("abs", "absolute")).isTrue(),
                () -> assertThat(functions.describes("abs", "absolute value")).isTrue(),
                () -> assertThat(functions.describes("abs", "absolute temperature")).isFalse(),
                () -> assertThat(functions.describes("abs", "absence")).isFalse());
    }

    @Test
    void aRareWordSharedWithAnotherEntryDoesNotDescribeAToken() {
        assertThat(functions.describes("abs", "australian bureau of statistics")).isFalse();
    }

    @Test
    void aTokenTheCatalogueDoesNotNameDescribesNothing() {
        assertThat(functions.describes("prct", "percent")).isFalse();
    }
}
