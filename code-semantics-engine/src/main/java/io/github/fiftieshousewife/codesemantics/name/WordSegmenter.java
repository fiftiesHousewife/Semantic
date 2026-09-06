package io.github.fiftieshousewife.codesemantics.name;

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
 * {@code gharchive}. A token the frequency list already knows, a token grown from a known word by
 * {@link WordMorphology morphology}, a short token, or one without a convincing parse (whole-token coverage
 * in pieces averaging at least three letters) is refused rather than guessed at, so ordinary words and opaque
 * identifiers like {@code tconst} are never mangled. Refusal is the correct outcome and not a failure: a run
 * nothing can read stays whole and abstains.
 *
 * <p>The frequency list is twenty thousand words long, and a run it does not carry is taken apart into pieces
 * it does — {@code abstains} as ab / stains, {@code annotation} as an / notation. {@link WholeWords} is what
 * refuses that: a run a dictionary carries as one word is one word, whatever the list says. Supply one
 * through {@link #reading}, or the segmenter reads frequency alone.
 *
 * @see CompoundParses the candidate parses it chooses between
 * @see PieceCost what one piece costs to read
 * @see WholeWords the runs a dictionary carries as one word
 */
public final class WordSegmenter {

    private static final int MIN_COMPOUND_LENGTH = 6;

    /** A parse averaging shorter pieces than this is fragment soup, not words. */
    private static final double MIN_AVERAGE_PIECE_LENGTH = 3.0;

    private final WordRanks words;
    private final CitedTokens cited;
    private final WholeWords dictionary;
    private final WordMorphology morphology;
    private final PieceCost pieceCost;
    private final CompoundParses parses;

    private WordSegmenter(final WordRanks words, final CitedTokens cited, final WholeWords dictionary) {
        this.words = words;
        this.cited = cited;
        this.dictionary = dictionary;
        this.morphology = new WordMorphology(words);
        this.pieceCost = new PieceCost(words, cited);
        this.parses = new CompoundParses(pieceCost);
    }

    /** The segmenter reading frequency alone: no catalogue and no dictionary, so nothing is known whole. */
    public static WordSegmenter fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The same segmenter, arbitrating candidate pieces against a catalogue of cited tokens. */
    public static WordSegmenter citing(final CitedTokens cited) {
        return new WordSegmenter(WordRanks.fromClasspath(), cited, WholeWords.NONE);
    }

    /** The same segmenter, refusing to divide any run a dictionary carries as one word. */
    public static WordSegmenter reading(final WholeWords dictionary) {
        return new WordSegmenter(WordRanks.fromClasspath(), CitedTokens.NONE, dictionary);
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
     * Whether an already-separated token reads as words — the judgement {@link #segment} applies to a glued
     * compound, asked of pieces split on case or punctuation the segmenter cannot see. A multi-piece list
     * whose joined form the vocabulary knows whole is refused however well the pieces score ({@code mcdonald}
     * is never mc / donald); otherwise every piece must be a genuinely common word or a recognised acronym.
     * A single piece has no split to discourage, so the whole-token veto does not apply to it; an empty list
     * reads as nothing.
     */
    public boolean readAsWords(final List<String> pieces) {
        if (pieces.isEmpty()) {
            return false;
        }
        final String whole = String.join("", pieces);
        if (pieces.size() > 1 && (words.knows(whole) || dictionary.carries(whole))) {
            return false;
        }
        return pieces.stream().allMatch(pieceCost::reads);
    }

    private boolean isNotACompound(final String compound) {
        return compound.length() < MIN_COMPOUND_LENGTH
                || !lettersOnly(compound)
                || words.knows(compound)
                || dictionary.carries(compound)
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
            new WordSegmenter(WordRanks.fromClasspath(), CitedTokens.NONE, WholeWords.NONE);
}
