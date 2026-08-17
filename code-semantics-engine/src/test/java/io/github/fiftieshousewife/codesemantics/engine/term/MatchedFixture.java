package io.github.fiftieshousewife.codesemantics.engine.term;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.InjectedTaxonomy;

/**
 * A saved set of matches, resolved back to the concepts of the taxonomy that states them.
 *
 * <p>The file records the run of words a span was matched on rather than the concept it reached, and a run
 * reaches its concept through whichever rung answered. Looking it up by spelling alone loses every match a
 * dictionary form made: Apache Tika's 666 spans of <em>parse</em> are CSO's {@code parsing}, and 43 of its
 * 91 runs are no label CSO publishes. Putting the runs back through the same ladder is what returns the mass
 * to the label the publisher wrote.
 */
final class MatchedFixture {

    private static final String COLUMN = "\t";

    private static final String COMMENT = "#";

    private final List<TermIndex> ladder;

    private final IdentifierWords words;

    MatchedFixture(final InjectedTaxonomy taxonomy) {
        final TermIndex published = InjectedIndexes.of(taxonomy);
        this.ladder = List.of(published,
                NormalisedTerms.over(published, LemmaRuns.fromClasspath()),
                NormalisedTerms.over(published, SenseRuns.fromClasspath()));
        this.words = IdentifierWords.fromClasspath();
    }

    /** How often the repository wrote each concept, by the label the taxonomy states it under. */
    Map<String, Integer> writtenByConcept(final String resource) {
        final Map<String, Integer> written = new HashMap<>();
        rowsIn(resource).forEach(row -> conceptsOf(row.term())
                .forEach(concept -> written.merge(concept.prefLabel(), row.occurrences(), Integer::sum)));
        return written;
    }

    /** What the file records as matched that reaches no concept of the taxonomy, most-written first. */
    List<String> unresolvedIn(final String resource) {
        return rowsIn(resource).stream()
                .filter(row -> conceptsOf(row.term()).isEmpty())
                .sorted(java.util.Comparator.comparingInt(Row::occurrences).reversed())
                .map(row -> row.term() + " " + row.occurrences())
                .toList();
    }

    /** How many concepts each run reaches, which is where one run standing for several shows up. */
    Map<String, Integer> conceptsPerRun(final String resource) {
        final Map<String, Integer> reached = new java.util.LinkedHashMap<>();
        rowsIn(resource).forEach(row -> reached.put(row.term(), conceptsOf(row.term()).size()));
        return reached;
    }

    /** The narrowest rung that answers is the one that answers, which is the order the reading asks in. */
    private List<SkosConcept> conceptsOf(final String term) {
        final List<String> run = words.of(term).words();
        return ladder.stream().map(rung -> rung.conceptsOf(run))
                .filter(found -> !found.isEmpty())
                .findFirst().orElse(List.of());
    }

    private record Row(String term, int occurrences) {
    }

    private static List<Row> rowsIn(final String resource) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                Objects.requireNonNull(MatchedFixture.class.getResourceAsStream(resource), resource),
                StandardCharsets.UTF_8))) {
            return reader.lines().filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .map(line -> line.split(COLUMN))
                    .map(row -> new Row(row[0], Integer.parseInt(row[1])))
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
