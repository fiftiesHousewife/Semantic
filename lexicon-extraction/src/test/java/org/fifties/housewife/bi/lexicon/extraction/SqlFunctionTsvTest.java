package org.fifties.housewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SqlFunctionTsvTest {

    private final SqlFunctionTsv tsv = new SqlFunctionTsv();

    @Test
    void writesOneTabSeparatedRowPerNamedFunction() {
        final String rendered = tsv.render(
                List.of(new SqlFunction("abs", "Absolute value")), "v1.5.5");
        assertThat(rendered).contains("abs\tAbsolute value\n");
    }

    @Test
    void leavesOutAnEntryWhoseDescriptionStatesNothing() {
        final String rendered = tsv.render(List.of(
                new SqlFunction("abs", "Absolute value"),
                new SqlFunction("count_star", "")), "v1.5.5");
        assertAll(
                () -> assertThat(rendered).contains("abs\t"),
                () -> assertThat(rendered).doesNotContain("count_star"),
                () -> assertThat(rendered).contains("1 functions."));
    }

    @Test
    void sortsRowsAndDropsDuplicates() {
        final String rendered = tsv.render(List.of(
                new SqlFunction("sqrt", "Returns the square root of x"),
                new SqlFunction("abs", "Absolute value"),
                new SqlFunction("abs", "Absolute value")), "v1.5.5");
        assertAll(
                () -> assertThat(rendered.indexOf("abs\t")).isLessThan(rendered.indexOf("sqrt\t")),
                () -> assertThat(rendered).contains("2 functions."));
    }

    @Test
    void carriesTheEngineVersionAndLicenceInTheProvenanceHeader() {
        final String rendered = tsv.render(List.of(new SqlFunction("abs", "Absolute value")), "v1.5.5");
        assertAll(
                () -> assertThat(rendered).contains("version v1.5.5"),
                () -> assertThat(rendered).contains("MIT licence"),
                () -> assertThat(rendered.lines().findFirst().orElseThrow()).startsWith("#"));
    }
}
