package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;

/**
 * How far two independent corpora of the same size disagree — the sampling error of a reference, measured
 * without reference to a truth nobody has.
 *
 * <p>{@link CorpusPlateau} measures each prefix against the whole draw, and the whole draw is itself one
 * sample, so that curve is bound to reach zero at its last row whether or not it has converged. This takes
 * two disjoint subsets of the same size from the same draw and measures the divergence between the two
 * references they produce. Nothing is compared against a target, so nothing is guaranteed to fall.
 *
 * <p><b>The disagreement is reported in two parts, because only one of them is a defect.</b> The divergence
 * decomposes per word, so the words one side carries and the other has never seen can be summed apart from
 * the words both carry. A word only one corpus holds is the tail, and a reference is not consulted about the
 * tail: a word absent from a reference has a share of zero there whichever corpus was drawn. What decides a
 * reading is the vocabulary both would have carried, and that part converges on its own terms.
 */
public final class SamplingError {

    /** Enough pairs that the mean disagreement at a size is steady. */
    public static final int PAIRS = 99;

    /**
     * Two independent corpora of this size, and how far apart the references they produce sit.
     *
     * @param bits       the whole disagreement
     * @param fromApart  the part of it contributed by words only one of the two carries
     */
    public record AtSize(int repositories, int pairs, double bits, double fromApart) {

        /** The part both corpora had an opinion about, which is the part a reading is decided on. */
        public double fromShared() {
            return bits - fromApart;
        }
    }

    private final ShareDivergence divergence;
    private final int pairs;
    private final long seed;

    public SamplingError(final ShareDivergence divergence, final int pairs, final long seed) {
        this.divergence = divergence;
        this.pairs = pairs;
        this.seed = seed;
    }

    public static SamplingError seeded(final long seed) {
        return new SamplingError(new ShareDivergence(), PAIRS, seed);
    }

    /**
     * The curve, from one repository a side up to as many as two disjoint subsets of the draw allow.
     *
     * <p>Halving the draw is what bounds it: thirty repositories split into two fifteens and no larger pair,
     * so a thirty-member draw measures its own error only up to fifteen a side.
     */
    public List<AtSize> over(final List<CountedRepository> drawn, final CorpusPooling pooling) {
        return IntStream.rangeClosed(1, drawn.size() / 2)
                .mapToObj(size -> atSize(drawn, size, pooling))
                .toList();
    }

    private AtSize atSize(final List<CountedRepository> drawn, final int size, final CorpusPooling pooling) {
        final Random shuffles = new Random(seed);
        final List<AtSize> measured = IntStream.range(0, pairs)
                .mapToObj(pair -> disagreement(shuffled(drawn, shuffles), size, pooling))
                .toList();
        return new AtSize(size, pairs,
                measured.stream().mapToDouble(AtSize::bits).average().orElseThrow(),
                measured.stream().mapToDouble(AtSize::fromApart).average().orElseThrow());
    }

    private AtSize disagreement(final List<CountedRepository> order, final int size,
                                final CorpusPooling pooling) {
        final Map<String, Double> left = pooling.shareByWord(PooledWords.pooling(order.subList(0, size)));
        final Map<String, Double> right =
                pooling.shareByWord(PooledWords.pooling(order.subList(size, size + size)));
        final double apart = divergence.support(left, right).stream()
                .filter(word -> !left.containsKey(word) || !right.containsKey(word))
                .mapToDouble(word -> divergence.at(word, left, right))
                .sum();
        return new AtSize(size, 1, divergence.between(left, right), apart);
    }

    private static List<CountedRepository> shuffled(final List<CountedRepository> drawn,
                                                    final Random shuffles) {
        final List<CountedRepository> order = new ArrayList<>(drawn);
        Collections.shuffle(order, shuffles);
        return order;
    }
}
