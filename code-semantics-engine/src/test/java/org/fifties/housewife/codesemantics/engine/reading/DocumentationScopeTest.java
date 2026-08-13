package org.fifties.housewife.codesemantics.engine.reading;

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
    void refusesTheWorkingNotesBecauseTheyAreWrittenAboutTheReadingRatherThanTheCode() throws IOException {
        write("README.md", "what this is for");
        write("BACKLOG.md", "evidence, votes, witnesses, abstention");
        write("CLAUDE.md", "evidence, votes, witnesses, abstention");
        assertThat(read())
                .as("a reading that counts its own to-do list awards itself the mass of its own vocabulary")
                .containsExactly("README.md");
    }

    @Test
    void abstainsWhereARepositoryDocumentsNothingButItsOwnWorking() throws IOException {
        write("BACKLOG.md", "only notes here");
        assertAll(
                () -> assertThat(scope.under(root)).isEmpty(),
                () -> assertThat(read()).isEmpty());
    }
}
