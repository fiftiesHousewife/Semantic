package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PinnedIssuesTest {

    @TempDir
    Path pinned;

    @Test
    void readsEachRowAsTheTrackerStatedItAndLeavesTheSummaryInTheFile() throws IOException {
        final Path file = pinned.resolve("pr-3154-issues.tsv");
        Files.writeString(file, """
                # Issues the statement of pull request 3154 references, as the tracker states them.
                # Columns: key, type, url, retrieved, summary
                TIKA-4889\tTask\thttps://issues.apache.org/jira/browse/TIKA-4889\t2026-09-13\tSimplify inference configuration
                """);

        assertThat(PinnedIssues.in(file)).containsExactly(
                new ExportedWork.Issue("TIKA-4889", "Task",
                        "https://issues.apache.org/jira/browse/TIKA-4889"));
    }

    @Test
    void refusesARowOfAnyOtherShape() throws IOException {
        final Path file = pinned.resolve("pr-9-issues.tsv");
        Files.writeString(file, "TIKA-1\tBug\n");

        assertThatThrownBy(() -> PinnedIssues.in(file))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("2 columns")
                .hasMessageContaining("5");
    }
}
