package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.reading.PullRequestSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The path a consumer of the published jars walks: a fetched directory in, the entries the export
 * publishes out. Nothing here touches a test source set, which is the point of the test — every class it
 * names ships.
 */
class ReadPullRequestsTest {

    @TempDir
    Path fetched;

    @Test
    void readsAFetchedSetIntoTheEntriesTheExportPublishes() throws IOException {
        wroteAPullRequest();

        final List<ExportedPullRequest> read = new ReadPullRequests(List.of())
                .in(PullRequestSet.under(fetched));

        assertAll(
                () -> assertThat(read).hasSize(1),
                () -> assertThat(read.getFirst().number()).isEqualTo(7),
                () -> assertThat(read.getFirst().author()).isEqualTo("tballison"),
                () -> assertThat(read.getFirst().work())
                        .as("the base tree is beside the head, so the declaration diff is read")
                        .isNotNull());
    }

    @Test
    void writesTheDocumentTheSchemaStates() throws IOException {
        wroteAPullRequest();
        final PullRequestSet set = PullRequestSet.under(fetched);

        PullRequestDocument.wrote(fetched, Optional.of(set.repository()),
                Optional.of(WrittenWork.ofTheWholeTree(fetched)),
                new ReadPullRequests(List.of()).in(set));

        assertAll(
                () -> assertThat(fetched.resolve(PullRequestFile.NAME)).isRegularFile(),
                () -> assertThat(new PullRequestFile().in(fetched.resolve(PullRequestFile.NAME))
                        .schemaVersion()).isEqualTo(PullRequestExport.SCHEMA_VERSION));
    }

    @Test
    void readsTheDeclarationsTheChangeAddsOverTheOnesItFound() throws IOException {
        wroteAPullRequest();

        final ChangedCode written = new ReadPullRequests(List.of())
                .in(PullRequestSet.under(fetched)).getFirst().work().written();

        assertAll(
                () -> assertThat(written.added().types()).isEqualTo(1),
                () -> assertThat(written.typesAdded())
                        .extracting(ChangedCode.NamedDeclaration::name)
                        .containsExactly("Loader"));
    }

    private void wroteAPullRequest() throws IOException {
        production(fetched.resolve("pr-7"), "Engine.java", """
                public class Engine {
                    int started() {
                        return 1;
                    }
                }
                """);
        production(fetched.resolve("pr-7"), "Loader.java", """
                public class Loader {
                    int opened() {
                        return 2;
                    }
                }
                """);
        production(fetched.resolve("pr-7-base"), "Engine.java", """
                public class Engine {
                    int started() {
                        return 1;
                    }
                }
                """);
        Files.writeString(fetched.resolve("pr-7-statement.md"),
                "Read a loader beside the engine\n\nThe engine could not open a file it was handed.\n");
        Files.writeString(fetched.resolve(PullRequestSet.MANIFEST), """
                # repository: apache/tika
                7\ttballison\t7c80965e8f14c0465c7fdf3858009ed6cb691c30\t68e57621168adf9e8e3004e3ff4ea6fd5e4c3cd7\tpr-7\t2026-09-16\t2
                """);
    }

    private static void production(final Path tree, final String name, final String source)
            throws IOException {
        final Path directory = tree.resolve("engine").resolve("src").resolve("main").resolve("java");
        Files.createDirectories(directory);
        Files.writeString(directory.resolve(name), source);
    }
}
