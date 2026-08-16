package org.fifties.housewife.codesemantics.engine.summary;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WalkthroughPageTest {

    private static final ReadingSummary SUMMARY = new ReadingSummary("tree",
            new ReadingSummary.Legibility(0.41, 120_000, 640, 0.71, 0.9),
            new ReadingSummary.Field(
                    new ReadingSummary.Field.Nearest("Computer Science", 0.0812, 0.1104),
                    new ReadingSummary.Field.Nearest("Computation and Language", 0.0900, 0.1200),
                    "Machine Learning", 0.0903),
            List.of(new ReadingSummary.Distinctive("lexicon/src/main/java", 0.0421,
                    List.of("linguistics", "computing"))),
            List.of("linguistics", "computing"),
            List.of(new ReadingSummary.Withheld("docs", "0.0102 bits, and 214 of 999 chance draws stood at "
                    + "least as far")));

    private final String page = new WalkthroughPage()
            .of(ReadingWalkthrough.of("tree", SUMMARY, ReadingIndex.of("tree")));

    @Test
    void statesTheStepsInTheOrderTheAnalysisRunsThem() {
        assertAll(
                () -> assertThat(page.indexOf("The files are parsed"))
                        .isLessThan(page.indexOf("Each name is split into words")),
                () -> assertThat(page.indexOf("Each name is split into words"))
                        .isLessThan(page.indexOf("Each word is looked up")),
                () -> assertThat(page.indexOf("Each word is looked up"))
                        .isLessThan(page.indexOf("The votes are pooled into a distribution")),
                () -> assertThat(page.indexOf("The votes are pooled into a distribution"))
                        .isLessThan(page.indexOf("Each scope is compared against the whole")));
    }

    @Test
    void showsTheChartTheRunWroteRatherThanOneDrawnHere() {
        assertThat(page).contains("src=\"../svg/themes-bar.svg\"", "alt=\"");
    }

    @Test
    void carriesEveryFigureTheSummaryCarriesSoTheTwoCannotDisagree() {
        assertAll(
                () -> assertThat(page).contains("λ = 0.410"),
                () -> assertThat(page).contains("640 files were read"),
                () -> assertThat(page).contains("Computation and Language", "0.0812", "0.1104"),
                () -> assertThat(page).contains("lexicon/src/main/java", "0.0421"),
                () -> assertThat(page).contains("214 of 999 chance draws"));
    }

    @Test
    void namesTheReportThatHoldsTheWholeOfEachStep() {
        assertAll(
                () -> assertThat(page).contains("themes-chart.html", "themes.html", "subjects.html",
                        "taxonomy.html", "evidence.html", "terms.html", "self-reading.html"),
                () -> assertThat(page).contains("What it takes to be printed:"));
    }

    @Test
    void saysThatAnUnreadWordCastsNoVoteRatherThanAVoteOfZero() {
        assertThat(page).contains("not a vote of zero");
    }
}
