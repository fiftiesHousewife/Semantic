package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
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
                                         final List<String> about,
                                         final List<ExportedPlacement> placedIn,
                                         final List<ExportedTaxonomy> taxonomies) {
        return ReadingExport.of(
                new ExportedSummary(repository, "c0ffee", answers, about, List.of(), placedIn,
                        List.of(), List.of(), List.of(), 0.9, 0.5,
                        new ExportedSummary.Counts(0, 0, 0)),
                List.of(), Map.of(), List.of(), taxonomies,
                new SetAside(0, 0, 0, 0, 0, 0, List.of(), 0, 0, 0));
    }

    private static ExportedPlacement placement(final String scheme, final String subject,
                                               final double divergence, final double chance) {
        return new ExportedPlacement(scheme,
                ExportedPlacement.Level.of(subject, divergence, chance, List.of(), List.of()),
                ExportedPlacement.Level.of(subject, divergence, chance, List.of(), List.of()));
    }

    private static ReadingExport vocabularyAnswered(final String repository, final String source,
                                                    final int phrases, final int bar,
                                                    final double timesItsBar) {
        return reading(repository,
                List.of(ExportedAnswer.fromATaxonomy(source, List.of(), "AConcept", null,
                        phrases + " phrases", timesItsBar)),
                List.of(), List.of(),
                List.of(new ExportedTaxonomy(source, List.of(), List.of(),
                        Map.of("words", phrases, "lemmas", 0, "expansions", 0, "senses", 0),
                        new ExportedTaxonomy.Bar(phrases, bar, bar - 1, timesItsBar, 0, 0.001, 7,
                                FIELD, 999))));
    }

    private static ReadingExport schemeAnswered(final String repository, final double divergence,
                                                final double chance) {
        return reading(repository,
                List.of(ExportedAnswer.fromASubjectScheme("arXiv", List.of(), "Computer Science",
                        "0.053 bits", chance - divergence)),
                List.of(), List.of(placement("arXiv", "Computer Science", divergence, chance)),
                List.of());
    }

    private final LandingPage landing = new LandingPage("");

    @Test
    void drawsOneCardPerReadingLinkingToItsPage() {
        final String page = landing.markup(List.of(
                vocabularyAnswered("quickfixj", "FIX", 52, 5, 10.4)));

        assertAll(
                () -> assertThat(page).contains("href=\"quickfixj/reading.html\""),
                () -> assertThat(page)
                        .as("a source's name answers nothing on its own, so the card leads with the "
                                + "subject the vocabulary's own header states")
                        .contains("About financial information exchange: FIX states 52 of its phrases "
                                + "in the declared names."));
    }

    @Test
    void leadsWithThePlacementWhereItIsTheStrongestAnswer() {
        final String page = landing.markup(List.of(reading("tika",
                List.of(ExportedAnswer.fromASubjectScheme("OpenAlex", List.of(), "Data Mining",
                        "0.1 bits", 0.1)),
                List.of("computer_science", "publishing"),
                List.of(placement("OpenAlex", "Data Mining", 0.3, 0.42)),
                List.of())));

        assertAll(
                () -> assertThat(page)
                        .contains("About Data Mining \u2014 placed there by OpenAlex, 1.4\u00d7 nearer than chance."),
                () -> assertThat(page)
                        .as("a topic every code repository shares names the corpus, so the dictionary "
                                + "topics stay off the cards")
                        .doesNotContain("About computer science"));
    }

    @Test
    void saysSoWhereNothingQualified() {
        assertThat(landing.markup(List.of(reading("maven", List.of(ExportedAnswer.NONE),
                List.of(), List.of(), List.of()))))
                .contains("Nothing qualified");
    }

    @Test
    void ordersCardsByHowFarTheirStrongestAnswerStandsFromItsOwnChance() {
        final String page = landing.markup(List.of(
                reading("maven", List.of(ExportedAnswer.NONE), List.of(), List.of(), List.of()),
                schemeAnswered("tika", 0.3, 0.42),
                vocabularyAnswered("quickfixj", "FIX", 52, 5, 10.4)));

        assertThat(page.indexOf("quickfixj"))
                .isLessThan(page.indexOf("tika"));
        assertThat(page.indexOf("tika"))
                .isLessThan(page.indexOf("maven"));
    }

    @Test
    void ranksAPlacementWellApartFromChanceAboveAVocabularyBarelyPastItsBar() {
        final ReadingExport both = reading("jmeter-iso8583",
                List.of(ExportedAnswer.fromATaxonomy("CSO", List.of(), "binary fields", null,
                        "2 phrases", 1.3)),
                List.of(),
                List.of(placement("OpenAlex", "Payment Systems", 0.2, 0.4)),
                List.of(new ExportedTaxonomy("CSO", List.of(), List.of(),
                        Map.of("words", 2, "lemmas", 0, "expansions", 0, "senses", 0),
                        new ExportedTaxonomy.Bar(2, 1, 0, 1.3, 0, 0.001, 7, FIELD, 999))));

        final String page = landing.markup(List.of(both));

        assertAll(
                () -> assertThat(page).contains("About Payment Systems \u2014 placed there by OpenAlex, 2.0\u00d7 nearer than chance."),
                () -> assertThat(page.indexOf("2.0× nearer than chance"))
                        .as("the placement stands twice as far from its chance figure as the "
                                + "vocabulary does from its bar, so its mark reads first")
                        .isLessThan(page.indexOf("1.3× its chance bar")));
    }

    @Test
    void statesTheWorkingsOnceInTheLedeAndNotOnEveryCard() {
        final String page = landing.markup(List.of(
                vocabularyAnswered("quickfixj", "FIX", 52, 5, 10.4),
                vocabularyAnswered("strata", "FpML", 47, 17, 2.8)));

        assertThat(page.split("deal of its own words", -1).length - 1)
                .as("the workings are the page's to state once; a card carries only its claims")
                .isEqualTo(1);
    }

    @Test
    void drawsTheStrongestMarkAtTheFullWidthOfTheSharedScale() {
        final String page = landing.markup(List.of(
                vocabularyAnswered("quickfixj", "FIX", 52, 5, 10.4),
                vocabularyAnswered("strata", "FpML", 47, 17, 2.8)));

        assertAll(
                () -> assertThat(page).contains("width:100.0%"),
                () -> assertThat(page).contains("10.4× its chance bar"),
                () -> assertThat(page).contains("2.8× its chance bar"));
    }

    @Test
    void statesASchemesStrengthAgainstItsOwnChanceFigure() {
        assertThat(landing.markup(List.of(schemeAnswered("tika", 0.3, 0.42))))
                .contains("1.4× nearer than chance");
    }
}
