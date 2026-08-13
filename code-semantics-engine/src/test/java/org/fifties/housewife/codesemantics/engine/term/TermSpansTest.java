package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fifties.housewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermSpansTest {

    private static final String SOURCE = "a taxonomy";

    @Test
    void findsATermTheSourcePublishesAmongWordsItDoesNot() {
        final List<TermSpan> found = spansOver("common noun").in(List.of("read", "common", "noun", "at"));

        assertAll(
                () -> assertThat(found).hasSize(1),
                () -> assertThat(found.getFirst().words()).containsExactly("common", "noun"),
                () -> assertThat(found.getFirst().from()).isEqualTo(1),
                () -> assertThat(found.getFirst().to()).isEqualTo(3));
    }

    @Test
    void takesTheLongestTermWhereAShorterOneWouldAlsoHaveMatched() {
        final List<TermSpan> found = spansOver("noun", "common noun").in(List.of("common", "noun"));

        assertAll(
                () -> assertThat(found).hasSize(1),
                () -> assertThat(found.getFirst().words()).containsExactly("common", "noun"));
    }

    @Test
    void advancesPastATermItMatchedSoNoTwoSpansOverlap() {
        final List<TermSpan> found = spansOver("noun", "phrase").in(List.of("noun", "phrase"));

        assertAll(
                () -> assertThat(found).hasSize(2),
                () -> assertThat(found.getFirst().to()).isEqualTo(found.getLast().from()));
    }

    @Test
    void abstainsOnAPrefixThatIsNotItselfAPublishedTerm() {
        assertThat(spansOver("common noun").in(List.of("common", "case"))).isEmpty();
    }

    @Test
    void abstainsWhereTheSameWordsAppearInAnOrderTheSourceDoesNotPublish() {
        assertThat(spansOver("noun phrase").in(List.of("phrase", "noun"))).isEmpty();
    }

    @Test
    void findsATermWhateverCaseTheRepositoryWroteItIn() {
        assertThat(spansOver("common noun").in(List.of("Common", "Noun"))).hasSize(1);
    }

    @Test
    void carriesEveryConceptTheSourcePublishesUnderTheTerm() {
        assertThat(spansOver("feature", "feature").in(List.of("feature")).getFirst().concepts()).hasSize(2);
    }

    @Test
    void namesTheSourceThatStatedWhatItFound() {
        assertThat(spansOver("noun").in(List.of("noun")).getFirst().source()).isEqualTo(SOURCE);
    }

    @Test
    void readsNothingOutOfNoWordsAtAll() {
        assertThat(spansOver("noun").in(List.of())).isEmpty();
    }

    @Test
    void saysTheWordsThemselvesAnsweredWhereTheyDid() {
        assertThat(ladderOver("noun").in(List.of("noun")).getFirst().rung()).isEqualTo(TermRung.WORDS);
    }

    @Test
    void fallsToTheMeaningOnlyWhereTheWordsSaidNothing() {
        final List<TermSpan> found = ladderOver("noun phrase").in(List.of("nominal", "phrase"));

        assertAll(
                () -> assertThat(found).hasSize(1),
                () -> assertThat(found.getFirst().rung()).isEqualTo(TermRung.SENSES),
                () -> assertThat(found.getFirst().words()).containsExactly("nominal", "phrase"));
    }

    @Test
    void takesTheWordsThemselvesWhereBothRungsWouldHaveAnswered() {
        assertThat(ladderOver("noun phrase").in(List.of("noun", "phrase")).getFirst().rung())
                .isEqualTo(TermRung.WORDS);
    }

    @Test
    void abstainsOnARunNoRungOfTheLadderAnswers() {
        assertThat(ladderOver("noun phrase").in(List.of("interest", "rate"))).isEmpty();
    }

    private static TermSpans spansOver(final String... terms) {
        return new TermSpans(publishing(SOURCE, terms));
    }

    private static TermSpans ladderOver(final String... terms) {
        final TermIndex published = publishing(SOURCE, terms);
        return new TermSpans(published, SensedTerms.over(published, SenseRuns.fromClasspath()));
    }
}
