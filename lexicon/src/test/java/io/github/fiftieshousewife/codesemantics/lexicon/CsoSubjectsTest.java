package io.github.fiftieshousewife.codesemantics.lexicon;

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

    private SkosConcept subject(final String concept) {
        return subjects.described().stream()
                .filter(topic -> concept.equals(topic.concept()))
                .findFirst()
                .orElseThrow();
    }

    @Test
    void describesASubjectByTheLabelsOfTheTopicsStatedBeneathIt() {
        final SkosConcept intelligence = subject("artificial_intelligence");
        assertAll(
                () -> assertThat(intelligence.definition()).startsWith("artificial intelligence, "),
                () -> assertThat(intelligence.definition()).contains("machine learning"),
                () -> assertThat(intelligence.broader()).isEqualTo("computer_science"));
    }

    @Test
    void addsTheProseWikipediaStatesForEveryTopicBeneathItThatCsoLinksAnArticleTo() {
        final String stated = subject("artificial_intelligence").definition();
        final String labels = stated.split("\\. ", 2)[0];
        assertAll(
                () -> assertThat(stated).hasSizeGreaterThan(labels.length()),
                () -> assertThat(stated.split("\\s+").length).isGreaterThan(200));
    }

    @Test
    void readsFarMoreThanTheLabelsAloneAcrossThePlacementSubjects() {
        final long words = subjects.described().stream()
                .mapToLong(topic -> topic.definition().split("\\s+").length)
                .sum();
        assertThat(words).isGreaterThan(40_000);
    }

    @Test
    void reachesProseForMoreSubjectsThanCsoLinksAnArticleToDirectly() {
        final CsoAbstracts linked = CsoAbstracts.fromClasspath();
        final long directly = subjects.described().stream()
                .filter(topic -> linked.of(topic.concept()).isPresent())
                .count();
        final long anyProse = subjects.described().stream()
                .filter(topic -> topic.definition().contains(". "))
                .count();
        assertThat(anyProse).isGreaterThan(directly);
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

    @Test
    void statesNoParentOutsideTheTopicsItPublishes() {
        assertThat(new StatedParents(CsoTopics.fromClasspath().concepts()).unresolved()).isZero();
    }
}
