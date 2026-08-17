package io.github.fiftieshousewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.dictionary.Dictionary;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordNetAbbreviationsTest {

    private final WordNetAbbreviations abbreviations = new WordNetAbbreviations(dictionary());

    private static Dictionary dictionary() {
        try {
            return Dictionary.getDefaultResourceInstance();
        } catch (final JWNLException e) {
            throw new IllegalStateException("Failed to load the bundled WordNet database", e);
        }
    }

    @Test
    void standsInTheNounFromTheDottedEntrysOwnSense() {
        assertThat(abbreviations.abbreviationNoun("aka")).hasValue("alias");
    }

    @Test
    void refusesATokenTheDictionaryAlreadyKnowsAsAWord() {
        assertAll(
                () -> assertThat(abbreviations.abbreviationNoun("self")).isEmpty(),
                () -> assertThat(abbreviations.abbreviationNoun("tv")).isEmpty());
    }

    @Test
    void refusesATokenLongerThanAnInitialismCanBe() {
        assertAll(
                () -> assertThat(abbreviations.abbreviationNoun("wysiwyg")).isEmpty(),
                () -> assertThat(abbreviations.abbreviationNoun("nascar")).isEmpty());
    }

    @Test
    void refusesATokenThatIsNotAllLetters() {
        assertAll(
                () -> assertThat(abbreviations.abbreviationNoun("a1")).isEmpty(),
                () -> assertThat(abbreviations.abbreviationNoun("e.g")).isEmpty());
    }

    @Test
    void refusesATokenWithNoDottedEntry() {
        assertAll(
                () -> assertThat(abbreviations.abbreviationNoun("qzx")).isEmpty(),
                () -> assertThat(abbreviations.abbreviationNoun("repo")).isEmpty());
    }
}
