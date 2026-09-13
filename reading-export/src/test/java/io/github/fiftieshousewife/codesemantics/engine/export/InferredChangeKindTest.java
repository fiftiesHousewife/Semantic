package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class InferredChangeKindTest {

    private final InferredChangeKind kinds = new InferredChangeKind();

    @Test
    void namesTheWordTheMappingStatesForTheShapeTheChangeHas() {
        final ExportedWork.Inferred inferred = kinds.of(WrittenFixture.adding(1, 2, 0, List.of()))
                .orElseThrow();

        assertAll(
                () -> assertThat(inferred.type()).isEqualTo("feat"),
                () -> assertThat(inferred.shape()).isEqualTo("adds declarations and removes none"),
                () -> assertThat(inferred.definition())
                        .startsWith("a commit of the type feat introduces"));
    }

    @Test
    void answersFromTheFilesBeforeTheDeclarations() {
        assertAll(
                () -> assertThat(kinds.of(over("documentation")).orElseThrow().type()).isEqualTo("docs"),
                () -> assertThat(kinds.of(over("tests")).orElseThrow().type())
                        .as("a change inside the source sets that check the published ones is a test "
                                + "even where it adds declarations")
                        .isEqualTo("test"),
                () -> assertThat(kinds.of(over("build")).orElseThrow().type()).isEqualTo("build"));
    }

    @Test
    void namesNothingWhereTheMappingStatesNoTypeForTheShape() {
        assertAll(
                () -> assertThat(kinds.of(removing())).isEmpty(),
                () -> assertThat(kinds.of(untouched())).isEmpty());
    }

    private static ExportedWork.Written over(final String kind) {
        final ExportedWork.Written adding = WrittenFixture.adding(1, 2, 0, List.of());
        return new ExportedWork.Written(adding.filesRead(), adding.filesAdded(), adding.added(),
                adding.removed(), adding.kept(), adding.typesAdded(), adding.typesRemoved(),
                List.of(new ExportedWork.KindFiles(kind, 3)), adding.atHead(), adding.atBase(),
                List.of());
    }

    private static ExportedWork.Written removing() {
        final ExportedWork.Written adding = WrittenFixture.adding(0, 0, 0, List.of());
        return new ExportedWork.Written(adding.filesRead(), adding.filesAdded(),
                new ExportedWork.Declarations(0, 0, 0), new ExportedWork.Declarations(0, 2, 0),
                adding.kept(), List.of(), List.of(), adding.filesByKind(), adding.atHead(),
                adding.atBase(), List.of());
    }

    private static ExportedWork.Written untouched() {
        return WrittenFixture.adding(0, 0, 0, List.of());
    }
}
