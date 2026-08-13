package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import j2html.tags.DomContent;

import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.li;
import static j2html.TagCreator.span;
import static j2html.TagCreator.tag;
import static j2html.TagCreator.ul;

/**
 * The themes in the space their own measurements put them in.
 *
 * <p>Three axes, and each is a figure the reading already reported rather than a coordinate anyone chose:
 * how much of the tree's topical mass a theme holds, how much of the tree it actually leads, and how much of
 * it the code carried rather than its prose. A theme's position is therefore a claim that can be checked
 * against the table below it, and the view rotates because a projection of three real axes is only readable
 * from more than one angle.
 *
 * <p>It is not a simulation. Nothing here settles anywhere, no force pulls two themes together, and two runs
 * of one tree draw the same picture — which is the whole reason the coordinates are measurements. The
 * positions are drawn by the page's script because rotation moves them; every number it draws them from
 * travels in the payload, and the ranking table states the same figures without needing a script at all.
 */
final class ThemeSpace {

    private static final List<Axis> AXES = List.of(
            new Axis("ι", "share of the tree's topical mass"),
            new Axis("leads", "share of the tree's lines it leads"),
            new Axis("names", "share carried by names, not prose"));

    private record Axis(String named, String meaning) {
    }

    DomContent view() {
        return div(tag("svg").withId("space").attr("role", "img")
                        .attr("aria-label", "Themes placed by intensity, lines led and share carried by "
                                + "names, with an edge where the same word was read as both"),
                key()).withClass("space-figure");
    }

    /**
     * What a reader has to be told before the picture means anything: what the three axes are, what a
     * connector is, and what its weight says. A picture whose marks are unexplained is a decoration.
     */
    private static DomContent key() {
        return div(ul(each(AXES, axis -> li(span(axis.named()).withClass("axis-name"),
                        span(axis.meaning())))).withClass("axis-key"),
                span("A line joins two themes where the same word was read as both — thicker where more "
                        + "occurrences are shared. Drag to turn the view; select a theme for the words "
                        + "behind it.").withClass("space-note")).withClass("space-key");
    }
}
