package org.fifties.housewife.codesemantics.engine.term;

import j2html.tags.DomContent;

import static j2html.TagCreator.details;
import static j2html.TagCreator.div;
import static j2html.TagCreator.dd;
import static j2html.TagCreator.dl;
import static j2html.TagCreator.dt;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
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

    private static final String FOOT = "Drawn from the same match the report is written from. Regenerate "
            + "with ./gradlew selfRead.";

    String of(final String repository, final String source, final TaxonomyTree tree) {
        return join(
                title("%s — %s".formatted(source, repository)),
                styleWithInlineFile(STYLE),
                div(header(
                                p("Taxonomy · %s".formatted(repository)).withClass("eyebrow"),
                                h1(source),
                                p(LEDE).withClass("lede"),
                                statistics(tree)),
                        div(each(tree.roots(), TaxonomyPage::node)),
                        p(FOOT).withClass("foot")).withClass("wrap"))
                .render();
    }

    private DomContent statistics(final TaxonomyTree tree) {
        final long touched = tree.roots().stream().mapToLong(TaxonomyPage::touchedIn).sum();
        return dl(figure("Concepts published", "%,d".formatted(tree.concepts())),
                figure("Concepts this repository writes", "%,d".formatted(touched)),
                figure("Times written", "%,d".formatted(tree.written())),
                figure("Branches at the root", "%,d".formatted(tree.roots().size())))
                .withClass("stats");
    }

    private static long touchedIn(final TaxonomyTree.Node node) {
        return (node.written() > 0 ? 1 : 0)
                + node.children().stream().mapToLong(TaxonomyPage::touchedIn).sum();
    }

    private static DomContent figure(final String naming, final String reads) {
        return div(dt(naming), dd(reads)).withClass("stat");
    }

    private static DomContent node(final TaxonomyTree.Node node) {
        if (node.children().isEmpty()) {
            return div(label(node)).withClass(node.written() > 0 ? "leaf touched" : "leaf");
        }
        final j2html.tags.specialized.DetailsTag branch =
                details(summary(label(node)), each(node.children(), TaxonomyPage::node))
                        .withClass(node.touched() ? "touched" : "untouched");
        return node.touched() ? branch.attr("open") : branch;
    }

    private static DomContent label(final TaxonomyTree.Node node) {
        return span(span(node.label()).withClass("label"),
                node.written() > 0 ? span("%,d".formatted(node.written())).withClass("count") : span(),
                node.children().isEmpty() ? span()
                        : span("%,d below".formatted(node.conceptsBelow() - 1)).withClass("below"));
    }
}
