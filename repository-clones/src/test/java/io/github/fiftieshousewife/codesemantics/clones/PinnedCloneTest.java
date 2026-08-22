package io.github.fiftieshousewife.codesemantics.clones;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PinnedCloneTest {

    private static final String LICENCE = "Apache-2.0";

    private String git(final Path in, final String... arguments) throws IOException, InterruptedException {
        final List<String> command = new java.util.ArrayList<>(List.of("git", "-C", in.toString()));
        command.addAll(List.of(arguments));
        final Process ran = new ProcessBuilder(command).redirectErrorStream(true).start();
        final String said = new String(ran.getInputStream().readAllBytes(), StandardCharsets.UTF_8).strip();
        assertThat(ran.waitFor()).as("%s said %s", String.join(" ", command), said).isZero();
        return said;
    }

    /** An origin on disk, so the fetch is the real one and reaches no network. */
    private String committed(final Path origin) throws IOException, InterruptedException {
        git(origin, "init", "--quiet", "--initial-branch=main");
        Files.writeString(origin.resolve("Readable.java"), "class Readable { }\n");
        git(origin, "add", ".");
        git(origin, "-c", "user.name=A Tester", "-c", "user.email=tester@example.invalid",
                "commit", "--quiet", "-m", "one commit");
        return git(origin, "rev-parse", "HEAD");
    }

    @Test
    void fetchesATreeThatIsNotThereAndLeavesItAtThePinnedCommit(@TempDir final Path origin,
                                                                @TempDir final Path holding)
            throws IOException, InterruptedException {
        final String sha = committed(origin);
        final PinnedClone clone = new PinnedClone(
                new PinnedRepository("readable", origin.toUri().toString(), sha, LICENCE));

        final Path tree = clone.under(holding);

        assertAll(
                () -> assertThat(tree).isEqualTo(holding.resolve("readable")),
                () -> assertThat(clone.head(tree)).isEqualTo(sha),
                () -> assertThat(tree.resolve("Readable.java")).exists());
    }

    @Test
    void fetchesNothingWhereTheTreeIsAlreadyAtItsPin(@TempDir final Path origin,
                                                     @TempDir final Path holding)
            throws IOException, InterruptedException {
        final String sha = committed(origin);
        final PinnedClone clone = new PinnedClone(
                new PinnedRepository("readable", origin.toUri().toString(), sha, LICENCE));
        final Path tree = clone.under(holding);
        Files.writeString(tree.resolve("Untracked.java"), "class Untracked { }\n");

        clone.under(holding);

        assertThat(tree.resolve("Untracked.java"))
                .as("a second run over a pinned tree touches nothing, which is what makes a corpus read "
                        + "repeatable at no cost")
                .exists();
    }

    @Test
    void readsAnEmptyDirectoryAsATreeThatWasNeverFetched(@TempDir final Path holding) {
        final PinnedClone clone = new PinnedClone(
                new PinnedRepository("readable", "https://example.invalid/readable.git",
                        "0".repeat(40), LICENCE));

        assertThat(clone.isPinned(holding.resolve("readable")))
                .as("a tree that was never fetched and a tree the reading said nothing about produce the "
                        + "same empty result, and only one of them is an answer")
                .isFalse();
    }
}
