package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import j2html.tags.DomContent;

import static j2html.TagCreator.a;
import static j2html.TagCreator.code;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.header;
import static j2html.TagCreator.join;
import static j2html.TagCreator.li;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;
import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.title;
import static j2html.TagCreator.ul;

/**
 * Where every match actually is, one section per concept.
 *
 * <p>The taxonomy page states a count beside a concept, and a count is a claim until somebody can go and
 * look. This is what the count links to: the words the repository wrote, and the files and lines it wrote
 * them at. It is the same discipline the theme report keeps with its witnesses — a citation nobody can look
 * up is an assertion in a citation's clothing.
 */
final class EvidencePage {

    private static final String STYLE = "/taxonomy.css";

    private static final String LEDE = "Every concept this repository writes, with the name it wrote and "
            + "where. A count on the taxonomy page links here; this is what it rests on.";

    String of(final String repository, final String source, final List<TermSighting> sightings) {
        return join(
                title("Evidence — %s".formatted(source)),
                styleWithInlineFile(STYLE),
                div(header(
                                p("Evidence · %s".formatted(repository)).withClass("eyebrow"),
                                h1("What every match rests on"),
                                p(LEDE).withClass("lede")),
                        each(sightings, EvidencePage::concept)).withClass("wrap"))
                .render();
    }

    private static DomContent concept(final TermSighting sighting) {
        return div(h2(sighting.concepts().getFirst().prefLabel())
                        .withId(TaxonomySunburst.anchorFor(sighting.concepts().getFirst().prefLabel())),
                p(span("written ").withClass("gloss"),
                        code(sighting.term()),
                        span(" %,d times, matched on %s"
                                .formatted(sighting.occurrences(), sighting.rung().normalisation()))
                                .withClass("gloss")),
                ul(each(sighting.sites(), site -> li(code(site)))).withClass("sites"));
    }
}
