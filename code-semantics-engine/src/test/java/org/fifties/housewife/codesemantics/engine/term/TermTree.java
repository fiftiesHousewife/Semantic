package org.fifties.housewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import j2html.tags.DomContent;

import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.span;

/**
 * The matched terms drawn where their publisher put them: one indented tree per branch the taxonomy names,
 * every match a row, every row a bar as long as the share of the reading it carries.
 *
 * <p><b>The taxonomy supplies the coordinates, so nothing is simulated.</b> A concept's depth is how many
 * superclasses the source states above it and its position is where its own path sorts — two runs of one tree
 * draw the same picture, and a layout that moved between runs would make the shape unarguable. The rule is
 * the one the theme sunburst already obeys: readability is not a layout parameter.
 *
 * <p>A concept on the path that was never itself matched is drawn as a rung rather than a row. It carries no
 * bar because nothing in this repository was read as it — it is there because the branch cannot be shown
 * without it, and drawing it like a match would invent evidence.
 */
final class TermTree {

    private static final double WIDEST = 100.0;

    private final double heaviest;

    TermTree(final double heaviest) {
        this.heaviest = heaviest;
    }

    DomContent branches(final List<TermGraph.Branch> branches) {
        return div(each(branches, this::branch)).withClass("branches");
    }

    private DomContent branch(final TermGraph.Branch branch) {
        return div(div(span(branch.root()).withClass("branch-name"),
                        span("%,d matched".formatted(branch.spans())).withClass("branch-count"))
                        .withClass("branch-head"),
                div(each(rowsOf(branch), row -> row)).withClass("rows"))
                .withClass("branch");
    }

    /**
     * A branch's rows in the order its own paths sort, with each concept drawn once however many matches sit
     * beneath it.
     */
    private List<DomContent> rowsOf(final TermGraph.Branch branch) {
        final List<DomContent> rows = new ArrayList<>();
        final Set<String> drawn = new LinkedHashSet<>();
        branch.matches().forEach(match -> {
            rungsOf(match).stream().filter(drawn::add).forEach(rung ->
                    rows.add(rung(rung, match.ancestry().indexOf(rung))));
            rows.add(row(match));
        });
        return rows;
    }

    /** The concepts above a match that the picture cannot leave out and must not draw as evidence. */
    private static List<String> rungsOf(final TermGraph.Match match) {
        return match.ancestry().subList(0, match.depth());
    }

    private static DomContent rung(final String concept, final int depth) {
        return div(span(concept).withClass("rung-name")).withClass("rung").withStyle(indent(depth));
    }

    private DomContent row(final TermGraph.Match match) {
        return div(span(match.concept()).withClass("match-name"),
                span("%d word%s".formatted(match.length(), match.length() == 1 ? "" : "s"))
                        .withClass(match.length() > 1 ? "badge badge-long" : "badge"),
                bar(match),
                span("%,d × %.2f".formatted(match.occurrences(), match.specificity())).withClass("match-worth"),
                span(match.term()).withClass("match-term"))
                .withClass("match").withStyle(indent(match.depth()))
                .withTitle("%s — first written at %s".formatted(match.term(), match.site()));
    }

    private DomContent bar(final TermGraph.Match match) {
        return span(span().withClass("bar-fill")
                .withStyle("width:%s%%".formatted(figure(WIDEST * match.mass() / heaviest))))
                .withClass("bar");
    }

    private static String indent(final int depth) {
        return "--depth:%d".formatted(depth);
    }

    private static String figure(final double share) {
        return String.format(Locale.ROOT, "%.2f", share);
    }
}
