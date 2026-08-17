package io.github.fiftieshousewife.codesemantics.engine.term;

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
 * <p><b>The score is two shares multiplied, each bounded at 1 by its own definition.</b> One is how much of
 * everything the repository wrote falls beneath the concept, weighed by {@link WrittenMass}. The other is how
 * many of the concepts beneath it were written, over how many the publisher put there. Nothing is chosen:
 * both denominators are the taxonomy's own.
 *
 * <p>Both are taken over the concepts <em>beneath</em> the branch and not the branch itself. A leaf therefore
 * scores zero — there is nothing below it for a repository's writing to concentrate in, and a subtree of one
 * can only be written entirely or not at all, which is not a measurement of where. A root scores near zero
 * the other way, holding everything and reaching almost none of it.
 *
 * <p>The second share is what stops one concept from carrying a branch: an ordinary word a taxonomy claims
 * as a leaf can put a large share of a repository's writing beneath a branch on the strength of that one
 * concept.
 *
 * <p>{@code reach} is reported over the whole subtree, the branch included, because that is the figure a
 * reader compares with the publisher's own subtree size. The score uses the concepts below.
 */
public record WrittenSubtree(String concept, int written, int conceptsWritten, int conceptsBelow,
                             double reach, double weight) {

    /**
     * Every branch of the tree, the ones a repository fills most of first.
     *
     * <p><b>Once per concept, not once per path.</b> A poly-hierarchical source states a concept beneath
     * several parents, so the tree drawn from it reaches the same branch by many routes and a walk that
     * reported each would print one row dozens of times. The subtree beneath a concept is the same whichever
     * parent was followed to it, so the first is kept.
     */
    public static List<WrittenSubtree> in(final TaxonomyTree tree, final WrittenMass mass) {
        final Descendants descendants = Descendants.of(tree, mass);
        return labelsIn(tree, descendants).stream()
                .map(label -> of(label, descendants))
                .sorted(Comparator.comparingDouble(WrittenSubtree::weight).reversed()
                        .thenComparing(WrittenSubtree::concept))
                .toList();
    }

    private static java.util.Set<String> labelsIn(final TaxonomyTree tree, final Descendants descendants) {
        final java.util.Set<String> labels = new java.util.LinkedHashSet<>();
        tree.roots().forEach(root -> labels.addAll(descendants.of(root.label())));
        return labels;
    }

    private static WrittenSubtree of(final String label, final Descendants descendants) {
        final int below = descendants.of(label).size();
        final int written = descendants.writtenIn(label);
        final double reach = (double) written / below;
        return new WrittenSubtree(label, descendants.occurrencesIn(label), written, below, reach,
                descendants.shareBelow(label) * descendants.reachBelow(label));
    }
}
