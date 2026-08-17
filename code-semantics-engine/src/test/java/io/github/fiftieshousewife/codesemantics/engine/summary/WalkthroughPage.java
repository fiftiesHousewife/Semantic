package io.github.fiftieshousewife.codesemantics.engine.summary;

import j2html.tags.DomContent;

import static j2html.TagCreator.a;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.header;
import static j2html.TagCreator.img;
import static j2html.TagCreator.join;
import static j2html.TagCreator.li;
import static j2html.TagCreator.ol;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;
import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.title;

/**
 * The walkthrough as a page: one step per section, in the order the analysis runs them.
 *
 * <p>Markup is a DSL of typed tags and never a string in a Java file, and the stylesheet is its own file —
 * the same discipline the theme and term pages keep. The chart is referenced as a file rather than inlined,
 * so the one the run wrote is the one the page shows.
 */
final class WalkthroughPage {

    private static final String STYLE = "/index.css";

    String of(final ReadingWalkthrough walkthrough) {
        return join(
                title("Reading — %s".formatted(walkthrough.repository())),
                styleWithInlineFile(STYLE),
                div(header(
                                p("Self-reading").withClass("eyebrow"),
                                h1(walkthrough.repository()),
                                p(WalkthroughProse.LEDE).withClass("lede")),
                        ol(each(walkthrough.steps(), WalkthroughPage::step)),
                        p(WalkthroughProse.FOOT).withClass("foot")).withClass("wrap"))
                .render();
    }

    private static DomContent step(final ReadingWalkthrough.Step step) {
        return li(h2(step.title()),
                p(step.what()).withClass("what"),
                each(step.picture().stream().toList(), WalkthroughPage::chart),
                each(step.found().stream().toList(), found -> p(found).withClass("found")),
                each(step.table().stream().toList(), WalkthroughPage::found),
                each(step.reports(), WalkthroughPage::report));
    }

    /** A finding with columns. The heading row is what lets a reader find one scope without reading all of them. */
    private static DomContent found(final ReadingWalkthrough.Found rows) {
        return table(thead(tr(each(rows.headings(), heading -> th(heading)))),
                tbody(each(rows.rows(), row -> tr(each(row, cell -> td(cell))))))
                .withClass("found-table");
    }

    private static DomContent chart(final String file) {
        return img().withSrc(file).withAlt(ReadingWalkthrough.CHART_DESCRIPTION).withClass("chart");
    }

    private static DomContent report(final ReadingIndex.Entry entry) {
        return p(a(entry.title()).withHref(entry.file()),
                span(" — %s. ".formatted(entry.answers())),
                span("What it takes to be printed: %s.".formatted(entry.bar())).withClass("bar"))
                .withClass("report");
    }
}
