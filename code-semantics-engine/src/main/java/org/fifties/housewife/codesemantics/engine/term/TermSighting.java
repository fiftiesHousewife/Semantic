package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * One published term as a repository wrote it: how often it appeared in a declared name, what the source
 * states beneath it, what a run of those words is worth, and one place to go and look.
 *
 * <p>The site is the first one, kept because a figure nobody can check is not evidence. A term reported as
 * matching two hundred times with nowhere to see it is a claim; the same term with a file and a line is a
 * reading someone can argue with.
 *
 * <p>The rung is what the two sides were compared at, and it belongs on the sighting rather than only on the
 * report so that no consumer can sum a reading across it by accident.
 */
public record TermSighting(List<String> words, List<SkosConcept> concepts, TermRung rung, double specificity,
                           int occurrences, List<String> sites) {

    /** Enough places to check a pattern; a figure nobody can look up is a claim rather than evidence. */
    private static final int SITES_KEPT = 12;

    public TermSighting {
        words = List.copyOf(words);
        concepts = List.copyOf(concepts);
        sites = List.copyOf(sites);
    }

    public TermSighting seenAgain(final String site) {
        final List<String> seen = new java.util.ArrayList<>(sites);
        if (seen.size() < SITES_KEPT && !seen.contains(site)) {
            seen.add(site);
        }
        return new TermSighting(words, concepts, rung, specificity, occurrences + 1, seen);
    }

    /** One place to start looking, kept for a report that has room for only one. */
    public String firstSite() {
        return sites.isEmpty() ? "" : sites.getFirst();
    }

    /** What the term is worth in total: how often it was written, weighed by how much writing it narrows. */
    public double mass() {
        return specificity * occurrences;
    }

    public int length() {
        return words.size();
    }

    public String term() {
        return String.join(" ", words);
    }
}
