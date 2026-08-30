package io.github.fiftieshousewife.codesemantics.engine.theme;

import io.github.fiftieshousewife.codesemantics.engine.Thresholds;
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

    @Test
    void asksTheDictionaryOnceForAWordHoweverOftenItIsRead() {
        final CountedLookups dictionary = new CountedLookups();
        final ContentWords counted = new ContentWords(dictionary, Thresholds.defaults());

        counted.lemmaOf("token");
        counted.lemmaOf("token");
        counted.lemmaOf("token");

        assertThat(dictionary.nounBaseCalls())
                .as("the collocation walk asks for the same word's lemma at every position it could start")
                .isEqualTo(1);
    }
}
