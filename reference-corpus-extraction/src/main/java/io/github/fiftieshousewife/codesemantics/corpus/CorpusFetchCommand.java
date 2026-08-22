package io.github.fiftieshousewife.codesemantics.corpus;

import java.nio.file.Path;

import io.github.fiftieshousewife.codesemantics.clones.PinnedClone;
import io.github.fiftieshousewife.codesemantics.clones.PinnedRepository;
import io.github.fiftieshousewife.codesemantics.clones.RepositoryManifest;

import lombok.extern.slf4j.Slf4j;

/**
 * Fetches every repository a corpus manifest pins, into the directory the run names.
 *
 * <p>It reaches the network and is never part of an ordinary build. Nothing is fetched for a tree already at
 * its pin, so a second run over the same manifest costs nothing.
 */
@Slf4j
public final class CorpusFetchCommand {

    private CorpusFetchCommand() {
    }

    public static void main(final String[] arguments) {
        final Path corpus = ReferenceCorpus.directory();
        final RepositoryManifest manifest = ReferenceCorpus.manifest();
        log.info("Fetching {} repositories into {}", manifest.repositories().size(), corpus);
        manifest.repositories().forEach(repository -> fetch(repository, corpus));
        log.info("{} repositories are at their pins under {}", manifest.repositories().size(), corpus);
    }

    private static void fetch(final PinnedRepository repository, final Path corpus) {
        final PinnedClone clone = new PinnedClone(repository);
        final Path tree = clone.under(corpus);
        final String head = clone.head(tree);
        if (!head.equals(repository.sha())) {
            throw new IllegalStateException(repository.name() + " is at " + head
                    + " where the manifest pins " + repository.sha());
        }
        log.info("{} at {} ({})", repository.name(), repository.sha(), repository.licence());
    }
}
