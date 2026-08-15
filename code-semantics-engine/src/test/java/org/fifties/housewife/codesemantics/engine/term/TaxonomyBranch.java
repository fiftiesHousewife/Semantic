package org.fifties.housewife.codesemantics.engine.term;

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
 * <p><b>Every concept is named, whether or not this repository writes it, and each carries the publisher's
 * own definition.</b> The concepts a codebase does not write are the reading's most useful output and were
 * the one thing the page would not show: a branch used to report {@code 121 more here go unwritten} and
 * leave a reader to open the resource file to find out what they were. A count says how much of a field went
 * unentered; only the names and the definitions say what was in it.
 *
 * <p>What was written stays first and open, and what was not is grouped behind one closed fold per branch,
 * because a reader arrives asking what this codebase does and stays asking what the field has besides. That
 * is the ordering of the two questions and not a judgement about which concepts matter — nothing is dropped
 * at any depth, and an unwritten branch keeps the shape its publisher gave it rather than flattening into a
 * list.
 *
 * <p>The folding is {@code details} and {@code summary}, which every browser implements, so no script is
 * written for it.
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
