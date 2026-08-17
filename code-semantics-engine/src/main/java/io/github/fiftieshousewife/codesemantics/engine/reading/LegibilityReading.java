package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.theme.CollocatedWords;

/**
 * Reads a working tree's Java sources and reports how much of what they are written in some bundled resource
 * can be cited for — legibility λ, taken by a lexical scan.
 *
 * <p>It is not a git read: nothing is pinned by a commit SHA, no permalink is rendered, and no vote is cast,
 * because a vote requires an anchor and an anchor requires a revision. It counts, cites and abstains.
 */
public final class LegibilityReading {

    private static final String REPOSITORY = "repository";

    private final CitedWords cited;
    private final IdentifierWords words;
    private final PublishedRuns runs;

    public LegibilityReading(final CitedWords cited, final IdentifierWords words,
                             final PublishedRuns runs) {
        this.cited = cited;
        this.words = words;
        this.runs = runs;
    }

    public static LegibilityReading fromClasspath() {
        return new LegibilityReading(CitedWords.fromClasspath(), IdentifierWords.fromClasspath(),
                CollocatedWords.fromClasspath());
    }

    /** Reads every scope, and the same occurrences again as one repository-wide scope. */
    public RepositoryLegibility of(final ParsedRepository parsed) {
        final long startedAt = System.nanoTime();
        final LegibilityTally repository = new LegibilityTally(cited, words, runs);
        final Map<String, LegibilityTally> byScope = new LinkedHashMap<>();
        final Map<String, Integer> filesByScope = new LinkedHashMap<>();
        parsed.files().forEach(file -> {
            final LegibilityTally tally =
                    byScope.computeIfAbsent(file.scope(), scope -> new LegibilityTally(cited, words, runs));
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
