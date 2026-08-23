package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.clones.RepositoryManifest;

/**
 * A drawn manifest together with the header its own file states — the frame, the predicate and the seed, in
 * the words written down before the draw ran.
 *
 * <p>A table pooled from a manifest carries that header rather than restating it, because a restatement goes
 * stale against the file it describes and a copy cannot.
 */
public record DrawnManifest(String name, List<String> stated, RepositoryManifest manifest) {

    private static final String COMMENT = "#";

    public DrawnManifest {
        stated = List.copyOf(stated);
    }

    /** The manifest the named file states, with its leading comment block kept. */
    public static DrawnManifest at(final Path file) {
        final List<String> lines = linesOf(file);
        return new DrawnManifest(file.getFileName().toString(),
                lines.stream().takeWhile(DrawnManifest::isHeader).toList(),
                RepositoryManifest.of(lines.stream()));
    }

    private static boolean isHeader(final String line) {
        return line.isBlank() || line.startsWith(COMMENT);
    }

    private static List<String> linesOf(final Path file) {
        try {
            return Files.readAllLines(file, StandardCharsets.UTF_8);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to read the repository manifest %s",
                    file), e);
        }
    }
}
