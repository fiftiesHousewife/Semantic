package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import j2html.tags.DomContent;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.TrTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.text;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;

/**
 * Every published reading, one row each, stating what it is about and nothing more.
 *
 * <p><b>One answer, not an inventory.</b> Every earlier form of this page listed every vocabulary that
 * cleared, the phrases each matched and both subject schemes beside them, and left the reader to decide
 * which to believe — which is the defect the export itself was fixed for. The reading now names the most
 * specific evidence that stood above chance, and this draws that: what kind of thing answered, which
 * publisher, and what that publisher says the repository is.
 *
 * <p>The subject schemes appear only where no vocabulary answered. A scheme places quickfixj under
 * <em>Wireless Networks and Protocols</em> while FIX stands at ten times its own bar, and showing both
 * would be putting a weaker answer beside a stronger one as though a reader should weigh them.
 */
public final class ReadingsPage {

    private static final String NONE = "—";

    private final String stylesheet;

    public ReadingsPage(final String stylesheet) {
        this.stylesheet = stylesheet;
    }

    public String markup(final List<ReadingRow> readings, final StatedAreas stated) {
        return PageDocument.of("The readings", page(readings, stated).render());
    }

    private BodyTag page(final List<ReadingRow> readings, final StatedAreas stated) {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1("The readings"),
                        p().withClass("lede").with(text("One row per published reading, answering from the "
                                + "most specific evidence that stands above chance. A vocabulary's terms "
                                + "of more than one word answer first, then its one-word terms, then a "
                                + "subject scheme — and a reading answered by a scheme is one whose "
                                + "vocabularies said nothing.")),
                        table().withClass("readings").with(head(),
                                tbody(each(readings, row -> row(row, stated))))));
    }

    private static DomContent head() {
        return thead(tr(th("repository"), th("source type"), th("source"), th("placed under"),
                th("result"), th("λ"), th("stated area")));
    }

    private TrTag row(final ReadingRow reading, final StatedAreas stated) {
        final ExportedAnswer answer = reading.answer();
        return tr(
                td(a(reading.repository()).withHref(reading.repository() + "/vocabulary.html")),
                td(span(answer.sourceType()).withClass(kindOf(answer))),
                td(source(answer)),
                td(placedUnder(answer)),
                td(result(answer)).withClass("result"),
                td(share(reading.lambda())),
                td(area(reading, stated)));
    }

    private static String kindOf(final ExportedAnswer answer) {
        return answer.sourceType().replace(' ', '-');
    }

    private static DomContent source(final ExportedAnswer answer) {
        return answer.source().isBlank()
                ? span(NONE).withClass("silent")
                : span(answer.source()).withTitle(answer.qualifiedBy());
    }

    /** Where the publisher places what answered. A definition read without it has no field around it. */
    private static DomContent placedUnder(final ExportedAnswer answer) {
        return answer.placedUnder().isBlank()
                ? span(NONE).withClass("silent")
                : span(answer.placedUnder());
    }

    private static DomContent result(final ExportedAnswer answer) {
        return answer.result().isBlank()
                ? span(answer.qualifiedBy()).withClass("silent")
                : span(answer.result());
    }

    private static DomContent area(final ReadingRow reading, final StatedAreas stated) {
        return reading.statedArea()
                .map(area -> span(area).withClass(
                        stated.reached(reading.repository(), reading.subjects()) ? "reached" : "missed"))
                .map(DomContent.class::cast)
                .orElseGet(() -> span(NONE).withClass("silent")
                        .withTitle("no manifest states an area for this repository"));
    }

    private static String share(final double share) {
        return String.format(Locale.ROOT, "%.1f%%", share * 100.0);
    }
}
