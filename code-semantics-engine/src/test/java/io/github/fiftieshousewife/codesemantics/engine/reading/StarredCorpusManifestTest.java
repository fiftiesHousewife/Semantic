package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StarredCorpusManifestTest {

    private static final Path STARRED = Path.of("src/test/resources/reference-corpus-starred.tsv");
    private static final int DRAWN = 10;

    @Test
    void readsTheSecondSampleThroughTheSameReaderAsTheFirst() {
        final List<PinnedRepository> starred = RepositoryManifest.at(STARRED).repositories();

        assertAll(
                () -> assertThat(starred).hasSize(DRAWN),
                () -> assertThat(starred).extracting(PinnedRepository::name)
                        .doesNotContainAnyElementsOf(RepositoryManifest.bundledCorpus().repositories()
                                .stream().map(PinnedRepository::name).toList()));
    }
}
