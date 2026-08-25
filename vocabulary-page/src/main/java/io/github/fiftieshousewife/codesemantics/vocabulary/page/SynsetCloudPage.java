package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import j2html.tags.specialized.BodyTag;

import static j2html.TagCreator.a;
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
 * The synset cloud's markup, as typed tags — the same contract as {@link VocabularyPage}: markup is never
 * a string in a Java file, the stylesheet and the script are their own files carried whole into the page,
 * and the page carries no document wrapper. Nothing is computed here; the script draws what
 * {@link SynsetCloud} computed from the data block.
 */
public final class SynsetCloudPage {

    private final String data;
    private final String stylesheet;
    private final String behaviour;

    public SynsetCloudPage(final String data, final String stylesheet, final String behaviour) {
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
                        h1().with(text("The meanings of "), span().withClass("repository")),
                        p().withClass("lede").with(text("The significant words gathered under the "),
                                a("WordNet").withHref("https://wordnet.princeton.edu/"),
                                text(" senses they are most often written in. One tile is one meaning: "
                                        + "two words the dictionary reads alike share a tile, weighed by "
                                        + "their weights summed. A tile opens its words in the "
                                        + "vocabulary, and resting on one names its part of speech and "
                                        + "the domains its sense carries.")),
                        div().withClass("cloud"),
                        p().withClass("readout"),
                        p().withClass("foot")),
                script().withType("application/json").withId("synsets").with(rawHtml(data)),
                script(rawHtml(behaviour)));
    }
}
