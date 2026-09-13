package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;

/** Where a pull request's own lists stand on the page, so a count in a table can reach them. */
final class PullRequestAnchors {

    private PullRequestAnchors() {
    }

    static String wordsId(final ExportedPullRequest pullRequest) {
        return String.format(Locale.ROOT, "words-%d", pullRequest.number());
    }

    static String typesId(final ExportedPullRequest pullRequest) {
        return String.format(Locale.ROOT, "types-%d", pullRequest.number());
    }

    static String words(final ExportedPullRequest pullRequest) {
        return "#" + wordsId(pullRequest);
    }

    static String types(final ExportedPullRequest pullRequest) {
        return "#" + typesId(pullRequest);
    }
}
