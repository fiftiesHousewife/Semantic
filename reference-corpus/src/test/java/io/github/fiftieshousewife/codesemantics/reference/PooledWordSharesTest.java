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

class PooledWordSharesTest {

    private static Stream<String> table() {
        return Stream.of(
                "# The reference corpus, pooled over thirty repositories.",
                "# Columns: word, occurrences, share.",
                "",
                "get\t10327\t6.000e-01",
                "kettle\t8762\t2.000e-01",
                "lantern\t6240\t1.000e-01");
    }

    @Test
    void readsEveryRowAndIgnoresTheProvenanceHeader() {
        assertThat(new PooledWordShares(table()).shareByWord()).hasSize(3);
    }

    @Test
    void normalisesTheRoundedSharesSoTheySumToOne() {
        final PooledWordShares corpus = new PooledWordShares(table());
        assertAll(
                () -> assertThat(corpus.shareByWord().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, within(1.0e-12)),
                () -> assertThat(corpus.shareOf("get")).isCloseTo(2.0 / 3.0, within(1.0e-9)));
    }

    @Test
    void holdsNoShareForAWordTheCorpusNeverWrote() {
        assertThat(new PooledWordShares(table()).shareOf("flywheel")).isZero();
    }

    @Test
    void refusesATableStatingNoShareAtAll() {
        assertThatThrownBy(() -> new PooledWordShares(Stream.of("# nothing but a header")))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("empty denominator");
    }

    @Test
    void refusesARowTooNarrowToStateAShare() {
        assertThatThrownBy(() -> new PooledWordShares(Stream.of("get\t10327")))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("word, occurrences, share");
    }

    @Test
    void readsATableHeldInAFileSoACandidateCanBeMeasuredBeforeItIsBundled(@TempDir final Path directory)
            throws IOException {
        final Path table = directory.resolve("candidate.tsv");
        Files.write(table, table().toList());
        assertThat(PooledWordShares.at(table).shareOf("get")).isCloseTo(2.0 / 3.0, within(1.0e-9));
    }

    @Test
    void bundlesACorpusPooledOverThirtyRepositories() {
        final PooledWordShares bundled = PooledWordShares.fromClasspath();
        assertAll(
                () -> assertThat(bundled.shareByWord()).hasSizeGreaterThan(10_000),
                () -> assertThat(bundled.shareOf("get")).isGreaterThan(bundled.shareOf("notional")),
                () -> assertThat(bundled.shareByWord().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, within(1.0e-9)));
    }
}
