package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * How a taxonomy can be read, which follows from what its publisher wrote rather than from what anybody
 * decided about it.
 *
 * <p><b>An enum of shapes and not of sources.</b> The sources are an open set — OLiA, FIBO, arXiv, NIST,
 * BIAN, CSO, and whatever clears a licence next — and a closed list of them would go stale the first time
 * one landed. What is closed is the number of ways a file of eight columns can be read, and that is two.
 *
 * <p>The third distinction a reader needs is not here, because it is not derivable. Whether a taxonomy
 * stating prose partitions <em>a field of study</em> or <em>what an organisation does</em> is a fact about
 * the publisher's intent, not about the file: arXiv's categories and BIAN's service domains are the same
 * shape and answer different questions. The README names that difference; this enum states only what the
 * code can decide.
 */
public enum TaxonomyShape {

    /**
     * Prose per concept, so a scope's reading and a concept's description are two distributions over one
     * topic space and a divergence compares them. arXiv, NIST CSF and BIAN are read this way.
     */
    COMPARED_AS_A_DISTRIBUTION,

    /**
     * Labels and no prose, so there is nothing to compare and the only reading is a match against declared
     * names. CSO publishes 14,636 topics and states a definition for none of them.
     */
    MATCHED_AGAINST_NAMES;

    /** What a taxonomy's own concepts say it can be read as. */
    public static TaxonomyShape of(final List<SkosConcept> concepts) {
        return concepts.stream().anyMatch(concept -> !concept.definition().isBlank())
                ? COMPARED_AS_A_DISTRIBUTION : MATCHED_AGAINST_NAMES;
    }

    public boolean isMatchedAgainstNames() {
        return this == MATCHED_AGAINST_NAMES;
    }
}
