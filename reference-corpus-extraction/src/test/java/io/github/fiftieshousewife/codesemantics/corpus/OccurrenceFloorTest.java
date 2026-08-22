package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class OccurrenceFloorTest {

    private static final long SEED = 20260813L;

    @Test
    void saysARepositoryWritingWhatTheCorpusWritesCarriesNoMoreThanChance() {
        final List<OccurrenceFloor.Judged> judged = OccurrenceFloor.seeded(SEED)
                .over(alike(), CorpusPooling.MEAN_OF_SHARES);
        assertThat(judged).allSatisfy(one -> assertThat(one.saysMoreThanChance()).isFalse());
    }

    @Test
    void saysARepositoryWritingSomethingElseEntirelyCarriesMore() {
        final List<CountedRepository> drawn = new java.util.ArrayList<>(alike());
        drawn.add(new CountedRepository("apart", writing("flywheel", 4000)));
        final List<OccurrenceFloor.Judged> judged = OccurrenceFloor.seeded(SEED)
                .over(List.copyOf(drawn), CorpusPooling.MEAN_OF_SHARES);
        assertThat(judged).filteredOn(one -> one.name().equals("apart"))
                .allSatisfy(one -> assertThat(one.saysMoreThanChance()).isTrue());
    }

    @Test
    void ordersTheJudgementSmallestRepositoryFirst() {
        final List<OccurrenceFloor.Judged> judged = OccurrenceFloor.seeded(SEED)
                .over(alike(), CorpusPooling.MEAN_OF_SHARES);
        assertThat(judged).isSortedAccordingTo(
                java.util.Comparator.comparingInt(OccurrenceFloor.Judged::occurrences));
    }

    @Test
    void putsTheFloorAtTheLargestRepositorySayingNoMoreThanChance() {
        final OccurrenceFloor floor = OccurrenceFloor.seeded(SEED);
        final List<OccurrenceFloor.Judged> judged = floor.over(alike(), CorpusPooling.MEAN_OF_SHARES);
        assertAll(
                () -> assertThat(floor.at(judged)).isEqualTo(judged.getLast().occurrences()),
                () -> assertThat(floor.at(List.of())).isZero());
    }

    /** Four repositories writing the same two words in the same proportions, at different sizes. */
    private static List<CountedRepository> alike() {
        return IntStream.of(400, 800, 1600, 3200)
                .mapToObj(size -> new CountedRepository("same" + size, mixed(size)))
                .toList();
    }

    private static WrittenWords mixed(final int occurrences) {
        final WrittenWords written = new WrittenWords();
        IntStream.range(0, occurrences).forEach(at ->
                written.saw(at % 4 == 0 ? "kettle" : "lantern", "Same.java:" + at, true));
        return written;
    }

    private static WrittenWords writing(final String word, final int times) {
        final WrittenWords written = new WrittenWords();
        IntStream.range(0, times).forEach(at -> written.saw(word, word + ".java:" + at, true));
        return written;
    }
}
