package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import j2html.tags.DomContent;

import static j2html.TagCreator.tag;

/**
 * The themes as a sunburst: the broad subject on the inner ring, the labels it was actually stated as on
 * the outer one, each wedge as wide as the share of the repository's structure it explains.
 *
 * <p><b>A wedge is not how much was written.</b> It is the divergence the topic accounts for across the
 * scopes that departed further than chance — what the reading found rather than what the codebase typed.
 * Sizing by topical mass draws whichever ambiguous word the repository writes most often, which is the
 * reading the report's own front page calls the weak one.
 *
 * <p>The ring structure is not a drawing decision. The topic resource publishes a hierarchy, and it is the
 * same hierarchy the reading folds a derived label back through — so the inner ring is a citation rather
 * than a grouping anyone invented. A theme the hierarchy says nothing about sits alone in its own sector,
 * which is the honest way to draw a label that generalises to nothing.
 *
 * <p><b>The ring closes over the topics that earned a place</b>, so every wedge is a share of what the
 * picture is actually about and two wedges can be compared by eye. It once closed over all topical mass,
 * which put half the circle into a single grey wedge for the four hundred and seventy-five topics that
 * cleared no bar — a picture whose largest feature was the material it existed to leave out.
 *
 * <p>Nothing is hidden by that. How many topics the reading resolved and how few earned a place is a
 * figure, and the caption beside the chart states it: a denominator belongs in words where it is read, not
 * in a wedge where it is merely large.
 */
final class ThemeSunburst {

    static final int SIZE = 420;
    static final String DESCRIPTION = "Themes by share of topical mass, the broad subject inside and the "
            + "label each was stated as outside";

    private static final double CENTRE = 210.0;
    private static final double INNER_FROM = 58.0;
    private static final double INNER_TO = 116.0;
    private static final double OUTER_FROM = 121.0;
    private static final double OUTER_TO = 182.0;
    private static final double FULL_TURN = 360.0;
    private static final double START = -90.0;

    /** A wedge narrower than this cannot hold a word, and an unreadable label is not a label. */
    private static final double LABEL_FITS = 13.0;

    private static final double FADE_PER_THEME = 0.1;
    private static final double FAINTEST = 0.42;

    private final Map<String, List<ThemeGraph.Node>> grouped;
    private final double drawn;

    ThemeSunburst(final List<ThemeGraph.Node> nodes) {
        this.grouped = byBroaderTopic(nodes);
        this.drawn = nodes.stream().mapToDouble(ThemeGraph.Node::explains).sum();
    }

    DomContent chart() {
        return tag("svg").withId("sunburst").attr("viewBox", "0 0 %d %d".formatted(SIZE, SIZE))
                .attr("role", "img")
                .attr("aria-label", DESCRIPTION)
                .with(wedges());
    }

    /** The marks alone, so a page and a file of its own can each supply their own root element. */
    List<DomContent> wedges() {
        final List<DomContent> wedges = new ArrayList<>();
        double from = START;
        int rank = 0;
        for (final Map.Entry<String, List<ThemeGraph.Node>> group : grouped.entrySet()) {
            final double sweep = turnOf(group.getValue().stream()
                    .mapToDouble(ThemeGraph.Node::explains).sum());
            wedges.add(sector(group.getKey(), from, sweep, INNER_FROM, INNER_TO, colour(rank), 1.0));
            double within = from;
            for (final ThemeGraph.Node node : group.getValue()) {
                final double leaf = turnOf(node.explains());
                wedges.add(sector(node.topic(), within, leaf, OUTER_FROM, OUTER_TO, colour(rank),
                        fade(group.getValue().indexOf(node))));
                within += leaf;
            }
            from += sweep;
            rank++;
        }
        return wedges;
    }

    /** A share of what is drawn, so the ring closes over the topics that earned a place. */
    private double turnOf(final double intensity) {
        return drawn <= 0.0 ? 0.0 : FULL_TURN * intensity / drawn;
    }

    private DomContent sector(final String named, final double from, final double sweep, final double inner,
                              final double outer, final String colour, final double weight) {
        return tag("g").withClass("wedge").attr("style", colour).attr("opacity", figure(weight))
                .with(tag("path").attr("d", path(from, sweep, inner, outer))
                                .with(tag("title").withText(describing(named, sweep))),
                        label(named, from, sweep, (inner + outer) / 2.0));
    }

    private static String describing(final String named, final double sweep) {
        return "%s — %s of what the chart draws".formatted(named,
                ThemeTables.percentage(sweep / FULL_TURN));
    }

    private static DomContent label(final String named, final double from, final double sweep,
                                    final double at) {
        if (sweep < LABEL_FITS) {
            return tag("g");
        }
        final double middle = from + sweep / 2.0;
        final double turned = middle > 0.0 && middle < 180.0 ? middle - 90.0 : middle + 90.0;
        return tag("text").withClass("wedge-label")
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


    private static String colour(final int rank) {
        return SeriesColours.swatch(SeriesColours.light(rank), SeriesColours.dark(rank));
    }

    private static double fade(final int within) {
        return Math.max(FAINTEST, 1.0 - FADE_PER_THEME * (within + 1));
    }

    /**
     * A theme sits under the broadest subject the hierarchy generalises it to, and under itself where the
     * hierarchy says nothing — the same map the reading folds a derived label through.
     */
    static Map<String, List<ThemeGraph.Node>> byBroaderTopic(final List<ThemeGraph.Node> nodes) {
        final Map<String, List<ThemeGraph.Node>> grouped = new LinkedHashMap<>();
        nodes.forEach(node -> grouped.computeIfAbsent(node.broader(), broad -> new ArrayList<>()).add(node));
        return grouped;
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
