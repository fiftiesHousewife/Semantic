package org.fifties.housewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * What a term index found in a repository's declared names, and everything needed to judge whether finding it
 * meant anything.
 *
 * <p>The rate is reported per thousand declared names rather than as a count, because a count says as much
 * about how large a repository is as about what it writes. The split by term length is reported beside it
 * because that split is the measurement: a taxonomy matching a repository outside its domain does so almost
 * entirely on one-word terms, so a rate that survives being read by length is a different claim from one that
 * does not.
 *
 * <p>The files nothing matched in are carried for the same reason a legibility reading carries its
 * denominator. A vocabulary firing hard in three files and nowhere else is a fact about those three files.
 *
 * <p>It can be asked for one rung of the ladder at a time and it has no method that sums across them. A term
 * found in the words a repository wrote and a term found in what the dictionary says those words mean are
 * different strengths of evidence, and one figure covering both would be read as the stronger.
 */
public record MatchedTerms(List<TermSighting> sightings, int namesRead, int filesRead, int filesMatched,
                           Map<TermRung, Integer> filesMatchedByRung,
                           Map<List<String>, Integer> restatedTypes) {

    public MatchedTerms {
        sightings = List.copyOf(sightings);
        filesMatchedByRung = Map.copyOf(filesMatchedByRung);
        restatedTypes = Map.copyOf(restatedTypes);
    }

    /**
     * The same reading with only what one rung of the ladder answered, over the same denominators — the names
     * and the files are what every rung was offered, and only what was found on them narrows.
     */
    public MatchedTerms at(final TermRung rung) {
        final int files = filesMatchedByRung.getOrDefault(rung, 0);
        return new MatchedTerms(sightings.stream().filter(sighting -> sighting.rung() == rung).toList(),
                namesRead, filesRead, files, Map.of(rung, files), restatedTypes);
    }

    /** How many spans were the declaration's own type spelled again, and so are not terms anyone reached for. */
    public int spansRestatingTheirType() {
        return restatedTypes.values().stream().mapToInt(Integer::intValue).sum();
    }

    /** What that rule removed, most-removed first — the list a reader argues with term by term. */
    public List<Map.Entry<List<String>, Integer>> restatedTypesByCount(final int held) {
        return restatedTypes.entrySet().stream()
                .sorted(Map.Entry.<List<String>, Integer>comparingByValue().reversed()
                        .thenComparing(entry -> String.join(" ", entry.getKey())))
                .limit(held)
                .toList();
    }

    public int spansFound() {
        return sightings.stream().mapToInt(TermSighting::occurrences).sum();
    }

    public int distinctTerms() {
        return sightings.size();
    }

    /** The rate a repository in the domain has to beat one outside it on, and the reason it is a rate. */
    public double perThousandNames() {
        return spansFound() * 1000.0 / namesRead;
    }

    /** How many spans each term length accounted for, shortest first. */
    public Map<Integer, Integer> spansByLength() {
        return new TreeMap<>(sightings.stream().collect(Collectors.groupingBy(TermSighting::length,
                Collectors.summingInt(TermSighting::occurrences))));
    }

    /** The terms carrying the most, which is how often they were written weighed by how much they narrow. */
    public List<TermSighting> byMass(final int held) {
        return sightings.stream()
                .sorted(Comparator.comparingDouble(TermSighting::mass).reversed())
                .limit(held)
                .toList();
    }

    /**
     * Every term written in more than one word, most-written first. They are reported in full rather than
     * ranked and truncated because they are the ones the measurement rests on, and out of domain there are
     * few enough to read at a glance — which is itself the finding.
     */
    public List<TermSighting> longerThanOneWord() {
        return sightings.stream()
                .filter(sighting -> sighting.length() > 1)
                .sorted(Comparator.comparingDouble(TermSighting::mass).reversed())
                .toList();
    }

    public int filesWithNoMatch() {
        return filesRead - filesMatched;
    }
}
