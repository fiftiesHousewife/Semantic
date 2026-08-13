package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;

/**
 * Reads a working tree's Java sources and reports how much of what they are written in some bundled resource
 * can be cited for. This is the plan's legibility λ, taken over a working tree by a lexical scan — the
 * cheapest honest reading the library can make of itself before the parse, the store and the concept
 * resolution land.
 *
 * <p>What it is not: it is not a parse, so no reading here belongs to a declaration; it is not a git read, so
 * nothing here is pinned by a commit SHA and no permalink is rendered; and it casts no votes, because a vote
 * requires an anchor and an anchor requires a revision. It counts, cites and abstains.
 */
public final class LegibilityReading {

    private static final String REPOSITORY = "repository";

    private final JavaSourceIdentifiers identifiers;
    private final CitedWords cited;
    private final IdentifierWords words;
    private final JavaLanguageKeywords keywords;

    public LegibilityReading(final JavaSourceIdentifiers identifiers, final CitedWords cited,
                             final IdentifierWords words, final JavaLanguageKeywords keywords) {
        this.identifiers = identifiers;
        this.cited = cited;
        this.words = words;
        this.keywords = keywords;
    }

    public static LegibilityReading fromClasspath() {
        return new LegibilityReading(new JavaSourceIdentifiers(), CitedWords.fromClasspath(),
                IdentifierWords.fromClasspath(), new JavaLanguageKeywords());
    }

    /** Reads every scope, and the same occurrences again as one repository-wide scope. */
    public RepositoryLegibility of(final Path root, final List<SourceScope> scopes) {
        final long startedAt = System.nanoTime();
        final LegibilityTally repository = new LegibilityTally(cited, words, keywords);
        final List<ScopeLegibility> readings = scopes.stream()
                .map(scope -> read(root, scope, repository))
                .toList();
        return new RepositoryLegibility(readings,
                repository.reading(REPOSITORY, readings.stream().mapToInt(ScopeLegibility::files).sum()),
                Duration.ofNanos(System.nanoTime() - startedAt));
    }

    private ScopeLegibility read(final Path root, final SourceScope scope, final LegibilityTally repository) {
        final LegibilityTally tally = new LegibilityTally(cited, words, keywords);
        scope.files().forEach(file -> {
            final String site = root.relativize(file).toString();
            identifiers.in(contentOf(file)).forEach(occurrence -> {
                tally.add(site, occurrence);
                repository.add(site, occurrence);
            });
        });
        return tally.reading(scope.name(), scope.files().size());
    }

    private static String contentOf(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }
}
