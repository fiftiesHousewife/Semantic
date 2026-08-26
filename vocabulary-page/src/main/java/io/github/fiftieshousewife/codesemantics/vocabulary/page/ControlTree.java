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

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * One control vocabulary's phrase matches, drawn at their places in the publisher's own hierarchy.
 *
 * <p>Only phrases are drawn. A one-word label is everyday English far more often than a term of art, so
 * the single-word matches are counted in one line and hold no place in the tree.
 *
 * <p>A drawn path follows the first {@code broader} the publisher states for each concept. Where a level
 * is stated as a name rather than a concept — BIAN's {@code broader} is the business domain and its
 * {@code module} the business area, and neither is a row of its own — the path is drawn through those
 * names.
 */
public record ControlTree(String vocabulary, List<Node> roots, int singleWordTerms,
                          int singleWordOccurrences) {

    /** One concept with the occurrences of the phrases matched at it, zero at a purely ancestral node. */
    public record Node(String label, int occurrences, List<Node> children) {

        public Node {
            children = List.copyOf(children);
        }

        int atOrBelow() {
            return occurrences + children.stream().mapToInt(Node::atOrBelow).sum();
        }
    }

    public ControlTree {
        roots = List.copyOf(roots);
    }

    public static ControlTree of(final String vocabulary, final List<ReadingFolder.TermMatchRow> matches,
                                 final List<SkosConcept> published) {
        final List<ReadingFolder.TermMatchRow> owned = matches.stream()
                .filter(match -> vocabulary.equals(match.vocabulary()))
                .toList();
        final Map<String, SkosConcept> byLabel = new HashMap<>();
        published.forEach(concept -> byLabel.putIfAbsent(lowered(concept.prefLabel()), concept));
        final Branch forest = new Branch("");
        owned.stream()
                .filter(match -> match.wordsInTerm() >= 2)
                .forEach(match -> match.concepts().forEach(concept ->
                        forest.grew(pathOf(concept, byLabel), match.occurrences())));
        final List<ReadingFolder.TermMatchRow> singles = owned.stream()
                .filter(match -> match.wordsInTerm() == 1)
                .toList();
        return new ControlTree(vocabulary, forest.built().children(),
                (int) singles.stream().map(ReadingFolder.TermMatchRow::term).distinct().count(),
                singles.stream()
                        .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::term,
                                Collectors.summingInt(ReadingFolder.TermMatchRow::occurrences)))
                        .values().stream().mapToInt(Integer::intValue).sum());
    }

    /** Root first: the resolvable {@code broader} chain, then the name-only levels above its top. */
    private static List<String> pathOf(final String label, final Map<String, SkosConcept> byLabel) {
        final List<String> leafFirst = new ArrayList<>();
        final Set<String> seen = new HashSet<>();
        Optional<String> next = Optional.of(label);
        while (next.isPresent() && seen.add(lowered(next.get()))) {
            leafFirst.add(next.get());
            next = parentOf(next.get(), byLabel);
        }
        final List<String> path = new ArrayList<>(
                namedLevelsAbove(leafFirst.getLast(), byLabel).reversed());
        path.addAll(leafFirst.reversed());
        return path;
    }

    private static Optional<String> parentOf(final String label, final Map<String, SkosConcept> byLabel) {
        return concept(label, byLabel)
                .flatMap(stated -> stated.broaderConcepts().stream().findFirst())
                .filter(parent -> byLabel.containsKey(lowered(parent)));
    }

    /**
     * The levels the publisher states as names over the chain's top: the first unresolvable
     * {@code broader}, then the {@code module} above it, nearest level first.
     */
    private static List<String> namedLevelsAbove(final String top, final Map<String, SkosConcept> byLabel) {
        return concept(top, byLabel)
                .filter(stated -> stated.broaderConcepts().stream().findFirst()
                        .filter(parent -> !byLabel.containsKey(lowered(parent)))
                        .isPresent())
                .map(stated -> {
                    final List<String> levels = new ArrayList<>(List.of(
                            stated.broaderConcepts().getFirst()));
                    if (!stated.module().isBlank()) {
                        levels.add(stated.module());
                    }
                    return levels;
                })
                .orElse(List.of());
    }

    private static Optional<SkosConcept> concept(final String label,
                                                 final Map<String, SkosConcept> byLabel) {
        return Optional.of(lowered(label)).filter(byLabel::containsKey).map(byLabel::get);
    }

    private static String lowered(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }

    /** A growing node, converted to the record once every path is in. */
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

        private Node built() {
            return new Node(label, occurrences, children.values().stream()
                    .map(Branch::built)
                    .sorted(Comparator.comparingInt(Node::atOrBelow).reversed()
                            .thenComparing(Node::label))
                    .toList());
        }
    }
}
