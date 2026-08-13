package org.fifties.housewife.codesemantics.engine.reading;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.parse.ParsedFile;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;

/**
 * Reads a working tree's Java sources and reports how much of what they are written in some bundled resource
 * can be cited for. This is the plan's legibility λ, taken over a working tree by a lexical scan — the
 * cheapest honest reading the library can make of itself before the parse, the store and the concept
 * resolution land.
 *
 * <p>What it is not: it is not a git read, so nothing here is pinned by a commit SHA and no permalink is
 * rendered, and it casts no votes, because a vote requires an anchor and an anchor requires a revision. It
 * counts, cites and abstains.
 */
public final class LegibilityReading {

    private static final String REPOSITORY = "repository";

    private final CitedWords cited;
    private final IdentifierWords words;

    public LegibilityReading(final CitedWords cited, final IdentifierWords words) {
        this.cited = cited;
        this.words = words;
    }

    public static LegibilityReading fromClasspath() {
        return new LegibilityReading(CitedWords.fromClasspath(), IdentifierWords.fromClasspath());
    }

    /** Reads every scope, and the same occurrences again as one repository-wide scope. */
    public RepositoryLegibility of(final ParsedRepository parsed) {
        final long startedAt = System.nanoTime();
        final LegibilityTally repository = new LegibilityTally(cited, words);
        final Map<String, LegibilityTally> byScope = new LinkedHashMap<>();
        final Map<String, Integer> filesByScope = new LinkedHashMap<>();
        parsed.files().forEach(file -> {
            final LegibilityTally tally =
                    byScope.computeIfAbsent(file.scope(), scope -> new LegibilityTally(cited, words));
            filesByScope.merge(file.scope(), 1, Integer::sum);
            file.occurrences().forEach(occurrence -> {
                tally.add(file.path(), occurrence);
                repository.add(file.path(), occurrence);
            });
        });
        final List<ScopeLegibility> readings = byScope.entrySet().stream()
                .map(scope -> scope.getValue().reading(scope.getKey(), filesByScope.get(scope.getKey())))
                .toList();
        return new RepositoryLegibility(readings, repository.reading(REPOSITORY, parsed.files().size()),
                Duration.ofNanos(System.nanoTime() - startedAt));
    }
}
