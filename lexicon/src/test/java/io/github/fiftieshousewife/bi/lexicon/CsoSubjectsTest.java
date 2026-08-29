package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CsoSubjectsTest {

    private final CsoSubjects subjects = CsoSubjects.fromClasspath();

    @Test
    void namesTheSchemeItPlacesAgainstAndCarriesEveryTopicTheOntologyStates() {
        assertAll(
                () -> assertThat(subjects.scheme()).isEqualTo("CSO"),
                () -> assertThat(subjects.concepts()).hasSize(11438),
                () -> assertThat(subjects.concepts()).allMatch(topic -> "topic".equals(topic.kind())));
    }

    @Test
    void placesAgainstTheTopicsStatedDirectlyBeneathOneOfTheTwelveRoots() {
        assertAll(
                () -> assertThat(subjects.described()).hasSize(225),
                () -> assertThat(subjects.described()).extracting(SkosConcept::broader).doesNotContain(""),
                () -> assertThat(subjects.described()).extracting(SkosConcept::prefLabel)
                        .contains("artificial intelligence", "computer security", "software engineering"));
    }

    @Test
    void describesASubjectByTheLabelsOfTheTopicsStatedBeneathIt() {
        final SkosConcept intelligence = subjects.described().stream()
                .filter(topic -> "artificial_intelligence".equals(topic.concept()))
                .findFirst()
                .orElseThrow();
        assertAll(
                () -> assertThat(intelligence.definition()).startsWith("artificial intelligence, "),
                () -> assertThat(intelligence.definition()).contains("machine learning"),
                () -> assertThat(intelligence.broader()).isEqualTo("computer_science"));
    }

    @Test
    void describesATopicTheOntologyPlacesNothingUnderByItsOwnLabelsAlone() {
        final List<SkosConcept> unbranched = subjects.described().stream()
                .filter(topic -> topic.definition().equals(topic.prefLabel()))
                .toList();
        assertThat(unbranched).isNotEmpty();
    }

    @Test
    void looksUpTheRootASubjectIsPooledUnder() {
        assertThat(subjects.conceptOf("computer_science").prefLabel()).isEqualTo("computer science");
    }

    @Test
    void statesEveryTopicsParentsAsIdentifiersSoOneHierarchyWalkServesEveryScheme() {
        assertThat(subjects.concepts()).allSatisfy(topic ->
                assertThat(topic.broaderConcepts()).allSatisfy(parent ->
                        assertThat(subjects.conceptOf(parent)).isNotNull()));
    }
}
