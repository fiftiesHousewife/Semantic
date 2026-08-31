package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExpandedRunsTest {

    private final ExpandedRuns expanded = ExpandedRuns.fromClasspath();

    @Test
    void writesOutAShortenedWordTheCitationsExpandOnlyOneWay() {
        assertAll(
                () -> assertThat(expanded.of(List.of("extract", "info")))
                        .as("a taxonomy publishing extracting information wrote the same run")
                        .isEqualTo(expanded.of(List.of("extracting", "information"))),
                () -> assertThat(expanded.of(List.of("contact", "info")))
                        .isEqualTo(expanded.of(List.of("contact", "information"))));
    }

    @Test
    void refusesToExpandATokenSeveralSourcesExpandDifferently() {
        assertAll(
                () -> assertThat(expanded.of(List.of("msg", "number")))
                        .as("msg is cited as message, Madison Square Garden and monosodium glutamate, "
                                + "and nothing in the file ranks them")
                        .isNotEqualTo(expanded.of(List.of("message", "number"))),
                () -> assertThat(expanded.of(List.of("auth", "code")))
                        .isNotEqualTo(expanded.of(List.of("authentication", "code"))));
    }

    @Test
    void refusesToWriteOutAWordEnglishUsesInItsOwnRightForADifferentThing() {
        assertAll(
                () -> assertThat(expanded.of(List.of("head", "line")))
                        .as("Wiktionary cites head as headline in journalism, and a repository's head "
                                + "matched FIX's Headline 533 times on one reading")
                        .isNotEqualTo(expanded.of(List.of("headline", "line"))),
                () -> assertThat(expanded.of(List.of("embedded", "part")))
                        .as("and part as participle in grammar")
                        .isNotEqualTo(expanded.of(List.of("embedded", "participle"))),
                () -> assertThat(expanded.of(List.of("heads", "count")))
                        .isNotEqualTo(expanded.of(List.of("headphones", "count"))));
    }

    @Test
    void writesOutAClippingThatCarriesTheSameSense() {
        assertThat(expanded.of(List.of("maths", "test")))
                .as("WordNet carries maths and mathematics in one sense, which is what a clipping is")
                .isEqualTo(expanded.of(List.of("mathematics", "test")));
    }

    @Test
    void leavesAWordThatIsNoAbbreviationAsItsOwnDictionaryForm() {
        assertThat(expanded.of(List.of("public", "keys")))
                .isEqualTo(expanded.of(List.of("public", "key")));
    }

    @Test
    void abstainsWhereAWordHasNoDictionaryForm() {
        assertThat(expanded.of(List.of("zzzq", "info"))).isEmpty();
    }

    @Test
    void refusesToReadOneWordAsAnotherItMerelyShareAMeaningWith() {
        assertThat(expanded.of(List.of("set", "window")))
                .as("expansion is one word written out, never a second word that means the same")
                .isNotEqualTo(expanded.of(List.of("put", "window")));
    }
}
