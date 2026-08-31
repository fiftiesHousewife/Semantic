package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReachedPhrasesTest {

    private static final TermIndex PUBLISHED =
            publishing("a taxonomy", "interest rate", "maturity date", "ledger");

    private static WrittenRun run(final List<String> words) {
        return new WrittenRun(words, new NameOccurrence(String.join("", words), NameForm.TYPE, 1));
    }

    private static final List<WrittenRun> WRITTEN = List.of(
            run(List.of("interest", "rate")),
            run(List.of("the", "interest", "rate")),
            run(List.of("maturity", "date")),
            run(List.of("ledger")),
            run(List.of("rate", "interest")));

    @Test
    void countsBothHowManyTermsStandAndHowOftenTheyStand() {
        final PhraseReach reach = ReachedPhrases.over(PUBLISHED).in(WRITTEN);

        assertAll(
                () -> assertThat(reach.terms()).isEqualTo(2),
                () -> assertThat(reach.occurrences()).isEqualTo(3));
    }

    @Test
    void agreesWithTheTwoClassesItReplacesOnePassFor() {
        final PhraseReach reach = ReachedPhrases.over(PUBLISHED).in(WRITTEN);

        assertAll(
                () -> assertThat(reach.terms()).isEqualTo(MatchedPhrases.over(PUBLISHED).in(WRITTEN)),
                () -> assertThat(reach.occurrences())
                        .isEqualTo(PhraseOccurrences.over(PUBLISHED).in(WRITTEN)));
    }

    @Test
    void countsNothingForASourceWhoseOrdersTheRepositoryNeverWrote() {
        final PhraseReach reach = ReachedPhrases.over(publishing("other", "date maturity")).in(WRITTEN);

        assertAll(
                () -> assertThat(reach.terms()).isZero(),
                () -> assertThat(reach.occurrences()).isZero());
    }
}
