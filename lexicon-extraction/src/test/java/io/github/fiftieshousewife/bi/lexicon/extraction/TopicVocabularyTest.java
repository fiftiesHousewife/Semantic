package io.github.fiftieshousewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicVocabularyTest {

    private final TopicVocabulary vocabulary = new TopicVocabulary();

    @Test
    void readsAWordsTopicsAcrossItsSenses() {
        final Optional<TopicEntry> entry = vocabulary.fromEntryJson("""
                {"word":"break","lang_code":"en","senses":[\
                {"topics":["tennis","sports"],"glosses":["A service break."]},\
                {"topics":["billiards"],"glosses":["The opening shot."]},\
                {"glosses":["A pause."]}]}""");
        assertAll(
                () -> assertThat(entry.orElseThrow().word()).isEqualTo("break"),
                () -> assertThat(entry.orElseThrow().topics())
                        .containsExactlyInAnyOrder("tennis", "sports", "billiards"));
    }

    @Test
    void underscoresAMultiWordPhrase() {
        final Optional<TopicEntry> entry = vocabulary.fromEntryJson("""
                {"word":"break point","lang_code":"en","senses":[{"topics":["tennis","sports"]}]}""");
        assertThat(entry.orElseThrow().word()).isEqualTo("break_point");
    }

    @Test
    void anEntryWithoutTopicsContributesNothing() {
        assertThat(vocabulary.fromEntryJson("""
                {"word":"pause","lang_code":"en","senses":[{"glosses":["A pause."]}]}""")).isEmpty();
    }

    @Test
    void ignoresANonEnglishEntry() {
        assertThat(vocabulary.fromEntryJson("""
                {"word":"pause","lang_code":"de","senses":[{"topics":["music"]}]}""")).isEmpty();
    }
}
