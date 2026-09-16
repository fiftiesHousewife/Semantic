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

    public static final String MANIFEST = "pull-requests.tsv";
    public static final String STATEMENT_SUFFIX = "-statement.md";
    public static final String TEMPLATE_SUFFIX = "-template.md";
    public static final String ISSUES_SUFFIX = "-issues.tsv";
    public static final String BASE_SUFFIX = "-base";
    private static final String COMMENT = "#";
    private static final String REPOSITORY_FIELD = "# repository:";
    private static final String COLUMN = "\t";
    private static final int COLUMNS = 7;

    private static final String PULL_REQUESTS_DIRECTORY_PROPERTY = "cs.pullrequests.dir";

    /** One row of the manifest: what the host stated, and the directory holding the changed files. */
    public record PullRequest(int number, String author, String headSha, String baseSha, String directory,
                              String retrieved, int files) {

        /** The columns the export publishes; the directory and the date are the fetch's own business. */
        public PullRequestFacts facts(final String repository) {
            return new PullRequestFacts(repository, number, author, headSha, baseSha, files);
        }
    }

    private final Path directory;
    private final List<PullRequest> pullRequests;
    private final String repository;

    private PullRequestSet(final Path directory, final List<PullRequest> pullRequests,
                           final String repository) {
        this.directory = directory;
        this.pullRequests = List.copyOf(pullRequests);
        this.repository = repository;
    }

    /**
     * The repository these pull requests are of, as the fetch step recorded it — {@code owner/name} — and
     * empty where the manifest predates the field.
     */
    public String repository() {
        return repository;
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
            final List<String> lines = Files.readAllLines(manifest);
            return new PullRequestSet(directory, lines.stream()
                    .filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .map(PullRequestSet::pullRequest)
                    .toList(), repositoryIn(lines));
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

    /**
     * What the pull request says — the statement the fetch wrote beside its directory, where it wrote one.
     * It sits beside the directory and never inside it, so a reading of the changed files cannot walk it.
     */
    public Optional<Path> statementOf(final PullRequest pullRequest) {
        return besides(pullRequest, STATEMENT_SUFFIX);
    }

    /**
     * The repository's own pull request template at the head commit, where the fetch found one stated. A
     * statement line the template states is the host's prose, and the reading subtracts it.
     */
    public Optional<Path> templateOf(final PullRequest pullRequest) {
        return besides(pullRequest, TEMPLATE_SUFFIX);
    }

    /**
     * The tracker's statements about the issues the statement references, where the fetch pinned them:
     * one row per referenced issue of the project the repository's own pom names, with the type the
     * tracker states.
     */
    public Optional<Path> issuesOf(final PullRequest pullRequest) {
        return besides(pullRequest, ISSUES_SUFFIX);
    }

    /**
     * The same changed files at the base commit, where the fetch step wrote them: the tree a reading
     * differences the head against to say which declarations the pull request adds and removes. An empty
     * directory is an answer — every changed file is one this pull request adds.
     */
    public Optional<Path> baseOf(final PullRequest pullRequest) {
        final Path base = directory.resolve(pullRequest.directory() + BASE_SUFFIX);
        return Files.isDirectory(base) ? Optional.of(base) : Optional.empty();
    }

    private Optional<Path> besides(final PullRequest pullRequest, final String suffix) {
        final Path file = directory.resolve(pullRequest.directory() + suffix);
        return Files.isRegularFile(file) ? Optional.of(file) : Optional.empty();
    }

    /** The repository the manifest names, and empty where it names none. */
    private static String repositoryIn(final List<String> lines) {
        return lines.stream()
                .filter(line -> line.startsWith(REPOSITORY_FIELD))
                .map(line -> line.substring(REPOSITORY_FIELD.length()).trim())
                .findFirst()
                .orElse("");
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
