package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordEvidenceTest {

    private static WordEvidence listing(final List<TopicVote> votes) {
        return new WordEvidence("token", 3, 1.0, true, "Example.java:1", 0.5, 0.5,
                votes, List.of(), List.of(), Map.of("grammar", 0.6, "computing", 0.4));
    }

    private static TopicVote vote(final String topic, final EvidenceSource source) {
        return new TopicVote(topic, 0.5, source);
    }

    @Test
    void namesAWordsSubjectsInTheirOwnOrderWhicheverOrderTheResourcesGaveThem() {
        final List<TopicVote> oneOrder = List.of(vote("music", EvidenceSource.WORDNET_DOMAIN),
                vote("grammar", EvidenceSource.WORDNET_DOMAIN),
                vote("computing", EvidenceSource.WIKTIONARY_TOPIC));
        final List<TopicVote> another = List.of(vote("computing", EvidenceSource.WIKTIONARY_TOPIC),
                vote("music", EvidenceSource.WORDNET_DOMAIN),
                vote("grammar", EvidenceSource.WORDNET_DOMAIN));

        assertAll(
                () -> assertThat(listing(oneOrder).asHeadWord()).extracting(TopicVote::topic)
                        .containsExactly("computing", "grammar", "music"),
                () -> assertThat(listing(another).asHeadWord())
                        .isEqualTo(listing(oneOrder).asHeadWord()));
    }

    @Test
    void namesAWordsSharesInTheirSubjectsOwnOrder() {
        assertThat(listing(List.of()).shareByTopic().keySet())
                .containsExactly("computing", "grammar");
    }
}
