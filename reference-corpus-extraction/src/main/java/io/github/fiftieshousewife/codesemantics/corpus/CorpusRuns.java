package io.github.fiftieshousewife.codesemantics.corpus;

import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.clones.RepositoryManifest;
import io.github.fiftieshousewife.codesemantics.engine.reading.CitedWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.LegibilityReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.CollocatedWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.EveryPublishedRun;
import io.github.fiftieshousewife.codesemantics.engine.theme.PublishedPhrases;

/**
 * How densely working Java writes each run of words a publisher states as one entry, pooled over the same
 * drawn repositories the word table is pooled over.
 *
 * <p>It reads under {@link EveryPublishedRun} rather than under the index a reading uses. A run the index
 * does not state is never merged and so never counted, so a table asked how often working Java writes
 * {@code CapFloor} has to be pooled under an index that states {@code cap_floor} — otherwise every term a
 * vocabulary publishes and no dictionary carries would read as absent from the corpus whatever the corpus
 * writes.
 *
 * <p>Each repository's shares are taken again over its runs alone, so the table is a distribution over runs
 * and a run's rank is read against other runs. Nothing in the word arm reads it: the word table states every
 * unit a reading produces, runs included, and is untouched by this.
 */
public final class CorpusRuns {

    private final PooledWords written;

    public CorpusRuns(final PooledWords written) {
        this.written = written;
    }

    public static CorpusRuns newInstance() {
        return new CorpusRuns(new PooledWords(new LegibilityReading(
                CitedWords.fromClasspath(),
                IdentifierWords.fromClasspath(),
                new CollocatedWords(EveryPublishedRun.newInstance(), ContentWords.fromClasspath()))));
    }

    /** Each pinned repository's runs on its own, in the order the manifest pins them. */
    public List<CountedRepository> each(final RepositoryManifest manifest, final Path corpus) {
        return written.each(manifest, corpus).stream().map(CorpusRuns::runsOf).toList();
    }

    /** The same repositories pooled, which is what the run table is written from. */
    public CorpusWords over(final RepositoryManifest manifest, final Path corpus) {
        return PooledWords.pooling(each(manifest, corpus));
    }

    /**
     * One repository's tally with every single word left behind. Its shares are taken again over what is
     * left, so a run's share is a share of the runs that repository wrote.
     */
    static CountedRepository runsOf(final CountedRepository counted) {
        return new CountedRepository(counted.name(),
                counted.declared().retaining(PublishedPhrases::isARun));
    }
}
