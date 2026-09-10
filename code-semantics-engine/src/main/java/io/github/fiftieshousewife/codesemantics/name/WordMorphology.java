package io.github.fiftieshousewife.codesemantics.name;

import java.util.List;
import java.util.Set;

/**
 * Whether a run of letters is one known word grown by English morphology rather than two things glued
 * together. The dictionary carries base words and not every form derived from them, so without this reading
 * a segmenter is free to take an inflection apart: {@code sugars} would read as sug / ars and {@code flaring}
 * as fla / ring, both of which are parses and neither of which is a word.
 *
 * <p>The rules are grammar — where a word's own edges are — and not vocabulary. What they consult is the
 * frequency list, so a stem is a word because a published resource ranks it and never because this class
 * says so. Only the trailing edge is read: English's inflectional endings are a near-closed class, where a
 * list of derivational prefixes has no citation stating its membership, so a prefixed derivation the
 * frequency list does not rank is read by word frequency alone.
 */
final class WordMorphology {

    /** Derivational and inflectional endings that turn a known word into a form the dictionary may omit. */
    private static final List<String> SUFFIXES = List.of("s", "es", "y", "ed", "ing", "er", "ly");

    /**
     * The suffixes that begin with a vowel, in front of which a stem's final silent {@code e} is elided.
     * A consonant-initial ending ({@code s}, {@code ly}) leaves the stem's spelling alone, so restoring an
     * {@code e} there would invent a stem rather than recover one.
     */
    private static final Set<String> VOWEL_INITIAL_SUFFIXES = Set.of("es", "y", "ed", "ing", "er");

    /** Shorter than this a stem is a fragment, and stripping an affix off it proves nothing. */
    private static final int MIN_STEM_LENGTH = 2;

    private final WordRanks words;

    WordMorphology(final WordRanks words) {
        this.words = words;
    }

    /**
     * An inflected or derived form of a known word is that word, not a compound: {@code sugars} is sugar + s
     * and {@code sugary} is sugar + y, neither of which must be parsed into a residual plus a rare word.
     * A genuine glued compound ({@code userid} = user + id) is untouched, because {@code id} is not one of
     * these suffixes.
     *
     * <p>The bare stem is not always the word, because attaching the suffix can respell it: English elides a
     * stem's final silent {@code e} in front of a vowel-initial ending, so {@code flaring} strips to
     * {@code flar}, which is nothing, while the {@code e} put back gives {@code flare}, which is a word. Both
     * spellings are asked, so an inflection is recognised as one whether or not it kept its stem intact.
     */
    boolean carriesASuffix(final String compound) {
        return SUFFIXES.stream().anyMatch(suffix ->
                compound.length() > suffix.length() + MIN_STEM_LENGTH
                        && compound.endsWith(suffix)
                        && namesAStem(compound.substring(0, compound.length() - suffix.length()), suffix));
    }

    /** Whether the stripped stem is a known word, as it stands or with an elided silent {@code e} restored. */
    private boolean namesAStem(final String stem, final String suffix) {
        return words.knows(stem)
                || (VOWEL_INITIAL_SUFFIXES.contains(suffix) && words.knows(stem + "e"));
    }
}
