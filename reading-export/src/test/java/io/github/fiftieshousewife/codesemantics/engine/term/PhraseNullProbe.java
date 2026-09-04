package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * How many of each bundled vocabulary's phrases stand in the declared names of the repository under reading,
 * against the bar a deal of that vocabulary's own words sets — twice, once over everything the publisher
 * states and once over the terms working Java has not been shown to write.
 *
 * <p>The controls are asked the same question as the matched vocabularies and printed in the same table.
 * What the bar is worth is that comparison: a vocabulary of the repository's own field should stand above it
 * and a vocabulary of a field the repository is not in should not. What the termhood filter is worth is the
 * two halves of the table read against each other, which is why both are computed at one seed on one read.
 */
public final class PhraseNullProbe {

    private PhraseNullProbe() {
    }

    public static void main(final String[] arguments) {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        final List<TermIndex> published = judged();
        final List<SpecificTerms> specific = published.stream().map(SpecificTerms::of).toList();
        final long began = System.nanoTime();
        final List<PhraseBar> all = TermOrderNull.seeded(TreeReading.SEED).over(written, published);
        final List<PhraseBar> kept =
                TermOrderNull.seeded(TreeReading.SEED).over(written, List.copyOf(specific));

        System.out.printf("%n%s — %d declared runs, %d deals of each vocabulary%n",
                tree.root().getFileName(), written.size(), TermOrderNull.RESAMPLES);
        System.out.printf("%n%-8s %8s %8s %7s %7s   %8s %8s %7s %7s   %s%n",
                "source", "phrases", "bar", "times", "clears",
                "phrases", "bar", "times", "clears", "terms refused");
        IntStream.range(0, published.size())
                .forEach(source -> row(all.get(source), kept.get(source), specific.get(source)));
        System.out.printf("%ntook %d seconds%n", (System.nanoTime() - began) / 1_000_000_000L);
    }

    private static void row(final PhraseBar all, final PhraseBar kept, final SpecificTerms specific) {
        System.out.printf("%-8s %8d %8d %7.1f %7s   %8d %8d %7.1f %7s   %d of %d%n",
                all.vocabulary(), all.observed(), all.chanceExpectedBest(), all.timesTheBar(),
                all.exceedsChance() ? "yes" : "no",
                kept.observed(), kept.chanceExpectedBest(), kept.timesTheBar(),
                kept.exceedsChance() ? "yes" : "no",
                specific.refused(), specific.refused() + specific.terms().size());
    }

    /** Every vocabulary a reading matches and every control it is judged against, in that order. */
    private static List<TermIndex> judged() {
        return Stream.of(BundledTaxonomies.values()).map(BundledTaxonomies::index)
                .toList();
    }
}
