package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ConventionalCommitTypesExtractionTest {

    private final ConventionalCommitTypesExtraction extraction = new ConventionalCommitTypesExtraction();

    @Test
    void refusesEitherStatementAtAnyOtherRevision() {
        final byte[] other = "# Another page\n".getBytes(StandardCharsets.UTF_8);
        assertAll(
                () -> assertThatThrownBy(() -> extraction.specification().pinned(other))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("read as blob")
                        .hasMessageContaining("7d293dc59e88abc8ce6c6698344d4da518ff3f27"),
                () -> assertThatThrownBy(() -> extraction.convention().pinned(other))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("read as blob")
                        .hasMessageContaining("22b96b96902e1a42ee8c5e807720424abad3082a"));
    }
}
