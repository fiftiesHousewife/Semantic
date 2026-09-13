package io.github.fiftieshousewife.codesemantics.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ChangeShapesTest {

    private final ChangeShapes shapes = ChangeShapes.fromClasspath();

    @Test
    void statesTheStandardsOwnWordBesideTheMeasurementItCovers() {
        final ChangeShape adding = shapes.named("adds-declarations").orElseThrow();

        assertAll(
                () -> assertThat(adding.type()).isEqualTo("feat"),
                () -> assertThat(adding.measurement()).isEqualTo("adds declarations and removes none"),
                () -> assertThat(adding.definition()).startsWith("a commit of the type feat introduces"),
                () -> assertThat(adding.isNamed()).isTrue());
    }

    @Test
    void statesWhyAShapeUnderNoDefinitionNamesNothing() {
        final ChangeShape removing = shapes.named("removes-declarations").orElseThrow();

        assertAll(
                () -> assertThat(removing.isNamed()).isFalse(),
                () -> assertThat(removing.type()).isEmpty(),
                () -> assertThat(removing.note()).contains("Semantic Versioning"),
                () -> assertThat(removing.note()).contains("names nothing"));
    }

    @Test
    void appliesTheFilesRulesBeforeTheDeclarationRules() {
        assertThat(shapes.shapes())
                .extracting(ChangeShape::shape)
                .as("a change inside the source sets that check the published ones is a test even where "
                        + "it adds declarations, so the file rules answer first")
                .startsWith("documentation-only", "checks-only", "build-only", "adds-declarations");
    }

    @Test
    void quotesEveryTypeItNamesFromTheBundledStandard() {
        final ConventionalCommitTypes types = ConventionalCommitTypes.fromClasspath();

        assertAll(shapes.shapes().stream()
                .filter(ChangeShape::isNamed)
                .map(shape -> () -> assertThat(types.typeStated(shape.type()))
                        .as("%s names %s, which the bundled standard must state", shape.shape(),
                                shape.type())
                        .isPresent()));
    }

    @Test
    void namesNoShapeTheMappingDoesNotState() {
        assertThat(shapes.named("invented-here")).isEmpty();
    }
}
