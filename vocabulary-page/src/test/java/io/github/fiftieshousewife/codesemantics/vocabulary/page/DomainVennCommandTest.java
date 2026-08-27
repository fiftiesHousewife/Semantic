package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DomainVennCommandTest {

    @Test
    void overlapsAPublishedReadingsWordsUnderEveryDomainSource(@TempDir final Path folder)
            throws IOException {
        final ReadingFolder reading = PublishedReadingFixture.wrote(folder);

        final Map<String, DomainOverlap> overlaps = DomainVennCommand.overlaps("a-repository",
                SignificantWords.of(reading.export()).words(), CorroboratedSenses.none());

        assertAll(
                () -> assertThat(overlaps.keySet())
                        .containsExactly("WordNet Domains", "eXtended WordNet Domains",
                                "arXiv categories", "OpenAlex subfields", "CSO topics"),
                () -> assertThat(overlaps.values())
                        .allSatisfy(overlap -> assertThat(overlap.regions())
                                .hasSize((1 << overlap.domains().size()) - 1)));
    }

    @Test
    void offersThePhraseOverlapTheEvidenceRecordsBesideTheWordSources(@TempDir final Path folder,
            @TempDir final Path reports) throws IOException {
        final ReadingFolder reading = PublishedReadingFixture.wrote(folder);

        final Path page = DomainVennCommand.pageOf(reading, reports);

        assertThat(Files.readString(page.resolveSibling("domain-venn.json")))
                .contains("Phrase matches")
                .contains("phraseSummary")
                .contains("FIBO phrases")
                .contains("BIAN phrases")
                .contains("The Financial Industry Business Ontology")
                .contains("interest rate")
                .contains("term deposit");
    }

    @Test
    void writesOnePageEmbeddingEverySourcesOverlap(@TempDir final Path reports) throws IOException {
        final Map<String, DomainOverlap> overlaps = Map.of("WordNet Domains",
                new DomainOverlap("a-repository", List.of(), List.of(), List.of(), 0, 0, 0, 0.0));

        final Path page = DomainVennCommand.wrote(reports, overlaps, List.of(), List.of(), 0);

        assertAll(
                () -> assertThat(page).exists(),
                () -> assertThat(reports.resolve("domain-venn.json")).exists(),
                () -> assertThat(Files.readString(page))
                        .contains("a-repository")
                        .contains("WordNet Domains"));
    }
}
