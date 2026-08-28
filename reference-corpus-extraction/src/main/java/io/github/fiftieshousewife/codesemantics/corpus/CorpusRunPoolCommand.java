package io.github.fiftieshousewife.codesemantics.corpus;

import java.nio.file.Path;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

/**
 * Pools the runs of every repository a manifest pins into the tables a published term is judged against —
 * one per {@link CorpusPooling}, from a single read of the corpus.
 *
 * <p>A second read of the same clones, and not a second table off the first: the runs are merged under an
 * index the word tables are not pooled under, so the two cannot come from one pass. Properties are the pool
 * command's — {@code cs.corpus.dir}, {@code cs.corpus.manifest} and {@code cs.corpus.out}.
 */
@Slf4j
public final class CorpusRunPoolCommand {

    private CorpusRunPoolCommand() {
    }

    public static void main(final String[] arguments) {
        final Path corpus = ReferenceCorpus.directory();
        final DrawnManifest draw = ReferenceCorpus.drawnManifest();
        final Path out = PooledTables.directory();
        final CorpusWords pooled = CorpusRuns.newInstance().over(draw.manifest(), corpus);
        log.info("{} repositories, {} runs, {} occurrences from {}", pooled.repositories(),
                pooled.words().size(), pooled.totalOccurrences(), draw.name());
        Stream.of(CorpusPooling.values()).forEach(pooling -> write(out, pooled, draw, pooling));
    }

    private static void write(final Path out, final CorpusWords pooled, final DrawnManifest draw,
                              final CorpusPooling pooling) {
        final Path table = out.resolve(pooling.runFileName());
        PooledTables.write(table, new PooledRunsTsv().render(pooled, draw, pooling));
        log.info("{} written to {}", pooling, table);
    }
}
