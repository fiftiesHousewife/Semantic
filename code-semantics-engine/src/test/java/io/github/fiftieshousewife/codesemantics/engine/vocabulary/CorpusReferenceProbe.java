package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WordPipelines;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;

/**
 * What the reference corpus does to a ranking that no stage has filtered.
 *
 * <p>The population is every word the repository declared and nothing else — {@code SYMBOL},
 * {@code SHORTHAND} and {@code LANGUAGE} have not run, so {@code the}, {@code a}, {@code get} and
 * {@code test} are all in the field. That is the point: the plan proposes to retire those stages, and the
 * question is whether a corpus of working Java pushes their words below the chance bar on the evidence.
 * Filtering the field first would answer a different question and answer it by hand.
 */
public final class CorpusReferenceProbe {

    /** Words to report the standing of by name. They are reported, never filtered on. */
    private static final List<String> WATCHED =
            List.of("the", "a", "of", "get", "set", "test", "id", "name", "buf", "x", "word", "topic");

    private static final int SHOWN = 25;

    private CorpusReferenceProbe() {
    }

    public static void main(final String[] arguments) {
        final WrittenWords declared =
                TreeReading.ofTheCloneUnderReading().legibility().repository().written().asNamesOnly();
        final ReferenceVocabulary english = EnglishVocabulary.fromClasspath();
        final ReferenceVocabulary platform = PlatformVocabulary.ofSystem();
        System.out.printf("%,d words, %,d occurrences, no stage having filtered them%n",
                declared.words().size(), declared.totalOccurrences());
        report("English and the platform", List.of(english, platform), declared);
        if (arguments.length == 0) {
            System.out.println("\nName a corpus table to add it as a third reference.");
            return;
        }
        final ReferenceVocabulary corpus = CorpusVocabulary.at(Path.of(arguments[0]));
        System.out.printf("%nThe corpus read from %s: %,d words%n",
                arguments[0], corpus.shareByWord().size());
        report("English, the platform and the corpus", List.of(english, platform, corpus), declared);
        report("the corpus alone", List.of(corpus), declared);
    }

    private static void report(final String references, final List<ReferenceVocabulary> against,
                               final WrittenWords declared) {
        final ChosenWords ranking = new ChosenWords(against, new ShareDivergence(),
                WordPipelines.overJava(ContentWords.fromClasspath()));
        final List<VocabularyNull.Bar> bars = ranking.chanceFor(declared, TreeReading.SEED);
        final Map<String, Double> barByReference = VocabularyNull.byReference(bars);
        final List<ChosenWord> ranked = ranking.in(declared);
        final List<ChosenWord> standing = ranked.stream()
                .filter(word -> word.clears(barByReference))
                .toList();
        System.out.printf("%n=== %s ===%n", references);
        bars.forEach(bar -> System.out.printf("  bar %-28s %.6f bits over a field of %,d%n",
                bar.reference(), bar.bits(), bar.field()));
        System.out.printf("  %,d of %,d words stand above every bar%n", standing.size(), ranked.size());
        System.out.printf("  the first %d: %s%n", SHOWN, standing.stream()
                .limit(SHOWN)
                .map(ChosenWord::word)
                .reduce((left, right) -> left + ", " + right)
                .orElse("none"));
        watched(ranked, barByReference);
        System.out.printf("  every word above chance: %s%n", standing.stream()
                .map(ChosenWord::word)
                .sorted()
                .reduce((left, right) -> left + " " + right)
                .orElse("none"));
    }

    private static void watched(final List<ChosenWord> ranked, final Map<String, Double> barByReference) {
        final Map<String, ChosenWord> byWord = ranked.stream()
                .collect(java.util.stream.Collectors.toUnmodifiableMap(ChosenWord::word, word -> word));
        System.out.printf("  %-8s %10s %12s %10s %s%n",
                "word", "claim", "occurrences", "place", "stands above every bar");
        WATCHED.stream()
                .filter(byWord::containsKey)
                .forEach(word -> print(byWord.get(word), ranked.indexOf(byWord.get(word)) + 1,
                        barByReference));
    }

    private static void print(final ChosenWord word, final int place,
                              final Map<String, Double> barByReference) {
        System.out.printf("  %-8s %10.6f %12d %10d %s%n", word.word(), word.claim(), word.occurrences(),
                place, word.clears(barByReference) ? "yes" : "no");
    }
}
