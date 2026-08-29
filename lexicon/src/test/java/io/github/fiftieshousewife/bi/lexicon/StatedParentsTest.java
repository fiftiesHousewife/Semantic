package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedParentsTest {

    private static SkosConcept topic(final String concept, final String label, final String broader) {
        return new SkosConcept(concept, label, "", broader, "topic", "", "", "");
    }

    private static final SkosConcept ROOT = topic("computer_science", "computer science", "");

    private static final SkosConcept BY_LABEL = topic("machine_learning", "machine learning",
            "artificial intelligence");

    private static final SkosConcept BY_IDENTIFIER = topic("artificial_intelligence",
            "artificial intelligence", "computer_science");

    private final StatedParents stated =
            new StatedParents(List.of(ROOT, BY_LABEL, BY_IDENTIFIER));

    @Test
    void readsAParentWrittenAsALabelAndOneWrittenAsAnIdentifierAsTheSameConcept() {
        assertAll(
                () -> assertThat(stated.of("machine_learning").broaderConcepts())
                        .containsExactly("artificial_intelligence"),
                () -> assertThat(stated.of("artificial_intelligence").broaderConcepts())
                        .containsExactly("computer_science"));
    }

    @Test
    void statesTheConceptsDirectlyBeneathOneInThePublishersOwnOrder() {
        assertAll(
                () -> assertThat(stated.beneath("artificial_intelligence"))
                        .extracting(SkosConcept::concept).containsExactly("machine_learning"),
                () -> assertThat(stated.beneath("machine_learning")).isEmpty());
    }

    @Test
    void statesTheConceptsWithNoParentAsTheTopOfTheHierarchy() {
        assertThat(stated.roots()).extracting(SkosConcept::concept).containsExactly("computer_science");
    }

    @Test
    void keepsEveryParentOfAConceptStatedBeneathSeveral() {
        final StatedParents polyHierarchy = new StatedParents(List.of(ROOT, BY_IDENTIFIER,
                topic("cryptography", "cryptography",
                        "artificial intelligence" + SkosConcept.STATEMENTS + "computer_science")));
        assertThat(polyHierarchy.of("cryptography").broaderConcepts())
                .containsExactly("artificial_intelligence", "computer_science");
    }

    @Test
    void keepsAParentTheSchemeStatesNeitherAsAnIdentifierNorAsALabelAndCountsIt() {
        final StatedParents outside =
                new StatedParents(List.of(ROOT, topic("robotics", "robotics", "cybernetics")));
        assertAll(
                () -> assertThat(outside.of("robotics").broaderConcepts()).containsExactly("cybernetics"),
                () -> assertThat(outside.beneath("cybernetics")).extracting(SkosConcept::concept)
                        .containsExactly("robotics"),
                () -> assertThat(outside.unresolved()).isEqualTo(1),
                () -> assertThat(outside.roots()).extracting(SkosConcept::concept)
                        .containsExactly("computer_science"));
    }

    @Test
    void resolvesEveryParentOfASchemeThatPublishesARowForAllOfThem() {
        assertThat(stated.unresolved()).isZero();
    }

    @Test
    void refusesToLookUpAConceptTheSchemeDoesNotState() {
        assertThatThrownBy(() -> stated.of("cybernetics"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("cybernetics");
    }
}
