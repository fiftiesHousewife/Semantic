package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.BranchAgreement;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectAreas;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedTaxonomiesTest {

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("http://purl.org/olia/olia.owl#" + label, label, "", broader, "class",
                "olia", "what the publisher says it means", "");
    }

    private static TermSighting sighting(final List<String> words, final double specificity,
                                         final int occurrences, final SkosConcept... concepts) {
        return new TermSighting(words, List.of(concepts), TermRung.WORDS, specificity, occurrences,
                occurrences, List.of("engine/src/main/java/Reading.java:9"));
    }

    private static MatchedTerms matched(final TermSighting... sightings) {
        return new MatchedTerms(List.of(sightings), 900, 40, 12, Map.of(TermRung.WORDS, 12), Map.of());
    }

    private final ExportedTaxonomies taxonomies = new ExportedTaxonomies();

    /** A branch reading stated rather than drawn, so a test of the export is not a test of the dictionary. */
    private static final BranchAgreement AGREEING = BranchAgreement.between(
            TopicDistribution.ofCitedMass(Map.of("linguistics", 1.0)),
            List.of(concept("Verb", "WordClass"), concept("Noun", "WordClass")),
            SubjectAreas.fromClasspath());

    @Test
    void carriesEachConceptWithThePublishersOwnPlacementOfIt() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), AGREEING);

        assertAll(
                () -> assertThat(exported.vocabulary()).isEqualTo("OLiA"),
                () -> assertThat(exported.concepts()).singleElement()
                        .isEqualTo(new ExportedTaxonomy.Concept("Verb", "WordClass", 20, 0.8, 1, 1.0,
                                new SightingSite("engine/src/main/java/Reading.java", 9))));
    }

    @Test
    void writesATermTwoConceptsReadAsTwice() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("root"), 0.9, 4, concept("Root", "Morpheme"),
                        concept("Root", "SyntacticHead"))), AGREEING);

        assertThat(exported.concepts()).map(ExportedTaxonomy.Concept::placedUnder)
                .as("which concept the repository meant is a question about evidence")
                .containsExactly("Morpheme", "SyntacticHead");
    }

    @Test
    void ordersTheConceptsBySpecificityTimesOccurrences() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("clause"), 0.9, 2, concept("Clause", "Constituent")),
                        sighting(List.of("noun"), 0.8, 30, concept("Noun", "WordClass"))), AGREEING);

        assertThat(exported.concepts()).map(ExportedTaxonomy.Concept::concept)
                .containsExactly("Noun", "Clause");
    }

    @Test
    void statesWhatEachBranchIsWorthAndWhatConditioningOnItWouldLeave() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), AGREEING);

        assertAll(
                () -> assertThat(exported.branches()).singleElement()
                        .extracting(ExportedTaxonomy.Branch::branch).isEqualTo("WordClass"),
                () -> assertThat(exported.branches().getFirst().mass()).isEqualTo(0.8 * 20),
                () -> assertThat(exported.branches().getFirst().agreesWithTheRepository())
                        .isBetween(0.0, 1.0),
                () -> assertThat(exported.branches().getFirst().kept())
                        .as("the weight is reported and applied to nothing, so kept is mass times it")
                        .isEqualTo(exported.branches().getFirst().mass()
                                * exported.branches().getFirst().agreesWithTheRepository()),
                () -> assertThat(exported.concepts().getFirst().occurrences())
                        .as("the concepts stay ordered by unconditioned mass")
                        .isEqualTo(20));
    }

    @Test
    void leavesABranchWhosePublisherStatesNoProseOutRatherThanAtZero() {
        final BranchAgreement silent = BranchAgreement.between(
                TopicDistribution.ofCitedMass(Map.of("linguistics", 1.0)),
                List.of(new SkosConcept("urn:Verb", "Verb", "", "WordClass", "class", "cso", "", "")),
                SubjectAreas.fromClasspath());

        final ExportedTaxonomy exported = taxonomies.of("CSO",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), silent);

        assertThat(exported.branches())
                .as("a taxonomy that cannot be weighed is not one that weighs zero")
                .isEmpty();
    }

    @Test
    void countsEveryNormalisationLevelIncludingTheOnesProducingNoMatch() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), AGREEING);

        assertAll(
                () -> assertThat(exported.matchesByNormalisation())
                        .as("a level producing no match reads as a zero")
                        .containsOnlyKeys("words", "lemmas", "senses"),
                () -> assertThat(exported.matchesByNormalisation()).containsEntry("words", 20)
                        .containsEntry("lemmas", 0).containsEntry("senses", 0));
    }
}
