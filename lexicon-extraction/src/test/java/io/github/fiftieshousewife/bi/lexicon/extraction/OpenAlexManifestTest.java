package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class OpenAlexManifestTest {

    private static final String TOPICS = """
            {"date":"2026-06-26","format":"jsonl","entity":"topics","record_count":3,
             "content_length":900,
             "files":[{"url":"s3://openalex/data/jsonl/topics/updated_date=2026-06-18/part_0000.gz",
                       "meta":{"content_length":300,"record_count":1}},
                      {"url":"s3://openalex/data/jsonl/topics/updated_date=2026-06-26/part_0000.gz",
                       "meta":{"content_length":600,"record_count":2}}]}
            """;

    private final OpenAlexManifest manifest = OpenAlexManifest.of(TOPICS.getBytes(StandardCharsets.UTF_8));

    @Test
    void readsWhatThePublisherStatesTheSnapshotIs() {
        assertAll(
                () -> assertThat(manifest.date()).isEqualTo("2026-06-26"),
                () -> assertThat(manifest.recordCount()).isEqualTo(3),
                () -> assertThat(manifest.parts()).hasSize(2));
    }

    @Test
    void keepsThePartsInThePublishersOwnOrderSoALaterOneSupersedesAnEarlier() {
        assertThat(manifest.parts()).extracting(OpenAlexManifest.Part::url)
                .containsExactly("s3://openalex/data/jsonl/topics/updated_date=2026-06-18/part_0000.gz",
                        "s3://openalex/data/jsonl/topics/updated_date=2026-06-26/part_0000.gz");
    }

    @Test
    void statesTheLengthAndRecordCountThePublisherGivesEachPart() {
        assertThat(manifest.parts().get(1)).satisfies(part -> assertAll(
                () -> assertThat(part.contentLength()).isEqualTo(600),
                () -> assertThat(part.recordCount()).isEqualTo(2)));
    }

    @Test
    void refusesAManifestForAnEntityOtherThanTheTopicsThisExtractionReads() {
        final String works = TOPICS.replace("\"topics\"", "\"works\"");
        assertThatThrownBy(() -> OpenAlexManifest.of(works.getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("works")
                .hasMessageContaining("topics");
    }

    @Test
    void refusesAManifestNamingNoParts() {
        final String empty = TOPICS.replaceAll("\"files\":\\[[^]]*]", "\"files\":[]");
        assertThatThrownBy(() -> OpenAlexManifest.of(empty.getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("names no part");
    }
}
