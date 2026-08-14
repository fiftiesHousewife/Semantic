package org.fifties.housewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.parse.NameForm;
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
 * <p>The reading also carries its {@link Reading#credence()}: how much of its carrying words the resources
 * spoke for at all. A phrase resting on words whose everyday senses were never labelled is a confident
 * reading of very little, and the amount it commits says so where its shares cannot.
 *
 * <p>The shares are normalised, so <b>a phrase commits one unit however long it is</b>. A twenty-word javadoc
 * sentence and a two-word field name are one observation each, which is the same choice the plan makes at
 * blob level and for the same reason: without it, the reading measures how much was written rather than what
 * was said.
 */
public final class PhraseTopics {

    private final TopicCitations citations;
    private final TopicCommitment commitment;
    private final SenseCoverage coverage;

    public PhraseTopics(final TopicCitations citations, final TopicCommitment commitment,
                        final SenseCoverage coverage) {
        this.citations = citations;
        this.commitment = commitment;
        this.coverage = coverage;
    }

    /** One phrase's reading: the subjects it is about, which words agreed, and how much was spoken for. */
    public record Reading(Map<String, Double> shareByTopic, Map<String, Set<String>> agreementByTopic,
                          double credence) {

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

    private static final Reading NOTHING = new Reading(Map.of(), Map.of(), 0.0);

    /**
     * What the phrase is about, as a distribution summing to one over the subjects its words agree on.
     *
     * @param words        the phrase's words, already offered in their dictionary form
     * @param weightByWord what each word is worth on its own — how much it narrows a subject at all
     */
    public Reading of(final List<String> words, final Map<String, Double> weightByWord) {
        return of(words, weightByWord, citations::of);
    }

    /**
     * What the phrase is about, with the words the grammar says are verbs read as verbs.
     *
     * @param form where the phrase was written, which is what says how each of its words is being used
     */
    public Reading of(final List<String> words, final Map<String, Double> weightByWord,
                      final NameForm form) {
        return of(words, weightByWord, reading(form, words));
    }

    /**
     * How each word of a phrase in this position is to be read. An identifier is a noun phrase, so its words
     * are nouns; a method name is a clause, so its first word is what the method does; a sentence is neither,
     * so the corpus's own counts decide. It is grammar read off the parse, which is what makes it permitted
     * where a list of words would not be.
     */
    private java.util.function.Function<String, List<TopicVote>> reading(final NameForm form,
                                                                        final List<String> words) {
        if (form.isProse()) {
            return citations::inProse;
        }
        final Set<String> verbs = form == NameForm.METHOD ? Set.of(words.getFirst()) : Set.of();
        return word -> verbs.contains(word) ? citations.ofVerb(word) : citations.of(word);
    }

    private Reading of(final List<String> words, final Map<String, Double> weightByWord,
                       final java.util.function.Function<String, List<TopicVote>> cite) {
        if (words.isEmpty()) {
            return NOTHING;
        }
        final Map<String, Map<String, Double>> commitments = words.stream().distinct()
                .collect(Collectors.toUnmodifiableMap(word -> word,
                        word -> commitment.of(cite.apply(word))));
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
        return scores.isEmpty() ? NOTHING
                : new Reading(normalised(scores), agreement, credenceOf(agreement.values().stream()
                        .flatMap(Set::stream).collect(Collectors.toUnmodifiableSet())));
    }

    /**
     * How much of the phrase's carrying words the resources actually spoke for — the geometric mean of their
     * sense coverage. It scales what the phrase commits without touching what it is about, because a label
     * on one sense of six is a weak claim about the word and no claim at all about which subject is right.
     */
    private double credenceOf(final Set<String> carrying) {
        return carrying.isEmpty() ? 0.0 : Math.exp(carrying.stream()
                .mapToDouble(word -> Math.log(coverage.of(word)))
                .average()
                .orElse(0.0));
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
