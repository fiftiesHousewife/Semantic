package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Locale;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TdTag;
import j2html.tags.specialized.TrTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.h3;
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
 * One row per pull request: the lines it adds, the types it adds no test for, and the four size and
 * complexity figures for the code it leaves behind.
 */
final class AuthorReview {

    SectionTag markup(final AuthorPullRequests author) {
        return section().withId("review").with(
                h2("What a reviewer is taking on"),
                p().withClass("lede").with(
                        span("Statements and comment lines are what each pull request adds to the files "
                                + "it touches. Code is counted in statements rather than lines, because "
                                + "a line count moves with the formatter and with the javadoc above the "
                                + "code; prose is counted in lines, which is what a javadoc is made of. "
                                + "A type counts as untested where the same pull request adds no class "
                                + "whose name "),
                        a("Maven Surefire").withHref("https://maven.apache.org/surefire/"
                                + "maven-surefire-plugin/test-mojo.html#includes"),
                        span(" would run as its test"),
                        Footnotes.marker(Footnotes.UNTESTED),
                        span(". The last four figures measure the code as the pull request leaves it: "
                                + "the most statements any one method carries, the highest "),
                        a("McCabe complexity").withHref("https://doi.org/10.1109/TSE.1976.233837"),
                        span(" any one method reaches, the deepest a block sits in blocks, and the most "
                                + "parameters any one method declares.")),
                h3("What it adds"),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"), th("Statements").withClass("number"),
                                th("Comment lines").withClass("number"),
                                th("Lines per statement").withClass("number"),
                                th("Types with no test").withClass("number"))),
                        tbody(each(author.pullRequests(), AuthorReview::added)))),
                h3("The code it leaves"),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"), th("Longest method").withClass("number"),
                                th("Highest complexity").withClass("number"),
                                th("Deepest nesting").withClass("number"),
                                th("Most parameters").withClass("number"))),
                        tbody(each(author.pullRequests(), AuthorReview::leaves)))));
    }

    private static TrTag added(final ExportedPullRequest pullRequest) {
        final Optional<ExportedWork.Written> written = AuthorPullRequests.writtenOf(pullRequest);
        return tr(td(String.valueOf(pullRequest.number())),
                Figure.counted(written.map(AuthorReview::statements)),
                Figure.counted(written.map(AuthorReview::comment)),
                Figure.shown(written.map(AuthorReview::density)),
                Figure.counted(written.map(diff -> diff.typesAddedWithoutATest().size())));
    }

    private static TrTag leaves(final ExportedPullRequest pullRequest) {
        final Optional<ExportedWork.Written> written = AuthorPullRequests.writtenOf(pullRequest);
        return tr(td(String.valueOf(pullRequest.number())),
                Figure.counted(written.map(diff -> diff.atHead().metrics().longestMethod())),
                Figure.counted(written.map(diff -> diff.atHead().metrics().highestComplexity())),
                Figure.counted(written.map(diff -> diff.atHead().metrics().deepestNesting())),
                Figure.counted(written.map(diff -> diff.atHead().metrics().mostParameters())));
    }

    private static int comment(final ExportedWork.Written written) {
        return written.atHead().commentLines() - written.atBase().commentLines();
    }

    private static int statements(final ExportedWork.Written written) {
        return written.atHead().metrics().statements() - written.atBase().metrics().statements();
    }

    /** How many lines of prose arrived per statement, and a dash where no statement did. */
    private static String density(final ExportedWork.Written written) {
        return statements(written) <= 0 ? Figure.ABSENT
                : String.format(Locale.ROOT, "%.2f", (double) comment(written) / statements(written));
    }

}
