package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NistCsfExtractionTest {

    private final NistCsfExtraction extraction = new NistCsfExtraction();

    @Test
    void refusesACatalogueThatIsNotTheRevisionTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction.source()
                .pinned("{\"catalog\": {}}".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("78650f02ad9321bb7b817846f8fbd4f2bcd620de");
    }
}
