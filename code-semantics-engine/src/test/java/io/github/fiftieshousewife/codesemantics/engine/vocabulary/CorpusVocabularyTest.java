package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import io.github.fiftieshousewife.codesemantics.reference.PooledWordShares;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusVocabularyTest {

    @Test
    void namesItselfAsAReferenceAReportCanPutInAColumn() {
        assertThat(CorpusVocabulary.fromClasspath().name()).isEqualTo("the reference corpus");
    }

    @Test
    void carriesTheBundledCorpusAsADistribution() {
        final CorpusVocabulary corpus = CorpusVocabulary.fromClasspath();
        assertAll(
                () -> assertThat(corpus.shareByWord()).isNotEmpty(),
                () -> assertThat(corpus.shareByWord().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, within(1.0e-9)));
    }

    @Test
    void writesTheWordsEveryJavaProgramWritesMoreDenselyThanTheOnesARepositoryChooses() {
        final CorpusVocabulary corpus = CorpusVocabulary.fromClasspath();
        assertAll(
                () -> assertThat(corpus.shareOf("get")).isGreaterThan(corpus.shareOf("sensitivity")),
                () -> assertThat(corpus.shareOf("id")).isGreaterThan(corpus.shareOf("notional")));
    }

    @Test
    void holdsNoShareForAWordTheCorpusNeverWrote() {
        assertThat(CorpusVocabulary.fromClasspath().shareOf("zzzznotaword")).isZero();
    }

    @Test
    void wrapsWhateverPooledSharesItIsGivenRatherThanFindingItsOwn() {
        final PooledWordShares given = new PooledWordShares(
                java.util.stream.Stream.of("kettle\t3\t7.500e-01", "lantern\t1\t2.500e-01"));
        assertThat(new CorpusVocabulary(given).shareOf("kettle")).isCloseTo(0.75, within(1.0e-9));
    }
}
