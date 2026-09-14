package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.junit.jupiter.api.Assertions.assertAll;

class PullRequestSchemaTest {

    private static final ExportedPullRequest READ = new ExportedPullRequest("apache/tika", 3154,
            "tballison", "9351a7063d41ec9a47a50b444a9f0242fd765860",
            "fa7ea0996857fd785d782d0cb887c04b996dddb9", 11,
            Map.of("ordinary English", 0.0004),
            List.of(new ExportedSignal(ReadingSource.PULL_REQUEST, "inference", 12, 9, 0.03, 0.025,
                    "ordinary English", new SightingSite("Engine.java", 3))),
            new ExportedStatement(4, 31, 0.42, 0.19, 0.001, 999,
                    List.of(new ExportedStatement.StatedTopic("computing", 0.11, 0.6, 0.2))),
            new ExportedWork(new ExportedWork.Stated(4, 1,
                    List.of(new ExportedWork.StatedClass("fix", "specification", 1))),
                    List.of(new ExportedWork.Issue("TIKA-4889", "Task",
                            "https://issues.apache.org/jira/browse/TIKA-4889")),
                    WrittenFixture.adding(1, 4, 2, List.of()),
                    new ExportedWork.Inferred("feat",
                            "a commit of the type feat introduces a new feature to the codebase",
                            "adds declarations and removes none")),
            List.of(new ExportedPullRequest.MatchedConcept("CSO", "inference engine", "inference engines",
                    "a component that applies rules to a knowledge base", 9)));

    private static final PullRequestExport EXPORT = PullRequestExport.of("apache/tika", WrittenFixture.side(400, 3000), List.of(READ));

    private final PullRequestFile file = new PullRequestFile();

    private final ExportSchema schema = ExportSchema.fromClasspath(PullRequestFile.SCHEMA);

    @Test
    void admitsADocumentCarryingEveryFieldTheSchemaStates() throws IOException {
        assertThat(schema.refusals(new ObjectMapper().readTree(file.of(EXPORT)))).isEmpty();
    }

    @Test
    void admitsAPullRequestCarryingNoStatement() throws IOException {
        final String document = file.of(PullRequestExport.of("apache/tika", WrittenFixture.side(400, 3000),
                List.of(new ExportedPullRequest("apache/tika", 3153, "tballison",
                        "7c80965e8f14c0465c7fdf3858009ed6cb691c30",
                        "68e57621168adf9e8e3004e3ff4ea6fd5e4c3cd7", 35, Map.of(), List.of()))));

        assertAll(
                () -> assertThat(schema.refusals(new ObjectMapper().readTree(document))).isEmpty(),
                () -> assertThat(document)
                        .as("an unfetched statement is absent, never null")
                        .doesNotContain("\"statement\""));
    }

    @Test
    void refusesAStatementDivergenceOutsideItsOwnBound() throws IOException {
        assertThat(schema.refusals(new ObjectMapper()
                .readTree(file.of(EXPORT).replace("0.42,", "1.42,")))).isNotEmpty();
    }

    @Test
    void refusesAPullRequestWhoseHeadIsNotACommitSha() throws IOException {
        final String unpinned = file.of(EXPORT)
                .replace("9351a7063d41ec9a47a50b444a9f0242fd765860", "HEAD");

        assertThat(schema.refusals(new ObjectMapper().readTree(unpinned)))
                .as("a reading of a moving target is not reproducible, so an unpinned head fails here")
                .isNotEmpty();
    }

    @Test
    void writesNoDocumentTheSchemaRefuses(@TempDir final Path folder) {
        final PullRequestExport unversioned =
                new PullRequestExport("two", "apache/tika", WrittenFixture.side(400, 3000), List.of(READ));

        assertThatIllegalStateException()
                .isThrownBy(() -> file.wrote(folder.resolve(PullRequestFile.NAME), unversioned))
                .withMessageContaining(PullRequestFile.SCHEMA);
    }

    @Test
    void readsBackEveryDocumentItWrites(@TempDir final Path folder) throws IOException {
        final Path written = folder.resolve(PullRequestFile.NAME);
        file.wrote(written, EXPORT);

        assertThat(file.in(written)).isEqualTo(EXPORT);
    }

    @Test
    void removesADocumentWhereARunReadsNoPullRequest(@TempDir final Path folder) throws IOException {
        final Path written = folder.resolve(PullRequestFile.NAME);
        file.wrote(written, EXPORT);

        file.removed(written);

        assertThat(written).doesNotExist();
    }

    @Test
    void statesTheSchemaVersionInTheDocumentItself() throws IOException {
        assertThat(new ObjectMapper().readTree(file.of(EXPORT)).path("schemaVersion").asText())
                .isEqualTo(PullRequestExport.SCHEMA_VERSION);
    }
}
