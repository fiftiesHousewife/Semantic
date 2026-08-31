package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.assertj.core.api.Assertions.assertThat;

class PhraseOccurrencesTest {

    private static final PhraseOccurrences COUNTING =
            PhraseOccurrences.over(publishing("a taxonomy", "interest rate", "maturity date", "ledger"));

    private static WrittenRun run(final List<String> words) {
        return new WrittenRun(words, new NameOccurrence(String.join("", words), NameForm.TYPE, 1));
    }

    private static WrittenRun typed(final List<String> words, final List<String> typeWords) {
        return new WrittenRun(words,
                new NameOccurrence(String.join("", words), NameForm.FIELD, 1, 1.0, typeWords));
    }

    @Test
    void countsNoTermOfOneWordHoweverOftenItWasWritten() {
        assertThat(COUNTING.in(List.of(run(List.of("ledger")), run(List.of("ledger"))))).isZero();
    }

    @Test
    void countsOnePhraseOnceForEveryNameItStandsIn() {
        assertThat(COUNTING.in(List.of(run(List.of("interest", "rate")),
                run(List.of("the", "interest", "rate"))))).isEqualTo(2);
    }

    @Test
    void countsEveryPhraseStandingInOneName() {
        assertThat(COUNTING.in(List.of(run(List.of("interest", "rate", "maturity", "date"))))).isEqualTo(2);
    }

    @Test
    void countsNoPhraseThatIsTheTypeWrittenBesideTheNameSpelledAgain() {
        assertThat(COUNTING.in(List.of(typed(List.of("interest", "rate"),
                List.of("interest", "rate"))))).isZero();
    }

    @Test
    void countsNothingWhereTheWordsStandInAnOrderTheSourceDoesNotPublish() {
        assertThat(COUNTING.in(List.of(run(List.of("rate", "interest"))))).isZero();
    }

    @Test
    void agreesWithTheDistinctCountWhereEveryPhraseIsWrittenOnce() {
        final List<WrittenRun> written = List.of(run(List.of("interest", "rate")), run(List.of("maturity", "date")));
        final TermIndex index = publishing("a taxonomy", "interest rate", "maturity date", "ledger");

        assertThat(PhraseOccurrences.over(index).in(written))
                .isEqualTo(MatchedPhrases.over(index).in(written));
    }
}
