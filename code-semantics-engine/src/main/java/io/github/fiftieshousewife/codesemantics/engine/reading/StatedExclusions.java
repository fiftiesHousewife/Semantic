package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.List;

/**
 * What a repository states is not part of what it is, read from its own {@code .readingignore}: one glob per
 * line, matched against the path relative to the root, so {@code CLAUDE.md} names a file at the root and
 * {@code docs/plans/**} names a directory's whole contents.
 *
 * <p><b>The repository is the one entitled to say.</b> A statement by the corpus about the corpus is a
 * citation in exactly the way a curated list inside the reader is not, and a repository that states nothing
 * excludes nothing: silence is not permission to guess.
 */
public final class StatedExclusions {

    private static final String FILE = ".readingignore";
    private static final String COMMENT = "#";
    private static final String GLOB = "glob:";

    private final List<PathMatcher> stated;

    private StatedExclusions(final List<PathMatcher> stated) {
        this.stated = List.copyOf(stated);
    }

    /** What the tree at this root states about itself, or nothing at all where it states nothing. */
    public static StatedExclusions statedUnder(final Path root) {
        final Path file = root.resolve(FILE);
        return Files.isRegularFile(file) ? new StatedExclusions(matchersIn(file))
                : new StatedExclusions(List.of());
    }

    private static List<PathMatcher> matchersIn(final Path file) {
        try {
            return Files.readAllLines(file).stream()
                    .map(String::strip)
                    .filter(line -> !line.isEmpty() && !line.startsWith(COMMENT))
                    .map(glob -> FileSystems.getDefault().getPathMatcher(GLOB + glob))
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }

    /** Whether the repository states this path, relative to its root, is not part of what it is. */
    public boolean excludes(final Path relative) {
        return stated.stream().anyMatch(matcher -> matcher.matches(relative));
    }

    /** How many patterns the repository stated, which a report carries so a denominator can be argued with. */
    public int stated() {
        return stated.size();
    }
}
