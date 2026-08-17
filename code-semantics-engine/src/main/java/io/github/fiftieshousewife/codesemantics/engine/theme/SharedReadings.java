package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * What two topics have in common: the words that were read as both. This is the edge of the theme graph, and
 * it is a fact the resources stated rather than a statistic anything here invented — {@code jewellery} and
 * {@code music} are joined because the same occurrences of {@code string} committed mass to each.
 *
 * <p>An edge is therefore an explanation and not only a connection. A reader who wonders why a repository
 * about lexicons reads as jewellery can follow the edge to the word that did it, and a reading whose
 * strangest results explain themselves is one that can be argued with — which is the whole point of citing
 * evidence rather than reporting a score.
 */
public final class SharedReadings {

    /** Two topics, the words read as both, and how many occurrences of those words there were. */
    public record SharedReading(String topic, String other, List<String> words, int occurrences) {

        public SharedReading {
            words = List.copyOf(words);
        }
    }

    private static final int WORDS_NAMED = 6;

    /**
     * Every pair among the given topics that shares at least one word, heaviest first. Only the topics asked
     * about are paired, because the graph a reader can read is a small one and a complete graph over four
     * hundred labels is not a picture.
     */
    public List<SharedReading> among(final List<String> topics, final TopicWitnesses witnesses) {
        final Map<String, Map<String, Integer>> byTopic = topics.stream()
                .collect(Collectors.toUnmodifiableMap(topic -> topic, witnesses::occurrencesByWord));
        return IntStream.range(0, topics.size())
                .boxed()
                .flatMap(first -> IntStream.range(first + 1, topics.size())
                        .mapToObj(second -> shared(topics.get(first), topics.get(second), byTopic)))
                .filter(reading -> !reading.words().isEmpty())
                .sorted(Comparator.comparingInt(SharedReading::occurrences).reversed()
                        .thenComparing(SharedReading::topic).thenComparing(SharedReading::other))
                .toList();
    }

    private static SharedReading shared(final String topic, final String other,
                                        final Map<String, Map<String, Integer>> byTopic) {
        final Map<String, Integer> mine = byTopic.get(topic);
        final Set<String> both = mine.keySet().stream()
                .filter(byTopic.get(other)::containsKey)
                .collect(Collectors.toUnmodifiableSet());
        return new SharedReading(topic, other, heaviest(both, mine),
                both.stream().mapToInt(mine::get).sum());
    }

    private static List<String> heaviest(final Set<String> words, final Map<String, Integer> occurrences) {
        final Comparator<String> mostWrittenFirst =
                Comparator.<String>comparingInt(occurrences::get).reversed().thenComparing(Comparator.naturalOrder());
        return words.stream().sorted(mostWrittenFirst).limit(WORDS_NAMED).toList();
    }
}
