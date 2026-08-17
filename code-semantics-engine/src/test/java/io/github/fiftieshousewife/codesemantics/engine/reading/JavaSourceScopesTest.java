package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class JavaSourceScopesTest {

    private final JavaSourceScopes scopes = new JavaSourceScopes();

    private static void write(final Path root, final String path) throws IOException {
        final Path file = root.resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, "class Example { }\n");
    }

    @Test
    void namesOneScopePerSourceSetsJavaDirectory(@TempDir final Path root) throws IOException {
        write(root, "engine/src/main/java/example/Reading.java");
        write(root, "engine/src/test/java/example/ReadingTest.java");
        write(root, "api/src/main/java/example/Contract.java");

        assertThat(scopes.under(root)).extracting(SourceScope::name)
                .containsExactly(Path.of("api/src/main/java").toString(),
                        Path.of("engine/src/main/java").toString(),
                        Path.of("engine/src/test/java").toString());
    }

    @Test
    void readsEveryJavaFileBelowAScopeHoweverDeepItsPackages(@TempDir final Path root) throws IOException {
        write(root, "engine/src/main/java/example/deep/Nested.java");
        write(root, "engine/src/main/java/Top.java");

        assertThat(scopes.under(root)).singleElement()
                .extracting(SourceScope::files).asInstanceOf(org.assertj.core.api.InstanceOfAssertFactories.LIST)
                .hasSize(2);
    }

    @Test
    void leavesBuildOutputOutWithoutAListOfDirectoriesToIgnore(@TempDir final Path root) throws IOException {
        write(root, "engine/src/main/java/example/Reading.java");
        write(root, "engine/build/classes/java/main/example/Reading.java");
        write(root, "engine/build/generated/sources/annotationProcessor/java/main/example/Generated.java");

        assertAll(
                () -> assertThat(scopes.under(root)).hasSize(1),
                () -> assertThat(scopes.under(root).getFirst().name())
                        .isEqualTo(Path.of("engine/src/main/java").toString()));
    }

    @Test
    void namesNoScopeForASourceDirectoryHoldingNoJavaAtAll(@TempDir final Path root) throws IOException {
        write(root, "engine/src/main/resources/words.txt");
        Files.createDirectories(root.resolve("engine/src/main/java"));

        assertThat(scopes.under(root)).isEmpty();
    }
}
