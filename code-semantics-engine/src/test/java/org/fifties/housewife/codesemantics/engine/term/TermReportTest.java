package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermReportTest {

    private static final SkosConcept COMMON_NOUN =
            new SkosConcept("olia#CommonNoun", "CommonNoun", "", "", "class", "olia.owl", "");

    private final String rendered = new TermReport().render("OLiA", new MatchedTerms(List.of(
            new TermSighting(List.of("common", "noun"), List.of(COMMON_NOUN), 0.96, 2, "Page.java:4"),
            new TermSighting(List.of("noun"), List.of(COMMON_NOUN), 0.91, 8, "Page.java:6")),
            1000, 10, 6), 5);

    @Test
    void statesTheRateWithTheNamesItWasReadOver() {
        assertThat(rendered).contains("10.00 times per thousand declared names", "10 spans over 1,000 names");
    }

    @Test
    void saysHowManyFilesNothingWasFoundIn() {
        assertThat(rendered).contains("**4 files match nothing at all**");
    }

    @Test
    void splitsTheSpansByHowManyWordsTheTermIsWrittenIn() {
        assertAll(
                () -> assertThat(rendered).contains("| 1 | 8 | 80.0% |"),
                () -> assertThat(rendered).contains("| 2 | 2 | 20.0% |"));
    }

    @Test
    void printsEveryTermOfMoreThanOneWordWhateverItCarries() {
        assertThat(rendered).contains("## Every term of more than one word").contains("`common noun`");
    }

    @Test
    void namesTheConceptTheSourceStatesAndSomewhereToGoAndCheckIt() {
        assertThat(rendered).contains("`CommonNoun`", "`Page.java:4`");
    }
}
