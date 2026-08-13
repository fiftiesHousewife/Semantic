package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicHierarchyTsvTest {

    private static final String REVISION = "https://example.invalid/wiktextract/abc123/topics.py";

    private final TopicHierarchyTsv tsv = new TopicHierarchyTsv();

    @Test
    void rendersSortedRowsWithSortedParentsUnderTheProvenanceHeader() {
        final String text = tsv.render(Map.of(
                "computing", Set.of("mathematics", "engineering"),
                "arachnology", Set.of("biology")), REVISION);
        final List<String> rows = text.lines().filter(line -> !line.startsWith("#")).toList();
        assertAll(
                () -> assertThat(text).startsWith("# Wiktionary topic hierarchy"),
                () -> assertThat(text).contains("MIT").contains(REVISION).contains("2 topics"),
                () -> assertThat(rows).containsExactly(
                        "arachnology\tbiology",
                        "computing\tengineering,mathematics"));
    }
}
