package io.github.fiftieshousewife.bi.lexicon.extraction;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class OpenAlexTopicTest {

    static final String RECORD = """
            {"id":"https://openalex.org/T11347",
             "display_name":"Neural Networks Stability and Synchronization",
             "description":"This cluster of papers focuses on synchronization.",
             "keywords":["Synchronization","Complex Networks"],
             "ids":{"openalex":"https://openalex.org/T11347",
                    "wikipedia":"https://en.wikipedia.org/wiki/Synchronization_of_coupled_oscillators"},
             "subfield":{"id":"https://openalex.org/subfields/1705",
                         "display_name":"Computer Networks and Communications"},
             "field":{"id":"https://openalex.org/fields/17","display_name":"Computer Science"},
             "domain":{"id":"https://openalex.org/domains/3","display_name":"Physical Sciences"}}
            """;

    private final OpenAlexTopic topic = OpenAlexTopic.of(RECORD);

    @Test
    void takesThePublishersOwnIdentifierPathAsTheConcept() {
        assertAll(
                () -> assertThat(topic.concept()).isEqualTo("T11347"),
                () -> assertThat(topic.label()).isEqualTo("Neural Networks Stability and Synchronization"));
    }

    @Test
    void statesTheDescriptionAndTheKeywordsAsTwoAccountsOfWhatTheTopicCovers() {
        assertThat(topic.subjectMatter()).isEqualTo("This cluster of papers focuses on synchronization."
                + " | Synchronization, Complex Networks");
    }

    @Test
    void leavesTheTwoAccountsSeparableByTheReaderThatSplitsAnyRepeatedProperty() {
        assertThat(new SkosConcept("T11347", topic.label(), "", "", "topic", "", topic.subjectMatter(), "")
                .definitions())
                .containsExactly("This cluster of papers focuses on synchronization.",
                        "Synchronization, Complex Networks");
    }

    @Test
    void carriesTheArticleThePublisherLinksTheTopicTo() {
        assertThat(topic.wikipedia())
                .isEqualTo("https://en.wikipedia.org/wiki/Synchronization_of_coupled_oscillators");
    }

    @Test
    void statesTheThreeLevelsAboveItWithTheWidestFirst() {
        assertThat(topic.above()).extracting(OpenAlexLevel::concept, OpenAlexLevel::label,
                        OpenAlexLevel::kind)
                .containsExactly(
                        tuple("domains/3", "Physical Sciences", "domain"),
                        tuple("fields/17", "Computer Science", "field"),
                        tuple("subfields/1705",
                                "Computer Networks and Communications", "subfield"));
    }

    @Test
    void refusesARecordThePublisherStatesNoSubfieldFor() {
        assertThatThrownBy(() -> OpenAlexTopic.of(RECORD.replace("\"subfield\"", "\"unplaced\"")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("T11347")
                .hasMessageContaining("subfield");
    }

    @Test
    void statesNoArticleWhereThePublisherLinksNone() {
        assertThat(OpenAlexTopic.of(RECORD.replace("\"wikipedia\"", "\"unlinked\"")).wikipedia()).isEmpty();
    }

    @Test
    void statesOnlyTheDescriptionWhereThePublisherGivesNoKeywords() {
        assertThat(OpenAlexTopic.of(RECORD.replace("[\"Synchronization\",\"Complex Networks\"]", "[]"))
                .subjectMatter()).isEqualTo("This cluster of papers focuses on synchronization.");
    }
}
