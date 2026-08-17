package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * A published taxonomy answering only where the repository writes more than one concept in the branch the
 * source states the term under.
 *
 * <p><b>Matching {@code preferred} means nothing unless the branch above it was matched too.</b> A concept deep
 * in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never
 * touches has written an English word the taxonomy happens to have claimed. That is the largest measured defect
 * in the term reading: 97% of its matches are one word long and the single largest is {@code topic}, which OLiA
 * states as information structure and this repository means as a subject label in a distribution. The two are
 * not the same concept and a string comparison cannot tell.
 *
 * <p>It is a citation and not a heuristic. The publisher stated the parent, the publisher stated the siblings,
 * and {@link StatedSiblings} counts which of them the repository wrote. Nothing here decided that {@code Topic}
 * belongs beside {@code Focus} and {@code DiscourseEntity}.
 *
 * <p><b>A term written in more than one word is admitted unconditionally.</b> {@code common noun} and
 * {@code base form} are nobody's everyday English, and needing no corroboration is the whole reason term length
 * was worth measuring in the first place. A one-word term standing alone in its branch does not vote zero — it
 * abstains, and the reading that consumes this index never sees it.
 */
public final class CorroboratedTerms implements TermIndex {

    private final TermIndex published;
    private final StatedSiblings siblings;
    private final CitedWord cited;

    private CorroboratedTerms(final TermIndex published, final StatedSiblings siblings,
                              final CitedWord cited) {
        this.published = published;
        this.siblings = siblings;
        this.cited = cited;
    }

    public static CorroboratedTerms of(final TermIndex published, final StatedSiblings siblings) {
        return new CorroboratedTerms(published, siblings, CitedWord.fromClasspath());
    }

    static CorroboratedTerms of(final TermIndex published, final StatedSiblings siblings,
                                final CitedWord cited) {
        return new CorroboratedTerms(published, siblings, cited);
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        final List<SkosConcept> stated = published.conceptsOf(words);
        if (words.size() > 1) {
            return stated;
        }
        return isAWord(words) ? stated.stream().filter(this::accompanied).toList() : List.of();
    }

    /**
     * Whether any resource states the single word as a word at all. A taxonomy may publish anything as a
     * concept — CSO publishes {@code n}, {@code c} and {@code p} — and a term no resource calls a word is
     * one the reading cannot cite, so it abstains before the branch is ever asked.
     */
    private boolean isAWord(final List<String> words) {
        return cited.states(words.getFirst());
    }

    /** Whether the repository writes anything else in the branch the source states this concept under. */
    private boolean accompanied(final SkosConcept concept) {
        return siblings.writtenBeside(concept.prefLabel()) > 0;
    }

    @Override
    public Set<List<String>> terms() {
        return published.terms();
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return published.broaderOf(prefLabel);
    }

    @Override
    public int longestTerm() {
        return published.longestTerm();
    }

    /** Whether the index beneath can read the run at all. The branch rule judges matches, not readability. */
    @Override
    public boolean reads(final List<String> words) {
        return published.reads(words);
    }

    @Override
    public String source() {
        return published.source();
    }

    @Override
    public TermRung rung() {
        return published.rung();
    }
}
