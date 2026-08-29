package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import j2html.tags.DomContent;
import j2html.tags.specialized.TdTag;
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

    private final PublisherLinks publishers = PublisherLinks.all();

    /** A full stop and the space after it, which is where a sentence ends and an abbreviation does not. */
    private static final String SENTENCE_END = ". ";

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
                        p().withClass("lede").with(text("One row per source that cleared the bar of the "
                                + "rung answering a reading, ranked by how far it cleared it. A "
                                + "vocabulary's terms of more than one word answer first, then its "
                                + "one-word terms, then every subject scheme level standing apart from "
                                + "chance — and a reading answered by a scheme is one whose vocabularies "
                                + "said nothing.")),
                        table().withClass("readings").with(head(),
                                tbody(each(readings, row -> each(rows(row, stated), line -> line))))));
    }

    private static DomContent head() {
        return thead(tr(th("repository"), th("source type"), th("source"), th("placed under"),
                th("result"), th("λ"), th("stated area")));
    }

    /**
     * One line per answer. The cells describing the reading rather than one of its answers are written on
     * the first line and span the rest, so a reader sees one repository however many sources answered it.
     */
    private List<TrTag> rows(final ReadingRow reading, final StatedAreas stated) {
        final List<ExportedAnswer> answers = reading.answers();
        return IntStream.range(0, answers.size())
                .mapToObj(rank -> row(reading, answers.get(rank), rank, answers.size(), stated))
                .toList();
    }

    private TrTag row(final ReadingRow reading, final ExportedAnswer answer, final int rank,
                      final int answers, final StatedAreas stated) {
        return tr(Stream.of(
                        repository(reading, rank, answers),
                        Stream.of(td(span(answer.sourceType()).withClass(kindOf(answer))),
                                td(source(answer)),
                                td(placedUnder(answer)),
                                td(result(answer)).withClass("result")),
                        readingWide(reading, rank, answers, stated))
                .flatMap(cells -> cells)
                .toArray(DomContent[]::new));
    }

    /** The repository's own cell, written once and spanning its answers. */
    private static Stream<DomContent> repository(final ReadingRow reading, final int rank,
                                                 final int answers) {
        return rank > 0 ? Stream.of()
                : Stream.of(spanning(td(a(reading.repository())
                        .withHref(reading.repository() + "/vocabulary.html")), answers));
    }

    /** The figures that belong to the reading and not to one answer, written once and spanning its answers. */
    private Stream<DomContent> readingWide(final ReadingRow reading, final int rank, final int answers,
                                           final StatedAreas stated) {
        return rank > 0 ? Stream.of()
                : Stream.of(spanning(td(share(reading.lambda())), answers),
                        spanning(td(area(reading, stated)), answers));
    }

    private static DomContent spanning(final TdTag cell, final int answers) {
        return answers > 1 ? cell.attr("rowspan", answers) : cell;
    }

    private static String kindOf(final ExportedAnswer answer) {
        return answer.sourceType().replace(' ', '-');
    }

    /**
     * The publisher, linked to where it publishes. The link's text is the publisher's own name, and a
     * source neither enumeration states is written without one rather than pointed somewhere guessed at.
     */
    private DomContent source(final ExportedAnswer answer) {
        if (answer.source().isBlank()) {
            return span(NONE).withClass("silent");
        }
        return publishers.of(answer.source())
                .map(href -> (DomContent) a(answer.source()).withHref(href)
                        .withTitle(answer.qualifiedBy()))
                .orElseGet(() -> span(answer.source()).withTitle(answer.qualifiedBy()));
    }

    /** Where the publisher places what answered. A definition read without it has no field around it. */
    private static DomContent placedUnder(final ExportedAnswer answer) {
        return answer.placedUnder().isBlank()
                ? span(NONE).withClass("silent")
                : span(answer.placedUnder());
    }

    /**
     * What the publisher says, to its first sentence, with the whole of it on the cell.
     *
     * <p>A publisher writes as much as it likes: OLiA's {@code BaseForm} runs to a paragraph on English
     * tagsets and cites two sources inside it. The reading carries all of it, because a definition is
     * evidence and truncating evidence loses it; a table shows the sentence that says what the thing is.
     */
    private static DomContent result(final ExportedAnswer answer) {
        return answer.result().isBlank()
                ? span(answer.qualifiedBy()).withClass("silent")
                : span(firstSentenceOf(answer.result())).withTitle(answer.result());
    }

    private static String firstSentenceOf(final String stated) {
        final int stop = stated.indexOf(SENTENCE_END);
        return stop < 0 || stop + 2 >= stated.length()
                ? stated : stated.substring(0, stop + 1);
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
