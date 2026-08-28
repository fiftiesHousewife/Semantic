package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
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
 * Every published reading in one table: what it is about, which vocabulary beat its own chance bar, where
 * each scheme places it, and the area somebody outside this project states for it.
 *
 * <p>The last two columns are the point of the page. A reading and its expected area side by side is the
 * difference between a picture of what the library said and a picture of whether it was right, and no
 * page before this one carried the second.
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
                        p().withClass("lede").with(text("One row per published reading. A vocabulary is "
                                + "named only where the repository wrote more of its phrases than a deal "
                                + "of that vocabulary's own words reaches; a placement is marked where "
                                + "the repository stands further from every subject of a scheme of chance "
                                + "than from this one.")),
                        table().withClass("readings").with(
                                head(), tbody(each(readings, row -> row(row, stated))))));
    }

    private static DomContent head() {
        return thead(tr(
                th("repository"), th("about"), th("its published terms"),
                th("arXiv"), th("OpenAlex"), th("λ"), th("stated area")));
    }

    private TrTag row(final ReadingRow reading, final StatedAreas stated) {
        return tr(
                td(a(reading.repository()).withHref(reading.repository() + "/reading.html")),
                td(String.join(", ", reading.about())),
                td(vocabulary(reading)),
                td(placement(reading, "arXiv")),
                td(placement(reading, "OpenAlex")),
                td(share(reading.lambda())),
                td(area(reading, stated)));
    }

    /** The vocabulary that beat its bar by the most, with the count and the bar it beat. */
    private static DomContent vocabulary(final ReadingRow reading) {
        return reading.answering()
                .map(ReadingsPage::named)
                .orElseGet(() -> span(NONE).withClass("silent")
                        .withTitle("no bundled vocabulary's phrase count beat what a deal of its own "
                                + "words reaches"));
    }

    /**
     * <b>A bar of zero is not a multiple.</b> Where the deals reach nothing at the quantile the field
     * sets, any single match clears, and {@code timesTheBar} answers with the count itself — so a
     * vocabulary matched once on a bar of zero would read as standing at exactly its bar. It is stated as
     * the count against nothing instead, and marked, because the two cases are not the same evidence.
     */
    private static DomContent named(final ExportedTaxonomy answering) {
        final ExportedTaxonomy.Bar bar = answering.bar();
        final String stated = bar.chanceExpectedBest() == 0
                ? String.format(Locale.ROOT, "%s %d, no bar", answering.vocabulary(), bar.phrases())
                : String.format(Locale.ROOT, "%s %.1f×", answering.vocabulary(), bar.timesTheBar());
        return span(stated)
                .withClass(bar.chanceExpectedBest() == 0 ? "unbarred" : "barred")
                .withTitle(String.format(Locale.ROOT, "%d phrases against %d a deal of its own words "
                        + "reaches, over a field of %d", bar.phrases(), bar.chanceExpectedBest(),
                        bar.field()));
    }

    /** One scheme's two levels, the finer first, each marked where it stands apart from chance. */
    private static DomContent placement(final ReadingRow reading, final String scheme) {
        return reading.placedIn().stream()
                .filter(placed -> placed.scheme().equals(scheme))
                .findFirst()
                .map(placed -> span(level(placed.category()) + " · " + level(placed.archive())))
                .map(DomContent.class::cast)
                .orElseGet(() -> span(NONE).withClass("silent"));
    }

    private static String level(final ExportedPlacement.Level placed) {
        return placed.standsApartFromChance() ? placed.subject() : placed.subject() + " (within chance)";
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
