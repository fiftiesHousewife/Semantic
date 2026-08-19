package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * The chance that a topic the expected result marks ranks above one it does not.
 *
 * <p>Statistics calls this the probability of superiority, and it is the Mann–Whitney U statistic divided
 * by the product of the two group sizes — the same quantity an ROC curve reports as its area. It is used
 * here because the bound follows from the definition rather than being chosen: it is a probability, so it
 * lies in {@code [0, 1]}, and 0.5 is exactly what an ordering carrying no information about the expectation
 * produces. A reading cannot be tuned to clear a bar that is fixed by arithmetic.
 *
 * <p>It is preferred to asking whether one named topic reached the top because it needs no topic to be
 * named. Where the expectation is a property many topics have — stating a publisher's own domain token —
 * every topic carrying it is evidence, and a statistic over all of them cannot be satisfied by one lucky
 * placement.
 *
 * <p>Ties are counted as half, which is what midranks do and is not a convention chosen to be kind. Most
 * topics score nothing at all on a phrase match, so a reading that ignored ties would report whatever the
 * sort happened to do with them.
 */
public final class ProbabilityOfSuperiority {

    /** Whether a topic is one the expected result says should rank highly. */
    public enum Expectation {
        MEETS_IT,
        DOES_NOT
    }

    /** One topic's score and whether the expectation marks it. */
    public record Scored(String topic, double score, Expectation expectation) {
    }

    /** What the statistic found, with the group sizes it rests on so a caller can see how thin it is. */
    public record Superiority(double chance, int meeting, int notMeeting) {

        /** An ordering carrying no information about the expectation produces exactly this. */
        public static final double CHANCE = 0.5;

        public boolean beatsChance() {
            return chance > CHANCE;
        }
    }

    /**
     * The chance a marked topic outranks an unmarked one, over every pair of the two groups.
     *
     * @throws IllegalArgumentException where either group is empty, because a statistic over no pair is not
     *                                  a weak result but an undefined one
     */
    public Superiority of(final List<Scored> scored) {
        final long meeting = scored.stream().filter(topic -> topic.expectation() == Expectation.MEETS_IT)
                .count();
        final long notMeeting = scored.size() - meeting;
        if (meeting == 0 || notMeeting == 0) {
            throw new IllegalArgumentException("The expectation marks " + meeting + " topics of "
                    + scored.size() + ", so there is no pair to compare and no statistic to report");
        }
        final double rankSum = rankSumOfMeeting(scored);
        final double bestPossible = meeting * (meeting + 1) / 2.0;
        return new Superiority((rankSum - bestPossible) / (meeting * (double) notMeeting),
                (int) meeting, (int) notMeeting);
    }

    /** The midranks of the marked topics, lowest score ranking 1, tied scores sharing their mean rank. */
    private static double rankSumOfMeeting(final List<Scored> scored) {
        final List<Scored> ascending = scored.stream()
                .sorted(Comparator.comparingDouble(Scored::score))
                .toList();
        final double[] midranks = midranks(ascending);
        return IntStream.range(0, ascending.size())
                .filter(position -> ascending.get(position).expectation() == Expectation.MEETS_IT)
                .mapToDouble(position -> midranks[position])
                .sum();
    }

    private static double[] midranks(final List<Scored> ascending) {
        final double[] ranks = new double[ascending.size()];
        int start = 0;
        while (start < ascending.size()) {
            int end = start;
            while (end + 1 < ascending.size()
                    && ascending.get(end + 1).score() == ascending.get(start).score()) {
                end++;
            }
            final double shared = (start + end + 2) / 2.0;
            IntStream.rangeClosed(start, end).forEach(tied -> ranks[tied] = shared);
            start = end + 1;
        }
        return ranks;
    }
}
