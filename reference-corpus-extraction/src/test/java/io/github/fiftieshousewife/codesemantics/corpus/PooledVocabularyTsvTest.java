package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.clones.RepositoryManifest;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class PooledVocabularyTsvTest {

    private static final String ROW = "kettle\thttps://example.invalid/kettle.git\tabc123\tMIT";

    @Test
    void ranksTheCommonestWordFirstAndStatesItsShareOfTheTotal() {
        final List<String> rows = rowsOf(new PooledVocabularyTsv().render(pooled(), drawn()));
        assertAll(
                () -> assertThat(rows).element(0).isEqualTo("kettle\t3\t6.000e-01"),
                () -> assertThat(rows).element(1).isEqualTo("depth\t2\t4.000e-01"),
                () -> assertThat(rows).hasSize(2));
    }

    @Test
    void carriesTheSourceTheLicenceAndTheDrawItPooled() {
        final String table = new PooledVocabularyTsv().render(pooled(), drawn());
        assertAll(
                () -> assertThat(table).contains("# Source: draw.tsv"),
                () -> assertThat(table).contains("# Licence:"),
                () -> assertThat(table).contains("# The seed: 20260821"),
                () -> assertThat(table).contains("# " + ROW),
                () -> assertThat(table).contains("Repositories pooled: 1. Words: 2. Occurrences: 5."));
    }

    @Test
    void refusesToWriteATableOverACorpusThatPooledNothing() {
        assertThatThrownBy(() -> new PooledVocabularyTsv().render(new WrittenWords(), drawn()))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("empty denominator");
    }

    private static WrittenWords pooled() {
        final WrittenWords written = new WrittenWords();
        written.saw("kettle", "KettleWarden.java:1", true);
        written.saw("kettle", "KettleWarden.java:3", true);
        written.saw("kettle", "KettleWarden.java:5", true);
        written.saw("depth", "KettleWarden.java:3", true);
        written.saw("depth", "KettleWarden.java:5", true);
        return written;
    }

    private static DrawnManifest drawn() {
        return new DrawnManifest("draw.tsv", List.of("# The seed: 20260821"),
                RepositoryManifest.of(Stream.of(ROW)));
    }

    private static List<String> rowsOf(final String table) {
        return table.lines().filter(line -> !line.startsWith("#") && !line.isBlank()).toList();
    }
}
