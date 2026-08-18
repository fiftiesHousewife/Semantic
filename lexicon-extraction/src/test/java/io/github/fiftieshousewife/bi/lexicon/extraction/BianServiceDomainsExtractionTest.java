package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BianServiceDomainsExtractionTest {

    private final BianServiceDomainsExtraction extraction = new BianServiceDomainsExtraction();

    @Test
    void refusesASpecificationSetThatIsNotTheRevisionTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction.asRecorded(List.of(new ContentDigest.Member(
                "Drifted/DriftedSpecification.csv", "\"Role Definition\"\tMoved.\n"
                        .getBytes(StandardCharsets.UTF_8)))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("a928c56e7989492f7214b2bd0ae7b204644efc03");
    }
}
