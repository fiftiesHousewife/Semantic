package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import j2html.tags.DomContent;

import static j2html.TagCreator.each;
import static j2html.TagCreator.tag;

/**
 * The theme graph as an arc diagram: every theme on its own row, and an arc joining two themes where the
 * same word was read as both.
 *
 * <p>The ranking supplies the coordinates, so there is no force simulation and none is wanted — a layout
 * that moves between runs cannot be read twice, and readability is not a layout parameter. A row's vertical
 * position is its rank, a node's radius is its intensity and an arc's width is how many occurrences the two
 * themes share. Nothing here is a figure of its own: each is a number the reading already reported.
 */
final class ThemeArcs {

    private static final double ROW = 27.0;
    private static final double TOP = 16.0;
    private static final double LABEL_X = 238.0;
    private static final double LABEL_INSET = 62.0;
    private static final double BASELINE = 4.0;
    private static final double NODE_X = 252.0;
    private static final int WIDTH = 720;

    private static final double LEAST_RADIUS = 3.0;
    private static final double MOST_RADIUS = 7.0;
    private static final double LEAST_STROKE = 0.7;
    private static final double MOST_STROKE = 3.6;
    private static final double LEAST_BULGE = 26.0;
    private static final double MOST_BULGE = 300.0;
    private static final double BULGE_PER_ROW = 0.62;
    private static final int WORDS_NAMED = 4;

    private final List<ThemeGraph.Node> nodes;
    private final List<ThemeGraph.Edge> edges;
    private final Map<String, Double> rowByTopic;
    private final double mostIntense;
    private final int mostShared;

    ThemeArcs(final List<ThemeGraph.Node> nodes, final List<ThemeGraph.Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
        this.rowByTopic = rows(nodes);
        this.mostIntense = nodes.stream().mapToDouble(ThemeGraph.Node::intensity).max().orElse(1.0);
        this.mostShared = edges.stream().mapToInt(ThemeGraph.Edge::occurrences).max().orElse(1);
    }

    DomContent diagram() {
        return tag("svg")
                .withId("arcs")
                .attr("viewBox", "0 0 %d %s".formatted(WIDTH, figure(height())))
                .attr("role", "img")
                .attr("aria-label", "Themes joined by the words read as both")
                .with(tag("g").withClass("arcs").with(each(edges, this::arc)),
                        tag("g").withClass("rows").with(each(nodes, this::row)));
    }

    private DomContent arc(final ThemeGraph.Edge edge) {
        return tag("path")
                .withClass("arc")
                .attr("d", curve(edge))
                .attr("data-from", edge.from())
                .attr("data-to", edge.to())
                .attr("stroke-width",
                        figure(LEAST_STROKE + MOST_STROKE * scaled(edge.occurrences(), mostShared)))
                .with(tag("title").withText(sharing(edge)));
    }

    private String sharing(final ThemeGraph.Edge edge) {
        return "%s and %s share %s occurrences of %s".formatted(edge.from(), edge.to(),
                ThemeTables.count(edge.occurrences()),
                edge.words().stream().limit(WORDS_NAMED).collect(Collectors.joining(", ")));
    }

    private DomContent row(final ThemeGraph.Node node) {
        final double centre = rowByTopic.get(node.topic());
        return tag("g")
                .withClass("row")
                .attr("tabindex", "0")
                .attr("role", "button")
                .attr("aria-label", reading(node))
                .attr("data-topic", node.topic())
                .with(tag("rect").withClass("hit").attr("x", "0").attr("y", figure(centre - ROW / 2.0))
                                .attr("width", String.valueOf(WIDTH)).attr("height", figure(ROW)),
                        label("row-label", LABEL_X - LABEL_INSET, centre, node.topic()),
                        label("row-figure", LABEL_X, centre, ThemeTables.count(node.linesLed())),
                        tag("circle").withClass("node").attr("cx", figure(NODE_X))
                                .attr("cy", figure(centre)).attr("r", figure(radius(node))));
    }

    private static DomContent label(final String styling, final double x, final double centre,
                                    final String reads) {
        return tag("text").withClass(styling).attr("x", figure(x))
                .attr("y", figure(centre + BASELINE)).withText(reads);
    }

    private String reading(final ThemeGraph.Node node) {
        return "%s — intensity %s, leads %s lines, carried by %s words".formatted(node.topic(),
                ThemeTables.share(node.intensity()), ThemeTables.count(node.linesLed()),
                ThemeTables.count(node.wordsBehind()));
    }

    private String curve(final ThemeGraph.Edge edge) {
        final double from = rowByTopic.get(edge.from());
        final double to = rowByTopic.get(edge.to());
        final double bulge = Math.min(MOST_BULGE, LEAST_BULGE + Math.abs(to - from) * BULGE_PER_ROW);
        return "M %s %s C %s %s %s %s %s %s".formatted(figure(NODE_X), figure(from),
                figure(NODE_X + bulge), figure(from), figure(NODE_X + bulge), figure(to),
                figure(NODE_X), figure(to));
    }

    private double radius(final ThemeGraph.Node node) {
        return LEAST_RADIUS + MOST_RADIUS * scaled(node.intensity(), mostIntense);
    }

    /** A square root, so a node's <em>area</em> and not its width carries the figure it stands for. */
    private static double scaled(final double value, final double most) {
        return Math.sqrt(value / most);
    }

    private double height() {
        return TOP * 2.0 + ROW * nodes.size();
    }

    private static Map<String, Double> rows(final List<ThemeGraph.Node> nodes) {
        return IntStream.range(0, nodes.size()).boxed()
                .collect(Collectors.toUnmodifiableMap(index -> nodes.get(index).topic(),
                        index -> TOP + ROW * index + ROW / 2.0));
    }

    private static String figure(final double value) {
        return String.format(Locale.ROOT, "%.2f", value);
    }
}
