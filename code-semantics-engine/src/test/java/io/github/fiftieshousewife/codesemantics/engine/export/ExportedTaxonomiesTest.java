package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;
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
                List.of("engine/src/main/java/Reading.java:9"));
    }

    private static MatchedTerms matched(final TermSighting... sightings) {
        return new MatchedTerms(List.of(sightings), 900, 40, 12, Map.of(TermRung.WORDS, 12), Map.of());
    }

    private final ExportedTaxonomies taxonomies = new ExportedTaxonomies();

    @Test
    void carriesEachConceptWithThePublishersOwnPlacementOfIt() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))));

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
                        concept("Root", "SyntacticHead"))));

        assertThat(exported.concepts()).map(ExportedTaxonomy.Concept::placedUnder)
                .as("which concept the repository meant is a question about evidence")
                .containsExactly("Morpheme", "SyntacticHead");
    }

    @Test
    void ordersTheConceptsBySpecificityTimesOccurrences() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("clause"), 0.9, 2, concept("Clause", "Constituent")),
                        sighting(List.of("noun"), 0.8, 30, concept("Noun", "WordClass"))));

        assertThat(exported.concepts()).map(ExportedTaxonomy.Concept::concept)
                .containsExactly("Noun", "Clause");
    }

    @Test
    void countsEveryNormalisationLevelIncludingTheOnesProducingNoMatch() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))));

        assertAll(
                () -> assertThat(exported.matchesByNormalisation())
                        .as("a level producing no match reads as a zero")
                        .containsOnlyKeys("words", "lemmas", "senses"),
                () -> assertThat(exported.matchesByNormalisation()).containsEntry("words", 20)
                        .containsEntry("lemmas", 0).containsEntry("senses", 0));
    }
}
