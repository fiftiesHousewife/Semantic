package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The distinct concepts beneath each concept of a tree, and how often the repository wrote each.
 *
 * <p>A poly-hierarchy reaches one concept by many routes, so a walk counting nodes counts routes, and a
 * share taken over nodes is a share of something the publisher never stated. Counting labels makes the
 * denominator the publisher's own subtree.
 *
 * <p>The subtree beneath a concept is the same whichever parent was followed to it, so each label is walked
 * once and the answer reused.
 */
final class Descendants {

    private final Map<String, Set<String>> below;

    private final Map<String, Integer> occurrences;

    private final WrittenMass mass;

    private final double written;

    private Descendants(final Map<String, Set<String>> below, final Map<String, Integer> occurrences,
                        final WrittenMass mass) {
        this.below = below;
        this.occurrences = occurrences;
        this.mass = mass;
        this.written = occurrences.keySet().stream().mapToDouble(this::massOf).sum();
    }

    static Descendants of(final TaxonomyTree tree, final WrittenMass mass) {
        final Map<String, Set<String>> below = new HashMap<>();
        final Map<String, Integer> occurrences = new HashMap<>();
        tree.roots().forEach(root -> walk(root, below, occurrences));
        return new Descendants(below, occurrences, mass);
    }

    private static Set<String> walk(final TaxonomyTree.Node node, final Map<String, Set<String>> below,
                                    final Map<String, Integer> occurrences) {
        occurrences.putIfAbsent(node.label(), node.written());
        if (below.containsKey(node.label())) {
            return below.get(node.label());
        }
        final Set<String> labels = new HashSet<>();
        labels.add(node.label());
        below.put(node.label(), labels);
        node.children().forEach(child -> labels.addAll(walk(child, below, occurrences)));
        return labels;
    }

    Set<String> of(final String label) {
        return below.getOrDefault(label, Set.of());
    }

    /** How many distinct concepts of the subtree the repository wrote. */
    int writtenIn(final String label) {
        return (int) of(label).stream().filter(this::wasWritten).count();
    }

    /** How often the repository wrote the subtree, each concept counted once however many parents state it. */
    int occurrencesIn(final String label) {
        return of(label).stream().mapToInt(this::occurrencesOf).sum();
    }

    /**
     * The share of everything the repository wrote that falls <em>beneath</em> this concept, weighed by how
     * much each label narrows a subject.
     *
     * <p>The concept's own writing is left out because the walk exists to name what the written leaves sit
     * under. A leaf has nothing beneath it, so its share is zero and it abstains — which is the answer, not a
     * gap: with one concept in a subtree the share can only be none or all, and neither says where a
     * repository's writing concentrates.
     */
    double shareBelow(final String label) {
        return written == 0.0 ? 0.0
                : properDescendantsOf(label).stream().mapToDouble(this::massOf).sum() / written;
    }

    /**
     * The share of the concepts beneath this one that the repository wrote.
     *
     * <p>It is what stops one written concept from carrying a branch. A branch several of whose concepts
     * were written is a repository working in that part of the field.
     */
    double reachBelow(final String label) {
        final Set<String> descendants = properDescendantsOf(label);
        return descendants.isEmpty() ? 0.0
                : (double) descendants.stream().filter(this::wasWritten).count() / descendants.size();
    }

    private Set<String> properDescendantsOf(final String label) {
        return of(label).stream().filter(descendant -> !descendant.equals(label))
                .collect(java.util.stream.Collectors.toSet());
    }

    private double massOf(final String label) {
        return mass.of(label, occurrencesOf(label));
    }

    private boolean wasWritten(final String label) {
        return occurrencesOf(label) > 0;
    }

    private int occurrencesOf(final String label) {
        return occurrences.getOrDefault(label, 0);
    }
}
