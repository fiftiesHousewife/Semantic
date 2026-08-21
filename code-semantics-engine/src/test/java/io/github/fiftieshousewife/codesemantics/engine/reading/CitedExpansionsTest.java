package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CitedExpansionsTest {

    private static CitedExpansions citing(final List<String> expansions, final int meanings) {
        return new CitedExpansions(form -> expansions, form -> meanings);
    }

    @Test
    void findsLettersCitedForMoreThingsThanTheWordMeansToBeShorthand() {
        assertThat(citing(List.of("reference", "referee", "row echelon form"), 1)
                .outnumberTheMeaningsOf("ref")).isTrue();
    }

    @Test
    void findsLettersNoDictionaryCarriesAsAWordToBeShorthand() {
        assertThat(citing(List.of("british union of fascists", "buffalo"), 0)
                .outnumberTheMeaningsOf("buf")).isTrue();
    }

    @Test
    void findsAWordCitedForFewerThingsThanItMeansToBeAWord() {
        assertThat(citing(List.of("testosterone", "treadmill exercise stress test"), 6)
                .outnumberTheMeaningsOf("test")).isFalse();
    }

    @Test
    void findsLettersCitedForOneThingToBeAWordWhateverTheDictionaryKnows() {
        assertThat(citing(List.of("javascript object notation"), 0)
                .outnumberTheMeaningsOf("json")).isFalse();
    }

    @Test
    void countsOneExpansionCitedTwiceAsOneThing() {
        assertThat(citing(List.of("object", "object"), 0).outnumberTheMeaningsOf("obj")).isFalse();
    }

    @Test
    void findsAFormTheDictionaryCitesNothingForToBeAWord() {
        assertThat(new CitedExpansions(form -> List.of(), form -> 3)
                .outnumberTheMeaningsOf("loan")).isFalse();
    }

    @Test
    void readsTheBundledDictionariesForTheFormsThisRuleWasMeasuredOn() {
        final CitedExpansions expansions = CitedExpansions.fromClasspath();
        final Map<String, Boolean> shorthand = Map.of(
                "buf", true, "ref", true, "uri", true, "pom", true, "spec", true,
                "json", false, "xml", false, "obj", false, "trade", false, "test", false);

        assertAll(shorthand.entrySet().stream().map(form -> () ->
                assertThat(expansions.outnumberTheMeaningsOf(form.getKey()))
                        .as(form.getKey())
                        .isEqualTo(form.getValue())));
    }
}
