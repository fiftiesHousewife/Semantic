package io.github.fiftieshousewife.codesemantics.engine.theme;

import io.github.fiftieshousewife.codesemantics.name.WordRanks;

/**
 * How much a word narrows a subject, read off the published frequency list: {@code the} narrows nothing,
 * {@code lexicon} narrows a great deal. The scale is {@code log(rank) / log(size)}, so it is bounded in
 * {@code [0, 1]} by the list's own length rather than by a chosen constant, and a word the list does not
 * carry at all is as specific as the list can say.
 *
 * <p>It exists because a sentence is not a name. An author choosing to call something {@code cursor} has said
 * something; an author writing {@code a} has obeyed English, which requires articles whatever the subject.
 * The words that hold a sentence together are the language's forms and not the author's vocabulary — the same
 * distinction the parse already draws between a declaration and a use, drawn again inside prose, and drawn by
 * a resource that states its own contents rather than by a list of words to ignore.
 *
 * <p>It is a weight and never a gate: the commonest word in English still votes, at the smallest weight the
 * list can express.
 */
public final class WordSpecificity {

    private final WordRanks ranks;
    private final double commonest;

    public WordSpecificity(final WordRanks ranks) {
        this.ranks = ranks;
        this.commonest = Math.log(ranks.size());
    }

    public static WordSpecificity fromClasspath() {
        return new WordSpecificity(WordRanks.fromClasspath());
    }

    public double of(final String word) {
        final int rank = ranks.rank(word);
        return rank == WordRanks.UNKNOWN_RANK ? 1.0 : Math.min(1.0, Math.log(rank) / commonest);
    }
}
