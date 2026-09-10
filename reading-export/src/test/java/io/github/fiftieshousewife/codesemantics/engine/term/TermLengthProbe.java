package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * Each bundled vocabulary judged twice over one repository at one seed: once on its phrases alone, which is
 * what the reading publishes, and once on every term it states including those of one word.
 *
 * <p>The two nulls share their deals — both are drawn at the same seed — so a verdict that moves is moved by
 * the single words and by nothing else. A deal cannot destroy the order of a term of one word, so what a
 * single word is worth against chance is whether the repository writes it at all, priced against a deal
 * holding the same single words; {@link ReportedSpans} states the property.
 *
 * <p>The single words each vocabulary reached are printed beside its row, most-written first, so a gained or
 * lost verdict can be traced to the words that carried it.
 *
 * <p>It prints and writes nothing. No published figure moves.
 */
public final class TermLengthProbe {

    private static final int NAMED_WORDS = 5;

    private TermLengthProbe() {
    }

    public static void main(final String[] arguments) {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        final List<TermIndex> judged = judged();
        final long began = System.nanoTime();
        final List<PhraseBar> phrases = TermOrderNull.seeded(TreeReading.SEED)
                .over(written, judged);
        final List<PhraseBar> everyTerm = new TermOrderNull(TermOrderNull.RESAMPLES, TreeReading.SEED,
                CountedPhrases.HOW_MANY, ReportedSpans.EVERY_TERM)
                .over(written, judged);

        System.out.printf("%n%s — %d declared runs, %d deals of each vocabulary%n",
                tree.root().getFileName(), written.size(), TermOrderNull.RESAMPLES);
        System.out.printf("%n%-8s   %8s %8s %7s %7s   %8s %8s %7s %7s   %-34s %s%n",
                "source", "phrases", "bar", "times", "clears",
                "terms", "bar", "times", "clears", "verdict", "most-written single words");
        IntStream.range(0, judged.size()).forEach(source -> row(phrases.get(source),
                everyTerm.get(source), singleWords(judged.get(source), written)));
        System.out.printf("%ntook %d seconds%n", (System.nanoTime() - began) / 1_000_000_000L);
    }

    private static void row(final PhraseBar phrases, final PhraseBar everyTerm, final String words) {
        System.out.printf("%-8s   %8d %8d %7.1f %7s   %8d %8d %7.1f %7s   %-34s %s%n",
                phrases.vocabulary(), phrases.observed(), phrases.chanceExpectedBest(),
                phrases.timesTheBar(), phrases.exceedsChance() ? "yes" : "no",
                everyTerm.observed(), everyTerm.chanceExpectedBest(), everyTerm.timesTheBar(),
                everyTerm.exceedsChance() ? "yes" : "no",
                verdict(phrases, everyTerm), words);
    }

    /** What changed hands, which is the only column a reader comparing two walks needs. */
    static String verdict(final PhraseBar phrases, final PhraseBar everyTerm) {
        if (phrases.exceedsChance() == everyTerm.exceedsChance()) {
            return phrases.exceedsChance() ? "both" : "neither";
        }
        return phrases.exceedsChance() ? "lost by admitting single words" : "gained by admitting single words";
    }

    /**
     * The single words of one source standing in declared names, most-written first — found by the same
     * walk the every-term null counts, so a longer term covering a word hides it here too.
     */
    static String singleWords(final TermIndex index, final List<WrittenRun> written) {
        final TermSpans spans = new TermSpans(index);
        final Map<String, Integer> counts = new LinkedHashMap<>();
        written.forEach(name -> spans.in(name.words()).stream()
                .filter(span -> span.length() == 1)
                .filter(span -> !name.declaredAt().restatesItsType(span.words()))
                .forEach(span -> counts.merge(span.words().getFirst(), 1, Integer::sum)));
        final String named = counts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(NAMED_WORDS)
                .map(word -> word.getKey() + " " + word.getValue())
                .collect(Collectors.joining(", "));
        return counts.size() <= NAMED_WORDS ? named
                : named + ", and " + (counts.size() - NAMED_WORDS) + " more";
    }

    /** Every vocabulary a reading matches and every control it is judged against, in that order. */
    private static List<TermIndex> judged() {
        return Stream.of(BundledTaxonomies.values()).map(BundledTaxonomies::index)
                .map(SpecificTerms::of)
                .map(TermIndex.class::cast)
                .toList();
    }
}
