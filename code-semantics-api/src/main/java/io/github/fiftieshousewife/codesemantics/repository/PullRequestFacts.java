package io.github.fiftieshousewife.codesemantics.repository;

import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * One pull request as the host recorded it. A pull request's scope is its merge diff — {@code baseSha} to
 * {@code headSha} — and not the union of its commits' diffs, because a commit that adds a line and a later
 * commit in the same request that removes it net to nothing, and the merge diff says so.
 *
 * <p>{@code labels} is routinely empty on public repositories, so a label is only ever a light corroborating
 * vote, never a primary signal.
 */
public record PullRequestFacts(int number, String title, String body, String state,
                               Instant mergedAt, String mergeCommitSha, String baseSha, String headSha,
                               String authorLogin, boolean authorIsBot, List<String> labels) {

    public PullRequestFacts {
        Objects.requireNonNull(baseSha, "baseSha");
        Objects.requireNonNull(headSha, "headSha");
        labels = List.copyOf(labels);
    }

    public Optional<Instant> merged() {
        return Optional.ofNullable(mergedAt);
    }
}
