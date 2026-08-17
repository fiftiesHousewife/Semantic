package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordNetSensesTest {

    private final Lexicon lexicon = WordNetLexicon.fromClasspath();

    @Test
    void putsAWordAndEveryOtherWordWrittenIntoItsSenseOnOneMeaning() {
        assertAll(
                () -> assertThat(lexicon.commonestSense("topic")).isEqualTo(lexicon.commonestSense("theme")),
                () -> assertThat(lexicon.commonestSense("topic")).isEqualTo(lexicon.commonestSense("subject")),
                () -> assertThat(lexicon.commonestSense("form")).isEqualTo(lexicon.commonestSense("signifier")));
    }

    @Test
    void namesASenseByTheFirstWordTheDictionaryWroteIntoIt() {
        assertThat(lexicon.commonestSense("theme").map(WordSense::name)).hasValue("subject");
    }

    @Test
    void readsACollocationTheDictionaryHoldsAsOneEntry() {
        assertAll(
                () -> assertThat(lexicon.commonestSense("noun phrase"))
                        .isEqualTo(lexicon.commonestSense("nominal phrase")),
                () -> assertThat(lexicon.commonestSense("part of speech"))
                        .isEqualTo(lexicon.commonestSense("word class")),
                () -> assertThat(lexicon.commonestSense("noun_phrase").map(WordSense::name))
                        .hasValue("noun phrase"));
    }

    @Test
    void refusesToReadACollocationAsItsHeadWord() {
        assertAll(
                () -> assertThat(lexicon.commonestSense("base form")).isEmpty(),
                () -> assertThat(lexicon.commonestSense("adjective phrase")).isEmpty());
    }

    @Test
    void takesTheSenseTheTaggedCorpusCountedMostWhicheverPartOfSpeechCarriesIt() {
        assertAll(
                () -> assertThat(lexicon.commonestSense("first").map(WordSense::partOfSpeech))
                        .hasValue("adjective"),
                () -> assertThat(lexicon.commonestSense("common").map(WordSense::partOfSpeech))
                        .hasValue("adjective"),
                () -> assertThat(lexicon.commonestSense("sentence").map(WordSense::partOfSpeech))
                        .hasValue("noun"));
    }

    @Test
    void readsAnInflectionThroughTheDictionarysOwnMorphology() {
        assertThat(lexicon.commonestSense("phrases")).isEqualTo(lexicon.commonestSense("phrase"));
    }

    @Test
    void abstainsOnAWordTheDictionaryDoesNotKnow() {
        assertAll(
                () -> assertThat(lexicon.commonestSense("jwnlexception")).isEmpty(),
                () -> assertThat(lexicon.commonestSense("qzxv")).isEmpty());
    }

    @Test
    void keepsTwoWordsTheDictionaryNeverWroteTogetherApart() {
        assertAll(
                () -> assertThat(lexicon.commonestSense("article")).isNotEqualTo(lexicon.commonestSense("determiner")),
                () -> assertThat(lexicon.commonestSense("lemma")).isNotEqualTo(lexicon.commonestSense("form")));
    }
}
