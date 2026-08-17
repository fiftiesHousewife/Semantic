package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * How alike two readings order their topics — Spearman's ρ, bounded in {@code [-1, 1]} by its own definition
 * and not by anything chosen.
 *
 * <p>It answers a question a divergence cannot: whether a change to how a reading is composed moved the
 * <em>order</em> of what it found, or only the sizes. Two compositions can differ in every share and rank
 * their topics identically, and a reader asking what a repository is about is reading the order.
 *
 * <p>The comparison runs over every topic either reading names, so a topic one of them never placed enters
 * as the zero share it holds there and ranks below everything that reading did place. Topics held at equal
 * share share one rank between them — the mean of the ranks they span — which is what keeps ρ inside its
 * bound when a reading holds ties, as a reading over a vocabulary of hundreds always does.
 */
public final class RankCorrelation {

    /**
     * The correlation between the two orderings, or nothing where one of them has no order to speak of.
     *
     * <p>A reading holding every topic at one share ranks them all together, and a correlation with a
     * constant is undefined rather than zero. Zero is a real answer here — it means the two orderings are
     * unrelated — so a reading that cannot be ordered says nothing instead of claiming it.
     */
    public OptionalDouble between(final TopicDistribution first, final TopicDistribution second) {
        final List<String> topics = TopicDistribution.support(first, second).stream().sorted().toList();
        return correlationOf(ranksOf(topics, first), ranksOf(topics, second));
    }

    /**
     * Each topic's place in this reading, largest share first, with tied topics sharing the mean of the
     * ranks they occupy: a topic's rank is how many stand above it, plus the middle of its own tie.
     */
    private static double[] ranksOf(final List<String> topics, final TopicDistribution reading) {
        return topics.stream()
                .mapToDouble(topic -> rankOf(reading.shareOf(topic), topics, reading))
                .toArray();
    }

    private static double rankOf(final double share, final List<String> topics,
                                 final TopicDistribution reading) {
        final long above = topics.stream()
                .filter(other -> reading.shareOf(other) > share)
                .count();
        final long level = topics.stream()
                .filter(other -> Double.compare(reading.shareOf(other), share) == 0)
                .count();
        return above + (level + 1) / 2.0;
    }

    /** Pearson's correlation over the two rank vectors, which is what ρ is once ties carry mean ranks. */
    private static OptionalDouble correlationOf(final double[] first, final double[] second) {
        final double spread = Math.sqrt(varianceOf(first) * varianceOf(second));
        if (spread <= 0.0) {
            return OptionalDouble.empty();
        }
        return OptionalDouble.of(covarianceOf(first, second) / spread);
    }

    private static double covarianceOf(final double[] first, final double[] second) {
        final double meanFirst = meanOf(first);
        final double meanSecond = meanOf(second);
        return IntStream.range(0, first.length)
                .mapToDouble(at -> (first[at] - meanFirst) * (second[at] - meanSecond))
                .sum();
    }

    private static double varianceOf(final double[] ranks) {
        final double mean = meanOf(ranks);
        return IntStream.range(0, ranks.length)
                .mapToDouble(at -> (ranks[at] - mean) * (ranks[at] - mean))
                .sum();
    }

    private static double meanOf(final double[] ranks) {
        return ranks.length == 0 ? 0.0 : IntStream.range(0, ranks.length)
                .mapToDouble(at -> ranks[at])
                .sum() / ranks.length;
    }
}
