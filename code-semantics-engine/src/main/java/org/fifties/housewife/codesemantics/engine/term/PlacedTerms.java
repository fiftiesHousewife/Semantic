package org.fifties.housewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;

/**
 * The one split in the term reading that tells a real match from a collision, and it is the publisher's own.
 *
 * <p>A taxonomy states a superclass for some of its concepts and not for others. OLiA names no parent for
 * {@code Verb}, {@code Noun}, {@code Clause}, {@code Affix} or {@code Collocation} — their superclass is an
 * anonymous restriction or belongs to an ontology it imports rather than carries — and those are, almost
 * exactly, the terms a repository writes because it works in the field. The concepts it does place are
 * reached through discourse and text structure, and they arrive carrying {@code topic}, {@code source},
 * {@code set}, {@code evidence} and {@code text}: ordinary English that collides with a published name.
 *
 * <p><b>Neither list was written here.</b> Where a concept sits is read off the {@code broader} column by
 * {@link StatedAncestry}, so the separation is a citation. It is also the first thing in this library that
 * tells one match from another without weighing a word — two terms of the same length and the same rarity
 * fall on opposite sides because their publisher put them there.
 *
 * <p>It may be a fact about OLiA rather than about term taxonomies, and that is stated rather than assumed:
 * FIBO's hierarchy is dense, so a "states no parent" rule would select almost nothing there. A second source
 * has to show the same split before this is believed of taxonomies in general.
 */
public final class PlacedTerms {

    private final StatedAncestry ancestry;

    public PlacedTerms(final StatedAncestry ancestry) {
        this.ancestry = ancestry;
    }

    /** The terms whose concept the taxonomy states no superclass for, heaviest first. */
    public List<TermSighting> atTheirOwnRoot(final List<TermSighting> sightings) {
        return ranked(sightings.stream().filter(sighting -> !isPlaced(sighting)).toList());
    }

    /** The terms the taxonomy places under a superclass of its own, heaviest first. */
    public List<TermSighting> placed(final List<TermSighting> sightings) {
        return ranked(sightings.stream().filter(this::isPlaced).toList());
    }

    /** The branch the taxonomy states above a term, which is what a reader checks a collision against. */
    public String branchOf(final TermSighting sighting) {
        return ancestry.rootOf(labelOf(sighting));
    }

    private boolean isPlaced(final TermSighting sighting) {
        return ancestry.of(labelOf(sighting)).size() > 1;
    }

    private static String labelOf(final TermSighting sighting) {
        return sighting.concepts().getFirst().prefLabel();
    }

    private static List<TermSighting> ranked(final List<TermSighting> sightings) {
        return sightings.stream()
                .sorted(Comparator.comparingDouble(TermSighting::mass).reversed())
                .toList();
    }

    /** How many times the terms on one side of the split were written. */
    public static int spansIn(final List<TermSighting> sightings) {
        return sightings.stream().mapToInt(TermSighting::occurrences).sum();
    }
}
