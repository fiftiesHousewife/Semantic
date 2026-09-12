package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    private final CountedPhrases counted;

    private final ReportedSpans reported;

    public TermOrderNull(final int resamples, final long seed) {
        this(resamples, seed, CountedPhrases.HOW_MANY);
    }

    public TermOrderNull(final int resamples, final long seed, final CountedPhrases counted) {
        this(resamples, seed, counted, ReportedSpans.PHRASES);
    }

    /** The same null with the walk chosen too, so single-word terms can be judged against their own deal. */
    public TermOrderNull(final int resamples, final long seed, final CountedPhrases counted,
                         final ReportedSpans reported) {
        this.resamples = resamples;
        this.seed = seed;
        this.counted = counted;
        this.reported = reported;
    }

    public static TermOrderNull seeded(final long seed) {
        return new TermOrderNull(RESAMPLES, seed);
    }

    /** The same draw counted the other way, which is what says whether the choice of statistic matters. */
    public static TermOrderNull seeded(final long seed, final CountedPhrases counted) {
        return new TermOrderNull(RESAMPLES, seed, counted);
    }

    /** Each source's observed phrase count over one repository, and the bar its own words set. */
    public List<PhraseBar> over(final List<WrittenRun> written, final List<TermIndex> judged) {
        return inEachUnitOver(written, judged).get(counted);
    }

    /**
     * Every source judged in both units at once, from one set of deals: the conjunction the reading
     * publishes, where a source stands outside chance only if both its distinct terms and its total
     * occurrences do.
     */
    public List<ConjunctionBar> inBothUnitsOver(final List<WrittenRun> written,
                                                final List<TermIndex> judged) {
        final Map<CountedPhrases, List<PhraseBar>> each = inEachUnitOver(written, judged);
        return IntStream.range(0, judged.size())
                .mapToObj(source -> new ConjunctionBar(each.get(CountedPhrases.HOW_MANY).get(source),
                        each.get(CountedPhrases.HOW_OFTEN).get(source)))
                .toList();
    }

    /**
     * Every source's bars in both units, from one set of deals and one walk of the names per deal.
     *
     * <p>A reading wanting both used to draw the whole null twice, which walked every declared name twice
     * per deal and dealt every vocabulary twice.
     */
    public Map<CountedPhrases, List<PhraseBar>> inEachUnitOver(final List<WrittenRun> written,
                                                               final List<TermIndex> judged) {
        final List<String> field = judged.stream().map(TermIndex::source).toList();
        final List<PhraseReach> observed = judged.stream()
                .map(index -> ReachedPhrases.over(index, reported).in(written))
                .toList();
        final Map<CountedPhrases, int[][]> chance = dealt(written, judged);
        return Stream.of(CountedPhrases.values())
                .collect(Collectors.toMap(unit -> unit,
                        unit -> IntStream.range(0, judged.size())
                                .mapToObj(source -> PhraseBar.of(field.get(source),
                                        unit.of(observed.get(source)),
                                        chance.get(unit)[source], field))
                                .toList()));
    }

    /** Every source's reach on each deal of itself, sorted per unit so a quantile can be read. */
    private Map<CountedPhrases, int[][]> dealt(final List<WrittenRun> written,
                                               final List<TermIndex> judged) {
        final PhraseReach[][] byDeal = Arrays.stream(new Random(seed).longs(resamples).toArray()).parallel()
                .mapToObj(drawn -> reachedOnADeal(written, judged, new Random(drawn)))
                .toArray(PhraseReach[][]::new);
        return Stream.of(CountedPhrases.values())
                .collect(Collectors.toMap(unit -> unit,
                        unit -> IntStream.range(0, judged.size())
                                .mapToObj(source -> Arrays.stream(byDeal)
                                        .mapToInt(deal -> unit.of(deal[source])).sorted().toArray())
                                .toArray(int[][]::new)));
    }

    private PhraseReach[] reachedOnADeal(final List<WrittenRun> written,
                                         final List<TermIndex> judged, final Random draws) {
        return judged.stream()
                .map(index -> ReachedPhrases.over(ScrambledTerms.of(index, draws), reported).in(written))
                .toArray(PhraseReach[]::new);
    }
}
