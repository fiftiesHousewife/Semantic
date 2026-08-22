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

class RepositoryManifestTest {

    private static final String ROW = "aeron\thttps://example.invalid/aeron.git\t673430a\tApache-2.0";

    private Path manifestOf(final Path directory, final String... lines) throws IOException {
        final Path manifest = directory.resolve("manifest.tsv");
        Files.write(manifest, List.of(lines));
        return manifest;
    }

    @Test
    void readsEveryRowThatIsNeitherACommentNorBlank(@TempDir final Path directory) throws IOException {
        final Path manifest = manifestOf(directory, "# what this is", "", ROW, "  ");

        assertThat(RepositoryManifest.at(manifest).repositories())
                .containsExactly(new PinnedRepository(
                        "aeron", "https://example.invalid/aeron.git", "673430a", "Apache-2.0"));
    }

    @Test
    void keepsTheFourColumnsCloningNeedsWhereAManifestStatesMore(@TempDir final Path directory)
            throws IOException {
        final Path manifest = manifestOf(directory, ROW + "\t4128331\tits own description\t2015-01-01");

        final PinnedRepository repository = RepositoryManifest.at(manifest).repositories().getFirst();

        assertAll(
                () -> assertThat(repository.name()).isEqualTo("aeron"),
                () -> assertThat(repository.sha()).isEqualTo("673430a"),
                () -> assertThat(repository.licence()).isEqualTo("Apache-2.0"));
    }

    @Test
    void refusesARowStatingFewerColumnsThanCloningNeeds(@TempDir final Path directory) throws IOException {
        final Path manifest = manifestOf(directory, "aeron\thttps://example.invalid/aeron.git");

        assertThatThrownBy(() -> RepositoryManifest.at(manifest))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("name, origin, sha, licence");
    }

    @Test
    void placesACloneUnderTheDirectoryTheRunNames(@TempDir final Path directory) {
        final PinnedRepository repository =
                new PinnedRepository("aeron", "https://example.invalid/aeron.git", "673430a", "Apache-2.0");

        assertThat(repository.under(directory)).isEqualTo(directory.resolve("aeron"));
    }

    @Test
    void readsTheCorpusThisRepositoryBundlesWhereNoManifestIsNamed() {
        assertThat(RepositoryManifest.bundledCorpus().repositories())
                .as("the drawn reference corpus is recorded in the tree, so an ordinary run names no path")
                .isNotEmpty();
    }
}
