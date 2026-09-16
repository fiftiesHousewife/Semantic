package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.parse.AuthoredLines;
import io.github.fiftieshousewife.codesemantics.engine.reading.PullRequestSet;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.repository.PullRequestFacts;

/**
 * The pull requests a fetch step wrote, read into the entries the export publishes.
 *
 * <p>This is the whole of the path: hand it the directory {@code fetch-pull-requests.sh} filled and it
 * returns one entry per pull request, ready for {@link PullRequestDocument} to write. A caller composing
 * the pieces itself would have to know that the statements are judged together and that a changed-file
 * copy is read differently from a whole tree, and both are decisions of the reading rather than of the
 * caller.
 *
 * <p>Each pull request's head is read as the copy it is — it carries no root pom and therefore no module
 * chain, so a change to a module's own pom reads as nothing otherwise. Nothing is memoised: how long a
 * reading lives is the caller's business, and a run wanting one reading per tree holds it itself.
 */
public final class ReadPullRequests {

    private final List<String> published;

    /**
     * @param published the vocabularies the repository's own reading published, so a pull request is asked
     *                  only about those — one the reading refused is refused for the code a pull request
     *                  joins
     */
    public ReadPullRequests(final List<String> published) {
        this.published = List.copyOf(published);
    }

    /** One entry per pull request the set names, in the order the manifest states them. */
    public List<ExportedPullRequest> in(final PullRequestSet set) {
        final ExportedPullRequests exported = new ExportedPullRequests(published);
        final int statements = (int) set.pullRequests().stream()
                .filter(pullRequest -> set.statementOf(pullRequest).isPresent())
                .count();
        return set.pullRequests().stream()
                .map(pullRequest -> read(exported, set, pullRequest, statements))
                .toList();
    }

    /** The statements are judged together, so each is priced against the field of all of them. */
    private static ExportedPullRequest read(final ExportedPullRequests exported, final PullRequestSet set,
                                            final PullRequestSet.PullRequest pullRequest,
                                            final int statements) {
        final Path head = set.treeOf(pullRequest);
        final RepositoryReading reading = RepositoryReading.ofChangedFiles(head);
        final List<ExportedWork.Issue> issues = set.issuesOf(pullRequest)
                .map(PinnedIssues::in)
                .orElse(List.of());
        final Optional<ChangedCode> written = set.baseOf(pullRequest)
                .map(base -> new WrittenWork().between(base, head));
        final PullRequestFacts facts = pullRequest.facts(set.repository());
        return set.statementOf(pullRequest)
                .map(statement -> exported.of(facts, reading,
                        authored(statement, set.templateOf(pullRequest)), issues, statements, written))
                .orElseGet(() -> written
                        .map(declarations -> exported.of(facts, reading, declarations))
                        .orElseGet(() -> exported.of(facts, reading)));
    }

    /**
     * The statement with the repository's own pull request template subtracted where it states one. An
     * untouched template line is the host's prose and not the author's, and the subtraction is cited to
     * the repository's own published file.
     */
    private static String authored(final Path statement, final Optional<Path> template) {
        return template
                .map(pinned -> AuthoredLines.of(textIn(statement), textIn(pinned)))
                .orElseGet(() -> textIn(statement));
    }

    private static String textIn(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }
}
