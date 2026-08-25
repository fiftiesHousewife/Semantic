package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.reference.PooledWordShares;

/**
 * How much declaring a word narrows a subject, read off the corpus of working Java this library bundles:
 * {@code get} narrows nothing, {@code notional} narrows fully.
 *
 * <p>It is {@link WordSpecificity} over the reference a declared name belongs to. The published English
 * frequency list ranks {@code get}, {@code id} and {@code buf} as rare, because prose is not where a
 * program's names are written, and a reading that weighed a declared name by that list would treat the
 * commonest words in Java as the most specific things a repository said. The corpus states the rate
 * repositories actually declare each one.
 *
 * <p>The scale is {@code log(rank + 1) / log(size + 1)}, bounded in {@code (0, 1]} by the corpus's own
 * length rather than by a chosen constant. The corpus distinguishes its own words plus the case of a word it
 * never declared, so there are {@code size + 1} ranks and the last of them is what a word absent from it
 * takes.
 *
 * <p><b>It is a weight and never a gate</b>, and the arithmetic downstream requires that literally.
 * {@link PhraseTopics} takes the geometric mean of what a phrase's words committed, each scaled by what it
 * is worth, so a weight of exactly zero sends one word's term to negative infinity and takes the whole
 * phrase's reading to nothing. The rank the corpus writes most densely is therefore the smallest weight the
 * corpus can express and not zero: {@code getTradeNotional} is still read as a trade and a notional.
 */
public final class CorpusSpecificity implements WordNarrowing {

    private final Map<String, Integer> rankByWord;
    private final double commonest;

    public CorpusSpecificity(final PooledWordShares corpus) {
        this.rankByWord = ranked(corpus.shareByWord());
        this.commonest = Math.log(rankByWord.size() + 1.0);
    }

    /** The corpus this library bundles. */
    public static CorpusSpecificity fromClasspath() {
        return new CorpusSpecificity(PooledWordShares.fromClasspath());
    }

    @Override
    public double of(final String word) {
        final int rank = rankByWord.getOrDefault(word, rankByWord.size() + 1);
        return Math.min(1.0, Math.log(rank + 1.0) / commonest);
    }

    /**
     * Rank 1 is the word the corpus declares most densely. Ties break on the spelling so that two words of
     * equal share rank the same way in every JVM: an iteration order salted per run would move a weight and
     * therefore a reading.
     */
    private static Map<String, Integer> ranked(final Map<String, Double> shareByWord) {
        final List<String> ordered = shareByWord.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(Map.Entry::getKey)
                .toList();
        return IntStream.range(0, ordered.size())
                .boxed()
                .collect(Collectors.toUnmodifiableMap(ordered::get, place -> place + 1));
    }
}
