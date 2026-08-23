package io.github.fiftieshousewife.codesemantics.clones;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/**
 * A repository's working tree at the commit its manifest pins it to, fetched where it is not already there.
 *
 * <p>A reading of a moving target is not reproducible, so the clone is checked out at the stated commit and
 * a tree sitting at any other commit is fetched again. Nothing is fetched when the tree is already pinned,
 * which is what makes a second run over the same manifest repeatable at no cost.
 *
 * <p>The fetch is the shallow one the evaluation set measured: {@code git init}, {@code git fetch --depth 1}
 * naming the commit, {@code git checkout FETCH_HEAD}. The whole tree arrives even though most of it is never
 * opened, and that is deliberate rather than an oversight.
 *
 * <p><b>A blob filter with a sparse checkout is far cheaper and is not equivalent.</b> Filtering blobs and
 * checking out only the source suffixes fetches a small fraction of the bytes in a fraction of the time, and
 * what it produces is a different reading: {@link TestResourceScope} reads the fixture corpus's file names,
 * a sparse checkout leaves those files off the disk, and the placement moves because a signal the reading is
 * meant to carry is missing. A filter <em>without</em> a sparse checkout is slower than no filter, because
 * the checkout then fetches every deferred blob one round trip at a time. Fetching the whole tree once is
 * what makes a repository's reading the same reading every time.
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

    /** Whether the tree is already the pinned commit, which is the whole of what a second run has to do. */
    public boolean isPinned(final Path clone) {
        return Files.isDirectory(clone.resolve(GIT_DIRECTORY)) && repository.sha().equals(head(clone));
    }

    /** What the tree is checked out at, or nothing where no tree has been fetched yet. */
    public String head(final Path clone) {
        return git.answering(List.of("-C", clone.toString(), "rev-parse", "HEAD"));
    }

    private void fetch(final Path clone) {
        makeDirectory(clone);
        git.answering(List.of("-C", clone.toString(), "init", "--quiet"));
        git.answering(List.of("-C", clone.toString(), "fetch", "--depth", "1", "--quiet",
                repository.origin(), repository.sha()));
        git.answering(List.of("-C", clone.toString(), "checkout", "--quiet", "FETCH_HEAD"));
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
