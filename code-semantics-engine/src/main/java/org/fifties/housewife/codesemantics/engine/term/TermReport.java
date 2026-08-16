package org.fifties.housewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Where a repository sits inside a published taxonomy, read by the <b>branches it occupies</b> rather than
 * by the words it happens to share with one.
 *
 * <p>Two earlier versions of this report were wrong in the same way and it is worth saying how. The first
 * led with a rate — matches per thousand declared names — which is uninterpretable on its own. The second
 * split matches by whether the taxonomy stated a parent for the concept, and called that the publisher's own
 * structure; it was an artefact of an extraction that could read only one of RDF's two spellings of a
 * superclass and had lost 627 of the ontology's 1,422 edges.
 *
 * <p>With the hierarchy recovered the reading can be what it should always have been. A branch is evidenced
 * by everything beneath it, and it is ranked by <b>how many distinct concepts</b> under it a repository
 * writes — not by how often. One ordinary word the taxonomy happens to claim, written four hundred times, is
 * one concept; five different concepts under one branch is a codebase working in that part of the field.
 */
public class TermReport {

    private static final int BRANCHES_SHOWN = 12;
    private static final int CONCEPTS_SHOWN = 8;

    public String render(final String source, final MatchedTerms matched, final TaxonomyTree tree) {
        return placed(source, matched, tree) + branches(tree) + rungs(matched);
    }

    private static String placed(final String source, final MatchedTerms matched, final TaxonomyTree tree) {
        final long occupied = tree.roots().stream().filter(TaxonomyTree.Node::touched).count();
        return String.format("**%s** publishes **%,d concepts** in a hierarchy nine levels deep. This "
                        + "repository writes **%,d of them, %,d times**, across %,d of %,d files — reaching "
                        + "**%,d of the taxonomy's %,d root branches**.%n%n"
                        + "A branch is evidenced by everything beneath it and ranked by how many distinct "
                        + "concepts under it were written, because one ordinary word a taxonomy happens to "
                        + "claim is one concept however often a codebase writes it.%n",
                source, tree.concepts(),
                tree.roots().stream().mapToInt(TaxonomyTree.Node::conceptsWritten).sum(),
                tree.written(), matched.filesMatched(), matched.filesRead(), occupied, tree.roots().size());
    }

    private static String branches(final TaxonomyTree tree) {
        final StringBuilder table = new StringBuilder(String.format(
                "%n## The branches this repository occupies%n%n"
                + "| Branch | Concepts written | Of published | Times | What it wrote there |%n"
                + "|---|--:|--:|--:|---|%n"));
        tree.roots().stream()
                .filter(TaxonomyTree.Node::touched)
                .limit(BRANCHES_SHOWN)
                .forEach(root -> table.append(String.format("| `%s` | %,d | %,d | %,d | %s |%n",
                        root.label(), root.conceptsWritten(), root.conceptsBelow(), root.writtenBelow(),
                        wrote(root))));
        return table.toString();
    }

    private static String wrote(final TaxonomyTree.Node root) {
        return root.writtenHere().stream()
                .limit(CONCEPTS_SHOWN)
                .map(node -> "`%s`\u00A0%d".formatted(node.label(), node.written()))
                .collect(Collectors.joining(" "));
    }

    /**
     * What each side was reduced to before matching, at the end and in one table. A rate per rung and none
     * across them: a match on the words and a match on a shared dictionary sense are not the same evidence.
     */
    private static String rungs(final MatchedTerms matched) {
        final StringBuilder table = new StringBuilder(String.format(
                "%n## Matches per normalisation%n%n"
                + "| Both sides became | Written | Distinct terms | One word long |%n|---|--:|--:|--:|%n"));
        Arrays.stream(TermRung.values()).forEach(rung -> table.append(String.format(
                "| %s | %,d | %,d | %.1f%% |%n", rung.normalisation(), matched.at(rung).spansFound(),
                matched.at(rung).distinctTerms(), 100.0 * oneWordShare(matched.at(rung)))));
        return table.toString();
    }

    private static double oneWordShare(final MatchedTerms rung) {
        return rung.spansFound() == 0 ? 0.0
                : rung.spansByLength().getOrDefault(1, 0) / (double) rung.spansFound();
    }
}
