package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * How far one scope's topical intensity stands from another's, in bits, with the per-topic decomposition that
 * says which topics account for the distance.
 *
 * <p>The statistic is the Jensen–Shannon divergence, chosen for three properties rather than three
 * preferences. <b>Its maximum is exactly 1 bit and follows from its definition</b>, attained only when the
 * two supports are disjoint — where KL divergence is unbounded and is <em>infinite</em> whenever a topic
 * appears in one scope and not the other, which is the normal case for a small scope against a repository.
 * <b>It is symmetric</b>, so "how different is this module from the repository" and its reverse are one
 * number. And <b>it decomposes additively</b>: each topic's contribution is non-negative and they sum
 * exactly to the total, so a topic's share of the divergence is itself bounded in {@code [0, 1]} and the
 * shares sum to 1. That ranked share is the reading — which topics make this scope different, and how much
 * of the difference each accounts for.
 *
 * <p>Direction is reported separately and as a sign, never folded into the magnitude: a bounded share and a
 * bit are different kinds of thing, and a chart that multiplies one by the other can no longer state its own
 * maximum.
 */
public final class JensenShannon {

    private static final double LOG_2 = Math.log(2.0);

    /** One topic's share of the divergence, and which side it concentrates in. */
    public record Contribution(String topic, double bits, double shareOfDivergence, double scopeShare,
                               double referenceShare) {

        /** Whether the topic is written more densely in the scope than in the reference. */
        public boolean concentratedInScope() {
            return scopeShare > referenceShare;
        }
    }

    /** The divergence in bits, bounded at 1 by its own definition. */
    public double divergence(final TopicDistribution scope, final TopicDistribution reference) {
        return TopicDistribution.support(scope, reference).stream()
                .mapToDouble(topic -> bitsOf(topic, scope, reference))
                .sum();
    }

    /**
     * Every topic's contribution, largest first. Shares are of the divergence itself, so they sum to 1 and a
     * scope identical to its reference yields no contributions at all rather than a ranking of noise.
     */
    public List<Contribution> contributions(final TopicDistribution scope, final TopicDistribution reference) {
        final double total = divergence(scope, reference);
        if (total <= 0.0) {
            return List.of();
        }
        return TopicDistribution.support(scope, reference).stream()
                .map(topic -> new Contribution(topic, bitsOf(topic, scope, reference),
                        bitsOf(topic, scope, reference) / total, scope.shareOf(topic),
                        reference.shareOf(topic)))
                .sorted(Comparator.comparingDouble(Contribution::bits).reversed()
                        .thenComparing(Contribution::topic))
                .toList();
    }

    private static double bitsOf(final String topic, final TopicDistribution scope,
                                 final TopicDistribution reference) {
        final double inScope = scope.shareOf(topic);
        final double inReference = reference.shareOf(topic);
        final double mixture = 0.5 * (inScope + inReference);
        return 0.5 * relativeEntropy(inScope, mixture) + 0.5 * relativeEntropy(inReference, mixture);
    }

    /**
     * One term of a Kullback–Leibler sum in bits. A topic absent from one side contributes nothing from that
     * side — {@code 0·log(0/m)} is zero by the convention that follows from the limit, and it is the reason
     * the mixture keeps the whole statistic finite where a bare KL would not.
     */
    private static double relativeEntropy(final double share, final double mixture) {
        return share <= 0.0 ? 0.0 : share * Math.log(share / mixture) / LOG_2;
    }

    /** The topics a distribution holds most of, largest first — a single-scope reading, and a weak one. */
    public static List<Map.Entry<String, Double>> ranked(final TopicDistribution distribution) {
        return distribution.shareByTopic().entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()
                        .thenComparing(Map.Entry::getKey))
                .toList();
    }
}
