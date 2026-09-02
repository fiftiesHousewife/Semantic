package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;

class UnreadJavaFilesTest {

    private final UnreadJavaFiles unread = new UnreadJavaFiles();

    private final JavaSourceScopes scopes = new JavaSourceScopes();

    private static void javaFile(final Path directory, final String name) throws IOException {
        Files.createDirectories(directory);
        Files.writeString(directory.resolve(name), "package a; class " + name.replace(".java", "") + " { }");
    }

    @Test
    void countsNothingWhereEveryJavaFileSitsInAScope(@TempDir final Path root) throws IOException {
        javaFile(root.resolve("module/src/main/java/a"), "Read.java");
        javaFile(root.resolve("module/src/test/java/a"), "AlsoRead.java");

        assertThat(unread.under(root, scopes.under(root))).isZero();
    }

    @Test
    void countsEveryJavaFileOfATreeLaidOutWhereNoScopeLooks(@TempDir final Path root) throws IOException {
        javaFile(root.resolve("src-core/a"), "Core.java");
        javaFile(root.resolve("src-fpml/a"), "Fpml.java");
        javaFile(root.resolve("src-dsig/a"), "Dsig.java");

        assertThat(unread.under(root, scopes.under(root)))
                .as("a tree yielding no scope and holding Java is not a tree with nothing to say")
                .isEqualTo(3);
    }

    @Test
    void countsNothingInATreeThatHoldsNoJavaAtAll(@TempDir final Path root) throws IOException {
        Files.writeString(root.resolve("settings.yaml"), "key: value\n");

        assertThat(unread.under(root, scopes.under(root)))
                .as("a configuration repository read no Java because there is none, which the count says")
                .isZero();
    }

    @Test
    void countsTheJavaOutsideAScopeWhereATreeHoldsBoth(@TempDir final Path root) throws IOException {
        javaFile(root.resolve("module/src/main/java/a"), "Read.java");
        javaFile(root.resolve("generated/a"), "Elsewhere.java");

        assertThat(unread.under(root, scopes.under(root))).isOne();
    }

    @Test
    void countsNoFileTheTreeItselfStatesIsNotPartOfIt(@TempDir final Path root) throws IOException {
        javaFile(root.resolve("vendored/a"), "Borrowed.java");
        Files.writeString(root.resolve(".readingignore"), "vendored/**\n");

        assertThat(unread.under(root, scopes.under(root)))
                .as("a file the repository excluded was refused on its own statement, which the layout "
                        + "hiding a file is not")
                .isZero();
    }
}
