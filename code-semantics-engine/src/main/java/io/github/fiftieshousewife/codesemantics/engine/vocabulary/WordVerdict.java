package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Map;
import java.util.stream.Stream;

/**
 * What the ranking decided about one word, as one named value: the word stands as a signal, or the one rule
 * that removed it. The rules are asked in declaration order and the first that holds answers, so a language
 * word below a threshold reads as below the threshold — the bar refused it before its origin mattered.
 */
public enum WordVerdict {

    /** The claims clear every bar while a margin does not, so chance has not been excluded. */
    WITHIN_THE_REFERENCES_ERROR {
        @Override
        boolean holds(final ChosenWord word, final Map<String, Double> barByReference) {
            return word.withinTheReferencesError(barByReference);
        }
    },

    /** A margin sits at or below the threshold a reference's own null produced. */
    BELOW_A_THRESHOLD {
        @Override
        boolean holds(final ChosenWord word, final Map<String, Double> barByReference) {
            return !word.clears(barByReference);
        }
    },

    /** Every margin clears and two published resources place the word inside the language. */
    SUPPLIED_BY_THE_LANGUAGE {
        @Override
        boolean holds(final ChosenWord word, final Map<String, Double> barByReference) {
            return word.theLanguages();
        }
    },

    /** Every margin clears and the reading reports the word. */
    SIGNAL {
        @Override
        boolean holds(final ChosenWord word, final Map<String, Double> barByReference) {
            return true;
        }
    };

    /** The first rule that holds for this word, against the bars each reference's null derived. */
    public static WordVerdict of(final ChosenWord word, final Map<String, Double> barByReference) {
        return Stream.of(values())
                .filter(verdict -> verdict.holds(word, barByReference))
                .findFirst()
                .orElseThrow();
    }

    abstract boolean holds(ChosenWord word, Map<String, Double> barByReference);
}
