package io.github.fiftieshousewife.codesemantics.reference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/**
 * The runs of the reference corpus in the order it writes them: rank 1 is the run working Java writes most
 * densely, {@link #UNKNOWN_RANK} marks a run the corpus never wrote at all.
 *
 * <p>Rank is row position, which the table fixes rather than this class: the rows are written densest first
 * and two runs of exactly equal share are ordered by their own spelling, so the same file gives the same
 * rank on every machine. The provenance header is skipped rather than counted, because a table that states
 * where it came from must not shift every rank by saying so.
 *
 * <p>It is what {@code log(rank) / log(size)} is read off, so the scale a run's specificity is bounded by is
 * the table's own length and not a chosen constant.
 */
public final class RunRanks {

    public static final int UNKNOWN_RANK = 0;

    private static final String RESOURCE = "/reference-corpus-run-shares.tsv";

    private static final String COMMENT = "#";
    private static final String COLUMN = "\t";

    private final Map<String, Integer> ranksByRun;

    RunRanks(final Map<String, Integer> ranksByRun) {
        this.ranksByRun = Map.copyOf(ranksByRun);
    }

    public static RunRanks fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Whether the corpus writes this run at all. */
    public boolean knows(final String run) {
        return rank(run) != UNKNOWN_RANK;
    }

    public int rank(final String run) {
        return ranksByRun.getOrDefault(run.toLowerCase(Locale.ROOT), UNKNOWN_RANK);
    }

    /** How many runs the table holds, which is the length the specificity scale is bounded by. */
    public int size() {
        return ranksByRun.size();
    }

    private static RunRanks load() {
        final InputStream stream = Objects.requireNonNull(
                RunRanks.class.getResourceAsStream(RESOURCE), RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            final Map<String, Integer> ranks = new HashMap<>();
            reader.lines()
                    .map(String::strip)
                    .filter(line -> !line.isEmpty() && !line.startsWith(COMMENT))
                    .map(row -> row.split(COLUMN, -1)[0])
                    .forEach(run -> ranks.putIfAbsent(run.toLowerCase(Locale.ROOT), ranks.size() + 1));
            return new RunRanks(ranks);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to read %s",
                    RESOURCE), e);
        }
    }

    private static final RunRanks CLASSPATH_DEFAULTS = load();
}
