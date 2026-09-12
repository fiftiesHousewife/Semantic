package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Objects;

/**
 * One source judged in both counting units from one set of deals: how many distinct terms the repository
 * writes, and how often it writes them, each against the bar its own unit's chance draws set.
 *
 * <p>The source stands outside chance only where both units say so. Measured on the eleven evaluation
 * members at ten thousand deals, each unit alone admits what the other refuses — a vocabulary brushed at
 * its edge clears on distinct terms written once or twice each, and a single habitual identifier clears on
 * occurrences alone — and requiring both refuses every one of those while touching nothing that clears
 * both.
 *
 * @param terms       the bar over distinct terms written, {@link CountedPhrases#HOW_MANY}
 * @param occurrences the bar over total occurrences, {@link CountedPhrases#HOW_OFTEN}
 */
public record ConjunctionBar(PhraseBar terms, PhraseBar occurrences) {

    public ConjunctionBar {
        Objects.requireNonNull(terms, "terms");
        Objects.requireNonNull(occurrences, "occurrences");
    }

    /** Whether the repository stands outside chance in both units at once. */
    public boolean exceedsChance() {
        return terms.exceedsChance() && occurrences.exceedsChance();
    }

    /** The smaller of the two multiples — the unit that nearly refused the source is the one reported. */
    public double timesTheBar() {
        return Math.min(terms.timesTheBar(), occurrences.timesTheBar());
    }
}
