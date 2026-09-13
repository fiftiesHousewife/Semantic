package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DeclarationDiffTest {

    private static final String FILE = "Engine.java";

    @Test
    void readsADeclarationStandingAtTheHeadAloneAsAdded() {
        final DeclarationDiff diff = DeclarationDiff.between(
                List.of(method("load")),
                List.of(method("load"), method("unload")));
        assertAll(
                () -> assertThat(names(diff.added())).containsExactly("unload"),
                () -> assertThat(diff.removed()).isEmpty(),
                () -> assertThat(diff.kept()).isEqualTo(1));
    }

    @Test
    void readsADeclarationStandingAtTheBaseAloneAsRemoved() {
        final DeclarationDiff diff = DeclarationDiff.between(
                List.of(method("load"), method("unload")),
                List.of(method("load")));
        assertAll(
                () -> assertThat(names(diff.removed())).containsExactly("unload"),
                () -> assertThat(diff.added()).isEmpty(),
                () -> assertThat(diff.kept()).isEqualTo(1));
    }

    @Test
    void readsARenameAsOneRemovedAndOneAdded() {
        final DeclarationDiff diff = DeclarationDiff.between(
                List.of(method("load")),
                List.of(method("loadEngine")));
        assertAll(
                () -> assertThat(names(diff.added())).containsExactly("loadEngine"),
                () -> assertThat(names(diff.removed())).containsExactly("load"),
                () -> assertThat(diff.kept()).isZero());
    }

    @Test
    void readsAThirdOverloadOfANameAlreadyDeclaredTwiceAsOneAdded() {
        final DeclarationDiff diff = DeclarationDiff.between(
                List.of(method("load"), method("load")),
                List.of(method("load"), method("load"), method("load")));
        assertAll(
                () -> assertThat(names(diff.added())).containsExactly("load"),
                () -> assertThat(diff.kept()).isEqualTo(2));
    }

    @Test
    void readsTheSameNameInAnotherFileAsAnotherDeclaration() {
        final DeclarationDiff diff = DeclarationDiff.between(
                List.of(method("load")),
                List.of(new Declaration("Loader.java", List.of("Loader"), DeclarationKind.METHOD, "load")));
        assertAll(
                () -> assertThat(diff.added()).hasSize(1),
                () -> assertThat(diff.removed()).hasSize(1),
                () -> assertThat(diff.kept()).isZero());
    }

    @Test
    void countsEveryKindIncludingTheKindsAChangeDoesNotTouch() {
        final DeclarationDiff diff = DeclarationDiff.between(List.of(), List.of(method("load")));
        assertAll(
                () -> assertThat(diff.addedByKind()).containsEntry(DeclarationKind.METHOD, 1),
                () -> assertThat(diff.addedByKind()).containsEntry(DeclarationKind.TYPE, 0),
                () -> assertThat(diff.addedByKind()).containsEntry(DeclarationKind.FIELD, 0));
    }

    private static Declaration method(final String name) {
        return new Declaration(FILE, List.of("Engine"), DeclarationKind.METHOD, name);
    }

    private static List<String> names(final List<Declaration> declarations) {
        return declarations.stream().map(Declaration::name).toList();
    }
}
