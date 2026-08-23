package io.github.fiftieshousewife.codesemantics.clones;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * A repository's working tree at the commit its manifest pins it to, fetched where it is not already there.
 *
 * <p>A reading of a moving target is not reproducible, so the clone is checked out at the stated commit and
 * a tree sitting at any other commit is fetched again. Nothing is fetched when the tree is already pinned,
 * which is what makes a second run over the same manifest repeatable at no cost.
 *
 * <p>The fetch takes the blobs {@link ReadPaths} names and no others: {@code git init}, a sparse checkout
 * set to those patterns, {@code git fetch --depth 1 --filter=blob:none}, {@code git checkout FETCH_HEAD}.
 * Git resolves the missing blobs the checkout needs in one further round trip rather than one per file.
 *
 * <p><b>The read set is identical to a whole-tree clone's.</b> A sparse checkout that omitted
 * {@code src/test/resources} would produce a different reading, because the fixture corpus's file names are
 * read there; the patterns keep that directory for exactly that reason. Measured against a whole-tree clone
 * of the same commit, both carry the same files with the same contents.
 */
public final class PinnedClone {

    private static final String GIT_DIRECTORY = ".git";


    private final PinnedRepository repository;
    private final GitCommand git = new GitCommand();

    public PinnedClone(final PinnedRepository repository) {
        this.repository = Objects.requireNonNull(repository, "repository");
    }

    /** The tree at its pinned commit, fetched if what is under the named directory is not it. */
    public Path under(final Path directory) {
        final Path clone = repository.under(directory);
        if (isPinned(clone)) {
            return clone;
        }
        fetch(clone);
        return clone;
    }

    /**
     * Whether the tree is already the pinned commit, which is the whole of what a second run has to do.
     *
     * <p>A directory a stopped fetch left behind has a {@code .git} and no commit checked out. That is not
     * pinned, and answering so is what lets an interrupted run be resumed rather than started again.
     */
    public boolean isPinned(final Path clone) {
        return Files.isDirectory(clone.resolve(GIT_DIRECTORY))
                && head(clone).filter(repository.sha()::equals).isPresent();
    }

    /** What the tree is checked out at, or nothing where no commit has been checked out yet. */
    public Optional<String> head(final Path clone) {
        return git.asking(List.of("-C", clone.toString(), "rev-parse", "HEAD"));
    }

    private void fetch(final Path clone) {
        makeDirectory(clone);
        final String at = clone.toString();
        git.answering(List.of("-C", at, "init", "--quiet"));
        git.answering(List.of("-C", at, "config", "core.sparseCheckout", "true"));
        git.answering(sparseCheckout(at));
        git.answering(List.of("-C", at, "fetch", "--depth", "1", "--filter=blob:none", "--quiet",
                repository.origin(), repository.sha()));
        git.answering(List.of("-C", at, "checkout", "--quiet", "FETCH_HEAD"));
    }

    private static List<String> sparseCheckout(final String at) {
        return Stream.concat(
                        Stream.of("-C", at, "sparse-checkout", "set", "--no-cone"),
                        ReadPaths.patterns().stream())
                .toList();
    }

    private static void makeDirectory(final Path clone) {
        try {
            Files.createDirectories(clone);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to make the directory %s",
                    clone), e);
        }
    }

}
