package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import j2html.tags.specialized.BodyTag;

import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;
import static j2html.TagCreator.text;

/**
 * The domain-overlap page's markup, as typed tags.
 *
 * <p>Markup is never a string in a Java file, the stylesheet and the script are their own files carried
 * whole into the page, and the page carries no document wrapper — the same contract as
 * {@link VocabularyPage}, for the same reasons. The circles, the counts and the word lists are drawn by
 * the script from the data block, which is what {@link DomainOverlap} computed; nothing is computed here.
 */
public final class DomainVennPage {

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
                        h1().with(text("The domains of "), span().withClass("repository")),
                        p().withClass("lede").with(text("The three WordNet domains carrying the most of "
                                + "this repository's significant words, drawn as overlapping sets. A word "
                                + "belongs to every domain any of its senses states, so a word in an "
                                + "overlap is one whose senses span both domains. A word in bold states "
                                + "one domain across every labelled sense; the bold words are the anchor "
                                + "the mixed words are read beside, and a domain none of them states is "
                                + "counted below the picture rather than drawn. A word's size is its "
                                + "share of the divergence, as everywhere else in this reading.")),
                        div().withClass("figure"),
                        p().withClass("readout"),
                        div().withClass("overlaps"),
                        p().withClass("foot")),
                script().withType("application/json").withId("overlap").with(rawHtml(data)),
                script(rawHtml(behaviour)));
    }
}
