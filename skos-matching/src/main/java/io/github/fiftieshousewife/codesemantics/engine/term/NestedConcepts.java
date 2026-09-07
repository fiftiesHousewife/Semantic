package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.term.TaxonomyTree.Node;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * The nesting a source's {@code broader} column states, built into {@link TaxonomyTree.Node} subtrees.
 *
 * <p>One node per label, because the tree is keyed by the name a {@code broader} column can refer to. A
 * source may publish one concept twice — OLiA states {@code SemanticFeature} in two of its own modules —
 * and two rows are two concepts to a reader of the file but one place in the hierarchy. Left alone the
 * branch is drawn twice, side by side, with identical contents.
 */
final class NestedConcepts {

    private final List<SkosConcept> concepts;
    private final Map<String, List<SkosConcept>> byParent;
    private final Map<String, Integer> written;
    private final Function<String, String> asWords;
    private final Map<String, Node> built = new LinkedHashMap<>();

    NestedConcepts(final List<SkosConcept> published, final Map<String, Integer> written,
                   final Function<String, String> asWords) {
        this.concepts = oncePerLabel(published);
        this.written = written;
        this.asWords = asWords;
        this.byParent = new LinkedHashMap<>();
        concepts.forEach(concept -> concept.broaderConcepts().forEach(parent ->
                byParent.computeIfAbsent(parent, stated -> new ArrayList<>()).add(concept)));
    }

    /** The source's rows, one per label. */
    List<SkosConcept> concepts() {
        return concepts;
    }

    /** How often the repository wrote the source's concepts, summed over the deduplicated rows. */
    int writtenTotal() {
        return concepts.stream()
                .mapToInt(concept -> written.getOrDefault(concept.prefLabel(), 0)).sum();
    }

    List<Node> roots() {
        final Set<String> carried = concepts.stream().map(SkosConcept::prefLabel)
                .collect(Collectors.toUnmodifiableSet());
        return mostWrittenBelowFirst(concepts.stream()
                .filter(concept -> isRoot(concept, carried))
                .map(concept -> node(concept, new HashSet<>()).node())
                .toList());
    }

    private static List<SkosConcept> oncePerLabel(final List<SkosConcept> published) {
        final Map<String, SkosConcept> byLabel = new LinkedHashMap<>();
        published.forEach(concept -> byLabel.merge(concept.prefLabel(), concept,
                (kept, again) -> kept.broader().isBlank() ? again : kept));
        return List.copyOf(byLabel.values());
    }

    /**
     * A concept none of whose stated parents the source itself carries stands at its own root.
     *
     * <p>A poly-hierarchical source states several, and one of them being carried is enough to place the
     * concept: a topic under both {@code machine learning} and something the file does not hold is not a
     * root, it is a child of the parent that is there.
     */
    private static boolean isRoot(final SkosConcept concept, final Set<String> carried) {
        return concept.broaderConcepts().stream().noneMatch(carried::contains);
    }

    /** A subtree, and whether the path it was built on cut a child from it. */
    private record Built(Node node, boolean cutByPath) {}

    /**
     * {@code onThePath} is what stops a poly-hierarchy from recursing forever. A source stating two concepts
     * beneath each other is a fact about the publication, and the tree drawn from it has to terminate.
     *
     * <p>{@code built} holds every subtree the path never cut, keyed by label, so a poly-hierarchical
     * concept is built once and stated under each of its parents. A cut subtree depends on the path that
     * cut it, so it is rebuilt where it recurs and never cached.
     */
    private Built node(final SkosConcept concept, final Set<String> onThePath) {
        return built.containsKey(concept.prefLabel())
                ? new Built(built.get(concept.prefLabel()), false)
                : freshBuild(concept, onThePath);
    }

    private Built freshBuild(final SkosConcept concept, final Set<String> onThePath) {
        onThePath.add(concept.prefLabel());
        final List<SkosConcept> stated = byParent.getOrDefault(concept.prefLabel(), List.of());
        final List<Built> children = stated.stream()
                .filter(child -> !onThePath.contains(child.prefLabel()))
                .map(child -> node(child, onThePath))
                .toList();
        onThePath.remove(concept.prefLabel());
        final boolean cut = children.size() < stated.size() || children.stream().anyMatch(Built::cutByPath);
        final Node node = new Node(concept.concept(), concept.prefLabel(), asWords.apply(concept.prefLabel()),
                concept.definition(), written.getOrDefault(concept.prefLabel(), 0),
                mostWrittenBelowFirst(children.stream().map(Built::node).toList()));
        if (!cut) {
            built.put(concept.prefLabel(), node);
        }
        return new Built(node, cut);
    }

    /**
     * Sorted by {@link Node#writtenBelow()} descending, then label. The figure recurses over the subtree,
     * so it is computed once per node rather than once per comparison.
     */
    private static List<Node> mostWrittenBelowFirst(final List<Node> nodes) {
        record Weighted(Node node, int writtenBelow) {}
        return nodes.stream()
                .map(node -> new Weighted(node, node.writtenBelow()))
                .sorted(Comparator.comparingInt(Weighted::writtenBelow).reversed()
                        .thenComparing(weighted -> weighted.node().label()))
                .map(Weighted::node)
                .toList();
    }
}
