package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import j2html.tags.DomContent;
import j2html.tags.specialized.TdTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.code;
import static j2html.TagCreator.td;
import static j2html.TagCreator.text;

/**
 * A pull request's number, reaching the host's own page for it wherever it is written. Every table names
 * the same pull requests, so the number is the link in all of them rather than in one table a reader has
 * to find.
 */
final class PullRequestLink {

    private static final String HOST = "https://github.com/";

    private PullRequestLink() {
    }

    /** The number as a table's first cell. */
    static TdTag cell(final ExportedPullRequest pullRequest) {
        return td().with(numbered(pullRequest));
    }

    /** The number, linked where the fetch step recorded which repository it belongs to. */
    static DomContent numbered(final ExportedPullRequest pullRequest) {
        final String shown = String.valueOf(pullRequest.number());
        if (pullRequest.repository().isEmpty()) {
            return text(shown);
        }
        return a(shown).withHref(String.format(Locale.ROOT, "%s%s/pull/%d", HOST,
                pullRequest.repository(), pullRequest.number()));
    }

    /** The commit read, linked the same way. */
    static DomContent commit(final ExportedPullRequest pullRequest) {
        if (pullRequest.repository().isEmpty()) {
            return code(pullRequest.headSha());
        }
        return a().withHref(String.format(Locale.ROOT, "%s%s/commit/%s", HOST,
                pullRequest.repository(), pullRequest.headSha())).with(code(pullRequest.headSha()));
    }
}
