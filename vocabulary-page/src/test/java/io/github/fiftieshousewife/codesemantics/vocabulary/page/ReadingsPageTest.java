package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;

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

    private static ExportedTaxonomy answering(final String vocabulary, final int phrases, final int bar) {
        return new ExportedTaxonomy(vocabulary, List.of(), List.of(), Map.of(),
                new ExportedTaxonomy.Bar(phrases, bar, bar, (double) phrases / bar, 2, 999));
    }

    private static ReadingRow row(final String repository, final Optional<ExportedTaxonomy> answering,
                                  final Optional<String> statedArea) {
        return new ReadingRow(repository, List.of("linguistics"), answering,
                List.of(new ExportedPlacement("OpenAlex",
                        level("Artificial Intelligence", true),
                        level("Natural Language Processing Techniques", true))),
                0.981, statedArea);
    }

    @Test
    void namesEveryReadingItWasGiven() {
        final String markup = page.markup(
                List.of(row("tika", Optional.empty(), Optional.empty()),
                        row("maven", Optional.empty(), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains("tika"),
                () -> assertThat(markup).contains("maven"));
    }

    @Test
    void statesTheVocabularyThatBeatItsBarWithTheCountAndTheBar() {
        final String markup = page.markup(
                List.of(row("quickfixj", Optional.of(answering("FIX", 22, 2)), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains("FIX 11.0×"),
                () -> assertThat(markup).contains("22 phrases against 2"));
    }

    @Test
    void saysSoWhereNoVocabularyBeatItsBarRatherThanLeavingTheCellBlank() {
        final String markup = page.markup(
                List.of(row("maven", Optional.empty(), Optional.empty())), StatedAreas.none());

        assertThat(markup)
                .as("an empty cell reads as a page that failed to draw one")
                .contains("phrase count beat what a deal of its own");
    }

    @Test
    void marksAPlacementTheSchemeCouldNotSeparateFromChance() {
        final ReadingRow within = new ReadingRow("aeron", List.of(), Optional.empty(),
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
                List.of(row("tika", Optional.empty(), stated.of("tika"))), stated);

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
        assertThat(page.markup(List.of(row("mine", Optional.empty(), Optional.empty())),
                StatedAreas.none()))
                .contains("no manifest states an area for this repository");
    }

    @Test
    void statesACountAgainstNothingWhereTheDealsReachNoBarAtAll() {
        final String markup = page.markup(
                List.of(row("quickfixj", Optional.of(answering("OLiA", 1, 0)), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup)
                        .as("timesTheBar answers with the count where the bar is zero, so a single match "
                                + "would read as standing at exactly its bar")
                        .contains("OLiA 1, no bar"),
                () -> assertThat(markup).doesNotContain("OLiA 1.0"));
    }
}
