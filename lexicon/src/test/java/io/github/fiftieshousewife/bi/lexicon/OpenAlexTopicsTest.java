package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class OpenAlexTopicsTest {

    private final OpenAlexTopics topics = OpenAlexTopics.fromClasspath();

    @Test
    void carriesEveryLevelOpenAlexStatesAndATopicForEachOfItsClusters() {
        assertAll(
                () -> assertThat(topics.concepts()).hasSize(4798),
                () -> assertThat(topics.domains()).hasSize(4),
                () -> assertThat(topics.concepts()).extracting(SkosConcept::kind)
                        .contains("domain", "field", "subfield", "topic"));
    }

    @Test
    void offersOnlyTheTopicsOpenAlexDescribesAsSomethingToCompareAgainst() {
        assertAll(
                () -> assertThat(topics.described()).hasSize(4516),
                () -> assertThat(topics.described()).allMatch(topic -> "topic".equals(topic.kind())),
                () -> assertThat(topics.described()).allMatch(topic -> !topic.definition().isBlank()));
    }

    /**
     * A reading that pools several of these joins their descriptions, so the order they arrive in is part of
     * the text it reads, and an immutable map randomises its iteration order once per JVM.
     */
    @Test
    void statesItsTopicsInTheOrderThePublisherStatesThem() {
        assertThat(topics.described()).extracting(SkosConcept::concept)
                .containsExactlyElementsOf(SkosRows.in("openalex-topics.tsv").stream()
                        .filter(row -> !row.definition().isBlank())
                        .map(SkosConcept::concept)
                        .toList());
    }

    @Test
    void nestsATopicInItsSubfieldAndRollsItUpToItsDomain() {
        assertAll(
                () -> assertThat(topics.conceptOf("T11347").prefLabel())
                        .isEqualTo("Neural Networks Stability and Synchronization"),
                () -> assertThat(topics.conceptOf("T11347").broader()).isEqualTo("subfields/1705"),
                () -> assertThat(topics.conceptOf("subfields/1705").broader()).isEqualTo("fields/17"),
                () -> assertThat(topics.conceptOf("fields/17").prefLabel()).isEqualTo("Computer Science"),
                () -> assertThat(topics.conceptOf("fields/17").broader()).isEqualTo("domains/3"),
                () -> assertThat(topics.conceptOf("T11347").module()).isEqualTo("domains/3"));
    }

    @Test
    void statesTheDescriptionAndThenTheKeywordsAsWhatTheTopicCovers() {
        assertThat(topics.conceptOf("T10181").definition())
                .contains("dependency parsing, word sense disambiguation")
                .contains("Dependency Parsing, Word Sense Disambiguation");
    }

    @Test
    void linksATopicToTheArticleThePublisherIdentifiesItBy() {
        assertThat(topics.conceptOf("T11347").note())
                .isEqualTo("https://en.wikipedia.org/wiki/Synchronization_of_coupled_oscillators");
    }

    @Test
    void statesEveryConceptItNamesAsBroaderThanAnother() {
        assertThat(topics.concepts().stream().map(SkosConcept::concept).toList())
                .containsAll(topics.concepts().stream().map(SkosConcept::broader)
                        .filter(broader -> !broader.isEmpty()).toList());
    }

    @Test
    void refusesATopicTheTaxonomyDoesNotStateRatherThanAnsweringEmptily() {
        assertThatThrownBy(() -> topics.conceptOf("T99999"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("T99999");
    }
}
