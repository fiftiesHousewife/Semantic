package io.github.fiftieshousewife.codesemantics.engine.term;

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
    private final Map<List<String>, Integer> restatedTypes = new HashMap<>();
    private final Map<MatchNormalisation, Integer> filesByNormalisation = new EnumMap<>(MatchNormalisation.class);
    private final Set<MatchNormalisation> normalisationsInThisFile = EnumSet.noneOf(MatchNormalisation.class);

    private int namesRead;
    private int filesRead;
    private int filesMatched;

    public TermTally(final PhraseSpecificity specificity) {
        this.specificity = specificity;
    }

    public void readNames(final int count) {
        namesRead += count;
    }

    /**
     * Closes the file being read, counting it once against every normalisation that answered in it. A file is counted
     * for each normalisation separately because a normalisation that matched nowhere and a normalisation that matched
     * everywhere are the distinction the normalisations exist to report.
     */
    public void readFile() {
        filesRead++;
        filesMatched += normalisationsInThisFile.isEmpty() ? 0 : 1;
        normalisationsInThisFile.forEach(normalisation -> filesByNormalisation.merge(normalisation, 1, Integer::sum));
        normalisationsInThisFile.clear();
    }

    /**
     * One sighting of a term, covering that share of the declared name it was found in. A term filling the
     * whole name covers 1; {@code Source} inside {@code EvidenceSource} covers a half.
     */
    public void saw(final TermSpan span, final String site, final double coverage) {
        normalisationsInThisFile.add(span.normalisation());
        byTerm.merge(span.words(),
                new TermSighting(span.words(), span.concepts(), span.normalisation(), specificity.of(span.words()),
                        1, coverage, List.of(site)),
                (seen, arrived) -> seen.seenAgain(site, coverage));
    }

    /**
     * A span the name's own declared type spelled again, recorded by term rather than as one total. Naming
     * what a rule removed is what lets a reader disagree with it concept by concept instead of with a rate.
     */
    public void refusedAsItsOwnType(final TermSpan span) {
        restatedTypes.merge(span.words(), 1, Integer::sum);
    }

    public MatchedTerms matched() {
        return new MatchedTerms(List.copyOf(byTerm.values()), namesRead, filesRead, filesMatched, filesByNormalisation,
                restatedTypes);
    }
}
