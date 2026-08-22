package io.github.fiftieshousewife.codesemantics.corpus;

import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.clones.PinnedRepository;
import io.github.fiftieshousewife.codesemantics.clones.RepositoryManifest;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.LegibilityReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import lombok.extern.slf4j.Slf4j;

/**
 * The declared names of every repository a manifest pins, summed into one tally.
 *
 * <p>Read by the path this library reads itself with — the same walk, the same parse, the same splitter, and
 * the stage that leaves out the sentences a repository wrote about its names. Both sides of the comparison
 * are therefore made the same way, which is the only thing that makes a share here comparable to a share
 * there.
 *
 * <p>One repository at a time, and each tally is merged and discarded before the next tree is parsed. A
 * corpus is a gigabyte of source and thirty tallies held at once is most of a heap.
 */
@Slf4j
public final class PooledWords {

    private final LegibilityReading reading;

    public PooledWords(final LegibilityReading reading) {
        this.reading = reading;
    }

    public static PooledWords fromClasspath() {
        return new PooledWords(LegibilityReading.fromClasspath());
    }

    /** Every pinned repository's declared names as one tally, read from the clones beneath a directory. */
    public WrittenWords over(final RepositoryManifest manifest, final Path corpus) {
        log.info("Pooling {} repositories under {}", manifest.repositories().size(), corpus);
        return manifest.repositories().stream()
                .map(repository -> counted(repository, corpus))
                .reduce(new WrittenWords(), PooledWords::pooled);
    }

    /** One tree's declared names, with the sentences it wrote about them left out. */
    public WrittenWords of(final Path tree) {
        return reading.of(ParsedRepository.of(tree, RepositoryReading.scopesUnder(tree)))
                .repository()
                .written()
                .asNamesOnly();
    }

    private WrittenWords counted(final PinnedRepository repository, final Path corpus) {
        final WrittenWords names = of(repository.under(corpus));
        log.info("{} at {}: {} words, {} occurrences", repository.name(), repository.sha(),
                names.words().size(), names.totalOccurrences());
        return names;
    }

    private static WrittenWords pooled(final WrittenWords running, final WrittenWords next) {
        return WrittenWords.pooling(List.of(running, next));
    }
}
