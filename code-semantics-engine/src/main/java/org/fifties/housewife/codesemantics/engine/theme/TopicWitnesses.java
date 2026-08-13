package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * Why a topic was read at all: the words that committed mass to it, how often each was written, where one of
 * them can be seen, and which resource made the claim.
 *
 * <p>This is the part of the reading that makes it arguable. A ranked list of topics with no witnesses is an
 * assertion; the same list with the words behind it lets a reader see that {@code jewellery} rests entirely
 * on the word {@code string}, and reject it. The library's own doctrine says a citation outranks an
 * assertion, and a citation nobody can look up is an assertion in a citation's clothing.
 */
public final class TopicWitnesses {

    /**
     * The phrase a word was read in, and where that phrase was written.
     *
     * <p>The unit of the reading is the phrase and never the word: <em>cite</em> alone is law, linguistics
     * and publishing, and <em>citationSource</em> is what settled it. So the evidence a reader is shown has
     * to be the phrase too — a witness quoting only its own word shows the one thing that was never enough
     * to decide anything.
     */
    public record Quotation(String phrase, String site) {
    }

    /**
     * One word's testimony for a topic: what it was, how often, how much of the topic's mass it actually
     * carried, the phrases it was read in, and which resource said so.
     *
     * <p>Occurrences and mass are both kept because they disagree, and the disagreement is the point. A
     * function word occurring five hundred times carries almost no mass, because the frequency list says it
     * narrows nothing; a rare word occurring twice can carry more. Ordering witnesses by mass is what makes
     * the column an explanation rather than a word count.
     */
    public record Witness(String word, int occurrences, double mass, List<Quotation> quotations,
                          Set<EvidenceSource> sources) {

        public Witness {
            quotations = List.copyOf(quotations);
            sources = Set.copyOf(sources);
        }

        /** One place to start looking; the rest are there for a reader who wants to check a pattern. */
        public String site() {
            return quotations.isEmpty() ? "" : quotations.getFirst().site();
        }
    }

    private final Map<String, Map<String, Witness>> witnessesByTopic = new HashMap<>();

    /** Records that a word, read in a phrase at a site, committed mass to a topic on a resource's say-so. */
    public void record(final String topic, final String word, final String phrase, final String site,
                       final EvidenceSource source, final double mass) {
        witnessesByTopic.computeIfAbsent(topic, key -> new HashMap<>())
                .merge(word, new Witness(word, 1, mass, List.of(new Quotation(phrase, site)),
                        Set.of(source)), TopicWitnesses::merged);
    }

    /** The words that carried a topic, the ones carrying most of it first. */
    public List<Witness> forTopic(final String topic, final int limit) {
        return witnessesByTopic.getOrDefault(topic, Map.of()).values().stream()
                .sorted(Comparator.comparingDouble(Witness::mass).reversed()
                        .thenComparing(Witness::word))
                .limit(limit)
                .toList();
    }

    /** How many distinct words carried a topic — one word carrying a whole topic is a finding in itself. */
    public int wordsBehind(final String topic) {
        return witnessesByTopic.getOrDefault(topic, Map.of()).size();
    }

    /** How often each word carried the topic, by word — what two topics have in common is read from this. */
    public Map<String, Integer> occurrencesByWord(final String topic) {
        return witnessesByTopic.getOrDefault(topic, Map.of()).values().stream()
                .collect(Collectors.toUnmodifiableMap(Witness::word, Witness::occurrences));
    }

    /** How much mass each word carried into the topic — what the witnesses are ordered by. */
    public Map<String, Double> massByWord(final String topic) {
        return witnessesByTopic.getOrDefault(topic, Map.of()).values().stream()
                .collect(Collectors.toUnmodifiableMap(Witness::word, Witness::mass));
    }

    /**
     * Quotations accumulate to a handful: enough to check a pattern, not so many that the evidence is a log.
     * They are kept distinct by phrase and site together, so the same word read in two different phrases is
     * two quotations — which is the case a reader most wants to see.
     */
    private static final int QUOTATIONS_KEPT = 4;

    private static Witness merged(final Witness kept, final Witness offered) {
        final Set<EvidenceSource> sources = new LinkedHashSet<>(kept.sources());
        sources.addAll(offered.sources());
        final LinkedHashSet<Quotation> quotations = new LinkedHashSet<>(kept.quotations());
        quotations.addAll(offered.quotations());
        return new Witness(kept.word(), kept.occurrences() + offered.occurrences(),
                kept.mass() + offered.mass(),
                quotations.stream().limit(QUOTATIONS_KEPT).toList(), sources);
    }
}
