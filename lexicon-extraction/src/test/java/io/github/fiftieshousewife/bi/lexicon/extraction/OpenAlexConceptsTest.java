package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class OpenAlexConceptsTest {

    private static final String SIBLING = OpenAlexTopicTest.RECORD
            .replace("T11347", "T10080")
            .replace("Neural Networks Stability and Synchronization", "Wireless Sensor Networks");

    private final OpenAlexConcepts concepts = new OpenAlexConcepts();

    private final List<SkosConcept> read = concepts.in(List.of(OpenAlexTopicTest.RECORD, SIBLING));

    @Test
    void writesARowForEveryLevelThePublisherStatesAndOneForEachTopic() {
        assertThat(read).extracting(SkosConcept::concept, SkosConcept::kind)
                .containsExactlyInAnyOrder(
                        tuple("domains/3", "domain"),
                        tuple("fields/17", "field"),
                        tuple("subfields/1705", "subfield"),
                        tuple("T11347", "topic"),
                        tuple("T10080", "topic"));
    }

    @Test
    void nestsEachLevelUnderTheOneAboveItAndRollsThemAllUpToTheirDomain() {
        assertAll(
                () -> assertThat(conceptOf("domains/3").broader()).isEmpty(),
                () -> assertThat(conceptOf("fields/17").broader()).isEqualTo("domains/3"),
                () -> assertThat(conceptOf("subfields/1705").broader()).isEqualTo("fields/17"),
                () -> assertThat(conceptOf("T11347").broader()).isEqualTo("subfields/1705"),
                () -> assertThat(read).extracting(SkosConcept::module).containsOnly("domains/3"));
    }

    @Test
    void statesTheProseAndTheArticleOnTheTopicAndNeitherOnTheLevelsAboveIt() {
        assertAll(
                () -> assertThat(conceptOf("T11347").definition())
                        .isEqualTo("This cluster of papers focuses on synchronization. "
                                + "Synchronization, Complex Networks"),
                () -> assertThat(conceptOf("T11347").note())
                        .isEqualTo("https://en.wikipedia.org/wiki/Synchronization_of_coupled_oscillators"),
                () -> assertThat(conceptOf("fields/17").definition()).isEmpty(),
                () -> assertThat(conceptOf("fields/17").note()).isEmpty());
    }

    @Test
    void statesNoLabelBeyondTheOneThePublisherWrites() {
        assertThat(read).extracting(SkosConcept::altLabel).containsOnly("");
    }

    @Test
    void letsALaterPartSupersedeAnEarlierRecordOfTheSameTopic() {
        final String renamed = OpenAlexTopicTest.RECORD
                .replace("Neural Networks Stability and Synchronization", "Synchronization of Networks");
        assertThat(concepts.in(List.of(OpenAlexTopicTest.RECORD, renamed)))
                .filteredOn(concept -> "T11347".equals(concept.concept()))
                .singleElement()
                .satisfies(topic -> assertThat(topic.prefLabel()).isEqualTo("Synchronization of Networks"));
    }

    private SkosConcept conceptOf(final String concept) {
        return read.stream().filter(row -> concept.equals(row.concept())).findFirst().orElseThrow();
    }
}
