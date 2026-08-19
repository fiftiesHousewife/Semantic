package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class OpenAlexSnapshotTest {

    private static final String EARLIER = "s3://openalex/data/jsonl/topics/updated_date=2026-06-18/part_0000.gz";

    private static final String LATER = "s3://openalex/data/jsonl/topics/updated_date=2026-06-26/part_0000.gz";

    private final OpenAlexSnapshot snapshot = new OpenAlexSnapshot();

    @TempDir
    private Path directory;

    @Test
    void namesEveryPartAfterThePublishersOwnUrlRatherThanAfterTheDownloadedFile() throws IOException {
        write("part_0000 (1).gz", "abc");
        write("part_0000.gz", "defghi");
        final List<ContentDigest.Member> parts = snapshot.in(directory, manifest(3, 6));
        assertAll(
                () -> assertThat(parts).extracting(ContentDigest.Member::name)
                        .containsExactly(EARLIER, LATER),
                () -> assertThat(parts.get(0).bytes()).asString(StandardCharsets.UTF_8).isEqualTo("abc"),
                () -> assertThat(parts.get(1).bytes()).asString(StandardCharsets.UTF_8).isEqualTo("defghi"));
    }

    @Test
    void refusesADirectoryHoldingNoFileOfTheLengthThePublisherStates() throws IOException {
        write("part_0000 (1).gz", "abc");
        write("part_0000.gz", "defghi");
        assertThatThrownBy(() -> snapshot.in(directory, manifest(3, 7)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(LATER)
                .hasMessageContaining("7 bytes");
    }

    @Test
    void refusesTwoFilesOfTheSameLengthBecauseNothingWouldSayWhichPartWasRead() throws IOException {
        write("part_0000 (1).gz", "abc");
        write("part_0000.gz", "xyz");
        assertThatThrownBy(() -> snapshot.in(directory, manifest(3, 3)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("part_0000");
    }

    @Test
    void looksOnlyAtTheCompressedPartsSoAManifestOfTheSameLengthBesideThemIsNotOneOfThem()
            throws IOException {
        write("manifest.json", "abc");
        write("part_0000.gz", "abc");
        assertThat(snapshot.in(directory, oneOf(3))).singleElement()
                .satisfies(part -> assertThat(part.name()).isEqualTo(LATER));
    }

    private OpenAlexManifest manifest(final int earlier, final int later) {
        return OpenAlexManifest.of("""
                {"date":"2026-06-26","entity":"topics","record_count":2,"files":[
                  {"url":"%s","meta":{"content_length":%d,"record_count":1}},
                  {"url":"%s","meta":{"content_length":%d,"record_count":1}}]}
                """.formatted(EARLIER, earlier, LATER, later).getBytes(StandardCharsets.UTF_8));
    }

    private OpenAlexManifest oneOf(final int length) {
        return OpenAlexManifest.of("""
                {"date":"2026-06-26","entity":"topics","record_count":1,"files":[
                  {"url":"%s","meta":{"content_length":%d,"record_count":1}}]}
                """.formatted(LATER, length).getBytes(StandardCharsets.UTF_8));
    }

    private void write(final String name, final String content) throws IOException {
        Files.writeString(directory.resolve(name), content);
    }
}
