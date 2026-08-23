package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class NearDuplicatesTest {

    private static final long SEED = 20260813L;

    @Test
    void saysTwoDrawsOfOneCorpusAreOneCorpus() {
        final List<NearDuplicates.Judged> judged = NearDuplicates.seeded(SEED).over(twoCopiesAndOneOther());
        assertThat(judged).filteredOn(pair -> pair.left().equals("copy") && pair.right().equals("copyAgain"))
                .singleElement()
                .satisfies(pair -> assertThat(pair.isOneCorpus()).isTrue());
    }

    @Test
    void saysTwoRepositoriesWritingDifferentWordsAreNot() {
        final List<NearDuplicates.Judged> judged = NearDuplicates.seeded(SEED).over(twoCopiesAndOneOther());
        assertThat(judged).filteredOn(pair -> pair.right().equals("apart"))
                .isNotEmpty()
                .allSatisfy(pair -> assertThat(pair.isOneCorpus()).isFalse());
    }

    @Test
    void judgesEveryPairOnceAndOrdersTheNearestFirst() {
        final List<NearDuplicates.Judged> judged = NearDuplicates.seeded(SEED).over(twoCopiesAndOneOther());
        assertAll(
                () -> assertThat(judged).hasSize(3),
                () -> assertThat(judged).isSortedAccordingTo(
                        Comparator.comparingDouble(NearDuplicates.Judged::between)));
    }

    @Test
    void namesTheLaterDrawnMemberOfEachPairThatIsOneCorpus() {
        final NearDuplicates duplicates = NearDuplicates.seeded(SEED);
        assertAll(
                () -> assertThat(duplicates.drawnTwice(duplicates.over(twoCopiesAndOneOther())))
                        .containsExactly("copyAgain"),
                () -> assertThat(duplicates.drawnTwice(List.of())).isEmpty());
    }

    @Test
    void abstainsWhereTheDrawHoldsOneRepository() {
        assertThat(NearDuplicates.seeded(SEED).over(List.of(new CountedRepository("only", mixed(400)))))
                .isEmpty();
    }

    /** Two repositories writing the same words in the same proportions, and one writing something else. */
    private static List<CountedRepository> twoCopiesAndOneOther() {
        return List.of(
                new CountedRepository("copy", mixed(4000)),
                new CountedRepository("copyAgain", mixed(3200)),
                new CountedRepository("apart", writing("flywheel", 3600)));
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
