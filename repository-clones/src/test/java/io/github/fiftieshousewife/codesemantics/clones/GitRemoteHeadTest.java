package io.github.fiftieshousewife.codesemantics.clones;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class GitRemoteHeadTest {

    @TempDir
    private Path directory;

    private Path origin;

    @BeforeEach
    void makeARepositoryWithOneCommit() throws Exception {
        origin = directory.resolve("origin");
        Files.createDirectories(origin);
        git("init", "--quiet", "--initial-branch", "main");
        Files.writeString(origin.resolve("Written.java"), "class Written {}", StandardCharsets.UTF_8);
        git("add", "Written.java");
        git("-c", "user.email=corpus@example.com", "-c", "user.name=Corpus", "commit", "--quiet",
                "-m", "one");
    }

    @Test
    void namesTheCommitTheDefaultBranchPointsAt() {
        assertThat(new GitRemoteHead().of(origin.toString()))
                .isEqualTo(git("rev-parse", "HEAD"));
    }

    @Test
    void refusesARemoteThatAnswersWithNoCommitAtAllRatherThanPinningNothing() throws Exception {
        final Path empty = directory.resolve("empty.git");
        final Process init = new ProcessBuilder("git", "init", "--bare", "--quiet", empty.toString())
                .redirectErrorStream(true).start();
        init.waitFor();

        assertThatThrownBy(() -> new GitRemoteHead().of(empty.toString()))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("named no commit for HEAD");
    }

    @Test
    void refusesARemoteThatNamesNoCommitRatherThanPinningNothing() {
        assertThatThrownBy(() -> new GitRemoteHead().of(directory.resolve("absent").toString()))
                .isInstanceOf(IllegalStateException.class);
    }

    private String git(final String... arguments) {
        final List<String> command = new java.util.ArrayList<>(List.of("git", "-C", origin.toString()));
        command.addAll(List.of(arguments));
        try {
            final Process git = new ProcessBuilder(command).redirectErrorStream(true).start();
            final String said = new String(git.getInputStream().readAllBytes(), StandardCharsets.UTF_8).strip();
            git.waitFor();
            return said;
        } catch (final IOException | InterruptedException e) {
            throw new IllegalStateException(String.join(" ", command), e);
        }
    }
}
