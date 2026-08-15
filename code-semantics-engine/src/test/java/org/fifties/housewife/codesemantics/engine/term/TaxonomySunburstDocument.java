package org.fifties.housewife.codesemantics.engine.term;

import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.tag;

/**
 * The taxonomy sunburst as a file of its own, so a page that draws both of this reading's pictures can carry
 * this one without holding the reading behind it.
 *
 * <p>The two pictures come from two different steps and two different readings, and nothing runs them
 * together. A file is what lets one page show both without either step waiting on the other: each writes its
 * own picture, and the page that draws them references what is on disk. The sibling of the theme reading's
 * own standalone sunburst, and it makes the same trade — an image is fetched on its own, so the stylesheet
 * travels inside it and the size is stated on the root element. Nothing is recomputed here, so the file and
 * the tree it was drawn from cannot disagree.
 */
final class TaxonomySunburstDocument {

    private static final String NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String STYLE = "/taxonomy.css";

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
