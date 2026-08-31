package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

/**
 * How many of a published source's terms of more than one word stand inside a repository's declared names,
 * compared at the words the repository wrote.
 *
 * <p>It is the one statistic {@link TermOrderNull} judges, and it is a class of its own because the observed
 * figure and every figure of the null have to be the same function of the same kind of input. What a source
 * published and what a deal of its own words states are two arguments to one method here, never two pieces
 * of arithmetic.
 *
 * <p><b>How many, and not how often.</b> One published phrase written eight hundred times is one phrase the
 * repository knows; a source reaching many different phrases of a repository's names is a source the
 * repository works in. That is the rule {@link TaxonomyTree.Node#conceptsWritten()} already states for a
 * branch, applied to a vocabulary.
 *
 * <p>Counting distinct terms is what makes the reference {@link ScrambledTerms} and not a deal of the
 * repository. Dealing the repository puts its words next to each other in more different orders than it
 * wrote them, so a deal of it reaches more distinct terms than the text it came from whatever that text is
 * about; a deal of the <em>source</em> states as many terms as the source does, so the two sides can be
 * counted the same way.
 *
 * <p><b>The words themselves, and not the rungs above them.</b> A rung comparing what the dictionary says
 * two runs mean is a claim about the dictionary, and a deal of a publisher's spellings is no reference for
 * it. The rung is carried on every span the reading reports, so this counts one of the figures the reading
 * already states apart rather than a fourth one.
 */
public final class MatchedPhrases {

    private final ReachedPhrases reached;

    public MatchedPhrases(final ReachedPhrases reached) {
        this.reached = reached;
    }

    /** The reading over one source's published spellings, which is the ladder's lowest rung. */
    public static MatchedPhrases over(final TermIndex index) {
        return new MatchedPhrases(ReachedPhrases.over(index));
    }

    public int in(final List<WrittenRun> names) {
        return reached.in(names).terms();
    }
}
