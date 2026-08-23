package io.github.fiftieshousewife.codesemantics.clones;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * The commit a remote's default branch points at, asked of git rather than of an API.
 *
 * <p>{@code git ls-remote} transfers no objects and spends no API rate limit, which is what makes pinning a
 * hundred repositories a matter of seconds rather than an hour of paced requests.
 *
 * <p>A remote that answers nothing fails rather than returning an empty pin: a manifest row with no commit
 * is a moving target, which is the one thing a pinned manifest exists to prevent.
 */
public final class GitRemoteHead implements HeadCommit {

    private static final int GIT_SUCCEEDED = 0;
    private static final String DEFAULT_BRANCH = "HEAD";
    private static final String FIELD = "\t";

    @Override
    public String of(final String origin) {
        final String said = git("ls-remote", origin, DEFAULT_BRANCH);
        final String[] fields = said.split(FIELD, -1);
        if (said.isBlank() || fields[0].isBlank()) {
            throw new IllegalStateException("git ls-remote " + origin
                    + " named no commit for HEAD, so there is nothing to pin it at: " + said);
        }
        return fields[0].strip();
    }

    private static String git(final String... arguments) {
        final List<String> command = List.of(arguments);
        try {
            final ProcessBuilder building = new ProcessBuilder();
            building.command().add("git");
            building.command().addAll(command);
            final Process git = building.redirectErrorStream(true).start();
            final String said = new String(git.getInputStream().readAllBytes(), StandardCharsets.UTF_8).strip();
            if (git.waitFor() != GIT_SUCCEEDED) {
                throw new IllegalStateException("git " + String.join(" ", command) + " failed: " + said);
            }
            return said;
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to run git " + String.join(" ", command), e);
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted running git " + String.join(" ", command), e);
        }
    }
}
