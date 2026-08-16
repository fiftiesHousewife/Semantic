package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * The stylesheet a rendered report carries, read from its own file rather than written into a Java string —
 * the same rule the theme and term pages keep.
 */
final class Stylesheet {

    static final String REPORT = read("/report.css");

    private Stylesheet() {
    }

    private static String read(final String resource) {
        try (InputStream stream = Objects.requireNonNull(
                Stylesheet.class.getResourceAsStream(resource), resource)) {
            return new String(stream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + resource, e);
        }
    }
}
