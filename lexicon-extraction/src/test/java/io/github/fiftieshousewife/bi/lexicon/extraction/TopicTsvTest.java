package io.github.fiftieshousewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicTsvTest {

    private final TopicTsv tsv = new TopicTsv();

    @Test
    void rendersSortedRowsWithSortedTopicsUnderTheProvenanceHeader() {
        final String text = tsv.render(Map.of(
                "double_fault", Set.of("tennis", "sports"),
                "break_point", Set.of("tennis", "hobbies", "sports")));
        final List<String> rows = text.lines().filter(line -> !line.startsWith("#")).toList();
        assertAll(
                () -> assertThat(text).startsWith("# Wiktionary topic vocabulary"),
                () -> assertThat(text).contains("CC BY-SA").contains("2 words"),
                () -> assertThat(rows).containsExactly(
                        "break_point\thobbies,sports,tennis",
                        "double_fault\tsports,tennis"));
    }
}
