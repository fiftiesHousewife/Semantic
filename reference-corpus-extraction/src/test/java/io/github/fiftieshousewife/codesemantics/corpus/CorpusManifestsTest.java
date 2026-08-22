package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.clones.PinnedRepository;
import io.github.fiftieshousewife.codesemantics.clones.RepositoryManifest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusManifestsTest {

    private static final int SHA_LENGTH = 40;

    private List<PinnedRepository> drawn(final String draw) {
        return ReferenceCorpus.drawn(draw).repositories();
    }

    @Test
    void statesEveryDrawItRecordsWithACommitForEachRepository() {
        assertAll(
                () -> assertThat(drawn(ReferenceCorpus.UNIFORM_DRAW))
                        .as("a manifest stating nothing demotes nothing, which reads exactly like a "
                                + "reference that found nothing to demote")
                        .hasSize(10),
                () -> assertThat(drawn(ReferenceCorpus.STARRED_DRAW)).hasSize(10),
                () -> assertThat(drawn(ReferenceCorpus.PUBLISHED_DRAW)).hasSize(30),
                () -> assertAll(drawn(ReferenceCorpus.PUBLISHED_DRAW).stream().map(repository -> () ->
                        assertThat(repository.sha())
                                .as("%s is read at one commit, never at whatever its branch says today",
                                        repository.name())
                                .hasSize(SHA_LENGTH))));
    }

    @Test
    void drawsNoRepositoryTwiceAcrossTheThreeFrames() {
        final List<String> uniform = drawn(ReferenceCorpus.UNIFORM_DRAW).stream()
                .map(PinnedRepository::origin).toList();
        final List<String> starred = drawn(ReferenceCorpus.STARRED_DRAW).stream()
                .map(PinnedRepository::origin).toList();
        final List<String> published = drawn(ReferenceCorpus.PUBLISHED_DRAW).stream()
                .map(PinnedRepository::origin).toList();

        assertAll(
                () -> assertThat(uniform).doesNotContainAnyElementsOf(starred),
                () -> assertThat(uniform).doesNotContainAnyElementsOf(published),
                () -> assertThat(starred).doesNotContainAnyElementsOf(published));
    }

    @Test
    void statesALicenceForEveryRepositoryOfTheDrawThatRequiredOne() {
        assertThat(drawn(ReferenceCorpus.PUBLISHED_DRAW))
                .as("the published frame requires a licence GitHub recognises, so none may read `none`")
                .extracting(PinnedRepository::licence)
                .doesNotContain("none");
    }
}
