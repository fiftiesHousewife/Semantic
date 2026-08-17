package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OliaTermsExtractionTest {

    private final OliaTermsExtraction extraction = new OliaTermsExtraction();

    @Test
    void refusesAnOntologyThatIsNotTheRevisionTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction.source().pinned("<rdf:RDF/>".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("d3bd4f1aef9047b33186bfb2a1795401f3f1a4a6");
    }
}
