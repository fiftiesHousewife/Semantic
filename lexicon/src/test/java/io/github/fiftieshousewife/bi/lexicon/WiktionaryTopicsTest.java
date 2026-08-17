package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WiktionaryTopicsTest {

    private final WiktionaryTopics topics = WiktionaryTopics.fromClasspath();

    @Test
    void carriesTheCollocationsWordNetDomainsLacks() {
        assertAll(
                () -> assertThat(topics.topicsOf("break_point")).contains("tennis"),
                () -> assertThat(topics.topicsOf("unforced_error")).contains("tennis"),
                () -> assertThat(topics.topicsOf("halftime")).contains("football"));
    }

    @Test
    void aTopicsVocabularyIsTheReverseIndex() {
        assertThat(topics.wordsOf("tennis"))
                .contains("break_point", "unforced_error", "double_fault", "match_point");
    }

    @Test
    void anUnknownWordHasNoTopics() {
        assertAll(
                () -> assertThat(topics.topicsOf("winners_fh")).isEmpty(),
                () -> assertThat(topics.wordsOf("no-such-topic")).isEmpty());
    }

    @Test
    void lookupIsCaseInsensitive() {
        assertThat(topics.topicsOf("Break_Point")).contains("tennis");
    }
}
