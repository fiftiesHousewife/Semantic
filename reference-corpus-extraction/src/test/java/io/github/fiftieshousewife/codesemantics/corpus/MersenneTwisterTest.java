package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.clones.PinnedRepository;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class MersenneTwisterTest {

    private static final long SEED = 20260821L;

    private List<Long> ranks(final long frame, final int count) {
        final MersenneTwister drawing = new MersenneTwister(SEED);
        return IntStream.range(0, count).mapToObj(each -> drawing.below(frame)).toList();
    }

    private List<Long> recorded(final String draw) {
        return ReferenceCorpus.drawn(draw).repositories().stream()
                .map(PinnedRepository::rank)
                .toList();
    }

    @Test
    void reproducesTheRanksTheUniformManifestRecords() {
        assertThat(ranks(4154178L, 10))
                .as("the manifest states that this seed reproduces its ranks; a generator that did not "
                        + "would falsify every row already committed")
                .containsExactlyElementsOf(recorded(ReferenceCorpus.UNIFORM_DRAW));
    }

    @Test
    void reproducesTheRanksTheStarredManifestRecords() {
        assertThat(ranks(28261L, 10))
                .containsExactlyElementsOf(recorded(ReferenceCorpus.STARRED_DRAW));
    }

    @Test
    void drawsEveryRankTheseFramesRecordedWithoutFoldingAnyBackByARemainder() {
        assertAll(
                () -> assertThat(new MersenneTwister(SEED).below(4154178L)).isEqualTo(4140166L),
                () -> assertThat(new MersenneTwister(1L).below(604L)).isBetween(0L, 603L),
                () -> assertThat(new MersenneTwister(SEED).bits(32)).isBetween(0L, 0xFFFFFFFFL));
    }
}
