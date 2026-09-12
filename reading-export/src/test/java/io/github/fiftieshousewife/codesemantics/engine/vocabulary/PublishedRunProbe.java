package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

/**
 * Where the runs a resource publishes as one entry stand at each stage of the signal pipeline: written in
 * the published names, ranked, clearing every reference's bar, and left after the words English supplies
 * are set aside. The schema promises a signal keeps its spaces where a published run carried it, and no
 * committed reading shows one, so this names the stage the runs stop at.
 *
 * <p>It prints; nothing votes on it and no published figure moves.
 */
public final class PublishedRunProbe {

    private static final int NAMED = 12;

    private PublishedRunProbe() {
    }

    public static void main(final String[] arguments) {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final WrittenWords published = new PublishedNames().published(tree.legibility());
        final List<String> written = spacedIn(published);
        final List<ChosenWord> ranked = ChosenWords.againstEnglishAndTheCorpus().in(published);
        final Map<String, Double> bars = VocabularyNull.byReference(tree.namesChance());

        final List<ChosenWord> rankedRuns = ranked.stream()
                .filter(word -> isARun(word.word()))
                .toList();
        final List<ChosenWord> clearing = rankedRuns.stream()
                .filter(word -> word.clears(bars))
                .toList();
        final List<ChosenWord> signals = clearing.stream()
                .filter(word -> !word.theLanguages())
                .toList();

        System.out.printf("%n%s — published runs by stage: written %d, ranked %d, clearing every bar %d, "
                        + "in the signals %d%n",
                tree.root().getFileName(), written.size(), rankedRuns.size(), clearing.size(),
                signals.size());
        System.out.printf("%nmost-written runs in the published names:%n");
        written.stream()
                .limit(NAMED)
                .forEach(run -> System.out.printf("  %-40s %6d occurrences%n",
                        run, published.occurrencesOf(run)));
        System.out.printf("%nranked runs, highest margin first:%n");
        rankedRuns.stream()
                .sorted(Comparator.comparingDouble(ChosenWord::margin).reversed())
                .limit(NAMED)
                .forEach(run -> System.out.printf("  %-40s %6d occurrences, margin %.6f bits, %s%n",
                        run.word(), run.occurrences(), run.margin(), stoppedBy(run, bars)));
    }

    /** The resources join a published run with underscores; the schema's prose says spaces. Count both. */
    private static boolean isARun(final String word) {
        return word.contains("_") || word.contains(" ");
    }

    private static List<String> spacedIn(final WrittenWords published) {
        return published.words().stream()
                .filter(word -> isARun(word))
                .sorted(Comparator.comparingInt(published::occurrencesOf).reversed())
                .toList();
    }

    private static String stoppedBy(final ChosenWord run, final Map<String, Double> bars) {
        if (!run.clears(bars)) {
            return "below a reference's bar";
        }
        return run.theLanguages() ? "set aside as the language's own words" : "a signal";
    }
}
