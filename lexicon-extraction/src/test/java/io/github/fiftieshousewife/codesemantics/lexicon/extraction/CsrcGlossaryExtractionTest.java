package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CsrcGlossaryExtractionTest {

    private final CsrcGlossaryExtraction extraction = new CsrcGlossaryExtraction();

    @Test
    void refusesAnExportThatIsNotTheOneTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction
                .pinned("{\"parentTerms\": []}".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("631fa8bc22025a45cb289002083905746a7c43c09ead23e4689ff9970e149591");
    }
}
