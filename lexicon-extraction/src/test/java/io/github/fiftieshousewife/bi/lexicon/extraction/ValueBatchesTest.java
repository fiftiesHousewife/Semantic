package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ValueBatchesTest {

    private final ValueBatches batches = new ValueBatches(10);

    @Test
    void cutsAListIntoRunsOfTheStatedSizeWithTheRemainderLast() {
        final List<String> items = IntStream.range(0, 25).mapToObj(String::valueOf).toList();

        final List<List<String>> cut = batches.of(items);

        assertAll(
                () -> assertThat(cut).hasSize(3),
                () -> assertThat(cut.getFirst()).hasSize(10),
                () -> assertThat(cut.getLast()).hasSize(5),
                () -> assertThat(cut.stream().flatMap(List::stream)).containsExactlyElementsOf(items));
    }

    @Test
    void cutsAnEmptyListIntoNoRuns() {
        assertThat(batches.of(List.of())).isEmpty();
    }
}
