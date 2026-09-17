package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

/**
 * The text of a file the reading has already decided to read.
 *
 * <p>A walk names its files before it opens them, so a file that will not open at this point is a fault in
 * the run rather than a reading of nothing: the failure names the file and stops, where an empty string
 * would read as a file holding nothing.
 */
public final class FileText {

    private FileText() {
    }

    public static String of(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT, "Failed to read %s", file), e);
        }
    }
}
