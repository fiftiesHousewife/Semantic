package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * One phrase's reading: the subjects it is about, which words agreed, how much was spoken for, and the
 * subjects its words voted for that a rule then removed.
 *
 * <p>{@code refused} is the half a reader cannot reconstruct from the rest. A topic absent from
 * {@code shareByTopic} was either never voted for or was voted for and taken out, and only the reading
 * itself knows which.
 */
public record PhraseReading(Map<String, Double> shareByTopic, Map<String, Set<String>> agreementByTopic,
                            double credence, List<RefusedTopic> refused) {

    static final PhraseReading NOTHING = new PhraseReading(Map.of(), Map.of(), 0.0, List.of());

    /** The reading with its shares normalised to sum to one, so a phrase commits one unit however long it is. */
    static PhraseReading normalised(final Map<String, Double> scores,
                                    final Map<String, Set<String>> agreement, final double credence,
                                    final List<RefusedTopic> refused) {
        final double total = scores.values().stream().mapToDouble(Double::doubleValue).sum();
        return new PhraseReading(scores.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, score -> score.getValue() / total,
                        (first, again) -> first, TreeMap::new)), agreement, credence, refused);
    }

    public PhraseReading {
        shareByTopic = Collections.unmodifiableSortedMap(new TreeMap<>(shareByTopic));
        agreementByTopic = Collections.unmodifiableSortedMap(new TreeMap<>(agreementByTopic));
        refused = List.copyOf(refused);
    }

    public boolean isEmpty() {
        return shareByTopic.isEmpty();
    }

    /**
     * How much of a single subject the phrase settled on, in {@code (0, 1]} — Simpson's index over its
     * own shares. A phrase whose words agree on one thing is worth a whole unit; one that could not
     * decide between four is worth a quarter, and says so by committing less rather than by committing
     * the same amount more vaguely. It is the same rule a single word obeys, applied where the reading
     * now actually happens.
     */
    public double coherence() {
        return shareByTopic.values().stream().mapToDouble(share -> share * share).sum();
    }
}
