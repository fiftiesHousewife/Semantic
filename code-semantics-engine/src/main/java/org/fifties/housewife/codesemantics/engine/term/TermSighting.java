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
 */
public record TermSighting(List<String> words, List<SkosConcept> concepts, double specificity,
                           int occurrences, String firstSite) {

    public TermSighting {
        words = List.copyOf(words);
        concepts = List.copyOf(concepts);
    }

    public TermSighting seenAgain() {
        return new TermSighting(words, concepts, specificity, occurrences + 1, firstSite);
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
