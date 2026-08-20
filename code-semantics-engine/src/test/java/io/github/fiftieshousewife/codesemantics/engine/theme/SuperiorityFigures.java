package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;

/**
 * How well one ranking met the expected result, in three figures rather than one.
 *
 * <p>The pooled probability of superiority is taken over every topic in the scheme, and on a phrase match
 * that field is mostly ties: a repository reaches a few hundred of 4,516 topics and the rest score exactly
 * zero. Two scorings read from the same spans reach the same topics, so the tied part of the field is
 * identical under both and the pooled figure moves by less than a thousandth however the reached topics are
 * reordered. It measures which topics were reachable, not how they were ranked.
 *
 * <p>So the same statistic is reported a second time over the reached topics alone, which is the only field
 * where the ordering question lives, and precision at ten is reported beside it against the count chance
 * would put there. All three are bounded by their own definitions.
 */
final class SuperiorityFigures {

    private static final int TOP = 10;

    private final String area;

    SuperiorityFigures(final String area) {
        this.area = area;
    }

    void print(final List<ProbabilityOfSuperiority.Scored> scored) {
        pooled(scored);
        reached(scored);
        precisionAtTen(scored);
    }

    private void pooled(final List<ProbabilityOfSuperiority.Scored> scored) {
        superiority("whole scheme", scored);
    }

    private void reached(final List<ProbabilityOfSuperiority.Scored> scored) {
        superiority("topics reached", scored.stream().filter(topic -> topic.score() > 0.0).toList());
    }

    private void superiority(final String field, final List<ProbabilityOfSuperiority.Scored> scored) {
        final long marked = marked(scored);
        if (marked == 0 || marked == scored.size()) {
            System.out.printf("  %-16s the expectation marks %d of %d, so there is no pair to compare%n",
                    field, marked, scored.size());
            return;
        }
        final ProbabilityOfSuperiority.Superiority found = new ProbabilityOfSuperiority().of(scored);
        System.out.printf("  %-16s %d state %s of %d; chance %.5f against 0.5 — %s%n", field, found.meeting(),
                area, scored.size(), found.chance(),
                found.beatsChance() ? "ABOVE CHANCE" : "at or below chance");
    }

    /**
     * How many of the ten highest-scoring topics state the area, against the number the same field would
     * put there at random. The expected count is the marked share of the field times ten, which follows from
     * the field's own composition and is not a bar chosen here.
     */
    private void precisionAtTen(final List<ProbabilityOfSuperiority.Scored> scored) {
        final List<ProbabilityOfSuperiority.Scored> reached = scored.stream()
                .filter(topic -> topic.score() > 0.0)
                .sorted(Comparator.comparingDouble(ProbabilityOfSuperiority.Scored::score).reversed())
                .toList();
        if (reached.isEmpty()) {
            return;
        }
        final long inTop = marked(reached.stream().limit(TOP).toList());
        final double expected = TOP * marked(reached) / (double) reached.size();
        System.out.printf("  %-16s %d of the top %d state %s; chance would put %.2f there%n", "precision@10",
                inTop, Math.min(TOP, reached.size()), area, expected);
    }

    private static long marked(final List<ProbabilityOfSuperiority.Scored> scored) {
        return scored.stream()
                .filter(topic -> topic.expectation() == ProbabilityOfSuperiority.Expectation.MEETS_IT)
                .count();
    }
}
