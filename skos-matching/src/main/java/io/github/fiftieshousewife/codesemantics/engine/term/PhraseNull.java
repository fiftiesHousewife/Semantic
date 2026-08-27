package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.theme.ChanceExpectedBest;

/**
 * How many published phrases a repository of this vocabulary would write <em>by chance</em>, and therefore
 * whether the phrases it did write mean anything.
 *
 * <p>A repository large enough writes some of any vocabulary's phrases without working in its field, because
 * it writes enough words that some of them land next to each other in a published order. So the observed
 * count is judged against the count the same words produce with their order destroyed: deal the repository's
 * own words across its own declared names, each name keeping its length, and recount. The reference is the
 * repository's own vocabulary, so no phrase-frequency resource is bundled and none exists to bundle.
 *
 * <p><b>The bar is {@link ChanceExpectedBest}, not the median.</b> Every bundled vocabulary is asked about
 * every repository, so the vocabularies are a field competing to look remarkable and the bar follows from how
 * many of them there are. A vocabulary clearing only the middle of its own deals has cleared a coin flip.
 *
 * <p>Every deal is seeded, so a report is reproducible and two runs of one tree can be compared without
 * wondering whether the instrument moved.
 */
public final class PhraseNull {

    /** Enough deals that the rank of the observed count is readable to a thousandth. */
    public static final int RESAMPLES = 999;

    /**
     * One vocabulary's phrase count against the field of deals it stands in.
     *
     * @param vocabulary        the publisher whose phrases were counted
     * @param observed          how often the publisher's phrases stand in the repository's declared names
     * @param chanceExpectedBest the count the best of a field this size reaches by chance alone
     * @param median            the middle of the deals, for a reader comparing the two bars
     * @param atLeastAsExtreme  how many deals reached the observed count or beat it
     * @param resamples         how many deals were taken
     * @param field             how many vocabularies competed, which is what sets the quantile
     */
    public record Bar(String vocabulary, int observed, int chanceExpectedBest, int median,
                      int atLeastAsExtreme, int resamples, int field) {

        /**
         * Whether the repository wrote this publisher's phrases more often than the furthest a field of this
         * many vocabularies would have reached by dealing its own words out at random.
         */
        public boolean exceedsChance() {
            return observed > chanceExpectedBest;
        }

        /**
         * How often chance alone produced a count this large, in the unit the number of deals allows. It is
         * bounded in {@code [1 / (resamples + 1), 1]} by the estimator's own definition.
         */
        public double chanceRate() {
            return (atLeastAsExtreme + 1.0) / (resamples + 1);
        }
    }

    private final int resamples;

    private final long seed;

    public PhraseNull(final int resamples, final long seed) {
        this.resamples = resamples;
        this.seed = seed;
    }

    public static PhraseNull seeded(final long seed) {
        return new PhraseNull(RESAMPLES, seed);
    }

    /**
     * Each vocabulary's observed phrase count and the bar it has to beat, over one repository.
     *
     * <p>Every vocabulary is counted on the <em>same</em> deal, because the field is the vocabularies rather
     * than the deals: two vocabularies judged against two different shuffles would be two claims about two
     * repositories.
     */
    public List<Bar> over(final List<WrittenRun> written, final List<TermIndex> judged) {
        final List<MatchedPhrases> counting = judged.stream().map(MatchedPhrases::over).toList();
        final int[] observed = counted(counting, written);
        final int[][] chance = dealt(counting, written);
        return IntStream.range(0, judged.size())
                .mapToObj(vocabulary -> bar(judged.get(vocabulary).source(), observed[vocabulary],
                        chance[vocabulary], judged.size()))
                .toList();
    }

    /**
     * Every vocabulary's count on each deal, one row per vocabulary, sorted so a quantile can be read.
     *
     * <p>Each deal draws from a seed of its own, taken in order from the one this null was given. That is
     * what lets the deals be taken at once and still answer the same on every run: a deal depends on its own
     * seed and on nothing another deal did, so which of them finished first cannot reach the figures.
     */
    private int[][] dealt(final List<MatchedPhrases> counting, final List<WrittenRun> written) {
        final long[] seeds = new Random(seed).longs(resamples).toArray();
        final int[][] byDeal = Arrays.stream(seeds).parallel()
                .mapToObj(drawn -> counted(counting, ShuffledRuns.of(written).drawnWith(new Random(drawn))))
                .toArray(int[][]::new);
        return IntStream.range(0, counting.size())
                .mapToObj(vocabulary -> Arrays.stream(byDeal)
                        .mapToInt(deal -> deal[vocabulary]).sorted().toArray())
                .toArray(int[][]::new);
    }

    private static int[] counted(final List<MatchedPhrases> counting, final List<WrittenRun> names) {
        return counting.stream().mapToInt(phrases -> phrases.in(names)).toArray();
    }

    private static Bar bar(final String vocabulary, final int observed, final int[] chance, final int field) {
        return new Bar(vocabulary, observed,
                chance[ChanceExpectedBest.furthestIn(field, chance.length)],
                chance[chance.length / 2],
                (int) Arrays.stream(chance).filter(drawn -> drawn >= observed).count(),
                chance.length, field);
    }
}
