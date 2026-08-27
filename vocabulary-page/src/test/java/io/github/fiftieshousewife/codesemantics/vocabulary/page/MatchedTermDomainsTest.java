package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class MatchedTermDomainsTest {

    private static ReadingFolder.TermMatchRow row(final String vocabulary, final String term,
                                                  final int wordsInTerm, final int occurrences,
                                                  final String outcome, final String... concepts) {
        return new ReadingFolder.TermMatchRow(vocabulary, term, wordsInTerm, "WORDS", occurrences,
                outcome, List.of(concepts));
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept(label, label, "", broader, "topic", "", "", "");
    }

    private static final List<SkosConcept> PUBLISHED = List.of(
            concept("InterestRate", "Rates"),
            concept("Rates", ""),
            concept("PresentValue", "Valuation"),
            concept("Valuation", ""));

    @Test
    void drawsEachReportedPhraseTermUnderThePublishersStatedRoot() {
        final Map<String, DomainOverlap> overlaps = MatchedTermDomains.overlaps("a-repository",
                List.of(row("FpML", "interest rate", 2, 72, "REPORTED", "InterestRate"),
                        row("FpML", "present value", 2, 10, "REPORTED", "PresentValue")),
                Map.of("FpML", PUBLISHED));

        final DomainOverlap overlap = overlaps.get("FpML phrases");
        assertAll(
                () -> assertThat(overlaps.keySet()).containsExactly("FpML phrases"),
                () -> assertThat(overlap.domains())
                        .extracting(DomainOverlap.Drawn::domain)
                        .containsExactly("Rates", "Valuation"),
                () -> assertThat(overlap.regions().stream()
                        .flatMap(region -> region.words().stream()))
                        .extracting(DomainOverlap.Placed::word, DomainOverlap.Placed::claim)
                        .containsExactlyInAnyOrder(
                                tuple("interest rate", 72.0),
                                tuple("present value", 10.0)));
    }

    @Test
    void namesTheMatchedConceptAsThePlacingLabel() {
        final Map<String, DomainOverlap> overlaps = MatchedTermDomains.overlaps("a-repository",
                List.of(row("FpML", "interest rate", 2, 72, "REPORTED", "InterestRate")),
                Map.of("FpML", PUBLISHED));

        assertThat(overlaps.get("FpML phrases").regions().stream()
                .flatMap(region -> region.words().stream()))
                .singleElement()
                .satisfies(placed -> assertThat(placed.placedBy()).containsExactly("InterestRate"));
    }

    @Test
    void leavesSingleWordAndBranchRefusedMatchesOut() {
        final Map<String, DomainOverlap> overlaps = MatchedTermDomains.overlaps("a-repository",
                List.of(row("FpML", "rate", 1, 400, "REPORTED", "InterestRate"),
                        row("FpML", "present value", 2, 10, "REFUSED_BY_BRANCH_RULE", "PresentValue")),
                Map.of("FpML", PUBLISHED));

        assertThat(overlaps).isEmpty();
    }

    @Test
    void ordersVocabulariesByTheirPhraseOccurrences() {
        final Map<String, DomainOverlap> overlaps = MatchedTermDomains.overlaps("a-repository",
                List.of(row("FIBO", "present value", 2, 10, "REPORTED", "PresentValue"),
                        row("FpML", "interest rate", 2, 72, "REPORTED", "InterestRate")),
                Map.of("FIBO", PUBLISHED, "FpML", PUBLISHED));

        assertThat(overlaps.keySet()).containsExactly("FpML phrases", "FIBO phrases");
    }

    @Test
    void sumsTheOccurrencesOfOneConceptMatchedAtSeveralRungs() {
        final Map<String, DomainOverlap> overlaps = MatchedTermDomains.overlaps("a-repository",
                List.of(row("FpML", "interest rate", 2, 40, "REPORTED", "InterestRate"),
                        row("FpML", "interest rates", 2, 32, "REPORTED", "InterestRate")),
                Map.of("FpML", PUBLISHED));

        assertThat(overlaps.get("FpML phrases").domains())
                .extracting(DomainOverlap.Drawn::domain, DomainOverlap.Drawn::claim)
                .containsExactly(tuple("Rates", 72.0));
    }
}
