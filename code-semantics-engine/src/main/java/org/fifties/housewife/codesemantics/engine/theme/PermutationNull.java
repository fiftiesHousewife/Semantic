package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * What divergence a scope of this size would show <em>by chance</em>. A scope of three files will diverge
 * from a repository of a hundred simply because three is a small sample, and a statistic that reports that
 * as a finding is measuring its own sample size.
 *
 * <p>So the observed divergence is judged against the chance-expected maximum of its own field rather than
 * against a fixed constant: draw {@code |S|} files uniformly without replacement from the reference, take
 * their intensity, measure its divergence, and repeat. A scope whose observed divergence does not exceed its
 * null has no topical content beyond its size, and the honest report says so instead of ranking its topics.
 *
 * <p><b>The bar is {@link ChanceExpectedBest}, not the median.</b> Every scope of a repository is tested, so
 * the scopes are a field competing to look remarkable and the bar has to follow from how many of them there
 * are — nine scopes get nine attempts, and a scope clearing only the middle of its own draws has cleared a
 * coin flip. This class read the median until that was measured: two of the nine scopes qualified at a rate
 * chance alone produced in more than a quarter of draws, and each then printed eight ranked topics.
 *
 * <p>The draw is seeded, so a report is reproducible and two runs of the same tree can be compared without
 * wondering whether the instrument moved.
 */
public final class PermutationNull {

    /** Enough draws that the rank of the observed value is readable to a thousandth. */
    public static final int RESAMPLES = 999;

    /** The observed divergence against the field of chance draws it must beat to mean anything. */
    public record Chance(double observed, double median, double excess, double chanceExpectedBest,
                         int atLeastAsExtreme, int resamples) {

        /**
         * Whether the observed divergence stands outside its own null — further than the furthest a field of
         * this many scopes would have drawn by chance. It is a quantile rather than a sigma count, because
         * the null is not assumed to be any particular shape, and it is the field's quantile rather than the
         * median because every scope was tested and one of them was always going to look furthest.
         */
        public boolean exceedsChance() {
            return observed > chanceExpectedBest;
        }

        /** How often chance alone produced a divergence this large, in the unit the draw count allows. */
        public double chanceRate() {
            return (double) (atLeastAsExtreme + 1) / (resamples + 1);
        }
    }

    private final JensenShannon divergence;
    private final int resamples;
    private final Random draws;

    public PermutationNull(final JensenShannon divergence, final int resamples, final Random draws) {
        this.divergence = divergence;
        this.resamples = resamples;
        this.draws = draws;
    }

    public static PermutationNull seeded(final long seed) {
        return new PermutationNull(new JensenShannon(), RESAMPLES, new Random(seed));
    }

    /**
     * The field of chance divergences a scope of this size draws from the reference, and where the observed
     * value sits in it.
     *
     * @param observed  the scope's own divergence from the reference
     * @param scopeSize how many files carried the scope's reading
     * @param scopes    how many scopes are being read, which is the field this one competes in
     * @param pool      every file distribution the reference is made of
     * @param reference the reference intensity itself
     */
    public Chance of(final double observed, final int scopeSize, final int scopes,
                     final List<TopicDistribution> pool, final TopicDistribution reference) {
        final List<Double> chanceDivergences = new ArrayList<>();
        for (int draw = 0; draw < resamples; draw++) {
            chanceDivergences.add(
                    divergence.divergence(TopicDistribution.meanOf(sample(pool, scopeSize)), reference));
        }
        Collections.sort(chanceDivergences);
        final int atLeastAsExtreme = (int) chanceDivergences.stream().filter(drawn -> drawn >= observed).count();
        final double median = chanceDivergences.get(chanceDivergences.size() / 2);
        final double best = chanceDivergences.get(
                ChanceExpectedBest.furthestIn(scopes, chanceDivergences.size()));
        return new Chance(observed, median, observed - median, best, atLeastAsExtreme, resamples);
    }

    private List<TopicDistribution> sample(final List<TopicDistribution> pool, final int size) {
        final List<TopicDistribution> shuffled = new ArrayList<>(pool);
        Collections.shuffle(shuffled, draws);
        return shuffled.subList(0, Math.min(size, shuffled.size()));
    }
}
