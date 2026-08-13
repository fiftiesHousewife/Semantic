package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * One published term found in a phrase: where it began, where it ended, the words it was written in — folded
 * to lower case, which is where the reading stops caring how a language spells its names — and what the
 * source states beneath them.
 *
 * <p>Several concepts, not one. A taxonomy may publish the same term in two of its own modules — OLiA states
 * {@code SemanticFeature} in both {@code olia-top.owl} and {@code olia.owl} — and choosing between them here
 * would be this library deciding something its source did not. The span carries what was published and lets
 * the reading that consumes it say so.
 */
public record TermSpan(int from, int to, List<String> words, List<SkosConcept> concepts, String source) {

    public TermSpan {
        words = List.copyOf(words);
        concepts = List.copyOf(concepts);
    }

    /** How many words the term is written in — the figure the noise measurement splits on. */
    public int length() {
        return to - from;
    }
}
