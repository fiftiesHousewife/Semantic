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
 * <p>{@code repositoryCode} is the same measurement over the whole working tree, so a pull request's
 * figures are read against the code they join rather than against a number chosen here. A method carrying
 * sixty statements says one thing where the repository's own worst carries sixty-two and another where it
 * carries two hundred.
 *
 * @param schemaVersion  the version of this file's shape, which rises when a field is added, renamed or
 *                       removed
 * @param repository     the repository these pull requests are of, as the host names it — {@code
 *                       owner/name} — and empty where the fetch step recorded none
 * @param repositoryCode what the whole working tree measures at the commit it was read at
 * @param pullRequests   one entry per pull request read, lowest number first
 */
public record PullRequestExport(String schemaVersion, String repository, MeasuredCode repositoryCode,
                                List<ExportedPullRequest> pullRequests) {

    /** The version of this file's shape, so a consumer branches on a change rather than failing on it. */
    public static final String SCHEMA_VERSION = "4.0";

    public PullRequestExport {
        Objects.requireNonNull(schemaVersion, "schemaVersion");
        Objects.requireNonNull(repository, "repository");
        Objects.requireNonNull(repositoryCode, "repositoryCode");
        pullRequests = List.copyOf(pullRequests);
    }

    /** The document at the version this build states, which is the only version it knows how to write. */
    public static PullRequestExport of(final String repository, final MeasuredCode repositoryCode,
                                       final List<ExportedPullRequest> pullRequests) {
        return new PullRequestExport(SCHEMA_VERSION, repository, repositoryCode, pullRequests);
    }
}
