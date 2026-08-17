package io.github.fiftieshousewife.codesemantics.engine.term;

import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.tag;

/**
 * The taxonomy sunburst as a standalone SVG file, so one page can draw both of this reading's pictures
 * without either step waiting on the other; the stylesheet travels inside the file and the size is stated on
 * the root element.
 *
 * <p><b>An SVG file is parsed as XML</b>, so a stylesheet comment naming a tag opens an element nothing
 * closes and the browser stops rendering there. {@code TaxonomySunburstDocumentTest} parses the output.
 */
final class TaxonomySunburstDocument {

    private static final String NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String STYLE = "/standalone-taxonomy-sunburst.css";

    String of(final TaxonomyTree tree) {
        return tag("svg").attr("xmlns", NAMESPACE)
                .attr("viewBox", "0 0 %d %d".formatted(TaxonomySunburst.SIZE, TaxonomySunburst.SIZE))
                .attr("width", TaxonomySunburst.SIZE)
                .attr("height", TaxonomySunburst.SIZE)
                .attr("role", "img")
                .attr("aria-label", TaxonomySunburst.DESCRIPTION)
                .with(styleWithInlineFile(STYLE))
                .with(new TaxonomySunburst(tree).wedges())
                .render();
    }
}
