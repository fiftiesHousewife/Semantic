package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusPoolingTest {

    @Test
    void letsTheLargeRepositorySetTheTableWhenOccurrencesArePooled() {
        assertAll(
                () -> assertThat(CorpusPooling.POOLED_OCCURRENCES.shareOf("kettle", lopsided()))
                        .isCloseTo(0.99, within(0.005)),
                () -> assertThat(CorpusPooling.POOLED_OCCURRENCES.shareOf("lantern", lopsided()))
                        .isCloseTo(0.01, within(0.005)));
    }

    @Test
    void weighsTheSmallRepositoryTheSameWhenSharesAreAveraged() {
        assertAll(
                () -> assertThat(CorpusPooling.MEAN_OF_SHARES.shareOf("kettle", lopsided()))
                        .isCloseTo(0.5, within(0.001)),
                () -> assertThat(CorpusPooling.MEAN_OF_SHARES.shareOf("lantern", lopsided()))
                        .isCloseTo(0.5, within(0.001)));
    }

    @Test
    void everyWeightingSumsToOneOverTheWordsTheCorpusHolds() {
        assertAll(Stream.of(CorpusPooling.values()).map(pooling -> () ->
                assertThat(lopsided().words().stream()
                        .mapToDouble(word -> pooling.shareOf(word, lopsided()))
                        .sum())
                        .as("%s", pooling)
                        .isCloseTo(1.0, within(1.0e-9))));
    }

    @Test
    void namesADistinctTableForEveryWeighting() {
        assertThat(Stream.of(CorpusPooling.values()).map(CorpusPooling::fileName))
                .doesNotHaveDuplicates()
                .allMatch(name -> name.endsWith(".tsv"));
    }

    /** One repository writing a word ninety-nine times against one writing another word once. */
    private static CorpusWords lopsided() {
        final CorpusWords corpus = new CorpusWords();
        corpus.add(writing("kettle", 99));
        corpus.add(writing("lantern", 1));
        return corpus;
    }

    private static WrittenWords writing(final String word, final int times) {
        final WrittenWords written = new WrittenWords();
        IntStream.range(0, times).forEach(at -> written.saw(word, word + ".java:" + at, true));
        return written;
    }
}
