package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedAncestryTest {

    private final StatedAncestry ancestry = new StatedAncestry(LinguisticTerms.fromClasspath());

    @Test
    void climbsToTheBroadestConceptTheOntologyStatesAboveATerm() {
        assertThat(ancestry.of("Contrast")).containsExactly("Relation", "PragmaticRelation",
                "DiscourseRelation", "CoherenceRelation", "Comparison", "ContrastiveComparison", "Contrast");
    }

    @Test
    void placesTheVocabularyAProgramWritesUnderTheBranchesItsPublisherStates() {
        assertAll(
                () -> assertThat(ancestry.of("Verb"))
                        .as("these read as roots of their own until the extraction learned RDF's second "
                                + "spelling of a superclass, which cost 627 of the ontology's 1,422 edges")
                        .containsExactly("MorphosyntacticCategory", "Verb"),
                () -> assertThat(ancestry.of("CommonNoun"))
                        .containsExactly("MorphosyntacticCategory", "Noun", "CommonNoun"),
                () -> assertThat(ancestry.rootOf("Phrase")).isEqualTo("Constituent"),
                () -> assertThat(ancestry.rootOf("Token")).isEqualTo("OrthographicEntity"));
    }

    @Test
    void tellsTwoMatchedTermsApartByTheBranchTheirPublisherPutThemIn() {
        assertAll(
                () -> assertThat(ancestry.rootOf("Summary")).isEqualTo("Relation"),
                () -> assertThat(ancestry.rootOf("Sentence")).isEqualTo("LinguisticConcept"),
                () -> assertThat(ancestry.rootOf("Person")).isEqualTo("SemanticFeature"),
                () -> assertThat(ancestry.rootOf("Noun")).isEqualTo("MorphosyntacticCategory"));
    }

    @Test
    void asksTheOntologyInWhateverCaseTheTermArrivesIn() {
        assertThat(ancestry.of("contrast")).hasSize(7);
    }

    @Test
    void stopsWhereATaxonomyStatesAConceptAboveItself() {
        final TermIndex cycle = PublishedTerms.publishing("a taxonomy stating a cycle", "loop", "knot")
                .stating("Loop", "Knot").stating("Knot", "Loop");

        assertThat(new StatedAncestry(cycle).of("Loop")).containsExactly("Knot", "Loop");
    }

    @Test
    void namesTheLevelsAnOutrightMajorityOfAVocabularySitsBeneath() {
        final StatedAncestry spread = StatedAncestry.over(List.of(
                concept("Field", ""), concept("Under", "Field"), concept("AlsoUnder", "Field"),
                concept("ThirdUnder", "Field"), concept("Apart", "")));
        assertAll(
                () -> assertThat(spread.fieldLevels())
                        .as("three of the five sit beneath Field, which is more than half")
                        .containsExactly("Field"),
                () -> assertThat(spread.topOfTheBranchOf("Under"))
                        .as("naming Field says only which vocabulary matched, and nothing else stands "
                                + "above Under, so there is no branch to name")
                        .isEmpty(),
                () -> assertThat(spread.rootOf("Under"))
                        .as("the raw walk is unchanged")
                        .isEqualTo("Field"));
    }

    @Test
    void keepsEveryLevelBetweenTheTopOfABranchAndTheConcept() {
        final StatedAncestry deep = StatedAncestry.over(List.of(
                concept("Aspect", ""), concept("Value", "Aspect"),
                concept("QuantitativeValue", "Value"), concept("PresentValue", "QuantitativeValue"),
                concept("Elsewhere", ""), concept("Apart", "")));
        assertAll(
                () -> assertThat(deep.pathAbove("PresentValue"))
                        .as("the two ends of this path drop Value between them")
                        .containsExactly("Aspect", "Value", "QuantitativeValue"),
                () -> assertThat(deep.topOfTheBranchOf("PresentValue")).hasValue("Aspect"));
    }

    @Test
    void statesOneLevelWhereThePublisherStatesOneAncestor() {
        final StatedAncestry flat = StatedAncestry.over(List.of(
                concept("Session", ""), concept("MsgSeqNum", "Session"), concept("Elsewhere", "")));
        assertAll(
                () -> assertThat(flat.pathAbove("MsgSeqNum"))
                        .as("FIX places 5,434 of its 7,170 rows one level down, and a path of one is "
                                + "what the two ends printed twice")
                        .containsExactly("Session"),
                () -> assertThat(flat.pathAbove("Session")).isEmpty());
    }

    @Test
    void stepsPastAFieldLevelInThePathAsWellAsAtItsTop() {
        final StatedAncestry spread = StatedAncestry.over(List.of(
                concept("Common", ""), concept("Section", "Common"), concept("Field", "Section"),
                concept("Second", "Common"), concept("Third", "Common")));
        assertAll(
                () -> assertThat(spread.fieldLevels()).containsExactly("Common"),
                () -> assertThat(spread.pathAbove("Field"))
                        .as("Common names only the vocabulary that matched, wherever in the path it "
                                + "stands")
                        .containsExactly("Section"));
    }

    @Test
    void leavesAVocabularyWithNoSuchLevelUnchanged() {
        final StatedAncestry even = StatedAncestry.over(List.of(
                concept("Left", ""), concept("Right", ""), concept("UnderLeft", "Left"),
                concept("UnderRight", "Right")));
        assertAll(
                () -> assertThat(even.fieldLevels()).isEmpty(),
                () -> assertThat(even.topOfTheBranchOf("UnderLeft")).hasValue("Left"));
    }

    @Test
    void namesNoTopWhereThePublisherStatesNothingAboveTheConcept() {
        final StatedAncestry flat = StatedAncestry.over(List.of(
                concept("InterestAccrualsMethod", ""), concept("Elsewhere", ""),
                concept("Apart", "Elsewhere")));

        assertAll(
                () -> assertThat(flat.topOfTheBranchOf("InterestAccrualsMethod"))
                        .as("FpML declares 616 of its 1,405 types with no base type, and a concept is not "
                                + "the top of a branch it is the whole of")
                        .isEmpty(),
                () -> assertThat(flat.rootOf("InterestAccrualsMethod"))
                        .as("the raw walk still answers with the concept, which is what it is for")
                        .isEqualTo("InterestAccrualsMethod"));
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("urn:" + label, label, "", broader, "class", "", "", "");
    }
}
