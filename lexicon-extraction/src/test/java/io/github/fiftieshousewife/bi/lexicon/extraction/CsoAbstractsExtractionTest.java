package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class CsoAbstractsExtractionTest {

    private static final String MACHINE_LEARNING = """
            {"concept": "machine_learning", "dbpedia": "Machine_learning", "revision": "1300", \
            "title": "Machine_learning", "extract": "Machine learning is a field of study."}""";

    private static final String UNLINKED = """
            {"concept": "airborne_sar", "dbpedia": "Airborne_SAR", "revision": "", \
            "title": "Airborne_SAR", "extract": ""}""";

    private final CsoAbstractsExtraction extraction = new CsoAbstractsExtraction();

    @Test
    void readsTheConceptTheArticleTheRevisionAndTheSummaryOffOneFetchedLine() {
        final CsoAbstractsTsv.Summary read = CsoAbstractsExtraction.summary(MACHINE_LEARNING);
        assertAll(
                () -> assertThat(read.concept()).isEqualTo("machine_learning"),
                () -> assertThat(read.article()).isEqualTo("Machine_learning"),
                () -> assertThat(read.revision()).isEqualTo("1300"),
                () -> assertThat(read.prose()).isEqualTo("Machine learning is a field of study."));
    }

    @Test
    void refusesALineStatingNoneOfTheFieldsRatherThanGuessingAtThem() {
        assertThatThrownBy(() -> CsoAbstractsExtraction.summary("{\"topic\": \"machine_learning\"}"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("concept");
    }

    @Test
    void writesOneRowPerTopicInTheOrderOfCsosOwnIdentifiers(@TempDir final Path directory) throws Exception {
        final Path fetched = Files.writeString(directory.resolve("fetched.jsonl"),
                MACHINE_LEARNING + "\n" + UNLINKED + "\n");
        final Path written = directory.resolve("cso-abstracts.tsv");
        extraction.extract(fetched, written, "2026-08-29");
        final List<String> rows = Files.readAllLines(written).stream()
                .filter(line -> !line.startsWith("#") && !line.isBlank()).toList();
        assertAll(
                () -> assertThat(rows).hasSize(2),
                () -> assertThat(rows.getFirst()).startsWith("airborne_sar\t"),
                () -> assertThat(rows.getLast()).isEqualTo(
                        "machine_learning\tMachine_learning\t1300\tMachine learning is a field of study."),
                () -> assertThat(Files.readString(written)).contains("CC BY-SA"),
                () -> assertThat(Files.readString(written)).contains("Retrieved: 2026-08-29"));
    }

    @Test
    void refusesAFetchThatStatedNothing(@TempDir final Path directory) throws Exception {
        final Path empty = Files.writeString(directory.resolve("empty.jsonl"), "\n");
        assertThatThrownBy(() -> extraction.extract(empty, directory.resolve("out.tsv"), "2026-08-29"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("nothing to bundle");
    }
}
