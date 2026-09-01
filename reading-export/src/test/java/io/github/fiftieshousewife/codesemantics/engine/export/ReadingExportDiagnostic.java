package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Path;

import org.junit.jupiter.api.BeforeAll;
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

    private static Path file;

    private static ReadingExport written;

    @BeforeAll
    static void wroteTheExportOverTheReadingSharedWithTheOtherDiagnostics() throws IOException {
        file = ExportCommand.wrote(System.getProperty("cs.commit", ""));
        written = new ExportFile().in(file);
    }

    @Test
    void writesTheExportAtTheVersionThisBuildStates() {
        assertAll(
                () -> assertThat(file).exists(),
                () -> assertThat(written.schemaVersion()).isEqualTo(ReadingExport.SCHEMA_VERSION));
    }

    /**
     * The bar counts the walk over one level and the reading walks four, longest-first, so a long run a
     * dictionary answered consumes words a shorter published phrase began in and the reading never reaches
     * it. That can only lose a phrase the bar counted, never add one, because every run the one-level walk
     * asks about the ladder asks about too and takes at a length at least as great. {@code countedPhrases}
     * names the difference for one clone — on fineract it is CSO's {@code message delivery}, hidden by
     * {@code sms message} answering one word earlier at the lemmas level.
     */
    @Test
    void publishesNoMorePhrasesAtTheCountedLevelThanTheBarCounted() {
        final PhrasesTheBarCounted counted = new PhrasesTheBarCounted();

        assertThat(written.taxonomies()).isNotEmpty().allSatisfy(taxonomy ->
                assertThat(counted.in(taxonomy).size())
                        .as("%s publishes matches from four normalisation levels and its bar counted one",
                                taxonomy.vocabulary())
                        .isLessThanOrEqualTo(taxonomy.bar().phrases()));
    }
}
