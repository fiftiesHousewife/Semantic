package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * The term reading as a person reads it: the rate, the rate split by how many words a term is written in, and
 * the terms carrying the most with somewhere to go and check each one.
 *
 * <p>The split is printed whether or not it flatters the reading, because it is the split that decides. One
 * word matched at a high rate is what a taxonomy does to a repository it knows nothing about.
 */
public class TermReport {

    public String render(final String source, final MatchedTerms matched, final int held) {
        return rate(source, matched) + String.format("%n") + byLength(matched)
                + String.format("%n## Every term of more than one word%n%n")
                + terms(matched.longerThanOneWord())
                + String.format("%n## The terms carrying the most%n%n")
                + terms(matched.byMass(held));
    }

    private static String rate(final String source, final MatchedTerms matched) {
        return String.format("**%s** publishes terms this repository writes **%.2f times per thousand "
                        + "declared names** — %,d spans over %,d names, on %,d distinct terms. They appear in "
                        + "%,d of %,d files, so **%,d files match nothing at all**.%n",
                source, matched.perThousandNames(), matched.spansFound(), matched.namesRead(),
                matched.distinctTerms(), matched.filesMatched(), matched.filesRead(),
                matched.filesWithNoMatch());
    }

    private static String byLength(final MatchedTerms matched) {
        final StringBuilder table = new StringBuilder(
                String.format("| Words in the term | Spans | Share |%n|--:|--:|--:|%n"));
        matched.spansByLength().forEach((length, spans) -> table.append(String.format("| %d | %,d | %.1f%% |%n",
                length, spans, 100.0 * spans / matched.spansFound())));
        return table.toString();
    }

    private static String terms(final List<TermSighting> sightings) {
        final StringBuilder table = new StringBuilder(String.format(
                "| Term | Written | Worth | Carries | Stated as | Site |%n|---|--:|--:|--:|---|---|%n"));
        sightings.forEach(sighting -> table.append(String.format(
                "| `%s` | %,d | %.3f | %.2f | %s | `%s` |%n",
                sighting.term(), sighting.occurrences(), sighting.specificity(), sighting.mass(),
                stated(sighting.concepts()), sighting.firstSite())));
        return table.toString();
    }

    private static String stated(final List<SkosConcept> concepts) {
        return concepts.stream().map(concept -> "`" + concept.prefLabel() + "`").distinct()
                .reduce((first, second) -> first + ", " + second).orElse("");
    }
}
