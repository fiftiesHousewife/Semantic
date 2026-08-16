package org.fifties.housewife.codesemantics.name;

/**
 * Whether a dictionary carries a run of letters as one word — {@code collocated}, {@code synset},
 * {@code abstains}, {@code headword}.
 *
 * <p>The segmenter prices candidate pieces against a frequency list of twenty thousand words, so a run that
 * list does not carry is taken apart into pieces it does, however ordinary the run is as English:
 * {@code abstains} reads as ab / stains and {@code annotation} as an / notation. A dictionary states the
 * length of a word, so it is what refuses the split, and no threshold and no list of runs is involved.
 *
 * <p><b>This is not {@link CitedTokens}, and the two must not be one seam.</b> A cited token is a published
 * catalogue naming a run as a unit, and the segmenter both refuses to split it <em>and</em> prices it as a
 * readable piece of some larger run. A dictionary word is only the first of those: knowing that
 * {@code collocated} is a word says nothing about whether {@code col} may stand as a piece of something else,
 * and pricing every dictionary entry as a piece would find a reading for very nearly any run of letters.
 *
 * <p>The default carries nothing, so a segmenter given no dictionary reads a compound purely by frequency.
 */
@FunctionalInterface
public interface WholeWords {

    /** Carries nothing. The honest default until a dictionary is supplied. */
    WholeWords NONE = word -> false;

    boolean carries(String word);
}
