package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import j2html.tags.DomContent;

import static j2html.TagCreator.tag;

/**
 * The themes as one horizontal bar per topic, longest first, each bar as long as the share of the reported
 * divergence that topic accounts for, with the topic's name to its left and its percentage at its end.
 *
 * <p>One bar per row is what lets two topics be compared: the eye reads two lengths from a common baseline,
 * where a stacked bar asks it to compare two segments starting at different offsets and a ring asks it to
 * compare two angles at different radii. The ring belongs on the theme page, where the inner ring carries
 * the publisher's own hierarchy and there is room to read it.
 *
 * <p><b>A bar's length is the divergence its topic accounts for</b> across the scopes that departed further
 * than chance, as a share of the divergence the chart draws. It is what the reading found and not how much
 * of the codebase was typed.
 *
 * <p>Colour groups the topics the publisher's hierarchy places under one broad subject, so the grouping the
 * stacked bar carried by adjacency is still readable when the order is by length.
 */
final class ThemeBar {

    static final int WIDTH = 720;
    static final String DESCRIPTION = "One bar per topic, longest first, each as long as the share of the "
            + "divergence between this repository's parts that the topic accounts for";

    private static final double TOP = 10.0;
    private static final double BOTTOM = 10.0;
    private static final double ROW_HEIGHT = 28.0;
    private static final double BAR_HEIGHT = 18.0;

    /** Where a bar begins, leaving the topic's name room to the left of it. */
    private static final double BAR_LEFT = 176.0;

    /** What the percentage at the end of the longest bar needs. */
    private static final double VALUE_WIDTH = 56.0;

    private static final double VALUE_GAP = 8.0;

    private static final double LABEL_GAP = 10.0;

    /** Where text sits inside a row so that it centres on the bar. */
    private static final double TEXT_BASELINE = 13.0;

    private final List<ThemeGraph.Node> ranked;
    private final List<String> broaderTopics;
    private final double drawn;

    ThemeBar(final List<ThemeGraph.Node> nodes) {
        this.ranked = nodes.stream()
                .sorted(Comparator.comparingDouble(ThemeGraph.Node::explains).reversed())
                .toList();
        this.broaderTopics = List.copyOf(TopicBranches.of(nodes).keySet());
        this.drawn = nodes.stream().mapToDouble(ThemeGraph.Node::explains).sum();
    }

    /** As tall as the rows it draws, so a file of it carries no empty space and clips nothing. */
    int height() {
        return (int) Math.round(TOP + ROW_HEIGHT * ranked.size() + BOTTOM);
    }

    DomContent chart() {
        return tag("svg").withId("theme-bar").attr("viewBox", "0 0 %d %d".formatted(WIDTH, height()))
                .attr("role", "img")
                .attr("aria-label", DESCRIPTION)
                .with(segments());
    }

    /** The marks alone, so a page and a file of its own can each supply their own root element. */
    List<DomContent> segments() {
        final List<DomContent> marks = new ArrayList<>();
        for (int row = 0; row < ranked.size(); row++) {
            marks.add(row(ranked.get(row), row));
        }
        return marks;
    }

    private DomContent row(final ThemeGraph.Node node, final int row) {
        final double share = shareOf(node.explains());
        final double top = TOP + ROW_HEIGHT * row;
        return tag("g").withClass("segment")
                .attr("style", colour(broaderTopics.indexOf(node.broader())))
                .with(tag("text").withClass("segment-label")
                                .attr("x", figure(BAR_LEFT - LABEL_GAP))
                                .attr("y", figure(top + TEXT_BASELINE))
                                .withText(node.topic()),
                        tag("rect").attr("x", figure(BAR_LEFT)).attr("y", figure(top))
                                .attr("width", figure(lengthOf(share))).attr("height", figure(BAR_HEIGHT))
                                .with(tag("title").withText(describing(node, share))),
                        tag("text").withClass("segment-value")
                                .attr("x", figure(BAR_LEFT + lengthOf(share) + VALUE_GAP))
                                .attr("y", figure(top + TEXT_BASELINE))
                                .withText(ThemeTables.percentage(share)));
    }

    /** A share of what is drawn, so the bars close over the topics the reading reports. */
    private double shareOf(final double explains) {
        return drawn <= 0.0 ? 0.0 : explains / drawn;
    }

    private static double lengthOf(final double share) {
        return (WIDTH - BAR_LEFT - VALUE_WIDTH - VALUE_GAP) * share;
    }

    /**
     * What a reader gets on hover: the figure the bar is drawn to, and the one it is not. A share of the
     * divergence says which topic makes the parts differ; a share of everything written says how much of
     * the repository the topic is at all, and the two are far apart wherever most writing resolves to no
     * subject.
     */
    private static String describing(final ThemeGraph.Node node, final double share) {
        return "%s — %s of the divergence the reading reports, and %s of everything written"
                .formatted(node.topic(), ThemeTables.percentage(share),
                        ThemeTables.percentage(node.intensity()));
    }

    private static String colour(final int group) {
        return SeriesColours.swatch(SeriesColours.light(group), SeriesColours.dark(group));
    }

    private static String figure(final double value) {
        return String.format(Locale.ROOT, "%.2f", value);
    }
}
