package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CsoConceptsTest {

    private static final String TOPIC = "https://cso.kmi.open.ac.uk/topics/";
    private static final String SCHEMA = "http://cso.kmi.open.ac.uk/schema/cso#";

    private final CsoConcepts concepts = new CsoConcepts();

    private static String triple(final String subject, final String predicate, final String object) {
        return "\"<" + subject + ">\",\"<" + predicate + ">\",\"<" + object + ">\"";
    }

    private static String labelled(final String tail) {
        return "\"<" + TOPIC + tail + ">\",\"<http://www.w3.org/2000/01/rdf-schema#label>\",\"x\"@en .";
    }

    private String csv(final String... lines) {
        return String.join("\n", lines);
    }

    @Test
    void readsATopicsLabelFromItsOwnUriWithEscapesDecodedAndUnderscoresAsSpaces() {
        final List<SkosConcept> read = concepts.in(csv(labelled("c%2B%2B_language")));

        assertAll(
                () -> assertThat(read).singleElement().extracting(SkosConcept::concept)
                        .isEqualTo("c%2B%2B_language"),
                () -> assertThat(read).singleElement().extracting(SkosConcept::prefLabel)
                        .isEqualTo("c++ language"));
    }

    @Test
    void carriesEveryParentSortedUnderOneSeparator() {
        final List<SkosConcept> read = concepts.in(csv(
                labelled("child"),
                triple(TOPIC + "walking", SCHEMA + "superTopicOf", TOPIC + "child"),
                triple(TOPIC + "care", SCHEMA + "superTopicOf", TOPIC + "child")));

        assertThat(read).singleElement().extracting(SkosConcept::broader)
                .isEqualTo("care | walking");
    }

    @Test
    void readsBothKindsOfEquivalentAsAlternativeLabelsIncludingTheTopicItself() {
        final List<SkosConcept> read = concepts.in(csv(
                labelled("16s_rrna"),
                triple(TOPIC + "16s_rrna", SCHEMA + "relatedEquivalent", TOPIC + "16s_rrna_gene"),
                triple(TOPIC + "16s_rrna", SCHEMA + "preferentialEquivalent", TOPIC + "16s_rrna")));

        assertThat(read).singleElement().extracting(SkosConcept::altLabel)
                .isEqualTo("16s rrna | 16s rrna gene");
    }

    @Test
    void decodesAnEquivalentsEscapesTheSameWayAsEveryOtherLabel() {
        final List<SkosConcept> read = concepts.in(csv(
                labelled("aqm"),
                triple(TOPIC + "aqm", SCHEMA + "relatedEquivalent",
                        TOPIC + "active_queue_management_%28aqm%29")));

        assertThat(read).singleElement().extracting(SkosConcept::altLabel)
                .isEqualTo("active queue management (aqm)");
    }

    @Test
    void collapsesATopicIntoThePublishersPreferredSpelling() {
        final List<SkosConcept> read = concepts.in(csv(
                labelled("computer_system"),
                labelled("computer_systems"),
                triple(TOPIC + "computer_system", SCHEMA + "preferentialEquivalent",
                        TOPIC + "computer_systems"),
                triple(TOPIC + "computer_systems", SCHEMA + "preferentialEquivalent",
                        TOPIC + "computer_systems")));

        assertAll(
                () -> assertThat(read).extracting(SkosConcept::prefLabel)
                        .containsExactly("computer systems"),
                () -> assertThat(read).singleElement().extracting(SkosConcept::altLabel)
                        .asString().contains("computer system"));
    }

    @Test
    void rewritesAParentThroughItsPreferredSpelling() {
        final List<SkosConcept> read = concepts.in(csv(
                labelled("child"),
                labelled("computer_system"),
                labelled("computer_systems"),
                triple(TOPIC + "computer_system", SCHEMA + "preferentialEquivalent",
                        TOPIC + "computer_systems"),
                triple(TOPIC + "computer_system", SCHEMA + "superTopicOf", TOPIC + "child")));

        assertThat(read).filteredOn(concept -> concept.prefLabel().equals("child"))
                .extracting(SkosConcept::broader)
                .containsExactly("computer systems");
    }

    @Test
    void mergesACollapsedTopicsParentsIntoTheSurvivors() {
        final List<SkosConcept> read = concepts.in(csv(
                labelled("computer_system"),
                labelled("computer_systems"),
                labelled("hardware"),
                triple(TOPIC + "computer_system", SCHEMA + "preferentialEquivalent",
                        TOPIC + "computer_systems"),
                triple(TOPIC + "hardware", SCHEMA + "superTopicOf", TOPIC + "computer_system")));

        assertThat(read).filteredOn(concept -> concept.prefLabel().equals("computer systems"))
                .extracting(SkosConcept::broader)
                .containsExactly("hardware");
    }

    @Test
    void keepsATopicWhosePreferredSpellingIsNotATopic() {
        final List<SkosConcept> read = concepts.in(csv(
                labelled("kept"),
                triple(TOPIC + "kept", SCHEMA + "preferentialEquivalent", TOPIC + "unlabelled")));

        assertThat(read).extracting(SkosConcept::prefLabel).containsExactly("kept");
    }

    @Test
    void aSubjectWithoutALabelIsNoTopicAndOtherStatementsAreNotRead() {
        final List<SkosConcept> read = concepts.in(csv(
                labelled("kept"),
                triple(TOPIC + "unlabelled", SCHEMA + "superTopicOf", TOPIC + "kept"),
                triple(TOPIC + "kept", SCHEMA + "contributesTo", TOPIC + "unlabelled"),
                triple(TOPIC + "kept", "http://www.w3.org/2002/07/owl#sameAs",
                        "http://www.wikidata.org/entity/Q1")));

        assertAll(
                () -> assertThat(read).extracting(SkosConcept::concept).containsExactly("kept"),
                () -> assertThat(read).singleElement().extracting(SkosConcept::broader)
                        .isEqualTo("unlabelled"));
    }

    @Test
    void statesTheEmptyColumnsATopicRowAlwaysHas() {
        final SkosConcept read = concepts.in(csv(labelled("topic"))).getFirst();

        assertAll(
                () -> assertThat(read.kind()).isEqualTo("topic"),
                () -> assertThat(read.module()).isEmpty(),
                () -> assertThat(read.definition()).isEmpty(),
                () -> assertThat(read.note()).isEmpty());
    }
}
