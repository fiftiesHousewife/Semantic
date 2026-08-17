package io.github.fiftieshousewife.bi.lexicon;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The vocabulary files bundled into the published jars — the lexical knowledge the library ships with, as
 * opposed to the knowledge it derives from the repository in front of it.
 *
 * <p>The directories are named rather than discovered because they are the ones the vocabulary lives in by
 * design: every other bundled resource in the build is configuration, and a provenance header would say
 * nothing useful about it. Within a directory nothing is filtered, so a file added there is measured by
 * being added.
 */
final class BundledVocabulary {

    private static final List<Path> DIRECTORIES = List.of(
            Path.of("src", "main", "resources"),
            Path.of("..", "code-semantics-api", "src", "main", "resources"));

    private static final String COMMENT = "#";

    private BundledVocabulary() {
    }

    static List<Path> files() {
        final List<Path> files = DIRECTORIES.stream().flatMap(BundledVocabulary::filesIn).sorted().toList();
        if (files.isEmpty()) {
            throw new IllegalStateException(DIRECTORIES
                    + " hold no vocabulary, so every question asked of them would answer itself.");
        }
        return files;
    }

    /** The leading comment block, where a file states where it came from and on what terms. */
    static String header(final Path file) {
        try (Stream<String> lines = Files.lines(file, StandardCharsets.UTF_8)) {
            return lines.map(String::strip)
                    .takeWhile(line -> line.isEmpty() || line.startsWith(COMMENT))
                    .collect(Collectors.joining("\n"));
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static Stream<Path> filesIn(final Path directory) {
        try (Stream<Path> entries = Files.list(directory)) {
            return entries.filter(Files::isRegularFile).toList().stream();
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
