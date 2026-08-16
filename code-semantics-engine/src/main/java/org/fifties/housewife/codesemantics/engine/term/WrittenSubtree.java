package org.fifties.housewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;

/**
 * Where in a taxonomy a repository's matches concentrate, rather than which leaves it happened to spell.
 *
 * <p>A term match can only find a concept whose name the code writes. Apache Tika does document processing
 * and never declares an identifier reading <em>document processing</em>, so the concept its publisher states
 * for that work is unreachable to the matcher — while {@code xml}, {@code html}, {@code css} and
 * {@code hyperlink}, which it does declare, all sit beneath it. The leaves are what was written; the
 * ancestor is what they are about.
 *
 * <p><b>The score is a share and bounds itself.</b> A node's reach is the concepts written beneath it over
 * the concepts the publisher put beneath it, so it is 1 where a repository writes an entire branch and small
 * where it writes one corner of a large one. Nothing is chosen: the denominator is the taxonomy's own
 * subtree size.
 *
 * <p>A node is only worth reporting where it is both broad and full, so the two are multiplied — a leaf
 * reaches 1 of a subtree of 1 and says nothing, and a root holds everything and says nothing either. What
 * survives is the branch a repository fills.
 */
public record WrittenSubtree(String concept, int written, int conceptsBelow, double reach, double weight) {

    /**
     * Every branch of the tree, the ones a repository fills most of first.
     *
     * <p><b>Once per concept, not once per path.</b> A poly-hierarchical source states a concept beneath
     * several parents, so the tree drawn from it reaches the same branch by many routes and a walk that
     * reported each would print one row dozens of times. The subtree beneath a concept is the same whichever
     * parent was followed to it, so the first is kept.
     */
    public static List<WrittenSubtree> in(final TaxonomyTree tree) {
        final java.util.Map<String, WrittenSubtree> byConcept = new java.util.LinkedHashMap<>();
        tree.roots().stream().flatMap(root -> branches(root).stream())
                .forEach(branch -> byConcept.merge(branch.concept(), branch,
                        (kept, again) -> kept.conceptsBelow() >= again.conceptsBelow() ? kept : again));
        return byConcept.values().stream()
                .sorted(Comparator.comparingDouble(WrittenSubtree::weight).reversed()
                        .thenComparing(WrittenSubtree::concept))
                .toList();
    }

    private static List<WrittenSubtree> branches(final TaxonomyTree.Node node) {
        final List<WrittenSubtree> below = node.children().stream()
                .flatMap(child -> branches(child).stream()).toList();
        return java.util.stream.Stream.concat(java.util.stream.Stream.of(of(node)), below.stream()).toList();
    }

    private static WrittenSubtree of(final TaxonomyTree.Node node) {
        final int below = node.conceptsBelow();
        final double reach = below == 0 ? 0.0 : (double) writtenBelow(node) / below;
        return new WrittenSubtree(node.label(), node.writtenBelow(), below, reach, reach * Math.log(below));
    }

    /** How many distinct concepts of the subtree were written, which is what a share of it counts. */
    private static int writtenBelow(final TaxonomyTree.Node node) {
        return (node.written() > 0 ? 1 : 0)
                + node.children().stream().mapToInt(WrittenSubtree::writtenBelow).sum();
    }
}
