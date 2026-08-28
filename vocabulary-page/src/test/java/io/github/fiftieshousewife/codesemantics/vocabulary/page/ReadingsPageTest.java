package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.SightingSite;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReadingsPageTest {

    private final ReadingsPage page = new ReadingsPage("");

    /** The record checks the flag against its own two figures, so the pair follows the flag. */
    private static ExportedPlacement.Level level(final String subject, final boolean apart) {
        return apart
                ? new ExportedPlacement.Level(subject, 0.3, 0.4, true, List.of(), List.of())
                : new ExportedPlacement.Level(subject, 0.4, 0.3, false, List.of(), List.of());
    }

    private static ExportedTaxonomy answering(final String vocabulary, final int phrases, final int bar,
                                              final ExportedTaxonomy.Concept... concepts) {
        return new ExportedTaxonomy(vocabulary, List.of(concepts), List.of(), Map.of(),
                new ExportedTaxonomy.Bar(phrases, bar, bar, (double) phrases / bar, 2, 999));
    }

    private static ExportedTaxonomy.Concept term(final String label, final int words,
                                                 final int occurrences) {
        return new ExportedTaxonomy.Concept(label, label, "a branch", occurrences, 0.9, words, 1.0,
                new SightingSite("A.java", 1));
    }

    private static ReadingRow row(final String repository, final List<ExportedTaxonomy> published,
                                  final Optional<String> statedArea) {
        return new ReadingRow(repository, List.of("linguistics"), published,
                List.of(new ExportedPlacement("OpenAlex",
                        level("Artificial Intelligence", true),
                        level("Natural Language Processing Techniques", true))),
                0.981, statedArea);
    }

    @Test
    void namesEveryReadingItWasGiven() {
        final String markup = page.markup(
                List.of(row("tika", List.of(), Optional.empty()),
                        row("maven", List.of(), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains("tika"),
                () -> assertThat(markup).contains("maven"));
    }

    @Test
    void drawsThePhrasesTheRepositoryWroteAndNotOnlyTheVocabularyThatStatesThem() {
        final String markup = page.markup(
                List.of(row("strata", List.of(answering("CSO", 17, 13,
                        term("cubic spline", 2, 21), term("value", 1, 400))), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains("cubic spline ×21"),
                () -> assertThat(markup)
                        .as("a one-word term is the everyday English any repository hits, and the bar "
                                + "beside it is computed over the phrases alone")
                        .doesNotContain("value ×400"));
    }

    @Test
    void namesEveryVocabularyThatBeatItsBarAndNotOnlyTheStrongest() {
        final String markup = page.markup(
                List.of(row("tika", List.of(answering("OLiA", 3, 2), answering("CSO", 30, 18)),
                        Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains("OLiA 1.5×"),
                () -> assertThat(markup).contains("CSO 1.7×"));
    }

    @Test
    void statesTheVocabularyThatBeatItsBarWithTheCountAndTheBar() {
        final String markup = page.markup(
                List.of(row("quickfixj", List.of(answering("FIX", 22, 2, term("limit order", 2, 91))), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains("FIX 11.0×"),
                () -> assertThat(markup).contains("22 phrases against 2"));
    }

    @Test
    void saysSoWhereNoVocabularyBeatItsBarRatherThanLeavingTheCellBlank() {
        final String markup = page.markup(
                List.of(row("maven", List.of(), Optional.empty())), StatedAreas.none());

        assertThat(markup)
                .as("an empty cell reads as a page that failed to draw one")
                .contains("phrase count beat what a deal of its own");
    }

    @Test
    void marksAPlacementTheSchemeCouldNotSeparateFromChance() {
        final ReadingRow within = new ReadingRow("aeron", List.of(), List.of(),
                List.of(new ExportedPlacement("arXiv", level("Computer Science", false),
                        level("Databases", true))), 0.9, Optional.empty());

        assertThat(page.markup(List.of(within), StatedAreas.none()))
                .contains("Computer Science (within chance)");
    }

    @Test
    void marksAReadingReachingTheAreaItsManifestStates(@TempDir final Path directory) throws IOException {
        final Path manifest = directory.resolve("evaluation-set.tsv");
        Files.writeString(manifest, "# a manifest\ntika\torigin\tsha\tApache-2.0\tComputer Science\t"
                + "its own GitHub description\tout-of-domain\n");
        final StatedAreas stated = StatedAreas.at(manifest);

        final String markup = page.markup(
                List.of(row("tika", List.of(), stated.of("tika"))), stated);

        assertAll(
                () -> assertThat(markup).contains("Computer Science"),
                () -> assertThat(markup)
                        .as("Natural Language Processing Techniques descends from Computer Science in "
                                + "OpenAlex's own hierarchy, so a page comparing the two labels would "
                                + "call a right answer wrong")
                        .contains("class=\"reached\""));
    }

    @Test
    void leavesTheStatedAreaEmptyWhereNoManifestNamesTheRepository() {
        assertThat(page.markup(List.of(row("mine", List.of(), Optional.empty())),
                StatedAreas.none()))
                .contains("no manifest states an area for this repository");
    }

    @Test
    void statesACountAgainstNothingWhereTheDealsReachNoBarAtAll() {
        final String markup = page.markup(
                List.of(row("quickfixj", List.of(answering("OLiA", 1, 0, term("non initial", 2, 1))), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup)
                        .as("timesTheBar answers with the count where the bar is zero, so a single match "
                                + "would read as standing at exactly its bar")
                        .contains("OLiA 1, no bar"),
                () -> assertThat(markup).doesNotContain("OLiA 1.0"));
    }

    @Test
    void headsAColumnForEverySchemeTheReadingsPlaceUnderAndNamesNoneItself() {
        final ReadingRow drawn = new ReadingRow("mine", List.of(), List.of(),
                List.of(new ExportedPlacement("a scheme nobody has bundled yet",
                        level("A Field", true), level("A Topic", true))),
                0.9, Optional.empty());

        assertAll(
                () -> assertThat(page.markup(List.of(drawn), StatedAreas.none()))
                        .as("naming the schemes here would be the page deciding which a reading has, and "
                                + "a scheme dropped would leave a column headed for it and empty")
                        .contains("<th>a scheme nobody has bundled yet</th>"),
                () -> assertThat(page.markup(List.of(drawn), StatedAreas.none()))
                        .doesNotContain("<th>arXiv</th>"));
    }

    @Test
    void drawsOneColumnPerSchemeWhereTheReadingsPlaceUnderSeveral() {
        final ReadingRow both = new ReadingRow("tika", List.of(), List.of(),
                List.of(new ExportedPlacement("arXiv", level("Computer Science", true),
                                level("Computation and Language", true)),
                        new ExportedPlacement("OpenAlex", level("Artificial Intelligence", true),
                                level("Natural Language Processing Techniques", true))),
                0.9, Optional.empty());

        final String markup = page.markup(List.of(both), StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains("<th>arXiv</th>"),
                () -> assertThat(markup).contains("<th>OpenAlex</th>"),
                () -> assertThat(markup).contains("Computation and Language"),
                () -> assertThat(markup).contains("Natural Language Processing Techniques"));
    }
}
