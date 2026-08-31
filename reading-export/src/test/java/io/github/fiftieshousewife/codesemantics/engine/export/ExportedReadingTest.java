package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedReadingTest {

    private static RepositoryReading reading(final Path root) throws IOException {
        return RepositoryReading.of(sourceUnder(root));
    }

    private static Path sourceUnder(final Path root) throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("NounPhrase.java"),
                "package a; /** Reads a noun phrase. */ class NounPhrase { String headword; String lemma; }");
        return root;
    }

    @Test
    void exportsAWholeReadingUnderTheStatedSchemaVersion(@TempDir final Path root) throws IOException {
        final ReadingExport export = new ExportedReading().of(reading(root), "c0ffee", List.of());

        assertAll(
                () -> assertThat(export.schemaVersion()).isEqualTo(ReadingExport.SCHEMA_VERSION),
                () -> assertThat(export.summary().repository()).isEqualTo(root.getFileName().toString()),
                () -> assertThat(export.summary().commit()).isEqualTo("c0ffee"),
                () -> assertThat(export.taxonomies())
                        .as("the bundled vocabulary is matched even when the caller names no others")
                        .isNotEmpty(),
                () -> assertThat(export.setAside())
                        .as("what was seen and not read is reported, not dropped")
                        .isNotNull());
    }

    @Test
    void writesAnExportItsOwnReaderReadsBack(@TempDir final Path root, @TempDir final Path folder)
            throws IOException {
        final ReadingExport export = new ExportedReading().of(reading(root), "", List.of());
        final Path file = folder.resolve(ExportFile.NAME);

        new ExportFile().wrote(file, export);

        final ReadingExport read = new ExportFile().in(file);
        assertAll(
                () -> assertThat(read.schemaVersion()).isEqualTo(export.schemaVersion()),
                () -> assertThat(read.summary().repository()).isEqualTo(export.summary().repository()),
                () -> assertThat(read.signals()).hasSameSizeAs(export.signals()));
    }

    @Test
    void exportsADirectoryWithoutTheCallerAssemblingAReading(@TempDir final Path root) throws IOException {
        final ReadingExport export = new ExportedReading().of(sourceUnder(root), "c0ffee");

        assertAll(
                () -> assertThat(export.schemaVersion()).isEqualTo(ReadingExport.SCHEMA_VERSION),
                () -> assertThat(export.summary().repository()).isEqualTo(root.getFileName().toString()),
                () -> assertThat(export.summary().commit()).isEqualTo("c0ffee"),
                () -> assertThat(export.taxonomies())
                        .as("a caller naming no vocabulary is judged against every bundled one")
                        .isNotEmpty());
    }
}
