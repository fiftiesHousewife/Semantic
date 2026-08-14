package org.fifties.housewife.codesemantics.engine.summary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class IndexPageTest {

    private final String page = new IndexPage().of(ReadingIndex.of("CodeSemantics"));

    @Test
    void namesTheRepositoryItIndexes() {
        assertThat(page).contains("Reading — CodeSemantics").contains("<h1>CodeSemantics</h1>");
    }

    @Test
    void putsTheSummaryFirstBecauseItIsTheOnlyOneWithABarOnEveryLine() {
        assertThat(page.indexOf("summary.html"))
                .isLessThan(page.indexOf("themes.html"))
                .isLessThan(page.indexOf("self-reading.html"));
    }

    @Test
    void linksEveryReportTheSelfReadingWrites() {
        assertThat(page).contains("summary.html", "themes-chart.html", "themes.html", "subjects.html",
                "taxonomy.html", "terms.html", "self-reading.html");
    }

    @Test
    void statesTheBarBesideEachSoTwoKindsOfDocumentAreNotConfused() {
        assertAll(
                () -> assertThat(page).contains("What it takes to be printed:"),
                () -> assertThat(page).contains("a denominator, not a finding"),
                () -> assertThat(page)
                        .contains("only topics that distinguish some part of it and that more than one "
                                + "word carries"));
    }
}
