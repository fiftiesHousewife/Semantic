package io.github.fiftieshousewife.codesemantics.reference;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class PooledRunSharesTest {

    private static Stream<String> table() {
        return Stream.of(
                "# The reference corpus over runs, pooled over a hundred repositories.",
                "# Columns: run, occurrences, share, error.",
                "",
                "test_case\t599\t6.000e-01\t1.000e-03",
                "time_zone\t446\t2.000e-01\t1.000e-03",
                "country_code\t11\t1.000e-01\t1.000e-03");
    }

    @Test
    void readsEveryRowAndIgnoresTheProvenanceHeader() {
        assertThat(new PooledRunShares(table()).shareByRun()).hasSize(3);
    }

    @Test
    void normalisesTheRoundedSharesSoTheySumToOne() {
        final PooledRunShares corpus = new PooledRunShares(table());
        assertAll(
                () -> assertThat(corpus.shareByRun().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, within(1.0e-12)),
                () -> assertThat(corpus.shareOf("test_case")).isCloseTo(2.0 / 3.0, within(1.0e-9)));
    }

    @Test
    void statesTheOccurrenceCountApartFromTheShareSoAFloorCanBeReadAgainstIt() {
        assertThat(new PooledRunShares(table()).occurrencesOf("time_zone")).isEqualTo(446);
    }

    @Test
    void holdsNoShareAndNoCountForARunTheCorpusNeverWrote() {
        final PooledRunShares corpus = new PooledRunShares(table());
        assertAll(
                () -> assertThat(corpus.shareOf("cap_floor")).isZero(),
                () -> assertThat(corpus.occurrencesOf("cap_floor")).isZero());
    }

    @Test
    void refusesATableStatingNoShareAtAll() {
        assertThatThrownBy(() -> new PooledRunShares(Stream.of("# nothing but a header")))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("empty denominator");
    }

    @Test
    void refusesARowTooNarrowToStateAShare() {
        assertThatThrownBy(() -> new PooledRunShares(Stream.of("time_zone\t446")))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("run, occurrences, share");
    }

    @Test
    void readsATableHeldInAFileSoACandidateCanBeMeasuredBeforeItIsBundled(@TempDir final Path directory)
            throws IOException {
        final Path table = directory.resolve("candidate.tsv");
        Files.write(table, table().toList());
        assertThat(PooledRunShares.at(table).shareOf("test_case")).isCloseTo(2.0 / 3.0, within(1.0e-9));
    }

    @Test
    void statesTheRunsGeneralJavaWritesAtTheCountsTheCorpusPooled() {
        final PooledRunShares bundled = PooledRunShares.fromClasspath();
        assertAll(
                () -> assertThat(bundled.occurrencesOf("time_zone")).isEqualTo(446),
                () -> assertThat(bundled.occurrencesOf("mime_type")).isEqualTo(165),
                () -> assertThat(bundled.occurrencesOf("resource_type")).isEqualTo(51),
                () -> assertThat(bundled.occurrencesOf("country_code")).isEqualTo(11),
                () -> assertThat(bundled.shareByRun().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, within(1.0e-9)));
    }

    @Test
    void statesNoneOfTheRunsOnlyAFinanceVocabularyWrites() {
        final PooledRunShares bundled = PooledRunShares.fromClasspath();
        assertAll(Stream.of("cap_floor", "fixed_leg", "swap_leg", "floating_leg", "accrual_period")
                .map(run -> () -> assertThat(bundled.occurrencesOf(run))
                        .as("%s is FpML's own vocabulary and not what working Java writes", run)
                        .isZero()));
    }
}
