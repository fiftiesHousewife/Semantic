package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

/** The commitment each distinct word of a phrase made to each topic, in the order the words were written. */
final class WordCommitments {

    private final Map<String, Map<String, Double>> byWord;

    WordCommitments(final List<String> words, final Function<String, List<TopicVote>> cite,
                    final TopicCommitment commitment) {
        this.byWord = words.stream().distinct()
                .collect(Collectors.toMap(word -> word, word -> commitment.of(cite.apply(word)),
                        (first, again) -> first, LinkedHashMap::new));
    }

    /** Every topic a word of the phrase voted for, in their own alphabetical order. */
    Set<String> topics() {
        return byWord.values().stream()
                .flatMap(topics -> topics.keySet().stream())
                .collect(Collectors.toCollection(TreeSet::new));
    }

    /** The words agreeing on the topic, in the order they were written. */
    Set<String> agreeing(final String topic) {
        return byWord.keySet().stream()
                .filter(word -> byWord.get(word).containsKey(topic))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /** The geometric mean of what the agreeing words committed, each weighted by what it is worth. */
    double agreed(final Set<String> agreeing, final String topic, final Map<String, Double> weightByWord) {
        return Math.exp(agreeing.stream()
                .mapToDouble(word -> Math.log(byWord.get(word).get(topic)
                        * weightByWord.getOrDefault(word, 1.0)))
                .average()
                .orElse(Double.NEGATIVE_INFINITY));
    }

    /** How many distinct words the phrase has. */
    int words() {
        return byWord.size();
    }
}
