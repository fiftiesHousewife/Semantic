package io.github.fiftieshousewife.codesemantics.engine.theme;

import io.github.fiftieshousewife.codesemantics.name.WordRanks;

/**
 * How much a word narrows a subject, read off the published frequency list: {@code the} narrows almost
 * nothing, {@code lexicon} narrows a great deal. The scale is {@code log(rank + 1) / log(size + 1)}, so it is
 * bounded in {@code (0, 1]} by the list's own length rather than by a chosen constant, and a word the list
 * does not carry at all is as specific as the list can say.
 *
 * <p>It exists because a sentence is not a name. An author choosing to call something {@code cursor} has said
 * something; an author writing {@code a} has obeyed English, which requires articles whatever the subject.
 * The words that hold a sentence together are the language's forms and not the author's vocabulary — the same
 * distinction the parse already draws between a declaration and a use, drawn again inside prose, and drawn by
 * a resource that states its own contents rather than by a list of words to ignore.
 *
 * <p><b>It is a weight and never a gate</b>, and the arithmetic downstream requires that literally.
 * {@link PhraseTopics} takes the geometric mean of what a phrase's words committed, each scaled by what it is
 * worth, so a weight of exactly zero sends one word's term to negative infinity and takes the whole phrase's
 * reading to nothing. Rank 1 therefore takes the smallest weight the list can express and not zero, which is
 * what {@code rank + 1} buys — the same scale {@link CorpusSpecificity} states over the corpus.
 */
public final class WordSpecificity implements WordNarrowing {

    private final WordRanks ranks;
    private final double commonest;

    public WordSpecificity(final WordRanks ranks) {
        this.ranks = ranks;
        this.commonest = Math.log(ranks.size() + 1.0);
    }

    public static WordSpecificity fromClasspath() {
        return new WordSpecificity(WordRanks.fromClasspath());
    }

    @Override
    public double of(final String word) {
        final int rank = ranks.rank(word);
        return rank == WordRanks.UNKNOWN_RANK ? 1.0 : Math.min(1.0, Math.log(rank + 1.0) / commonest);
    }
}
