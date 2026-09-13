package io.github.fiftieshousewife.codesemantics.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ConventionalCommitTypesTest {

    private final ConventionalCommitTypes types = ConventionalCommitTypes.fromClasspath();

    @Test
    void statesTheTwoTypesTheSpecificationDefinesWithItsOwnSentences() {
        assertAll(
                () -> assertThat(types.typeStated("fix")).hasValueSatisfying(fix -> assertAll(
                        () -> assertThat(fix.module()).isEqualTo("specification"),
                        () -> assertThat(fix.definition()).contains("patches a bug"))),
                () -> assertThat(types.typeStated("feat")).hasValueSatisfying(feat ->
                        assertThat(feat.definition()).contains("introduces a new feature")));
    }

    @Test
    void statesTheRecommendedTypesUnderTheAngularConvention() {
        assertAll(
                () -> assertThat(types.typeStated("refactor")).hasValueSatisfying(refactor -> assertAll(
                        () -> assertThat(refactor.module()).isEqualTo("angular-convention"),
                        () -> assertThat(refactor.definition())
                                .isEqualTo("A code change that neither fixes a bug nor adds a feature"))),
                () -> assertThat(types.typeStated("chore"))
                        .as("chore is named by the specification and defined by neither source")
                        .hasValueSatisfying(chore -> assertThat(chore.definition()).isEmpty()));
    }

    @Test
    void refusesATokenTheStandardDoesNotState() {
        assertThat(types.typeStated("wip")).isEmpty();
    }

    @Test
    void refusesTheBreakingChangeFooterAsAType() {
        assertAll(
                () -> assertThat(types.typeStated("BREAKING CHANGE")).isEmpty(),
                () -> assertThat(types.concepts())
                        .filteredOn(concept -> "footer".equals(concept.kind()))
                        .singleElement()
                        .extracting(SkosConcept::concept)
                        .isEqualTo("BREAKING CHANGE"));
    }
}
