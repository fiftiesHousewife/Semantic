package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.PublishedPhrases;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.WorkingJavaRuns;

/**
 * Which of a vocabulary's phrases the repository under reading writes, how often it writes each, and whether
 * working Java has been shown to write the same run.
 *
 * <p>It is the workings behind the two halves of {@link PhraseNullProbe}'s table: a phrase the corpus writes
 * is one {@link SpecificTerms} takes, and this is where a figure that moved can be traced to the runs that
 * moved it.
 */
public final class TermhoodProbe {

    private final WorkingJavaRuns corpus = WorkingJavaRuns.fromClasspath();

    private TermhoodProbe() {
    }

    public static void main(final String[] arguments) {
        new TermhoodProbe().report();
    }

    private void report() {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        System.out.printf("%n%s — %d declared runs%n", tree.root().getFileName(), written.size());
        judged().forEach(index -> report(index, written));
    }

    private void report(final TermIndex index, final List<WrittenRun> written) {
        final Map<List<String>, Integer> found = writtenPhrasesOf(index, written);
        final long taken = found.keySet().stream().filter(corpus::writes).count();
        System.out.printf("%n%s — %d distinct phrases, %d taken by the corpus%n",
                index.source(), found.size(), taken);
        found.entrySet().stream()
                .sorted(Map.Entry.<List<String>, Integer>comparingByValue().reversed()
                        .thenComparing(run -> PublishedPhrases.runOf(run.getKey())))
                .forEach(run -> System.out.printf("    %-40s %6d  %s%n",
                        PublishedPhrases.runOf(run.getKey()), run.getValue(),
                        corpus.writes(run.getKey()) ? "working Java writes it" : "the publisher's own"));
    }

    private static Map<List<String>, Integer> writtenPhrasesOf(final TermIndex index,
                                                               final List<WrittenRun> written) {
        final TermSpans spans = new TermSpans(index);
        final PhraseStarts starts = PhraseStarts.of(index);
        final Map<List<String>, Integer> found = new HashMap<>();
        written.stream()
                .filter(name -> starts.couldBeIn(name.words()))
                .forEach(name -> spans.phrasesIn(name.words()).stream()
                        .filter(span -> !name.declaredAt().restatesItsType(span.words()))
                        .forEach(span -> found.merge(span.words(), 1, Integer::sum)));
        return found;
    }

    private static List<TermIndex> judged() {
        return Stream.concat(
                        Stream.of(MatchedTaxonomies.values()).map(MatchedTaxonomies::index),
                        Stream.of(ControlTaxonomies.values()).map(ControlTaxonomies::index))
                .toList();
    }
}
