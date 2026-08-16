package org.fifties.housewife.codesemantics.engine.theme;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ContentWordsTest {

    private final ContentWords content = ContentWords.fromClasspath();

    @Test
    void readsAnAuxiliaryAsTheVerbTheDictionaryStatesRatherThanTheNounItsSuffixRuleReaches() {
        assertAll(
                () -> assertThat(content.lemmaOf("was")).contains("be"),
                () -> assertThat(content.lemmaOf("has")).contains("have"),
                () -> assertThat(content.lemmaOf("been")).contains("be"));
    }

    @Test
    void keepsTheNounWhereTheSurfaceIsItselfOneTheDictionaryIndexes() {
        assertAll(
                () -> assertThat(content.lemmaOf("left")).contains("left"),
                () -> assertThat(content.lemmaOf("saw")).contains("saw"),
                () -> assertThat(content.lemmaOf("word")).contains("word"));
    }

    @Test
    void stillPrefersTheNounWhereNothingStatesAVerb() {
        assertAll(
                () -> assertThat(content.lemmaOf("words")).contains("word"),
                () -> assertThat(content.lemmaOf("children")).contains("child"),
                () -> assertThat(content.lemmaOf("analyses")).contains("analysis"));
    }

    @Test
    void readsNothingForAWordTooShortForAnEntryAboutItToMeanMoreThanASymbol() {
        assertAll(
                () -> assertThat(content.lemmaOf("a")).isEmpty(),
                () -> assertThat(content.lemmaOf("em")).isEmpty(),
                () -> assertThat(content.tooShortToMean("id")).isTrue());
    }

    @Test
    void readsNothingForAWordNoOpenClassCarries() {
        assertAll(
                () -> assertThat(content.lemmaOf("and")).isEmpty(),
                () -> assertThat(content.lemmaOf("which")).isEmpty(),
                () -> assertThat(content.lemmaOf("qzxfgh")).isEmpty());
    }
}
