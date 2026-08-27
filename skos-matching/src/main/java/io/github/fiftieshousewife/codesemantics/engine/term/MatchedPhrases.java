package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

/**
 * How often a published source's terms of more than one word stand inside a repository's declared names,
 * compared at the words the repository wrote.
 *
 * <p>It is the one statistic {@link PhraseNull} judges, and it is a class of its own because the observed
 * figure and every figure of the null have to be the same function of the same kind of input. What a
 * repository wrote and what a deal of its own words produced are two arguments to one method here, never two
 * pieces of arithmetic.
 *
 * <p><b>How often, and not how many.</b> A count of distinct terms cannot be judged against a permutation at
 * all: a deal scatters each word across every name, so it puts a source's words next to each other in more
 * different orders than any repository writes, while a repository writes the same few names over and over. A
 * deal therefore reaches more distinct terms than the text it was dealt from, whatever the text is about,
 * and the comparison measures the shuffling rather than the subject. How often a phrase was written has no
 * such tilt, and it is the quantity the literature's own independence expectation is written for — a
 * corpus's length times the shares of the phrase's words.
 *
 * <p><b>The words themselves, and not the rungs above them.</b> A deal deals out the words a repository
 * wrote, so the count it sets a bar for has to be of those words: a rung comparing what the dictionary says
 * two runs mean is a claim about the dictionary, and a deal of surface words is no reference for it. The rung
 * is carried on every span the reading reports, so this counts one of the figures the reading already states
 * apart rather than a fourth one.
 */
public final class MatchedPhrases {

    private final TermSpans spans;

    private final PhraseStarts starts;

    public MatchedPhrases(final TermSpans spans, final PhraseStarts starts) {
        this.spans = spans;
        this.starts = starts;
    }

    /** The reading over one source's published spellings, which is the ladder's lowest rung. */
    public static MatchedPhrases over(final TermIndex index) {
        return new MatchedPhrases(new TermSpans(index), PhraseStarts.of(index));
    }

    public int in(final List<WrittenRun> names) {
        return names.stream()
                .filter(name -> starts.couldBeIn(name.words()))
                .mapToInt(this::written)
                .sum();
    }

    private int written(final WrittenRun name) {
        return (int) spans.phrasesIn(name.words()).stream()
                .filter(span -> !name.declaredAt().restatesItsType(span.words()))
                .count();
    }
}
