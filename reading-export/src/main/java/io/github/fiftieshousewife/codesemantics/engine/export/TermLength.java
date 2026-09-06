package io.github.fiftieshousewife.codesemantics.engine.export;

/**
 * The length a kind of evidence qualified on: a vocabulary's terms of more than one word, or its terms of
 * exactly one. A kind answers with the evidence that cleared its own bar, so the concept it answers with
 * is filtered to the length that bar counted.
 */
enum TermLength {

    PHRASE {
        @Override
        boolean admits(final int wordsInTerm) {
            return wordsInTerm > ONE_WORD;
        }
    },

    SINGLE_WORD {
        @Override
        boolean admits(final int wordsInTerm) {
            return wordsInTerm == ONE_WORD;
        }
    };

    private static final int ONE_WORD = 1;

    abstract boolean admits(int wordsInTerm);
}
