package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import j2html.tags.DomContent;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TrTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
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
 * Every term match of every reading, one line each: what the repository wrote, what its publisher calls
 * it, how often, what the two were reduced to before being compared, and what the reading did with it.
 *
 * <p>It is a table because it is one — a list of rows a reader sorts through to check a description, with
 * nothing to compute and no geometry to place. The readings page states what a repository is about; this
 * states every match that statement rests on, including the ones the reading set aside.
 */
public final class MatchesPage {

    private static final String PUBLISHED = "REPORTED";

    private final Map<String, List<DrawnMatch>> byRepository;

    private final String stylesheet;

    public MatchesPage(final Map<String, List<DrawnMatch>> byRepository, final String stylesheet) {
        this.byRepository = Map.copyOf(byRepository);
        this.stylesheet = stylesheet;
    }

    public String markup() {
        return PageDocument.of("Every term match", page().render());
    }

    private BodyTag page() {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1("Every term match"),
                        p().withClass("nav").with(a("the readings").withHref("readings.html")),
                        p().withClass("lede").with(text("Every term of more than one word a repository "
                                + "wrote that a bundled vocabulary publishes, whether or not the reading "
                                + "went on to publish it. A one-word term is everyday English more often "
                                + "than a term of art and is left out. The standing beside a vocabulary "
                                + "is how many of its terms the repository writes against how many the "
                                + "best of a field of seven reaches by dealing that publisher's own "
                                + "words at random: it belongs to the vocabulary and not to any one "
                                + "match, because the count is taken over the whole of it.")),
                        each(byRepository.keySet().stream().sorted().toList(), this::sectionOf)));
    }

    private SectionTag sectionOf(final String repository) {
        final List<DrawnMatch> matches = byRepository.get(repository);
        return j2html.TagCreator.section().withId("r-" + repository).with(
                h2().with(a(repository).withHref(repository + "/vocabulary.html")),
                p().withClass("held").with(text(String.format(Locale.ROOT,
                        "%,d terms of more than one word matched, %,d of them published.",
                        matches.size(),
                        matches.stream().filter(match -> PUBLISHED.equals(match.outcome())).count()))),
                table().withClass("matches").with(head(), tbody(each(matches, MatchesPage::row))));
    }

    private static DomContent head() {
        return thead(tr(th("written"), th("what the publisher calls it"), th("vocabulary"),
                th("times written"), th("matched on"), th("what the reading did"),
                th("that vocabulary against chance")));
    }

    private static TrTag row(final DrawnMatch match) {
        return tr(td(span(match.term()).withClass("term")),
                td(text(String.join(", ", match.concepts()))),
                td(span(match.vocabulary()).withClass(publisher(match.vocabulary()))),
                td(String.format(Locale.ROOT, "%,d", match.occurrences())).withClass("count"),
                td(match.matchedOn()).withClass("on"),
                td(span(outcome(match)).withCondClass(!PUBLISHED.equals(match.outcome()), "silent")),
                td(standing(match)).withClass("count"));
    }

    /** What the reading did, in words rather than in the name of a constant. */
    private static String outcome(final DrawnMatch match) {
        return PUBLISHED.equals(match.outcome())
                ? "published"
                : match.outcome().toLowerCase(Locale.ROOT).replace('_', ' ');
    }

    private static String standing(final DrawnMatch match) {
        return match.phrases() == 0
                ? "—"
                : String.format(Locale.ROOT, "%,d against %,d", match.phrases(), match.byChance());
    }

    private static String publisher(final String vocabulary) {
        return "v-" + vocabulary.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }
}
