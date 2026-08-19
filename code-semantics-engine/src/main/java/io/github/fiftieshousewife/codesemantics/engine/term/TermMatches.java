package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * Every term one vocabulary found in a repository's declared names, admitted or removed, as one entry each.
 *
 * <p>The removed ones are the point. {@link CorroboratedReading} holds both readings so that the branch rule
 * can be judged as a comparison, and the difference between them is a set of terms the repository plainly
 * writes and the answer does not mention. Reporting only the admitted ones leaves that difference as a count
 * with nothing behind it.
 *
 * <p><b>The entries need not partition the uncorroborated reading, and the count does not either.</b>
 * {@link CorroboratedReading#refusedByBranch()} subtracts one reading's size from the other's, so a term the
 * re-read reached at a different rung nets out of it. Here the same term appears twice — refused at the rung
 * that lost it and reported at the rung that answered instead — because both are what happened.
 *
 * <p>Ordered by what each match is worth — how often it was written, weighed by how much writing it narrows
 * — so the file reads in the order that decides the answer.
 */
public final class TermMatches {

    /** Both readings of one vocabulary as one list, each entry stating which rule it survived or met. */
    public List<TermMatch> of(final String vocabulary, final CorroboratedReading reading) {
        final Set<String> admitted = keysOf(reading.matched());
        return Stream.concat(
                        reading.matched().sightings().stream()
                                .map(sighting -> match(vocabulary, sighting, TermOutcome.REPORTED)),
                        reading.every().sightings().stream()
                                .filter(sighting -> !admitted.contains(keyOf(sighting)))
                                .map(sighting -> match(vocabulary, sighting,
                                        TermOutcome.REFUSED_BY_BRANCH_RULE)))
                .sorted(Comparator.comparingDouble(TermMatch::mass).reversed()
                        .thenComparing(TermMatch::term))
                .toList();
    }

    private static TermMatch match(final String vocabulary, final TermSighting sighting,
                                   final TermOutcome outcome) {
        return new TermMatch(vocabulary, sighting.term(), sighting.length(), sighting.rung(),
                sighting.specificity(), sighting.occurrences(), outcome,
                sighting.concepts().stream().map(SkosConcept::prefLabel).toList(), sighting.sites());
    }

    /**
     * A term is one match per rung it was found at. The same words reached through the dictionary form and
     * through the words themselves are two strengths of evidence, and one key covering both would report the
     * branch rule as having removed a match it left standing.
     */
    private static Set<String> keysOf(final MatchedTerms matched) {
        return matched.sightings().stream().map(TermMatches::keyOf).collect(Collectors.toUnmodifiableSet());
    }

    private static String keyOf(final TermSighting sighting) {
        return sighting.rung().name() + " " + sighting.term();
    }
}
