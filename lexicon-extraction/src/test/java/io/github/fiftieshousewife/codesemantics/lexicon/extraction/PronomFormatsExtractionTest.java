package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PronomFormatsExtractionTest {

    private final PronomFormatsExtraction extraction = new PronomFormatsExtraction();

    @Test
    void refusesASignatureFileThatIsNotTheReleaseTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction.pinned("<FFSignatureFile/>".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("d06f26aeb0f153013449bd2a2f912c8d480247c056fd9bfd3facdc39bff7a586");
    }
}
