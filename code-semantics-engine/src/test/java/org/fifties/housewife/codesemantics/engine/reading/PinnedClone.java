package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.fifties.housewife.codesemantics.engine.reading.EvaluationSet.Member;

/**
 * A evaluation set member's working tree at the commit the manifest pins it to, fetched where it is not already
 * there.
 *
 * <p>A reading of a moving target is not reproducible, so the clone is checked out at the stated commit and
 * a tree sitting at any other commit is fetched again. Nothing is fetched when the tree is already pinned,
 * which is what makes an evaluation set run repeatable at no cost.
 *
 * <p>The fetch is the shallow one the evaluation-set plan measured: {@code git init}, {@code git fetch --depth 1}
 * naming the commit, {@code git checkout FETCH_HEAD}. A blob filter makes it slower rather than faster,
 * because the filter defers each blob and the checkout then fetches the files one round trip at a time.
 */
public final class PinnedClone {

    private static final String GIT_DIRECTORY = ".git";

    private static final int GIT_SUCCEEDED = 0;

    private final Member member;

    public PinnedClone(final Member member) {
        this.member = Objects.requireNonNull(member, "member");
    }

    /** The member's tree at its pinned commit, fetched if what is under the evaluation set directory is not it. */
    public Path under(final Path evaluationSet) {
        final Path clone = member.under(evaluationSet);
        if (isPinned(clone)) {
            return clone;
        }
        fetch(clone);
        return clone;
    }

    /** Whether the tree is already the pinned commit, which is the whole of what a second run has to do. */
    public boolean isPinned(final Path clone) {
        return Files.isDirectory(clone.resolve(GIT_DIRECTORY)) && member.sha().equals(head(clone));
    }

    /** What the tree is checked out at, or nothing where no tree has been fetched yet. */
    public String head(final Path clone) {
        return git(clone, "rev-parse", "HEAD");
    }

    private void fetch(final Path clone) {
        makeDirectory(clone);
        git(clone, "init", "--quiet");
        git(clone, "fetch", "--depth", "1", "--quiet", member.origin(), member.sha());
        git(clone, "checkout", "--quiet", "FETCH_HEAD");
    }

    private static void makeDirectory(final Path clone) {
        try {
            Files.createDirectories(clone);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to make the directory " + clone, e);
        }
    }

    /**
     * Git's own answer, with its error output attached where it fails. A member that will not fetch has to
     * name itself: an evaluation set run that quietly reads yesterday's tree reports a figure nobody can reproduce.
     */
    private String git(final Path clone, final String... arguments) {
        final List<String> command = new ArrayList<>(List.of("git", "-C", clone.toString()));
        command.addAll(List.of(arguments));
        try {
            final Process git = new ProcessBuilder(command).redirectErrorStream(true).start();
            final String said = new String(git.getInputStream().readAllBytes(), StandardCharsets.UTF_8).strip();
            if (git.waitFor() != GIT_SUCCEEDED) {
                throw new IllegalStateException(String.join(" ", command) + " failed: " + said);
            }
            return said;
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to run " + String.join(" ", command), e);
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted running " + String.join(" ", command), e);
        }
    }
}
