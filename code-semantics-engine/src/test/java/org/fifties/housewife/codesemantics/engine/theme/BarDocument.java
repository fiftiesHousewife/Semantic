package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.tag;

/**
 * The bar chart as a file of its own, so a document that renders an image rather than a page can show it.
 *
 * <p>It draws the same rows the page draws, from the same nodes, and differs only in what it carries with
 * them: an image is fetched on its own, so the stylesheet is inside it and the size is stated on the root
 * element. Nothing is recomputed here, so the file and the page cannot disagree.
 */
final class BarDocument {

    private static final String NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String STYLE = "/standalone-bar.css";

    String of(final List<ThemeGraph.Node> nodes) {
        final ThemeBar bar = new ThemeBar(nodes);
        return tag("svg").attr("xmlns", NAMESPACE)
                .attr("viewBox", "0 0 %d %d".formatted(ThemeBar.WIDTH, bar.height()))
                .attr("width", ThemeBar.WIDTH)
                .attr("height", bar.height())
                .attr("role", "img")
                .attr("aria-label", ThemeBar.DESCRIPTION)
                .with(styleWithInlineFile(STYLE))
                .with(bar.segments())
                .render();
    }
}
