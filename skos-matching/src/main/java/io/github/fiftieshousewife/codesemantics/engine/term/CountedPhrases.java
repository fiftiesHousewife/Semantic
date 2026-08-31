package io.github.fiftieshousewife.codesemantics.engine.term;

/**
 * The two questions a source's phrase matches can be counted for, each as its own statistic.
 *
 * <p>{@link MatchedPhrases} states the case for the first and declines the second in the same sentence:
 * how many, and not how often. That is a claim about which reading is worth more, and it is decided by
 * measuring rather than by argument, so both are here and {@link TermOrderNull} draws a bar for either.
 *
 * <p>Each reads its figure off one {@link PhraseReach}, so asking for both costs one walk of the names.
 */
public enum CountedPhrases {

    /** How many of the source's terms the repository wrote, each counted once however often it stands. */
    HOW_MANY {
        @Override
        public int of(final PhraseReach reach) {
            return reach.terms();
        }
    },

    /** How often those terms stand in declared names, counting every name each one stands in. */
    HOW_OFTEN {
        @Override
        public int of(final PhraseReach reach) {
            return reach.occurrences();
        }
    };

    /** This statistic, read off one walk of the repository's names. */
    public abstract int of(PhraseReach reach);
}
