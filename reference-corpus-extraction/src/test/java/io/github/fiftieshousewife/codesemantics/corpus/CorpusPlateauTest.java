package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusPlateauTest {

    @Test
    void statesNoStepForTheFirstRepositoryBecauseNothingPrecedesIt() {
        final List<CorpusPlateau.Step> steps =
                CorpusPlateau.newInstance().over(identical(3), CorpusPooling.MEAN_OF_SHARES);
        assertThat(steps.getFirst().fromPrevious()).isNaN();
    }

    @Test
    void restsAtZeroWhereEveryRepositoryWritesTheSameThing() {
        final List<CorpusPlateau.Step> steps =
                CorpusPlateau.newInstance().over(identical(4), CorpusPooling.MEAN_OF_SHARES);
        assertAll(
                () -> assertThat(steps).hasSize(4),
                () -> assertThat(steps.get(1).fromPrevious()).isCloseTo(0.0, within(1.0e-12)),
                () -> assertThat(steps.getLast().fromWhole()).isCloseTo(0.0, within(1.0e-12)));
    }

    @Test
    void movesWhenARepositoryWritingSomethingElseJoins() {
        final List<CountedRepository> drawn = List.of(
                new CountedRepository("kettle", writing("kettle", 100)),
                new CountedRepository("lantern", writing("lantern", 100)));
        final List<CorpusPlateau.Step> steps =
                CorpusPlateau.newInstance().over(drawn, CorpusPooling.MEAN_OF_SHARES);
        assertAll(
                () -> assertThat(steps.get(1).fromPrevious()).isCloseTo(0.311278, within(1.0e-6)),
                () -> assertThat(steps.getLast().fromWhole()).isCloseTo(0.0, within(1.0e-12)));
    }

    @Test
    void namesTheRepositoryHoldingTheReferenceFurthestFromWhereItWouldOtherwiseBe() {
        final List<CountedRepository> drawn = List.of(
                new CountedRepository("kettle", writing("kettle", 100)),
                new CountedRepository("lantern", writing("lantern", 1)),
                new CountedRepository("warden", writing("warden", 1)));
        final List<CorpusPlateau.Absence> absences =
                CorpusPlateau.newInstance().leavingEachOut(drawn, CorpusPooling.POOLED_OCCURRENCES);
        assertAll(
                () -> assertThat(absences).hasSize(3),
                () -> assertThat(absences.getFirst().left()).isEqualTo("kettle"),
                () -> assertThat(absences.getFirst().moves()).isGreaterThan(absences.getLast().moves()));
    }

    private static List<CountedRepository> identical(final int repositories) {
        return IntStream.range(0, repositories)
                .mapToObj(at -> new CountedRepository("same" + at, writing("kettle", 10)))
                .toList();
    }

    private static WrittenWords writing(final String word, final int times) {
        final WrittenWords written = new WrittenWords();
        IntStream.range(0, times).forEach(at -> written.saw(word, word + ".java:" + at, true));
        return written;
    }
}
