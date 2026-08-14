package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedExclusionsTest {

    @TempDir
    private Path root;

    private StatedExclusions statedAs(final String text) throws IOException {
        Files.writeString(root.resolve(".readingignore"), text);
        return StatedExclusions.statedUnder(root);
    }

    @Test
    void excludesAFileTheRepositoryNamesAtItsRoot() throws IOException {
        final StatedExclusions stated = statedAs("BACKLOG.md\nCLAUDE.md\n");

        assertAll(
                () -> assertThat(stated.excludes(Path.of("BACKLOG.md"))).isTrue(),
                () -> assertThat(stated.excludes(Path.of("README.md"))).isFalse(),
                () -> assertThat(stated.stated()).isEqualTo(2));
    }

    @Test
    void excludesEverythingUnderADirectoryTheRepositoryNames() throws IOException {
        final StatedExclusions stated = statedAs("docs/plans/**\n");

        assertAll(
                () -> assertThat(stated.excludes(Path.of("docs", "plans", "FPML.md"))).isTrue(),
                () -> assertThat(stated.excludes(Path.of("docs", "plans", "term", "OLIA.md"))).isTrue(),
                () -> assertThat(stated.excludes(Path.of("docs", "PLAN.md"))).isFalse());
    }

    @Test
    void readsPastCommentsAndBlankLinesSoAStatementCanExplainItself() throws IOException {
        final StatedExclusions stated = statedAs("# notes about the work, not the work\n\n  BACKLOG.md  \n");

        assertAll(
                () -> assertThat(stated.stated()).isEqualTo(1),
                () -> assertThat(stated.excludes(Path.of("BACKLOG.md"))).isTrue());
    }

    @Test
    void excludesNothingWhereARepositoryStatesNothing() {
        assertAll(
                () -> assertThat(StatedExclusions.statedUnder(root).stated()).isZero(),
                () -> assertThat(StatedExclusions.statedUnder(root).excludes(Path.of("CLAUDE.md")))
                        .as("silence is not permission to guess")
                        .isFalse());
    }
}
