package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CweTermsExtractionTest {

    @Test
    void refusesACatalogOfAnyOtherRevision() {
        assertThatThrownBy(() -> new CweTermsExtraction().source()
                .pinned("<Weakness_Catalog/>".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("read as blob")
                .hasMessageContaining("477ff29b8a6fcb0c5e8fe7234f0af736d41c203c");
    }
}
