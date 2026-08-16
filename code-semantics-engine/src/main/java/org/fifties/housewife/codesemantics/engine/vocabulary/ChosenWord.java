package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Map;

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
 */
public record ChosenWord(String word, int occurrences, int inNames, double claim, double share,
                         List<ReferenceClaim> against, String site, boolean theLanguages) {

    /** What one reference says: the share it writes the word at, and the bits between that and this tree. */
    public record ReferenceClaim(String reference, double share, double bits, boolean writtenMoreHere) {

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

    /**
     * Whether every reference's claim for this word stands outside what that reference's own null produced
     * by chance. It is the weakest-claim rule applied to the bound: a word one reference calls ordinary is
     * ordinary however loudly the other shouts, so a word clears each bar in turn or it clears none.
     */
    public boolean clears(final Map<String, Double> barByReference) {
        return against.stream()
                .allMatch(claim -> claim.claim() > barByReference.getOrDefault(claim.reference(), 0.0));
    }
}
