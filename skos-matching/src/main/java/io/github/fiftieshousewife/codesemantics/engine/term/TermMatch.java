package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

/**
 * One published term as a repository wrote it, and what became of the match.
 *
 * <p>The rung is carried per match rather than per reading, so nothing can sum a figure across rungs by
 * accident: a term found in the words the repository wrote and a term found in what the dictionary says
 * those words mean are different strengths of evidence.
 *
 * <p>Several concepts, not one. A publisher may state the same term in two of its own modules, and choosing
 * between them here would be this library deciding something its source did not.
 *
 * <p>The sites are where the term was written, as {@code path:line}, and there are at most twelve of them —
 * enough to check a pattern. The permalink base for all of them is stated once at the top of the document.
 *
 * @param vocabulary  the publisher the term comes from
 * @param term        the published term, as the words it is written in
 * @param wordsInTerm how many words that is; a term of one word is the one the branch rule governs
 * @param rung        what the two sides were compared at
 * @param specificity how far writing the term narrows the subject matter, bounded in {@code [0, 1]}
 * @param occurrences how often the repository wrote it inside a declared name
 * @param outcome     whether it was admitted or removed, and by which rule
 * @param concepts    the labels the publisher states the term under
 * @param sites       where it was written
 */
public record TermMatch(String vocabulary, String term, int wordsInTerm, TermRung rung, double specificity,
                        int occurrences, TermOutcome outcome, List<String> concepts, List<String> sites) {

    public TermMatch {
        concepts = List.copyOf(concepts);
        sites = List.copyOf(sites);
    }

    /** What the match is worth: how often it was written, weighed by how much writing it narrows. */
    public double mass() {
        return specificity * occurrences;
    }
}
