package org.fifties.housewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The term reading as a viewer needs it: every match placed where the taxonomy states it belongs, grouped by
 * the broadest concept the source names above it.
 *
 * <p>Nothing here is computed that the report does not also state, and the one thing that is — the branch —
 * is read off the taxonomy's own {@code broader} column by {@link StatedAncestry}. The picture and the report
 * are written from one reading, so they cannot disagree about what matched.
 *
 * <p>It draws <b>one rung of the ladder</b> and names which. Drawing two on one set of axes would put a match
 * made on the words beside a match made on what a dictionary says those words mean, at the same size, and the
 * whole point of recording the rung is that those are not the same evidence.
 */
record TermGraph(String repository, String source, String rung, int spans, int names, int distinctTerms,
                 int filesRead, int filesMatched, Map<Integer, Integer> spansByLength, List<Branch> branches) {

    /** One concept the taxonomy names as a root, and everything matched beneath it. */
    record Branch(String root, int spans, double mass, List<Match> matches) {
    }

    /** One matched term, with the chain of concepts the source states above it, broadest first. */
    record Match(String term, String concept, List<String> ancestry, double specificity, int occurrences,
                 double mass, int length, String site) {

        int depth() {
            return ancestry.size() - 1;
        }
    }

    static TermGraph of(final String repository, final String source, final MatchedTerms whole,
                        final TermRung rung, final StatedAncestry ancestry) {
        final MatchedTerms matched = whole.at(rung);
        final List<Match> matches = matched.sightings().stream()
                .map(sighting -> match(sighting, ancestry))
                .toList();
        return new TermGraph(repository, source, rung.normalisation(), matched.spansFound(),
                matched.namesRead(), matched.distinctTerms(), matched.filesRead(), matched.filesMatched(),
                matched.spansByLength(), branches(matches));
    }

    private static Match match(final TermSighting sighting, final StatedAncestry ancestry) {
        final String concept = sighting.concepts().getFirst().prefLabel();
        return new Match(sighting.term(), concept, ancestry.of(concept), sighting.specificity(),
                sighting.occurrences(), sighting.mass(), sighting.length(), sighting.firstSite());
    }

    /**
     * The branches, heaviest first, and the matches within one ordered by the path the taxonomy states rather
     * than by their own mass — a tree ordered by weight is not a tree any more.
     */
    private static List<Branch> branches(final List<Match> matches) {
        return matches.stream()
                .collect(Collectors.groupingBy(match -> match.ancestry().getFirst()))
                .entrySet().stream()
                .map(branch -> new Branch(branch.getKey(),
                        branch.getValue().stream().mapToInt(Match::occurrences).sum(),
                        branch.getValue().stream().mapToDouble(Match::mass).sum(),
                        branch.getValue().stream()
                                .sorted(Comparator.comparing(match -> String.join("/", match.ancestry())))
                                .toList()))
                .sorted(Comparator.comparingDouble(Branch::mass).reversed())
                .toList();
    }

    /** The heaviest single match, which is what every bar on the page is drawn as a share of. */
    double heaviestMatch() {
        return branches.stream()
                .flatMap(branch -> branch.matches().stream())
                .mapToDouble(Match::mass)
                .max()
                .orElse(1.0);
    }

    /** The branches the source states a hierarchy for, which is where a match can be told from its neighbours. */
    List<Branch> stated() {
        return branches.stream().filter(TermGraph::isPlaced).toList();
    }

    /** The terms standing at their own root, because the ontology names no superclass for them. */
    List<Branch> unplaced() {
        return branches.stream().filter(branch -> !isPlaced(branch)).toList();
    }

    private static boolean isPlaced(final Branch branch) {
        return branch.matches().stream().anyMatch(match -> match.depth() > 0);
    }
}
