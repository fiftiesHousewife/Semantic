package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import j2html.tags.DomContent;

import static j2html.TagCreator.caption;
import static j2html.TagCreator.code;
import static j2html.TagCreator.each;
import static j2html.TagCreator.span;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.text;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;

/**
 * The ranking, as the three different questions it answers at once: what share of the tree's topical mass a
 * theme holds, how many word occurrences carried it, and how many lines it actually leads. Their
 * disagreement is the reading, which is why none of the three is printed without the other two — and why
 * the words behind each theme sit on the same row.
 */
final class ThemeRankingTable {

    private static final int WITNESSES_NAMED = 3;

    /** A narrow no-break space, so a word and its count read as one figure and never wrap apart. */
    private static final String TIGHT = " ";

    private static final List<String> COLUMNS = List.of("Theme", "ι", "From names", "References", "Files",
            "Leads", "Lines led", "Share", "Words", "Carried by");

    private final List<ThemeGraph.Node> nodes;
    private final int mostReferences;

    ThemeRankingTable(final List<ThemeGraph.Node> nodes) {
        this.nodes = nodes;
        this.mostReferences = nodes.stream().mapToInt(ThemeGraph.Node::references).max().orElse(1);
    }

    DomContent ranking(final String describing) {
        return table(
                caption(describing),
                thead(tr(each(COLUMNS, column -> th(column).attr("scope", "col")))),
                tbody(each(nodes, this::row)));
    }

    private DomContent row(final ThemeGraph.Node node) {
        return tr(
                th(node.topic()).attr("scope", "row"),
                figure(ThemeTables.share(node.intensity())),
                figure(ThemeTables.percentage(node.nameShare())),
                bar("bar", ThemeTables.count(node.references()),
                        (double) node.references() / mostReferences),
                figure(ThemeTables.count(node.files())),
                figure(ThemeTables.count(node.leads())),
                bar("bar alt", ThemeTables.count(node.linesLed()), node.lineShare()),
                figure(ThemeTables.percentage(node.lineShare())),
                figure(ThemeTables.count(node.wordsBehind())),
                td(each(node.carriedBy().stream().limit(WITNESSES_NAMED)
                        .map(ThemeRankingTable::witnessed))).withClass("witness"))
                .attr("data-topic", node.topic());
    }

    /**
     * A word, how often it was written, and one phrase it was read in. The phrase is there because the
     * phrase is the unit of the reading: a witness quoting only its own word shows the one thing that was
     * never enough to decide anything.
     */
    private static DomContent witnessed(final ThemeGraph.Witness witness) {
        return span(code(witness.word()), text(TIGHT + ThemeTables.count(witness.occurrences())),
                span(quoted(witness)).withClass("quoted"));
    }

    private static String quoted(final ThemeGraph.Witness witness) {
        return witness.quotations().isEmpty() ? " "
                : " " + witness.quotations().getFirst().phrase() + " ";
    }

    private static DomContent figure(final String reads) {
        return td(reads).withClass("n");
    }

    /** The figure with the bar that reads it against the strongest row, which is the column's own maximum. */
    private static DomContent bar(final String styling, final String reads, final double share) {
        return td(span().withClass(styling).attr("style", "--w:%s".formatted(
                        ThemeTables.percentage(share))),
                span(reads).withClass("v")).withClass("n bar-cell");
    }
}
