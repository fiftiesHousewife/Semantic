package io.github.fiftieshousewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AbbreviationTsvTest {

    private final AbbreviationTsv tsv = new AbbreviationTsv();

    @Test
    void rendersSortedDedupedRowsUnderTheProvenanceHeader() {
        final String text = tsv.render(List.of(
                new AbbreviationSense("pts", "points", "abbreviation", List.of(), ""),
                new AbbreviationSense("avg", "average", "abbreviation", List.of("mathematics", "statistics"), ""),
                new AbbreviationSense("pts", "points", "abbreviation", List.of(), "")));
        final List<String> rows = text.lines().filter(line -> !line.startsWith("#")).toList();
        assertAll(
                () -> assertThat(text).startsWith("# Wiktionary abbreviation senses"),
                () -> assertThat(text).contains("CC BY-SA"),
                () -> assertThat(rows).containsExactly(
                        "avg\taverage\tabbreviation\tmathematics,statistics\t",
                        "pts\tpoints\tabbreviation\t\t"));
    }

    @Test
    void rendersAUnitSymbolsQuantityInTheLastField() {
        final String text = tsv.render(List.of(
                new AbbreviationSense("kj", "kilojoule", "symbol", List.of("metrology"), "work or energy")));
        assertThat(text.lines().filter(line -> !line.startsWith("#")))
                .containsExactly("kj\tkilojoule\tsymbol\tmetrology\twork or energy");
    }

    @Test
    void countsTheDistinctSensesInTheHeader() {
        final String text = tsv.render(List.of(
                new AbbreviationSense("avg", "average", "abbreviation", List.of(), ""),
                new AbbreviationSense("avg", "average", "abbreviation", List.of(), "")));
        assertThat(text).contains("1 senses");
    }
}
