package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Every run of words any bundled publisher states as one entry: the two topical dictionaries' collocations
 * and the seven term vocabularies' multi-word concept labels, as one index.
 *
 * <p>No reading runs on it, and that was measured rather than assumed. A run a term vocabulary states and no
 * topical resource labels is counted in the denominator and votes nothing, so the words inside it stop
 * voting; on the nine evaluation-set members the placement fell and the reading was reverted.
 *
 * <p>It is the index the reference corpus's run table is pooled under. That table answers how often working
 * Java writes a vocabulary's own terms, and a run the index does not state is never merged and so never
 * counted — a term absent from the index would look absent from the corpus whatever the corpus writes.
 */
public final class EveryPublishedRun {

    private EveryPublishedRun() {
    }

    /** The dictionaries' runs and the term vocabularies' runs pooled into one index. */
    public static PublishedPhrases newInstance() {
        return new PublishedPhrases(Stream.concat(
                        PublishedPhrases.fromClasspath().stated().stream(),
                        PublishedTermRuns.fromClasspath().written().stream())
                .map(run -> run.toLowerCase(Locale.ROOT))
                .collect(Collectors.toUnmodifiableSet()));
    }
}
