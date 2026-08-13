package org.fifties.housewife.codesemantics.engine.reading;

/**
 * What a scope's reading counted. Every figure is an occurrence count rather than a distinct-token count,
 * because a word a codebase writes forty times is a word that codebase is forty times more about — with two
 * exceptions named as such, {@link #distinctWords} and {@link #wordsSeenOnce}, which answer how long the tail
 * is rather than what the scope is about.
 *
 * @param identifiers   identifier-shaped runs the scan found, comments and literals excluded
 * @param languageWords those the language's own specification names, so not the author's words at all
 * @param words         word occurrences the remaining identifiers split into
 * @param read          word occurrences at least one bundled resource can be cited for
 * @param gluedRunsRead runs no boundary divided that the segmenter unglued into words
 * @param distinctWords distinct word surfaces behind {@link #words}
 * @param wordsSeenOnce distinct word surfaces occurring exactly once — the tail's own measure
 */
public record OccurrenceCounts(int identifiers, int languageWords, int words, int read, int gluedRunsRead,
                               int distinctWords, int wordsSeenOnce) {

    /**
     * Legibility λ: the share of word occurrences some resource can be cited for, bounded in {@code [0, 1]}
     * with a maximum that follows from its definition rather than from a choice. A scope with no words at all
     * reads zero, which is neither a reading nor a failure — there was nothing to read.
     */
    public double legibility() {
        return share(read, words);
    }

    /** The share of identifier occurrences that are the language's own vocabulary and not the author's. */
    public double languageWordShare() {
        return share(languageWords, identifiers);
    }

    /** The share of distinct words occurring exactly once — how much of the vocabulary is a tail. */
    public double tailShare() {
        return share(wordsSeenOnce, distinctWords);
    }

    private static double share(final int part, final int whole) {
        return whole == 0 ? 0.0 : (double) part / whole;
    }
}
