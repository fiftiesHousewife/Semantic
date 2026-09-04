package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * A published source with its own words dealt across its own terms, each term keeping the number of words it
 * is written in.
 *
 * <p>It is what a source's phrase matches are judged against when the question is whether the source's
 * <em>subject matter</em> reached the repository. A deal keeps everything about the publication that is not
 * its subject — how many terms it states, how long each is, and its whole list of words — and destroys only
 * which of its words it published beside which. What a deal still finds, the source's word list finds; what
 * only the source itself finds is the orders it published.
 *
 * <p>Each dealt run carries the concepts of the term whose place it took, so two dealt runs reading alike
 * hold both, exactly as two terms a publisher spells alike do.
 *
 * <p>It is keyed by the words themselves and answers at that normalisation only. Both nulls here are drawn there, for
 * the reason {@link MatchedPhrases} states.
 */
public final class ScrambledTerms implements TermIndex {

    /**
     * The order the pool is laid out in before it is shuffled.
     *
     * <p>A shuffle is deterministic in its seed and in the order it is handed, and a {@link TermIndex} owes
     * no order at all — {@link SpecificTerms} answers with a {@code Set.copyOf}, whose iteration order the
     * platform salts once per JVM. Dealing from that would make the bar a different number on every run of
     * the same tree, which is what a chance bar cannot be. Sorting by the term's own words is a stated order
     * and costs one sort of a list already in memory.
     */
    private static final Comparator<Spelled> BY_ITS_OWN_WORDS = Comparator.comparing(Spelled::spelling);

    /**
     * A term beside the spelling its own words give it.
     *
     * <p>{@link Comparator#comparing} keeps no key, so spelling the term inside the comparator spells it
     * again on every comparison — of the order of {@code 2 n log n} times for a vocabulary of n terms, on
     * every one of the null's deals. Spelling it once per term and sorting on that is the same order.
     */
    private record Spelled(String spelling, List<String> term) {
    }

    private final TermIndex published;

    private final Map<List<String>, List<SkosConcept>> dealt;

    private ScrambledTerms(final TermIndex published, final Map<List<String>, List<SkosConcept>> dealt) {
        this.published = published;
        this.dealt = Map.copyOf(dealt);
    }

    public static ScrambledTerms of(final TermIndex published, final Random draws) {
        final List<List<String>> terms = published.terms().stream()
                .map(term -> new Spelled(String.join(" ", term), term))
                .sorted(BY_ITS_OWN_WORDS)
                .map(Spelled::term)
                .toList();
        final String[] pool = terms.stream().flatMap(List::stream).toArray(String[]::new);
        permuted(pool, draws);
        return new ScrambledTerms(published, dealt(published, terms, pool));
    }

    private static Map<List<String>, List<SkosConcept>> dealt(final TermIndex published,
                                                              final List<List<String>> terms,
                                                              final String[] pool) {
        final int[] starts = new int[terms.size()];
        IntStream.range(1, terms.size())
                .forEach(term -> starts[term] = starts[term - 1] + terms.get(term - 1).size());
        final Map<List<String>, List<SkosConcept>> dealt = new HashMap<>();
        IntStream.range(0, terms.size()).forEach(term ->
                dealt.computeIfAbsent(
                                List.of(Arrays.copyOfRange(pool, starts[term],
                                        starts[term] + terms.get(term).size())),
                                run -> new ArrayList<>())
                        .addAll(published.conceptsOf(terms.get(term))));
        return dealt;
    }

    /** A Fisher–Yates shuffle of the whole pool, which is what makes every deal an equally likely one. */
    private static void permuted(final String[] pool, final Random draws) {
        IntStream.range(0, Math.max(0, pool.length - 1)).forEach(at -> {
            final int with = at + draws.nextInt(pool.length - at);
            final String held = pool[at];
            pool[at] = pool[with];
            pool[with] = held;
        });
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return dealt.getOrDefault(words, List.of());
    }

    @Override
    public Set<List<String>> terms() {
        return dealt.keySet();
    }

    @Override
    public int longestTerm() {
        return published.longestTerm();
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return published.broaderOf(prefLabel);
    }

    @Override
    public String source() {
        return published.source();
    }

    @Override
    public MatchNormalisation normalisation() {
        return published.normalisation();
    }
}
