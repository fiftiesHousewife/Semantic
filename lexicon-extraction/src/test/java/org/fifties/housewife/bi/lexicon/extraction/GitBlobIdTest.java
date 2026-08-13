package org.fifties.housewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GitBlobIdTest {

    private final GitBlobId blobId = new GitBlobId();

    @Test
    void givesTheIdentifierGitGivesTheSameContents() {
        assertThat(blobId.of("hello\n".getBytes(StandardCharsets.UTF_8)))
                .as("git hash-object over a file holding hello answers this, and a citation must agree")
                .isEqualTo("ce013625030ba8dba906f756967f9e9ca394464a");
    }

    @Test
    void givesTheIdentifierGitGivesAnEmptyFile() {
        assertThat(blobId.of(new byte[0])).isEqualTo("e69de29bb2d1d6434b8b29ae775ad8c2e48c5391");
    }
}
