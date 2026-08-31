package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

/**
 * How often a published source's terms of more than one word stand inside a repository's declared names,
 * counting every name a term stands in rather than the term once.
 *
 * <p>It is {@link MatchedPhrases} answering the other question that class states and declines: how often,
 * where it counts how many. The two separate readings the distinct count reads alike. Tika writes nine of
 * FpML's terms, 25 times between them; quickfixj writes 53 of FIX's, 717 times. Counted distinctly those
 * are 9 against 53 and each clears its own bar; counted by occurrence they are two orders of magnitude
 * apart.
 *
 * <p><b>Both sides are still one function of one kind of input.</b> A deal of a source's own words is
 * matched against the same declared names the source is, so a dealt run is written as often as the names
 * it stands in, exactly as a published term is. What the distinct count buys — that a deal states as many
 * terms as the source does — a repository held still supplies here instead: neither side's occurrences can
 * move, because the names are the same names.
 */
public final class PhraseOccurrences {

    private final ReachedPhrases reached;

    public PhraseOccurrences(final ReachedPhrases reached) {
        this.reached = reached;
    }

    /** The reading over one source's published spellings, at the same rung {@link MatchedPhrases} reads. */
    public static PhraseOccurrences over(final TermIndex index) {
        return new PhraseOccurrences(ReachedPhrases.over(index));
    }

    public int in(final List<WrittenRun> names) {
        return reached.in(names).occurrences();
    }
}
