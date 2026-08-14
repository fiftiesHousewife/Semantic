package org.fifties.housewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * What a published taxonomy found in a repository, led by the one split that separates a real match from a
 * collision.
 *
 * <p>An earlier version of this report opened with a rate — matches per thousand declared names — and then
 * printed three near-identical tables, one per rung of the matching ladder. A reader could not tell from any
 * of it whether the reading had worked, because the rate is uninterpretable on its own and the rungs answer
 * a question about method rather than about the repository. The finding was in the data and in none of the
 * tables.
 *
 * <p>So the split leads: the terms the taxonomy states no parent for against the terms it places. The rungs
 * are one line at the end, which is the weight a question about how two strings were made to meet deserves.
 */
public class TermReport {

    public String render(final String source, final MatchedTerms matched, final int held,
                         final StatedAncestry ancestry) {
        final PlacedTerms split = new PlacedTerms(ancestry);
        final List<TermSighting> own = split.atTheirOwnRoot(matched.sightings());
        final List<TermSighting> placed = split.placed(matched.sightings());
        return finding(source, matched, own, placed)
                + section("The field's own vocabulary", OWN, own, held, split, false)
                + section("Where it collides with ordinary English", PLACED, placed, held, split, true)
                + rungs(matched);
    }

    private static final String OWN =
            "The taxonomy states no superclass for any of these — the parent is an anonymous restriction or "
            + "belongs to an ontology it imports rather than carries. They are what a program working in the "
            + "field declares, and the reason this reading is worth running.";

    private static final String PLACED =
            "These sit under a branch the taxonomy places, reached through discourse and text structure. "
            + "Read the branch beside each one: a repository writing `topic`, `source` and `set` is writing "
            + "English that collides with a published name, not the language of linguistic annotation.";

    private static String finding(final String source, final MatchedTerms matched,
                                  final List<TermSighting> own, final List<TermSighting> placed) {
        final int ownSpans = PlacedTerms.spansIn(own);
        final int placedSpans = PlacedTerms.spansIn(placed);
        final int total = ownSpans + placedSpans;
        return String.format("**%s** publishes terms whose names are already identifiers, and this "
                        + "repository writes **%,d of them, %,d times**, across %,d of %,d files.%n%n"
                        + "**The split that decides is where the taxonomy itself puts them**, read off its "
                        + "own `broader` column and not from anything weighed here.%n%n"
                        + "| Where the taxonomy puts the concept | Distinct terms | Written | Share |%n"
                        + "|---|--:|--:|--:|%n"
                        + "| It states **no parent** — the field's own vocabulary | %,d | %,d | %.1f%% |%n"
                        + "| It **places** under a branch — English that collides | %,d | %,d | %.1f%% |%n",
                source, own.size() + placed.size(), total, matched.filesMatched(), matched.filesRead(),
                own.size(), ownSpans, share(ownSpans, total),
                placed.size(), placedSpans, share(placedSpans, total));
    }

    private static String section(final String heading, final String explaining,
                                  final List<TermSighting> sightings, final int held,
                                  final PlacedTerms split, final boolean withBranch) {
        return String.format("%n## %s%n%n%s%n%n", heading, explaining)
                + terms(sightings.stream().limit(held).toList(), split, withBranch);
    }

    private static String terms(final List<TermSighting> sightings, final PlacedTerms split,
                                final boolean withBranch) {
        final StringBuilder table = new StringBuilder(withBranch
                ? String.format("| Term | Written | Worth | Stated as | Under | Site |%n|---|--:|--:|---|---|---|%n")
                : String.format("| Term | Written | Worth | Stated as | Site |%n|---|--:|--:|---|---|%n"));
        sightings.forEach(sighting -> table.append(withBranch
                ? String.format("| `%s` | %,d | %.2f | `%s` | `%s` | `%s` |%n", sighting.term(),
                        sighting.occurrences(), sighting.mass(), stated(sighting), split.branchOf(sighting),
                        sighting.firstSite())
                : String.format("| `%s` | %,d | %.2f | `%s` | `%s` |%n", sighting.term(),
                        sighting.occurrences(), sighting.mass(), stated(sighting), sighting.firstSite())));
        return table.toString();
    }

    /**
     * How the two sides were made to meet, at the end and in one table, because it is a question about
     * method. A rate per rung and none across them: a match on the words and a match on a shared dictionary
     * sense are not the same evidence.
     */
    private static String rungs(final MatchedTerms matched) {
        final StringBuilder table = new StringBuilder(String.format(
                "%n## How the two sides were made to meet%n%n"
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

    private static String stated(final TermSighting sighting) {
        return sighting.concepts().stream().map(SkosConcept::prefLabel).distinct()
                .collect(Collectors.joining(", "));
    }

    private static double share(final int part, final int whole) {
        return whole == 0 ? 0.0 : 100.0 * part / whole;
    }
}
