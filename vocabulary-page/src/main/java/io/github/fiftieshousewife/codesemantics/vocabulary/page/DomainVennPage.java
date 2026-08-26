package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import j2html.tags.specialized.BodyTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.li;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;
import static j2html.TagCreator.text;
import static j2html.TagCreator.ul;

/**
 * The domain-overlap page's markup, as typed tags.
 *
 * <p>Markup is never a string in a Java file, the stylesheet and the script are their own files carried
 * whole into the page, and the page carries no document wrapper — the same contract as
 * {@link VocabularyPage}, for the same reasons. The circles, the counts and the word lists are drawn by
 * the script from the data block, which is what {@link DomainOverlap} computed; nothing is computed here.
 *
 * <p>The reader picks the domain source above the figure — each bundled source's overlaps are in the
 * data block, computed from one published reading.
 *
 * <p>The heading, the lede and the figure share one viewport height, so the picture is on screen whole
 * before anything scrolls; the word lists and the method follow below it.
 */
public final class DomainVennPage {

    private static final String WORDNET_DOMAINS = "https://wndomains.fbk.eu/";
    private static final String WORDNET = "https://wordnet.princeton.edu/";
    private static final String ARXIV_TAXONOMY = "https://arxiv.org/category_taxonomy";
    private static final String OPENALEX_TOPICS = "https://docs.openalex.org/api-entities/topics";
    private static final String TAGGED_COUNTS = "https://wordnet.princeton.edu/documentation/cntlist5wn";
    private static final String DIVERGENCE = "https://ieeexplore.ieee.org/document/61115";

    private final String data;
    private final String stylesheet;
    private final String behaviour;

    public DomainVennPage(final String data, final String stylesheet, final String behaviour) {
        this.data = data;
        this.stylesheet = stylesheet;
        this.behaviour = behaviour;
    }

    public String markup() {
        return page().render();
    }

    private BodyTag page() {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        div().withClass("fold").with(
                                h1().with(text("The domains of "), span().withClass("repository")),
                                p().withClass("nav").with(
                                a("words").withHref("vocabulary.html"), text(" · "),
                                a("domains").withHref("domain-venn.html"), text(" · "),
                                a("every repository").withHref("../index.html")),
                                p().withClass("lede").with(
                                        text("The three domains carrying the most of this repository's "
                                                + "significant words, drawn as overlapping sets under the "
                                                + "source chosen above the figure. Under the "),
                                        a("WordNet domains").withHref(WORDNET_DOMAINS),
                                        text(" sources a word sits in every domain any of its "),
                                        a("senses").withHref(WORDNET),
                                        text(" states; under "),
                                        a("arXiv").withHref(ARXIV_TAXONOMY),
                                        text(" it sits in every category whose published description "
                                                + "carries the word, and under "),
                                        a("OpenAlex").withHref(OPENALEX_TOPICS),
                                        text(" in every subfield holding a topic whose keywords carry "
                                                + "it. Either way, an overlap holds the words placed in "
                                                + "both of its domains.")),
                                p().withClass("sources"),
                                div().withClass("figure")),
                        p().withClass("readout"),
                        div().withClass("overlaps"),
                        ul().withClass("method").with(
                                li().with(text("A word's weight is its term of the "),
                                        a("Jensen–Shannon divergence").withHref(DIVERGENCE),
                                        text(" between this repository's words and the reference scoring "
                                                + "it lowest, in bits, and its drawn size follows that "
                                                + "weight.")),
                                li().with(text("The weight divides over the word's senses by the counts "),
                                        a("WordNet's tagged corpus").withHref(TAGGED_COUNTS),
                                        text(" publishes. An uncounted sense holds 0.5, and a sense "
                                                + "carrying several labels counts once per label.")),
                                li().with(text("Under the arXiv and OpenAlex sources a sense is one "
                                        + "described subject whose subject-matter account carries the "
                                        + "word, at its written form or its dictionary base form, "
                                        + "labelled with the category or subfield the publisher states "
                                        + "that subject in. No subject carries a count, so every such "
                                        + "sense holds 0.5.")),
                                li().with(text("The share on senses with no domain label contributes no "
                                        + "evidence; the line below states how much that is.")),
                                li().with(text("Bold marks a word whose every labelled sense states one "
                                        + "domain.")),
                                li().with(text("A circle's area is its domain's share of the divided "
                                        + "weight, above a smallest readable radius, and two circles "
                                        + "overlap only where at least one word sits in both.")),
                                li().with(text("A count opens its overlap's words, and a word opens its "
                                        + "place in the vocabulary."))),
                        p().withClass("foot")),
                script().withType("application/json").withId("overlap").with(rawHtml(data)),
                script(rawHtml(behaviour)));
    }
}
