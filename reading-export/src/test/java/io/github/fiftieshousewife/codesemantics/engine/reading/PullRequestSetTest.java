package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class PullRequestSetTest {

    private static final String HEAD = "9351a7063d41ec9a47a50b444a9f0242fd765860";
    private static final String BASE = "fa7ea0996857fd785d782d0cb887c04b996dddb9";

    @TempDir
    Path fetched;

    @Test
    void readsEveryRowTheManifestStates() throws IOException {
        manifest("# Columns: number, author, head-sha, base-sha, directory, retrieved, files",
                row(3154, "pr-3154"),
                row(3153, "pr-3153"));

        final PullRequestSet set = PullRequestSet.under(fetched);

        assertAll(
                () -> assertThat(set.pullRequests()).hasSize(2),
                () -> assertThat(set.pullRequests().getFirst().facts().number()).isEqualTo(3154),
                () -> assertThat(set.pullRequests().getFirst().facts().headSha()).isEqualTo(HEAD),
                () -> assertThat(set.treeOf(set.pullRequests().getFirst()))
                        .isEqualTo(fetched.resolve("pr-3154")));
    }

    @Test
    void refusesARowStatingTooFewColumns() throws IOException {
        manifest("3154\ttballison\t" + HEAD);

        assertThatThrownBy(() -> PullRequestSet.under(fetched))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("7");
    }

    @Test
    void refusesARowWhoseHeadIsNotACommitSha() throws IOException {
        manifest("3154\ttballison\tHEAD\t" + BASE + "\tpr-3154\t2026-09-12\t11");

        assertThatThrownBy(() -> PullRequestSet.under(fetched).pullRequests().getFirst().facts())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("headSha");
    }

    @Test
    void refusesADirectoryHoldingNoManifest() {
        assertThatThrownBy(() -> PullRequestSet.under(fetched))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining(PullRequestSet.MANIFEST);
    }

    private String row(final int number, final String directory) {
        return number + "\ttballison\t" + HEAD + "\t" + BASE + "\t" + directory + "\t2026-09-12\t11";
    }

    private void manifest(final String... lines) throws IOException {
        Files.write(fetched.resolve(PullRequestSet.MANIFEST), List.of(lines));
    }
}
