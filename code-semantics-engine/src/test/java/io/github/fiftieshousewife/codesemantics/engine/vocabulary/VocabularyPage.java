package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import j2html.tags.specialized.BodyTag;

import static j2html.TagCreator.body;
import static j2html.TagCreator.code;
import static j2html.TagCreator.div;
import static j2html.TagCreator.dl;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.span;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.style;
import static j2html.TagCreator.text;

/**
 * The vocabulary page's markup, as typed tags.
 *
 * <p>Markup is never a string in a Java file: a page assembled from tags cannot leave an element unclosed or
 * a word unescaped, and a repository's own words are exactly the text that must not be trusted to a
 * concatenation. The stylesheet and the script are their own files, authored and edited as CSS and as
 * JavaScript, and are carried into the page rather than written here — a language embedded in a Java string
 * is unreadable to every tool that understands it. The page carries no document wrapper, so whatever
 * renders it supplies one.
 *
 * <p>The stages are drawn by the script from the data block this writes, which is what the pipeline
 * returned. Nothing is computed here and no stage is named here: the pipeline states its own stages, and a
 * page restating them would be a second place for them to be wrong.
 */
public final class VocabularyPage {

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
                        p().withClass("lede").with(
                                text("The reading narrows a repository's words in stages, and each "
                                        + "stage runs on what the one before it left. Use Next stage to "
                                        + "move through them. A word's size is how far this repository "
                                        + "departs from what it is read against, in bits, and its colour "
                                        + "and weight are how far that stands outside chance. Both scales "
                                        + "are logarithmic, so a step in either is a multiple rather than "
                                        + "an amount: the strongest claim on a stage is some hundreds of "
                                        + "times the weakest, and a scale that spent size evenly over that "
                                        + "range left seven words in ten the same size. Every word drawn "
                                        + "stands outside what a repository of this size would have "
                                        + "reached by chance; nothing else is drawn, and how many that is "
                                        + "is not a number chosen here. The stages are stated by "),
                                code("WordPipeline"), text(".")),
                        dl().withClass("summary"),
                        div().withClass("stages"),
                        p().withClass("foot").withText("The last stage merges rather than removes: two "
                                + "spellings becoming one word is not a word being taken out, so its "
                                + "count of times written does not fall. A word every reference writes as "
                                + "densely as this repository does departs from nothing and so has no size "
                                + "to draw.")),
                script().withType("application/json").withId("vocabulary").with(rawHtml(data)),
                script(rawHtml(behaviour)));
    }

}
