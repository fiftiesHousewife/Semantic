package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import j2html.tags.DomContent;

import static j2html.TagCreator.a;
import static j2html.TagCreator.details;
import static j2html.TagCreator.div;
import static j2html.TagCreator.dd;
import static j2html.TagCreator.dl;
import static j2html.TagCreator.dt;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.input;
import static j2html.TagCreator.label;
import static j2html.TagCreator.join;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;
import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.summary;
import static j2html.TagCreator.title;

/**
 * A published taxonomy drawn as the tree it is, with the concepts a repository writes lit up inside it.
 *
 * <p>It reads any {@link TaxonomyTree}, so it is a viewer for SKOS rather than a viewer for OLiA: the same
 * page will draw a subject scheme or a control framework the day one is bundled.
 *
 * <p><b>A branch nothing was written under is closed, not hidden.</b> That is the whole of the interaction
 * and it is the honest shape for this reading — most of a field is a region any one codebase never enters,
 * and a viewer that dropped those branches would show a taxonomy shaped like the repository rather than the
 * repository placed in a taxonomy. Opening one is how a reader sees what the field has that this code does
 * not.
 *
 * <p>The collapsing is {@code details} and {@code summary}, which every browser implements, so the page
 * carries no script at all — the same reasoning as the sunburst's fixed layout: interaction that the
 * document can express is not a thing to write code for.
 */
final class TaxonomyPage {

    private static final String STYLE = "/taxonomy.css";

    private static final String LEDE = "Every concept the taxonomy publishes, in the hierarchy it publishes "
            + "them in. A concept this repository writes is lit and counted; a branch it never reaches is "
            + "closed rather than removed, because what a field has that a codebase does not is part of the "
            + "reading.";

    private static final String READING = "Read the first two together. A codebase writing a large share of "
            + "a field's concepts is working across it; one writing a small share intensely is working in a "
            + "corner of it, and which corner is what the chart and the tree below are for.";

    private static final String FOOT = "Drawn from the same match the report is written from. Regenerate "
            + "with ./gradlew selfRead.";

    String of(final String repository, final String source, final TaxonomyTree tree,
              final TaxonomyChoice choice) {
        return join(
                title("%s — %s".formatted(source, repository)),
                styleWithInlineFile(STYLE),
                div(header(
                                p("Taxonomy · %s".formatted(repository)).withClass("eyebrow"),
                                h1(source),
                                p(LEDE).withClass("lede"),
                                p(choice.reasoning()).withClass("chain"),
                                statistics(tree)),
                        input().withType("checkbox").withId("full-screen").withClass("full-screen"),
                        div(label().withFor("full-screen").withClass("expand"),
                                new TaxonomySunburst(tree).chart()).withClass("figure"),
                                div(each(tree.roots().stream().filter(TaxonomyTree.Node::touched).toList(),
                                TaxonomyPage::node)),
                        p(FOOT).withClass("foot")).withClass("wrap"))
                .render();
    }

    private DomContent statistics(final TaxonomyTree tree) {
        final long touched = tree.roots().stream().mapToLong(TaxonomyPage::touchedIn).sum();
        final long occupied = tree.roots().stream().filter(TaxonomyTree.Node::touched).count();
        return div(dl(
                figure("Concepts published", "%,d".formatted(tree.concepts()),
                        "everything the taxonomy states, whether or not this repository has any use for it"),
                figure("Written here", "%,d".formatted(touched),
                        "how many of them appear as a name this repository declared — %.0f%% of the field"
                                .formatted(100.0 * touched / Math.max(1, tree.concepts()))),
                figure("Times written", "%,d".formatted(tree.written()),
                        "occurrences of those names, so one concept written often counts once above and "
                                + "many times here"),
                figure("Branches entered", "%,d of %,d".formatted(occupied, tree.roots().size()),
                        "top-level divisions of the field with at least one concept written beneath them"))
                .withClass("stats"),
                p(READING).withClass("caption"));
    }

    private static long touchedIn(final TaxonomyTree.Node node) {
        return (node.written() > 0 ? 1 : 0)
                + node.children().stream().mapToLong(TaxonomyPage::touchedIn).sum();
    }

    private static DomContent figure(final String naming, final String reads, final String meaning) {
        return div(dt(naming), dd(reads), p(meaning).withClass("gloss")).withClass("stat");
    }

    /**
     * Only the paths that lead somewhere. A subtree the repository never writes in is left out of the tree
     * entirely and counted instead — the sunburst above already draws the whole field to scale, so the two
     * together say what a field contains and what this codebase does in it without either repeating the
     * other. A tree that listed a thousand concepts nobody wrote was a list, and the point of a hierarchy is
     * that it is not one.
     */
    private static DomContent node(final TaxonomyTree.Node node) {
        final List<TaxonomyTree.Node> occupied = node.children().stream()
                .filter(TaxonomyTree.Node::touched).toList();
        if (occupied.isEmpty()) {
            return div(nodeLabel(node)).withClass(node.written() > 0 ? "leaf touched" : "leaf")
                    .withId(TaxonomySunburst.anchorFor(node.label()));
        }
        return details(summary(nodeLabel(node)), each(occupied, TaxonomyPage::node))
                .withClass("touched").withId(TaxonomySunburst.anchorFor(node.label())).attr("open");
    }

    private static DomContent nodeLabel(final TaxonomyTree.Node node) {
        final int unwritten = node.conceptsBelow() - node.conceptsWritten();
        return span(span(node.words()).withClass("label"),
                node.written() > 0
                        ? a(span("%,d".formatted(node.written())).withClass("count"))
                                .withHref("evidence.html#" + TaxonomySunburst.anchorFor(node.label()))
                                .withTitle("where this was written")
                        : span(),
                unwritten == 0 ? span()
                        : span(" %,d more here go unwritten".formatted(unwritten)).withClass("below"));
    }
}
