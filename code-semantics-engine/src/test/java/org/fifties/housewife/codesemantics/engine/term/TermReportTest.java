package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermReportTest {

    private static final SkosConcept COMMON_NOUN =
            new SkosConcept("olia#CommonNoun", "CommonNoun", "", "", "class", "olia.owl", "");
    private static final SkosConcept NOUN_PHRASE =
            new SkosConcept("olia#NounPhrase", "NounPhrase", "", "", "class", "olia.owl", "");

    private final String rendered = new TermReport().render("OLiA", new MatchedTerms(List.of(
            new TermSighting(List.of("common", "noun"), List.of(COMMON_NOUN), TermRung.WORDS,
                    0.96, 2, "Page.java:4"),
            new TermSighting(List.of("noun"), List.of(COMMON_NOUN), TermRung.WORDS, 0.91, 8, "Page.java:6"),
            new TermSighting(List.of("nominal", "phrase"), List.of(NOUN_PHRASE), TermRung.SENSES,
                    0.98, 5, "Sense.java:9")),
            1000, 10, 6, Map.of(TermRung.WORDS, 6, TermRung.SENSES, 2)), 5);

    @Test
    void statesWhatEveryRungWasOfferedBeforeWhatAnyOfThemFound() {
        assertThat(rendered).contains("offered 1,000 declared names across 10 files, and 4 of those files "
                + "match nothing on any rung");
    }

    @Test
    void statesARateForEachRungAndNoRateAcrossThem() {
        assertAll(
                () -> assertThat(rendered).contains("## Matched on the words themselves"),
                () -> assertThat(rendered).contains("## Matched on the sense the dictionary carries each "
                        + "word in"),
                () -> assertThat(rendered).contains("10.00 times per thousand declared names",
                        "10 spans over 1,000 names"),
                () -> assertThat(rendered).contains("5.00 times per thousand declared names",
                        "5 spans over 1,000 names"));
    }

    @Test
    void saysHowManyFilesEachRungFoundNothingIn() {
        assertAll(
                () -> assertThat(rendered).contains("**4 files match nothing on this rung**"),
                () -> assertThat(rendered).contains("**8 files match nothing on this rung**"));
    }

    @Test
    void splitsTheSpansByHowManyWordsTheTermIsWrittenIn() {
        assertAll(
                () -> assertThat(rendered).contains("| 1 | 8 | 80.0% |"),
                () -> assertThat(rendered).contains("| 2 | 2 | 20.0% |"),
                () -> assertThat(rendered).contains("| 2 | 5 | 100.0% |"));
    }

    @Test
    void printsEveryTermOfMoreThanOneWordWhateverItCarries() {
        assertThat(rendered).contains("### Every term of more than one word").contains("`common noun`");
    }

    @Test
    void namesTheConceptTheSourceStatesAndSomewhereToGoAndCheckIt() {
        assertThat(rendered).contains("`CommonNoun`", "`Page.java:4`", "`Sense.java:9`");
    }
}
