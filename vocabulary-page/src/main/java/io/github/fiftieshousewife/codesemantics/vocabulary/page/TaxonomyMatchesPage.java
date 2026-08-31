package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.ToIntFunction;

import j2html.tags.DomContent;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.DivTag;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TableTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.button;
import static j2html.TagCreator.details;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.section;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;
import static j2html.TagCreator.summary;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.text;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;

/**
 * Every reading's reported term matches per vocabulary as one bar of shares per reading — phrases and
 * single words as separate bars, occurrences and distinct terms as the reader's choice of measure. Each
 * segment links to the vocabulary's tree in that reading, and each reading to its phrase overlap, so a
 * comparison drills down to the evidence behind it.
 */
public final class TaxonomyMatchesPage {

    /** The measures the page offers, in the order the buttons stand. */
    private static final List<String> MEASURES = List.of("occurrences", "distinct terms");

    private final PublisherLinks publishers = PublisherLinks.all();

    private final List<TaxonomyMatchesCommand.RepositoryMatches> rows;
    private final List<String> vocabularies;
    private final String stylesheet;
    private final String behaviour;

    public TaxonomyMatchesPage(final List<TaxonomyMatchesCommand.RepositoryMatches> rows,
                               final List<String> vocabularies, final String stylesheet,
                               final String behaviour) {
        this.rows = List.copyOf(rows);
        this.vocabularies = List.copyOf(vocabularies);
        this.stylesheet = stylesheet;
        this.behaviour = behaviour;
    }

    public String markup() {
        return PageDocument.of("Matches per vocabulary", page().render());
    }

    private BodyTag page() {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1("Matches per vocabulary"),
                        p().withClass("nav").with(
                                a("every reading").withHref("readings.html")),
                        p().withClass("lede").with(text("Each reading's reported term matches as one "
                                + "bar per kind of term, each vocabulary's share of the reading's "
                                + "matches as a segment. Phrases — terms of two or more words — stand "
                                + "apart from single words because a phrase is what a repository "
                                + "outside a field does not write by accident, where a one-word label "
                                + "is everyday English any repository hits. A segment opens the "
                                + "vocabulary's tree in that reading; a reading's name opens its "
                                + "phrase overlap.")),
                        div().withClass("sources").with(
                                each(MEASURES, measure -> button(measure)
                                        .withType("button")
                                        .withData("measure", measure)
                                        .withCondClass(measure.equals(MEASURES.getFirst()), "chosen"))),
                        legend(),
                        p().withClass("readout").with(text("Rest on a segment for its figures.")),
                        each(MEASURES, this::measured),
                        details().withClass("figures").with(
                                summary("The figures"),
                                figures()),
                        script(rawHtml(behaviour))));
    }

    private DivTag legend() {
        return div().withClass("legend").with(
                each(vocabularies, vocabulary -> span().withClass("key").with(
                        span().withClass("chip " + slug(vocabulary)),
                        named(vocabulary))));
    }

    /** The vocabulary's name, linked to where its publisher publishes it where that is known. */
    private DomContent named(final String vocabulary) {
        return publishers.of(vocabulary)
                .map(href -> (DomContent) a(vocabulary).withHref(href))
                .orElseGet(() -> text(vocabulary));
    }

    /** All readings under one measure, shown one block at a time by the buttons above. */
    private SectionTag measured(final String measure) {
        return section()
                .withClass("measure")
                .withData("measure", measure)
                .withCondClass(measure.equals(MEASURES.getFirst()), "measure chosen")
                .with(each(rows, row -> reading(row, measure)));
    }

    private DivTag reading(final TaxonomyMatchesCommand.RepositoryMatches row, final String measure) {
        return div().withClass("reading").with(
                h2().with(a(row.repository())
                        .withClass("repository")
                        .withHref(row.repository() + "/domain-venn.html#s-Phrase matches")),
                bar(row, measure, "phrases",
                        counts -> measure.equals(MEASURES.getFirst())
                                ? counts.phraseOccurrences() : counts.phraseTerms()),
                bar(row, measure, "single words",
                        counts -> measure.equals(MEASURES.getFirst())
                                ? counts.singleWordOccurrences() : counts.singleWordTerms()));
    }

    private DivTag bar(final TaxonomyMatchesCommand.RepositoryMatches row, final String measure,
                       final String kind, final ToIntFunction<VocabularyMatchCounts> value) {
        final int whole = row.counts().stream().mapToInt(value).sum();
        if (whole == 0) {
            return div().withClass("row").with(
                    span(kind).withClass("kind"),
                    span("no reported match").withClass("silent"));
        }
        final VocabularyMatchCounts leading = row.counts().stream()
                .max(Comparator.comparingInt(value))
                .orElseThrow();
        return div().withClass("row").with(
                span(kind).withClass("kind"),
                div().withClass("bar").with(
                        each(row.counts().stream().filter(counts -> value.applyAsInt(counts) > 0).toList(),
                                counts -> segment(row.repository(), counts, measure, kind,
                                        value.applyAsInt(counts), whole))),
                span().withClass("held").with(
                        text(String.format(Locale.ROOT, "%,d · ", whole)),
                        text(String.format(Locale.ROOT, "%s %.0f%%", leading.vocabulary(),
                                100.0 * value.applyAsInt(leading) / whole))));
    }

    private DomContent segment(final String repository, final VocabularyMatchCounts counts,
                               final String measure, final String kind, final int value,
                               final int whole) {
        final double share = 100.0 * value / whole;
        final String figures = String.format(Locale.ROOT,
                "%s — %,d %s %s, %.1f%% of what %s reports",
                counts.vocabulary(), value, kind.equals("phrases") ? "phrase" : "single-word",
                measure.equals(MEASURES.getFirst()) ? "occurrences" : "terms", share, repository);
        return a().withClasses("seg", slug(counts.vocabulary()))
                .withHref(repository + "/term-trees.html#" + counts.vocabulary())
                .withStyle(String.format(Locale.ROOT, "width:%.2f%%", share))
                .withTitle(figures)
                .withData("figures", figures);
    }

    private TableTag figures() {
        return table(
                thead(tr(
                        th("repository"), th("vocabulary"),
                        th("phrase terms"), th("phrase occurrences"),
                        th("single-word terms"), th("single-word occurrences"))),
                tbody(each(rows, row ->
                        each(row.counts().stream()
                                        .filter(counts -> counts.phraseOccurrences() > 0
                                                || counts.singleWordOccurrences() > 0)
                                        .toList(),
                                counts -> tr(
                                        td(row.repository()), td(counts.vocabulary()),
                                        figure(counts.phraseTerms()),
                                        figure(counts.phraseOccurrences()),
                                        figure(counts.singleWordTerms()),
                                        figure(counts.singleWordOccurrences()))))));
    }

    private static DomContent figure(final int value) {
        return td(String.format(Locale.ROOT, "%,d", value)).withClass("figure");
    }

    /** The vocabulary's name as a CSS class, letters only and lower case. */
    static String slug(final String vocabulary) {
        return "v-" + vocabulary.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }
}
