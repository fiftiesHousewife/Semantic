package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * The phrases a vocabulary's chance bar counted against the phrases the reading publishes at the same level,
 * named on both sides.
 *
 * <p>The two counts should agree, because both are the walk over the publisher's own spellings. Where they
 * do not, the difference is what the normalisations cost: the reading offers a run to four levels longest-first, so a
 * long run answered by a dictionary consumes words a shorter published phrase began in, and the bar — which
 * walks one level — finds the shorter phrase the reading never reached. This prints those phrases rather than
 * the difference between two totals, because a count that disagrees by one is a claim until the phrase is
 * named.
 */
public final class CountedPhraseProbe {

    private CountedPhraseProbe() {
    }

    public static void main(final String[] arguments) {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        System.out.printf("%n%s — %d declared runs%n", tree.root().getFileName(), written.size());
        System.out.printf("%n%-8s %8s %8s   %s%n", "source", "counted", "published", "counted and unreached");
        List.of(BundledTaxonomies.values()).forEach(taxonomy -> row(taxonomy, tree, written));
    }

    private static void row(final BundledTaxonomies taxonomy, final TreeReading tree,
                            final List<WrittenRun> written) {
        final SpecificTerms judged = SpecificTerms.of(taxonomy.index());
        final Set<String> counted = countedBy(judged, written);
        final Set<String> published = publishedAtTheCountedLevel(judged, taxonomy, tree);
        System.out.printf("%-8s %8d %8d   %s%n", taxonomy.index().source(), counted.size(),
                published.size(), counted.stream().filter(phrase -> !published.contains(phrase)).toList());
    }

    /** The bar's own walk, at the one level it draws its deals at, keeping the phrases rather than the count. */
    private static Set<String> countedBy(final TermIndex judged, final List<WrittenRun> written) {
        final TermSpans spans = new TermSpans(judged);
        final PhraseStarts starts = PhraseStarts.of(judged);
        return written.stream()
                .filter(name -> starts.couldBeIn(name.words()))
                .flatMap(name -> spans.phrasesIn(name.words()).stream()
                        .filter(span -> !name.declaredAt().restatesItsType(span.words()))
                        .map(span -> String.join(" ", span.words())))
                .collect(Collectors.toUnmodifiableSet());
    }

    private static Set<String> publishedAtTheCountedLevel(final SpecificTerms judged,
                                                          final BundledTaxonomies taxonomy,
                                                          final TreeReading tree) {
        return CorroboratedReading.of(judged, taxonomy.index().publishedConcepts(), tree.parsed())
                .matched()
                .at(MatchNormalisation.WORDS)
                .longerThanOneWord().stream()
                .map(TermSighting::term)
                .collect(Collectors.toUnmodifiableSet());
    }
}
