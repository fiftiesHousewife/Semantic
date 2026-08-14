package org.fifties.housewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.Map;

/**
 * How many <em>other</em> concepts a repository writes in the branch the taxonomy states one under.
 *
 * <p>It is the answer to the question a single-word match cannot answer for itself. OLiA states
 * {@code Preferred} under {@code UsageAndFrequencyFeature}; this repository writes it once and writes nothing
 * else under that feature, so the match is an English word a taxonomy happens to have claimed. It states
 * {@code Verb} under {@code MorphosyntacticCategory}, where this repository also writes {@code Noun},
 * {@code Clause} and {@code Phrase} — and that company is what makes the first match mean something the second
 * does not.
 *
 * <p><b>The company is the parent's own children, and that was measured rather than assumed.</b> Counting
 * everything beneath the parent instead was tried first and it fails on the case the rule exists for:
 * {@code Topic} sits under {@code PragmaticUnit}, this repository writes {@code Identifier} two levels below
 * it, and the subtree reading admits {@code Topic} on that strength — leaving it the largest single match at
 * 177, which is the defect unchanged. That is the trap the design already names: climb far enough and
 * everything meets. Siblings share the deepest subsumer a taxonomy can offer, which is why they are the ones
 * asked.
 *
 * <p>Taken to the root the test refuses nothing, because every linguistic concept OLiA states sits under a
 * handful of enormous branches. Taken at the concept itself it refuses everything, because the nodes directly
 * above a term are technical names nobody declares — no program writes a {@code morphosyntacticCategory}.
 *
 * <p>A concept the source states no parent for stands as its own branch, which is the same rule
 * {@link StatedAncestry} obeys and for the same reason: a chain that ends is a fact about the publication.
 * Its company is then whatever the repository writes directly beneath it.
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
        byConcept.put(node.label(), new Placement(branch.label(), writtenAmongChildren(branch),
                node.written()));
        node.children().forEach(child -> record(child, node, byConcept));
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
