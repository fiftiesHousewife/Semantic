package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

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
import static j2html.TagCreator.iff;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;

/**
 * Every published reading as one card: the strongest answer's claim first, then one mark per answer on a
 * scale shared across the cards. The claim is the answer to what the repository is about — a vocabulary
 * names the concept it places and where its publisher files it; a placement names the subject — and the
 * dictionary topics stay off the cards: a topic every code repository shares names the corpus, and a
 * sense-label argmax puts cricket on a trading engine.
 *
 * <p>Every answer is measured against its own chance figure, so a vocabulary barely past its bar sits
 * below a placement standing well apart rather than ahead of it by kind. The workings behind the figures
 * are stated once, in the page's own lede, and each card carries only its claims.
 */
public final class LandingPage {

    /** How many of the repository's own leading words a card shows; the full ranking is on its page. */
    private static final int OWN_WORDS = 6;

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
                        p().withClass("lede").withText("One card per repository: the strongest answer\u2019s claim, "
                                + "then every answer at its strength. A "
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
                p(lead(reading, ranked)).withClass("about"),
                iff(!reading.summary().leadingWords().isEmpty(),
                        p(ownWords(reading)).withClass("finding")),
                div().withClass("strengths").with(
                        each(ranked, strength -> mark(strength, widest))));
    }

    /**
     * The strongest answer's claim, whatever kind carried it: a vocabulary names the concept it places and
     * where its publisher files it, a placement names the subject with its multiple beside it, and a
     * reading nothing answered says so with the count judged.
     */
    private String lead(final ReadingExport reading, final List<AnswerStrengths.Strength> ranked) {
        final Optional<AnswerStrengths.Strength> top = ranked.stream().findFirst();
        if (top.isEmpty()) {
            return sentences.of(reading).getFirst();
        }
        if (AnswerStrengths.Strength.SCHEME.equals(top.get().kind())) {
            if (top.get().contenders() > 1) {
                return String.format(Locale.ROOT,
                        "No single subject: %s cannot separate %d subjects at its chance margin; %s is "
                                + "nominally nearest, %s.",
                        top.get().source(), top.get().contenders(),
                        PublishedSpelling.shown(top.get().subject()), top.get().label());
            }
            return String.format(Locale.ROOT, "About %s — placed there by %s, %s.",
                    PublishedSpelling.shown(top.get().subject()), top.get().source(),
                    top.get().label());
        }
        return reading.summary().answers().stream()
                .filter(answer -> top.get().source().equals(answer.source()))
                .findFirst()
                .map(answer -> sentences.cardClaim(reading, answer))
                .orElseGet(() -> sentences.of(reading).getFirst());
    }

    /**
     * The repository's own strongest words, asserted by nothing: a reader seeing {@code block, hash, gas,
     * transaction} concludes blockchain whether or not any citable vocabulary can say it, which is exactly
     * the case the refused candidates leave open.
     */
    private static String ownWords(final ReadingExport reading) {
        return "Writes most: " + reading.summary().leadingWords().stream()
                .limit(OWN_WORDS)
                .map(word -> PublishedSpelling.shown(word.word()))
                .collect(Collectors.joining(", ")) + ".";
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
