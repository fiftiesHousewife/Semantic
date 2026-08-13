package org.fifties.housewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * What a <em>phrase</em> is about, read from its words together rather than one at a time.
 *
 * <p>A word alone is ambiguous and nothing can be done about that; a word among its siblings is much less so,
 * and the siblings are free. {@code cite} alone is law, linguistics, publishing and half a dozen more.
 * {@code citationSource} is cite beside source, and the only subject both of them name is the one the phrase
 * is actually about. This is the plan's own disambiguation — the sibling tokens of an identifier corroborate
 * a reading — applied to every phrase the parse produces: a declared name, a sentence of prose, a dependency
 * path.
 *
 * <p>Two factors decide a subject's score, and neither is a constant anyone chose:
 *
 * <ul>
 *   <li>the <b>geometric mean</b> of the commitment each agreeing word made to it, which is the log-linear
 *       pooling this library uses everywhere else — a subject two words are sure of outscores one they are
 *       both vague about;</li>
 *   <li>the <b>share of the phrase that agrees</b>, {@code k/n}. A subject one word in twenty names is one
 *       word's opinion in a sentence about something else, and scores a twentieth of what it would have
 *       scored alone.</li>
 * </ul>
 *
 * <p>The result is normalised, so <b>a phrase commits one unit however long it is</b>. A twenty-word javadoc
 * sentence and a two-word field name are one observation each, which is the same choice the plan makes at
 * blob level and for the same reason: without it, the reading measures how much was written rather than what
 * was said.
 */
public final class PhraseTopics {

    private final TopicCitations citations;
    private final TopicCommitment commitment;

    public PhraseTopics(final TopicCitations citations, final TopicCommitment commitment) {
        this.citations = citations;
        this.commitment = commitment;
    }

    /** One phrase's reading: the subjects it is about, and which of its words agreed on each. */
    public record Reading(Map<String, Double> shareByTopic, Map<String, Set<String>> agreementByTopic) {

        public Reading {
            shareByTopic = Map.copyOf(shareByTopic);
            agreementByTopic = Map.copyOf(agreementByTopic);
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

    private static final Reading NOTHING = new Reading(Map.of(), Map.of());

    /**
     * What the phrase is about, as a distribution summing to one over the subjects its words agree on.
     *
     * @param words        the phrase's words, already offered in their dictionary form
     * @param weightByWord what each word is worth on its own — how much it narrows a subject at all
     */
    public Reading of(final List<String> words, final Map<String, Double> weightByWord) {
        if (words.isEmpty()) {
            return NOTHING;
        }
        final Map<String, Map<String, Double>> commitments = words.stream().distinct()
                .collect(Collectors.toUnmodifiableMap(word -> word,
                        word -> commitment.of(citations.of(word))));
        final Map<String, Double> scores = new HashMap<>();
        final Map<String, Set<String>> agreement = new HashMap<>();
        topicsIn(commitments).forEach(topic -> {
            final Set<String> agreeing = words.stream().distinct()
                    .filter(word -> commitments.get(word).containsKey(topic))
                    .collect(Collectors.toUnmodifiableSet());
            final double score = agreed(agreeing, topic, commitments, weightByWord)
                    * agreeing.size() / words.stream().distinct().count();
            if (score > 0.0) {
                scores.put(topic, score);
                agreement.put(topic, agreeing);
            }
        });
        return scores.isEmpty() ? NOTHING : new Reading(normalised(scores), agreement);
    }

    /** The geometric mean of what the agreeing words committed, each weighted by what it is worth. */
    private static double agreed(final Set<String> agreeing, final String topic,
                                 final Map<String, Map<String, Double>> commitments,
                                 final Map<String, Double> weightByWord) {
        return Math.exp(agreeing.stream()
                .mapToDouble(word -> Math.log(commitments.get(word).get(topic)
                        * weightByWord.getOrDefault(word, 1.0)))
                .average()
                .orElse(Double.NEGATIVE_INFINITY));
    }

    private static Set<String> topicsIn(final Map<String, Map<String, Double>> commitments) {
        return commitments.values().stream()
                .flatMap(topics -> topics.keySet().stream())
                .collect(Collectors.toUnmodifiableSet());
    }

    private static Map<String, Double> normalised(final Map<String, Double> scores) {
        final double total = scores.values().stream().mapToDouble(Double::doubleValue).sum();
        return scores.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, score -> score.getValue() / total));
    }
}
