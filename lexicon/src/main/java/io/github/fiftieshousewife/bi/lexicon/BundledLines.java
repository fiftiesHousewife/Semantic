package io.github.fiftieshousewife.bi.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * The data lines of one bundled resource, read as UTF-8 with blank lines and {@code #} comments dropped.
 * The provenance header every bundled resource carries is comment lines, so what a reader receives is rows
 * and nothing else. A resource the jar does not carry fails by name.
 */
final class BundledLines {

    private static final String COMMENT = "#";

    private BundledLines() {
    }

    /** Every data line of the named classpath resource, in file order. */
    static List<String> of(final String resource) {
        final InputStream stream = Objects.requireNonNull(
                BundledLines.class.getResourceAsStream("/" + resource), resource);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            return dataLines(reader.lines());
        } catch (final IOException e) {
            throw new IllegalStateException("Failed to read the bundled resource " + resource, e);
        }
    }

    /** The same rows, from a file the caller names rather than from the published jar. */
    static List<String> at(final Path file) {
        try (Stream<String> lines = Files.lines(file, StandardCharsets.UTF_8)) {
            return dataLines(lines);
        } catch (final IOException | UncheckedIOException e) {
            throw new IllegalStateException("Failed to read " + file, e);
        }
    }

    private static List<String> dataLines(final Stream<String> lines) {
        return lines.filter(line -> !line.isBlank() && !line.startsWith(COMMENT)).toList();
    }
}
