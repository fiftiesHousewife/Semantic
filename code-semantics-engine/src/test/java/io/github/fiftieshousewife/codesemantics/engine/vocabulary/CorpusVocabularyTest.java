package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusVocabularyTest {

    private static Stream<String> table() {
        return Stream.of(
                "# The reference corpus, pooled over thirty repositories.",
                "# Columns: word, occurrences, share.",
                "",
                "get\t10327\t6.000e-01",
                "kettle\t8762\t2.000e-01",
                "lantern\t6240\t1.000e-01");
    }

    @Test
    void readsTheShareEachWordHoldsAndIgnoresTheProvenanceHeader() {
        final CorpusVocabulary corpus = new CorpusVocabulary(table());
        assertAll(
                () -> assertThat(corpus.shareByWord()).hasSize(3),
                () -> assertThat(corpus.name()).isEqualTo("the reference corpus"));
    }

    @Test
    void normalisesTheStatedSharesSoTheySumToOne() {
        final CorpusVocabulary corpus = new CorpusVocabulary(table());
        assertAll(
                () -> assertThat(corpus.shareByWord().values().stream().mapToDouble(Double::doubleValue).sum())
                        .isCloseTo(1.0, within(1.0e-12)),
                () -> assertThat(corpus.shareOf("get")).isCloseTo(2.0 / 3.0, within(1.0e-9)));
    }

    @Test
    void holdsNoShareForAWordTheCorpusNeverWrote() {
        assertThat(new CorpusVocabulary(table()).shareOf("flywheel")).isEqualTo(0.0);
    }

    @Test
    void refusesATableThatStatesNoShareAtAll() {
        assertThatThrownBy(() -> new CorpusVocabulary(Stream.of("# nothing but a header")))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("empty denominator");
    }

    @Test
    void refusesARowTooNarrowToStateAShare() {
        assertThatThrownBy(() -> new CorpusVocabulary(Stream.of("get\t10327")))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("word, occurrences, share");
    }
}
