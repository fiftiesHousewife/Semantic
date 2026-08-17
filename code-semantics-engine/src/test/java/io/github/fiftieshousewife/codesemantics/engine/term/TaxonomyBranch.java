package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import j2html.tags.DomContent;
import j2html.tags.specialized.DetailsTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.details;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;
import static j2html.TagCreator.summary;

/**
 * One concept of a taxonomy and everything the publisher put beneath it, drawn as a branch a reader can
 * open.
 *
 * <p>Written concepts come first and open; unwritten ones keep the publisher's shape behind one closed fold
 * per branch, each named with the publisher's own definition. Nothing is dropped at any depth. The folding
 * is {@code details} and {@code summary}, which every browser implements, so no script is written for it.
 */
final class TaxonomyBranch {

    private TaxonomyBranch() {
    }

    /** One node, open where the repository reached it and closed where it did not. */
    static DomContent of(final TaxonomyTree.Node node) {
        if (node.children().isEmpty()) {
            return div(label(node), definition(node))
                    .withClass(node.written() > 0 ? "leaf touched" : "leaf")
                    .withId(TaxonomySunburst.anchorFor(node.label()));
        }
        final DetailsTag branch = details(summary(label(node)), definition(node),
                each(reached(node), TaxonomyBranch::of), unreached(node))
                .withClass(node.touched() ? "touched" : "untouched")
                .withId(TaxonomySunburst.anchorFor(node.label()));
        return node.touched() ? branch.attr("open") : branch;
    }

    /**
     * The branches of the field this repository never enters, behind one fold. It is the same rule the tree
     * obeys at every depth, applied to the roots — the page states that an unreached branch is closed rather
     * than removed, and until every root was drawn that was true of eleven of the seventy.
     */
    static DomContent unreachedRoots(final TaxonomyTree tree) {
        final List<TaxonomyTree.Node> unreached = tree.roots().stream()
                .filter(root -> !root.touched()).toList();
        return fold(unreached, "%,d of the field's %,d branches this repository never enters"
                .formatted(unreached.size(), tree.roots().size()));
    }

    private static DomContent unreached(final TaxonomyTree.Node node) {
        final List<TaxonomyTree.Node> unreached = node.children().stream()
                .filter(child -> !child.touched()).toList();
        return fold(unreached, "%,d unwritten here".formatted(conceptsIn(unreached)));
    }

    private static DomContent fold(final List<TaxonomyTree.Node> unreached, final String naming) {
        return unreached.isEmpty() ? span()
                : details(summary(span(naming).withClass("below")),
                        each(unreached, TaxonomyBranch::of)).withClass("unwritten");
    }

    private static int conceptsIn(final List<TaxonomyTree.Node> nodes) {
        return nodes.stream().mapToInt(TaxonomyTree.Node::conceptsBelow).sum();
    }

    private static List<TaxonomyTree.Node> reached(final TaxonomyTree.Node node) {
        return node.children().stream().filter(TaxonomyTree.Node::touched).toList();
    }

    private static DomContent label(final TaxonomyTree.Node node) {
        return span(span(node.words()).withClass("label"), occurrences(node));
    }

    private static DomContent occurrences(final TaxonomyTree.Node node) {
        return node.written() == 0 ? span()
                : a(span("%,d".formatted(node.written())).withClass("count"))
                        .withHref("evidence.html#" + TaxonomySunburst.anchorFor(node.label()))
                        .withTitle("where this was written");
    }

    /** The publisher's own words, and nothing at all where the publisher states none. */
    private static DomContent definition(final TaxonomyTree.Node node) {
        return node.definition().isBlank() ? span()
                : p(node.definition()).withClass("definition");
    }
}
