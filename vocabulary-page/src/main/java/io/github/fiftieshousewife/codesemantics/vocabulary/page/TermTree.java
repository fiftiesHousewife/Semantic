package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

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
        final MatchedForest forest = new MatchedForest("");
        owned.stream()
                .filter(match -> match.wordsInTerm() >= 2)
                .forEach(match -> match.concepts().forEach(concept ->
                        forest.grew(paths.pathPastTheFieldOf(concept), match.occurrences())));
        final UnmatchedConcepts unmatched = new UnmatchedConcepts(published, forest.matchedLabels());
        final List<ReadingFolder.TermMatchRow> singles = owned.stream()
                .filter(match -> match.wordsInTerm() == 1)
                .toList();
        final List<ReadingFolder.TermMatchRow> phrases = owned.stream()
                .filter(match -> match.wordsInTerm() >= 2)
                .toList();
        return new TermTree(vocabulary,
                forest.built(unmatched).children(),
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

    /** The levels standing at the top of the drawing with nothing matched below them, as a count. */
    private static int unmatchedRootsOf(final List<SkosConcept> published,
                                        final PublishedPaths paths, final MatchedForest forest) {
        final Set<String> drawn = forest.childLabels();
        return (int) published.stream()
                .map(concept -> paths.pathPastTheFieldOf(concept.prefLabel()).getFirst())
                .distinct()
                .filter(root -> !drawn.contains(root))
                .count();
    }
}
