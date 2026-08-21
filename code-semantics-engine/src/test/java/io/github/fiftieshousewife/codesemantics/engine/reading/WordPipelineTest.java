package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordPipelineTest {

    private static final String SITE = "engine/src/main/java/Reading.java:12";

    private static final CitedExpansions SHORTHAND = new CitedExpansions(
            form -> "buf".equals(form) ? List.of("british union of fascists", "buffalo") : List.of(),
            form -> 0);

    private static WordPipeline pipeline() {
        return new WordPipeline(word -> word.length() < 3, SHORTHAND, word -> word.replaceAll("s$", ""));
    }

    private static WrittenWords wrote(final Map<String, Integer> asNames,
                                      final Map<String, Integer> inProse) {
        final WrittenWords written = new WrittenWords();
        asNames.forEach((word, times) -> times(times, () -> written.saw(word, SITE, true)));
        inProse.forEach((word, times) -> times(times, () -> written.saw(word, SITE, false)));
        return written;
    }

    private static void times(final int count, final Runnable saw) {
        java.util.stream.IntStream.range(0, count).forEach(each -> saw.run());
    }

    private static WrittenWords survivorsAt(final WordStage stage, final WrittenWords written) {
        return pipeline().over(written).stream()
                .filter(staged -> staged.stage() == stage)
                .findFirst().orElseThrow()
                .surviving();
    }

    @Test
    void keepsEveryTokenAtTheStageThatFiltersNothing() {
        final WrittenWords written = wrote(Map.of("curves", 4, "buf", 9, "x", 7),
                Map.of("license", 300));

        assertThat(survivorsAt(WordStage.WRITTEN, written).words())
                .containsExactlyInAnyOrder("curves", "buf", "x", "license");
    }

    @Test
    void dropsAWordOnlyEverWrittenInASentenceWhereNamesAreAskedFor() {
        final WrittenWords written = wrote(Map.of("curves", 4), Map.of("license", 300));

        assertAll(
                () -> assertThat(survivorsAt(WordStage.NAMES, written).words())
                        .as("a licence header is prose about the file, not a name its author chose")
                        .containsExactly("curves"),
                () -> assertThat(removedAt(WordStage.NAMES, written)).containsExactly("license"));
    }

    @Test
    void dropsAFormTooShortToBeAboutAnythingButASymbol() {
        final WrittenWords written = wrote(Map.of("curves", 4, "x", 7, "id", 90), Map.of());

        assertAll(
                () -> assertThat(survivorsAt(WordStage.SYMBOL, written).words()).containsExactly("curves"),
                () -> assertThat(removedAt(WordStage.SYMBOL, written))
                        .containsExactlyInAnyOrder("x", "id"));
    }

    @Test
    void dropsAFormTheDictionariesCiteForMoreThingsThanItMeans() {
        final WrittenWords written = wrote(Map.of("curves", 4, "buf", 9), Map.of());

        assertAll(
                () -> assertThat(survivorsAt(WordStage.SHORTHAND, written).words()).containsExactly("curves"),
                () -> assertThat(removedAt(WordStage.SHORTHAND, written)).containsExactly("buf"));
    }

    @Test
    void mergesAnInflectionIntoTheFormTheDictionarySpells() {
        final WrittenWords written = wrote(Map.of("curves", 4, "curve", 6), Map.of());
        final WrittenWords lemmas = survivorsAt(WordStage.LEMMA, written);

        assertAll(
                () -> assertThat(lemmas.words()).containsExactly("curve"),
                () -> assertThat(lemmas.occurrencesOf("curve"))
                        .as("both spellings were the same word all along")
                        .isEqualTo(10));
    }

    @Test
    void statesEveryStageInOrderSoAReaderCanSeeWhereAWordWent() {
        assertThat(pipeline().over(wrote(Map.of("curves", 4), Map.of())))
                .extracting(StagedWords::stage)
                .containsExactly(WordStage.WRITTEN, WordStage.NAMES, WordStage.SYMBOL,
                        WordStage.SHORTHAND, WordStage.LANGUAGE, WordStage.LEMMA);
    }

    @Test
    void carriesWhatEachStageRemovedWithHowOftenItWasWritten() {
        final StagedWords symbol = pipeline().over(wrote(Map.of("id", 90, "curves", 4), Map.of())).stream()
                .filter(staged -> staged.stage() == WordStage.SYMBOL).findFirst().orElseThrow();

        assertThat(symbol.removed()).singleElement()
                .satisfies(removed -> assertAll(
                        () -> assertThat(removed.word()).isEqualTo("id"),
                        () -> assertThat(removed.occurrences()).isEqualTo(90),
                        () -> assertThat(removed.stage()).isEqualTo(WordStage.SYMBOL)));
    }

    private static List<String> removedAt(final WordStage stage, final WrittenWords written) {
        return pipeline().over(written).stream()
                .filter(staged -> staged.stage() == stage)
                .findFirst().orElseThrow()
                .removed().stream().map(RemovedWord::word).toList();
    }
}
