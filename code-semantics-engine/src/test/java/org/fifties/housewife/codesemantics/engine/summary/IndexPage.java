package org.fifties.housewife.codesemantics.engine.summary;

import j2html.tags.DomContent;

import static j2html.TagCreator.a;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.join;
import static j2html.TagCreator.li;
import static j2html.TagCreator.ol;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;
import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.title;

/**
 * The index over everything the self reading writes, in the order a reader should meet it.
 *
 * <p>Markup is a DSL of typed tags and never a string in a Java file, and the stylesheet is its own file —
 * the same discipline the theme and term pages keep, for the same reason: a page assembled this way cannot
 * emit unbalanced markup and a title is escaped by construction.
 */
final class IndexPage {

    private static final String STYLE = "/index.css";

    private static final String LEDE = "Two kinds of document sit in this folder and a reader cannot tell "
            + "them apart by looking. The summary prints what the reading showed; everything under it prints "
            + "what the reading measured. Each entry names the bar a row had to clear to be printed at all.";

    private static final String FOOT = "Regenerate all of it with ./gradlew selfRead. Every figure is a "
            + "reading of one commit of one working tree, and the corpus includes these reports.";

    String of(final ReadingIndex index) {
        return join(
                title("Reading — %s".formatted(index.repository())),
                styleWithInlineFile(STYLE),
                div(header(
                                p("Self-reading").withClass("eyebrow"),
                                h1(index.repository()),
                                p(LEDE).withClass("lede")),
                        ol(each(index.entries(), IndexPage::entry)),
                        p(FOOT).withClass("foot")).withClass("wrap"))
                .render();
    }

    private static DomContent entry(final ReadingIndex.Entry entry) {
        return li(a(entry.title()).withHref(entry.file()),
                p(entry.answers()).withClass("answers"),
                p(span("What it takes to be printed: ").withClass("label"), span(entry.bar()))
                        .withClass("bar"));
    }
}
