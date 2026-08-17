package io.github.fiftieshousewife.bi.lexicon.extraction;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Reads the topic vocabulary out of one wiktextract JSONL entry: the headword with the union of topic
 * labels its senses carry. An entry whose senses carry no topics contributes nothing — the vocabulary
 * is what the dictionary assigns to a domain, never every word it knows.
 */
public class TopicVocabulary {

    private final WiktionaryJson json = new WiktionaryJson();

    public Optional<TopicEntry> fromEntryJson(final String line) {
        final JsonNode entry = json.entryOf(line);
        if (!WiktionaryJson.english(entry)) {
            return Optional.empty();
        }
        final String word = wordOf(entry.path("word").asText());
        if (word.isEmpty()) {
            return Optional.empty();
        }
        final Set<String> topics = WiktionaryJson.nodes(entry.path("senses"))
                .flatMap(sense -> WiktionaryJson.nodes(sense.path("topics")))
                .map(JsonNode::asText)
                .collect(Collectors.toUnmodifiableSet());
        return topics.isEmpty() ? Optional.empty() : Optional.of(new TopicEntry(word, topics));
    }

    private static String wordOf(final String word) {
        final String canonical = word.trim().toLowerCase(Locale.ROOT).replaceAll("\\s+", "_");
        return canonical.length() < 2 ? "" : canonical;
    }
}
