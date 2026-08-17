package io.github.fiftieshousewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WikidataInitialismExtractionTest {

    @TempDir
    Path workDir;

    private final SparqlEndpoint endpoint = query -> {
        if (query.contains("skos:altLabel") && query.contains("\"en\")")) {
            return rows("Q1\t\"WB\"@en", "Q2\t\"WB\"@en", "Q3\t\"SNA\"@en");
        }
        if (query.contains("skos:altLabel")) {
            return rows("Q4\t\"BP\"@mul");
        }
        if (query.contains("wdt:P1813")) {
            return rows("Q1\t\"WB\"@en", "Q5\t\"GHG\"@en");
        }
        if (query.contains("wdt:P31")) {
            return rows("Q4");
        }
        return rows("Q1\t\"World Bank\"@en\t145", "Q2\t\"World Balance\"@en\t3",
                "Q3\t\"United Nations System of National Accounts\"@en\t",
                "Q4\t\"Blood Pressure Change and Outcome\"@en\t0",
                "Q5\t\"greenhouse gas\"@en\t95");
    };

    @Test
    void writesOneReadingPerTokenAndEntityWithItsProminence() throws IOException, InterruptedException {
        final List<String> lines = extract();
        assertAll(
                () -> assertThat(lines).contains("WB\tWorld Bank\t145", "WB\tWorld Balance\t3",
                        "GHG\tgreenhouse gas\t95"),
                () -> assertThat(lines).filteredOn(line -> line.startsWith("WB\tWorld Bank"))
                        .hasSize(1));
    }

    @Test
    void aMissingSitelinkCountReadsAsZero() throws IOException, InterruptedException {
        assertThat(extract())
                .contains("SNA\tUnited Nations System of National Accounts\t0");
    }

    @Test
    void aClinicalTrialsRegisteredAcronymIsExcluded() throws IOException, InterruptedException {
        assertThat(extract()).noneMatch(line -> line.contains("Blood Pressure"));
    }

    @Test
    void theFileCarriesItsProvenanceHeader() throws IOException, InterruptedException {
        final Path tsv = workDir.resolve("initialisms.tsv");
        new WikidataInitialismExtraction(endpoint).extractTo(tsv);
        assertThat(Files.readString(tsv)).startsWith("# Initialism readings from the Wikidata");
    }

    private List<String> extract() throws IOException, InterruptedException {
        final Path tsv = workDir.resolve("initialisms.tsv");
        new WikidataInitialismExtraction(endpoint).extractTo(tsv);
        return Files.readAllLines(tsv).stream()
                .filter(line -> !line.startsWith("#") && !line.isBlank())
                .toList();
    }

    private static List<String[]> rows(final String... lines) {
        return List.of(lines).stream()
                .map(WikidataInitialismExtractionTest::qualified)
                .map(line -> line.split("\t", -1))
                .toList();
    }

    private static String qualified(final String line) {
        final String[] fields = line.split("\t", -1);
        fields[0] = "<http://www.wikidata.org/entity/" + fields[0] + ">";
        return String.join("\t", fields);
    }
}
