package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;

/**
 * What one pull request's own block states about its work, where the fetch step pinned enough to read it.
 *
 * <p>A pull request whose statement was never fetched states no class, and one whose base tree was never
 * fetched states no declarations. Each is absent from the document rather than present and empty, so the
 * question is asked here once and answered as nothing rather than checked at every reader.
 */
final class PullRequestWork {

    private PullRequestWork() {
    }

    /** The work of one pull request, where the fetch pinned a statement or a base tree to read it from. */
    static Optional<ExportedWork> of(final ExportedPullRequest pullRequest) {
        return Optional.ofNullable(pullRequest.work());
    }

    /** The declarations one pull request changes, where its base tree was fetched. */
    static Optional<ChangedCode> written(final ExportedPullRequest pullRequest) {
        return of(pullRequest).map(ExportedWork::written);
    }

    /** The standard's word for one pull request's shape, where a definition covers it. */
    static Optional<ExportedWork.Inferred> inferred(final ExportedPullRequest pullRequest) {
        return of(pullRequest).map(ExportedWork::inferred);
    }
}
