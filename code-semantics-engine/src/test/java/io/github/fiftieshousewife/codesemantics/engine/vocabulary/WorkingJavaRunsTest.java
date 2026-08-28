package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.theme.PublishedPhrases;
import io.github.fiftieshousewife.codesemantics.engine.theme.StatedRuns;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WorkingJavaRunsTest {

    private final WorkingJavaRuns corpus = WorkingJavaRuns.stating(table(), pooling());

    private static Stream<String> table() {
        return Stream.of(
                "# The reference corpus over runs.",
                "# Columns: run, occurrences, share, error.",
                "time_zone\t446\t6.000e-01\t1.000e-01",
                "task_id\t400\t3.000e-01\t1.000e-01",
                "seen_once\t1\t1.000e-01\t2.000e-01");
    }

    private static StatedRuns pooling() {
        return new StatedRuns(new PublishedPhrases(
                Set.of("time_zone", "cap_floor", "seen_once", "task_id", "pass_through")));
    }

    @Test
    void writesARunWhoseShareStandsAboveItsOwnError() {
        assertThat(corpus.writes(List.of("time", "zone"))).isTrue();
    }

    @Test
    void hasNotBeenShownToWriteARunWhoseShareSitsInsideItsOwnError() {
        assertThat(corpus.writes(List.of("seen", "once")))
                .as("one sighting in a hundred repositories is a count a resample would reach")
                .isFalse();
    }

    @Test
    void writesNothingItNeverWrote() {
        assertThat(corpus.writes(List.of("cap", "floor"))).isFalse();
    }

    @Test
    void asksInTheFormTheTableIsKeyedBy() {
        assertThat(corpus.writes(List.of("Time", "Zone"))).isTrue();
    }

    @Test
    void canBeAskedAboutARunThePoolingWouldHaveMerged() {
        assertAll(
                () -> assertThat(corpus.canBeAsked(List.of("time", "zone"))).isTrue(),
                () -> assertThat(corpus.canBeAsked(List.of("cap", "floor")))
                        .as("a run the pooling would merge and the corpus never wrote is a measured absence")
                        .isTrue());
    }

    @Test
    void canBeAskedAboutARunItsPoolingStatesEvenWhereTheDictionaryCarriesNoEdgeWord() {
        assertAll(
                () -> assertThat(corpus.canBeAsked(List.of("task", "id"))).isTrue(),
                () -> assertThat(corpus.canBeAsked(List.of("pass", "through"))).isTrue());
    }

    @Test
    void cannotBeAskedAboutARunThePoolingWouldNeverHaveMerged() {
        assertThat(corpus.canBeAsked(List.of("swap", "leg")))
                .as("no publisher in this index states it, so no pooling would have merged it and the "
                        + "table having no row for it says nothing")
                .isFalse();
    }

    @Test
    void readsTheBundledTableAndTheReadingItWasPooledUnder() {
        final WorkingJavaRuns bundled = WorkingJavaRuns.fromClasspath();
        assertAll(
                () -> assertThat(bundled.writes(List.of("time", "zone"))).isTrue(),
                () -> assertThat(bundled.writes(List.of("task", "id")))
                        .as("the table is pooled under a reading with no edge rule in it, so a compound "
                                + "ending in a word the dictionary does not carry is counted like any other")
                        .isTrue(),
                () -> assertThat(bundled.writes(List.of("cap", "floor"))).isFalse(),
                () -> assertThat(bundled.canBeAsked(List.of("cap", "floor")))
                        .as("FpML states it, so the corpus was in a position to count it and did not")
                        .isTrue(),
                () -> assertThat(bundled.canBeAsked(List.of("segmenter", "repository")))
                        .as("no publisher states it, so no pooling would ever have merged it")
                        .isFalse());
    }
}
