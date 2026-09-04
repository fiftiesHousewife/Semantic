package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FpmlTermsExtractionTest {

    @Test
    void refusesASchemaSetOfAnyOtherRevision() {
        final List<ContentDigest.Member> schemas = List.of(new ContentDigest.Member(
                "fpml-ird-5-11.xsd", "<schema/>".getBytes(StandardCharsets.UTF_8)));

        assertThatThrownBy(() -> new FpmlTermsExtraction().asRecorded(schemas))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("digest to")
                .hasMessageContaining("cf7a6cba14470313505559e662252cff8d3afda5");
    }
}
