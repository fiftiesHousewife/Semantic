package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import io.github.fiftieshousewife.codesemantics.lexicon.ChangeShape;
import io.github.fiftieshousewife.codesemantics.lexicon.ChangeShapes;
import j2html.tags.DomContent;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TrTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.code;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.section;
import static j2html.TagCreator.style;
import static j2html.TagCreator.span;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;

/**
 * Every measured change shape and the Conventional Commits type it falls under, as the bundled mapping
 * states them — the shapes that name nothing included, each with the reason beside it.
 *
 * <p>It is one page for every report to link rather than a section each of them repeats: the mapping is
 * the same whoever's pull requests are being read, and a reader following the footnote wants it once.
 */
public final class ChangeShapeTable {

    /** The page every report's footnote links to for the mapping. */
    public static final String FILE = "change-shapes.html";

    private static final String TITLE = "How a measured shape becomes a word";

    private static final String NOTHING = "nothing";

    private final ChangeShapes shapes = ChangeShapes.fromClasspath();

    /** The whole page, written once beside the reports that link it. */
    public String markup(final String stylesheet) {
        return PageDocument.of(TITLE, body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        header().withClass("fold").with(
                                p().withClass("nav").with(a("← every reading")
                                        .withHref("readings.html")),
                                h1(TITLE)),
                        mapping())).render());
    }

    /** The mapping itself; the page's own title names it, so the section repeats no heading. */
    private SectionTag mapping() {
        return section().withId("shapes").withClass("headless").with(
                p().withClass("lede").with(
                        span("Every shape a reading can measure, in the order the rules are applied: "
                                + "the first shape a change has is the one used. The definition is "
                                + "quoted from "),
                        a("Conventional Commits")
                                .withHref("https://www.conventionalcommits.org/en/v1.0.0/"),
                        span(" beside the measurement it is taken to cover, so the pairing can be read "
                                + "one against the other. A shape under no definition names nothing, "
                                + "and the reason stands beside it.")),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("A change that"), th("Is a"), th("Because the standard defines it as"))),
                        tbody(each(shapes.shapes(), ChangeShapeTable::row)))));
    }

    private static TrTag row(final ChangeShape shape) {
        return tr(td(shape.measurement()), td().with(word(shape)),
                td(shape.isNamed() ? shape.definition() : shape.note()));
    }

    private static DomContent word(final ChangeShape shape) {
        return shape.isNamed() ? code(shape.type()) : span(NOTHING).withClass("silent");
    }
}
