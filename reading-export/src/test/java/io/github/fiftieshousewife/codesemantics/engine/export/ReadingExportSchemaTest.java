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

    private static final List<String> FIELD =
            List.of("OLiA", "CWE", "FIX", "FpML", "FIBO", "BIAN", "CSO");

    private static final List<String> MET_ON = List.of("linguistics");

    private static final List<ExportedPlacement.CarryingTopic> MEETS_ON = List.of(
            new ExportedPlacement.CarryingTopic("linguistics", 0.21, 0.34, List.of()));

    private static final List<ExportedPlacement> PLACEMENT = List.of(new ExportedPlacement("arXiv",
            ExportedPlacement.Level.of("Computer Science", 0.34, 0.41, MEETS_ON, List.of()),
            ExportedPlacement.Level.of("cs.CL Computation and Language", 0.3950, 0.4455, MEETS_ON,
                    List.of(new ExportedPlacement.Contender("cs.CL Computation and Language", 0.3950,
                            MET_ON)))));

    private static final ReadingExport EXPORT = ReadingExport.of(
            new ExportedSummary("CodeSemantics", "610c4e9",
                    List.of(ExportedAnswer.fromATaxonomy("OLiA", List.of("WordClass"),
                                    "Verb", "a word that signifies an action or state",
                                    "12 phrases against the 3 a deal of its own words reaches", 4.0),
                            ExportedAnswer.fromATaxonomy("CSO", List.of("cryptology", "cryptography"),
                                    "public key cryptography", null,
                                    "4 phrases against the 2 a deal of its own words reaches", 2.0)),
                    List.of("linguistics"),
                    List.of("WordNet Domains"), PLACEMENT,
                    List.of(new LeadingWord("lemma", 0.02, 40)),
                    List.of(new ExportedSummary.LeadingConcept("Verb", "OLiA")),
                    List.of(new ExportedSummary.DistinctiveScope("lexicon/src/main/java", 0.19,
                            List.of("linguistics"))),
                    0.98, 0.76, new ExportedSummary.Counts(1, 1, 1)),
            List.of(new ExportedSignal(ReadingSource.CLONE, "lemma", 40, 30, 0.02, 0.018,
                    "ordinary English", new SightingSite("Reading.java", 12))),
            Map.of("ordinary English", 0.00002, "the reference corpus", 0.00003),
            List.of(new ExportedTheme("linguistics", "lexicon/src/main/java", 0.05, 0.012,
                    List.of(new ExportedWitness("word", 40, 12.5, List.of("WordNet Domains"),
                            List.of(new ExportedQuotation("word segmenter",
                                    new SightingSite("Reading.java", 7))))))),
            List.of(new ExportedTaxonomy("OLiA",
                    List.of(new ExportedConcept("Verb", "verb", "words",
                            "a word that signifies an action", "a word that signifies an action", "Verb",
                            "WordClass", List.of("WordClass"), 20, 0.8, 1, 1.0,
                            new SightingSite("Reading.java", 9))),
                    List.of(new ExportedTaxonomy.Branch("WordClass", 0.52, 16.0, 8.32, List.of("verb"))),
                    Map.of("words", 973, "lemmas", 201, "expansions", 12, "senses", 130),
                    new ExportedTaxonomy.Bar(12, 3, 2, 4.0, 240, 60, 4.0, 0, 0.001, 7, FIELD, 999))),
            new SetAside(1_325, 625, 14, 9, 1, 56,
                    List.of(new SetAside.RefusedVocabulary("CSO",
                            new ExportedTaxonomy.Bar(17, 16, 9, 1.06, 340, 320, 1.06, 0, 0.001, 7, FIELD, 999))), 118, 0, 0));

    private static final ExportedPullRequest PULL_REQUEST_READ = new ExportedPullRequest(3154,
            "tballison", "9351a7063d41ec9a47a50b444a9f0242fd765860",
            "fa7ea0996857fd785d782d0cb887c04b996dddb9", 11,
            Map.of("ordinary English", 0.0004),
            List.of(new ExportedSignal(ReadingSource.PULL_REQUEST, "inference", 12, 9, 0.03, 0.025,
                    "ordinary English", new SightingSite("Engine.java", 3))));

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
                EXPORT.thresholds(), EXPORT.themes(), EXPORT.taxonomies(), EXPORT.setAside(), List.of());

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
                .isThrownBy(() -> new ExportedPlacement.Level("cs", 0.42, 0.40, true, List.of(),
                        List.of()))
                .withMessageContaining("standsApartFromChance=true");
    }

    @Test
    void statesTheSubjectPlacementOnceAndUnderTheReadingThatMadeIt() throws IOException {
        final String written = file.of(twoTaxonomies());

        assertThat(occurrencesOf("\"scheme\"", written))
                .as("one reading placed this repository and the summary states it, so a placement repeated "
                        + "under each taxonomy reads as that taxonomy's own answer and is not")
                .isEqualTo(1);
    }

    private static ReadingExport twoTaxonomies() {
        final List<ExportedTaxonomy> both = List.of(EXPORT.taxonomies().getFirst(),
                new ExportedTaxonomy("CSO", List.of(), List.of(),
                        Map.of("words", 0, "lemmas", 0, "expansions", 0, "senses", 0),
                        new ExportedTaxonomy.Bar(4, 1, 0, 4.0, 80, 20, 4.0, 0, 0.001, 7, FIELD, 999)));
        return new ReadingExport(EXPORT.schemaVersion(), EXPORT.summary(), EXPORT.signals(),
                EXPORT.thresholds(), EXPORT.themes(), both, EXPORT.setAside(), List.of());
    }

    private static int occurrencesOf(final String key, final String document) {
        return document.split(key, -1).length - 1;
    }

    @Test
    void admitsADocumentCarryingAPullRequestReadBesideTheTree() throws IOException {
        final ReadingExport with = EXPORT.withPullRequests(List.of(PULL_REQUEST_READ));

        assertThat(schema.refusals(new ObjectMapper().readTree(file.of(with)))).isEmpty();
    }

    @Test
    void leavesEveryRepositoryBlockWhereItStoodWhenPullRequestsArrive() {
        final ReadingExport with = EXPORT.withPullRequests(List.of(PULL_REQUEST_READ));

        assertAll(
                () -> assertThat(with.summary()).isEqualTo(EXPORT.summary()),
                () -> assertThat(with.signals()).isEqualTo(EXPORT.signals()),
                () -> assertThat(with.thresholds()).isEqualTo(EXPORT.thresholds()),
                () -> assertThat(with.themes()).isEqualTo(EXPORT.themes()),
                () -> assertThat(with.taxonomies()).isEqualTo(EXPORT.taxonomies()),
                () -> assertThat(with.setAside()).isEqualTo(EXPORT.setAside()),
                () -> assertThat(with.pullRequests()).containsExactly(PULL_REQUEST_READ));
    }

    @Test
    void refusesAPullRequestWhoseHeadIsNotACommitSha() throws IOException {
        final String unpinned = file.of(EXPORT.withPullRequests(List.of(PULL_REQUEST_READ)))
                .replace("9351a7063d41ec9a47a50b444a9f0242fd765860", "HEAD");

        assertThat(schema.refusals(new ObjectMapper().readTree(unpinned)))
                .as("a reading of a moving target is not reproducible, so an unpinned head fails here")
                .isNotEmpty();
    }

    @Test
    void refusesASignalStatingASourceTheSchemaDoesNotName() throws IOException {
        final String unsourced = file.of(EXPORT).replace("\"CLONE\"", "\"SNAPSHOT\"");

        assertThat(schema.refusals(new ObjectMapper().readTree(unsourced))).isNotEmpty();
    }

    @Test
    void namesApartTheTwoRulesThatSetAWordAside() throws IOException {
        assertThat(file.of(EXPORT))
                .as("a word English supplies cleared every threshold, so one figure covering both rules is "
                        + "named for a bar the second kind of word is not below")
                .contains("\"wordsBelowEveryThreshold\"", "\"wordsTheLanguageSupplies\"");
    }
}
