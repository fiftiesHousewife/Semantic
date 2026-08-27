package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * How often each bundled vocabulary's phrases stand in the declared names of the repository under reading,
 * beside how often the repository's own words reach them with their order destroyed.
 *
 * <p>The controls are asked the same question as the matched vocabularies and printed in the same table.
 * What the bar is worth is that comparison: a vocabulary of the repository's own field should stand above the
 * count its words reach by chance, and a vocabulary of a field the repository is not in should not.
 */
public final class PhraseNullProbe {

    private PhraseNullProbe() {
    }

    public static void main(final String[] arguments) {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        final long began = System.nanoTime();
        final List<PhraseNull.Bar> bars =
                PhraseNull.seeded(TreeReading.SEED).over(written, judged());

        System.out.printf("%n%s — %d declared runs, %d words, %d deals of them%n",
                tree.root().getFileName(), written.size(),
                ShuffledRuns.of(written).words(), PhraseNull.RESAMPLES);
        System.out.printf("%-8s %8s %8s %8s %8s %10s%n",
                "source", "written", "bar", "median", "clears", "chance p");
        bars.forEach(bar -> System.out.printf("%-8s %8d %8d %8d %8s %10.3f%n",
                bar.vocabulary(), bar.observed(), bar.chanceExpectedBest(), bar.median(),
                bar.exceedsChance() ? "yes" : "no", bar.chanceRate()));
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
