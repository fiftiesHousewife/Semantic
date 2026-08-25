package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.reading.WordStage;

/**
 * One word this repository wrote, with what every reference says about it and where to go and look.
 *
 * <p>{@code claim} is in bits and is the weakest of the references' claims, so a word reaches the top of a
 * ranking only where every reference agrees this repository writes it more densely than it does. A reference
 * that writes the word more densely than this repository states so as a negative claim: nothing is dropped
 * for failing, it sorts below everything that passed.
 *
 * @param claim         the weakest claim in bits, signed by which side the word concentrates in
 * @param share         the share of every word occurrence in the repository this word holds
 * @param inNames       how many of its occurrences were the name of something rather than prose about it
 * @param theLanguages  whether English supplied the word, so writing it was not a choice about a subject
 * @param removedAt     the pipeline stage that removes the word, or {@code null} where every stage keeps
 *                      it. {@code SYMBOL} for {@code x} and {@code id}, {@code SHORTHAND} for {@code buf}
 *                      and {@code ref}. It states where a word left the reading that places, so the two
 *                      readings can be shown against each other instead of quietly disagreeing
 */
public record ChosenWord(String word, int occurrences, int inNames, double claim, double share,
                         List<ReferenceClaim> against, String site, boolean theLanguages,
                         WordStage removedAt) {

    /** Whether the pipeline that decides what the reading places keeps this word at every stage. */
    public boolean survivesThePipeline() {
        return removedAt == null;
    }

    /**
     * What one reference says: the share it writes the word at, the bits between that and this tree, and
     * the margin — the same term with the reference's own sampling error held against the word.
     *
     * @param margin the signed term at the reference's share moved one standard error toward this
     *               repository's. Where the reference states no error it equals {@link #claim()}, and a
     *               word whose margin is refused sits within the reference's error: it has not been shown
     *               to stand above chance
     */
    public record ReferenceClaim(String reference, double share, double bits, boolean writtenMoreHere,
                                 double margin) {

        /** The bits, signed by which side wrote the word more densely — how much of a claim this is. */
        public double claim() {
            return writtenMoreHere ? bits : -bits;
        }
    }

    public ChosenWord {
        against = List.copyOf(against);
    }

    /** The share of its occurrences that were names, which says whether the code or its prose carried it. */
    public double nameShare() {
        return occurrences == 0 ? 0.0 : (double) inNames / occurrences;
    }

    /** The weakest margin any reference leaves this word, which is what the verdict rests on. */
    public double margin() {
        return against.stream()
                .mapToDouble(ReferenceClaim::margin)
                .min()
                .orElse(0.0);
    }

    /**
     * Whether every reference's margin for this word stands outside what that reference's own null produced
     * by chance. It is the weakest-claim rule applied to the bound, taken at each reference's own sampling
     * error: a word whose claim clears the bar only where the reference's share is taken exactly at its
     * estimate has not been shown to stand above chance.
     */
    public boolean clears(final Map<String, Double> barByReference) {
        return against.stream()
                .allMatch(claim -> claim.margin() > barFor(claim.reference(), barByReference));
    }

    /** Whether the claims clear the bars while some margin does not — inside a reference's error. */
    public boolean withinTheReferencesError(final Map<String, Double> barByReference) {
        return !clears(barByReference) && against.stream()
                .allMatch(claim -> claim.claim() > barFor(claim.reference(), barByReference));
    }

    /** A reference with no derived bar is a defect in the caller, never a bar of zero. */
    private static double barFor(final String reference, final Map<String, Double> barByReference) {
        if (!barByReference.containsKey(reference)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "no bar was derived for %s",
                    reference));
        }
        return barByReference.get(reference);
    }
}
