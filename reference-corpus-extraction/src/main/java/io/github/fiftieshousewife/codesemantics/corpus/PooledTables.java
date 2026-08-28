package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

/**
 * Where a pooling run writes its tables, and the writing itself.
 *
 * <p>The directory is named by the caller rather than defaulted: a run that wrote a corpus table somewhere
 * nobody asked for would be found later and taken for a bundled one.
 */
final class PooledTables {

    private static final String OUT_PROPERTY = "cs.corpus.out";

    private PooledTables() {
    }

    /** The directory the run names, made if it is not there. */
    static Path directory() {
        final String stated = System.getProperty(OUT_PROPERTY, "");
        if (stated.isBlank()) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "No %s. A pooling run writes one table per weighting; name the directory they go in.",
                    OUT_PROPERTY));
        }
        final Path out = Path.of(stated).toAbsolutePath().normalize();
        makeDirectory(out);
        return out;
    }

    static void write(final Path table, final String rendered) {
        try {
            Files.writeString(table, rendered, StandardCharsets.UTF_8);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to write the pooled corpus to %s",
                    table), e);
        }
    }

    private static void makeDirectory(final Path out) {
        try {
            Files.createDirectories(out);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to make the directory %s",
                    out), e);
        }
    }
}
