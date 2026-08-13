package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.theme.SharedReadings.SharedReading;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SharedReadingsTest {

    private final TopicWitnesses witnesses = new TopicWitnesses();

    private void read(final String topic, final String word, final int occurrences) {
        for (int occurrence = 0; occurrence < occurrences; occurrence++) {
            witnesses.record(topic, word, "Example.java:1", EvidenceSource.WORDNET_DOMAIN);
        }
    }

    private List<SharedReading> among(final String... topics) {
        return new SharedReadings().among(List.of(topics), witnesses);
    }

    @Test
    void joinsTwoTopicsByTheWordsReadAsBoth() {
        read("music", "string", 40);
        read("jewellery", "string", 40);
        read("linguistics", "word", 30);

        assertThat(among("music", "jewellery", "linguistics"))
                .singleElement()
                .satisfies(shared -> assertAll(
                        () -> assertThat(shared.topic()).isEqualTo("music"),
                        () -> assertThat(shared.other()).isEqualTo("jewellery"),
                        () -> assertThat(shared.words()).containsExactly("string"),
                        () -> assertThat(shared.occurrences()).isEqualTo(40)));
    }

    @Test
    void namesTheHeaviestSharedWordsFirst() {
        read("music", "string", 40);
        read("music", "line", 10);
        read("jewellery", "string", 40);
        read("jewellery", "line", 10);

        assertThat(among("music", "jewellery"))
                .singleElement()
                .satisfies(shared -> assertAll(
                        () -> assertThat(shared.words()).containsExactly("string", "line"),
                        () -> assertThat(shared.occurrences()).isEqualTo(50)));
    }

    @Test
    void joinsNothingToTopicsWithNoWordInCommon() {
        read("music", "string", 5);
        read("linguistics", "word", 5);

        assertThat(among("music", "linguistics")).isEmpty();
    }

    @Test
    void neverJoinsATopicToItself() {
        read("music", "string", 5);

        assertThat(among("music")).isEmpty();
    }

    @Test
    void ordersTheHeaviestEdgeFirst() {
        read("music", "string", 40);
        read("jewellery", "string", 40);
        read("law", "string", 40);
        read("law", "evidence", 20);
        read("linguistics", "evidence", 20);

        assertThat(among("music", "jewellery", "law", "linguistics"))
                .extracting(SharedReading::occurrences)
                .isSortedAccordingTo((first, second) -> Integer.compare(second, first));
    }

    @Test
    void pairsOnlyTheTopicsItWasAskedAbout() {
        read("music", "string", 5);
        read("jewellery", "string", 5);

        assertThat(among("music")).isEmpty();
    }
}
