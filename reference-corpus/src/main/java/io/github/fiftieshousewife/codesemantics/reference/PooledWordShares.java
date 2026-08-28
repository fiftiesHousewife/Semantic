package io.github.fiftieshousewife.codesemantics.reference;

import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Stream;

/**
 * What a drawn sample of working Java repositories is written in, as shares over the words they declare.
 *
 * <p>The bundled table is pooled as the mean of each repository's own shares, so every repository weighs the
 * same whatever its size. That is the population the sample was drawn from — the frame draws repositories,
 * not bytes — and it is the weighting no single repository can dominate. The table's own header states which
 * draw produced it, under what frame, and at what seed.
 *
 * <p>It states every unit a reading produces, a run of words a publisher merged included, because that is
 * what a reading looks a word up as. {@link PooledRunShares} is the separate table over runs alone.
 */
public final class PooledWordShares {

    private static final String RESOURCE = "/reference-corpus-shares.tsv";
    private static final String COLUMNS = "word, occurrences, share";

    private final PooledTable pooled;

    public PooledWordShares(final Stream<String> rows) {
        this.pooled = new PooledTable(rows, COLUMNS);
    }

    private PooledWordShares(final PooledTable pooled) {
        this.pooled = pooled;
    }

    /** The table this module bundles. */
    public static PooledWordShares fromClasspath() {
        return new PooledWordShares(PooledTable.onTheClasspath(RESOURCE, COLUMNS));
    }

    /** A table at a path, so a candidate corpus can be read before anything decides to bundle it. */
    public static PooledWordShares at(final Path table) {
        return new PooledWordShares(PooledTable.at(table, COLUMNS));
    }

    /** What the corpus is written in, as shares over words summing to one. */
    public Map<String, Double> shareByWord() {
        return pooled.shareByUnit();
    }

    /** How densely the corpus writes the word, and zero for a word it never wrote. */
    public double shareOf(final String word) {
        return pooled.shareOf(word);
    }

    /**
     * How many times the pooled repositories declared the word, summed over all of them and independent of
     * the weighting. It is the count an occurrence floor is read against, where a share is not.
     */
    public int occurrencesOf(final String word) {
        return pooled.occurrencesOf(word);
    }

    /**
     * The standard error the table states for the word's share — the between-repository error of the mean,
     * scaled the way the shares are. Zero where the table states none, and zero for a word the corpus never
     * wrote: an absence has no sampling error, because every draw agrees on it.
     */
    public double errorOf(final String word) {
        return pooled.errorOf(word);
    }
}
