package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TdTag;
import j2html.tags.specialized.TrTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.code;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.p;
import static j2html.TagCreator.section;
import static j2html.TagCreator.span;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;

/**
 * One row per pull request: how many words its changed files write above both references, the strongest of
 * them, how well its own description fits that code, and the types it introduces. Each count links to the
 * list behind it.
 */
final class AuthorSubjects {

    private static final int WORDS = 5;

    private static final int TYPES = 3;

    private final ContentWords content = ContentWords.fromClasspath();

    private final PullRequestWords merged = new PullRequestWords();

    SectionTag markup(final AuthorPullRequests author) {
        return section().withId("subjects").with(
                h2("What each pull request is about"),
                p().withClass("lede").withText("A word counts where the changed files write it more "
                        + "densely than both references: ordinary English, and ten Java repositories "
                        + "read the same way. Forms a dictionary calls one word count once. A word is "
                        + "new where the repository\u2019s own reading does not carry it."),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"), th("Words").withClass("number"),
                                th("New").withClass("number"), th("Strongest"),
                                th().with(span("Description fits"), Footnotes.marker(Footnotes.FIT)),
                                th("Types it introduces"))),
                        tbody(each(author.pullRequests(), pullRequest -> row(author, pullRequest))))));
    }

    private TrTag row(final AuthorPullRequests author, final ExportedPullRequest pullRequest) {
        return tr(PullRequestLink.cell(pullRequest), words(pullRequest, merged.of(pullRequest)),
                td(String.valueOf(newToTheRepository(author, pullRequest))).withClass("number"),
                td(strongest(pullRequest)), td(fit(pullRequest)), types(pullRequest));
    }

    /** How many of this pull request's words the repository's own reading does not carry. */
    private int newToTheRepository(final AuthorPullRequests author,
                                   final ExportedPullRequest pullRequest) {
        final Set<String> written = author.repositoryWords().stream()
                .map(word -> content.lemmaOf(word).orElse(word))
                .collect(Collectors.toUnmodifiableSet());
        return (int) merged.of(pullRequest).stream()
                .filter(word -> !written.contains(word.word()))
                .count();
    }

    /** The count of merged words, linking to the cloud drawing each of them. */
    private static TdTag words(final ExportedPullRequest pullRequest,
                               final List<PullRequestWords.Merged> merged) {
        final int count = merged.size();
        if (count == 0) {
            return td(Figure.ABSENT).withClass("number");
        }
        return td().withClass("number").with(a(String.valueOf(count))
                .withHref(PullRequestAnchors.words(pullRequest)));
    }

    private static String fit(final ExportedPullRequest pullRequest) {
        return StatementFit.of(pullRequest.statement())
                .map(StatementFit::shown)
                .orElse(Figure.ABSENT);
    }

    /** The leading types, with the rest reachable by the link that counts them. */
    private static TdTag types(final ExportedPullRequest pullRequest) {
        final List<String> added = AuthorWork.typesAdded(pullRequest);
        if (added.isEmpty()) {
            return td(Figure.ABSENT);
        }
        final TdTag drawn = td().with(code(added.stream().limit(TYPES)
                .collect(Collectors.joining(", "))));
        if (added.size() <= TYPES) {
            return drawn;
        }
        return drawn.with(span(" and "), a(String.format(Locale.ROOT, "%d more", added.size() - TYPES))
                .withHref(PullRequestAnchors.types(pullRequest)));
    }

    /** The leading words a dictionary reads, in the form it calls them, which is what a cell quotes. */
    private String strongest(final ExportedPullRequest pullRequest) {
        return merged.carryingMeaning(pullRequest).stream()
                .map(PullRequestWords.Merged::word)
                .limit(WORDS)
                .collect(Collectors.joining(", "));
    }
}
