package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Which runs may write the pull request document, and which must leave it where it stands. A sweep that
 * reads a tree makes no claim about the changes proposed against it, and deleting another run's answer
 * would be a claim.
 */
class PullRequestDocumentTest {

    private final PullRequestFile file = new PullRequestFile();

    @TempDir
    Path folder;

    @Test
    void leavesADocumentAloneWhereARunWasGivenNoPullRequests() throws IOException {
        final Path document = wroteOne();

        PullRequestDocument.wrote(folder, Optional.empty(), Optional.empty(), List.of());

        assertAll(
                () -> assertThat(document)
                        .as("a run reading only the tree says nothing about the pull requests, and "
                                + "removing another run's answer would say something")
                        .exists(),
                () -> assertThat(file.in(document).pullRequests()).hasSize(1));
    }

    @Test
    void removesADocumentWhereARunWasGivenASetHoldingNone() throws IOException {
        final Path document = wroteOne();

        PullRequestDocument.wrote(folder, Optional.of("apache/tika"), reference(), List.of());

        assertThat(document)
                .as("a run told where to look and finding none has answered, and the answer is none")
                .doesNotExist();
    }

    @Test
    void writesTheDocumentWhereARunReadsPullRequests() throws IOException {
        PullRequestDocument.wrote(folder, Optional.of("apache/tika"), reference(), List.of(one()));

        assertAll(
                () -> assertThat(folder.resolve(PullRequestFile.NAME)).exists(),
                () -> assertThat(file.in(folder.resolve(PullRequestFile.NAME)).repository())
                        .isEqualTo("apache/tika"));
    }

    private Path wroteOne() throws IOException {
        final Path document = folder.resolve(PullRequestFile.NAME);
        file.wrote(document, PullRequestExport.of("apache/tika", WrittenFixture.side(400, 3000),
                List.of(one())));
        return document;
    }

    private static Optional<MeasuredCode> reference() {
        return Optional.of(WrittenFixture.side(400, 3000));
    }

    private static ExportedPullRequest one() {
        return new ExportedPullRequest("apache/tika", 3154, "tballison",
                "9351a7063d41ec9a47a50b444a9f0242fd765860",
                "fa7ea0996857fd785d782d0cb887c04b996dddb9", 11,
                java.util.Map.of("ordinary English", 0.0004), List.of());
    }
}
