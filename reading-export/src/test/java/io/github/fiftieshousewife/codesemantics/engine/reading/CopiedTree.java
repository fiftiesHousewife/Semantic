package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * A stated set of one tree's files, written into another directory at the relative paths they hold in the
 * tree. It is how a reading of a selection is taken: the selection becomes a directory, and the directory is
 * read the way any tree is.
 *
 * <p>The exclusions the tree states travel with every copy, because a copy without the tree's own
 * {@code .readingignore} would read files the original refuses.
 */
final class CopiedTree {

    private final Path root;
    private final List<Path> files;

    private CopiedTree(final Path root, final List<Path> files) {
        this.root = root;
        this.files = files;
    }

    /** The stated files of the tree at {@code root}. A file outside the tree is refused. */
    static CopiedTree of(final Path root, final Collection<Path> files) {
        final Path resolved = root.toAbsolutePath().normalize();
        final List<Path> stated = files.stream()
                .map(file -> file.toAbsolutePath().normalize())
                .toList();
        stated.stream()
                .filter(file -> !file.startsWith(resolved))
                .findFirst()
                .ifPresent(outside -> {
                    throw new IllegalArgumentException(String.format(Locale.ROOT,
                            "%s is not under %s",
                            outside, resolved));
                });
        return new CopiedTree(resolved, stated);
    }

    /** Every file the scopes name, which is the whole of what a reading of the tree would read. */
    static CopiedTree ofEveryScope(final Path root) {
        return of(root, RepositoryReading.scopesUnder(root).stream()
                .flatMap(scope -> scope.files().stream())
                .distinct()
                .toList());
    }

    /** Writes the copy under {@code target} and returns it. */
    Path into(final Path target) throws IOException {
        for (final Path file : files) {
            copied(file, target);
        }
        exclusionsInto(target);
        return target;
    }

    private void copied(final Path file, final Path target) throws IOException {
        final Path destination = target.resolve(root.relativize(file).toString());
        Files.createDirectories(destination.getParent());
        Files.copy(file, destination);
    }

    private void exclusionsInto(final Path target) throws IOException {
        final Path exclusions = root.resolve(StatedExclusions.FILE);
        if (Files.exists(exclusions) && !files.contains(exclusions)) {
            Files.copy(exclusions, target.resolve(StatedExclusions.FILE));
        }
    }
}
