package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import j2html.tags.specialized.ArticleTag;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.DivTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.article;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;

/**
 * Every published reading as one card: the repository, its strongest finding as a sentence, and one mark
 * per answering source on a scale shared across the cards. The cards are ordered by the kind of evidence
 * that answered and then by its strength, so the strongest findings read first and a reading nothing
 * answered reads last, saying so.
 *
 * <p>A vocabulary's strength is a multiple of its permutation bar and a scheme's is a distance in bits;
 * the two are different quantities, so their marks carry different classes and units and share no scale.
 */
public final class LandingPage {

    private final String stylesheet;

    private final FindingSentences sentences = new FindingSentences();

    public LandingPage(final String stylesheet) {
        this.stylesheet = stylesheet;
    }

    public String markup(final List<ReadingExport> readings) {
        final double widestBar = readings.stream()
                .flatMap(reading -> reading.summary().answers().stream())
                .map(ExportedAnswer::timesItsBar)
                .filter(times -> times != null && times > 1.0)
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(1.0);
        return PageDocument.of("The readings", page(readings, widestBar).render());
    }

    private BodyTag page(final List<ReadingExport> readings, final double widestBar) {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1("The readings"),
                        p().withClass("lede").withText("One card per repository: what its declared "
                                + "names state, said by the publishers whose phrases it writes, "
                                + "strongest first. A card’s page holds the words, the domains, the "
                                + "matched phrases and the placements behind its sentence."),
                        each(ordered(readings), reading -> card(reading, widestBar))));
    }

    /** Vocabulary-answered readings first by their best bar multiple, then schemes by bits, then nothing. */
    private static List<ReadingExport> ordered(final List<ReadingExport> readings) {
        return readings.stream()
                .sorted(Comparator.comparingDouble(LandingPage::strengthOf).reversed())
                .toList();
    }

    private static double strengthOf(final ReadingExport reading) {
        return reading.summary().answers().stream()
                .mapToDouble(LandingPage::rankOf)
                .max()
                .orElse(0.0);
    }

    /** Kinds rank apart — any vocabulary answer above any scheme's — and strength ranks inside a kind. */
    private static double rankOf(final ExportedAnswer answer) {
        if (answer.timesItsBar() != null) {
            return 1_000.0 + answer.timesItsBar();
        }
        return answer.bitsPastChance() == null ? 0.0 : answer.bitsPastChance();
    }

    private ArticleTag card(final ReadingExport reading, final double widestBar) {
        return article().withClass("card").with(
                h2().with(a(reading.summary().repository())
                        .withHref(reading.summary().repository() + "/reading.html")),
                p(sentences.of(reading).getFirst()).withClass("finding"),
                div().withClass("strengths").with(
                        each(reading.summary().answers().stream()
                                        .filter(answer -> !ExportedAnswer.NOTHING
                                                .equals(answer.sourceType()))
                                        .toList(),
                                answer -> strength(answer, widestBar))));
    }

    private static DivTag strength(final ExportedAnswer answer, final double widestBar) {
        return answer.timesItsBar() != null
                ? mark("vocabulary", answer.source(), barShare(answer.timesItsBar(), widestBar),
                        String.format(Locale.ROOT, "%.1f× its chance bar", answer.timesItsBar()))
                : mark("scheme", answer.source(), 0.0,
                        String.format(Locale.ROOT, "%.3f bits nearer than chance",
                                answer.bitsPastChance()));
    }

    /** The mark's share of the scale: logarithmic from the bar itself to the widest clearance drawn. */
    private static double barShare(final double timesItsBar, final double widestBar) {
        if (timesItsBar <= 1.0 || widestBar <= 1.0) {
            return 0.0;
        }
        return 100.0 * Math.log(timesItsBar) / Math.log(widestBar);
    }

    private static DivTag mark(final String kind, final String source, final double share,
                               final String value) {
        final DivTag drawn = div().withClass("strength " + kind).with(
                span(source).withClass("source"));
        if (share > 0.0) {
            drawn.with(div().withClass("bar")
                    .withStyle(String.format(Locale.ROOT, "width:%.1f%%", share)));
        }
        return drawn.with(span(value).withClass("value"));
    }
}
