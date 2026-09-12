package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import j2html.tags.specialized.ArticleTag;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.DivTag;
import j2html.tags.specialized.PTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.article;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.iff;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;

/**
 * Every published reading as one card, and the answer before the evidence: what the repository is about —
 * its topics and the subject placement standing apart from chance — then the strongest vocabulary's claim,
 * then one mark per answer on a scale shared across the cards.
 *
 * <p>Every answer is measured against its own chance figure, so a vocabulary barely past its bar sits
 * below a placement standing well apart rather than ahead of it by kind. The workings behind the figures
 * are stated once, in the page's own lede, and each card carries only its claims.
 */
public final class LandingPage {

    private final String stylesheet;

    private final FindingSentences sentences = new FindingSentences();

    private final AnswerStrengths strengths = new AnswerStrengths();

    public LandingPage(final String stylesheet) {
        this.stylesheet = stylesheet;
    }

    public String markup(final List<ReadingExport> readings) {
        final double widest = readings.stream()
                .flatMap(reading -> strengths.of(reading).stream())
                .mapToDouble(AnswerStrengths.Strength::ratio)
                .filter(ratio -> ratio > 1.0)
                .max()
                .orElse(1.0);
        return PageDocument.of("The readings", page(readings, widest).render());
    }

    private BodyTag page(final List<ReadingExport> readings, final double widest) {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1("The readings"),
                        p().withClass("lede").withText("One card per repository: what it is about, "
                                + "then the strongest claim, then every answer at its strength. A "
                                + "vocabulary’s multiple is its phrase count against the best a deal "
                                + "of its own words reaches; a placement’s is how much nearer its "
                                + "subject stands than the nearest subject of a scheme built by "
                                + "shuffling the real descriptions. A card’s name links to the page "
                                + "holding the words, the domains and the placements behind it."),
                        each(ordered(readings), reading -> card(reading, widest))));
    }

    /** The furthest-from-chance readings first, whatever kind carried each; nothing-answered last. */
    private List<ReadingExport> ordered(final List<ReadingExport> readings) {
        return readings.stream()
                .sorted(Comparator.comparingDouble(this::strongestRatio).reversed())
                .toList();
    }

    private double strongestRatio(final ReadingExport reading) {
        return strengths.strongest(reading)
                .map(AnswerStrengths.Strength::ratio)
                .orElse(0.0);
    }

    private ArticleTag card(final ReadingExport reading, final double widest) {
        final List<AnswerStrengths.Strength> ranked = strengths.of(reading);
        return article().withClass("card").with(
                h2().with(a(reading.summary().repository())
                        .withHref(reading.summary().repository() + "/reading.html")),
                p(sentences.about(reading, ranked)).withClass("about"),
                iff(claim(reading), claimed -> p(claimed).withClass("finding")),
                div().withClass("strengths").with(
                        each(ranked, strength -> mark(strength, widest))));
    }

    /**
     * The strongest vocabulary's claim, where one answered. A placement needs no second sentence — the
     * about line already states it — and a reading nothing answered states that in its one sentence.
     */
    private Optional<String> claim(final ReadingExport reading) {
        final Optional<ExportedAnswer> vocabulary = reading.summary().answers().stream()
                .filter(answer -> answer.timesItsBar() != null)
                .findFirst();
        if (vocabulary.isPresent()) {
            return Optional.of(sentences.cardClaim(reading, vocabulary.get()));
        }
        if (ExportedAnswer.NOTHING.equals(reading.summary().answers().getFirst().sourceType())) {
            return Optional.of(sentences.of(reading).getFirst());
        }
        return Optional.empty();
    }

    private static DivTag mark(final AnswerStrengths.Strength strength, final double widest) {
        final DivTag drawn = div().withClass("strength " + strength.kind()).with(
                span(strength.source()).withClass("source"));
        final double share = barShare(strength.ratio(), widest);
        if (share > 0.0) {
            drawn.with(div().withClass("bar")
                    .withStyle(String.format(Locale.ROOT, "width:%.1f%%", share)));
        }
        return drawn.with(span(strength.label()).withClass("value"));
    }

    /** The mark's share of the scale: logarithmic from the chance figure itself to the widest drawn. */
    private static double barShare(final double ratio, final double widest) {
        if (ratio <= 1.0 || widest <= 1.0) {
            return 0.0;
        }
        return 100.0 * Math.log(ratio) / Math.log(widest);
    }
}
