package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.tag;

/**
 * The sunburst as a file of its own, so a document that renders an image rather than a page can show it.
 *
 * <p>It draws the same wedges the page draws, from the same nodes, and differs only in what it carries with
 * them: an image is fetched on its own, so the stylesheet is inside it and the size is stated on the root
 * element. Nothing is recomputed here, so the file and the page cannot disagree.
 */
final class SunburstDocument {

    private static final String NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String STYLE = "/standalone-sunburst.css";

    String of(final List<ThemeGraph.Node> nodes) {
        return tag("svg").attr("xmlns", NAMESPACE)
                .attr("viewBox", "0 0 %d %d".formatted(ThemeSunburst.SIZE, ThemeSunburst.SIZE))
                .attr("width", ThemeSunburst.SIZE)
                .attr("height", ThemeSunburst.SIZE)
                .attr("role", "img")
                .attr("aria-label", ThemeSunburst.DESCRIPTION)
                .with(styleWithInlineFile(STYLE))
                .with(new ThemeSunburst(nodes).wedges())
                .render();
    }
}
