package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import j2html.tags.DomContent;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.LiTag;
import j2html.tags.specialized.SectionTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.iff;
import static j2html.TagCreator.li;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.section;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;
import static j2html.TagCreator.text;
import static j2html.TagCreator.ul;

/**
 * The control vocabularies' phrase matches as trees, one per control, each concept at its place in the
 * publisher's own hierarchy — the markup contract of {@link VocabularyPage}, with nothing computed here
 * and nothing drawn by script: the tree is markup because it is one.
 */
public final class ControlMatchesPage {

    private static final String FIBO_SPEC = "https://spec.edmcouncil.org/fibo/";
    private static final String FPML = "https://www.fpml.org/";
    private static final String BIAN_LANDSCAPE = "https://bian.org/servicelandscape/";

    private final String repository;
    private final List<ControlTree> trees;
    private final String stylesheet;

    public ControlMatchesPage(final String repository, final List<ControlTree> trees,
                              final String stylesheet) {
        this.repository = repository;
        this.trees = List.copyOf(trees);
        this.stylesheet = stylesheet;
    }

    public String markup() {
        return page().render();
    }

    private BodyTag page() {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1().with(text("The control matches of "),
                                span(repository).withClass("repository")),
                        p().withClass("nav").with(
                                a("words").withHref("vocabulary.html"), text(" · "),
                                a("domains").withHref("domain-venn.html"), text(" · "),
                                a("controls").withHref("control-matches.html"), text(" · "),
                                a("every repository").withHref("../index.html")),
                        p().withClass("lede").with(
                                text("Each out-of-domain control's phrases found in this repository's "
                                        + "declared names — "),
                                a("FIBO").withHref(FIBO_SPEC),
                                text(", "),
                                a("FpML").withHref(FPML),
                                text(" and the "),
                                a("BIAN Service Landscape").withHref(BIAN_LANDSCAPE),
                                text(" — drawn at their places in the publisher's own hierarchy. The "
                                        + "count beside a concept is how often the repository wrote the "
                                        + "phrase. Only phrases of two or more words are drawn: a "
                                        + "one-word label is everyday English more often than a term of "
                                        + "art, so the single-word matches are counted and not placed.")),
                        each(trees, ControlMatchesPage::treeOf)));
    }

    private static SectionTag treeOf(final ControlTree tree) {
        return section().withClass("control").with(
                h2(tree.vocabulary()),
                tree.roots().isEmpty()
                        ? p().withClass("silent").with(text("No phrase of this vocabulary appears in a "
                                + "declared name."))
                        : nested(tree.roots()),
                p().withClass("singles").with(text(String.format(Locale.ROOT,
                        "%,d single-word terms with %,d occurrences are counted and not drawn.",
                        tree.singleWordTerms(), tree.singleWordOccurrences()))));
    }

    private static DomContent nested(final List<ControlTree.Node> nodes) {
        return ul().withClass("tree").with(each(nodes, ControlMatchesPage::nodeOf));
    }

    private static LiTag nodeOf(final ControlTree.Node node) {
        return li().with(
                span(node.label()).withClass("concept"),
                iff(node.occurrences() > 0,
                        span(String.format(Locale.ROOT, "%,d", node.occurrences()))
                                .withClass("count")),
                iff(!node.children().isEmpty(), nested(node.children())));
    }
}
