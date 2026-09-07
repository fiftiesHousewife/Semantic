package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Any SKOS-shaped source as the tree it is, with the concepts a repository writes marked in place.
 *
 * <p>It is general on purpose. Every taxonomy this library bundles is normalised to the same columns —
 * its concept identifier, its preferred label and its broader concept — so one tree serves OLiA,
 * arXiv's subject scheme,
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
            return descendants()
                    .filter(node -> node.written() > 0)
                    .sorted(Comparator.comparingInt(Node::written).reversed()
                            .thenComparing(Node::label))
                    .toList();
        }

        /** This node and every node beneath it. */
        Stream<Node> descendants() {
            return Stream.concat(Stream.of(this), children.stream().flatMap(Node::descendants));
        }
    }

    /** Every concept the repository wrote, wherever the publisher placed it, most-written first. */
    public List<Node> writtenHere() {
        return roots.stream()
                .flatMap(Node::descendants)
                .filter(node -> node.written() > 0)
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
                                  final Function<String, String> asWords) {
        final NestedConcepts nested = new NestedConcepts(published, written, asWords);
        return new TaxonomyTree(nested.roots(), nested.concepts().size(), nested.writtenTotal());
    }
}
