package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import io.github.fiftieshousewife.codesemantics.engine.export.MeasuredCode;
import j2html.tags.DomContent;
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
 * What a reviewer is taking on: what each pull request adds, and how the code it leaves is spread.
 *
 * <p>The spread reads down rather than across, because a figure means nothing on its own. The repository's
 * own column is the reference — a method carrying sixty statements says one thing where the repository's
 * worst carries sixty-two and another where it carries two hundred — and it is the repository's own
 * practice rather than a number chosen here.
 */
final class AuthorReview {

    /** One measured quantity, and how to reach it on either side. */
    private record Measure(String name, Function<MeasuredCode.Metrics, MeasuredCode.Spread> of) {
    }

    private static final String COMPLEXITY = "Complexity per method";

    private static final List<Measure> MEASURES = List.of(
            new Measure("Statements per method", MeasuredCode.Metrics::methodStatements),
            new Measure(COMPLEXITY, MeasuredCode.Metrics::complexity),
            new Measure("Nesting per method", MeasuredCode.Metrics::nesting),
            new Measure("Parameters per method", MeasuredCode.Metrics::parameters));

    SectionTag markup(final AuthorPullRequests author) {
        return section().withId("review").with(
                h2("What a reviewer is taking on"),
                added(author),
                spread(author));
    }

    private SectionTag added(final AuthorPullRequests author) {
        return section().withClass("headless").with(
                p().withClass("lede").with(
                        span("Statements and comment lines are what each pull request adds to the files "
                                + "it touches. Code is counted in statements because a line count moves "
                                + "with the formatter; prose keeps lines, and a licence header standing "
                                + "in every file counts once. A type counts as untested where the same "
                                + "pull request adds no class whose name "),
                        a("Maven Surefire").withHref("https://maven.apache.org/surefire/"
                                + "maven-surefire-plugin/test-mojo.html#includes"),
                        span(" would run as its test"),
                        Footnotes.marker(Footnotes.UNTESTED),
                        span(". The last column counts the methods it adds carrying the "),
                        span("Test").withClass("token"),
                        span(" annotation"),
                        Footnotes.marker(Footnotes.TEST_METHODS),
                        span(".")),
                h3("What it adds"),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"), th("Statements").withClass("number"),
                                th("Comment lines").withClass("number"),
                                th("Types with no test").withClass("number"),
                                th("Test methods added").withClass("number"))),
                        tbody(each(author.pullRequests(), AuthorReview::addedRow)))));
    }

    /** The spread down the page, each pull request a column, the repository the last of them. */
    private SectionTag spread(final AuthorPullRequests author) {
        return section().withClass("headless").with(
                p().withClass("lede").with(
                        span("The code each pull request leaves, at the middle of its methods, three "
                                + "quarters of the way up them, and at its worst. The last column is the "
                                + "repository itself, and a figure is unusual only against that — "
                                + "nothing below is measured against a threshold chosen by this "
                                + "reading. "),
                        a("McCabe").withHref("https://doi.org/10.1109/TSE.1976.233837"),
                        span(", whose complexity this is, proposes ten as the limit for one module, so "
                                + "a complexity is read against that limit as well as against this "
                                + "repository.")),
                p().withClass("legend").with(each(List.of(MetricBand.values()), AuthorReview::key)),
                h3("The code it leaves"),
                div().withClass("scrolls").with(table().withClass("work banded").with(
                        thead(tr(th("Measure"),
                                each(author.pullRequests(),
                                        pullRequest -> th(String.valueOf(pullRequest.number()))
                                                .withClass("number")),
                                th(author.repository()).withClass("number reference"))),
                        tbody(each(MEASURES, measure -> spreadRows(author, measure))))));
    }

    private static DomContent spreadRows(final AuthorPullRequests author,
                                                     final Measure measure) {
        return each(List.of("median", "upper quartile", "worst"),
                at -> spreadRow(author, measure, at));
    }

    private static TrTag spreadRow(final AuthorPullRequests author, final Measure measure,
                                   final String at) {
        final MeasuredCode.Spread reference = measure.of().apply(author.repositoryCode().metrics());
        return tr(td(String.format(Locale.ROOT, "%s, %s", measure.name(), at)),
                each(author.pullRequests(), pullRequest -> marked(
                        PullRequestWork.written(pullRequest)
                                .map(diff -> at(measure.of().apply(diff.atHead().metrics()), at)),
                        measure, reference)),
                Figure.counted(Optional.of(at(reference, at))).withClass("number reference"));
    }

    /** One band's mark and what it stands for, which is what the marks in the table are read by. */
    private static DomContent key(final MetricBand band) {
        return span().withClass("key").with(
                span(band.mark()).withClass("mark").attr("data-band", named(band)),
                span(" " + band.shown()));
    }

    /**
     * The figure with where it sits in the repository's own spread, marked by a shape and said in words.
     * The mark differs in outline between the three bands, so a reader seeing no colour reads it too.
     */
    private static TdTag marked(final Optional<Integer> figure, final Measure measure,
                                final MeasuredCode.Spread reference) {
        final TdTag cell = Figure.counted(figure);
        return figure.map(reached -> band(measure, reached, reference))
                .map(band -> cell.withClass("number band")
                        .attr("data-band", named(band))
                        .withTitle(band.shown())
                        .with(span(band.mark()).withClass("mark")))
                .orElse(cell);
    }

    private static String named(final MetricBand band) {
        return band.name().toLowerCase(Locale.ROOT);
    }

    /** Complexity answers to McCabe's own limit as well as to the repository's spread. */
    private static MetricBand band(final Measure measure, final int figure,
                                   final MeasuredCode.Spread reference) {
        return COMPLEXITY.equals(measure.name()) ? MetricBand.ofComplexity(figure, reference)
                : MetricBand.of(figure, reference);
    }

    private static int at(final MeasuredCode.Spread spread, final String at) {
        if ("median".equals(at)) {
            return spread.median();
        }
        return "upper quartile".equals(at) ? spread.upperQuartile() : spread.highest();
    }

    private static TrTag addedRow(final ExportedPullRequest pullRequest) {
        final Optional<ChangedCode> written = PullRequestWork.written(pullRequest);
        return tr(PullRequestLink.cell(pullRequest),
                Figure.counted(written.map(AuthorReview::statements)),
                Figure.counted(written.map(AuthorReview::comment)),
                Figure.counted(written.map(diff -> diff.typesAddedWithoutATest().size())),
                Figure.counted(written.map(ChangedCode::testMethodsAdded)));
    }

    private static int comment(final ChangedCode written) {
        return written.atHead().commentLines() - written.atBase().commentLines();
    }

    private static int statements(final ChangedCode written) {
        return written.atHead().metrics().statements() - written.atBase().metrics().statements();
    }
}
