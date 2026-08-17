package io.github.fiftieshousewife.codesemantics.engine.reading;

/**
 * What a scope's reading counted. Every figure is an occurrence count rather than a distinct-token count,
 * because a word a codebase writes forty times is a word that codebase is forty times more about — with two
 * exceptions named as such, {@link #distinctWords} and {@link #wordsSeenOnce}, which answer how long the tail
 * is rather than what the scope is about.
 *
 * <p>Names and prose are counted apart because they are different evidence. A name is what the author called
 * a thing; a sentence is what they said about it. A reading that pooled them without saying so would let a
 * densely documented file outvote a densely named one without a reader ever seeing why.
 *
 * @param declarations  names the scope declares — types, methods, fields, parameters, locals, dependencies
 * @param nameWords     word occurrences those names split into
 * @param proseWords    word occurrences read from javadoc and comments
 * @param read          word occurrences, of either kind, at least one bundled resource can be cited for
 * @param gluedRunsRead runs no boundary divided that the segmenter unglued into words
 * @param distinctWords distinct word surfaces behind them
 * @param wordsSeenOnce distinct word surfaces occurring exactly once — the tail's own measure
 */
public record OccurrenceCounts(int declarations, int nameWords, int proseWords, int read, int gluedRunsRead,
                               int distinctWords, int wordsSeenOnce) {

    /** Every word occurrence the scope offered to the resources, named or written. */
    public int words() {
        return nameWords + proseWords;
    }

    /**
     * Legibility λ: the share of word occurrences some resource can be cited for, bounded in {@code [0, 1]}
     * with a maximum that follows from its definition rather than from a choice. A scope with no words at all
     * reads zero, which is neither a reading nor a failure — there was nothing to read.
     */
    public double legibility() {
        return share(read, words());
    }

    /** The share of word occurrences that came from prose rather than from a name. */
    public double proseShare() {
        return share(proseWords, words());
    }

    /** The share of distinct words occurring exactly once — how much of the vocabulary is a tail. */
    public double tailShare() {
        return share(wordsSeenOnce, distinctWords);
    }

    private static double share(final int part, final int whole) {
        return whole == 0 ? 0.0 : (double) part / whole;
    }
}
