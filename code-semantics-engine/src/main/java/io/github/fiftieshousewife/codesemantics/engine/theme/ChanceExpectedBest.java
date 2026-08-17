package io.github.fiftieshousewife.codesemantics.engine.theme;

/**
 * Where the best of a field of competitors sits among a sorted field of chance draws.
 *
 * <p>Something is always the winner, so the winner is not a finding. A field of {@code n} competitors gets
 * {@code n} attempts at looking remarkable, and the best of {@code n} draws sits at the {@code 1/(n+1)}
 * quantile of their distribution — so that quantile, and not the median, is what a real winner has to beat.
 * A result that beats a single average draw has shown nothing at all: with enough competitors, one of them
 * was always going to look good.
 *
 * <p><b>The bound follows from the size of the field and is never chosen.</b> That is the whole reason this
 * is one class rather than a rule each null states for itself: two nulls that disagree about how strict to be
 * are two different claims wearing one word, and this library had exactly that defect — a placement judged
 * against the best of 152 chance attempts beside a divergence judged against a coin flip.
 *
 * <p>Which tail is the good one belongs to the statistic. A divergence is a distance, so a subject is nearer
 * when it is <em>smaller</em> and a scope departs from its reference when it is <em>larger</em>; both read the
 * same quantile from opposite ends.
 */
public final class ChanceExpectedBest {

    private ChanceExpectedBest() {
    }

    /** The rank the nearest of a field of this size would reach, for a statistic where smaller is nearer. */
    public static int nearestIn(final int field, final int drawn) {
        return Math.min(drawn - 1, quantile(field, drawn));
    }

    /** The rank the furthest of a field of this size would reach, for a statistic where larger is further. */
    public static int furthestIn(final int field, final int drawn) {
        return Math.max(0, drawn - 1 - quantile(field, drawn));
    }

    private static int quantile(final int field, final int drawn) {
        return drawn / (field + 1);
    }
}
