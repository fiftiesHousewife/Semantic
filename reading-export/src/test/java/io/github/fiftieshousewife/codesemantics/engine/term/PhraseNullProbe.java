package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * How many of each bundled vocabulary's phrases stand in the declared names of the repository under reading,
 * against the bar a deal of that vocabulary's own words sets.
 *
 * <p>The controls are asked the same question as the matched vocabularies and printed in the same table.
 * What the bar is worth is that comparison: a vocabulary of the repository's own field should stand above it
 * and a vocabulary of a field the repository is not in should not.
 */
public final class PhraseNullProbe {

    private PhraseNullProbe() {
    }

    public static void main(final String[] arguments) {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        final long began = System.nanoTime();
        final List<PhraseBar> bars = TermOrderNull.seeded(TreeReading.SEED).over(written, judged());

        System.out.printf("%n%s — %d declared runs, %d deals of each vocabulary%n",
                tree.root().getFileName(), written.size(), TermOrderNull.RESAMPLES);
        System.out.printf("%-8s %8s %8s %8s %8s %8s %10s%n",
                "source", "phrases", "bar", "median", "times", "clears", "chance p");
        bars.forEach(bar -> System.out.printf("%-8s %8d %8d %8d %8.1f %8s %10.3f%n",
                bar.vocabulary(), bar.observed(), bar.chanceExpectedBest(), bar.median(),
                bar.timesTheBar(), bar.exceedsChance() ? "yes" : "no", bar.chanceRate()));
        System.out.printf("%ntook %d seconds%n", (System.nanoTime() - began) / 1_000_000_000L);
    }

    /** Every vocabulary a reading matches and every control it is judged against, in that order. */
    private static List<TermIndex> judged() {
        return Stream.concat(
                        Stream.of(MatchedTaxonomies.values()).map(MatchedTaxonomies::index),
                        Stream.of(ControlTaxonomies.values()).map(ControlTaxonomies::index))
                .toList();
    }
}
