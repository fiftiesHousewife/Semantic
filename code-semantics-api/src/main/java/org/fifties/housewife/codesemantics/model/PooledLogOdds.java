package org.fifties.housewife.codesemantics.model;

import java.util.stream.DoubleStream;

/**
 * The one arithmetic that carries pooled evidence onto a bounded score. Signed log-odds votes {@link #pool}
 * by summation — the maximum-entropy / Fellegi–Sunter combination form, where a positive weight argues for
 * and a negative weight argues against — and a pool {@link #squash(double, double) squashes} through the
 * signed folded logistic, {@code 2·logistic(logOdds / scale) − 1}, anchored so that no evidence reads zero
 * rather than the logistic midpoint: evidence for grades the score into {@code (0, 1)}, evidence against
 * grades it into {@code (−1, 0)}, and the ordering the pool carries survives the squash everywhere.
 *
 * <p>A closed axis — where a blob's content came from, say — reads {@link #support(double)}, the unit scale
 * floored at zero, because an axis confidence answers only how strongly the evidence argues <em>for</em> a
 * value, the rival categories carrying whatever argues against. A reading over an open value space squashes
 * at a scale that is a declared tuning weight instead. The two do not share a vote type, because they make
 * opposite structural commitments: axis votes back rival categories and may not co-fire, whereas the
 * citations for one concept co-operate on a single value and always do.
 */
public final class PooledLogOdds {

    /** The pooled signed log-odds of a set of weighted votes: evidence for minus evidence against. */
    public static double pool(final DoubleStream weights) {
        return weights.sum();
    }

    /**
     * The axes' support reading: the unit-scale squash floored at zero, in {@code [0, 1)}. A confidence
     * that a value holds has no meaning below nothing-known, so a pool arguing against reads as no support
     * — the floor is the axis calibration's own choice, not the shared arithmetic's.
     */
    public static double support(final double logOdds) {
        return Math.max(0.0, squash(logOdds, 1.0));
    }

    /**
     * How the pooled evidence argues for its value, in {@code (−1, 1)}: the logistic of the pooled
     * log-odds, rescaled so the do-nothing baseline reads zero rather than a half. Evidence against grades
     * the score below zero by the same slope evidence for grades it above, so two pools are ordered by the
     * squash exactly as the evidence orders them. The {@code scale} is the number of pooled log-odds units
     * that map to one squash unit — the calibration that keeps a measured evidence range on the logistic's
     * discriminating slope instead of its saturated tail.
     */
    public static double squash(final double logOdds, final double scale) {
        return 2.0 / (1.0 + Math.exp(-logOdds / scale)) - 1.0;
    }

    /**
     * The pooled log-odds that squash to the given score at the given scale — the inverse of
     * {@link #squash}, so a target expressed on the score scale can be rendered back into the pool as a
     * vote of exactly the difference.
     */
    public static double unsquash(final double score, final double scale) {
        return scale * Math.log((1.0 + score) / (1.0 - score));
    }

    private PooledLogOdds() {
    }
}
