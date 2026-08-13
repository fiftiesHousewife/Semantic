package org.fifties.housewife.codesemantics.name;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

/**
 * Splits a glued lowercase run into the dictionary words and cited tokens it is made of ({@code pushevent}
 * into push / event, {@code dslcontext} into dsl / context), choosing the parse whose pieces are cheapest
 * under a frequency (Zipf) cost, so {@code userid} resolves to the common user / id rather than the rare
 * use / rid. This is the last rule of identifier splitting, reached only for a residual no case or separator
 * boundary divided.
 *
 * <p>One unrecognised two-or-three-letter run is tolerated at the leading edge — the branding initialism of
 * {@code gharchive}. A token the dictionary already knows, a short token, or one without a convincing parse
 * (whole-token coverage in pieces averaging at least three letters) is refused rather than guessed at, so
 * ordinary words and opaque identifiers like {@code tconst} are never mangled. Refusal is the correct
 * outcome and not a failure: a run nothing can read stays whole and abstains.
 */
public final class WordSegmenter {

    private static final int MIN_COMPOUND_LENGTH = 6;
    private static final int MIN_PIECE_LENGTH = 2;

    /**
     * The frequency list carries junk fragments (tc, ri, ars, ity) that would let any identifier —
     * or a derived word like periodicity — "parse"; a short piece only counts as a word when it is
     * genuinely common. Two-letter runs demand more evidence than three-letter ones because almost
     * any two letters appear somewhere in the list.
     */
    private static final int SHORT_PIECE_MAX_LENGTH = 3;
    private static final int COMMON_TWO_LETTER_RANK = 1000;
    private static final int COMMON_THREE_LETTER_RANK = 6000;

    /** A parse averaging shorter pieces than this is fragment soup, not words. */
    private static final double MIN_AVERAGE_PIECE_LENGTH = 3.0;

    private static final int MIN_RESIDUAL_LENGTH = 2;
    private static final int MAX_RESIDUAL_LENGTH = 3;

    /** Cost added per piece, so a split into many fragments never beats a split into few words. */
    private static final double PIECE_PENALTY = 3.0;

    /** A cited token is a published standard's own vocabulary; it costs what a moderately common word does. */
    private static final double CITED_TOKEN_RANK = 2000.0;

    private static final double UNPARSEABLE = Double.POSITIVE_INFINITY;

    private final WordRanks words;
    private final CitedTokens cited;

    private WordSegmenter(final WordRanks words, final CitedTokens cited) {
        this.words = words;
        this.cited = cited;
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
     * The lowercase pieces of a glued compound, or empty when the token is already a known word or a cited
     * token, too short to be a compound, or has no convincing parse into known pieces.
     */
    /** Derivational and inflectional endings that turn a known word into a form the dictionary may omit. */
    private static final List<String> WORD_SUFFIXES = List.of("s", "es", "y", "ed", "ing", "er", "ly");

    /**
     * The suffixes that begin with a vowel, in front of which a stem's final silent {@code e} is elided.
     * A consonant-initial ending ({@code s}, {@code ly}) leaves the stem's spelling alone, so restoring an
     * {@code e} there would invent a stem rather than recover one.
     */
    private static final Set<String> VOWEL_INITIAL_SUFFIXES = Set.of("es", "y", "ed", "ing", "er");

    /** Derivational beginnings that do the same from the front: unforced, nonzero, recount. */
    private static final List<String> WORD_PREFIXES = List.of(
            "un", "re", "de", "non", "pre", "dis", "mis", "over", "under", "sub", "anti", "semi");

    public Optional<List<String>> segment(final String token) {
        final String compound = token.toLowerCase(Locale.ROOT);
        if (compound.length() < MIN_COMPOUND_LENGTH || !lettersOnly(compound)
                || words.knows(compound) || cited.recognises(compound)
                || isKnownWordWithSuffix(compound) || isKnownWordWithPrefix(compound)) {
            return Optional.empty();
        }
        return candidateParses(compound).stream()
                .filter(parse -> averagePieceLength(parse.pieces()) >= MIN_AVERAGE_PIECE_LENGTH)
                .min(Comparator.comparingDouble(Parse::cost))
                .map(Parse::pieces);
    }

    /**
     * An inflected or derived form of a known word is that word, not a compound: {@code sugars} is sugar + s
     * and {@code sugary} is sugar + y, neither of which must be parsed into a residual plus a rare word
     * ({@code sug} + {@code ars}, {@code su} + {@code gary}). The dictionary carries the base word but not
     * every derived form; stripping a common suffix and checking the stem covers the gap. A genuine glued
     * compound ({@code userid} = user + id) is untouched, because {@code id} is not one of these suffixes.
     *
     * <p>The bare stem is not always the word, because attaching the suffix can respell it: English elides a
     * stem's final silent {@code e} in front of a vowel-initial ending, so {@code flaring} strips to
     * {@code flar}, which is nothing, while the {@code e} put back gives {@code flare}, which is a word. Both
     * spellings are asked, so an inflection is recognised as one whether or not it kept its stem intact —
     * otherwise the parser is free to read it as a compound and {@code flaring} becomes fla / ring.
     */
    private boolean isKnownWordWithSuffix(final String compound) {
        return WORD_SUFFIXES.stream().anyMatch(suffix ->
                compound.length() > suffix.length() + MIN_PIECE_LENGTH
                        && compound.endsWith(suffix)
                        && namesAStem(compound.substring(0, compound.length() - suffix.length()), suffix));
    }

    /** Whether the stripped stem is a known word, as it stands or with an elided silent {@code e} restored. */
    private boolean namesAStem(final String stem, final String suffix) {
        return words.knows(stem)
                || (VOWEL_INITIAL_SUFFIXES.contains(suffix) && words.knows(stem + "e"));
    }

    /**
     * The mirror of {@link #isKnownWordWithSuffix} on the leading edge: a derivational prefix in front of a
     * known word is that word grown by morphology, not a compound — {@code unforced} is forced with un in
     * front, which must not be read as a brand called un glued to forced the way {@code gharchive} is gh
     * glued to archive. The branding-residual tolerance stays for residuals that are not derivational
     * prefixes, which is exactly what separates gh from un.
     */
    private boolean isKnownWordWithPrefix(final String compound) {
        return WORD_PREFIXES.stream().anyMatch(prefix ->
                compound.length() > prefix.length() + MIN_PIECE_LENGTH
                        && compound.startsWith(prefix)
                        && words.knows(compound.substring(prefix.length())));
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
        return pieces.stream().allMatch(piece -> pieceCost(piece) != UNPARSEABLE);
    }

    private record Parse(List<String> pieces, double cost) {

        Parse prepend(final String residual, final double residualCost) {
            final List<String> extended = new ArrayList<>();
            extended.add(residual);
            extended.addAll(pieces);
            return new Parse(List.copyOf(extended), cost + residualCost);
        }
    }

    /**
     * The whole-word parse, plus the parses that spend the one leading residual. A residual only
     * pairs with a remainder that is itself a single word or acronym — a branding initialism glued
     * to one word — never with a chain of fragments, which is how an opaque identifier would sneak
     * through. Only the leading edge tolerates a residual: an unrecognised trailing run against a
     * known stem is morphology, not branding — periodicity is periodic grown by a suffix, not a
     * compound of periodic and a word called ity.
     */
    private List<Parse> candidateParses(final String compound) {
        final List<Parse> candidates = new ArrayList<>();
        wordParse(compound).ifPresent(candidates::add);
        final double residualCost = Math.log(words.size()) + PIECE_PENALTY;
        for (int length = MIN_RESIDUAL_LENGTH;
                length <= Math.min(MAX_RESIDUAL_LENGTH, compound.length() - MIN_PIECE_LENGTH); length++) {
            final String leading = compound.substring(0, length);
            singlePieceParse(compound.substring(length))
                    .map(parse -> parse.prepend(leading, residualCost))
                    .ifPresent(candidates::add);
        }
        return candidates;
    }

    private Optional<Parse> singlePieceParse(final String text) {
        final double cost = pieceCost(text);
        return cost == UNPARSEABLE ? Optional.empty() : Optional.of(new Parse(List.of(text), cost));
    }

    /** Cheapest full cover of the text by dictionary words and acronyms, at least two pieces. */
    private Optional<Parse> wordParse(final String text) {
        final int length = text.length();
        if (length < MIN_PIECE_LENGTH) {
            return Optional.empty();
        }
        final double[] costToParse = new double[length + 1];
        final int[] pieceStart = new int[length + 1];
        Arrays.fill(costToParse, UNPARSEABLE);
        costToParse[0] = 0.0;
        for (int end = MIN_PIECE_LENGTH; end <= length; end++) {
            for (int start = 0; start + MIN_PIECE_LENGTH <= end; start++) {
                if (costToParse[start] == UNPARSEABLE) {
                    continue;
                }
                final double candidate = costToParse[start] + pieceCost(text.substring(start, end));
                if (candidate < costToParse[end]) {
                    costToParse[end] = candidate;
                    pieceStart[end] = start;
                }
            }
        }
        if (costToParse[length] == UNPARSEABLE) {
            return Optional.empty();
        }
        final Deque<String> pieces = new ArrayDeque<>();
        for (int end = length; end > 0; end = pieceStart[end]) {
            pieces.addFirst(text.substring(pieceStart[end], end));
        }
        return Optional.of(new Parse(List.copyOf(pieces), costToParse[length]));
    }

    private double pieceCost(final String piece) {
        final int rank = words.rank(piece);
        if (rank != WordRanks.UNKNOWN_RANK && genuinelyCommon(piece, rank)) {
            return Math.log(rank) + PIECE_PENALTY;
        }
        return cited.recognises(piece) ? Math.log(CITED_TOKEN_RANK) + PIECE_PENALTY : UNPARSEABLE;
    }

    private static boolean genuinelyCommon(final String piece, final int rank) {
        if (piece.length() > SHORT_PIECE_MAX_LENGTH) {
            return true;
        }
        return rank <= (piece.length() == MIN_PIECE_LENGTH
                ? COMMON_TWO_LETTER_RANK : COMMON_THREE_LETTER_RANK);
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
