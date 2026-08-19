package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReachCensusTest {

    private static KeywordReach reached(final FurthestWritten.Reach declared,
                                        final FurthestWritten.Reach prose) {
        return new KeywordReach("T1#0", "a keyword", "T1", declared, prose);
    }

    @Test
    void countsEveryKeywordIntoTheBucketItsDeclarationsReached() {
        final ReachCensus census = ReachCensus.over(List.of(
                reached(FurthestWritten.Reach.AS_THIS_RUN, FurthestWritten.Reach.NOT_WRITTEN),
                reached(FurthestWritten.Reach.AS_THIS_RUN, FurthestWritten.Reach.NOT_WRITTEN),
                reached(FurthestWritten.Reach.PARTLY_WRITTEN, FurthestWritten.Reach.NOT_WRITTEN),
                reached(FurthestWritten.Reach.NOT_WRITTEN, FurthestWritten.Reach.NOT_WRITTEN)));
        assertAll(
                () -> assertThat(census.keywords()).isEqualTo(4),
                () -> assertThat(census.declared(FurthestWritten.Reach.AS_THIS_RUN)).isEqualTo(2),
                () -> assertThat(census.declared(FurthestWritten.Reach.PARTLY_WRITTEN)).isEqualTo(1),
                () -> assertThat(census.declared(FurthestWritten.Reach.EVERY_WORD_NEVER_ADJACENT))
                        .isEqualTo(0));
    }

    @Test
    void countsWhatOnlyASentenceReachedSoAProseArmCanBePriced() {
        final ReachCensus census = ReachCensus.over(List.of(
                reached(FurthestWritten.Reach.NOT_WRITTEN, FurthestWritten.Reach.AS_THIS_RUN),
                reached(FurthestWritten.Reach.EVERY_WORD_NEVER_ADJACENT, FurthestWritten.Reach.AS_THIS_RUN),
                reached(FurthestWritten.Reach.AS_THIS_RUN, FurthestWritten.Reach.AS_THIS_RUN),
                reached(FurthestWritten.Reach.NOT_WRITTEN, FurthestWritten.Reach.NOT_WRITTEN)));
        assertAll(
                () -> assertThat(census.onlyInProse()).isEqualTo(2),
                () -> assertThat(census.shareOnlyInProse()).isCloseTo(0.5, within(1.0e-9)));
    }

    @Test
    void boundsEveryShareAtOneBecauseItIsTakenOverWhatTheCensusRead() {
        final ReachCensus census = ReachCensus.over(List.of(
                reached(FurthestWritten.Reach.AS_THIS_RUN, FurthestWritten.Reach.AS_THIS_RUN),
                reached(FurthestWritten.Reach.NOT_WRITTEN, FurthestWritten.Reach.NOT_WRITTEN)));
        assertAll(
                () -> assertThat(census.shareDeclared(FurthestWritten.Reach.AS_THIS_RUN))
                        .isCloseTo(0.5, within(1.0e-9)),
                () -> assertThat(java.util.Arrays.stream(FurthestWritten.Reach.values())
                        .mapToDouble(census::shareDeclared).sum()).isCloseTo(1.0, within(1.0e-9)));
    }

    @Test
    void readsNoKeywordAndReportsNoShareRatherThanDividingByNothing() {
        final ReachCensus census = ReachCensus.over(List.of());
        assertAll(
                () -> assertThat(census.keywords()).isEqualTo(0),
                () -> assertThat(census.shareDeclared(FurthestWritten.Reach.AS_THIS_RUN)).isEqualTo(0.0),
                () -> assertThat(census.shareOnlyInProse()).isEqualTo(0.0));
    }
}
