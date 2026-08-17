package io.github.fiftieshousewife.codesemantics.engine;

import java.util.Locale;

/**
 * A divergence in bits, written as the share of its own maximum it holds.
 *
 * <p>The Jensen–Shannon divergence is bounded at one bit under base-2 logarithms, so a figure in bits is
 * already a share of the largest figure the statistic can produce. Writing it as a percentage states that
 * bound instead of leaving a reader to know it: 0% is two distributions that are identical, 100% is two that
 * share no subject at all, and 34.1% is a third of the way between them.
 *
 * <p>Nothing is scaled and no maximum is chosen. The percentage is the same number the bits are.
 */
public final class DivergenceShare {

    /** What the statistic's own definition bounds it at, which is what the percentage is a share of. */
    private static final double MAXIMUM_BITS = 1.0;

    /** A divergence between two whole distributions — a scope against a repository, a repository against a
     * published subject. */
    public String of(final double bits) {
        return String.format(Locale.ROOT, "%.1f%%", 100.0 * bits / MAXIMUM_BITS);
    }

    /**
     * One word's term of a divergence. The terms sum to the whole, so a single one is a small share of it and
     * needs the places a whole divergence does not.
     */
    public String ofOneTerm(final double bits) {
        return String.format(Locale.ROOT, "%.4f%%", 100.0 * bits / MAXIMUM_BITS);
    }
}
