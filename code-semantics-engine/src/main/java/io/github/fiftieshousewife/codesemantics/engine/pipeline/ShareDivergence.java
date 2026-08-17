package io.github.fiftieshousewife.codesemantics.engine.pipeline;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Jensen–Shannon arithmetic over two distributions keyed the same way: the total in bits, and the
 * per-key term it decomposes into. What the keys stand for is the caller's business — subjects in one
 * reading, words in another — and the properties that make the statistic usable hold either way.
 *
 * <p>Its maximum is exactly 1 bit and follows from its definition, attained only where the two supports are
 * disjoint. It is symmetric. And it decomposes additively, so each key's term is non-negative and the terms
 * sum to the total, which is what lets a share of the divergence be a bounded reading rather than a score.
 *
 * <p>Both sides must already be distributions. Nothing here renormalises: what belongs in a denominator is a
 * decision about evidence, and this class only does the arithmetic that follows it.
 */
public final class ShareDivergence {

    private static final double LOG_2 = Math.log(2.0);

    /** The divergence between the two, in bits, bounded at 1 by its own definition. */
    public double between(final Map<String, Double> left, final Map<String, Double> right) {
        return support(left, right).stream()
                .mapToDouble(key -> at(key, left, right))
                .sum();
    }

    /** One key's term of that sum — how much of the distance this key accounts for, in bits. */
    public double at(final String key, final Map<String, Double> left, final Map<String, Double> right) {
        final double inLeft = left.getOrDefault(key, 0.0);
        final double inRight = right.getOrDefault(key, 0.0);
        final double mixture = 0.5 * (inLeft + inRight);
        return 0.5 * relativeEntropy(inLeft, mixture) + 0.5 * relativeEntropy(inRight, mixture);
    }

    /** The keys either side names — the support a comparison between them runs over. */
    public Set<String> support(final Map<String, Double> left, final Map<String, Double> right) {
        return Stream.concat(left.keySet().stream(), right.keySet().stream())
                .collect(Collectors.toUnmodifiableSet());
    }

    /**
     * One term of a Kullback–Leibler sum in bits. A key absent from one side contributes nothing from that
     * side — {@code 0·log(0/m)} is zero by the convention that follows from the limit, and it is the reason
     * the mixture keeps the whole statistic finite where a bare KL would not.
     */
    private static double relativeEntropy(final double share, final double mixture) {
        return share <= 0.0 ? 0.0 : share * Math.log(share / mixture) / LOG_2;
    }
}
