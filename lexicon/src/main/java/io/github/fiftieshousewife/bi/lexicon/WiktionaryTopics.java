package io.github.fiftieshousewife.bi.lexicon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The bundled Wiktionary topic vocabulary: which topical domains claim a word, and which words a
 * domain claims — including the multi-word collocations WordNet Domains lacks (break_point,
 * unforced_error). Membership is a vote's evidence, never a decision; an unknown word carries no
 * topics, never a guess.
 */
public final class WiktionaryTopics {

    private static final String RESOURCE = "wiktionary-topics.tsv";
    private static final char COLLOCATION_JOINER = '_';

    private final Map<String, Set<String>> topicsByWord;
    private final Map<String, Set<String>> wordsByTopic;

    private WiktionaryTopics(final Map<String, Set<String>> topicsByWord,
                             final Map<String, Set<String>> wordsByTopic) {
        this.topicsByWord = topicsByWord;
        this.wordsByTopic = wordsByTopic;
    }

    public static WiktionaryTopics fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public Set<String> topicsOf(final String word) {
        return topicsByWord.getOrDefault(word.toLowerCase(Locale.ROOT), Set.of());
    }

    public Set<String> wordsOf(final String topic) {
        return wordsByTopic.getOrDefault(topic.toLowerCase(Locale.ROOT), Set.of());
    }

    /**
     * Every entry written in more than one word, in the resource's own written form ({@code break_point}).
     * It is what a reading needs to know that a run of adjacent words is something this dictionary has an
     * opinion about, rather than two words that happened to be written next to each other.
     */
    public Set<String> collocations() {
        return topicsByWord.keySet().stream()
                .filter(word -> word.indexOf(COLLOCATION_JOINER) >= 0)
                .collect(Collectors.toUnmodifiableSet());
    }

    private static WiktionaryTopics load() {
        final Map<String, Set<String>> topicsByWord = new HashMap<>();
        final Map<String, Set<String>> wordsByTopic = new HashMap<>();
        final Map<String, String> canonicalTopics = new HashMap<>();
        BundledLines.of(RESOURCE).forEach(line -> index(line, topicsByWord, wordsByTopic, canonicalTopics));
        return new WiktionaryTopics(freeze(topicsByWord), freeze(wordsByTopic));
    }

    private static void index(final String line, final Map<String, Set<String>> topicsByWord,
                              final Map<String, Set<String>> wordsByTopic,
                              final Map<String, String> canonicalTopics) {
        final String[] fields = line.split("\t", -1);
        final String word = fields[0];
        Arrays.stream(fields[1].split(",", -1))
                .filter(topic -> !topic.isBlank())
                .map(topic -> canonicalTopics.computeIfAbsent(topic.toLowerCase(Locale.ROOT), same -> same))
                .forEach(topic -> {
                    topicsByWord.computeIfAbsent(word, key -> new HashSet<>()).add(topic);
                    wordsByTopic.computeIfAbsent(topic, key -> new HashSet<>()).add(word);
                });
    }

    private static Map<String, Set<String>> freeze(final Map<String, Set<String>> index) {
        return index.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        entry -> Set.copyOf(entry.getValue())));
    }

    private static final WiktionaryTopics CLASSPATH_DEFAULTS = load();
}
