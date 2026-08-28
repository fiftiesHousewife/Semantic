package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.assertj.core.api.Assertions.assertThat;

class MatchedPhrasesTest {

    private static final MatchedPhrases COUNTING =
            MatchedPhrases.over(publishing("a taxonomy", "interest rate", "maturity date", "ledger"));

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
    void countsAPhraseStandingInManyNamesOnce() {
        assertThat(COUNTING.in(List.of(run(List.of("interest", "rate")),
                run(List.of("the", "interest", "rate"))))).isEqualTo(1);
    }

    @Test
    void countsEachDistinctPhraseTheSourceStates() {
        assertThat(COUNTING.in(List.of(run(List.of("interest", "rate")),
                run(List.of("maturity", "date"))))).isEqualTo(2);
    }

    @Test
    void countsNoPhraseThatIsTheTypeWrittenBesideTheNameSpelledAgain() {
        assertThat(COUNTING.in(List.of(typed(List.of("interest", "rate"),
                List.of("interest", "rate"))))).isZero();
    }

    @Test
    void findsAPhraseWhateverElseTheNameHoldsAroundIt() {
        assertThat(COUNTING.in(List.of(run(List.of("held", "interest", "rate", "at"))))).isEqualTo(1);
    }

    @Test
    void countsNothingWhereTheWordsStandInAnOrderTheSourceDoesNotPublish() {
        assertThat(COUNTING.in(List.of(run(List.of("rate", "interest"))))).isZero();
    }
}
