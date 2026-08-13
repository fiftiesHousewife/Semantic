package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import j2html.tags.DomContent;

import static j2html.TagCreator.dd;
import static j2html.TagCreator.div;
import static j2html.TagCreator.dl;
import static j2html.TagCreator.dt;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.header;
import static j2html.TagCreator.join;
import static j2html.TagCreator.p;
import static j2html.TagCreator.section;
import static j2html.TagCreator.span;
import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.title;

/**
 * The term reading as a page.
 *
 * <p>It draws {@link TermGraph} and computes nothing of its own beyond geometry, so the picture and the
 * report cannot disagree. The markup is a DSL of typed tags — a page assembled this way cannot emit
 * unbalanced markup, and a site's text is escaped by construction rather than by anyone remembering to.
 */
final class TermPage {

    private static final String STYLE = "/terms.css";

    String of(final TermGraph graph) {
        return join(
                title("Terms — %s".formatted(graph.repository())),
                styleWithInlineFile(STYLE),
                div(masthead(graph),
                        lengthSection(graph),
                        branchSection(graph),
                        unplacedSection(graph),
                        p(TermProse.FOOT).withClass("foot")).withClass("wrap"))
                .render();
    }

    private DomContent masthead(final TermGraph graph) {
        return header(
                p("Self-reading · %s · %s · matched on %s"
                        .formatted(graph.repository(), graph.source(), graph.rung())).withClass("eyebrow"),
                h1(TermProse.HEADING),
                p(TermProse.LEDE).withClass("lede"),
                statistics(graph),
                p(TermProse.LIMITS).withClass("limits"));
    }

    private DomContent statistics(final TermGraph graph) {
        return dl(figure("Spans matched", count(graph.spans())),
                figure("Declared names read", count(graph.names())),
                figure("Per thousand names", String.format(Locale.ROOT, "%.1f",
                        1000.0 * graph.spans() / graph.names())),
                figure("Distinct terms", count(graph.distinctTerms())),
                figure("Files matching", "%s of %s".formatted(count(graph.filesMatched()),
                        count(graph.filesRead()))))
                .withClass("stats");
    }

    private DomContent lengthSection(final TermGraph graph) {
        return section(heading(TermProse.LENGTH_HEADING, TermProse.LENGTH),
                div(each(graph.spansByLength().entrySet(), entry -> segment(entry, graph.spans())))
                        .withClass("split"),
                div(each(graph.spansByLength().entrySet(), entry -> key(entry, graph.spans())))
                        .withClass("legend"));
    }

    private static DomContent segment(final Map.Entry<Integer, Integer> length, final int spans) {
        return span().withClass("split-part split-part-%d".formatted(Math.min(length.getKey(), 2)))
                .withStyle("width:%s%%".formatted(share(length.getValue(), spans)));
    }

    private static DomContent key(final Map.Entry<Integer, Integer> length, final int spans) {
        return span(span().withClass("swatch swatch-%d".formatted(Math.min(length.getKey(), 2))),
                span("%d word%s — %s spans, %s%%".formatted(length.getKey(),
                        length.getKey() == 1 ? "" : "s", count(length.getValue()),
                        share(length.getValue(), spans))))
                .withClass("key");
    }

    private DomContent branchSection(final TermGraph graph) {
        final List<TermGraph.Branch> stated = graph.stated();
        return section(heading(TermProse.BRANCH_HEADING, TermProse.BRANCH),
                p(TermProse.BRANCH_FINDING).withClass("finding"),
                new TermTree(graph.heaviestMatch()).branches(stated));
    }

    private DomContent unplacedSection(final TermGraph graph) {
        return section(heading(TermProse.UNPLACED_HEADING, TermProse.UNPLACED),
                new TermTree(graph.heaviestMatch()).branches(graph.unplaced()));
    }

    private DomContent heading(final String heading, final String explaining) {
        return div(h2(heading), p(explaining).withClass("note")).withClass("section-head");
    }

    private DomContent figure(final String naming, final String reads) {
        return div(dt(naming), dd(reads)).withClass("stat");
    }

    private static String share(final int part, final int whole) {
        return String.format(Locale.ROOT, "%.1f", 100.0 * part / whole);
    }

    private static String count(final int figure) {
        return String.format(Locale.ROOT, "%,d", figure);
    }
}
