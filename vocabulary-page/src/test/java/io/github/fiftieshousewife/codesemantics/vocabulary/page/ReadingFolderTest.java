package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import io.github.fiftieshousewife.codesemantics.engine.export.PullRequestExport;
import io.github.fiftieshousewife.codesemantics.engine.export.PullRequestFile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;

class ReadingFolderTest {

    @Test
    void readsThePullRequestsPublishedAtTheVersionThisBuildWrites(@TempDir final Path folder)
            throws IOException {
        wrote(folder, PullRequestExport.SCHEMA_VERSION);

        assertThat(ReadingFolder.at(folder).pullRequests())
                .map(PullRequestExport::repository)
                .contains("apache/tika");
    }

    @Test
    void readsNoPullRequestsPublishedAtAnotherVersion(@TempDir final Path folder) throws IOException {
        wrote(folder, "1.0");

        assertThat(ReadingFolder.at(folder).pullRequests()).isEmpty();
    }

    private static void wrote(final Path folder, final String version) throws IOException {
        Files.createDirectories(folder);
        Files.writeString(folder.resolve(PullRequestFile.NAME), """
                {
                  "schemaVersion": "%s",
                  "repository": "apache/tika",
                  "repositoryCode": {
                    "commentLines": 0,
                    "metrics": {
                      "types": 0, "methods": 0, "statements": 0, "largestType": 0,
                      "methodStatements": {"median": 0, "upperQuartile": 0, "highest": 0},
                      "complexity": {"median": 0, "upperQuartile": 0, "highest": 0},
                      "nesting": {"median": 0, "upperQuartile": 0, "highest": 0},
                      "parameters": {"median": 0, "upperQuartile": 0, "highest": 0}
                    }
                  },
                  "pullRequests": []
                }
                """.formatted(version));
    }
}
