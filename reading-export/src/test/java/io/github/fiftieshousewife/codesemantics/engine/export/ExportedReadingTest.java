package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * A composition's cost does not shrink with the fixture: the chance draws are scheme-sized, so every
 * {@code of(...)} pays the same seconds a real tree pays. One shared fixture and one shared composition
 * carry every assertion that does not need a tree of its own.
 */
class ExportedReadingTest {

    private static final List<String> FIELD =
            List.of("OLiA", "CWE", "FIX", "FpML", "FIBO", "BIAN", "CSO");

    @TempDir
    static Path shared;

    private static RepositoryReading reading;

    private static ReadingExport export;

    @BeforeAll
    static void composedTheSharedFixtureOnce() throws IOException {
        reading = RepositoryReading.of(sourceUnder(shared));
        export = new ExportedReading().of(reading, "c0ffee", List.of());
    }

    private static Path sourceUnder(final Path root) throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("NounPhrase.java"),
                "package a; /** Reads a noun phrase. */ class NounPhrase "
                        + "{ String headword; String hypotaxis; String zeugma; }");
        return root;
    }

    @Test
    void exportsAWholeReadingUnderTheStatedSchemaVersion() {

        assertAll(
                () -> assertThat(export.schemaVersion()).isEqualTo(ReadingExport.SCHEMA_VERSION),
                () -> assertThat(export.summary().repository()).isEqualTo(shared.getFileName().toString()),
                () -> assertThat(export.summary().commit()).isEqualTo("c0ffee"),
                () -> assertThat(export.taxonomies())
                        .as("the bundled vocabulary is matched even when the caller names no others")
                        .isNotEmpty(),
                () -> assertThat(export.setAside())
                        .as("what was seen and not read is reported, not dropped")
                        .isNotNull(),
                () -> assertThat(export.setAside().javaFilesNoScopeReached())
                        .as("every Java file of this tree sits in a scope, so the layout hid none of it")
                        .isZero(),
                () -> assertThat(export.setAside().vocabulariesBelowTheirChanceBar())
                        .extracting(SetAside.RefusedVocabulary::vocabulary)
                        .as("every vocabulary judged is named here or in taxonomies, and none in both")
                        .doesNotContainAnyElementsOf(export.taxonomies().stream()
                                .map(ExportedTaxonomy::vocabulary).toList()));
    }

    @Test
    void readsATreeLaidOutWhereNoScopeLooksAndSaysHowMuchTheLayoutHid(@TempDir final Path root)
            throws IOException {
        final Path elsewhere = root.resolve("src-core").resolve("a");
        Files.createDirectories(elsewhere);
        Files.writeString(elsewhere.resolve("Elsewhere.java"), "package a; class Elsewhere { String word; }");

        final ReadingExport export = new ExportedReading().of(RepositoryReading.of(root), "c0ffee", List.of());

        assertAll(
                () -> assertThat(export.summary().counts().signals())
                        .as("no scope means no word, and a reading of no words is a reading")
                        .isZero(),
                () -> assertThat(export.setAside().javaFilesNoScopeReached())
                        .as("and the count is what says the layout hid the source rather than that there "
                                + "was none, which is the whole of the difference between this reading "
                                + "and a reading of a tree holding no Java")
                        .isOne());
    }

    @Test
    void countsEveryJudgedVocabularysBranchRuleDiscardsInOneFigure() {
        final int oliaAlone = export.setAside().matchesDiscardedByBranchRule();
        final int withTwoLoneTerms = new ExportedReading().of(reading, "", List.of(LoneTerms.newInstance()))
                .setAside().matchesDiscardedByBranchRule();

        assertThat(withTwoLoneTerms - oliaAlone)
                .as("each of the fixture's one-word terms is written without a branch sibling, so both "
                        + "of its discards join the count beside the bundled vocabulary's")
                .isEqualTo(2);
    }

    private static ExportedTaxonomy judged(final String vocabulary, final int phrases, final int bar) {
        return new ExportedTaxonomy(vocabulary, List.of(), List.of(), Map.of(),
                new ExportedTaxonomy.Bar(phrases, bar, bar, (double) phrases / bar, phrases * 20, bar * 20, (double) phrases / bar, 0, 0.001, 7, FIELD, 999));
    }

    @Test
    void namesEveryVocabularyItRefusedWithTheBarItFailed() {
        final List<SetAside.RefusedVocabulary> refused = JudgedTaxonomies.refused(
                List.of(judged("FpML", 69, 25), judged("CSO", 17, 16), judged("BIAN", 1, 4)));

        assertAll(
                () -> assertThat(refused).extracting(SetAside.RefusedVocabulary::vocabulary)
                        .as("a count cannot be argued with and a row can")
                        .containsExactly("BIAN"),
                () -> assertThat(refused.getFirst().bar().phrases()).isEqualTo(1),
                () -> assertThat(refused.getFirst().bar().chanceExpectedBest()).isEqualTo(4));
    }

    @Test
    void writesAnExportItsOwnReaderReadsBack(@TempDir final Path folder) throws IOException {
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
