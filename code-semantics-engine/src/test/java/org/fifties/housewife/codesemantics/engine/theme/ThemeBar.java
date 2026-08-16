package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import j2html.tags.DomContent;

import static j2html.TagCreator.tag;

/**
 * The themes as one stacked bar: every topic that earned a place, laid end to end in the order the
 * hierarchy groups them, each segment as wide as the share of the reading it explains.
 *
 * <p>It draws exactly what {@link ThemeSunburst} draws, from the same nodes and the same quantity, and it
 * reads better for the one job the front page has. A reader comparing two topics on a ring is comparing two
 * angles at different radii; on a bar they are comparing two lengths on one line, which is the comparison
 * the eye is reliable at. The ring earns its place on the theme page, where the inner ring carries the
 * publisher's own hierarchy and there is room to read it.
 *
 * <p><b>A segment is not how much was written.</b> It is the divergence the topic accounts for across the
 * scopes that departed further than chance — what the reading found rather than what the codebase typed.
 *
 * <p>The bar closes over the topics that earned a place, so every segment is a share of what the picture is
 * about and any two can be compared by eye. What did not earn a place is a figure and belongs in the
 * sentence beside the chart, not in a grey segment whose only property is being the largest.
 *
 * <p>A segment too narrow to hold its name is drawn and left unlabelled rather than dropped: the length is
 * the reading and the label is a convenience, and the title on every segment carries the name regardless.
 */
final class ThemeBar {

    static final int WIDTH = 720;
    static final int HEIGHT = 96;
    static final String DESCRIPTION = "Themes as one bar, each segment the share of the reading that topic "
            + "explains, grouped by the broad subject the publisher's hierarchy places it under";

    private static final double BAR_TOP = 8.0;
    private static final double BAR_HEIGHT = 40.0;
    private static final double LABEL_BASELINE = 72.0;
    private static final double TICK_TOP = 52.0;

    /** A segment narrower than this cannot hold a word, and an unreadable label is not a label. */
    private static final double LABEL_FITS = 46.0;

    private static final double FADE_PER_THEME = 0.1;
    private static final double FAINTEST = 0.42;

    private final Map<String, List<ThemeGraph.Node>> grouped;
    private final double drawn;

    ThemeBar(final List<ThemeGraph.Node> nodes) {
        this.grouped = ThemeSunburst.byBroaderTopic(nodes);
        this.drawn = nodes.stream().mapToDouble(ThemeGraph.Node::explains).sum();
    }

    DomContent chart() {
        return tag("svg").withId("theme-bar").attr("viewBox", "0 0 %d %d".formatted(WIDTH, HEIGHT))
                .attr("role", "img")
                .attr("aria-label", DESCRIPTION)
                .with(segments());
    }

    /** The marks alone, so a page and a file of its own can each supply their own root element. */
    List<DomContent> segments() {
        final List<DomContent> marks = new ArrayList<>();
        double from = 0.0;
        int rank = 0;
        for (final Map.Entry<String, List<ThemeGraph.Node>> group : grouped.entrySet()) {
            for (final ThemeGraph.Node node : group.getValue()) {
                final double width = widthOf(node.explains());
                marks.add(segment(node.topic(), from, width, colour(rank),
                        fade(group.getValue().indexOf(node))));
                from += width;
            }
            rank++;
        }
        return marks;
    }

    /** A share of what is drawn, so the bar closes over the topics that earned a place. */
    private double widthOf(final double explains) {
        return drawn <= 0.0 ? 0.0 : WIDTH * explains / drawn;
    }

    private DomContent segment(final String named, final double from, final double width,
                               final String colour, final double weight) {
        return tag("g").withClass("segment").attr("style", colour).attr("opacity", figure(weight))
                .with(tag("rect").attr("x", figure(from)).attr("y", figure(BAR_TOP))
                                .attr("width", figure(width)).attr("height", figure(BAR_HEIGHT))
                                .with(tag("title").withText(describing(named, width))),
                        label(named, from, width));
    }

    private static String describing(final String named, final double width) {
        return "%s — %s of what the chart draws".formatted(named,
                ThemeTables.percentage(width / WIDTH));
    }

    /** The name under its own segment, with a tick joining the two, where the segment is wide enough. */
    private static DomContent label(final String named, final double from, final double width) {
        if (width < LABEL_FITS) {
            return tag("g");
        }
        final double middle = from + width / 2.0;
        return tag("g").with(
                tag("line").withClass("segment-tick").attr("x1", figure(middle)).attr("x2", figure(middle))
                        .attr("y1", figure(TICK_TOP)).attr("y2", figure(BAR_TOP + BAR_HEIGHT)),
                tag("text").withClass("segment-label")
                        .attr("x", figure(middle)).attr("y", figure(LABEL_BASELINE))
                        .withText(named));
    }

    private static String colour(final int rank) {
        return SeriesColours.swatch(SeriesColours.light(rank), SeriesColours.dark(rank));
    }

    private static double fade(final int within) {
        return Math.max(FAINTEST, 1.0 - FADE_PER_THEME * (within + 1));
    }

    private static String figure(final double value) {
        return String.format(Locale.ROOT, "%.2f", value);
    }
}
