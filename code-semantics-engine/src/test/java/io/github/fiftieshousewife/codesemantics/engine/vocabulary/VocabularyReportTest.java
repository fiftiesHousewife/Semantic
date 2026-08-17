package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class VocabularyReportTest {

    private static final List<ChosenWord.ReferenceClaim> SPECIALIST = List.of(
            new ChosenWord.ReferenceClaim("ordinary English", 0.0001, 0.004, true),
            new ChosenWord.ReferenceClaim("the platform's own API", 0.0002, 0.003, true));

    private static final List<ChosenWord.ReferenceClaim> ORDINARY = List.of(
            new ChosenWord.ReferenceClaim("ordinary English", 0.0400, 0.0018, true),
            new ChosenWord.ReferenceClaim("the platform's own API", 0.0300, 0.0016, true));

    private static final List<ChosenWord.ReferenceClaim> WRITTEN_MORE_THERE = List.of(
            new ChosenWord.ReferenceClaim("ordinary English", 0.9000, 0.0010, false),
            new ChosenWord.ReferenceClaim("the platform's own API", 0.8000, 0.0090, false));

    private static final List<ChosenWord> RANKED = List.of(
            new ChosenWord("synset", 40, 30, 0.003, 0.02, SPECIALIST, "Lexicon.java:4", false),
            new ChosenWord("by", 70, 70, 0.0025, 0.03, SPECIALIST, "MassByTopic.java:5", true),
            new ChosenWord("rung", 20, 20, 0.0016, 0.01, ORDINARY, "Rung.java:9", false),
            new ChosenWord("list", 90, 90, -0.009, 0.05, WRITTEN_MORE_THERE, "Names.java:2", false));

    private final WrittenWords written = new WrittenWords();

    private static final List<VocabularyNull.Bar> BARS = List.of(
            new VocabularyNull.Bar("ordinary English", 0.0021, 4, 999, 3_996),
            new VocabularyNull.Bar("the platform's own API", 0.0015, 4, 999, 3_996));

    private final String report = new VocabularyReport(BARS).render("What it called things", RANKED, written);

    @Test
    void namesEveryReferenceAWordWasReadAgainstAsAColumnOfItsOwn() {
        assertAll(
                () -> assertThat(report).contains("In ordinary English", "In the platform's own API"),
                () -> assertThat(report).contains("## What it called things"));
    }

    @Test
    void printsOnlyTheWordsThatBeatEveryReferencesOwnBar() {
        assertAll(
                () -> assertThat(report).contains("`synset`"),
                () -> assertThat(report.lines().filter(line -> line.startsWith("| 3 |")).count())
                        .as("`rung` claims 0.002 bits, under ordinary English's bar of 0.0021").isZero(),
                () -> assertThat(report.lines().filter(line -> line.startsWith("| 4 |")).count()).isZero());
    }

    @Test
    void statesTheBarEachReferenceSetAndWhatItWasDrawnFrom() {
        assertAll(
                () -> assertThat(report).contains("0.2100%** of the maximum divergence against ordinary English"),
                () -> assertThat(report).contains("0.1500%** of the maximum divergence against the platform's own API"),
                () -> assertThat(report).contains("field of 4", "999 draws", "3,996 scored words"));
    }

    @Test
    void leavesAGapInTheNumberingWhereTheLanguageSuppliedTheWord() {
        assertAll(
                () -> assertThat(report).contains("| 1 | `synset`"),
                () -> assertThat(report.lines().filter(line -> line.startsWith("| 2 |")).count()).isOne());
    }

    @Test
    void printsTheWordsTheLanguageSuppliedWithThePlaceTheyWouldHaveHeld() {
        assertThat(report)
                .as("a word taken out of the ranking is shown, with where it stood, rather than removed")
                .contains("What the language supplied", "| 2 | `by`");
    }

    @Test
    void printsWhereACountAloneWouldHavePutTheCommonestWords() {
        assertThat(report)
                .as("the word written most is the word the references refused, which is the whole argument")
                .contains("What a count on its own would have said", "| `list` | 90 | 4 |");
    }

    @Test
    void statesHowMuchOfTheReadingTheRowsAboveTheBarHold() {
        assertThat(report).contains("occurrences of 4 distinct words", "1 words in the ranking",
                "1 are ones English supplied", "of the divergence");
    }
}
