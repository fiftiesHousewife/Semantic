package io.github.fiftieshousewife.codesemantics.clones;

import java.util.List;
import java.util.Locale;

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

    private static final String DEFAULT_BRANCH = "HEAD";
    private static final String FIELD = "\t";

    private final GitCommand git;

    public GitRemoteHead() {
        this(new GitCommand());
    }

    public GitRemoteHead(final GitCommand git) {
        this.git = git;
    }

    @Override
    public String of(final String origin) {
        final String said = git.answering(List.of("ls-remote", origin, DEFAULT_BRANCH));
        final String[] fields = said.split(FIELD, -1);
        if (said.isBlank() || fields[0].isBlank()) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "git ls-remote %s named no commit for HEAD, so there is nothing to pin it at: %s",
                    origin, said));
        }
        return fields[0].strip();
    }
}
