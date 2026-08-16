package org.fifties.housewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Whether the depth a publisher states for a concept says anything about whether matching it meant something.
 *
 * <p>The reading it tests: a term that means something to a field sits deep in that field's hierarchy, and an
 * ordinary English word the field happens to have claimed sits near a root — so depth would separate the two
 * without a word being listed. It is written as a comparison against the branch rule because the branch rule
 * is the separation already in the tree: if depth carries the same signal, the concepts the branch refused
 * stand nearer a root than the ones it admitted, and if it does not, the means sit on top of each other or
 * the wrong way round.
 */
public class DepthReport {

    private static final int CONCEPTS_NAMED = 8;

    public String render(final StatedDepth depth, final TaxonomyTree everyTree,
                         final TaxonomyTree corroboratedTree) {
        final WrittenByDepth admitted = WrittenByDepth.of(corroboratedTree.writtenHere(), depth);
        return preamble(depth) + perRung(admitted)
                + comparison(admitted, WrittenByDepth.of(refused(everyTree, corroboratedTree), depth))
                + deepestAndShallowest(depth, corroboratedTree);
    }

    private static String preamble(final StatedDepth depth) {
        return String.format("%n## Whether the depth the publisher states separates the match%n%n"
                + "Depth is read off the source's own edges and is a citation rather than a heuristic: the "
                + "publisher stated every one of them, and a rung count is what they add up to. It is bounded "
                + "by the deepest chain the source states — %,d rungs here — so a shallow taxonomy and a deep "
                + "one are read on one scale without a level count being chosen.%n", depth.deepest());
    }

    private static String perRung(final WrittenByDepth admitted) {
        final StringBuilder table = new StringBuilder(String.format(
                "%n| Rungs below the root | Concepts written | Times | Share of spans |%n"
                + "|--:|--:|--:|--:|%n"));
        IntStream.rangeClosed(0, admitted.deepestWritten())
                .forEach(rung -> table.append(String.format("| %d | %,d | %,d | %.1f%% |%n", rung,
                        admitted.at(rung).concepts(), admitted.at(rung).spans(),
                        100.0 * share(admitted.at(rung).spans(), admitted.spans()))));
        return table.toString();
    }

    private static double share(final int part, final int whole) {
        return whole == 0 ? 0.0 : part / (double) whole;
    }

    /**
     * The two readings side by side, which is the whole measurement. A mean per concept and a mean per span
     * are both reported because one ordinary word written eight hundred times moves the second and barely
     * moves the first, and which of those a signal is made of is the question.
     */
    private static String comparison(final WrittenByDepth admitted, final WrittenByDepth refused) {
        return String.format("%n| Admitted | Concepts | Times | Mean rungs per concept "
                        + "| Mean rungs per span |%n|---|--:|--:|--:|--:|%n%s%s",
                row("what the branch admitted", admitted), row("what the branch refused", refused));
    }

    private static String row(final String admitted, final WrittenByDepth written) {
        return String.format("| %s | %,d | %,d | %.2f | %.2f |%n", admitted, written.concepts(),
                written.spans(), written.meanRungPerConcept(), written.meanRungPerSpan());
    }

    /** The concepts the branch rule removed, which is what the depth reading has to agree with or not. */
    private static List<TaxonomyTree.Node> refused(final TaxonomyTree everyTree,
                                                   final TaxonomyTree corroboratedTree) {
        final Set<String> admitted = corroboratedTree.writtenHere().stream()
                .map(TaxonomyTree.Node::label).collect(Collectors.toSet());
        return everyTree.writtenHere().stream()
                .filter(node -> !admitted.contains(node.label()))
                .toList();
    }

    /**
     * The deepest and the shallowest of what was written, named. A mean over a hundred concepts hides which
     * ones it is made of, and this reading is decided by whether the deep ones are the field's vocabulary.
     */
    private static String deepestAndShallowest(final StatedDepth depth,
                                              final TaxonomyTree corroboratedTree) {
        final List<TaxonomyTree.Node> written = corroboratedTree.writtenHere().stream()
                .sorted(Comparator.comparingInt((TaxonomyTree.Node node) -> depth.below(node.label()))
                        .reversed().thenComparing(TaxonomyTree.Node::label))
                .toList();
        return String.format("%nThe deepest of what was written: %s.%n%nThe shallowest: %s.%n",
                names(depth, written), names(depth, written.reversed()));
    }

    private static String names(final StatedDepth depth, final List<TaxonomyTree.Node> written) {
        return written.stream()
                .limit(CONCEPTS_NAMED)
                .map(node -> "`%s`\u00A0%s,\u00A0%,d".formatted(node.label(),
                        rungs(depth.below(node.label())), node.written()))
                .collect(Collectors.joining(" "));
    }

    private static String rungs(final int below) {
        return below == 1 ? "1\u00A0rung" : "%d\u00A0rungs".formatted(below);
    }
}
