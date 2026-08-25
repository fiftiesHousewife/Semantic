package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Path;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Writes the export in the same JVM as the other diagnostics, over the one shared reading of the clone. The
 * {@code readingExport} task remains the standalone path; running it after {@code read} would read the whole
 * tree a second time in a fresh JVM, which is what this exists to avoid.
 *
 * <p>The commit is {@code -Dcs.commit}, stated by the build the way the standalone task states it as an
 * argument, because the library reads no {@code .git} of its own. Where nothing states it the field is
 * empty, never a guess.
 */
@Tag("diagnostic")
class ReadingExportDiagnostic {

    @Test
    void writesTheExportOverTheReadingSharedWithTheOtherDiagnostics() throws IOException {
        final Path file = ExportCommand.wrote(System.getProperty("cs.commit", ""));

        final ReadingExport written = new ExportFile().in(file);
        assertAll(
                () -> assertThat(file).exists(),
                () -> assertThat(written.schemaVersion()).isEqualTo(ReadingExport.SCHEMA_VERSION));
    }
}
