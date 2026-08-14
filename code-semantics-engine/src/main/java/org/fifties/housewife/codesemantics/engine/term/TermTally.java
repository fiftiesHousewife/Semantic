package org.fifties.housewife.codesemantics.engine.term;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    private final Map<TermRung, Integer> filesByRung = new EnumMap<>(TermRung.class);
    private final Set<TermRung> rungsInThisFile = EnumSet.noneOf(TermRung.class);

    private int namesRead;
    private int filesRead;
    private int filesMatched;

    public TermTally(final PhraseSpecificity specificity) {
        this.specificity = specificity;
    }

    public void readName() {
        namesRead++;
    }

    /**
     * Closes the file being read, counting it once against every rung that answered in it. A file is counted
     * for each rung separately because a rung that matched nowhere and a rung that matched everywhere are the
     * distinction the ladder exists to report.
     */
    public void readFile() {
        filesRead++;
        filesMatched += rungsInThisFile.isEmpty() ? 0 : 1;
        rungsInThisFile.forEach(rung -> filesByRung.merge(rung, 1, Integer::sum));
        rungsInThisFile.clear();
    }

    public void saw(final TermSpan span, final String site) {
        rungsInThisFile.add(span.rung());
        byTerm.merge(span.words(),
                new TermSighting(span.words(), span.concepts(), span.rung(), specificity.of(span.words()),
                        1, List.of(site)),
                (seen, arrived) -> seen.seenAgain(site));
    }

    public MatchedTerms matched() {
        return new MatchedTerms(List.copyOf(byTerm.values()), namesRead, filesRead, filesMatched, filesByRung);
    }
}
