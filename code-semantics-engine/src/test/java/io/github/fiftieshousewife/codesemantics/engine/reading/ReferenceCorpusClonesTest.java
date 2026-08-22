package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReferenceCorpusClonesTest {

    private static final int DRAWN = 10;
    private static final int SHA_LENGTH = 40;

    @Test
    void statesTenRepositoriesEachPinnedToACommit() {
        final List<PinnedRepository> repositories = RepositoryManifest.bundledCorpus().repositories();

        assertAll(
                () -> assertThat(repositories)
                        .as("a manifest stating nothing demotes nothing, which reads exactly like a "
                                + "reference that found nothing to demote")
                        .hasSize(DRAWN),
                () -> assertAll(repositories.stream().map(repository -> () ->
                        assertThat(repository.sha())
                                .as("%s is read at one commit, never at whatever its branch says today",
                                        repository.name())
                                .hasSize(SHA_LENGTH))));
    }

    /**
     * The fetch itself, which reaches the network and so is not part of any ordinary run. The manifest names
     * the draw, so pointing this at another manifest fetches another sample and nothing else changes.
     */
    @Test
    @Tag("backtest")
    void fetchesEveryRepositoryAtTheCommitTheManifestPins() {
        final Path corpus = ReferenceCorpus.directory();

        assertAll(ReferenceCorpus.manifest().repositories().stream().map(repository -> () -> {
            final PinnedClone clone = new PinnedClone(repository);
            assertThat(clone.head(clone.under(corpus)))
                    .as("%s is read at %s", repository.name(), repository.sha())
                    .isEqualTo(repository.sha());
        }));
    }
}
