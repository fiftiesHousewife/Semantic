package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;

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
 *
 * <p><b>The comparison is between what each side was placed in.</b> A reading also carries the share of
 * itself no topic took, and that share is not a subject the other side can be far from: counting it would
 * make a scope distinctive for being illegible, and would answer "which topics account for the departure"
 * with something that is not a topic. So both sides are taken {@link TopicDistribution#amongWhatWasPlaced()}
 * and every share reported here is a share of what was placed — where the intensity beside it, which is a
 * reading rather than a comparison, is a share of everything that was observed.
 */
public final class JensenShannon {

    private final ShareDivergence arithmetic = new ShareDivergence();

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
        return between(scope.amongWhatWasPlaced(), reference.amongWhatWasPlaced());
    }

    /**
     * Every topic's contribution, largest first. Shares are of the divergence itself, so they sum to 1 and a
     * scope identical to its reference yields no contributions at all rather than a ranking of noise.
     */
    public List<Contribution> contributions(final TopicDistribution scope, final TopicDistribution reference) {
        final TopicDistribution placed = scope.amongWhatWasPlaced();
        final TopicDistribution against = reference.amongWhatWasPlaced();
        final double total = between(placed, against);
        if (total <= 0.0) {
            return List.of();
        }
        return TopicDistribution.support(placed, against).stream()
                .map(topic -> new Contribution(topic, bitsOf(topic, placed, against),
                        bitsOf(topic, placed, against) / total, placed.shareOf(topic),
                        against.shareOf(topic)))
                .sorted(Comparator.comparingDouble(Contribution::bits).reversed()
                        .thenComparing(Contribution::topic))
                .toList();
    }

    private double between(final TopicDistribution placed, final TopicDistribution against) {
        return arithmetic.between(placed.shareByTopic(), against.shareByTopic());
    }

    private double bitsOf(final String topic, final TopicDistribution scope,
                          final TopicDistribution reference) {
        return arithmetic.at(topic, scope.shareByTopic(), reference.shareByTopic());
    }

    /** The topics a distribution holds most of, largest first — a single-scope reading, and a weak one. */
    public static List<Map.Entry<String, Double>> ranked(final TopicDistribution distribution) {
        return distribution.shareByTopic().entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()
                        .thenComparing(Map.Entry::getKey))
                .toList();
    }
}
