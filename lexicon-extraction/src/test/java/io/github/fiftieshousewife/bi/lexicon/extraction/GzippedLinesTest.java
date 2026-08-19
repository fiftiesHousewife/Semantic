package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class GzippedLinesTest {

    private final GzippedLines lines = new GzippedLines();

    @Test
    void readsBackEveryLineTheCompressedBytesHold() throws IOException {
        assertThat(lines.in(compressed("first\nsecond\nthird\n"))).containsExactly("first", "second", "third");
    }

    @Test
    void dropsTheBlankLineATrailingBreakWouldOtherwiseLeaveBehind() throws IOException {
        assertThat(lines.in(compressed("only\n\n"))).containsExactly("only");
    }

    @Test
    void refusesBytesThatAreNotCompressedRatherThanReadingThemAsText() {
        assertThatThrownBy(() -> lines.in("plain".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IOException.class);
    }

    private static byte[] compressed(final String content) throws IOException {
        final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (OutputStream stream = new java.util.zip.GZIPOutputStream(bytes)) {
            stream.write(content.getBytes(StandardCharsets.UTF_8));
        }
        return bytes.toByteArray();
    }
}
