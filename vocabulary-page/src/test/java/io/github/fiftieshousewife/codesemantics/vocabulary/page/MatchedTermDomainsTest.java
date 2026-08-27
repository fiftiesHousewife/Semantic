package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class MatchedTermDomainsTest {

    private static ReadingFolder.TermMatchRow row(final String vocabulary, final String term,
                                                  final int wordsInTerm, final int occurrences,
                                                  final String outcome, final String... concepts) {
        return new ReadingFolder.TermMatchRow(vocabulary, term, wordsInTerm, "WORDS", occurrences,
                outcome, List.of(concepts));
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept(label, label, "", broader, "class", "", "", "");
    }

    private static SkosConcept flat(final String label, final String module) {
        return new SkosConcept(label, label, "", "", "class", module, "", "");
    }

    @Test
    void namesEveryVocabularyInTheSummaryWithItsDescription() {
        final List<MatchedTermDomains.SummaryRow> summary = MatchedTermDomains.summary(List.of(
                row("FIBO", "interest rate", 2, 72, "REPORTED", "InterestRate")));

        assertAll(
                () -> assertThat(summary)
                        .extracting(MatchedTermDomains.SummaryRow::vocabulary)
                        .containsExactlyInAnyOrder("OLiA", "CSO", "FIBO", "FpML", "FIX", "CWE", "BIAN"),
                () -> assertThat(summary.getFirst().vocabulary()).isEqualTo("FIBO"),
                () -> assertThat(summary.getFirst().phraseOccurrences()).isEqualTo(72),
                () -> assertThat(summary.getFirst().description()).isNotBlank(),
                () -> assertThat(summary.stream()
                        .filter(vocabulary -> !vocabulary.vocabulary().equals("FIBO")))
                        .allSatisfy(vocabulary -> assertThat(vocabulary.phraseTerms()).isZero()));
    }

    @Test
    void drawsTheAreaWhereAConceptsPathStopsHoldingTheMajority() {
        final PublishedPaths paths = new PublishedPaths(List.of(
                concept("Everything", ""),
                concept("Rates", "Everything"),
                concept("InterestRate", "Rates"),
                concept("Valuation", "Everything"),
                concept("PresentValue", "Valuation")));

        final Map<String, String> areas = MatchedTermDomains.areaByConcept(
                Map.of("InterestRate", 70, "PresentValue", 30), paths);

        assertAll(
                () -> assertThat(areas.get("InterestRate"))
                        .as("Everything names the scheme's field and Rates holds 70 of 100, but Rates is"
                                + " the deepest grouping the publisher states, so it is kept")
                        .isEqualTo("Rates"),
                () -> assertThat(areas.get("PresentValue"))
                        .as("Valuation holds 30 of 100 and is the first minority level")
                        .isEqualTo("Valuation"));
    }

    @Test
    void keepsTheOneGroupingAFlatSchemaStatesRatherThanDissolvingIntoLeaves() {
        final PublishedPaths paths = new PublishedPaths(List.of(
                flat("ProductId", "shared"),
                flat("AccountId", "shared"),
                flat("Swap", "ird"),
                flat("CapFloor", "ird"),
                flat("FxSingleLeg", "fx")));

        final Map<String, String> areas = MatchedTermDomains.areaByConcept(
                Map.of("ProductId", 60, "AccountId", 30, "Swap", 10), paths);

        assertAll(
                () -> assertThat(areas.get("ProductId"))
                        .as("shared holds 90 of 100, but it is the only level FpML states")
                        .isEqualTo("shared"),
                () -> assertThat(areas.get("Swap")).isEqualTo("ird"));
    }

    @Test
    void placesEachPhraseUnderItsConceptsAreaWithTheConceptAsThePlacingLabel() {
        final DomainOverlap overlap = MatchedTermDomains.of("a-repository", "FIBO", List.of(
                row("FIBO", "interest rate", 2, 40, "REPORTED", "InterestRate"),
                row("FIBO", "present value", 2, 30, "REPORTED", "PresentValue"),
                row("FIBO", "credit risk", 2, 30, "REPORTED", "CreditRisk"))).orElseThrow();

        assertThat(overlap.regions().stream().flatMap(region -> region.words().stream()))
                .extracting(DomainOverlap.Placed::word)
                .contains("interest rate", "present value", "credit risk");
    }

    @Test
    void statesNoOverlapForAVocabularyWithoutAReportedPhrase() {
        assertAll(
                () -> assertThat(MatchedTermDomains.of("a-repository", "FIBO", List.of(
                        row("FIBO", "rate", 1, 400, "REPORTED", "InterestRate")))).isEmpty(),
                () -> assertThat(MatchedTermDomains.of("a-repository", "FIBO", List.of(
                        row("FIBO", "present value", 2, 10, "REFUSED_BY_BRANCH_RULE", "PresentValue"))))
                        .isEmpty());
    }
}
