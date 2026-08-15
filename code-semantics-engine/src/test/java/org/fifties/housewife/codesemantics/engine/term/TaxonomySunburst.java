package org.fifties.housewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import j2html.tags.DomContent;

import static j2html.TagCreator.tag;

/**
 * The whole published field as a sunburst, with the parts a repository occupies lit and the rest left dim.
 *
 * <p>A wedge is as wide as the share of the taxonomy's <em>concepts</em> that sit beneath it, so the picture
 * is of the field rather than of the codebase: the ring is arXiv's or OLiA's shape, and what this repository
 * does with it is the lighting. Sizing by matches instead would draw a taxonomy shaped like the reader, and
 * the interesting fact — that most of a field is territory this codebase never enters — would be invisible
 * by construction.
 *
 * <p>Three rings, because a ninth-level concept is a wedge too thin to hold a name and a picture nobody can
 * read is not evidence. The tree beneath the chart is where the rest is, and it opens where this ends.
 */
final class TaxonomySunburst {

    static final int SIZE = 500;

    static final String DESCRIPTION = "The taxonomy by share of its concepts, with the branches this "
            + "repository writes in lit";

    private static final double CENTRE = 250.0;
    private static final double FULL_TURN = 360.0;
    private static final double START = -90.0;
    private static final double LABEL_FITS = 9.0;

    private static final double[] RINGS = {62.0, 118.0, 121.0, 172.0, 175.0, 218.0};

    private final TaxonomyTree tree;

    TaxonomySunburst(final TaxonomyTree tree) {
        this.tree = tree;
    }

    /** The wedges alone, so a page and a file of its own can draw the same picture from the same nodes. */
    List<DomContent> wedges() {
        final List<DomContent> wedges = new ArrayList<>();
        final double published = Math.max(1, tree.roots().stream()
                .mapToInt(TaxonomyTree.Node::conceptsBelow).sum());
        double from = START;
        for (final TaxonomyTree.Node root : tree.roots()) {
            final double sweep = FULL_TURN * root.conceptsBelow() / published;
            wedges.addAll(ring(root, from, sweep, 0));
            from += sweep;
        }
        return wedges;
    }

    DomContent chart() {
        return tag("svg").withId("taxonomy-sunburst").attr("viewBox", "0 0 %d %d".formatted(SIZE, SIZE))
                .attr("role", "img")
                .attr("aria-label", DESCRIPTION)
                .with(wedges());
    }

    private List<DomContent> ring(final TaxonomyTree.Node node, final double from, final double sweep,
                                  final int depth) {
        final List<DomContent> drawn = new ArrayList<>();
        if (depth * 2 + 1 >= RINGS.length || sweep <= 0.0) {
            return drawn;
        }
        drawn.add(sector(node, from, sweep, RINGS[depth * 2], RINGS[depth * 2 + 1]));
        final double below = Math.max(1, node.children().stream()
                .mapToInt(TaxonomyTree.Node::conceptsBelow).sum());
        double within = from;
        for (final TaxonomyTree.Node child : node.children()) {
            final double share = sweep * child.conceptsBelow() / below;
            drawn.addAll(ring(child, within, share, depth + 1));
            within += share;
        }
        return drawn;
    }

    /** Lit in proportion to how much of the branch was written, and grey where nothing was. */
    private DomContent sector(final TaxonomyTree.Node node, final double from, final double sweep,
                              final double inner, final double outer) {
        final double occupancy = node.conceptsBelow() == 0 ? 0.0
                : (double) node.conceptsWritten() / node.conceptsBelow();
        final DomContent drawn = tag("g").withClass(node.touched() ? "arc lit" : "arc")
                .attr("style", "--fill:%.3f".formatted(Math.min(1.0, 0.25 + occupancy * 2.5)))
                .with(tag("path").attr("d", path(from, sweep, inner, outer))
                                .with(tag("title").withText(describing(node))),
                        label(node.words(), from, sweep, (inner + outer) / 2.0));
        return node.touched() ? tag("a").attr("href", "#" + anchorFor(node.label())).with(drawn) : drawn;
    }

    /**
     * A lit wedge is a link into the tree below it, which needs no script because the tree draws every
     * occupied path already open — the anchor lands on a node a reader can see rather than on a closed
     * branch they would then have to find.
     */
    static String anchorFor(final String label) {
        return "at-" + label.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "-");
    }

    private static String describing(final TaxonomyTree.Node node) {
        return "%s — %,d of %,d concepts written, %,d times".formatted(node.words(),
                node.conceptsWritten(), node.conceptsBelow(), node.writtenBelow());
    }

    private static DomContent label(final String named, final double from, final double sweep,
                                    final double at) {
        if (sweep < LABEL_FITS) {
            return tag("g");
        }
        final double middle = from + sweep / 2.0;
        final double turned = middle > 0.0 && middle < 180.0 ? middle - 90.0 : middle + 90.0;
        return tag("text").withClass("arc-label")
                .attr("x", figure(x(middle, at))).attr("y", figure(y(middle, at)))
                .attr("transform", "rotate(%s %s %s)".formatted(figure(turned), figure(x(middle, at)),
                        figure(y(middle, at))))
                .withText(named);
    }

    private static String path(final double from, final double sweep, final double inner,
                               final double outer) {
        final double to = from + sweep;
        final String wide = sweep > 180.0 ? "1" : "0";
        return "M %s %s A %s %s 0 %s 1 %s %s L %s %s A %s %s 0 %s 0 %s %s Z".formatted(
                figure(x(from, outer)), figure(y(from, outer)), figure(outer), figure(outer), wide,
                figure(x(to, outer)), figure(y(to, outer)),
                figure(x(to, inner)), figure(y(to, inner)), figure(inner), figure(inner), wide,
                figure(x(from, inner)), figure(y(from, inner)));
    }

    private static double x(final double degrees, final double radius) {
        return CENTRE + radius * Math.cos(Math.toRadians(degrees));
    }

    private static double y(final double degrees, final double radius) {
        return CENTRE + radius * Math.sin(Math.toRadians(degrees));
    }

    private static String figure(final double value) {
        return String.format(Locale.ROOT, "%.2f", value);
    }
}
