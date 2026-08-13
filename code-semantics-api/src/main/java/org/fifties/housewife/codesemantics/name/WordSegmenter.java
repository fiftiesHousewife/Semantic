package org.fifties.housewife.codesemantics.name;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * Splits a glued lowercase run into the dictionary words and cited tokens it is made of ({@code pushevent}
 * into push / event, {@code dslcontext} into dsl / context), choosing the parse whose pieces are cheapest
 * under a frequency (Zipf) cost, so {@code userid} resolves to the common user / id rather than the rare
 * use / rid. This is the last rule of identifier splitting, reached only for a residual no case or separator
 * boundary divided.
 *
 * <p>One unrecognised two-or-three-letter run is tolerated at the leading edge — the branding initialism of
 * {@code gharchive}. A token the dictionary already knows, a token grown from a known word by
 * {@link WordMorphology morphology}, a short token, or one without a convincing parse (whole-token coverage
 * in pieces averaging at least three letters) is refused rather than guessed at, so ordinary words and opaque
 * identifiers like {@code tconst} are never mangled. Refusal is the correct outcome and not a failure: a run
 * nothing can read stays whole and abstains.
 *
 * @see CompoundParses the candidate parses it chooses between
 * @see PieceCost what one piece costs to read
 */
public final class WordSegmenter {

    private static final int MIN_COMPOUND_LENGTH = 6;

    /** A parse averaging shorter pieces than this is fragment soup, not words. */
    private static final double MIN_AVERAGE_PIECE_LENGTH = 3.0;

    private final WordRanks words;
    private final CitedTokens cited;
    private final WordMorphology morphology;
    private final PieceCost pieceCost;
    private final CompoundParses parses;

    private WordSegmenter(final WordRanks words, final CitedTokens cited) {
        this.words = words;
        this.cited = cited;
        this.morphology = new WordMorphology(words);
        this.pieceCost = new PieceCost(words, cited);
        this.parses = new CompoundParses(pieceCost);
    }

    /** The segmenter reading frequency alone: no catalogue, so no token is recognised whole. */
    public static WordSegmenter fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The same segmenter, arbitrating candidate pieces against a catalogue of cited tokens. */
    public static WordSegmenter citing(final CitedTokens cited) {
        return new WordSegmenter(WordRanks.fromClasspath(), cited);
    }

    /**
     * The lowercase pieces of a glued compound, or empty when the token is already a known word, a cited
     * token or a known word's derived form, too short to be a compound, or has no convincing parse into
     * known pieces.
     */
    public Optional<List<String>> segment(final String token) {
        final String compound = token.toLowerCase(Locale.ROOT);
        if (isNotACompound(compound)) {
            return Optional.empty();
        }
        return parses.of(compound).stream()
                .filter(parse -> averagePieceLength(parse.pieces()) >= MIN_AVERAGE_PIECE_LENGTH)
                .min(Comparator.comparingDouble(CompoundParses.Parse::cost))
                .map(CompoundParses.Parse::pieces);
    }

    /**
     * Whether an already-separated token reads as words — the same judgement {@link #segment} applies to a
     * glued compound, asked of pieces someone else has split on case or punctuation the segmenter cannot see.
     * Two things must hold, and the first is what keeps a name from being taken apart: <b>the dictionary must
     * not already know the token whole</b>. {@code mcdonald} is a word the frequency list carries, so it is
     * not a compound of mc + donald however well those pieces score — a token the vocabulary knows as one
     * thing is one thing. {@code pushevent} it does not know, so that one is free to be read as its pieces,
     * and then the second condition applies: every piece must be a genuinely common word or a recognised
     * acronym. A single piece has no split to discourage, so the whole-token veto does not apply to it; an
     * empty list reads as nothing.
     */
    public boolean readAsWords(final List<String> pieces) {
        if (pieces.isEmpty()) {
            return false;
        }
        if (pieces.size() > 1 && words.knows(String.join("", pieces))) {
            return false;
        }
        return pieces.stream().allMatch(pieceCost::reads);
    }

    private boolean isNotACompound(final String compound) {
        return compound.length() < MIN_COMPOUND_LENGTH
                || !lettersOnly(compound)
                || words.knows(compound)
                || cited.recognises(compound)
                || morphology.growsAKnownWord(compound);
    }

    private static double averagePieceLength(final List<String> pieces) {
        return pieces.stream().mapToInt(String::length).average().orElse(0.0);
    }

    private static boolean lettersOnly(final String compound) {
        return compound.chars().allMatch(Character::isLetter);
    }

    private static final WordSegmenter CLASSPATH_DEFAULTS =
            new WordSegmenter(WordRanks.fromClasspath(), CitedTokens.NONE);
}
