package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * One vocabulary's phrase matches, drawn at their places in the publisher's own hierarchy, with the
 * unmatched remainder beside them.
 *
 * <p>Only phrases are drawn as matches. A one-word label is everyday English far more often than a term of
 * art, so the single-word matches are counted in one line and hold no place in the tree.
 *
 * <p>A drawn path follows the first {@code broader} the publisher states for each concept. Where a level
 * is stated as a name rather than a concept — BIAN's {@code broader} is the business domain and its
 * {@code module} the business area, and neither is a row of its own — the path is drawn through those
 * names. A level an outright majority of the vocabulary sits beneath is passed over, because it names the
 * scheme's own field — CSO's {@code computer science} and FIX's {@code Common} — and a root every match
 * shares says only which vocabulary matched. A concept that is itself such a level keeps its own place.
 *
 * <p>Beside each node on a matched path, up to {@value #UNMATCHED_LISTED} of the publisher's unmatched
 * concepts at the same place are drawn greyed with the count of concepts below each, largest branch first,
 * and the rest are one counted line. An unmatched branch opens the same way, {@value #UNMATCHED_DEPTH}
 * levels down at most — so the tree shows what the repository did not write as well as what it did.
 */
public record TermTree(String vocabulary, List<Node> roots, int phraseTerms, int phraseOccurrences,
                       int singleWordTerms, int singleWordOccurrences, int unmatchedRoots) {

    /** How many of a node's unmatched children are drawn before the rest become one counted line. */
    static final int UNMATCHED_LISTED = 5;

    /** How deep an unmatched branch opens below the matched path before only its count remains. */
    static final int UNMATCHED_DEPTH = 3;

    /** Whether a node sits on the path to a phrase the repository wrote, or is the publisher's remainder. */
    public enum Standing { MATCHED, UNMATCHED }

    /**
     * One concept: the occurrences of the phrases matched at it (zero at a purely ancestral or unmatched
     * node), the count of concepts the publisher states below it, and how many unmatched children were not
     * listed under it.
     */
    public record Node(String label, int occurrences, Standing standing, int conceptsBelow,
                       List<Node> children, int unlistedUnmatched) {

        public Node {
            children = List.copyOf(children);
        }

        /** The phrase occurrences at this node and every drawn node below it. */
        int atOrBelow() {
            return occurrences + children.stream().mapToInt(Node::atOrBelow).sum();
        }
    }

    public TermTree {
        roots = List.copyOf(roots);
    }

    public static TermTree of(final String vocabulary, final List<ReadingFolder.TermMatchRow> matches,
                              final List<SkosConcept> published) {
        final List<ReadingFolder.TermMatchRow> owned = matches.stream()
                .filter(match -> vocabulary.equals(match.vocabulary()))
                .toList();
        final PublishedPaths paths = new PublishedPaths(published);
        final Map<String, List<String>> childrenByParent = childrenByParent(published);
        final Branch forest = new Branch("");
        owned.stream()
                .filter(match -> match.wordsInTerm() >= 2)
                .forEach(match -> match.concepts().forEach(concept ->
                        forest.grew(paths.pathPastTheFieldOf(concept), match.occurrences())));
        final Descendants descendants = new Descendants(childrenByParent);
        final Set<String> matched = forest.matchedLabels();
        final Set<String> greyDrawn = new HashSet<>();
        final List<ReadingFolder.TermMatchRow> singles = owned.stream()
                .filter(match -> match.wordsInTerm() == 1)
                .toList();
        final List<ReadingFolder.TermMatchRow> phrases = owned.stream()
                .filter(match -> match.wordsInTerm() >= 2)
                .toList();
        return new TermTree(vocabulary,
                forest.built(childrenByParent, descendants, matched, greyDrawn).children(),
                (int) phrases.stream().map(ReadingFolder.TermMatchRow::term).distinct().count(),
                occurrencesOf(phrases),
                (int) singles.stream().map(ReadingFolder.TermMatchRow::term).distinct().count(),
                occurrencesOf(singles),
                unmatchedRootsOf(published, paths, forest));
    }

    private static int occurrencesOf(final List<ReadingFolder.TermMatchRow> matches) {
        return matches.stream()
                .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::term,
                        Collectors.summingInt(ReadingFolder.TermMatchRow::occurrences)))
                .values().stream().mapToInt(Integer::intValue).sum();
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

    /** The levels standing at the top of the drawing with nothing matched below them, as a count. */
    private static int unmatchedRootsOf(final List<SkosConcept> published,
                                        final PublishedPaths paths, final Branch forest) {
        final Set<String> drawn = forest.childLabels();
        return (int) published.stream()
                .map(concept -> paths.pathPastTheFieldOf(concept.prefLabel()).getFirst())
                .distinct()
                .filter(root -> !drawn.contains(root))
                .count();
    }





    private static String lowered(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }

    /** Descendant counts over the stated hierarchy, memoised, cycle-safe under a poly-hierarchy. */
    private static final class Descendants {

        private final Map<String, List<String>> childrenByParent;
        private final Map<String, Integer> counted = new HashMap<>();

        private Descendants(final Map<String, List<String>> childrenByParent) {
            this.childrenByParent = childrenByParent;
        }

        private int below(final String label) {
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
    }

    /**
     * The publisher's children of a label that the repository wrote nowhere in the tree, largest branch
     * first. A concept drawn as a match under any parent is left out: CSO states more than one parent for
     * two thirds of its topics, so the same concept reaches a greyed place and a matched one, and greying
     * it would say the repository never wrote what the tree shows it writing.
     */
    private static List<String> unmatchedChildrenOf(final String label,
                                                    final Map<String, List<String>> childrenByParent,
                                                    final Descendants descendants,
                                                    final Set<String> matched) {
        return childrenByParent.getOrDefault(lowered(label), List.of()).stream()
                .distinct()
                .filter(child -> !matched.contains(lowered(child)))
                .sorted(Comparator.comparingInt((String child) -> descendants.below(child)).reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .toList();
    }

    /**
     * One unmatched concept with its own children greyed below it, to the stated depth and width. A
     * concept met more than once — CSO states more than one parent for two thirds of its topics — opens
     * where it is first drawn and shows only its count after.
     */
    private static Node unmatchedNode(final String label, final Map<String, List<String>> childrenByParent,
                                      final Descendants descendants, final Set<String> matched,
                                      final int depth, final Set<String> seen) {
        final int below = descendants.below(label);
        if (depth == 0 || !seen.add(lowered(label))) {
            return new Node(label, 0, Standing.UNMATCHED, below, List.of(), 0);
        }
        final List<String> children = unmatchedChildrenOf(label, childrenByParent, descendants, matched);
        final List<Node> drawn = children.stream()
                .limit(UNMATCHED_LISTED)
                .map(child -> unmatchedNode(child, childrenByParent, descendants, matched, depth - 1, seen))
                .toList();
        return new Node(label, 0, Standing.UNMATCHED, below, drawn,
                Math.max(0, children.size() - UNMATCHED_LISTED));
    }

    /** A growing node, converted to the record — with its unmatched siblings greyed in — once every path is in. */
    private static final class Branch {

        private final String label;
        private int occurrences;
        private final Map<String, Branch> children = new LinkedHashMap<>();

        private Branch(final String label) {
            this.label = label;
        }

        private void grew(final List<String> path, final int matched) {
            Branch branch = this;
            for (final String level : path) {
                branch = branch.children.computeIfAbsent(level, Branch::new);
            }
            branch.occurrences += matched;
        }

        private Set<String> childLabels() {
            return Set.copyOf(children.keySet());
        }

        /** Every label drawn as a match anywhere in the forest, lowered, so none of them is also greyed. */
        private Set<String> matchedLabels() {
            return children.values().stream()
                    .flatMap(child -> Stream.concat(Stream.of(lowered(child.label)),
                            child.matchedLabels().stream()))
                    .collect(Collectors.toUnmodifiableSet());
        }

        private Node built(final Map<String, List<String>> childrenByParent,
                           final Descendants descendants, final Set<String> matchedLabels,
                           final Set<String> greyDrawn) {
            final List<Node> matched = children.values().stream()
                    .map(child -> child.built(childrenByParent, descendants, matchedLabels, greyDrawn))
                    .sorted(Comparator.comparingInt(Node::atOrBelow).reversed()
                            .thenComparing(Node::label))
                    .toList();
            final List<String> unmatched = unmatchedChildrenOf(label, childrenByParent, descendants,
                    matchedLabels);
            final List<Node> drawn = new ArrayList<>(matched);
            unmatched.stream()
                    .limit(UNMATCHED_LISTED)
                    .map(child -> unmatchedNode(child, childrenByParent, descendants, matchedLabels,
                            UNMATCHED_DEPTH, greyDrawn))
                    .forEach(drawn::add);
            return new Node(label, occurrences, Standing.MATCHED, descendants.below(label), drawn,
                    Math.max(0, unmatched.size() - UNMATCHED_LISTED));
        }
    }
}
