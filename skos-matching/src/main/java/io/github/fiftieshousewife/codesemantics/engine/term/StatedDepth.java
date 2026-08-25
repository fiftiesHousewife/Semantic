package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.Map;

/**
 * How many rungs below the root of its own branch a taxonomy states each concept, and the deepest chain it
 * states anywhere.
 *
 * <p>It is a citation and not a heuristic: the publisher stated every edge, and {@link TaxonomyTree} already
 * holds them in the shape a rung count can be read off. Nothing here decided that {@code Result} sits six
 * rungs under {@code Relation} and {@code Verb} directly under its own root.
 *
 * <p>The bound is the source's own. A depth read as a share divides by the deepest chain the publisher
 * states, so a shallow taxonomy and a deep one are read on one scale without a level count being chosen here,
 * and a source stating no edge at all has no depth to share rather than a division by zero.
 *
 * <p>A concept the source states no parent for stands at its own root, and so does one the source does not
 * state at all — the same rule {@link StatedAncestry} and {@link StatedSiblings} obey, and for the same
 * reason: a chain that ends is a fact about the publication.
 */
public final class StatedDepth {

    private final Map<String, Integer> rungsBelowRoot;
    private final int deepest;

    private StatedDepth(final Map<String, Integer> rungsBelowRoot) {
        this.rungsBelowRoot = Map.copyOf(rungsBelowRoot);
        this.deepest = this.rungsBelowRoot.values().stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    public static StatedDepth of(final TaxonomyTree tree) {
        final Map<String, Integer> rungs = new HashMap<>();
        tree.roots().forEach(root -> record(root, 0, rungs));
        return new StatedDepth(rungs);
    }

    private static void record(final TaxonomyTree.Node node, final int rungs,
                               final Map<String, Integer> found) {
        found.put(node.label(), rungs);
        node.children().forEach(child -> record(child, rungs + 1, found));
    }

    /** How far below the root of its branch the source puts this concept. A root is zero. */
    public int below(final String prefLabel) {
        return rungsBelowRoot.getOrDefault(prefLabel, 0);
    }

    /** The deepest the source states anything, which is what bounds a depth read as a share. */
    public int deepest() {
        return deepest;
    }

    /** Where the source puts this concept, in {@code [0, 1]} against its own deepest chain. */
    public double share(final String prefLabel) {
        return deepest() == 0 ? 0.0 : below(prefLabel) / (double) deepest();
    }
}
