package org.fifties.housewife.codesemantics.repository;

import java.util.List;
import java.util.Objects;

/**
 * The hosted metadata another process fetched, handed to the library alongside a local clone path. The
 * library itself performs no authentication, no cloning and no network access of any kind at analysis time —
 * which is what makes a reading reproducible offline as well as what keeps credentials out of its scope.
 *
 * <p>{@code host} travels with the facts rather than living in a constant, so an enterprise host renders its
 * own permalinks.
 */
public record RepositoryFacts(String host, String owner, String name, String defaultBranch,
                              List<PullRequestFacts> pullRequests) {

    public RepositoryFacts {
        Objects.requireNonNull(host, "host");
        Objects.requireNonNull(owner, "owner");
        Objects.requireNonNull(name, "name");
        pullRequests = List.copyOf(pullRequests);
    }
}
