package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class SamplingErrorTest {

    private static final long SEED = 20260813L;

    @Test
    void measuresUpToAsManyASideAsTwoDisjointSubsetsAllow() {
        assertThat(SamplingError.seeded(SEED).over(varied(30), CorpusPooling.MEAN_OF_SHARES))
                .hasSize(15)
                .last()
                .satisfies(at -> assertThat(at.repositories()).isEqualTo(15));
    }

    @Test
    void findsNoDisagreementWhereEveryRepositoryWritesTheSameThing() {
        assertThat(SamplingError.seeded(SEED).over(alike(8), CorpusPooling.MEAN_OF_SHARES))
                .allSatisfy(at -> assertThat(at.bits()).isCloseTo(0.0, within(1.0e-12)));
    }

    @Test
    void disagreesLessAsEachSideGrows() {
        final List<SamplingError.AtSize> curve =
                SamplingError.seeded(SEED).over(varied(30), CorpusPooling.MEAN_OF_SHARES);
        assertThat(curve.getFirst().bits()).isGreaterThan(curve.getLast().bits());
    }

    @Test
    void chargesTheWholeDisagreementToWordsOnlyOneSideCarriesWhereNothingIsShared() {
        assertThat(SamplingError.seeded(SEED).over(disjoint(8), CorpusPooling.MEAN_OF_SHARES))
                .allSatisfy(at -> assertAll(
                        () -> assertThat(at.fromApart()).isCloseTo(at.bits(), within(1.0e-9)),
                        () -> assertThat(at.fromShared()).isCloseTo(0.0, within(1.0e-9))));
    }

    @Test
    void staysApartWhereNoTwoRepositoriesShareAWordAtAll() {
        assertThat(SamplingError.seeded(SEED).over(disjoint(30), CorpusPooling.MEAN_OF_SHARES))
                .allSatisfy(at -> assertThat(at.bits()).isCloseTo(1.0, within(1.0e-9)));
    }

    @Test
    void readsAFallingRateOffTheCurveAndSaysWhatHalvingItCosts() {
        final ErrorDecay decay = ErrorDecay.of(
                SamplingError.seeded(SEED).over(varied(30), CorpusPooling.MEAN_OF_SHARES));
        assertAll(
                () -> assertThat(decay.exponent()).isNegative(),
                () -> assertThat(decay.repositoriesToHalve()).isGreaterThan(decay.largest()));
    }

    @Test
    void statesNoHalvingSizeWhereTheErrorIsNotFalling() {
        assertThat(ErrorDecay.of(SamplingError.seeded(SEED).over(disjoint(8), CorpusPooling.MEAN_OF_SHARES))
                .repositoriesToHalve()).isNaN();
    }

    @Test
    void refusesToStateARateFromASinglePoint() {
        assertThatThrownBy(() -> ErrorDecay.of(List.of(new SamplingError.AtSize(1, 9, 0.5, 0.1))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("at least two sizes");
    }

    /** Repositories sharing two words, in proportions that differ, so averaging more of them converges. */
    private static List<CountedRepository> varied(final int repositories) {
        return IntStream.range(0, repositories)
                .mapToObj(at -> new CountedRepository("varied" + at,
                        mixing(100 + 10 * at, 400 - 10 * at)))
                .toList();
    }

    private static List<CountedRepository> alike(final int repositories) {
        return IntStream.range(0, repositories)
                .mapToObj(at -> new CountedRepository("same" + at, mixing(100, 400)))
                .toList();
    }

    /** Repositories sharing no word at all, where two sides never meet however many are pooled. */
    private static List<CountedRepository> disjoint(final int repositories) {
        return IntStream.range(0, repositories)
                .mapToObj(at -> new CountedRepository("apart" + at, mixing("word" + at, 500, "only" + at, 0)))
                .toList();
    }

    private static WrittenWords mixing(final int kettle, final int lantern) {
        return mixing("kettle", kettle, "lantern", lantern);
    }

    private static WrittenWords mixing(final String first, final int firstTimes,
                                       final String second, final int secondTimes) {
        final WrittenWords written = new WrittenWords();
        IntStream.range(0, firstTimes).forEach(at -> written.saw(first, first + ".java:" + at, true));
        IntStream.range(0, secondTimes).forEach(at -> written.saw(second, second + ".java:" + at, true));
        return written;
    }
}
