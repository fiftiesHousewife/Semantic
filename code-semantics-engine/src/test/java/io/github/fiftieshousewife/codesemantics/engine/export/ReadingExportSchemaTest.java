package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The published schema is the contract, and this is what holds the writer to it. A field renamed or removed
 * fails a build here rather than a parse in somebody else's code.
 */
class ReadingExportSchemaTest {

    private static final ExportedPlacement PLACEMENT = new ExportedPlacement("arXiv",
            ExportedPlacement.Level.of("Computer Science", 0.34, 0.41),
            ExportedPlacement.Level.of("cs.CL Computation and Language", 0.3950, 0.4455));

    private static final ReadingExport EXPORT = ReadingExport.of(
            new ExportedSummary("CodeSemantics", "610c4e9", List.of("linguistics"),
                    List.of("WordNet Domains"), PLACEMENT,
                    List.of(new LeadingWord("lemma", 0.02, 40)),
                    List.of(new ExportedSummary.LeadingConcept("Verb", "OLiA")),
                    List.of(new ExportedSummary.DistinctiveScope("lexicon/src/main/java", 0.19,
                            List.of("linguistics"))),
                    0.98, 0.76, new ExportedSummary.Counts(1, 1, 1)),
            List.of(new ExportedSignal(ReadingSource.CLONE, "lemma", 40, 30, 0.02, "ordinary English",
                    new SightingSite("Reading.java", 12))),
            List.of(new ExportedTheme("linguistics", "lexicon/src/main/java", 0.05, 0.012,
                    List.of("word", "lemma"))),
            List.of(new ExportedTaxonomy("OLiA",
                    List.of(new ExportedTaxonomy.Concept("Verb", "WordClass", 20, 0.8, 1,
                            new SightingSite("Reading.java", 9))),
                    Map.of("words", 973, "lemmas", 201, "senses", 130), PLACEMENT)),
            new SetAside(1_325, 625, 1, 56, 0));

    private final ExportFile file = new ExportFile();

    private final ExportSchema schema = ExportSchema.fromClasspath();

    @Test
    void admitsADocumentCarryingEveryFieldTheSchemaStates() throws IOException {
        assertThat(schema.refusals(new ObjectMapper().readTree(file.of(EXPORT)))).isEmpty();
    }

    @Test
    void refusesADocumentCarryingAFieldTheSchemaDoesNotName() throws IOException {
        final String renamed = file.of(EXPORT).replace("\"divergenceBits\"", "\"bits\"");

        assertThat(schema.refusals(new ObjectMapper().readTree(renamed)))
                .as("a consumer reads these names, so a rename has to fail here")
                .isNotEmpty();
    }

    @Test
    void refusesAShareOutsideTheBoundItsOwnDefinitionGivesIt() throws IOException {
        final String impossible = file.of(EXPORT).replace("0.98,", "1.98,");

        assertThat(schema.refusals(new ObjectMapper().readTree(impossible))).isNotEmpty();
    }

    @Test
    void writesNoDocumentTheSchemaRefuses(@TempDir final Path folder) {
        final ReadingExport unversioned = new ReadingExport("two", EXPORT.summary(), EXPORT.signals(),
                EXPORT.themes(), EXPORT.taxonomies(), EXPORT.setAside());

        assertThatIllegalStateException()
                .isThrownBy(() -> file.wrote(folder.resolve(ExportFile.NAME), unversioned))
                .withMessageContaining(ExportSchema.RESOURCE);
    }

    @Test
    void statesTheSchemaVersionInTheDocumentItself() throws IOException {
        assertThat(file.of(EXPORT)).contains("\"schemaVersion\" : \"" + ReadingExport.SCHEMA_VERSION + "\"");
    }

    @Test
    void readsBackWhatItWrote(@TempDir final Path folder) throws IOException {
        final Path written = folder.resolve(ExportFile.NAME);
        file.wrote(written, EXPORT);

        assertAll(
                () -> assertThat(file.in(written)).isEqualTo(EXPORT),
                () -> assertThat(written).isRegularFile());
    }

    @Test
    void makesTheFolderItIsAskedToWriteInto(@TempDir final Path folder) throws IOException {
        final Path written = folder.resolve("json").resolve(ExportFile.NAME);
        file.wrote(written, EXPORT);

        assertThat(written).isRegularFile();
    }

    @Test
    void refusesAPlacementStatingSomethingItsOwnFiguresContradict() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new ExportedPlacement.Level("cs", 0.42, 0.40, true))
                .withMessageContaining("standsApartFromChance=true");
    }
}
