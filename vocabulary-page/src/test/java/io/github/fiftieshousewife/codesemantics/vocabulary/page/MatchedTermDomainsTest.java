package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import org.junit.jupiter.api.Test;

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

    private static final List<ReadingFolder.TermMatchRow> MATCHES = List.of(
            row("FpML", "valuation date", 2, 795, "REPORTED", "ValuationDate"),
            row("FIX", "valuation date", 2, 795, "REPORTED", "ValuationDate"),
            row("FIBO", "present value", 2, 1429, "REPORTED", "PresentValue"),
            row("FIX", "trade date", 2, 424, "REPORTED", "TradeDate"));

    private static final DomainOverlap OVERLAP =
            MatchedTermDomains.of("a-repository", MATCHES).orElseThrow();

    private static List<DomainOverlap.Placed> placed() {
        return OVERLAP.regions().stream()
                .flatMap(region -> region.words().stream())
                .toList();
    }

    @Test
    void drawsTheVocabulariesAsTheSets() {
        assertThat(OVERLAP.domains())
                .extracting(DomainOverlap.Drawn::domain)
                .containsExactlyInAnyOrder("FIBO", "FpML", "FIX");
    }

    @Test
    void placesAPhraseInTheOverlapOfEveryVocabularyThatStatesIt() {
        final DomainOverlap.Placed shared = placed().stream()
                .filter(word -> word.word().equals("valuation date"))
                .findFirst()
                .orElseThrow();

        assertAll(
                () -> assertThat(shared.unambiguous()).isFalse(),
                () -> assertThat(OVERLAP.regions().stream()
                        .filter(region -> region.words().contains(shared))
                        .flatMap(region -> region.domains().stream()
                                .map(index -> OVERLAP.domains().get(index).domain())))
                        .containsExactlyInAnyOrder("FpML", "FIX"));
    }

    @Test
    void claimsThePhraseAtTheMostAnyOneVocabularyCounted() {
        assertThat(placed())
                .extracting(DomainOverlap.Placed::word, DomainOverlap.Placed::claim)
                .contains(tuple("valuation date", 795.0), tuple("present value", 1429.0));
    }

    @Test
    void namesTheMatchedConceptsAsThePlacingLabels() {
        assertThat(placed().stream()
                .filter(word -> word.word().equals("present value"))
                .findFirst()
                .orElseThrow()
                .placedBy())
                .containsExactly("PresentValue");
    }

    @Test
    void leavesSingleWordAndBranchRefusedMatchesOut() {
        assertThat(MatchedTermDomains.of("a-repository", List.of(
                row("FpML", "rate", 1, 400, "REPORTED", "InterestRate"),
                row("FpML", "present value", 2, 10, "REFUSED_BY_BRANCH_RULE", "PresentValue"))))
                .isEmpty();
    }
}
