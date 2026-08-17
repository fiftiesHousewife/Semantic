package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * What a bundled taxonomy must be able to answer for its terms to be matched against code, and nothing more.
 * It exists so that a second source needs an extraction and a header, not a second reading.
 *
 * <p>The unit is a <em>run of words</em> rather than a string, because both sides of the match have already
 * been split by the same grammar: {@code AdjectivePhrase} in an ontology and {@code adjectivePhrase} in a
 * program read as the same two words, and neither spelling is privileged. That is the whole of what a term
 * index is for — the source publishes identifiers, a repository declares identifiers, and the match is
 * identifier to identifier with no English in between.
 *
 * <p>{@link #longestTerm()} is a fact about the resource, not a limit anyone set: it is what bounds the
 * longest-match walk, so a source publishing nothing longer than two words is never asked about three.
 */
public interface TermIndex {

    /**
     * Every concept this source publishes under exactly this run of words, or nothing where it publishes
     * none. The run arrives in lower case, so an index is keyed the same way and no implementation carries
     * the case rule twice.
     */
    List<SkosConcept> conceptsOf(List<String> words);

    /**
     * Every run of words this source publishes a term under. It is what lets one index be built over another —
     * a reading that compares meanings rather than spellings needs the source's own runs to normalise, and
     * asking for them is cheaper than every source learning how to be normalised.
     */
    Set<List<String>> terms();

    /** How many words the longest term this index holds is written in. */
    int longestTerm();

    /**
     * Whether this index can read the run at all, which is a different answer from publishing no term for it.
     *
     * <p>An index keyed by a normalisation abstains where the normalisation cannot be taken: a run of words
     * the dictionary carries no entry for has no dictionary form and no sense, and the index has not searched
     * and found nothing, it has been unable to look. A string comparison can always look, so an index keyed by
     * the words themselves always reads.
     */
    default boolean reads(final List<String> words) {
        return true;
    }

    /**
     * The concept this source states the named one sits directly beneath, or nothing where it names none.
     *
     * <p>A label rather than a concept, because that is what a taxonomy publishes in the column: OLiA states
     * {@code CommonNoun}'s parent as a name, and a name is what can be followed. Where the source is silent —
     * because the superclass is an anonymous restriction, or belongs to an ontology it imports rather than
     * carries — the chain ends, and a chain that ends is a fact about the resource and not a gap to fill.
     */
    Optional<String> broaderOf(String prefLabel);

    /** The published resource speaking, so a match cites the taxonomy that stated it. */
    String source();

    /**
     * What this index compares at, so every span it answers records how far the two sides had to be
     * generalised before they met.
     */
    TermRung rung();
}
