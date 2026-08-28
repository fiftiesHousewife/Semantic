package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedRuns;

/**
 * A phrase read in the units some publisher states, and in nothing else: a run is merged wherever the index
 * holds it, whatever its edge words are.
 *
 * <p>It is the reading the reference corpus's run table is pooled under, and it is deliberately not
 * {@link CollocatedWords}. That reading refuses a run whose first or last word the dictionary carries no
 * entry for, because a run no resource labels would swallow its words and then vote for nothing — evidence
 * spent for silence. A denominator votes on nothing. Asked how often working Java declares {@code TaskId} or
 * {@code XMLEntityExpansion}, a table that would not merge them can only answer that nobody asked.
 *
 * <p><b>Both sides of the comparison are made the same way, which is the reason.</b> A published term is
 * matched against a repository's declared names by {@code TermSpans}, over the words the splitter produced
 * and with no edge rule anywhere in it. A corpus table those matches are ranked against has to be counted
 * the same way or the two are not comparable.
 */
public final class StatedRuns implements PublishedRuns {

    private final LongestRuns walk;

    public StatedRuns(final PublishedPhrases stated) {
        this.walk = new LongestRuns(stated, words -> true);
    }

    /** Over every run any bundled publisher states — the two dictionaries and the term vocabularies. */
    public static StatedRuns fromClasspath() {
        return new StatedRuns(EveryPublishedRun.newInstance());
    }

    @Override
    public List<String> of(final List<String> words) {
        return walk.of(words);
    }
}
