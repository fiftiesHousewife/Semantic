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
 * The declared names of every repository a manifest pins, read once each.
 *
 * <p>Read by the path this library reads itself with — the same walk, the same parse, the same splitter, and
 * the stage that leaves out the sentences a repository wrote about its names. Both sides of the comparison
 * are therefore made the same way, which is the only thing that makes a share here comparable to a share
 * there.
 *
 * <p>The tallies are kept rather than folded away, so every prefix of the draw and every leave-one-out costs
 * arithmetic instead of a second read. The parse is a gigabyte of source and minutes; thirty tallies of a
 * few thousand words each are a few megabytes.
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

    /** Each pinned repository's declared names on its own, in the order the manifest pins them. */
    public List<CountedRepository> each(final RepositoryManifest manifest, final Path corpus) {
        log.info("Reading {} repositories under {}", manifest.repositories().size(), corpus);
        return manifest.repositories().stream()
                .map(repository -> counted(repository, corpus))
                .toList();
    }

    /** The same repositories summed, which is what a reference is read from. */
    public CorpusWords over(final RepositoryManifest manifest, final Path corpus) {
        return pooling(each(manifest, corpus));
    }

    /** Those tallies as one corpus. */
    public static CorpusWords pooling(final List<CountedRepository> drawn) {
        final CorpusWords pooled = new CorpusWords();
        drawn.forEach(repository -> pooled.add(repository.declared()));
        return pooled;
    }

    /** One tree's declared names, with the sentences it wrote about them left out. */
    public WrittenWords of(final Path tree) {
        return reading.of(ParsedRepository.of(tree, RepositoryReading.scopesUnder(tree)))
                .repository()
                .written()
                .asNamesOnly();
    }

    private CountedRepository counted(final PinnedRepository repository, final Path corpus) {
        final WrittenWords names = of(repository.under(corpus));
        log.info("{} at {}: {} words, {} occurrences", repository.name(), repository.sha(),
                names.words().size(), names.totalOccurrences());
        return new CountedRepository(repository.name(), names);
    }
}
