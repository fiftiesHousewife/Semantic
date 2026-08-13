package org.fifties.housewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Accumulates the terms a repository was found to write, one declared name at a time.
 *
 * <p>It counts what was read as well as what was found, because a match rate needs a denominator and the
 * denominator has to be the names actually offered rather than the lines in the file. A term written twice in
 * one name is two sightings; a term written in two files is two sightings with one site, and the site kept is
 * the first.
 */
public final class TermTally {

    private final PhraseSpecificity specificity;
    private final Map<List<String>, TermSighting> byTerm = new HashMap<>();

    private int namesRead;
    private int filesRead;
    private int filesMatched;
    private int spansFound;

    public TermTally(final PhraseSpecificity specificity) {
        this.specificity = specificity;
    }

    public void readName() {
        namesRead++;
    }

    public void readFile(final boolean matched) {
        filesRead++;
        filesMatched += matched ? 1 : 0;
    }

    public void saw(final TermSpan span, final String site) {
        spansFound++;
        byTerm.merge(span.words(),
                new TermSighting(span.words(), span.concepts(), specificity.of(span.words()), 1, site),
                (seen, arrived) -> seen.seenAgain());
    }

    public int spansFound() {
        return spansFound;
    }

    public MatchedTerms matched() {
        return new MatchedTerms(List.copyOf(byTerm.values()), namesRead, filesRead, filesMatched);
    }
}
