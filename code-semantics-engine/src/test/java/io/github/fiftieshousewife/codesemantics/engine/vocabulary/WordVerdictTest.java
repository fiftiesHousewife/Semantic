package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordVerdictTest {

    private static final Map<String, Double> BARS = Map.of("ordinary English", 0.01,
            "the reference corpus", 0.02);

    private static ChosenWord.ReferenceClaim claim(final String reference, final double bits,
                                                   final double margin) {
        return new ChosenWord.ReferenceClaim(reference, 0.001, bits, true, margin);
    }

    private static ChosenWord word(final boolean theLanguages, final ChosenWord.ReferenceClaim... against) {
        return new ChosenWord("lemma", 40, 30, 0.0, 0.004, List.of(against),
                "lexicon/src/main/java/Reading.java:9", theLanguages, null);
    }

    @Test
    void standsAWordEveryMarginAdmitsAsASignal() {
        final ChosenWord clear = word(false, claim("ordinary English", 0.05, 0.04),
                claim("the reference corpus", 0.06, 0.05));

        assertThat(WordVerdict.of(clear, BARS)).isEqualTo(WordVerdict.SIGNAL);
    }

    @Test
    void namesAWordBelowAReferencesThreshold() {
        final ChosenWord thin = word(false, claim("ordinary English", 0.004, 0.003),
                claim("the reference corpus", 0.06, 0.05));

        assertThat(WordVerdict.of(thin, BARS)).isEqualTo(WordVerdict.BELOW_A_THRESHOLD);
    }

    @Test
    void namesAWordWhoseClaimsClearWhileAMarginDoesNot() {
        final ChosenWord unsettled = word(false, claim("ordinary English", 0.05, 0.005),
                claim("the reference corpus", 0.06, 0.05));

        assertThat(WordVerdict.of(unsettled, BARS)).isEqualTo(WordVerdict.WITHIN_THE_REFERENCES_ERROR);
    }

    @Test
    void namesAClearingWordEnglishSupplies() {
        final ChosenWord supplied = word(true, claim("ordinary English", 0.05, 0.04),
                claim("the reference corpus", 0.06, 0.05));

        assertThat(WordVerdict.of(supplied, BARS)).isEqualTo(WordVerdict.SUPPLIED_BY_THE_LANGUAGE);
    }

    @Test
    void countsALanguageWordBelowAThresholdAsBelowTheThreshold() {
        final ChosenWord thin = word(true, claim("ordinary English", 0.004, 0.003),
                claim("the reference corpus", 0.06, 0.05));

        assertThat(WordVerdict.of(thin, BARS)).isEqualTo(WordVerdict.BELOW_A_THRESHOLD);
    }
}
