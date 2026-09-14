package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceKind;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TdTag;
import j2html.tags.specialized.TrTag;

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
 * How much each pull request changes, as two tables: the files it touches, and the declarations it
 * changes in them. They are two tables because they are counted in two units, and a column of files
 * beside a column of declarations reads as one row of comparable figures when it is not.
 */
final class AuthorScale {

    SectionTag markup(final AuthorPullRequests author) {
        return section().withId("scale").with(
                h2("How much each one changes"),
                p().withClass("lede").withText("A file’s kind is where the build looks for it. New "
                        + "recounts those the base does not hold, and a fixture is counted by its name "
                        + "alone."),
                h3("Files it touches"),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"),
                                th().withClass("number").with(span("Changed"),
                                        Footnotes.marker(Footnotes.OUTSIDE_THE_BUILD)),
                                th("Production").withClass("number"), th("Tests").withClass("number"),
                                th("Fixtures").withClass("number"), th("Docs").withClass("number"),
                                th("Build").withClass("number"), th("New").withClass("number"))),
                        tbody(each(author.pullRequests(), AuthorScale::files)))),
                p().withClass("lede").withText("A declaration is a type, a method or a field. Removed "
                        + "sums the three. Untouched is what the pull request leaves standing in those "
                        + "same files, which is the size of what it changes inside."),
                h3("Declarations it changes"),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"), th("Types added").withClass("number"),
                                th("Methods added").withClass("number"),
                                th("Fields added").withClass("number"),
                                th("Removed").withClass("number"),
                                th("Untouched").withClass("number"))),
                        tbody(each(author.pullRequests(), AuthorScale::declarations)))));
    }

    private static TrTag files(final ExportedPullRequest pullRequest) {
        final Optional<ExportedWork.Written> written = PullRequestWork.written(pullRequest);
        return tr(PullRequestLink.cell(pullRequest),
                Figure.counted(Optional.of(pullRequest.files())),
                kind(written, SourceKind.PRODUCTION), kind(written, SourceKind.TESTS),
                kind(written, SourceKind.FIXTURES), kind(written, SourceKind.DOCUMENTATION),
                kind(written, SourceKind.BUILD),
                Figure.counted(written.map(ExportedWork.Written::filesAdded)));
    }

    private static TrTag declarations(final ExportedPullRequest pullRequest) {
        final Optional<ExportedWork.Written> written = PullRequestWork.written(pullRequest);
        return tr(PullRequestLink.cell(pullRequest),
                Figure.counted(written.map(diff -> diff.added().types())),
                Figure.counted(written.map(diff -> diff.added().methods())),
                Figure.counted(written.map(diff -> diff.added().fields())),
                Figure.counted(written.map(diff -> diff.removed().total())),
                Figure.counted(written.map(ExportedWork.Written::kept)));
    }

    private static TdTag kind(final Optional<ExportedWork.Written> written, final SourceKind kind) {
        return Figure.counted(written.map(diff -> diff.filesByKind().stream()
                .filter(files -> kind.published().equals(files.kind()))
                .mapToInt(ExportedWork.KindFiles::files)
                .sum()));
    }

}
