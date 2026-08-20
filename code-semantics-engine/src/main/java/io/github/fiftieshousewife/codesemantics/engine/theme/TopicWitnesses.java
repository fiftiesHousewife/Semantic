package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

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

    /**
     * One word's share of a topic, which is what the witness column is ordered by and therefore what it has
     * to print.
     *
     * <p>Occurrences alone cannot explain the order. {@code file} is written into {@code law} far more often
     * than {@code claim} and carries far less of it, so a column showing counts beside a mass ordering asks
     * a reader to take the sequence on trust. The share is a share of the topic's own total, so it bounds
     * itself at 1 and the printed figures sum to 1 across every carrying word.
     */
    public record CarriedTopic(String word, int occurrences, double share) {
    }

    /** The words that carried a topic with the share of it each carried, largest share first. */
    public List<CarriedTopic> carrying(final String topic, final int limit) {
        final double total = witnessesByTopic.getOrDefault(topic, Map.of()).values().stream()
                .mapToDouble(Witness::mass).sum();
        if (total <= 0.0) {
            return List.of();
        }
        return forTopic(topic, limit).stream()
                .map(witness -> new CarriedTopic(witness.word(), witness.occurrences(),
                        witness.mass() / total))
                .toList();
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

    /**
     * Whether one word carries a majority of a topic's mass, which makes the topic that word's opinion
     * rather than a reading. {@code jewellery} rests entirely on {@code string} and a reader shown the
     * witnesses rejects it at a glance; this is the same rejection, available to a report that has to decide
     * what to print before a reader sees it.
     *
     * <p>A majority is the bound, and it follows from what carrying a topic means rather than from tuning: a
     * word holding more than half of a topic outvotes every other word that read it put together. A topic
     * nothing was recorded for rests on no words at all, which cannot be shown to be more than one.
     */
    public boolean restsOnOneWord(final String topic) {
        final Map<String, Double> mass = massByWord(topic);
        final double total = mass.values().stream().mapToDouble(Double::doubleValue).sum();
        return total <= 0.0
                || mass.values().stream().mapToDouble(Double::doubleValue).max().orElse(0.0) > total / 2.0;
    }

    /**
     * Whether only one bundled resource ever named this topic, however many words carried it.
     *
     * <p>Two resources reading the same subject out of a repository corroborate each other; one resource
     * saying it a hundred times does not, and the hundred is what a ranking rewards. Every resource here has
     * its own blind spot — WordNet Domains omits the domain-less sense of a word by construction, so the
     * everyday reading is the one it never labels — and a topic no other resource ever reached is a topic
     * resting entirely inside one blind spot. {@code military} arrives on {@code file} and
     * {@code repository} from a headword vocabulary alone, because a file is a rank formation and a
     * repository is an arsenal, and no sense-labelled entry anywhere agrees.
     *
     * <p>It is a fact about the evidence rather than a judgement about the subject, and it needs no list:
     * the sources are recorded on every witness as it is admitted.
     */
    public boolean namedByOneResource(final String topic) {
        return witnessesByTopic.getOrDefault(topic, Map.of()).values().stream()
                .flatMap(witness -> witness.sources().stream())
                .distinct()
                .count() <= 1;
    }

    /**
     * How much each word carried in total, over every topic it witnessed.
     *
     * <p>It is not the number of times the word was seen and the two disagree by design. A sighting is
     * counted once per occurrence; what an occurrence is <em>worth</em> is settled afterwards — prose
     * standing in a hundred files is worth a hundredth of a sighting each, and a word a rule removed from
     * its phrase is worth nothing at all. A reader shown only the count reads a licence header as the
     * repository's largest subject.
     */
    public Map<String, Double> carriedByWord() {
        return witnessesByTopic.values().stream()
                .flatMap(byWord -> byWord.values().stream())
                .collect(Collectors.groupingBy(Witness::word,
                        Collectors.summingDouble(Witness::mass)));
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
