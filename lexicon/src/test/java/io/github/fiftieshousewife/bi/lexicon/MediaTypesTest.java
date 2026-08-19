package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class MediaTypesTest {

    private final MediaTypes types = MediaTypes.fromClasspath();

    @Test
    void registersARegisteredIdentifierByteForByteAndNothingElse() {
        assertAll(
                () -> assertThat(types.registers("application/pdf")).isTrue(),
                () -> assertThat(types.registers("application/vnd.ms-excel")).isTrue(),
                () -> assertThat(types.registers("text/x-java-source")).isFalse(),
                () -> assertThat(types.registers("application/PDF")).isFalse(),
                () -> assertThat(types.registers("pdf")).isFalse());
    }

    @Test
    void carriesEveryRegistryTheSourceStatesACsvFor() {
        assertThat(types.concepts())
                .extracting(SkosConcept::broader)
                .contains("application", "audio", "font", "haptics", "image", "message", "model",
                        "multipart", "text", "video");
    }
}
