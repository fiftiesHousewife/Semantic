package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Where a repository sits inside a published taxonomy, read by the <b>branches it occupies</b> rather than
 * by the words it happens to share with one.
 *
 * <p>A branch is evidenced by everything beneath it and ranked by <b>how many distinct concepts</b> under
 * it a repository writes, never by how often. One ordinary word the taxonomy happens to claim, written
 * four hundred times, is one concept; five different concepts under one branch is a codebase working in
 * that part of the field.
 */
public class TermReport {

    private static final int BRANCHES_SHOWN = 12;
    private static final int CONCEPTS_SHOWN = 8;

    public String render(final String source, final MatchedTerms matched, final TaxonomyTree tree) {
        return placed(source, matched, tree) + branches(tree) + rungs(matched) + restatedTypes(matched);
    }

    /**
     * What the declaration's own type accounted for. Java asks for the type on the line, so
     * {@code Set<String> mimeSet} writes {@code set} whatever the author meant, and a taxonomy claiming the
     * English noun has matched the language rather than the field. Each removed term is named, so a reader
     * disagrees term by term rather than with a rate.
     */
    private static String restatedTypes(final MatchedTerms matched) {
        if (matched.spansRestatingTheirType() == 0) {
            return "";
        }
        final StringBuilder table = new StringBuilder(String.format(
                "%n## Refused as the type written beside the name%n%n"
                + "**%,d spans** repeated the declared type and nothing else. The words stay in the name — "
                + "removing one would close a gap between two words the author never wrote next to each "
                + "other — and only the match is refused.%n%n"
                + "| Term | Spans refused |%n|---|--:|%n", matched.spansRestatingTheirType()));
        matched.restatedTypesByCount(CONCEPTS_SHOWN).forEach(refused -> table.append(String.format(
                "| `%s` | %,d |%n", String.join(" ", refused.getKey()), refused.getValue())));
        return table.toString();
    }

    private static String placed(final String source, final MatchedTerms matched, final TaxonomyTree tree) {
        final long occupied = tree.roots().stream().filter(TaxonomyTree.Node::touched).count();
        return String.format("**%s** publishes **%,d concepts** in a hierarchy %s deep. This "
                        + "repository writes **%,d of them, %,d times**, across %,d of %,d files — reaching "
                        + "**%,d of the taxonomy's %,d root branches**.%n%n"
                        + "A branch is evidenced by everything beneath it and ranked by how many distinct "
                        + "concepts under it were written, because one ordinary word a taxonomy happens to "
                        + "claim is one concept however often a codebase writes it.%n",
                source, tree.concepts(), rungs(StatedDepth.of(tree).deepest()),
                tree.roots().stream().mapToInt(TaxonomyTree.Node::conceptsWritten).sum(),
                tree.written(), matched.filesMatched(), matched.filesRead(), occupied, tree.roots().size());
    }

    /** The deepest chain the source itself states, so the depth is the taxonomy's own figure. */
    private static String rungs(final int deepest) {
        return deepest == 1 ? "1 rung" : "%,d rungs".formatted(deepest);
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
