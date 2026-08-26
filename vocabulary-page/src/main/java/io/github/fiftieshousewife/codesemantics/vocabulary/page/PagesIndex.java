package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import j2html.tags.specialized.BodyTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.li;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.style;
import static j2html.TagCreator.text;
import static j2html.TagCreator.ul;

/**
 * One page naming every repository the pages were drawn for, with the three views of each — the same
 * markup contract as the pages it links.
 */
public final class PagesIndex {

    private final String stylesheet;

    public PagesIndex(final String stylesheet) {
        this.stylesheet = stylesheet;
    }

    public String markup(final List<String> repositories) {
        return page(repositories).render();
    }

    private BodyTag page(final List<String> repositories) {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1("The repositories read"),
                        p().withClass("lede").with(text("Each repository has three views of one "
                                + "population: its significant words by pipeline stage, the domains "
                                + "their senses state, and the control vocabularies' phrase matches "
                                + "in the publishers' own hierarchies.")),
                        ul().withClass("repositories").with(
                                each(repositories, repository -> li(
                                        text(repository + " — "),
                                        a("words").withHref(repository + "/vocabulary.html"),
                                        text(" · "),
                                        a("domains").withHref(repository + "/domain-venn.html"),
                                        text(" · "),
                                        a("controls").withHref(repository + "/control-matches.html"))))));
    }
}
