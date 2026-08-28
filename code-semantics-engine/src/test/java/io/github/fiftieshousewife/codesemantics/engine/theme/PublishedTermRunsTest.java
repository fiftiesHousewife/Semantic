package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The multi-word concept labels of the bundled term vocabularies, read through the splitter a declared name
 * is read through.
 */
class PublishedTermRunsTest {

    private final Set<String> written = PublishedTermRuns.fromClasspath().written();

    @Test
    void readsAPublishersIdentifierAndItsEnglishToTheSameRun() {
        assertAll(
                () -> assertThat(written)
                        .as("FIBO states the label as one identifier")
                        .contains("interest_rate_swap"),
                () -> assertThat(written)
                        .as("CSO states the label as three English words")
                        .contains("natural_language_processing"),
                () -> assertThat(written)
                        .as("BIAN states the label with a space and a capital on each word")
                        .contains("ach_fulfillment"));
    }

    @Test
    void statesNoRunForALabelOfOneWord() {
        assertAll(
                () -> assertThat(written)
                        .as("OLiA states Determiner and one word says nothing about adjacency")
                        .doesNotContain("determiner"),
                () -> assertThat(written).allSatisfy(run -> assertThat(run).contains("_")));
    }

    @Test
    void reachesEveryBundledTermVocabulary() {
        assertAll(
                () -> assertThat(written).as("OLiA").contains("common_noun"),
                () -> assertThat(written).as("FpML").contains("cap_floor"),
                () -> assertThat(written).as("CWE").contains("integer_overflow_or_wraparound"),
                () -> assertThat(written).as("FIX").contains("account_reporting"));
    }
}
