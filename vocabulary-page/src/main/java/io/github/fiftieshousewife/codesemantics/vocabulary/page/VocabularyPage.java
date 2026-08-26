package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import j2html.tags.specialized.BodyTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.details;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;
import static j2html.TagCreator.summary;
import static j2html.TagCreator.text;

/**
 * The vocabulary page's markup, as typed tags: the funnel of the export's own rules, then one cloud of
 * the meanings that survive them.
 *
 * <p>Markup is never a string in a Java file: a page assembled from tags cannot leave an element unclosed
 * or a word unescaped, and a repository's own words are exactly the text that must not be trusted to a
 * concatenation. The stylesheet and the script are their own files, carried whole into the page, and the
 * page carries no document wrapper. The rows and the tiles are drawn by the script from the data block,
 * which is what {@link VocabularyFunnel} computed; nothing is computed here.
 */
public final class VocabularyPage {

    private static final String WORDNET = "https://wordnet.princeton.edu/";
    private static final String DIVERGENCE = "https://ieeexplore.ieee.org/document/61115";

    private final String data;
    private final String stylesheet;
    private final String behaviour;

    public VocabularyPage(final String data, final String stylesheet, final String behaviour) {
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
                        h1().with(text("The words of "), span().withClass("repository")),
                        p().withClass("nav").with(
                                a("words").withHref("vocabulary.html"), text(" · "),
                                a("domains").withHref("domain-venn.html"), text(" · "),
                                a("controls").withHref("control-matches.html"), text(" · "),
                                a("every repository").withHref("../index.html")),
                        p().withClass("lede").with(
                                text("Every rule between the declared names and the export's signals, "
                                        + "one row per rule with what it leaves. A word survives by its "
                                        + "term of the "),
                                a("Jensen–Shannon divergence").withHref(DIVERGENCE),
                                text(" against the reference scoring it lowest — written more densely "
                                        + "here than ordinary English and a corpus of a hundred Java "
                                        + "repositories write it, by more than chance reaches. The two "
                                        + "merges at the end remove nothing: two spellings with one "
                                        + "dictionary form count once, and two words whose commonest "),
                                a("sense").withHref(WORDNET),
                                text(" is one synset share a tile. A tile's size is its claim in bits "
                                        + "and its weight is how far that stands outside chance, both "
                                        + "logarithmic; a coloured mark names one of the three leading "
                                        + "domains, drawn as circles on the domains page.")),
                        details().isOpen().with(
                                summary("The funnel: every rule between the names and the tiles — click "
                                        + "a row for its own population"),
                                div().withClass("funnel")),
                        div().withClass("cloud"),
                        p().withClass("readout"),
                        p().withClass("foot")),
                script().withType("application/json").withId("vocabulary").with(rawHtml(data)),
                script(rawHtml(behaviour)));
    }
}
