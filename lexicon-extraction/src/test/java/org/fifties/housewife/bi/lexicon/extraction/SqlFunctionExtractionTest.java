package org.fifties.housewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SqlFunctionExtractionTest {

    @TempDir
    Path directory;

    @Test
    void writesTheEnginesOwnCatalogueToTheGivenFile() throws IOException, SQLException {
        final Path output = directory.resolve("nested").resolve("sql-functions.tsv");
        new SqlFunctionExtraction().extract(output);
        final List<String> rows = Files.readAllLines(output).stream()
                .filter(line -> !line.startsWith("#"))
                .toList();
        assertAll(
                () -> assertThat(rows).isNotEmpty(),
                () -> assertThat(rows).allSatisfy(row -> assertThat(row).contains("\t")),
                () -> assertThat(rows).anySatisfy(row -> assertThat(row).startsWith("abs\t")));
    }

    @Test
    void describesTheAbsoluteValueFunctionInTheStandardsOwnWords() throws IOException, SQLException {
        final Path output = directory.resolve("sql-functions.tsv");
        new SqlFunctionExtraction().extract(output);
        assertThat(Files.readString(output)).contains("abs\tAbsolute value");
    }

    @Test
    void refusesToRunWithoutAnOutputPath() {
        assertThat(assertThrows(IllegalArgumentException.class,
                () -> SqlFunctionExtraction.main(new String[] {"  "})))
                .hasMessageContaining("Usage");
    }
}
