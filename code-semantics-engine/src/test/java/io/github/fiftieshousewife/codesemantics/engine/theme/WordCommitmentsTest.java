package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordCommitmentsTest {

    private static final Map<String, List<TopicVote>> VOTES = Map.of(
            "word", List.of(vote("linguistics", 0.8), vote("computing", 0.4)),
            "parser", List.of(vote("computing", 0.6)),
            "net", List.of(vote("fishing", 0.5), vote("computing", 0.5)));

    private static TopicVote vote(final String topic, final double mass) {
        return new TopicVote(topic, mass, EvidenceSource.WORDNET_DOMAIN);
    }

    private static WordCommitments of(final String... words) {
        return new WordCommitments(List.of(words), word -> VOTES.getOrDefault(word, List.of()),
                new TopicCommitment());
    }

    @Test
    void namesEveryVotedTopicInAlphabeticalOrder() {
        assertThat(of("word", "net", "parser").topics())
                .containsExactly("computing", "fishing", "linguistics");
    }

    @Test
    void namesTheAgreeingWordsInTheOrderTheyWereWritten() {
        assertAll(
                () -> assertThat(of("net", "word", "parser").agreeing("computing"))
                        .containsExactly("net", "word", "parser"),
                () -> assertThat(of("parser", "net", "word").agreeing("computing"))
                        .containsExactly("parser", "net", "word"),
                () -> assertThat(of("word", "parser").agreeing("fishing")).isEmpty());
    }

    @Test
    void countsADistinctWordOnceHoweverOftenThePhraseRepeatsIt() {
        assertAll(
                () -> assertThat(of("word", "word", "parser").words()).isEqualTo(2),
                () -> assertThat(of("word", "word").agreeing("computing")).containsExactly("word"));
    }
}
