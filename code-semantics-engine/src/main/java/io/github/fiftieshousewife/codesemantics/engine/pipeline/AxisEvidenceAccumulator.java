package io.github.fiftieshousewife.codesemantics.engine.pipeline;

import io.github.fiftieshousewife.codesemantics.engine.Thresholds;
import io.github.fiftieshousewife.codesemantics.model.AxisResolution;
import io.github.fiftieshousewife.codesemantics.model.AxisVote;
import io.github.fiftieshousewife.codesemantics.model.PooledLogOdds;

import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Resolves a single <em>closed</em> axis {@code A} from its {@link AxisVote}s by <em>log-linear (geometric)
 * pooling</em>.
 *
 * <p>Closed is the load-bearing word. {@link #posterior} partitions over the axis's enum constants, so every
 * value the axis declares but nothing voted for sits at the neutral prior and contributes {@code e⁰ = 1} to
 * the denominator. Over a handful of constants that is the honest reading; over an open value space — the
 * order of 10⁵ WordNet synsets — the partition would be almost entirely neutral prior and the posterior
 * would mean nothing. An open space needs a sibling accumulator whose partition runs over the voted values
 * plus one explicit abstention mass, so that confidence reads as the winner's share among contenders.
 *
 * <p>Each vote's {@link AxisVote#weight() weight} is a signed log-odds contribution — positive
 * <em>for</em> a candidate value, negative <em>against</em> it. A value's pooled log-odds is the sum of
 * its votes, the winner is the value of greatest log-odds, and confidence is that winner's softmax
 * posterior over the axis's candidate values (values with no vote sit at the neutral prior, log-odds
 * zero). This is the maximum-entropy / Fellegi–Sunter combination form: because a single extreme vote
 * has unbounded influence on the pool, a rule that must dominate or veto a value expresses as a
 * high-magnitude signed vote rather than an out-of-band override, keeping every resolved axis a pure
 * function of its recorded votes.
 *
 * <p>The axis resolves to the caller-supplied {@code unknown} sentinel when the votes carry too little
 * total evidence (below {@link Thresholds#minimumEvidenceMass()}) or when no value attracts net positive
 * support.
 */
public final class AxisEvidenceAccumulator<A extends Enum<A>> {

    private final double minimumEvidenceMass;
    private final A unknown;

    public AxisEvidenceAccumulator(final Thresholds thresholds, final A unknown) {
        this.minimumEvidenceMass = thresholds.minimumEvidenceMass();
        this.unknown = unknown;
    }

    public AxisResolution<A> resolve(final List<? extends AxisVote<A>> votes) {
        if (saysTooLittle(votes)) {
            return abstention();
        }
        final Map<A, Double> logOdds = logOddsByValue(votes);
        final Map.Entry<A, Double> winner = logOdds.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .orElseThrow();
        if (winner.getValue() <= 0.0) {
            return abstention();
        }
        return new AxisResolution<>(winner.getKey(), posterior(winner.getValue(), logOdds));
    }

    /**
     * How strongly the pooled evidence argues <em>for</em> one value, in [0, 1): the logistic of that value's
     * summed log-odds, rescaled so the do-nothing baseline reads zero rather than a half.
     *
     * <p>This answers a different question from {@link #resolve}. Resolution is exclusive — which single value
     * leads the axis — and its confidence is diluted across every rival the axis declares. Support is the
     * reading for a <em>facet</em>, a matter of degree about one value on its own, and it is a strength rather
     * than a posterior because that is what a consumer weighing the value can use: evidence that argues
     * against contributes nothing to be weighed, so it reads zero and not the base rate it would otherwise
     * inherit — a clock keeping its own time is not one-third of a bookkeeping clock.
     */
    public double support(final List<? extends AxisVote<A>> votes, final A value) {
        if (saysTooLittle(votes)) {
            return 0.0;
        }
        return PooledLogOdds.support(logOddsByValue(votes).getOrDefault(value, 0.0));
    }

    /**
     * Whether the votes carry too little total magnitude to decide anything. An empty list is the same
     * reading as a list of negligible votes, and both are the honest one: nothing was said.
     */
    private boolean saysTooLittle(final List<? extends AxisVote<A>> votes) {
        return votes.isEmpty() || evidenceMass(votes) < minimumEvidenceMass;
    }

    private AxisResolution<A> abstention() {
        return new AxisResolution<>(unknown, 0.0);
    }

    private Map<A, Double> logOddsByValue(final List<? extends AxisVote<A>> votes) {
        final Map<A, Double> logOdds = new EnumMap<>(unknown.getDeclaringClass());
        votes.forEach(vote -> logOdds.merge(vote.value(), vote.weight(), Double::sum));
        return logOdds;
    }

    /** Total evidence magnitude: the sum of absolute log-odds contributed, for or against any value. */
    private double evidenceMass(final List<? extends AxisVote<A>> votes) {
        return votes.stream().mapToDouble(vote -> Math.abs(vote.weight())).sum();
    }

    /**
     * The winner's softmax posterior over every candidate value of the axis. Unvoted values sit at
     * log-odds zero, so confidence reflects how far the winner's evidence outruns both its rivals and the
     * do-nothing baseline; the {@code unknown} sentinel is excluded because confidence is conditional on a
     * decision being made. A value supported far beyond its rivals approaches — without ever reaching —
     * full confidence.
     */
    private double posterior(final double winnerLogOdds, final Map<A, Double> logOdds) {
        final double partition = Arrays.stream(unknown.getDeclaringClass().getEnumConstants())
                .filter(candidate -> candidate != unknown)
                .mapToDouble(candidate -> Math.exp(logOdds.getOrDefault(candidate, 0.0)))
                .sum();
        return Math.exp(winnerLogOdds) / partition;
    }
}
