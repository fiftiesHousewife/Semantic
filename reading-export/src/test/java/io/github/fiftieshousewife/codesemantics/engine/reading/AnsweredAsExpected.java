package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;

/**
 * Whether a member's reading did what the manifest says it is there to demonstrate: a vocabulary fires on
 * a positive control and stays silent on a negative one.
 *
 * <p>The two are counted apart because they are different claims. Firing where a domain is present says
 * the vocabularies reach it; staying silent where it is absent says they do not reach everywhere, and a
 * single figure over both would let one buy the other.
 */
final class AnsweredAsExpected {

    private static final String POSITIVE = "positive-control";
    private static final String NEGATIVE = "negative-control";

    /** Whether this expected result is one a vocabulary answer can satisfy or fail. */
    boolean scores(final String expectedResult) {
        return POSITIVE.equals(expectedResult) || NEGATIVE.equals(expectedResult);
    }

    boolean of(final String expectedResult, final List<String> answered) {
        return POSITIVE.equals(expectedResult) == !answered.isEmpty();
    }

    /** The counts a run reports, kept apart for the same reason the claims are. */
    static final class Tally {

        private int positives;
        private int positivesFiring;
        private int negatives;
        private int negativesSilent;
        private int unscored;

        void add(final String expectedResult, final List<String> answered) {
            if (POSITIVE.equals(expectedResult)) {
                positives++;
                positivesFiring += answered.isEmpty() ? 0 : 1;
            } else if (NEGATIVE.equals(expectedResult)) {
                negatives++;
                negativesSilent += answered.isEmpty() ? 1 : 0;
            } else {
                unscored++;
            }
        }

        int positives() {
            return positives;
        }

        int positivesFiring() {
            return positivesFiring;
        }

        int negatives() {
            return negatives;
        }

        int negativesSilent() {
            return negativesSilent;
        }

        int unscored() {
            return unscored;
        }
    }
}
