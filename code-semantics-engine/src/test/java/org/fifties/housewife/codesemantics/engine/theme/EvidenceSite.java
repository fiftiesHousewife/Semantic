package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Map;

import j2html.tags.DomContent;

import static j2html.TagCreator.a;
import static j2html.TagCreator.span;

/**
 * A witness's site, rendered as something a reader of the page can act on.
 *
 * <p>The reading renders a permalink where the working copy has a remote and an editor link where it does
 * not, and the second kind is a path on the machine that read the tree. On a report read beside that
 * checkout it opens the file; on a page that travels it opens nothing, and it publishes somebody's home
 * directory to everyone the page reaches. So a site that cannot resolve is named and not linked — the
 * evidence is the file and the line, never the anchor around it.
 */
final class EvidenceSite {

    private static final String RESOLVES = "http";

    private static final String WHERE = "where";

    private static final String URL = "url";

    private EvidenceSite() {
    }

    static boolean resolves(final ThemeGraph.Site site) {
        return site.url().startsWith(RESOLVES);
    }

    static DomContent of(final ThemeGraph.Site site) {
        if (!resolves(site)) {
            return span(site.where()).withClass("site dead");
        }
        return a(site.where()).withClass("site").withHref(site.url());
    }

    /**
     * The same site for the payload the page's script reads, carrying a url only where there is one to
     * carry. A field that is absent is what the script tests, and it is also what keeps a path on this
     * machine out of a page that leaves it.
     */
    static Map<String, String> published(final ThemeGraph.Site site) {
        return resolves(site) ? Map.of(WHERE, site.where(), URL, site.url()) : Map.of(WHERE, site.where());
    }
}
