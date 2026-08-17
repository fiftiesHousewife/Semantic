package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArxivTaxonomyExtractionTest {

    private final ArxivTaxonomyExtraction extraction = new ArxivTaxonomyExtraction();

    @Test
    void refusesAModuleThatIsNotTheRevisionTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction.source().pinned("CATEGORIES = {}\n".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("a5985f621b07a4031c9e9b4f870a2206a9aa15a7");
    }
}
