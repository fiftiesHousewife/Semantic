package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.Map;

/**
 * How many <em>other</em> concepts a repository writes in the branch the taxonomy states one under.
 *
 * <p>It is the answer to the question a single-word match cannot answer for itself. OLiA states
 * {@code Preferred} under {@code UsageAndFrequencyFeature}; a repository writing it once and nothing else
 * under that feature has written an English word a taxonomy happens to claim. It states {@code Verb} under
 * {@code MorphosyntacticCategory}, beside {@code Noun}, {@code Clause} and {@code Phrase} — and that
 * company is what makes the match mean something.
 *
 * <p>The company is the parent's own children. Siblings share the deepest subsumer a taxonomy can offer:
 * taken to the root the test refuses nothing, and taken at the concept itself it refuses everything,
 * because the nodes directly above a term are technical names nobody declares.
 *
 * <p>A concept the source states no parent for stands as its own branch — the rule {@link StatedAncestry}
 * obeys, for the same reason: a chain that ends is a fact about the publication. Its company is then
 * whatever the repository writes directly beneath it.
 */
public final class StatedSiblings {

    /** Where the source put one concept, and what the repository wrote there. */
    private record Placement(String branch, int writtenInBranch, int written) {

        int beside() {
            return writtenInBranch - (written > 0 ? 1 : 0);
        }
    }

    private static final Placement NOWHERE = new Placement("", 0, 0);

    private final Map<String, Placement> byConcept;

    private StatedSiblings(final Map<String, Placement> byConcept) {
        this.byConcept = Map.copyOf(byConcept);
    }

    public static StatedSiblings of(final TaxonomyTree tree) {
        final Map<String, Placement> byConcept = new HashMap<>();
        tree.roots().forEach(root -> record(root, root, byConcept));
        return new StatedSiblings(byConcept);
    }

    private static void record(final TaxonomyTree.Node node, final TaxonomyTree.Node branch,
                               final Map<String, Placement> byConcept) {
        byConcept.merge(node.label(), new Placement(branch.label(), writtenAmongChildren(branch),
                node.written()), StatedSiblings::mostAccompanied);
        node.children().forEach(child -> record(child, node, byConcept));
    }

    /**
     * A poly-hierarchical source states one concept under several parents, so the walk meets it once per
     * parent. The placement kept is the one with the most written company, because corroboration asks
     * whether the repository writes anything beside the concept in <em>some</em> branch its publisher put
     * it in.
     */
    private static Placement mostAccompanied(final Placement kept, final Placement offered) {
        return offered.writtenInBranch() > kept.writtenInBranch() ? offered : kept;
    }

    /** The concepts a publisher states directly under one, plus that one, counted where they were written. */
    private static int writtenAmongChildren(final TaxonomyTree.Node branch) {
        return (branch.written() > 0 ? 1 : 0)
                + (int) branch.children().stream().filter(child -> child.written() > 0).count();
    }

    /**
     * The distinct concepts other than this one that the repository writes in its branch. Zero is the
     * finding: a concept alone in the region of the field its publisher placed it in.
     */
    public int writtenBeside(final String prefLabel) {
        return byConcept.getOrDefault(prefLabel, NOWHERE).beside();
    }

    /** The concept whose branch this one sits in, so a refusal can name the region it stood alone in. */
    public String branchOf(final String prefLabel) {
        return byConcept.getOrDefault(prefLabel, NOWHERE).branch();
    }
}
