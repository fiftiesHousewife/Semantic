package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CsoTopicsExtractionTest {

    private final CsoTopicsExtraction extraction = new CsoTopicsExtraction();

    @Test
    void refusesACsvThatIsNotTheArchiveTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction.pinned("\"<a>\",\"<b>\",\"<c>\"".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1fa427ecb26a92d6077a54b5da41833e3eea6a194567091e336e8425f4cc11d4");
    }
}
