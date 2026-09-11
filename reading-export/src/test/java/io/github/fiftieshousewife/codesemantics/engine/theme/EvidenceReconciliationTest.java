package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedReading;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.term.TermMatch;
import io.github.fiftieshousewife.codesemantics.engine.term.TermOutcome;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.WordVerdict;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The counts {@code reading.json} states and the rows {@code evidence.json} lists come from one reading, so
 * each count equals the rows behind it. The two files are written by different classes, and this is what
 * holds them to one another.
 */
class EvidenceReconciliationTest {

    private static ReadingExport export;

    private static ReadingEvidence evidence;

    @BeforeAll
    static void readOneTreeIntoBothDocuments(@TempDir final Path root) throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("NounPhrase.java"),
                "package a; /** Reads a noun phrase. */ class NounPhrase "
                        + "{ String headword; String lemma; String adjective; }");
        final TreeReading reading = TreeReading.of(root);
        export = new ExportedReading().of(reading.reading(), "", List.of(), reading.terms(),
                reading.arxivField(), reading.namesChance());
        evidence = EvidenceCommand.evidenceOf(reading, "");
    }

    private static long verdicts(final WordVerdict verdict) {
        return evidence.vocabulary().stream().filter(word -> word.verdict() == verdict).count();
    }

    @Test
    void statesEachWordCountOverTheRowsThatCarryItsVerdict() {
        assertAll(
                () -> assertThat(verdicts(WordVerdict.SIGNAL))
                        .isEqualTo(export.summary().counts().signals()),
                () -> assertThat(verdicts(WordVerdict.BELOW_A_THRESHOLD)
                        + verdicts(WordVerdict.WITHIN_THE_REFERENCES_ERROR))
                        .isEqualTo(export.setAside().wordsBelowEveryThreshold()),
                () -> assertThat(verdicts(WordVerdict.WITHIN_THE_REFERENCES_ERROR))
                        .isEqualTo(export.setAside().wordsWithinTheReferencesError()),
                () -> assertThat(verdicts(WordVerdict.SUPPLIED_BY_THE_LANGUAGE))
                        .isEqualTo(export.setAside().wordsTheLanguageSupplies()));
    }

    @Test
    void accountsForEveryRankedWordAcrossTheSignalsAndTheTwoRemovingRules() {
        assertThat(export.summary().counts().signals()
                + export.setAside().wordsBelowEveryThreshold()
                + export.setAside().wordsTheLanguageSupplies())
                .isEqualTo(evidence.vocabulary().size());
    }

    @Test
    void listsTheRefusedWordsBehindTheBelowThresholdCount() {
        assertThat(evidence.setAside().wordsBelowEveryThreshold())
                .hasSize(export.setAside().wordsBelowEveryThreshold());
    }

    @Test
    void countsTheBranchRulesDiscardsAsTheTermsWithOnlyRefusedRows() {
        final long termsNothingReported = evidence.matches().stream()
                .filter(match -> match.vocabulary().equals("OLiA"))
                .map(TermMatch::term)
                .distinct()
                .filter(EvidenceReconciliationTest::neverReported)
                .count();

        assertThat(termsNothingReported)
                .as("the export judged OLiA alone here, so its count is OLiA's rows")
                .isEqualTo(export.setAside().matchesDiscardedByBranchRule());
    }

    private static boolean neverReported(final String term) {
        return evidence.matches().stream()
                .filter(match -> match.vocabulary().equals("OLiA") && match.term().equals(term))
                .noneMatch(match -> match.outcome() == TermOutcome.REPORTED);
    }

    @Test
    void sumsEachReportedRowsConceptsToTheTaxonomysConceptRows() {
        export.taxonomies().forEach(taxonomy -> assertThat(evidence.matches().stream()
                .filter(match -> match.vocabulary().equals(taxonomy.vocabulary()))
                .filter(match -> match.outcome() == TermOutcome.REPORTED)
                .mapToInt(match -> match.concepts().size())
                .sum())
                .as("%s's concept rows are its reported matches, one per concept",
                        taxonomy.vocabulary())
                .isEqualTo(taxonomy.concepts().size()));
    }
}
