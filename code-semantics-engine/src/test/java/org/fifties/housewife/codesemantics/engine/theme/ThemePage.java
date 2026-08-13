package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import j2html.tags.DomContent;

import static j2html.TagCreator.div;
import static j2html.TagCreator.dl;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.join;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.scriptWithInlineFile;
import static j2html.TagCreator.section;
import static j2html.TagCreator.styleWithInlineFile;
import static j2html.TagCreator.title;

/**
 * The theme reading as a page.
 *
 * <p>It draws {@link ThemeGraph} and computes nothing of its own beyond geometry and one roll-up that is a
 * sum, so the picture and the report behind it cannot disagree. The markup is a DSL of typed tags: a page
 * assembled this way cannot emit unbalanced markup, and a witness's text is escaped by construction rather
 * than by anyone remembering to.
 */
final class ThemePage {

    private static final String STYLE = "/themes.css";
    private static final String BEHAVIOUR = "/themes.js";
    private static final String PAYLOAD = "themes";

    private final ThemeSections sections = new ThemeSections();
    private final EvidencePayload payload = new EvidencePayload();

    String of(final ThemeGraph graph) {
        final LinesLedBar led = new LinesLedBar(graph.filesRead());
        return join(
                title("Themes — %s".formatted(graph.repository())),
                styleWithInlineFile(STYLE),
                div(masthead(graph),
                        graphSection(),
                        rankingSection(graph),
                        sections.behaviours(graph.verbs()),
                        sections.foreignWords(graph.foreignWords()),
                        linesSection(led),
                        scopesSection(graph),
                        sections.strangeResults(),
                        p(PageProse.FOOT).withClass("foot")).withClass("wrap"),
                script(rawHtml(payload.of(graph.nodes(), graph.edges())))
                        .withId(PAYLOAD).attr("type", "application/json"),
                scriptWithInlineFile(BEHAVIOUR))
                .render();
    }

    private DomContent masthead(final ThemeGraph graph) {
        return header(
                p("Self-reading · %s".formatted(graph.repository())).withClass("eyebrow"),
                h1(PageProse.HEADING),
                p(PageProse.LEDE).withClass("lede"),
                statistics(graph),
                p(PageProse.linkage(graph.linkage(), anySiteResolves(graph))).withClass("limits")
                        .withId("linkage"),
                p(PageProse.READS).withClass("limits"));
    }

    private DomContent statistics(final ThemeGraph graph) {
        return dl(sections.figure("Files read", ThemeTables.count(graph.files())),
                sections.figure("Lines", ThemeTables.count(graph.lines())),
                sections.figure("Themes found", ThemeTables.count(graph.topics())),
                sections.figure("Scopes compared", ThemeTables.count(graph.scopes().size())),
                sections.figure("Cost", String.format(Locale.ROOT, "%.1f s",
                        graph.elapsedMillis() / 1000.0)))
                .withClass("stats");
    }

    private DomContent graphSection() {
        return section(
                sections.heading(PageProse.GRAPH_HEADING, PageProse.GRAPH),
                div(new ThemeSpace().view(), sections.evidencePanel()).withClass("panel graph"));
    }

    private DomContent rankingSection(final ThemeGraph graph) {
        return section(
                sections.heading(PageProse.RANKING_HEADING, PageProse.RANKING),
                div(new ThemeRankingTable(graph.nodes()).ranking(PageProse.RANKING_CAPTION))
                        .withClass("scroller"));
    }

    private DomContent linesSection(final LinesLedBar led) {
        return section(
                sections.heading(PageProse.LINES_HEADING,
                        PageProse.linesLed(ThemeTables.count(led.lines()))),
                led.bar(), led.legend());
    }

    private DomContent scopesSection(final ThemeGraph graph) {
        return section(
                sections.heading(PageProse.SCOPES_HEADING, PageProse.SCOPES),
                new ScopeCards(graph.scopes()).cards());
    }

    /** Whether the reading rendered anything the page can open, which decides what the page says it did. */
    private static boolean anySiteResolves(final ThemeGraph graph) {
        return everySite(graph).stream().anyMatch(EvidenceSite::resolves);
    }

    private static List<ThemeGraph.Site> everySite(final ThemeGraph graph) {
        return Stream.concat(
                        graph.foreignWords().stream().map(ThemeGraph.Foreign::site),
                        graph.nodes().stream()
                                .flatMap(node -> node.carriedBy().stream())
                                .flatMap(witness -> witness.quotations().stream())
                                .map(ThemeGraph.Quotation::site))
                .toList();
    }
}
