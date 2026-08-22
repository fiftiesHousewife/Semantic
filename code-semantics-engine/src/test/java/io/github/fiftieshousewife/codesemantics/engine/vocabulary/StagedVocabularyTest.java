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

    private static final String ENGLISH = "ordinary English";
    private static final Map<String, Double> NO_BAR = Map.of(ENGLISH, 0.0);

    private static ChosenWord chosen(final String word, final double claim, final int occurrences) {
        return new ChosenWord(word, occurrences, occurrences, claim, 0.0,
                List.of(new ChosenWord.ReferenceClaim(ENGLISH, 0.0, Math.abs(claim), claim > 0.0)),
                "a.java", false, null);
    }

    private static final Map<String, ChosenWord> CHOSEN = Map.of(
            "the", chosen("the", 0.0040, 800),
            "pricer", chosen("pricer", 0.0030, 12),
            "buffer", chosen("buffer", 0.0050, 40),
            "list", chosen("list", -0.0100, 4000));

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
                staged(Map.of("the", 800, "buffer", 40)), CHOSEN, NO_BAR);

        assertAll(
                () -> assertThat(drawn).extracting(StagedVocabulary.RankedWord::word)
                        .as("buffer departs further than the although the is written twenty times more")
                        .containsExactly("buffer", "the"),
                () -> assertThat(drawn.getFirst().claim()).isEqualTo(0.0050));
    }

    @Test
    void drawsNoWordAReferenceWritesAtLeastAsDenselyAsThisRepositoryDoes() {
        final List<StagedVocabulary.RankedWord> drawn = StagedVocabulary.drawnFrom(
                staged(Map.of("list", 4000, "pricer", 3)), CHOSEN, NO_BAR);

        assertThat(drawn).extracting(StagedVocabulary.RankedWord::word)
                .as("a word no reference agrees is written more densely here states no claim to draw")
                .containsExactly("pricer");
    }

    @Test
    void drawsNoWordWhoseClaimAChanceRepositoryOfThisSizeWouldHaveReached() {
        final List<StagedVocabulary.RankedWord> drawn = StagedVocabulary.drawnFrom(
                staged(Map.of("pricer", 12, "buffer", 40)), CHOSEN, Map.of(ENGLISH, 0.0040));

        assertThat(drawn).extracting(StagedVocabulary.RankedWord::word)
                .as("dividing by occurrences makes a word written once maximally characteristic, so the "
                        + "bar the null derives is what keeps the picture off noise")
                .containsExactly("buffer");
    }

    @Test
    void carriesOneFigureForAWordAtEveryStageItSurvives() {
        final Map<String, Integer> everything = Map.of("the", 800, "pricer", 12, "buffer", 40);
        final Map<String, Integer> narrowed = Map.of("pricer", 12, "buffer", 40);

        final double early = sizeOf(
                StagedVocabulary.drawnFrom(staged(everything), CHOSEN, NO_BAR), "pricer");
        final double late = sizeOf(
                StagedVocabulary.drawnFrom(staged(narrowed), CHOSEN, NO_BAR), "pricer");

        assertThat(early)
                .as("a word must not appear to grow because its neighbours left, or a difference between "
                        + "two panels stops being the doing of the stage between them")
                .isEqualTo(late);
    }

    private double sizeOf(final List<StagedVocabulary.RankedWord> drawn, final String word) {
        return drawn.stream().filter(each -> each.word().equals(word))
                .mapToDouble(StagedVocabulary.RankedWord::claim).findFirst().orElseThrow();
    }
}
