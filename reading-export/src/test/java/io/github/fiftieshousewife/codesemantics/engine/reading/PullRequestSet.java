package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.repository.PullRequestFacts;

/**
 * The pull requests a fetch step wrote, read from the {@code pull-requests.tsv} manifest
 * {@code fetch-pull-requests.sh} keeps beside the directories it fills. Each row pins one pull request to
 * the head commit its files were taken at, the way the evaluation-set manifest pins each member, so a
 * reading of these directories is a reading of named commits.
 */
public final class PullRequestSet {

    static final String MANIFEST = "pull-requests.tsv";
    private static final String COMMENT = "#";
    private static final String COLUMN = "\t";
    private static final int COLUMNS = 7;

    private static final String PULL_REQUESTS_DIRECTORY_PROPERTY = "cs.pullrequests.dir";

    /** One row of the manifest: what the host stated, and the directory holding the changed files. */
    public record PullRequest(int number, String author, String headSha, String baseSha, String directory,
                              String retrieved, int files) {

        /** The five columns the export publishes; the directory and the date are the fetch's own business. */
        public PullRequestFacts facts() {
            return new PullRequestFacts(number, author, headSha, baseSha, files);
        }
    }

    private final Path directory;
    private final List<PullRequest> pullRequests;

    private PullRequestSet(final Path directory, final List<PullRequest> pullRequests) {
        this.directory = directory;
        this.pullRequests = List.copyOf(pullRequests);
    }

    /** The manifest in the directory the fetch step filled. A directory without one is a wrong path, not an empty set. */
    public static PullRequestSet under(final Path directory) {
        final Path manifest = directory.resolve(MANIFEST);
        if (!Files.isRegularFile(manifest)) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "No %s under %s. Point cs.pullrequests.dir at the directory fetch-pull-requests.sh "
                    + "filled.",
                    MANIFEST, directory));
        }
        try {
            return new PullRequestSet(directory, Files.readAllLines(manifest).stream()
                    .filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .map(PullRequestSet::pullRequest)
                    .toList());
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + manifest, e);
        }
    }

    /** The set {@code -Dcs.pullrequests.dir} names, or nothing: a read without pull requests is the ordinary read. */
    public static Optional<PullRequestSet> fromSystemProperty() {
        final String supplied = System.getProperty(PULL_REQUESTS_DIRECTORY_PROPERTY, "");
        return supplied.isBlank() ? Optional.empty()
                : Optional.of(under(Path.of(supplied).toAbsolutePath().normalize()));
    }

    public List<PullRequest> pullRequests() {
        return pullRequests;
    }

    /** The directory holding this pull request's changed files, beneath the manifest's own. */
    public Path treeOf(final PullRequest pullRequest) {
        return directory.resolve(pullRequest.directory());
    }

    private static PullRequest pullRequest(final String line) {
        final String[] columns = line.split(COLUMN, -1);
        if (columns.length != COLUMNS) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "%d columns where %s states %d: %s",
                    columns.length, MANIFEST, COLUMNS, line));
        }
        return new PullRequest(Integer.parseInt(columns[0]), columns[1], columns[2], columns[3],
                columns[4], columns[5], Integer.parseInt(columns[6]));
    }
}
