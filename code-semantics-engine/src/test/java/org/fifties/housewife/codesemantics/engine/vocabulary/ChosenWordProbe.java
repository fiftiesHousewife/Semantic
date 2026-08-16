package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.reading.LegibilityReading;
import org.fifties.housewife.codesemantics.engine.reading.PublishedSourceSets;
import org.fifties.housewife.codesemantics.engine.reading.RepositoryLegibility;
import org.fifties.housewife.codesemantics.engine.reading.ScopeLegibility;
import org.fifties.housewife.codesemantics.engine.reading.TreeReading;
import org.fifties.housewife.codesemantics.engine.reading.WrittenWords;

/**
 * Where one named word stands in the vocabulary ranking, and what each reference said to put it there.
 *
 * <p>The report prints a top and a tail cannot be argued with. This answers the question a reader actually
 * has about a word the report never mentioned: how often this repository wrote it, where it placed, and
 * which reference refused it.
 */
public final class ChosenWordProbe {

    private ChosenWordProbe() {
    }

    public static void main(final String[] args) {
        final RepositoryLegibility legibility =
                LegibilityReading.fromClasspath().of(TreeReading.ofTheCloneUnderReading().parsed());
        report("names in a source set the build publishes", published(legibility), args);
        report("names in every other source set", checking(legibility), args);
        report("everything written, names and prose", legibility.repository().written(), args);
    }

    private static void report(final String population, final WrittenWords written, final String[] words) {
        final List<ChosenWord> ranked = ChosenWords.againstEnglishAndThePlatform().in(written);
        System.out.printf("%n%s — %,d occurrences of %,d distinct words%n", population,
                written.totalOccurrences(), ranked.size());
        for (final String word : words) {
            ranked.stream().filter(chosen -> chosen.word().equals(word)).findFirst()
                    .ifPresentOrElse(chosen -> print(ranked.indexOf(chosen) + 1, chosen),
                            () -> System.out.printf("  %-14s never written%n", word));
        }
    }

    private static void print(final int place, final ChosenWord word) {
        System.out.printf("  %-14s place %,5d   written %,5d   here %.4f%%   %s%n", word.word(), place,
                word.occurrences(), word.share() * 100.0,
                word.theLanguages() ? "English supplied it" : "this repository chose it");
        word.against().forEach(claim -> System.out.printf("      %-24s writes it %.4f%%   %s %.6f bits%n",
                claim.reference(), claim.share() * 100.0,
                claim.writtenMoreHere() ? "for  " : "against", claim.bits()));
    }

    private static WrittenWords published(final RepositoryLegibility legibility) {
        return names(legibility, true);
    }

    private static WrittenWords checking(final RepositoryLegibility legibility) {
        return names(legibility, false);
    }

    private static WrittenWords names(final RepositoryLegibility legibility, final boolean published) {
        final PublishedSourceSets sets = new PublishedSourceSets();
        return WrittenWords.pooling(legibility.scopes().stream()
                .filter(scope -> sets.publishes(scope.name()) == published)
                .map(ScopeLegibility::written)
                .toList()).asNamesOnly();
    }
}
