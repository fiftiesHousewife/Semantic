package org.fifties.housewife.codesemantics.name;

/**
 * What one candidate piece of a compound costs to read: its Zipf cost against the frequency list, or the
 * cost of a cited token, or {@link #UNPARSEABLE} when nothing reads it. Cost rather than a boolean, because
 * a segmenter choosing between parses must prefer the common reading to the merely possible one —
 * {@code userid} is user / id and not use / rid because the first pieces are cheaper.
 *
 * <p>A short piece is held to a rarity floor. The frequency list carries junk fragments (tc, ri, ars, ity)
 * that would let any identifier "parse", so a two- or three-letter run only counts as a word when it is
 * genuinely common, and two-letter runs demand more than three-letter ones because almost any two letters
 * appear somewhere in the list.
 */
final class PieceCost {

    /** No resource reads the piece, so no parse containing it can be scored. */
    static final double UNPARSEABLE = Double.POSITIVE_INFINITY;

    /** Cost added per piece, so a split into many fragments never beats a split into few words. */
    private static final double PIECE_PENALTY = 3.0;

    /** A cited token is a published standard's own vocabulary; it costs what a moderately common word does. */
    private static final double CITED_TOKEN_RANK = 2000.0;

    private static final int TWO_LETTERS = 2;
    private static final int SHORT_PIECE_MAX_LENGTH = 3;
    private static final int COMMON_TWO_LETTER_RANK = 1000;
    private static final int COMMON_THREE_LETTER_RANK = 6000;

    private final WordRanks words;
    private final CitedTokens cited;

    PieceCost(final WordRanks words, final CitedTokens cited) {
        this.words = words;
        this.cited = cited;
    }

    double of(final String piece) {
        final int rank = words.rank(piece);
        if (rank != WordRanks.UNKNOWN_RANK && genuinelyCommon(piece, rank)) {
            return Math.log(rank) + PIECE_PENALTY;
        }
        return cited.recognises(piece) ? Math.log(CITED_TOKEN_RANK) + PIECE_PENALTY : UNPARSEABLE;
    }

    /** Whether anything reads the piece at all — the same judgement {@link #of} prices. */
    boolean reads(final String piece) {
        return of(piece) != UNPARSEABLE;
    }

    /**
     * What an unread run costs when a parse spends its one branding residual on it: the price of the rarest
     * word the list carries, so a residual is always dearer than reading the same letters as a word.
     */
    double residualCost() {
        return Math.log(words.size()) + PIECE_PENALTY;
    }

    private static boolean genuinelyCommon(final String piece, final int rank) {
        if (piece.length() > SHORT_PIECE_MAX_LENGTH) {
            return true;
        }
        return rank <= (piece.length() == TWO_LETTERS ? COMMON_TWO_LETTER_RANK : COMMON_THREE_LETTER_RANK);
    }
}
