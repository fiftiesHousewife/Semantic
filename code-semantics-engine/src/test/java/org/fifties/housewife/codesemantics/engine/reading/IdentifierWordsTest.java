package org.fifties.housewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;

import org.fifties.housewife.codesemantics.name.WordSegmenter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class IdentifierWordsTest {

    private final IdentifierWords words = new IdentifierWords(WordSegmenter.fromClasspath());

    @Test
    void readsAnIdentifierAsTheWordsItsOwnBoundariesGive() {
        assertAll(
                () -> assertThat(words.of("resolveNextPage").words())
                        .containsExactly("resolve", "next", "page"),
                () -> assertThat(words.of("resolveNextPage").gluedRunsRead()).isZero());
    }

    @Test
    void splitsARunNoBoundaryDivided() {
        final IdentifierReading reading = words.of("pushevent");

        assertAll(
                () -> assertThat(reading.words()).containsExactly("push", "event"),
                () -> assertThat(reading.gluedRunsRead()).isOne());
    }

    @Test
    void keepsARunTheSegmenterRefusesWholeRatherThanDroppingIt() {
        final IdentifierReading reading = words.of("tconst");

        assertAll(
                () -> assertThat(reading.words()).containsExactly("tconst"),
                () -> assertThat(reading.gluedRunsRead()).isZero());
    }

    @Test
    void readsNoWordsFromAnEmptyName() {
        assertThat(words.of("").words()).isEmpty();
    }

    @Test
    void copiesItsWordsSoALaterMutationCannotRewriteAReading() {
        final List<String> read = new ArrayList<>(List.of("page"));
        final IdentifierReading reading = new IdentifierReading(read, 0);
        read.add("cursor");

        assertThat(reading.words()).containsExactly("page");
    }
}
