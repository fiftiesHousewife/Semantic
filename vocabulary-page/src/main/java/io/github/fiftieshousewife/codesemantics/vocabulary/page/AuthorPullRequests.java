package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import io.github.fiftieshousewife.codesemantics.engine.export.MeasuredCode;
import io.github.fiftieshousewife.codesemantics.engine.export.PullRequestExport;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;

/**
 * One author's pull requests within one repository's reading, with the figures that sum across them.
 *
 * <p>Only counts sum. Every threshold a pull request's signals cleared is that pull request's own, drawn
 * over its own changed files, so no figure here is compared against a bar and none is recomputed.
 *
 * @param repository       the repository the reading is of
 * @param author           the login the fetch step selected these pull requests on
 * @param pullRequests     the author's pull requests, lowest number first
 * @param repositoryWords  the words the repository's own reading carries, for saying which of a pull
 *                         request's words are not among them
 * @param repositoryCode   what the whole working tree measures, for reading a pull request's figures
 *                         against the code they join
 */
public record AuthorPullRequests(String repository, String author,
                                 List<ExportedPullRequest> pullRequests,
                                 List<String> repositoryWords, MeasuredCode repositoryCode) {

    public AuthorPullRequests {
        pullRequests = List.copyOf(pullRequests);
        repositoryWords = List.copyOf(repositoryWords);
        Objects.requireNonNull(repositoryCode, "repositoryCode");
    }

    /** The author's pull requests with nothing of the repository beside them, which only a test has. */
    public AuthorPullRequests(final String repository, final String author,
                              final List<ExportedPullRequest> pullRequests) {
        this(repository, author, pullRequests, List.of(), NOTHING_MEASURED);
    }

    /** The same with the repository's own words, for a test that reads which of a change's are new. */
    public AuthorPullRequests(final String repository, final String author,
                              final List<ExportedPullRequest> pullRequests,
                              final List<String> repositoryWords) {
        this(repository, author, pullRequests, repositoryWords, NOTHING_MEASURED);
    }

    /** What a file name and a URL both carry; every other character of a login is written as a dash. */
    private static final Pattern AUTHORED = Pattern.compile("[^A-Za-z0-9._-]+");

    /** A tree nothing was measured over, so every figure read against it is nought. */
    private static final MeasuredCode NOTHING_MEASURED = new MeasuredCode(0,
            new MeasuredCode.Metrics(0, 0, 0, 0, new MeasuredCode.Spread(0, 0, 0),
                    new MeasuredCode.Spread(0, 0, 0), new MeasuredCode.Spread(0, 0, 0),
                    new MeasuredCode.Spread(0, 0, 0)));

    /** One entry per author the fetched set states, most pull requests first. */
    public static List<AuthorPullRequests> in(final PullRequestExport fetched,
                                              final ReadingExport reading) {
        final Map<String, List<ExportedPullRequest>> byAuthor = new LinkedHashMap<>();
        fetched.pullRequests().stream()
                .sorted(Comparator.comparingInt(ExportedPullRequest::number))
                .forEach(pullRequest -> byAuthor
                        .computeIfAbsent(pullRequest.author(), author -> new ArrayList<>())
                        .add(pullRequest));
        return byAuthor.entrySet().stream()
                .map(entry -> new AuthorPullRequests(reading.summary().repository(), entry.getKey(),
                        entry.getValue(), reading.signals().stream()
                                .map(signal -> PublishedSpelling.shown(signal.word()))
                                .toList(), fetched.repositoryCode()))
                .sorted(Comparator.comparingInt((AuthorPullRequests author) ->
                        author.pullRequests().size()).reversed())
                .toList();
    }

    /**
     * The file the author's report is written to, beside the repository's own findings page. A login the
     * host allows but a path does not — {@code dependabot[bot]} — is written in the characters a file
     * name and a URL both carry.
     */
    public String file() {
        return AUTHORED.matcher(author).replaceAll("-") + ".html";
    }

    /** How many files the pull requests changed, as the host stated at the fetch. */
    public int changedFiles() {
        return pullRequests.stream().mapToInt(ExportedPullRequest::files).sum();
    }

    /** How many of those files the reading's scopes reach, summed over the pull requests read against a base. */
    public int filesRead() {
        return written().mapToInt(ChangedCode::filesRead).sum();
    }

    public int filesAdded() {
        return written().mapToInt(ChangedCode::filesAdded).sum();
    }

    public ChangedCode.Declarations added() {
        return summed(written().map(ChangedCode::added).toList());
    }

    public ChangedCode.Declarations removed() {
        return summed(written().map(ChangedCode::removed).toList());
    }

    public int kept() {
        return written().mapToInt(ChangedCode::kept).sum();
    }

    /** How many of the author's pull requests state a base tree, so carry a declaration diff at all. */
    public long readAgainstABase() {
        return written().count();
    }

    /** Every type the author's pull requests add to what the build publishes with no test of its own. */
    public List<ChangedCode.TypeWithoutATest> typesAddedWithoutATest() {
        return written()
                .flatMap(diff -> diff.typesAddedWithoutATest().stream())
                .toList();
    }

    /** Every type the author's pull requests add, in the order the pull requests were numbered. */
    public List<ChangedCode.NamedDeclaration> typesAdded() {
        return written()
                .flatMap(diff -> diff.typesAdded().stream())
                .toList();
    }

    /** The word a standard's definition covers each change's shape with, and how many share it. */
    public Map<String, ExportedWork.Inferred> inferred() {
        final Map<String, ExportedWork.Inferred> covered = new LinkedHashMap<>();
        pullRequests.stream()
                .map(PullRequestWork::inferred)
                .flatMap(Optional::stream)
                .forEach(word -> covered.putIfAbsent(word.type(), word));
        return Map.copyOf(covered);
    }

    /** How many of the author's pull requests each standard's word covers. */
    public Map<String, Integer> inferredCounts() {
        final Map<String, Integer> counts = new LinkedHashMap<>();
        pullRequests.stream()
                .map(PullRequestWork::inferred)
                .flatMap(Optional::stream)
                .forEach(word -> counts.merge(word.type(), 1, Integer::sum));
        return Map.copyOf(counts);
    }

    /** The types the pull requests state for their own work, and how many state each. */
    public Map<String, Integer> statedClasses() {
        final Map<String, Integer> classes = new LinkedHashMap<>();
        work().forEach(work -> work.stated().classes()
                .forEach(stated -> classes.merge(stated.type(), stated.lines(), Integer::sum)));
        return Map.copyOf(classes);
    }

    /** The issue types the repository's own tracker states, and how many pull requests reference each. */
    public Map<String, Integer> trackerTypes() {
        final Map<String, Integer> types = new LinkedHashMap<>();
        work().forEach(work -> work.issues()
                .forEach(issue -> types.merge(issue.type(), 1, Integer::sum)));
        return Map.copyOf(types);
    }

    private Stream<ChangedCode> written() {
        return pullRequests.stream()
                .map(PullRequestWork::written)
                .flatMap(Optional::stream);
    }

    private Stream<ExportedWork> work() {
        return pullRequests.stream()
                .map(PullRequestWork::of)
                .flatMap(Optional::stream);
    }

    private static ChangedCode.Declarations summed(final List<ChangedCode.Declarations> counts) {
        return new ChangedCode.Declarations(
                counts.stream().mapToInt(ChangedCode.Declarations::types).sum(),
                counts.stream().mapToInt(ChangedCode.Declarations::methods).sum(),
                counts.stream().mapToInt(ChangedCode.Declarations::fields).sum());
    }
}
