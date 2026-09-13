package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

/**
 * Everything a reading discovers about the pull requests fetched beside a repository, as its own
 * published document.
 *
 * <p>It is a document of its own and not a section of the reading, because it answers a different
 * question about a different corpus: the reading is of a working tree at one commit, and this is of the
 * changes proposed against it. A consumer wanting one and not the other reads one file, and the
 * repository's own figures cannot move when this shape does.
 *
 * <p>Its shape is stated in {@code pull-requests.schema.json}, which ships beside it and which every
 * document is checked against before it is written.
 *
 * @param schemaVersion the version of this file's shape, which rises when a field is added, renamed or
 *                      removed
 * @param repository    the repository these pull requests are of, as the host names it — {@code
 *                      owner/name} — and empty where the fetch step recorded none
 * @param pullRequests  one entry per pull request read, lowest number first
 */
public record PullRequestExport(String schemaVersion, String repository,
                                List<ExportedPullRequest> pullRequests) {

    /** The version of this file's shape, so a consumer branches on a change rather than failing on it. */
    public static final String SCHEMA_VERSION = "1.0";

    public PullRequestExport {
        Objects.requireNonNull(schemaVersion, "schemaVersion");
        Objects.requireNonNull(repository, "repository");
        pullRequests = List.copyOf(pullRequests);
    }

    /** The document at the version this build states, which is the only version it knows how to write. */
    public static PullRequestExport of(final String repository,
                                       final List<ExportedPullRequest> pullRequests) {
        return new PullRequestExport(SCHEMA_VERSION, repository, pullRequests);
    }
}
