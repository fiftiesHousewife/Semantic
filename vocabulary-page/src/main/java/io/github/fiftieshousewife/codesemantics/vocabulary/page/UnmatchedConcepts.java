package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * The publisher's concepts that the repository wrote nowhere in the tree, drawn greyed beside the matched
 * paths with the count of concepts below each.
 *
 * <p>A concept drawn as a match under any parent is left out: CSO states more than one parent for two
 * thirds of its topics, so the same concept reaches a greyed place and a matched one, and greying it would
 * say the repository never wrote what the tree shows it writing.
 */
final class UnmatchedConcepts {

    private final Map<String, List<String>> childrenByParent;
    private final Map<String, Integer> counted = new HashMap<>();
    private final Set<String> matched;
    private final Set<String> greyDrawn = new HashSet<>();

    UnmatchedConcepts(final List<SkosConcept> published, final Set<String> matched) {
        this.childrenByParent = childrenByParent(published);
        this.matched = matched;
    }

    /**
     * Every stated parent's children, keyed by the parent's label whether or not it is a concept row.
     *
     * <p>A concept whose stated parent is its own label is not one of its own children. FIX names a
     * {@code Session} category inside a {@code Session} section, and a hierarchy keyed by label reads that
     * as the concept sitting beneath itself — a level that says nothing and draws the same branch twice.
     */
    private static Map<String, List<String>> childrenByParent(final List<SkosConcept> published) {
        final Map<String, List<String>> children = new HashMap<>();
        published.forEach(concept -> concept.broaderConcepts().stream()
                .filter(parent -> !lowered(parent).equals(lowered(concept.prefLabel())))
                .forEach(parent -> children.computeIfAbsent(lowered(parent), missing -> new ArrayList<>())
                        .add(concept.prefLabel())));
        return children;
    }

    /** The unmatched children of a label, largest branch first. */
    List<String> childrenOf(final String label) {
        return childrenByParent.getOrDefault(lowered(label), List.of()).stream()
                .distinct()
                .filter(child -> !matched.contains(lowered(child)))
                .sorted(Comparator.comparingInt((String child) -> below(child)).reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .toList();
    }

    /**
     * One unmatched concept with its own children greyed below it, to the stated depth and width. A
     * concept met more than once — CSO states more than one parent for two thirds of its topics — opens
     * where it is first drawn and shows only its count after.
     */
    TermTree.Node node(final String label, final int depth) {
        final int below = below(label);
        if (depth == 0 || !greyDrawn.add(lowered(label))) {
            return new TermTree.Node(label, 0, TermTree.Standing.UNMATCHED, below, List.of(), 0);
        }
        final List<String> children = childrenOf(label);
        final List<TermTree.Node> drawn = children.stream()
                .limit(TermTree.UNMATCHED_LISTED)
                .map(child -> node(child, depth - 1))
                .toList();
        return new TermTree.Node(label, 0, TermTree.Standing.UNMATCHED, below, drawn,
                Math.max(0, children.size() - TermTree.UNMATCHED_LISTED));
    }

    /** How many concepts the publisher states below the label, memoised, cycle-safe under a poly-hierarchy. */
    int below(final String label) {
        return below(label, new HashSet<>());
    }

    private int below(final String label, final Set<String> visiting) {
        final String key = lowered(label);
        if (!visiting.add(key)) {
            return 0;
        }
        if (counted.containsKey(key)) {
            return counted.get(key);
        }
        final int sum = childrenByParent.getOrDefault(key, List.of()).stream()
                .mapToInt(child -> 1 + below(child, visiting))
                .sum();
        counted.put(key, sum);
        return sum;
    }

    private static String lowered(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }
}
