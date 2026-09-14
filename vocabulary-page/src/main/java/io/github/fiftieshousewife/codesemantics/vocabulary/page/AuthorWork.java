package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TrTag;

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

/** One row per pull request: what each of the three sources calls the change. */
final class AuthorWork {

    SectionTag markup(final AuthorPullRequests author) {
        return section().withId("work").with(
                h2("What kind of change each one is"),
                p().withClass("lede").with(
                        span("Conventional Commits\u2019 grammar parses the author\u2019s own statement "
                                + "and names the type it states. The parse counts what the change adds "
                                + "and removes, and the bundled mapping names the type whose published "
                                + "definition covers those counts"),
                        Footnotes.marker(Footnotes.CONVENTION),
                        span(". Jira\u2019s issue types stay as Jira writes them: a Bug is reported as a "
                                + "Bug and is never rewritten as one of the standard\u2019s words.")),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"), th("Type from its statement"),
                                th("Type from its declarations"), th("Shape measured"),
                                th("Type from the tracker"))),
                        tbody(each(author.pullRequests(), AuthorWork::row)))));
    }

    private static TrTag row(final ExportedPullRequest pullRequest) {
        return tr(PullRequestLink.cell(pullRequest), td(statedClass(pullRequest)),
                td(inferredWord(pullRequest)), td(shape(pullRequest)), td(trackerType(pullRequest)));
    }

    private static String statedClass(final ExportedPullRequest pullRequest) {
        return PullRequestWork.of(pullRequest)
                .map(work -> work.stated().classes().stream()
                        .map(ExportedWork.StatedClass::type)
                        .collect(Collectors.joining(", ")))
                .filter(stated -> !stated.isEmpty())
                .orElse(Figure.ABSENT);
    }

    /** The word a standard's definition covers this change's shape with, where one does. */
    private static String inferredWord(final ExportedPullRequest pullRequest) {
        return PullRequestWork.inferred(pullRequest)
                .map(ExportedWork.Inferred::type)
                .orElse(Figure.ABSENT);
    }

    /** The shape that definition covers, so the word can be checked against what was measured. */
    private static String shape(final ExportedPullRequest pullRequest) {
        return PullRequestWork.inferred(pullRequest)
                .map(ExportedWork.Inferred::shape)
                .map(shape -> "it " + shape)
                .orElse(Figure.ABSENT);
    }

    private static String trackerType(final ExportedPullRequest pullRequest) {
        return PullRequestWork.of(pullRequest)
                .map(work -> work.issues().stream()
                        .map(issue -> String.format(Locale.ROOT, "%s (%s)", issue.type(), issue.key()))
                        .collect(Collectors.joining(", ")))
                .filter(stated -> !stated.isEmpty())
                .orElse(Figure.ABSENT);
    }

    /** Every type each pull request introduces, listed where it introduces any. */
    static List<String> typesAdded(final ExportedPullRequest pullRequest) {
        return PullRequestWork.written(pullRequest)
                .map(ChangedCode::typesAdded)
                .orElse(List.of())
                .stream()
                .map(ChangedCode.NamedDeclaration::name)
                .toList();
    }
}
