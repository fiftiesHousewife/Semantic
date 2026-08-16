package org.fifties.housewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.term.MatchedTerms;
import org.fifties.housewife.codesemantics.engine.term.TermRung;
import org.fifties.housewife.codesemantics.engine.term.TermSighting;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedTaxonomiesTest {

    private static final ExportedTaxonomy.Placement PLACEMENT =
            ExportedTaxonomy.Placement.of("arXiv", "cs Computer Science", 0.3408, 0.4124);

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("http://purl.org/olia/olia.owl#" + label, label, "", broader, "class",
                "olia", "what the publisher says it means", "");
    }

    private static TermSighting sighting(final List<String> words, final double specificity,
                                         final int occurrences, final SkosConcept... concepts) {
        return new TermSighting(words, List.of(concepts), TermRung.WORDS, specificity, occurrences,
                List.of("engine/src/main/java/Reading.java:9"));
    }

    private static MatchedTerms matched(final TermSighting... sightings) {
        return new MatchedTerms(List.of(sightings), 900, 40, 12, Map.of(TermRung.WORDS, 12));
    }

    private final ExportedTaxonomies taxonomies = new ExportedTaxonomies();

    @Test
    void carriesEachConceptWithThePublishersOwnPlacementOfIt() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), PLACEMENT);

        assertAll(
                () -> assertThat(exported.vocabulary()).isEqualTo("OLiA"),
                () -> assertThat(exported.concepts()).singleElement()
                        .isEqualTo(new ExportedTaxonomy.Concept("Verb", "WordClass", 20, 0.8, 1,
                                new SightingSite("engine/src/main/java/Reading.java", 9))));
    }

    @Test
    void writesATermTwoConceptsReadAsTwice() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("root"), 0.9, 4, concept("Root", "Morpheme"),
                        concept("Root", "SyntacticHead"))), PLACEMENT);

        assertThat(exported.concepts()).map(ExportedTaxonomy.Concept::placedUnder)
                .as("which concept the repository meant is a question about evidence")
                .containsExactly("Morpheme", "SyntacticHead");
    }

    @Test
    void ordersTheConceptsBySpecificityTimesOccurrences() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("clause"), 0.9, 2, concept("Clause", "Constituent")),
                        sighting(List.of("noun"), 0.8, 30, concept("Noun", "WordClass"))), PLACEMENT);

        assertThat(exported.concepts()).map(ExportedTaxonomy.Concept::concept)
                .containsExactly("Noun", "Clause");
    }

    @Test
    void countsEveryNormalisationLevelIncludingTheOnesProducingNoMatch() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), PLACEMENT);

        assertAll(
                () -> assertThat(exported.matchesByNormalisation())
                        .as("a level producing no match reads as a zero")
                        .containsOnlyKeys("words", "lemmas", "senses"),
                () -> assertThat(exported.matchesByNormalisation()).containsEntry("words", 20)
                        .containsEntry("lemmas", 0).containsEntry("senses", 0));
    }

    @Test
    void statesWhetherThePlacementStandsApartFromChance() {
        assertAll(
                () -> assertThat(PLACEMENT.standsApartFromChance()).isTrue(),
                () -> assertThat(ExportedTaxonomy.Placement.of("arXiv", "cs", 0.42, 0.40).standsApartFromChance())
                        .isFalse());
    }
}
