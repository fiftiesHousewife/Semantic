package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Whether a source's phrases stand in a repository's declared names because of the orders the source
 * published its words in, or only because of which words those are.
 *
 * <p>The repository is held still and the <em>source</em> is dealt: keep how many terms it states, how long
 * each is and its whole list of words, destroy only which of its words it published beside which, and
 * recount. A source whose word list is what reached the repository scores the same either way; a source whose
 * published orders are what reached it loses them.
 *
 * <p>Dealing the <em>repository</em> instead answers a different question and not this one. Declared names
 * are compositional — a repository writes the same words beside each other over and over — so a deal of them
 * puts a source's words together in orders nobody wrote, and every source whose words a repository writes at
 * all stands above such a bar.
 *
 * <p>The bar is {@link PhraseBar}'s. Every deal is seeded and drawn from a seed of its own, so the deals can
 * be taken at once and still answer the same on every run.
 */
public final class TermOrderNull {

    /** Enough deals that the rank of the observed count is readable to a thousandth. */
    public static final int RESAMPLES = 999;

    private final int resamples;

    private final long seed;

    public TermOrderNull(final int resamples, final long seed) {
        this.resamples = resamples;
        this.seed = seed;
    }

    public static TermOrderNull seeded(final long seed) {
        return new TermOrderNull(RESAMPLES, seed);
    }

    /** Each source's observed phrase count over one repository, and the bar its own words set. */
    public List<PhraseBar> over(final List<WrittenRun> written, final List<TermIndex> judged) {
        final int[][] chance = dealt(written, judged);
        return IntStream.range(0, judged.size())
                .mapToObj(source -> PhraseBar.of(judged.get(source).source(),
                        MatchedPhrases.over(judged.get(source)).in(written),
                        chance[source], judged.size()))
                .toList();
    }

    /** Every source's count on each deal of itself, one row per source, sorted so a quantile can be read. */
    private int[][] dealt(final List<WrittenRun> written, final List<TermIndex> judged) {
        final int[][] byDeal = Arrays.stream(new Random(seed).longs(resamples).toArray()).parallel()
                .mapToObj(drawn -> counted(written, judged, new Random(drawn)))
                .toArray(int[][]::new);
        return IntStream.range(0, judged.size())
                .mapToObj(source -> Arrays.stream(byDeal)
                        .mapToInt(deal -> deal[source]).sorted().toArray())
                .toArray(int[][]::new);
    }

    private static int[] counted(final List<WrittenRun> written, final List<TermIndex> judged,
                                 final Random draws) {
        return judged.stream()
                .mapToInt(index -> MatchedPhrases.over(ScrambledTerms.of(index, draws)).in(written))
                .toArray();
    }
}
