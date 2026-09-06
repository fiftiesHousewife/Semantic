package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.theme.ChanceExpectedBest;

/**
 * One source's phrase count against a field of chance counts, and whether it stands outside it.
 *
 * <p>Where the bar sits, given a field of draws, is settled here rather than by whoever drew them: two nulls
 * disagreeing about how strict to be would be two claims wearing one word, which is the defect
 * {@link ChanceExpectedBest} exists to stop.
 *
 * @param vocabulary         the publisher whose phrases were counted
 * @param observed           how many of its phrases stand in the repository's declared names, compared at
 *                           the words both sides wrote and at no normalisation above them
 * @param chanceExpectedBest the count the best of a field this size reaches by chance alone
 * @param median             the middle of the draws, for a reader comparing the two bars
 * @param atLeastAsExtreme   how many draws reached the observed count or beat it
 * @param resamples          how many draws were taken
 * @param field              the sources that competed, in the order they were judged. Its size is what sets
 *                           the quantile, so a bar that moved between two readings can be read against a
 *                           changed field rather than a bare count
 */
public record PhraseBar(String vocabulary, int observed, int chanceExpectedBest, int median,
                        int atLeastAsExtreme, int resamples, List<String> field) {

    public PhraseBar {
        field = List.copyOf(field);
    }

    /** The bar a sorted field of chance counts sets, and where the observed count sits in it. */
    public static PhraseBar of(final String vocabulary, final int observed, final int[] sortedChance,
                               final List<String> field) {
        return new PhraseBar(vocabulary, observed,
                sortedChance[ChanceExpectedBest.furthestIn(field.size(), sortedChance.length)],
                sortedChance[sortedChance.length / 2],
                (int) Arrays.stream(sortedChance).filter(drawn -> drawn >= observed).count(),
                sortedChance.length, field);
    }

    /**
     * Whether the repository wrote more of this source's phrases than the furthest a field of this many
     * sources would have reached by chance.
     */
    public boolean exceedsChance() {
        return observed > chanceExpectedBest;
    }

    /**
     * How often chance alone produced a count this large, in the unit the number of draws allows. It is
     * bounded in {@code [1 / (resamples + 1), 1]} by the estimator's own definition.
     */
    public double chanceRate() {
        return (atLeastAsExtreme + 1.0) / (resamples + 1);
    }

    /** How many times the observed count is the bar, which is how a reader compares two sources at once. */
    public double timesTheBar() {
        return chanceExpectedBest == 0 ? observed : (double) observed / chanceExpectedBest;
    }
}
