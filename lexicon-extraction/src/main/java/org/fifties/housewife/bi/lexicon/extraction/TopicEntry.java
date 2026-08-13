package org.fifties.housewife.bi.lexicon.extraction;

import java.util.Set;

/**
 * One headword and the union of topic labels across its senses — the dictionary saying which domains
 * claim the word as vocabulary. Multi-word phrases carry underscores, the written form the bundled
 * WordNet resources already use.
 */
public record TopicEntry(String word, Set<String> topics) {

    public TopicEntry {
        topics = Set.copyOf(topics);
    }
}
