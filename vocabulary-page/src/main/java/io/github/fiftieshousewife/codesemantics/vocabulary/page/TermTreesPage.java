package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import j2html.tags.DomContent;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.LiTag;
import j2html.tags.specialized.SectionTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.details;
import static j2html.TagCreator.summary;
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
 * Every matched vocabulary's phrases as trees, one per vocabulary, each concept at its place in the
 * publisher's own hierarchy with the unmatched remainder greyed beside it — the markup contract of
 * {@link VocabularyPage}, with nothing computed here and nothing drawn by script: the tree is markup
 * because it is one.
 */
public final class TermTreesPage {

    private static final String OLIA = "https://github.com/acoli-repo/olia";
    private static final String CSO = "https://cso.kmi.open.ac.uk/";
    private static final String FIBO_SPEC = "https://spec.edmcouncil.org/fibo/";
    private static final String FPML = "https://www.fpml.org/";
    private static final String FIX_ORCHESTRA = "https://www.fixtrading.org/standards/fix-orchestra/";
    private static final String CWE = "https://cwe.mitre.org/";
    private static final String BIAN_LANDSCAPE = "https://bian.org/servicelandscape/";

    private final String repository;
    private final List<TermTree> trees;
    private final String stylesheet;

    public TermTreesPage(final String repository, final List<TermTree> trees,
                              final String stylesheet) {
        this.repository = repository;
        this.trees = List.copyOf(trees);
        this.stylesheet = stylesheet;
    }

    public String markup() {
        return PageDocument.of("The term trees of " + repository, page().render());
    }

    private BodyTag page() {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1().with(text("The term trees of "),
                                span(repository).withClass("repository")),
                        p().withClass("nav").with(
                                a("words").withHref("vocabulary.html"), text(" · "),
                                a("domains").withHref("domain-venn.html"), text(" · "),
                                a("trees").withHref("term-trees.html"), text(" · "),
                                a("every repository").withHref("../index.html")),
                        p().withClass("lede").with(
                                text("Each matched vocabulary's phrases found in this repository's "
                                        + "declared names — "),
                                a("OLiA").withHref(OLIA),
                                text(", "),
                                a("CSO").withHref(CSO),
                                text(", "),
                                a("FIBO").withHref(FIBO_SPEC),
                                text(", "),
                                a("FpML").withHref(FPML),
                                text(", "),
                                a("FIX").withHref(FIX_ORCHESTRA),
                                text(", "),
                                a("CWE").withHref(CWE),
                                text(" and the "),
                                a("BIAN Service Landscape").withHref(BIAN_LANDSCAPE),
                                text(" — drawn at their places in the publisher's own hierarchy. The "
                                        + "count beside a concept is how often the repository wrote the "
                                        + "phrase; a greyed concept is one the publisher states at the "
                                        + "same place and the repository writes nowhere, with the count "
                                        + "of concepts below it. Only phrases of two or more words are "
                                        + "drawn as matches: a one-word label is everyday English more "
                                        + "often than a term of art, so the single-word matches are "
                                        + "counted and not placed.")),
                        ul().withClass("ranking").with(each(trees, TermTreesPage::ranked)),
                        each(trees, TermTreesPage::treeOf)));
    }

    /** One vocabulary's standing: its phrase evidence, linking to its tree. */
    private static LiTag ranked(final TermTree tree) {
        if (tree.phraseTerms() == 0) {
            return li().withClass("silent-rank").with(
                    a(tree.vocabulary()).withHref("#" + tree.vocabulary()),
                    span("no phrases").withClass("held"));
        }
        return li().with(
                a(tree.vocabulary()).withHref("#" + tree.vocabulary()),
                span(String.format(Locale.ROOT, "%,d phrases, %,d occurrences",
                        tree.phraseTerms(), tree.phraseOccurrences())).withClass("held"));
    }

    /**
     * How many levels stand open when the page loads — the depth a functional taxonomy states its domains
     * at, BIAN's business areas and domains and FIX's sections and categories. Every deeper branch opens
     * in place.
     */
    private static final int OPEN_LEVELS = 2;

    private static SectionTag treeOf(final TermTree tree) {
        return section().withClass("control").withId(tree.vocabulary()).with(
                h2(tree.vocabulary()),
                tree.roots().isEmpty()
                        ? p().withClass("silent").with(text("No phrase of this vocabulary appears in a "
                                + "declared name."))
                        : nested(tree.roots(), tree.unmatchedRoots(), 0),
                p().withClass("singles").with(text(String.format(Locale.ROOT,
                        "%,d single-word terms with %,d occurrences are counted and not drawn.",
                        tree.singleWordTerms(), tree.singleWordOccurrences()))));
    }

    private static DomContent nested(final List<TermTree.Node> nodes, final int unlisted,
                                     final int depth) {
        return ul().withClass("tree").with(
                each(nodes, node -> nodeOf(node, depth)),
                iff(unlisted > 0, li().withClass("unmatched").with(
                        span(String.format(Locale.ROOT, "… and %,d more unmatched", unlisted))
                                .withClass("more"))));
    }

    private static LiTag nodeOf(final TermTree.Node node, final int depth) {
        final boolean unmatched = node.standing() == TermTree.Standing.UNMATCHED;
        if (node.children().isEmpty() && node.unlistedUnmatched() == 0) {
            return li().withCondClass(unmatched, "unmatched").with(labelled(node, unmatched));
        }
        return li().withCondClass(unmatched, "unmatched").with(
                details().condAttr(depth < OPEN_LEVELS, "open", "open").with(
                        summary().with(labelled(node, unmatched)),
                        nested(node.children(), node.unlistedUnmatched(), depth + 1)));
    }

    /** The node's own line: the label, the phrase count written at it, and what a closed branch holds. */
    private static DomContent[] labelled(final TermTree.Node node, final boolean unmatched) {
        final int writtenBelow = writtenBelow(node);
        return new DomContent[] {
                span(node.label()).withClass("concept"),
                iff(node.occurrences() > 0,
                        span(String.format(Locale.ROOT, "%,d", node.occurrences()))
                                .withClass("count")),
                iff(writtenBelow > 0,
                        span(String.format(Locale.ROOT, "%,d written below", writtenBelow))
                                .withClass("held")),
                iff(unmatched && node.conceptsBelow() > 0,
                        span(String.format(Locale.ROOT, "%,d below", node.conceptsBelow()))
                                .withClass("below"))};
    }

    private static int writtenBelow(final TermTree.Node node) {
        return node.children().stream().mapToInt(TermTree.Node::atOrBelow).sum();
    }
}
