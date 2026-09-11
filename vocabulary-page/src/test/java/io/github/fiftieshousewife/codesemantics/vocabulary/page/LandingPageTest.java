package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSummary;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.export.SetAside;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class LandingPageTest {

    private static final List<String> FIELD =
            List.of("OLiA", "CWE", "FIX", "FpML", "FIBO", "BIAN", "CSO");

    private static ReadingExport reading(final String repository, final List<ExportedAnswer> answers,
                                         final List<ExportedTaxonomy> taxonomies) {
        return ReadingExport.of(
                new ExportedSummary(repository, "c0ffee", answers, List.of(), List.of(), List.of(),
                        List.of(), List.of(), List.of(), 0.9, 0.5,
                        new ExportedSummary.Counts(0, 0, 0)),
                List.of(), Map.of(), List.of(), taxonomies,
                new SetAside(0, 0, 0, 0, 0, 0, List.of(), 0, 0, 0));
    }

    private static ReadingExport vocabularyAnswered(final String repository, final String source,
                                                    final int phrases, final int bar,
                                                    final double timesItsBar) {
        return reading(repository,
                List.of(ExportedAnswer.fromATaxonomy(source, List.of(), "AConcept", null,
                        phrases + " phrases", timesItsBar)),
                List.of(new ExportedTaxonomy(source, List.of(), List.of(),
                        Map.of("words", phrases, "lemmas", 0, "expansions", 0, "senses", 0),
                        new ExportedTaxonomy.Bar(phrases, bar, bar - 1, timesItsBar, 0, 0.001, 7,
                                FIELD, 999))));
    }

    private static ReadingExport schemeAnswered(final String repository) {
        return reading(repository,
                List.of(ExportedAnswer.fromASubjectScheme("arXiv", List.of(), "Computer Science",
                        "0.053 bits", 0.053)),
                List.of());
    }

    private final LandingPage landing = new LandingPage("");

    @Test
    void drawsOneCardPerReadingLinkingToItsPage() {
        final String page = landing.markup(List.of(
                vocabularyAnswered("quickfixj", "FIX", 52, 5, 10.4)));

        assertAll(
                () -> assertThat(page).contains("href=\"quickfixj/reading.html\""),
                () -> assertThat(page).contains("FIX states 52 of its phrases"));
    }

    @Test
    void ordersVocabularyAnswersBeforeSchemesAndSchemesBeforeNothing() {
        final String page = landing.markup(List.of(
                reading("maven", List.of(ExportedAnswer.NONE), List.of()),
                schemeAnswered("tika"),
                vocabularyAnswered("quickfixj", "FIX", 52, 5, 10.4)));

        assertThat(page.indexOf("quickfixj"))
                .isLessThan(page.indexOf("tika"));
        assertThat(page.indexOf("tika"))
                .isLessThan(page.indexOf("maven"));
    }

    @Test
    void drawsTheStrongestVocabularyMarkAtTheFullWidthOfTheSharedScale() {
        final String page = landing.markup(List.of(
                vocabularyAnswered("quickfixj", "FIX", 52, 5, 10.4),
                vocabularyAnswered("strata", "FpML", 47, 17, 2.8)));

        assertAll(
                () -> assertThat(page).contains("width:100.0%"),
                () -> assertThat(page).contains("10.4× its chance bar"),
                () -> assertThat(page).contains("2.8× its chance bar"));
    }

    @Test
    void statesASchemeAnswersStrengthInItsOwnUnit() {
        assertThat(landing.markup(List.of(schemeAnswered("tika"))))
                .contains("0.053 bits nearer than chance");
    }
}
