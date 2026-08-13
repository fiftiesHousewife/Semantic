package org.fifties.housewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * The term reading as a person reads it: what each rung of the ladder found, the rate split by how many words
 * a term is written in, and the terms carrying the most with somewhere to go and check each one.
 *
 * <p><b>One section per rung and no total.</b> A term found in the words a repository wrote and a term found
 * in what the dictionary says those words mean are different strengths of evidence; a single rate covering
 * both would be read as the stronger one, so this report does not offer one.
 *
 * <p>The split by length is printed whether or not it flatters the reading, because it is the split that
 * decides. One word matched at a high rate is what a taxonomy does to a repository it knows nothing about.
 */
public class TermReport {

    public String render(final String source, final MatchedTerms matched, final int held) {
        return offered(source, matched) + Arrays.stream(TermRung.values())
                .map(rung -> rung(source, matched.at(rung), rung, held))
                .collect(Collectors.joining());
    }

    private static String offered(final String source, final MatchedTerms matched) {
        return String.format("**%s** was offered %,d declared names across %,d files, and %,d of those files "
                        + "match nothing on any rung.%n",
                source, matched.namesRead(), matched.filesRead(), matched.filesWithNoMatch());
    }

    private String rung(final String source, final MatchedTerms matched, final TermRung rung, final int held) {
        return String.format("%n## Matched on %s%n%n", rung.normalisation())
                + rate(source, matched) + String.format("%n") + byLength(matched)
                + String.format("%n### Every term of more than one word%n%n")
                + terms(matched.longerThanOneWord())
                + String.format("%n### The terms carrying the most%n%n")
                + terms(matched.byMass(held));
    }

    private static String rate(final String source, final MatchedTerms matched) {
        return String.format("**%s** publishes terms this repository writes **%.2f times per thousand "
                        + "declared names** — %,d spans over %,d names, on %,d distinct terms. They appear in "
                        + "%,d of %,d files, so **%,d files match nothing on this rung**.%n",
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
