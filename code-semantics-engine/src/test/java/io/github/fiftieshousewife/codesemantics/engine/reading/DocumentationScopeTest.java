package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DocumentationScopeTest {

    @TempDir
    private Path root;

    private final DocumentationScope scope = new DocumentationScope();

    private void write(final String path, final String text) throws IOException {
        final Path file = root.resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, text);
    }

    private List<String> read() {
        return scope.under(root).stream()
                .flatMap(found -> found.files().stream())
                .map(file -> root.relativize(file).toString())
                .toList();
    }

    @Test
    void readsTheMarkdownAtTheRootAndUnderTheDocumentationDirectory() throws IOException {
        write("README.md", "what this is for");
        write("docs/design/PLAN.md", "how it works");
        write("src/main/java/Reading.java", "class Reading {}");
        assertThat(read())
                .containsExactlyInAnyOrder("README.md", Path.of("docs", "design", "PLAN.md").toString());
    }

    @Test
    void readsAsciiDocBesideTheMarkdown() throws IOException {
        write("README.adoc", "what this is for");
        write("docs/detection.adoc", "how detection works");
        write("docs/index.md", "the index");
        assertThat(read())
                .containsExactlyInAnyOrder("README.adoc",
                        Path.of("docs", "detection.adoc").toString(),
                        Path.of("docs", "index.md").toString());
    }

    @Test
    void refusesTheWorkingNotesTheRepositoryItselfStatesAreWorkingNotes() throws IOException {
        write(".readingignore", "BACKLOG.md\nCLAUDE.md\n");
        write("README.md", "what this is for");
        write("BACKLOG.md", "evidence, votes, witnesses, abstention");
        write("CLAUDE.md", "evidence, votes, witnesses, abstention");
        assertThat(read())
                .as("a reading that counts its own to-do list awards itself the mass of its own vocabulary")
                .containsExactly("README.md");
    }

    @Test
    void refusesAPlanDocumentFiledUnderTheDocumentationDirectory() throws IOException {
        write(".readingignore", "docs/plans/**\n");
        write("docs/CODE_SEMANTICS_LIBRARY_PLAN.md", "what it is for");
        write("docs/plans/FPML.md", "interest rate swap, foreign exchange");
        assertThat(read())
                .as("a specification of a reading not yet built would put its domain into the corpus "
                        + "and then find it")
                .containsExactly(Path.of("docs", "CODE_SEMANTICS_LIBRARY_PLAN.md").toString());
    }

    @Test
    void readsEverythingWhereARepositoryStatesNothingAboutItself() throws IOException {
        write("README.md", "what this is for");
        write("CONTRIBUTING.md", "how to work here");
        assertThat(read())
                .as("silence is not permission to guess which of somebody else's files are notes")
                .containsExactlyInAnyOrder("README.md", "CONTRIBUTING.md");
    }

    @Test
    void abstainsWhereARepositoryDocumentsNothingButItsOwnWorking() throws IOException {
        write(".readingignore", "BACKLOG.md\n");
        write("BACKLOG.md", "only notes here");
        assertAll(
                () -> assertThat(scope.under(root)).isEmpty(),
                () -> assertThat(read()).isEmpty());
    }
}
