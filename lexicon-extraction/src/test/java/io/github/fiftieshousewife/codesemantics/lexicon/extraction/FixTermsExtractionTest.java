package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FixTermsExtractionTest {

    @Test
    void refusesAnOrchestraFileOfAnyOtherRevision() {
        assertThatThrownBy(() -> new FixTermsExtraction().source()
                .pinned("<fixr:repository/>".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("read as blob")
                .hasMessageContaining("099914dd0edd49a699326f0441776d6e21cfaf93");
    }
}
