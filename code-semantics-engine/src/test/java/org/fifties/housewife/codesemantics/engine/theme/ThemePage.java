package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Locale;

import j2html.tags.DomContent;

import static j2html.TagCreator.div;
import static j2html.TagCreator.dl;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.join;
import static j2html.TagCreator.p;
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
    private final ThemeSections sections = new ThemeSections();

    String of(final ThemeGraph graph) {
        return join(
                title("Themes — %s".formatted(graph.repository())),
                styleWithInlineFile(STYLE),
                div(masthead(graph),
                        graphSection(graph),
                        rankingSection(graph),
                        scopesSection(graph),
                        sections.strangeResults(),
                        p(PageProse.FOOT).withClass("foot")).withClass("wrap"))
                .render();
    }

    private DomContent masthead(final ThemeGraph graph) {
        return header(
                p("Self-reading · %s".formatted(graph.repository())).withClass("eyebrow"),
                h1(PageProse.HEADING),
                p(PageProse.LEDE).withClass("lede"),
                statistics(graph),
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

    private DomContent graphSection(final ThemeGraph graph) {
        final ThemeSunburst sunburst = new ThemeSunburst(graph.nodes());
        return section(
                sections.heading(PageProse.GRAPH_HEADING, PageProse.GRAPH),
                div(sunburst.chart()).withClass("panel sunburst-figure"),
                p(denominator(graph, sunburst)).withClass("note"));
    }

    /**
     * The figure the chart no longer draws as a wedge. Half the ring was once a single grey sector for the
     * topics that cleared no bar, which made the picture's largest feature the material it existed to leave
     * out — so the share belongs here, in words, where it is read rather than merely seen.
     */
    private static String denominator(final ThemeGraph graph, final ThemeSunburst sunburst) {
        return "The ring closes over the %d topics that earned a place. They hold %s of all topical mass; "
                .formatted(graph.nodes().size(), ThemeTables.percentage(sunburst.drawnShare()))
                + "the other %d topics the reading resolved distinguish no part of this repository from "
                .formatted(graph.topics() - graph.nodes().size())
                + "the rest of it, or rest on a single word, and are named in the report rather than drawn.";
    }

    private DomContent rankingSection(final ThemeGraph graph) {
        return section(
                sections.heading(PageProse.RANKING_HEADING, PageProse.RANKING),
                div(new ThemeRankingTable(graph.nodes()).ranking(PageProse.RANKING_CAPTION))
                        .withClass("scroller"));
    }


    private DomContent scopesSection(final ThemeGraph graph) {
        return section(
                sections.heading(PageProse.SCOPES_HEADING, PageProse.SCOPES),
                new ScopeCards(graph.scopes()).cards());
    }

}
