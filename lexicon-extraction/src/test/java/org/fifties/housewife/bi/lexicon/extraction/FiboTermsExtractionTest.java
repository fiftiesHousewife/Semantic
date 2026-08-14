package org.fifties.housewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FiboTermsExtractionTest {

    private final FiboTermsExtraction extraction = new FiboTermsExtraction();

    @Test
    void refusesAManifestThatIsNotTheRevisionTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction.pinned("<rdf:RDF/>".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("119fa8c091aa4beece7d22aefa6fe138021a4355");
    }

    @Test
    void refusesOntologiesThatAreNotTheOnesThatRevisionHeld() {
        assertThatThrownBy(() -> extraction.asRecorded(List.of(new ContentDigest.Member("DER/Swaps.rdf",
                "not what the revision holds".getBytes(StandardCharsets.UTF_8)))))
                .as("the manifest names the members; this is what says the members have not moved")
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("digest to");
    }
}
