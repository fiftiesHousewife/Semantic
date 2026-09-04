package io.github.fiftieshousewife.codesemantics.reference;

import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Stream;

/**
 * What a drawn sample of working Java repositories is written in, as shares over the runs of words they
 * declare — {@code time_zone}, {@code mime_type}, {@code resource_type}.
 *
 * <p>It answers one question {@link PooledWordShares} cannot: whether a run a publisher states as a term is
 * that publisher's own vocabulary or is what every Java repository writes anyway. A run this table states
 * often is ordinary software vocabulary whatever taxonomy carries it; a run it never states is the
 * publisher's.
 *
 * <p>Drawn from the same hundred repositories, at the same commits, under the same frame and seed, and
 * pooled under an index that states the bundled term vocabularies' own labels as well as the dictionaries'
 * collocations — a run no index states is never merged and so would read as absent whatever the corpus
 * writes. It is a second table and not a replacement: nothing in the word path reads it, and the word table
 * is untouched by it.
 */
public final class PooledRunShares {

    private static final String RESOURCE = "/reference-corpus-run-shares.tsv";
    private static final String COLUMNS = "run, occurrences, share";

    private final PooledTable pooled;

    public PooledRunShares(final Stream<String> rows) {
        this.pooled = new PooledTable(rows, COLUMNS);
    }

    private PooledRunShares(final PooledTable pooled) {
        this.pooled = pooled;
    }

    /** The table this module bundles. */
    public static PooledRunShares fromClasspath() {
        return new PooledRunShares(PooledTable.onTheClasspath(RESOURCE, COLUMNS));
    }

    /** A table at a path, so a candidate corpus can be read before anything decides to bundle it. */
    public static PooledRunShares at(final Path table) {
        return new PooledRunShares(PooledTable.at(table, COLUMNS));
    }

    /** What the corpus writes as runs, as shares over runs summing to one. */
    public Map<String, Double> shareByRun() {
        return pooled.shareByUnit();
    }

    /** How densely the corpus writes the run, and zero for a run it never wrote. */
    public double shareOf(final String run) {
        return pooled.shareOf(run);
    }

    /**
     * How many times the pooled repositories declared the run, summed over all of them and independent of
     * the weighting. It is the count an occurrence floor is read against, where a share is not.
     */
    public int occurrencesOf(final String run) {
        return pooled.occurrencesOf(run);
    }

    /**
     * The standard error the table states for the run's share, scaled the way the shares are. Zero where the
     * table states none, and zero for a run the corpus never wrote.
     */
    public double errorOf(final String run) {
        return pooled.errorOf(run);
    }
}
