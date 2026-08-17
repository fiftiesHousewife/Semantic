package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedSourceSets;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.ScopeLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

/** How the ranking's divergence accumulates, so a cutoff can be argued about rather than picked. */
public final class VocabularyMassProbe {

    private static final double[] FRACTIONS = {0.5, 0.75, 0.9, 0.95, 0.99, 1.0};

    private VocabularyMassProbe() {
    }

    public static void main(final String[] args) {
        final RepositoryLegibility legibility = TreeReading.ofTheCloneUnderReading().legibility();
        report("names in a source set the build publishes", names(legibility, true));
        report("names in every other source set", names(legibility, false));
        report("everything written, names and prose", legibility.repository().written());
    }

    private static void report(final String population, final WrittenWords written) {
        final List<ChosenWord> shown = ChosenWords.againstEnglishAndThePlatform().in(written).stream()
                .filter(word -> !word.theLanguages())
                .filter(word -> word.claim() > 0.0)
                .toList();
        final double bits = shown.stream().mapToDouble(ChosenWord::claim).sum();
        System.out.printf("%n%s — %,d words carry a positive claim, %.4f bits between them%n",
                population, shown.size(), bits);
        System.out.printf("  %-8s %8s %10s %12s %10s %10s%n",
                "of bits", "words", "occurrences", "boundary", "its bits", "its count");
        for (final double fraction : FRACTIONS) {
            print(shown, bits, fraction);
        }
        printAt(shown, bits, 250);
    }

    private static void print(final List<ChosenWord> shown, final double bits, final double fraction) {
        double running = 0.0;
        for (int place = 0; place < shown.size(); place++) {
            running += shown.get(place).claim();
            if (running >= bits * fraction - 1e-12) {
                printAt(shown, bits, place + 1);
                return;
            }
        }
    }

    private static void printAt(final List<ChosenWord> shown, final double bits, final int words) {
        final List<ChosenWord> held = shown.subList(0, Math.min(words, shown.size()));
        final ChosenWord last = held.get(held.size() - 1);
        System.out.printf("  %-8.1f%% %8d %9.1f%% %12s %10.6f %10d%n",
                held.stream().mapToDouble(ChosenWord::claim).sum() / bits * 100.0, held.size(),
                held.stream().mapToDouble(ChosenWord::share).sum() * 100.0, last.word(), last.claim(),
                last.occurrences());
    }

    private static WrittenWords names(final RepositoryLegibility legibility, final boolean published) {
        final PublishedSourceSets sets = new PublishedSourceSets();
        return WrittenWords.pooling(legibility.scopes().stream()
                .filter(scope -> sets.publishes(scope.name()) == published)
                .map(ScopeLegibility::written)
                .toList()).asNamesOnly();
    }
}
