package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class XwndDomainsExtractionTest {

    private static byte[] archiveOf(final Map<String, String> files) throws IOException {
        final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (GZIPOutputStream gzip = new GZIPOutputStream(bytes)) {
            for (final Map.Entry<String, String> file : files.entrySet()) {
                final byte[] content = file.getValue().getBytes(StandardCharsets.UTF_8);
                final byte[] header = new byte[512];
                final byte[] name = file.getKey().getBytes(StandardCharsets.US_ASCII);
                System.arraycopy(name, 0, header, 0, name.length);
                final byte[] size = String.format("%011o", content.length)
                        .getBytes(StandardCharsets.US_ASCII);
                System.arraycopy(size, 0, header, 124, size.length);
                gzip.write(header);
                gzip.write(content);
                gzip.write(new byte[content.length % 512 == 0 ? 0 : 512 - content.length % 512]);
            }
            gzip.write(new byte[1024]);
        }
        return bytes.toByteArray();
    }

    private static InputStream index(final String rows) {
        return new ByteArrayInputStream(rows.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void carriesEachSynsetsHighestWeightedDomainOntoItsSenseKeys() throws IOException {
        final byte[] archive = archiveOf(Map.of(
                "xwnd-30g/linguistics.ppv", "06282651-n\t0.0132\n01740393-v\t0.0001\n",
                "xwnd-30g/religion.ppv", "06282651-n\t0.0002\n01740393-v\t0.0040\n"));

        final List<XwndConcepts.Leading> keyed = XwndConcepts.in(new ByteArrayInputStream(archive),
                index("""
                        word%1:10:00:: 06282651 1 40
                        vocable%1:10:00:: 06282651 2 0
                        pray%2:32:00:: 01740393 1 5
                        """));

        assertAll(
                () -> assertThat(keyed).extracting(XwndConcepts.Leading::senseKey,
                                XwndConcepts.Leading::domain)
                        .containsExactlyInAnyOrder(
                                tuple("word%1:10:00::", "linguistics"),
                                tuple("vocable%1:10:00::", "linguistics"),
                                tuple("pray%2:32:00::", "religion")),
                () -> assertThat(keyed.getFirst().weight()).isEqualTo(0.0132));
    }

    @Test
    void readsASatelliteAdjectivesKeyAgainstTheAdjectiveVectors() throws IOException {
        final byte[] archive = archiveOf(Map.of(
                "xwnd-30g/quality.ppv", "00001740-a\t0.0050\n"));

        final List<XwndConcepts.Leading> keyed = XwndConcepts.in(new ByteArrayInputStream(archive),
                index("""
                        able%3:00:00:: 00001740 1 20
                        capable%5:00:00:able:00 00001740 2 3
                        """));

        assertThat(keyed).extracting(XwndConcepts.Leading::senseKey)
                .containsExactlyInAnyOrder("able%3:00:00::", "capable%5:00:00:able:00");
    }

    @Test
    void breaksATieOnTheDomainsNameSoTwoRunsWriteIdenticalBytes() throws IOException {
        final byte[] archive = archiveOf(Map.of(
                "xwnd-30g/zoology.ppv", "06282651-n\t0.0100\n",
                "xwnd-30g/anatomy.ppv", "06282651-n\t0.0100\n"));

        assertThat(XwndConcepts.in(new ByteArrayInputStream(archive),
                        index("word%1:10:00:: 06282651 1 40\n")).getFirst().domain())
                .isEqualTo("anatomy");
    }

    @Test
    void rendersOneRowPerSenseKeyUnderAProvenanceHeader() throws IOException {
        final byte[] archive = archiveOf(Map.of(
                "xwnd-30g/linguistics.ppv", "06282651-n\t0.0132\n"));
        final String table = new XwndDomainsTsv().render(
                XwndConcepts.in(new ByteArrayInputStream(archive),
                        index("word%1:10:00:: 06282651 1 40\n")),
                XwndDomainsExtraction.SOURCE_URL, XwndDomainsExtraction.ARCHIVE_SHA256,
                XwndDomainsExtraction.INDEX_URL, XwndDomainsExtraction.INDEX_SHA256);

        assertAll(
                () -> assertThat(table).contains("# Source: https://adimen.ehu.eus"),
                () -> assertThat(table).contains("# Licence: Creative Commons Attribution 3.0"),
                () -> assertThat(table).contains("# Generated by XwndDomainsExtraction: 1 rows."),
                () -> assertThat(table).endsWith("word%1:10:00::\tlinguistics\t1.320000e-02\n"));
    }

    @Test
    void refusesAnArchiveWhoseBytesDoNotDigestToTheRecordedDistribution(@TempDir final Path folder)
            throws IOException {
        final Path archive = folder.resolve("xwnd-30g.tgz");
        Files.write(archive, new byte[] {1, 2, 3});

        assertThatThrownBy(() -> XwndDomainsExtraction.accept(archive,
                XwndDomainsExtraction.ARCHIVE_SHA256, "the XWND distribution"))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("states a provenance it does not have");
    }
}
