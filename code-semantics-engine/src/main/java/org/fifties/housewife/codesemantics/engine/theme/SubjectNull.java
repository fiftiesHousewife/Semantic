package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * What a taxonomy of nonsense would have placed this scope under.
 *
 * <p>Something is always nearest, so the nearest subject is not a finding. The field it has to beat is built
 * by keeping everything about the taxonomy except which words describe which subject: draw a real
 * description's length, fill it with words drawn from the pooled vocabulary of every description, and read
 * the result exactly as a real description is read. A chance subject is then the same length, in the same
 * words, about nothing.
 *
 * <p>The bar is the <b>chance-expected best</b>, and it follows from the size of the field rather than from
 * a chosen threshold. The smallest of {@code n} draws sits at the {@code 1/(n+1)} quantile of their
 * distribution, so a taxonomy offering 152 subjects gets 152 attempts at being nearest and must be read
 * against the best of 152 chance attempts. A winner that beats a single average draw has shown nothing at
 * all: with enough subjects, one of them was always going to be close.
 */
public final class SubjectNull {

    /** Enough draws that the rank of the observed value is readable to a thousandth. */
    public static final int RESAMPLES = 999;

    private static final String CHANCE = "chance";

    private static final String SPACE = " ";

    /** The nearest real subject, against the nearest a taxonomy of chance would have offered. */
    public record Chance(double nearest, double chanceNearest, int subjects, int resamples) {

        /** Whether the placement says more than that the taxonomy is large. */
        public boolean standsApart() {
            return nearest < chanceNearest;
        }
    }

    private final SubjectAreas areas;
    private final TopicComparison comparison;
    private final int resamples;
    private final Random draws;

    public SubjectNull(final SubjectAreas areas, final TopicComparison comparison, final int resamples,
                       final Random draws) {
        this.areas = areas;
        this.comparison = comparison;
        this.resamples = resamples;
        this.draws = draws;
    }

    /** The field a placement by divergence has to beat. */
    public static SubjectNull seeded(final long seed) {
        return seeded(seed, new JensenShannon()::divergence);
    }

    /** The field a placement by any comparison has to beat, drawn the same way for each of them. */
    public static SubjectNull seeded(final long seed, final TopicComparison comparison) {
        return new SubjectNull(SubjectAreas.fromClasspath(), comparison, RESAMPLES, new Random(seed));
    }

    public Chance of(final double nearest, final TopicDistribution scope, final List<String> descriptions) {
        final List<String> pool = descriptions.stream().flatMap(text -> Arrays.stream(text.split("\\s+")))
                .filter(word -> !word.isBlank()).toList();
        final List<Integer> lengths = descriptions.stream()
                .map(text -> text.split("\\s+").length).toList();
        final List<Double> chance = new ArrayList<>();
        for (int draw = 0; draw < resamples; draw++) {
            final TopicDistribution drawn = areas
                    .topicsIn(CHANCE, wordsFrom(pool, lengths.get(draws.nextInt(lengths.size()))))
                    .distribution();
            if (!drawn.isEmpty()) {
                chance.add(comparison.between(scope, drawn));
            }
        }
        Collections.sort(chance);
        return new Chance(nearest, chance.get(bestOf(descriptions.size(), chance.size())),
                descriptions.size(), chance.size());
    }

    /** Where the best of a field of this size sits among the draws — the quantile, not a chosen rank. */
    static int bestOf(final int subjects, final int drawn) {
        return ChanceExpectedBest.nearestIn(subjects, drawn);
    }

    private String wordsFrom(final List<String> pool, final int length) {
        final StringBuilder text = new StringBuilder();
        for (int word = 0; word < length; word++) {
            text.append(pool.get(draws.nextInt(pool.size()))).append(SPACE);
        }
        return text.toString();
    }
}
