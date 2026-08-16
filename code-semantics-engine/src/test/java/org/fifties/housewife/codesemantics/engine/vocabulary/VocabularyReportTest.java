package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.reading.WrittenWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class VocabularyReportTest {

    private static final List<ChosenWord.ReferenceClaim> AGAINST = List.of(
            new ChosenWord.ReferenceClaim("ordinary English", 0.0001, 0.004, true),
            new ChosenWord.ReferenceClaim("the platform's own API", 0.0002, 0.003, true));

    private static final List<ChosenWord> RANKED = List.of(
            new ChosenWord("synset", 40, 30, 0.003, 0.02, AGAINST, "Lexicon.java:4", false),
            new ChosenWord("by", 70, 70, 0.0025, 0.03, AGAINST, "MassByTopic.java:5", true),
            new ChosenWord("rung", 20, 20, 0.002, 0.01, AGAINST, "Rung.java:9", false),
            new ChosenWord("list", 90, 90, -0.001, 0.05, AGAINST, "Names.java:2", false));

    private final WrittenWords written = new WrittenWords();

    private final String report = new VocabularyReport(2).render("What it called things", RANKED, written);

    @Test
    void namesEveryReferenceAWordWasReadAgainstAsAColumnOfItsOwn() {
        assertAll(
                () -> assertThat(report).contains("In ordinary English", "In the platform's own API"),
                () -> assertThat(report).contains("## What it called things"));
    }

    @Test
    void printsOnlyAsManyRowsAsItWasAskedFor() {
        assertAll(
                () -> assertThat(report).contains("`synset`", "`rung`"),
                () -> assertThat(report.lines().filter(line -> line.startsWith("| 4 |")).count()).isZero());
    }

    @Test
    void leavesAGapInTheNumberingWhereTheLanguageSuppliedTheWord() {
        assertAll(
                () -> assertThat(report).contains("| 1 | `synset`", "| 3 | `rung`"),
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
    void statesHowMuchOfTheReadingTheRowsItPrintedHold() {
        assertThat(report).contains("occurrences of 4 distinct words", "1 words in the ranking",
                "1 are ones English supplied");
    }
}
