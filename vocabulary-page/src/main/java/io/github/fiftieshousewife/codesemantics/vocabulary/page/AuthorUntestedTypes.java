package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import j2html.tags.DomContent;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TrTag;

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
 * A row per type the author's pull requests add to what the build publishes with no test of its own,
 * naming the class such a test would be. The name comes from the first of Surefire's default patterns,
 * so a reader is given a file name that build would run rather than one this page chose.
 */
final class AuthorUntestedTypes {

    SectionTag markup(final AuthorPullRequests author) {
        final SectionTag drawn = section().withId("untested")
                .with(h2("The types added with no test of their own"));
        if (author.typesAddedWithoutATest().isEmpty()) {
            return drawn.with(p("Every type they add to what the build publishes arrives with a test "
                    + "named for it."));
        }
        return drawn.with(lede(), div().withClass("scrolls").with(table().withClass("work").with(
                thead(tr(th("Pull request"), th("Type added"), th("Test it arrives without"))),
                tbody(each(author.pullRequests(), AuthorUntestedTypes::rowsFor)))));
    }

    private static DomContent lede() {
        return p().withClass("lede").with(
                span("The third column is the name the first of Maven Surefire's default "
                        + "includes gives a test of the type beside it"),
                Footnotes.marker(Footnotes.UNTESTED),
                span("."));
    }

    private static DomContent rowsFor(final ExportedPullRequest pullRequest) {
        final List<ChangedCode.TypeWithoutATest> untested = PullRequestWork.written(pullRequest)
                .map(ChangedCode::typesAddedWithoutATest)
                .orElse(List.of());
        return each(untested, type -> row(pullRequest, type));
    }

    private static TrTag row(final ExportedPullRequest pullRequest,
                             final ChangedCode.TypeWithoutATest type) {
        return tr(PullRequestLink.cell(pullRequest), td(code(type.name())), named(type));
    }

    /** The test's name, and a dash where the pattern would not read the type's own name back. */
    private static DomContent named(final ChangedCode.TypeWithoutATest type) {
        return type.test().isEmpty() ? td(Figure.ABSENT) : td(code(type.test()));
    }
}
