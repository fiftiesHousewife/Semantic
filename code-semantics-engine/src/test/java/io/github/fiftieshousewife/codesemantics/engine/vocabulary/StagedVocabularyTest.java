package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.reading.StagedWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.WordStage;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StagedVocabularyTest {

    private static final int DRAWN = 10;

    private static final Map<String, Double> CLAIMS =
            Map.of("the", 0.0001, "pricer", 0.0300, "buffer", 0.0050, "list", -0.0100);

    private WrittenWords written(final Map<String, Integer> timesByWord) {
        final WrittenWords written = new WrittenWords();
        timesByWord.forEach((word, times) ->
                java.util.stream.IntStream.range(0, times).forEach(each -> written.saw(word, "a.java", true)));
        return written;
    }

    private StagedWords staged(final Map<String, Integer> timesByWord) {
        return new StagedWords(WordStage.WRITTEN, written(timesByWord), List.of());
    }

    @Test
    void sizesAWordByItsClaimRatherThanByHowOftenItWasWritten() {
        final List<StagedVocabulary.RankedWord> drawn = StagedVocabulary.drawnFrom(
                staged(Map.of("the", 900, "pricer", 12)), DRAWN, CLAIMS);

        assertAll(
                () -> assertThat(drawn).extracting(StagedVocabulary.RankedWord::word)
                        .as("the strongest claim leads however seldom it was written")
                        .containsExactly("pricer", "the"),
                () -> assertThat(drawn.getFirst().claim()).isEqualTo(0.0300),
                () -> assertThat(drawn.getFirst().occurrences())
                        .as("how often it was written is still carried, it just no longer sets the size")
                        .isEqualTo(12));
    }

    @Test
    void drawsNoWordAReferenceWritesAtLeastAsDenselyAsThisRepositoryDoes() {
        final List<StagedVocabulary.RankedWord> drawn = StagedVocabulary.drawnFrom(
                staged(Map.of("list", 4000, "pricer", 3)), DRAWN, CLAIMS);

        assertThat(drawn).extracting(StagedVocabulary.RankedWord::word)
                .as("a word no reference agrees is written more densely here states no claim to draw")
                .containsExactly("pricer");
    }

    @Test
    void carriesOneClaimForAWordAtEveryStageItSurvives() {
        final Map<String, Integer> everything = Map.of("the", 900, "pricer", 12, "buffer", 40);
        final Map<String, Integer> narrowed = Map.of("pricer", 12, "buffer", 40);

        final double early = claimOf(StagedVocabulary.drawnFrom(staged(everything), DRAWN, CLAIMS), "pricer");
        final double late = claimOf(StagedVocabulary.drawnFrom(staged(narrowed), DRAWN, CLAIMS), "pricer");

        assertThat(early)
                .as("a word must not appear to grow because its neighbours left, or a difference between "
                        + "two panels stops being the doing of the stage between them")
                .isEqualTo(late);
    }

    private double claimOf(final List<StagedVocabulary.RankedWord> drawn, final String word) {
        return drawn.stream().filter(each -> each.word().equals(word))
                .mapToDouble(StagedVocabulary.RankedWord::claim).findFirst().orElseThrow();
    }
}
