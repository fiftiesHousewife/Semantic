package io.github.fiftieshousewife.codesemantics.engine.term;

import j2html.tags.DomContent;

import static j2html.TagCreator.div;
import static j2html.TagCreator.dd;
import static j2html.TagCreator.dl;
import static j2html.TagCreator.dt;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.join;
import static j2html.TagCreator.p;
import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.title;

/**
 * A published taxonomy drawn as the tree it is, with the concepts a repository writes lit up inside it. It
 * reads any {@link TaxonomyTree}, so the same page draws a subject scheme or a control framework the day
 * one is bundled.
 *
 * <p>A branch nothing was written under is closed rather than removed — dropping it would show a taxonomy
 * shaped like the repository instead of the repository placed in a taxonomy — and {@link TaxonomyBranch}
 * draws each, down to the leaf and its definition.
 *
 * <p>The one script exists because the document cannot express it: most wedges are too thin to hold their
 * own name, and the native tooltip arrives after a delay a reader hunting for a name does not wait out.
 */
final class TaxonomyPage {

    private static final String STYLE = "/taxonomy.css";

    private static final String LEDE = "Every concept the taxonomy publishes, in the hierarchy it publishes "
            + "them in. A concept this repository writes is lit and counted; a branch it never reaches is "
            + "closed rather than removed, because what a field has that a codebase does not is part of the "
            + "reading.";

    private static final String READING = "Read the first two together. A codebase writing a large share of "
            + "a field's concepts is working across it; one writing a small share intensely is working in a "
            + "corner of it, and which corner is what the tree below says. The picture of it is on the "
            + "chart page, beside the other one this reading draws.";

    private static final String FOOT = "Drawn from the same match the report is written from. Regenerate "
            + "with ./gradlew read.";

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
                        div(each(tree.roots().stream().filter(TaxonomyTree.Node::touched).toList(),
                                TaxonomyBranch::of), TaxonomyBranch.unreachedRoots(tree)),
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

}
