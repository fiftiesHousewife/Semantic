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

    /** Enough phrases to see what a vocabulary matched on; the rest are in the reading it was drawn from. */
    private static final int PHRASES_SHOWN = 4;

    private final String stylesheet;

    public ReadingsPage(final String stylesheet) {
        this.stylesheet = stylesheet;
    }

    public String markup(final List<ReadingRow> readings, final StatedAreas stated) {
        return PageDocument.of("The readings", page(readings, stated).render());
    }

    /**
     * The subject schemes the readings themselves place under, in the order they state them.
     *
     * <p>Naming them here would be this page deciding which schemes a reading has. Which are bundled is a
     * question the library answers and is under review — a scheme dropped would leave a column headed for
     * it and empty, and one added would not be drawn at all.
     */
    private static List<String> schemes(final List<ReadingRow> readings) {
        return readings.stream()
                .flatMap(reading -> reading.placedIn().stream())
                .map(ExportedPlacement::scheme)
                .distinct()
                .toList();
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
                                head(schemes(readings)),
                                tbody(each(readings, row -> row(row, schemes(readings), stated))))));
    }

    /**
     * Two headers, because the columns beneath them are two different kinds of claim and a reader reading
     * across the row would otherwise take them for one.
     *
     * <p>A term vocabulary publishes identifiers and a repository in its field declares them, so a match is
     * the publisher stating that this is a term of its field. A subject scheme publishes prose — nobody
     * declares {@code ManageEnterpriseRisk} — so it is diverged against rather than matched, and the answer
     * is which subject's own description this repository's vocabulary sits nearest to.
     */
    private static DomContent head(final List<String> schemes) {
        return thead(
                tr(th(""),
                        th("matched against published terms").withColspan("3"),
                        th("placed among published subjects").withColspan(String.valueOf(schemes.size())),
                        th("").withColspan("2")).withClass("kinds"),
                tr(th("repository"), th("vocabularies above their bar"), th("the phrases it wrote"),
                        th("about"))
                        .with(each(schemes, scheme -> th(scheme)))
                        .with(th("λ"), th("stated area")));
    }

    private TrTag row(final ReadingRow reading, final List<String> schemes, final StatedAreas stated) {
        return tr(
                td(a(reading.repository()).withHref(reading.repository() + "/vocabulary.html")),
                td(vocabularies(reading)).withClass("vocabularies"),
                td(phrases(reading)).withClass("phrases"),
                td(String.join(", ", reading.about())))
                .with(each(schemes, scheme -> td(placement(reading, scheme))))
                .with(td(share(reading.lambda())), td(area(reading, stated)));
    }

    /** Every vocabulary the reading published, each with its phrase count and the bar it beat. */
    private static DomContent vocabularies(final ReadingRow reading) {
        if (reading.vocabularies().isEmpty()) {
            return span(NONE).withClass("silent")
                    .withTitle("no bundled vocabulary's phrase count beat what a deal of its own "
                            + "words reaches");
        }
        return div().with(each(reading.vocabularies(), one -> div(named(one))));
    }

    /**
     * The terms of more than one word the repository wrote, most-written first.
     *
     * <p>The single-word matches are not drawn. A one-word term is the everyday English any repository
     * hits and a run of several is what one outside the field does not write by accident, which is why the
     * bar beside it is computed over the phrases alone.
     */
    private static DomContent phrases(final ReadingRow reading) {
        final List<ReadingRow.Phrase> written = reading.phrases();
        if (written.isEmpty()) {
            return span(NONE).withClass("silent")
                    .withTitle("no published term of more than one word survived");
        }
        return div().with(
                div().withClass("terms").with(each(written.stream().limit(PHRASES_SHOWN).toList(),
                        phrase -> span(phrase.term() + " ×" + phrase.occurrences())
                                .withClass("term")
                                .withTitle(phrase.vocabulary() + " places it under "
                                        + phrase.placedUnder()))),
                written.size() > PHRASES_SHOWN
                        ? span("and " + (written.size() - PHRASES_SHOWN) + " more").withClass("silent")
                        : span());
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

    /**
     * One scheme's two levels, the finer first, and only where the scheme separated the repository from
     * chance.
     *
     * <p><b>A subject the scheme could not separate from chance is not drawn.</b> The vocabularies beside
     * it appear only where they beat their own bar, and a page applying a bar to one kind of claim and
     * printing the other whatever it says is a page with two standards on it. A subject printed with a
     * parenthetical beside it is still a subject a reader takes at face value, so the cell states that the
     * scheme could not separate this repository and names the subject only in the title, where it is
     * available to somebody looking for it and not to somebody reading down the column.
     */
    private static DomContent placement(final ReadingRow reading, final String scheme) {
        return reading.placedIn().stream()
                .filter(placed -> placed.scheme().equals(scheme))
                .findFirst()
                .map(placed -> div(level(placed.category()), level(placed.archive())))
                .map(DomContent.class::cast)
                .orElseGet(() -> span(NONE).withClass("silent"));
    }

    private static DomContent level(final ExportedPlacement.Level placed) {
        return placed.standsApartFromChance()
                ? div(placed.subject())
                : div(NONE).withClass("silent")
                        .withTitle("the nearest subject was " + placed.subject() + ", and the scheme "
                                + "could not separate this repository from a scheme of chance");
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
