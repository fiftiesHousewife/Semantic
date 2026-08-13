package org.fifties.housewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WikidataNameExtractionTest {

    @TempDir
    Path workDir;

    private final SparqlEndpoint endpoint = query -> {
        if (query.contains("wdt:P735")) {
            return rows("Q1\t12", "Q3\t1", "Q4\t\"6\"^^<http://www.w3.org/2001/XMLSchema#int>");
        }
        if (query.contains("wdt:P734")) {
            return rows("Q2\t7");
        }
        return rows("Q1\t\"Alexander\"@en", "Q1\t\"Александр\"@ru", "Q1\t\"亚历山大\"@zh",
                "Q2\t\"Wang\"@en", "Q2\t\"王\"@zh", "Q2\t\"Wang (surname)\"@sv",
                "Q3\t\"Rarename\"@en", "Q4\t\"Alexander\"@de");
    };

    @Test
    void writesEachLabelOfANameItemWithItsScriptKindAndBearers() throws IOException, InterruptedException {
        assertThat(extract()).contains(
                "Александр\tCYRILLIC\tgiven\t12",
                "亚历山大\tHAN\tgiven\t12",
                "Wang\tLATIN\tfamily\t7",
                "王\tHAN\tfamily\t7");
    }

    @Test
    void aTokenSharedByTwoItemsKeepsTheLargerBearerCountOnce() throws IOException, InterruptedException {
        assertThat(extract())
                .contains("Alexander\tLATIN\tgiven\t12")
                .filteredOn(line -> line.startsWith("Alexander\t"))
                .hasSize(1);
    }

    @Test
    void anItemBelowTheBearerFloorContributesNothing() throws IOException, InterruptedException {
        assertThat(extract()).noneMatch(line -> line.startsWith("Rarename"));
    }

    @Test
    void aParentheticallyQualifiedLabelIsNotAToken() throws IOException, InterruptedException {
        assertThat(extract()).noneMatch(line -> line.contains("surname"));
    }

    @Test
    void theFileCarriesItsProvenanceHeader() throws IOException, InterruptedException {
        final Path tsv = workDir.resolve("names.tsv");
        new WikidataNameExtraction(endpoint).extractTo(tsv);
        assertThat(Files.readString(tsv)).startsWith("# Name tokens from the Wikidata");
    }

    private List<String> extract() throws IOException, InterruptedException {
        final Path tsv = workDir.resolve("names.tsv");
        new WikidataNameExtraction(endpoint).extractTo(tsv);
        return Files.readAllLines(tsv).stream()
                .filter(line -> !line.startsWith("#") && !line.isBlank())
                .toList();
    }

    private static List<String[]> rows(final String... lines) {
        return List.of(lines).stream()
                .map(WikidataNameExtractionTest::qualified)
                .map(line -> line.split("\t", -1))
                .toList();
    }

    private static String qualified(final String line) {
        final String[] fields = line.split("\t", -1);
        fields[0] = "<http://www.wikidata.org/entity/" + fields[0] + ">";
        return String.join("\t", fields);
    }
}
