package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PinnedSourceTest {

    private static final byte[] STATED = "the revision's own bytes\n".getBytes(StandardCharsets.UTF_8);

    private static final String REVISION = "0123456789abcdef0123456789abcdef01234567";

    private final PinnedSource source = new PinnedSource(URI.create("https://example.invalid/stated"),
            REVISION, new GitBlobId().of(STATED));

    @Test
    void acceptsBytesGitWouldGiveThePinnedBlobId() {
        assertThat(source.pinned(STATED)).isEqualTo(STATED);
    }

    @Test
    void refusesBytesOfAnyOtherBlobNamingTheRevisionItPins() {
        assertThatThrownBy(() -> source.pinned("something else\n".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(REVISION);
    }

    @Test
    void readsANamedCopyInsteadOfThePermalink(@TempDir final Path folder) throws IOException {
        final Path copy = folder.resolve("copy");
        Files.write(copy, STATED);

        assertThat(source.read(copy.toString())).isEqualTo(STATED);
    }

    @Test
    void refusesANamedCopyThatIsNotThePinnedRevision(@TempDir final Path folder) throws IOException {
        final Path copy = folder.resolve("copy");
        Files.write(copy, "drifted\n".getBytes(StandardCharsets.UTF_8));

        assertThatThrownBy(() -> source.read(copy.toString()))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(REVISION);
    }
}
