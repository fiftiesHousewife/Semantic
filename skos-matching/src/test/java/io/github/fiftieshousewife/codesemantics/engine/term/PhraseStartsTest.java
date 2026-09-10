package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.assertj.core.api.Assertions.assertThat;

class PhraseStartsTest {

    private static final PhraseStarts STARTS =
            PhraseStarts.of(publishing("a taxonomy", "interest rate", "maturity date", "ledger"));

    private static final PhraseStarts EVERY_TERM =
            PhraseStarts.ofEveryTerm(publishing("a taxonomy", "interest rate", "maturity date", "ledger"));

    @Test
    void countsTheFirstWordOfEveryTermOfMoreThanOneWord() {
        assertThat(STARTS.count()).isEqualTo(2);
    }

    @Test
    void admitsARunHoldingAWordThatBeginsAPublishedPhrase() {
        assertThat(STARTS.couldBeIn(List.of("the", "interest", "rate"))).isTrue();
    }

    @Test
    void admitsARunHoldingThatWordWhereverItStands() {
        assertThat(STARTS.couldBeIn(List.of("rate", "interest"))).isTrue();
    }

    @Test
    void refusesARunHoldingNoWordAnyPublishedPhraseBeginsAt() {
        assertThat(STARTS.couldBeIn(List.of("rate", "date"))).isFalse();
    }

    @Test
    void refusesARunOfOneWordWhichCanHoldNoPhraseAtAll() {
        assertThat(STARTS.couldBeIn(List.of("interest"))).isFalse();
    }

    @Test
    void countsNoWordOfATermTheSourcePublishesInOneWord() {
        assertThat(STARTS.couldBeIn(List.of("ledger", "ledger"))).isFalse();
    }

    @Test
    void countsTheFirstWordOfEveryTermWhereEveryTermIsReported() {
        assertThat(EVERY_TERM.count()).isEqualTo(3);
    }

    @Test
    void admitsARunOfOneWordWhereEveryTermIsReported() {
        assertThat(EVERY_TERM.couldBeIn(List.of("ledger"))).isTrue();
    }

    @Test
    void refusesARunHoldingNoWordAnyTermBeginsAtWhereEveryTermIsReported() {
        assertThat(EVERY_TERM.couldBeIn(List.of("rate", "date"))).isFalse();
    }
}
