package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class CopiedTreeTest {

    @TempDir
    Path tree;

    @TempDir
    Path target;

    @Test
    void copiesEachStatedFileToItsRelativePath() throws IOException {
        final Path source = written("m/src/main/java/p/A.java", "class A {}");
        written("README.md", "# a readme");

        CopiedTree.of(tree, List.of(source)).into(target);

        assertAll(
                () -> assertThat(target.resolve("m/src/main/java/p/A.java")).hasContent("class A {}"),
                () -> assertThat(target.resolve("README.md")).doesNotExist());
    }

    @Test
    void carriesTheStatedExclusionsWithEveryCopy() throws IOException {
        final Path source = written("README.md", "# a readme");
        written(StatedExclusions.FILE, "BACKLOG.md");

        CopiedTree.of(tree, List.of(source)).into(target);

        assertThat(target.resolve(StatedExclusions.FILE))
                .as("a copy without the tree's stated exclusions would read files the original refuses")
                .hasContent("BACKLOG.md");
    }

    @Test
    void refusesAFileOutsideTheTree() throws IOException {
        final Path outside = Files.writeString(target.resolve("Elsewhere.java"), "class Elsewhere {}");

        assertThatThrownBy(() -> CopiedTree.of(tree, List.of(outside)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Elsewhere.java");
    }

    @Test
    void readsBackWithTheScopesOfTheTreeItCopied() throws IOException {
        written("m/src/main/java/p/A.java", "class A {}");
        written("m/src/test/java/p/ATest.java", "class ATest {}");
        written("README.md", "# a readme");
        written("docs/NOTES.md", "some notes");
        written("IGNORED.md", "excluded prose");
        written(StatedExclusions.FILE, "IGNORED.md");

        CopiedTree.ofEveryScope(tree).into(target);

        assertAll(
                () -> assertThat(relativeFilesByScope(target)).isEqualTo(relativeFilesByScope(tree)),
                () -> assertThat(target.resolve("IGNORED.md"))
                        .as("a file the tree excludes is not in any scope, so no copy of it is stated")
                        .doesNotExist());
    }

    private Map<String, List<String>> relativeFilesByScope(final Path root) {
        return RepositoryReading.scopesUnder(root).stream()
                .collect(Collectors.toMap(SourceScope::name, scope -> scope.files().stream()
                        .map(file -> root.relativize(file).toString())
                        .toList()));
    }

    private Path written(final String relative, final String content) throws IOException {
        final Path file = tree.resolve(relative);
        Files.createDirectories(file.getParent());
        return Files.writeString(file, content);
    }
}
