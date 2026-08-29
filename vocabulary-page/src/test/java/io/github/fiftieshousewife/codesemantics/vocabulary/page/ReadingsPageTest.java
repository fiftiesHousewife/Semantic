package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;

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

    private static ReadingRow row(final String repository, final ExportedAnswer answer,
                                  final Optional<String> statedArea) {
        return row(repository, List.of(answer), statedArea);
    }

    private static ReadingRow row(final String repository, final List<ExportedAnswer> answers,
                                  final Optional<String> statedArea) {
        return new ReadingRow(repository, answers, List.of("linguistics"), List.of(),
                List.of(new ExportedPlacement("OpenAlex",
                        level("Artificial Intelligence", true),
                        level("Natural Language Processing Techniques", true))),
                0.981, statedArea);
    }

    private static ExportedAnswer taxonomy(final String source, final String result) {
        return new ExportedAnswer("taxonomy", source, "a branch", result,
                "22 phrases against the 2 a deal reaches");
    }

    @Test
    void testsTheStatedAreaAgainstTheSchemeItIsNamedInAndNoOther() {
        final ReadingRow reading = new ReadingRow("tika", List.of(ExportedAnswer.NONE),
                List.of("linguistics"), List.of(),
                List.of(new ExportedPlacement("CSO", level("linguistics", true),
                                level("speech communication", true)),
                        new ExportedPlacement("OpenAlex",
                                level("Artificial Intelligence", true),
                                level("Natural Language Processing Techniques", true))),
                0.98, Optional.of("Computer Science"));
        assertThat(reading.subjects())
                .containsExactly("Artificial Intelligence", "Natural Language Processing Techniques");
    }

    @Test
    void drawsOneLinePerSourceThatClearedTheBarAndSpansTheRepositoryAcrossThem() {
        final String markup = page.markup(
                List.of(row("jpos", List.of(taxonomy("FIBO", "MerchantIdentifier — unique identifier"),
                        taxonomy("BIAN", "Card Capture — capture the card payment transaction")),
                        Optional.empty())), StatedAreas.none());
        assertAll(
                () -> assertThat(markup).contains("FIBO"),
                () -> assertThat(markup).contains("BIAN"),
                () -> assertThat(markup).contains("rowspan=\"2\""),
                () -> assertThat(markup.split("<tr>", -1)).hasSize(4));
    }

    @Test
    void namesTheSourceTypeTheSourceAndWhatThatPublisherSaysTheRepositoryIs() {
        final String markup = page.markup(
                List.of(row("strata", taxonomy("FIBO",
                        "what a financial thing is — instruments, parties and agreements"),
                        Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains(">taxonomy<"),
                () -> assertThat(markup).contains(">FIBO<"),
                () -> assertThat(markup).contains("instruments, parties and agreements"));
    }

    @Test
    void drawsNoSubjectSchemeWhereAVocabularyAnswered() {
        final String markup = page.markup(
                List.of(row("quickfixj", taxonomy("FIX", "how the front office talks to the market"),
                        Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup)
                        .as("a scheme places quickfixj under Wireless Networks and Protocols while FIX "
                                + "stands at ten times its own bar, and showing both would put a weaker "
                                + "answer beside a stronger one as though a reader should weigh them")
                        .doesNotContain("Artificial Intelligence"),
                () -> assertThat(markup).doesNotContain("Natural Language Processing Techniques"));
    }

    @Test
    void namesTheSchemeWhereNoVocabularyAnswered() {
        final String markup = page.markup(
                List.of(row("maven", new ExportedAnswer("subject scheme", "OpenAlex", "", "Computer Science",
                        "0.079 bits nearer than chance reached"), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains(">subject scheme<"),
                () -> assertThat(markup).contains(">OpenAlex<"),
                () -> assertThat(markup).contains(">Computer Science<"));
    }

    @Test
    void saysWhyRatherThanLeavingTheRowBlankWhereNothingAnswered() {
        final String markup = page.markup(
                List.of(row("mine", ExportedAnswer.NONE, Optional.empty())), StatedAreas.none());

        assertAll(
                () -> assertThat(markup).contains(">nothing<"),
                () -> assertThat(markup).contains("no evidence stood above chance"));
    }

    @Test
    void marksAReadingReachingTheAreaItsManifestStates(@TempDir final Path directory) throws IOException {
        final Path manifest = directory.resolve("evaluation-set.tsv");
        Files.writeString(manifest, "# a manifest\ntika\torigin\tsha\tApache-2.0\tComputer Science\t"
                + "its own GitHub description\tout-of-domain\n");
        final StatedAreas stated = StatedAreas.at(manifest);

        final String markup = page.markup(
                List.of(row("tika", taxonomy("CSO", "the topics computer science is indexed by"),
                        stated.of("tika"))), stated);

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
        assertThat(page.markup(List.of(row("mine", ExportedAnswer.NONE, Optional.empty())),
                StatedAreas.none()))
                .contains("no manifest states an area for this repository");
    }

    @Test
    void showsTheFirstSentenceOfADefinitionAndKeepsTheWholeOnTheCell() {
        final String whole = "BaseForm — Strong inflection is a characteristic of lexemes. "
                + "In traditional English tagsets, surface ambiguities are normally not resolved.";
        final String markup = page.markup(
                List.of(row("mine", new ExportedAnswer("taxonomy", "OLiA", "InflectionTypeFeature",
                        whole, "4 phrases against the 2 a deal reaches"), Optional.empty())),
                StatedAreas.none());

        assertAll(
                () -> assertThat(markup)
                        .as("a publisher writes as much as it likes and a table shows the sentence that "
                                + "says what the thing is")
                        .contains(">BaseForm — Strong inflection is a characteristic of lexemes.<"),
                () -> assertThat(markup)
                        .as("the reading carries all of it, because a definition is evidence")
                        .contains("surface ambiguities are normally not resolved"));
    }
}
