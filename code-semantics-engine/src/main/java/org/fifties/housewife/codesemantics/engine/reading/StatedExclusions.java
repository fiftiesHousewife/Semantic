package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.List;

/**
 * What a repository states is not part of what it is, read from its own {@code .readingignore}.
 *
 * <p>Every reading in this library refuses a list of names chosen here, and the documentation scope used to
 * carry one anyway — a set of five markdown filenames this library had decided were working notes rather than
 * documentation. That was a curated observation wearing a rule's clothes, and it was wrong in both directions:
 * it excluded another repository's {@code CONTRIBUTING.md}, which is that repository's own statement about
 * itself, and it could not exclude a plan document filed under {@code docs/}.
 *
 * <p><b>The repository is the one entitled to say.</b> A file at the root of the tree under reading, one glob
 * per line, is the author stating which of their own artefacts are notes about the work rather than the work —
 * and a statement by the corpus about the corpus is a citation in exactly the way a curated list inside the
 * reader is not. A repository that states nothing excludes nothing, which is the honest default: silence is
 * not permission to guess.
 *
 * <p>The globs are matched against the path relative to the root, so {@code CLAUDE.md} names a file at the
 * root and {@code docs/plans/**} names a directory's whole contents.
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
