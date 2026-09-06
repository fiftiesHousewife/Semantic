package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.term.BranchAgreement;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.PhraseBar;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedAncestry;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedDescriptions;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedPaths;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchNormalisation;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectAreas;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedTaxonomiesTest {

    private static SkosConcept filed(final String label, final String module) {
        return new SkosConcept("urn:" + label, label, "", "", "class", module, "", "");
    }

    private static SkosConcept concept(final String label, final String broader) {
        return described(label, broader, "what the publisher says it means");
    }

    private static SkosConcept described(final String label, final String broader,
                                         final String definition) {
        return new SkosConcept("http://purl.org/olia/olia.owl#" + label, label, "", broader, "class",
                "olia", definition, "");
    }

    private static TermSighting sighting(final List<String> words, final double specificity,
                                         final int occurrences, final SkosConcept... concepts) {
        return sighting(MatchNormalisation.WORDS, words, specificity, occurrences, concepts);
    }

    private static TermSighting sighting(final MatchNormalisation normalisation, final List<String> words,
                                         final double specificity, final int occurrences,
                                         final SkosConcept... concepts) {
        return new TermSighting(words, List.of(concepts), normalisation, specificity, occurrences,
                occurrences, List.of("engine/src/main/java/Reading.java:9"));
    }

    private static MatchedTerms matched(final TermSighting... sightings) {
        return new MatchedTerms(List.of(sightings), 900, 40, 12, Map.of(MatchNormalisation.WORDS, 12), Map.of());
    }

    private final ExportedTaxonomies taxonomies = new ExportedTaxonomies();

    private static final List<String> FIELD =
            List.of("OLiA", "CWE", "FIX", "FpML", "FIBO", "BIAN", "CSO");

    /** A bar stated rather than drawn, so a test of the export is not a test of the permutation. */
    private static final PhraseBar ABOVE_CHANCE = new PhraseBar("OLiA", 12, 3, 2, 4, 999, FIELD);

    /** A branch reading stated rather than drawn, so a test of the export is not a test of the dictionary. */
    private static final BranchAgreement AGREEING = BranchAgreement.between(
            TopicDistribution.ofCitedMass(Map.of("linguistics", 1.0)),
            List.of(concept("Verb", "WordClass"), concept("Noun", "WordClass")),
            SubjectAreas.fromClasspath());

    /** The publisher's own chain over the same rows, so the export states where a concept's branch ends. */
    private static final List<SkosConcept> PUBLISHED = List.of(
            concept("Verb", "WordClass"), concept("Noun", "WordClass"), concept("WordClass", ""),
            concept("Phrase", "Constituent"), concept("Clause", "Constituent"),
            concept("Constituent", ""));

    private static final StatedAncestry ANCESTRY = StatedAncestry.over(PUBLISHED);

    private static final StatedPaths PATHS = new StatedPaths(ANCESTRY, PUBLISHED);

    /** The publisher's own prose over the same rows, so a row states what its publisher says it is. */
    private static final StatedDescriptions DESCRIBED = StatedDescriptions.over(PUBLISHED, ANCESTRY);

    @Test
    void publishesTheFieldsMembershipBesideItsSize() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), AGREEING,
                ABOVE_CHANCE, PATHS, DESCRIBED);

        assertAll(
                () -> assertThat(exported.bar().fieldMembers()).isEqualTo(FIELD),
                () -> assertThat(exported.bar().field()).isEqualTo(FIELD.size()));
    }

    @Test
    void carriesEachConceptWithThePublishersOwnPlacementOfIt() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), AGREEING,
                ABOVE_CHANCE, PATHS, DESCRIBED);

        assertAll(
                () -> assertThat(exported.vocabulary()).isEqualTo("OLiA"),
                () -> assertThat(exported.concepts()).singleElement()
                        .isEqualTo(new ExportedConcept("Verb", "verb", "words",
                                "what the publisher says it means",
                                "what the publisher says it means", "Verb", "WordClass",
                                List.of("WordClass"), 20, 0.8, 1, 1.0,
                                new SightingSite("engine/src/main/java/Reading.java", 9))));
    }

    @Test
    void writesATermTwoConceptsReadAsTwice() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("root"), 0.9, 4, concept("Root", "Morpheme"),
                        concept("Root", "SyntacticHead"))), AGREEING, ABOVE_CHANCE, PATHS,
                DESCRIBED);

        assertThat(exported.concepts()).map(ExportedConcept::placedUnder)
                .as("which concept the repository meant is a question about evidence")
                .containsExactly("Morpheme", "SyntacticHead");
    }

    @Test
    void ordersTheConceptsBySpecificityTimesOccurrences() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("clause"), 0.9, 2, concept("Clause", "Constituent")),
                        sighting(List.of("noun"), 0.8, 30, concept("Noun", "WordClass"))), AGREEING,
                ABOVE_CHANCE, PATHS, DESCRIBED);

        assertThat(exported.concepts()).map(ExportedConcept::concept)
                .containsExactly("Noun", "Clause");
    }

    @Test
    void statesWhatEachBranchIsWorthAndWhatConditioningOnItWouldLeave() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), AGREEING,
                ABOVE_CHANCE, PATHS, DESCRIBED);

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
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), silent,
                ABOVE_CHANCE, PATHS, DESCRIBED);

        assertThat(exported.branches())
                .as("a taxonomy that cannot be weighed is not one that weighs zero")
                .isEmpty();
    }

    @Test
    void statesTheNormalisationLevelEachRowWasFoundAt() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(MatchNormalisation.WORDS, List.of("verb"), 0.8, 20, concept("Verb", "WordClass")),
                        sighting(MatchNormalisation.LEMMAS, List.of("phrases"), 0.7, 9,
                                concept("Phrase", "Constituent"))),
                AGREEING, ABOVE_CHANCE, PATHS, DESCRIBED);

        assertThat(exported.concepts())
                .extracting(ExportedConcept::term, ExportedConcept::normalisation)
                .as("a match found in the words written and one a dictionary reached are not the same "
                        + "evidence, and the count the bar tested is the first")
                .containsExactly(tuple("verb", "words"), tuple("phrases", "lemmas"));
    }

    @Test
    void describesAConceptItsPublisherStatesNoProseForByTheNearestLevelItDoes() {
        final List<SkosConcept> published = List.of(
                described("PublicKeys", "PublicKeyCryptography", ""),
                described("PublicKeyCryptography", "", "a cryptosystem of key pairs"));
        final StatedAncestry ancestry = StatedAncestry.over(published);
        final StatedPaths paths = new StatedPaths(ancestry, published);

        final ExportedTaxonomy exported = taxonomies.of("CSO",
                matched(sighting(List.of("public", "keys"), 0.9, 3,
                        described("PublicKeys", "PublicKeyCryptography", ""))),
                AGREEING, ABOVE_CHANCE, paths, StatedDescriptions.over(published, ancestry));

        assertAll(
                () -> assertThat(exported.concepts().getFirst().definition())
                        .as("the publisher states nothing about the concept itself")
                        .isEmpty(),
                () -> assertThat(exported.concepts().getFirst().description())
                        .isEqualTo("a cryptosystem of key pairs"),
                () -> assertThat(exported.concepts().getFirst().descriptionStatedFor())
                        .as("a report printing the branch's prose has to say whose it is")
                        .isEqualTo("PublicKeyCryptography"));
    }

    @Test
    void placesAConceptItsPublisherStatesNoParentForUnderTheModuleItFilesItIn() {
        final List<SkosConcept> published = List.of(filed("AccountType", "shared"),
                filed("ReasonCode", "doc"), filed("ReportId", "msg"), filed("Rate", "shared"));
        final StatedAncestry ancestry = StatedAncestry.over(published);

        final ExportedTaxonomy exported = taxonomies.of("FpML",
                matched(sighting(List.of("account", "type"), 0.9, 510, filed("AccountType", "shared")),
                        sighting(List.of("reason", "code"), 0.9, 74, filed("ReasonCode", "doc"))),
                AGREEING, ABOVE_CHANCE, new StatedPaths(ancestry, published),
                StatedDescriptions.over(published, ancestry));

        assertThat(exported.concepts())
                .extracting(ExportedConcept::concept, ExportedConcept::statedPath)
                .as("FpML declares 616 of its 1,405 types with no base type, and a page grouping them "
                        + "by their nearest level pools every one of them into a group with no name")
                .containsExactly(tuple("AccountType", List.of("shared")),
                        tuple("ReasonCode", List.of("doc")));
    }

    @Test
    void leavesTheDescriptionEmptyWhereNoLevelAtOrAboveTheConceptStatesAny() {
        final List<SkosConcept> published = List.of(described("SessionTypes", "TypeSystems", ""),
                described("TypeSystems", "", ""));
        final StatedAncestry ancestry = StatedAncestry.over(published);
        final StatedPaths paths = new StatedPaths(ancestry, published);

        final ExportedTaxonomy exported = taxonomies.of("CSO",
                matched(sighting(List.of("session", "types"), 0.9, 3,
                        described("SessionTypes", "TypeSystems", ""))),
                AGREEING, ABOVE_CHANCE, paths, StatedDescriptions.over(published, ancestry));

        assertAll(
                () -> assertThat(exported.concepts().getFirst().description()).isEmpty(),
                () -> assertThat(exported.concepts().getFirst().descriptionStatedFor())
                        .as("naming a node against no prose would read as a description that is missing")
                        .isEmpty());
    }

    @Test
    void countsEveryNormalisationLevelIncludingTheOnesProducingNoMatch() {
        final ExportedTaxonomy exported = taxonomies.of("OLiA",
                matched(sighting(List.of("verb"), 0.8, 20, concept("Verb", "WordClass"))), AGREEING,
                ABOVE_CHANCE, PATHS, DESCRIBED);

        assertAll(
                () -> assertThat(exported.matchesByNormalisation())
                        .as("a level producing no match reads as a zero")
                        .containsOnlyKeys("words", "lemmas", "expansions", "senses"),
                () -> assertThat(exported.matchesByNormalisation()).containsEntry("words", 20)
                        .containsEntry("lemmas", 0).containsEntry("expansions", 0)
                        .containsEntry("senses", 0));
    }
}
