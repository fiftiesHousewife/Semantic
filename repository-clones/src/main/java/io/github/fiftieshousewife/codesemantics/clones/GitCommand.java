package io.github.fiftieshousewife.codesemantics.clones;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * Git's own answer, with its error output attached where it fails.
 *
 * <p>A command that will not run has to name itself: a run that quietly reads yesterday's tree reports a
 * figure nobody can reproduce.
 */
public final class GitCommand {

    private static final int SUCCEEDED = 0;

    /**
     * What git said where the command succeeded, and nothing where it did not.
     *
     * <p>For questions whose negative answer is meaningful: a tree with no commit checked out has no HEAD,
     * and asking for one is how you find that out.
     */
    public Optional<String> asking(final List<String> arguments) {
        try {
            return Optional.of(answering(arguments));
        } catch (final IllegalStateException refused) {
            return Optional.empty();
        }
    }

    /** What git said, with its standard error folded in, or a failure naming the command that produced it. */
    public String answering(final List<String> arguments) {
        final List<String> command = named(arguments);
        try {
            final Process git = new ProcessBuilder(command).redirectErrorStream(true).start();
            final String said =
                    new String(git.getInputStream().readAllBytes(), StandardCharsets.UTF_8).strip();
            if (git.waitFor() != SUCCEEDED) {
                throw new IllegalStateException(String.format(Locale.ROOT, "%s failed: %s",
                        String.join(" ", command), said));
            }
            return said;
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT, "Failed to run %s",
                    String.join(" ", command)), e);
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(String.format(Locale.ROOT, "Interrupted running %s",
                    String.join(" ", command)), e);
        }
    }

    private static List<String> named(final List<String> arguments) {
        return java.util.stream.Stream.concat(java.util.stream.Stream.of("git"), arguments.stream())
                .toList();
    }
}
