package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * Any SKOS-shaped source as the tree it is, with the concepts a repository writes marked in place.
 *
 * <p>It is general on purpose. Every taxonomy this library bundles is normalised to the same columns —
 * its concept identifier, its preferred label and its broader concept — so one tree serves OLiA, arXiv's subject scheme,
 * NIST's framework and whatever comes next, and a new source needs an extraction rather than a viewer.
 *
 * <p>The {@code broader} column names a concept rather than pointing at one, which is what a taxonomy
 * publishes and what can be followed without a graph library. A concept naming a parent the source does not
 * state stands at its own root: that is a fact about the publication and not a gap to fill.
 */
public record TaxonomyTree(List<Node> roots, int concepts, int written) {

    /**
     * One concept, what the repository wrote it as, and everything beneath it.
     *
     * <p>{@code words} is the label as the identifier splitter reads it — {@code MorphosyntacticCategory}
     * as <em>morphosyntactic category</em> — which is the form the match was made on and the form a reader
     * can compare with a name in the code. The ontology's own spelling is kept beside it because that is
     * what the publication says.
     *
     * <p>{@code written} counts only this concept; {@code writtenBelow} counts the subtree, and it is what
     * decides whether a branch is worth opening. A branch nothing was written under is not hidden — it is
     * closed, and a reader can open it and see that the field has a whole region this codebase never enters.
     *
     * <p>{@code definition} is the source's own statement of what the concept means, blank where it states
     * none. It is carried on the node because the concepts a repository does <em>not</em> write are the ones
     * a reader most needs it for: a label alone says whether a name matched, and only the publisher's own
     * words say whether it should have.
     */
    public record Node(String concept, String label, String words, String definition, int written,
                       List<Node> children) {

        public Node {
            children = List.copyOf(children);
        }

        public int writtenBelow() {
            return written + children.stream().mapToInt(Node::writtenBelow).sum();
        }

        public int conceptsBelow() {
            return 1 + children.stream().mapToInt(Node::conceptsBelow).sum();
        }

        public boolean touched() {
            return writtenBelow() > 0;
        }

        /**
         * How many <em>distinct concepts</em> in this subtree the repository writes.
         *
         * <p>It is the figure a branch should be judged on, and it is not the same as how often the branch
         * was written. One common word written four hundred times is one concept; five different concepts
         * under one branch is a codebase working in that part of the field. A reading that ranks by
         * occurrences ranks by whichever ordinary English word the taxonomy happens to have claimed.
         */
        public int conceptsWritten() {
            return (written > 0 ? 1 : 0)
                    + children.stream().mapToInt(Node::conceptsWritten).sum();
        }

        /** The concepts written in this subtree, most-written first — what a branch's claim rests on. */
        public List<Node> writtenHere() {
            final List<Node> found = new ArrayList<>();
            if (written > 0) {
                found.add(this);
            }
            children.forEach(child -> found.addAll(child.writtenHere()));
            return found.stream()
                    .sorted(Comparator.comparingInt(Node::written).reversed()
                            .thenComparing(Node::label))
                    .toList();
        }
    }

    /** Every concept the repository wrote, wherever the publisher placed it, most-written first. */
    public List<Node> writtenHere() {
        return roots.stream()
                .flatMap(root -> root.writtenHere().stream())
                .sorted(Comparator.comparingInt(Node::written).reversed().thenComparing(Node::label))
                .toList();
    }

    /**
     * The source as a tree, with each concept carrying what the repository wrote it as.
     *
     * @param published the source's own rows
     * @param written  how often the repository wrote each concept, by the label the source states it under
     */
    public static TaxonomyTree of(final List<SkosConcept> published, final Map<String, Integer> written,
                                  final java.util.function.Function<String, String> asWords) {
        final List<SkosConcept> concepts = oncePerLabel(published);
        final Map<String, List<SkosConcept>> byParent = new LinkedHashMap<>();
        concepts.forEach(concept -> concept.broaderConcepts().forEach(parent ->
                byParent.computeIfAbsent(parent, stated -> new ArrayList<>()).add(concept)));
        final List<Node> roots = concepts.stream()
                .filter(concept -> isRoot(concept, concepts))
                .map(concept -> node(concept, byParent, written, asWords, new java.util.HashSet<>()))
                .sorted(Comparator.comparingInt(Node::writtenBelow).reversed()
                        .thenComparing(Node::label))
                .toList();
        return new TaxonomyTree(roots, concepts.size(), concepts.stream()
                .mapToInt(concept -> written.getOrDefault(concept.prefLabel(), 0)).sum());
    }

    /**
     * One node per label, because the tree is keyed by the name a {@code broader} column can refer to.
     *
     * <p>A source may publish one concept twice — OLiA states {@code SemanticFeature} in two of its own
     * modules — and two rows are two concepts to a reader of the file but one place in the hierarchy. Left
     * alone the branch is drawn twice, side by side, with identical contents.
     */
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
    private static boolean isRoot(final SkosConcept concept, final List<SkosConcept> concepts) {
        return concept.broaderConcepts().stream().noneMatch(parent ->
                concepts.stream().anyMatch(other -> other.prefLabel().equals(parent)));
    }

    /**
     * {@code onThePath} is what stops a poly-hierarchy from recursing forever. A source stating two concepts
     * beneath each other is a fact about the publication, and the tree drawn from it has to terminate.
     */
    private static Node node(final SkosConcept concept, final Map<String, List<SkosConcept>> byParent,
                             final Map<String, Integer> written,
                             final java.util.function.Function<String, String> asWords,
                             final java.util.Set<String> onThePath) {
        final java.util.Set<String> walked = new java.util.HashSet<>(onThePath);
        walked.add(concept.prefLabel());
        return new Node(concept.concept(), concept.prefLabel(), asWords.apply(concept.prefLabel()),
                concept.definition(), written.getOrDefault(concept.prefLabel(), 0),
                byParent.getOrDefault(concept.prefLabel(), List.of()).stream()
                        .filter(child -> !walked.contains(child.prefLabel()))
                        .map(child -> node(child, byParent, written, asWords, walked))
                        .sorted(Comparator.comparingInt(Node::writtenBelow).reversed()
                                .thenComparing(Node::label))
                        .toList());
    }
}
