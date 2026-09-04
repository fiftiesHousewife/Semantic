package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * Each bundled vocabulary judged twice over one repository at one seed: once on how many of its phrases the
 * repository wrote, which is what the reading publishes, and once on how often those phrases stand in
 * declared names.
 *
 * <p>The two readings differ on the tail and agree on the leaders. Tika writes nine of FpML's terms 25 times
 * between them and quickfixj writes 53 of FIX's 717 times; counted distinctly those are 9 against 53 and both
 * clear. This prints both units side by side so the question of which separates a field's own vocabulary from
 * a stranger's is answered by the table rather than by argument.
 *
 * <p>It prints and writes nothing. No published figure moves.
 */
public final class PhraseUnitProbe {

    private PhraseUnitProbe() {
    }

    public static void main(final String[] arguments) {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        final List<TermIndex> judged = judged().stream().map(SpecificTerms::of)
                .map(TermIndex.class::cast).toList();
        final long began = System.nanoTime();
        final Map<CountedPhrases, List<PhraseBar>> bars =
                TermOrderNull.seeded(TreeReading.SEED).inEachUnitOver(written, judged);
        final List<PhraseBar> many = bars.get(CountedPhrases.HOW_MANY);
        final List<PhraseBar> often = bars.get(CountedPhrases.HOW_OFTEN);

        System.out.printf("%n%s — %d declared runs, %d deals of each vocabulary%n",
                tree.root().getFileName(), written.size(), TermOrderNull.RESAMPLES);
        System.out.printf("%n%-8s   %8s %8s %7s %7s   %8s %8s %7s %7s   %s%n",
                "source", "terms", "bar", "times", "clears",
                "written", "bar", "times", "clears", "verdict");
        IntStream.range(0, judged.size()).forEach(source -> row(many.get(source), often.get(source)));
        System.out.printf("%ntook %d seconds%n", (System.nanoTime() - began) / 1_000_000_000L);
    }

    private static void row(final PhraseBar many, final PhraseBar often) {
        System.out.printf("%-8s   %8d %8d %7.1f %7s   %8d %8d %7.1f %7s   %s%n",
                many.vocabulary(), many.observed(), many.chanceExpectedBest(), many.timesTheBar(),
                many.exceedsChance() ? "yes" : "no",
                often.observed(), often.chanceExpectedBest(), often.timesTheBar(),
                often.exceedsChance() ? "yes" : "no", verdict(many, often));
    }

    /** What changed hands, which is the only column a reader comparing two units needs. */
    private static String verdict(final PhraseBar many, final PhraseBar often) {
        if (many.exceedsChance() == often.exceedsChance()) {
            return many.exceedsChance() ? "both" : "neither";
        }
        return many.exceedsChance() ? "lost by counting how often" : "gained by counting how often";
    }

    /** Every vocabulary a reading matches and every control it is judged against, in that order. */
    private static List<TermIndex> judged() {
        return Stream.of(BundledTaxonomies.values()).map(BundledTaxonomies::index)
                .toList();
    }
}
