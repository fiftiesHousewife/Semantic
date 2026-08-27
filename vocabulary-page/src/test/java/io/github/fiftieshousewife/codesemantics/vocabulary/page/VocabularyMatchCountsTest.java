package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;

class VocabularyMatchCountsTest {

    private static ReadingFolder.TermMatchRow row(final String vocabulary, final String term,
                                                  final int wordsInTerm, final int occurrences,
                                                  final String outcome) {
        return new ReadingFolder.TermMatchRow(vocabulary, term, wordsInTerm, "WORDS", occurrences,
                outcome, List.of(term));
    }

    @Test
    void countsPhrasesApartFromSingleWords() {
        final List<VocabularyMatchCounts> counts = VocabularyMatchCounts.of(List.of("FpML"), List.of(
                row("FpML", "interest rate", 2, 72, "REPORTED"),
                row("FpML", "valuation date", 2, 795, "REPORTED"),
                row("FpML", "coupon", 1, 40, "REPORTED")));

        assertThat(counts)
                .extracting(VocabularyMatchCounts::vocabulary, VocabularyMatchCounts::phraseTerms,
                        VocabularyMatchCounts::phraseOccurrences, VocabularyMatchCounts::singleWordTerms,
                        VocabularyMatchCounts::singleWordOccurrences)
                .containsExactly(tuple("FpML", 2, 867, 1, 40));
    }

    @Test
    void leavesBranchRefusedMatchesOut() {
        assertThat(VocabularyMatchCounts.of(List.of("FpML"), List.of(
                row("FpML", "interest rate", 2, 72, "REFUSED_BY_BRANCH_RULE"))))
                .containsExactly(new VocabularyMatchCounts("FpML", 0, 0, 0, 0));
    }

    @Test
    void countsATermOnceHoweverManyRungsMatchedIt() {
        final List<VocabularyMatchCounts> counts = VocabularyMatchCounts.of(List.of("FpML"), List.of(
                row("FpML", "interest rate", 2, 40, "REPORTED"),
                row("FpML", "interest rate", 2, 32, "REPORTED")));

        assertThat(counts)
                .extracting(VocabularyMatchCounts::phraseTerms, VocabularyMatchCounts::phraseOccurrences)
                .containsExactly(tuple(1, 72));
    }

    @Test
    void keepsAVocabularyWithNoMatchAtZero() {
        assertThat(VocabularyMatchCounts.of(List.of("FpML", "CWE"), List.of(
                row("FpML", "interest rate", 2, 72, "REPORTED"))))
                .extracting(VocabularyMatchCounts::vocabulary, VocabularyMatchCounts::phraseTerms)
                .containsExactly(tuple("FpML", 1), tuple("CWE", 0));
    }
}
