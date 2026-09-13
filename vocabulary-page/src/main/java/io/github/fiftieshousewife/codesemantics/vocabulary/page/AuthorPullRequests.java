package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
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
 */
public record AuthorPullRequests(String repository, String author,
                                 List<ExportedPullRequest> pullRequests,
                                 List<String> repositoryWords) {

    public AuthorPullRequests {
        pullRequests = List.copyOf(pullRequests);
        repositoryWords = List.copyOf(repositoryWords);
    }

    /** The author's pull requests without the repository's own words beside them. */
    public AuthorPullRequests(final String repository, final String author,
                              final List<ExportedPullRequest> pullRequests) {
        this(repository, author, pullRequests, List.of());
    }

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
                                .toList()))
                .sorted(Comparator.comparingInt((AuthorPullRequests author) ->
                        author.pullRequests().size()).reversed())
                .toList();
    }

    /** The file the author's report is written to, beside the repository's own findings page. */
    public String file() {
        return author + ".html";
    }

    /** How many files the pull requests changed, as the host stated at the fetch. */
    public int changedFiles() {
        return pullRequests.stream().mapToInt(ExportedPullRequest::files).sum();
    }

    /** How many of those files the reading's scopes reach, summed over the pull requests read against a base. */
    public int filesRead() {
        return written().mapToInt(ExportedWork.Written::filesRead).sum();
    }

    public int filesAdded() {
        return written().mapToInt(ExportedWork.Written::filesAdded).sum();
    }

    public ExportedWork.Declarations added() {
        return summed(written().map(ExportedWork.Written::added).toList());
    }

    public ExportedWork.Declarations removed() {
        return summed(written().map(ExportedWork.Written::removed).toList());
    }

    public int kept() {
        return written().mapToInt(ExportedWork.Written::kept).sum();
    }

    /** How many of the author's pull requests state a base tree, so carry a declaration diff at all. */
    public long readAgainstABase() {
        return written().count();
    }

    /** Every type the author's pull requests add to what the build publishes with no test of its own. */
    public List<ExportedWork.NamedDeclaration> typesAddedWithoutATest() {
        return written()
                .flatMap(diff -> diff.typesAddedWithoutATest().stream())
                .toList();
    }

    /** Every type the author's pull requests add, in the order the pull requests were numbered. */
    public List<ExportedWork.NamedDeclaration> typesAdded() {
        return written()
                .flatMap(diff -> diff.typesAdded().stream())
                .toList();
    }

    /** The word a standard's definition covers each change's shape with, and how many share it. */
    public Map<String, ExportedWork.Inferred> inferred() {
        final Map<String, ExportedWork.Inferred> covered = new LinkedHashMap<>();
        pullRequests.stream()
                .map(AuthorPullRequests::inferredOf)
                .flatMap(Optional::stream)
                .forEach(word -> covered.putIfAbsent(word.type(), word));
        return Map.copyOf(covered);
    }

    /** The standard's word for one pull request's shape, where a definition covers it. */
    public static Optional<ExportedWork.Inferred> inferredOf(final ExportedPullRequest pullRequest) {
        return workOf(pullRequest).map(ExportedWork::inferred);
    }

    /** How many of the author's pull requests each standard's word covers. */
    public Map<String, Integer> inferredCounts() {
        final Map<String, Integer> counts = new LinkedHashMap<>();
        pullRequests.stream()
                .map(AuthorPullRequests::inferredOf)
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

    /** The declarations of one pull request, where the fetch step pinned the base tree it needs. */
    public static Optional<ExportedWork.Written> writtenOf(final ExportedPullRequest pullRequest) {
        return workOf(pullRequest).map(ExportedWork::written);
    }

    /** The work of one pull request, where the fetch step pinned a statement or a base tree to read it from. */
    public static Optional<ExportedWork> workOf(final ExportedPullRequest pullRequest) {
        return Optional.ofNullable(pullRequest.work());
    }

    private Stream<ExportedWork.Written> written() {
        return pullRequests.stream()
                .map(AuthorPullRequests::writtenOf)
                .flatMap(Optional::stream);
    }

    private Stream<ExportedWork> work() {
        return pullRequests.stream()
                .map(AuthorPullRequests::workOf)
                .flatMap(Optional::stream);
    }

    private static ExportedWork.Declarations summed(final List<ExportedWork.Declarations> counts) {
        return new ExportedWork.Declarations(
                counts.stream().mapToInt(ExportedWork.Declarations::types).sum(),
                counts.stream().mapToInt(ExportedWork.Declarations::methods).sum(),
                counts.stream().mapToInt(ExportedWork.Declarations::fields).sum());
    }
}
