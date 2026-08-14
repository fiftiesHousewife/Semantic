package org.fifties.housewife.codesemantics.engine.summary;

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
                each(step.reports(), WalkthroughPage::report));
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
