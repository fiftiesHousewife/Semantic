package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.DrawnVocabulary;

/**
 * Whether two drawn repositories are one corpus counted twice — derived from sampling noise, never from a
 * list of names.
 *
 * <p>The frame states {@code fork:false} because a fork is another repository's words copied and counting
 * them twice is a sampling defect. That qualifier reaches only GitHub's own forks, and an independent copy
 * of the same generated project is the same defect by another route. This is the test that reaches it, and
 * it is the same shape as {@link OccurrenceFloor}: measure how far the two sit from each other, then measure
 * how far two draws of exactly their sizes, taken from the distribution they would share <em>were</em> they
 * one corpus, sit from each other. A pair nearer than chance has not been shown to be two repositories.
 *
 * <p>Its bound is the multinomial's, not a chosen margin, and it is symmetric in the pair.
 */
public final class NearDuplicates {

    /** Enough draws that the mean distance between two samples of given sizes is steady. */
    public static final int RESAMPLES = 99;

    /**
     * One pair, with {@code left} the repository the manifest drew first.
     *
     * @param between how far the two sit from each other, in bits
     * @param chance  how far two draws of their sizes from one corpus sit, in bits
     */
    public record Judged(String left, String right, int leftOccurrences, int rightOccurrences,
                         double between, double chance) {

        /** Whether they are nearer than two samples of one corpus would be. */
        public boolean isOneCorpus() {
            return between < chance;
        }
    }

    private final ShareDivergence divergence;
    private final int resamples;
    private final long seed;

    public NearDuplicates(final ShareDivergence divergence, final int resamples, final long seed) {
        this.divergence = divergence;
        this.resamples = resamples;
        this.seed = seed;
    }

    public static NearDuplicates seeded(final long seed) {
        return new NearDuplicates(new ShareDivergence(), RESAMPLES, seed);
    }

    /** Every pair of the draw judged once, nearest first. */
    public List<Judged> over(final List<CountedRepository> drawn) {
        return pairs(drawn)
                .sorted(Comparator.comparingDouble(Judged::between))
                .toList();
    }

    /**
     * Of every pair that is one corpus, the member the manifest drew later — what a re-draw refuses, so that
     * the earlier rank keeps what it drew and the rejection consumes a rank rather than deleting a row.
     */
    public List<String> drawnTwice(final List<Judged> judged) {
        return judged.stream()
                .filter(Judged::isOneCorpus)
                .map(Judged::right)
                .distinct()
                .toList();
    }

    private Stream<Judged> pairs(final List<CountedRepository> drawn) {
        return IntStream.range(0, drawn.size())
                .boxed()
                .flatMap(left -> IntStream.range(left + 1, drawn.size())
                        .mapToObj(right -> judged(drawn.get(left), drawn.get(right))));
    }

    private Judged judged(final CountedRepository left, final CountedRepository right) {
        final int leftSize = left.declared().totalOccurrences();
        final int rightSize = right.declared().totalOccurrences();
        return new Judged(left.name(), right.name(), leftSize, rightSize,
                divergence.between(left.declared().shareByWord(), right.declared().shareByWord()),
                meanOfDrawnPairs(asOneCorpus(left, right), leftSize, rightSize));
    }

    /** The distribution the two would both be samples of, were they one corpus: their occurrences summed. */
    private static Map<String, Double> asOneCorpus(final CountedRepository left, final CountedRepository right) {
        final CorpusWords pooled = new CorpusWords();
        pooled.add(left.declared());
        pooled.add(right.declared());
        return CorpusPooling.POOLED_OCCURRENCES.shareByWord(pooled);
    }

    /** How far two draws of exactly these sizes, taken from that one corpus, land from each other. */
    private double meanOfDrawnPairs(final Map<String, Double> shared, final int leftSize, final int rightSize) {
        final DrawnVocabulary drawing = new DrawnVocabulary(shared);
        final Random draws = new Random(seed);
        return IntStream.range(0, resamples)
                .mapToDouble(resample ->
                        divergence.between(drawing.of(leftSize, draws), drawing.of(rightSize, draws)))
                .average()
                .orElseThrow();
    }
}
