package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermOrderNullTest {

    private static final int DEALS = 99;

    /** A source whose words are common in the repository, published in orders the repository writes. */
    private static final TermIndex ITS_ORDERS = publishing("its orders",
            "interest rate", "maturity date", "trade date", "settlement instruction",
            "collateral account", "order allocation");

    /** The same words in orders the repository never writes, which is what a deal of the first produces. */
    private static final TermIndex OTHER_ORDERS = publishing("other orders",
            "rate interest", "date maturity", "date trade", "instruction settlement",
            "account collateral", "allocation order");

    private static WrittenRun run(final List<String> words) {
        return new WrittenRun(words, new NameOccurrence(String.join("", words), NameForm.TYPE, 1));
    }

    /** Each published order written many times over, which is how a repository writes a name. */
    private static List<WrittenRun> aRepositoryWriting(final int times) {
        return Stream.of(ITS_ORDERS.terms().stream().toList())
                .flatMap(terms -> IntStream.range(0, times)
                        .mapToObj(again -> terms.stream().map(TermOrderNullTest::run).toList())
                        .flatMap(List::stream))
                .toList();
    }

    private static List<PhraseBar> barsOver(final List<TermIndex> judged) {
        return new TermOrderNull(DEALS, 11L).over(aRepositoryWriting(20), judged);
    }

    @Test
    void namesEverySourceItWasAskedAbout() {
        assertThat(barsOver(List.of(ITS_ORDERS, OTHER_ORDERS))).extracting(PhraseBar::vocabulary)
                .containsExactly("its orders", "other orders");
    }

    @Test
    void putsASourceWhosePublishedOrdersTheRepositoryWritesAboveItsBar() {
        assertThat(barsOver(List.of(ITS_ORDERS, OTHER_ORDERS)).getFirst().exceedsChance()).isTrue();
    }

    @Test
    void leavesASourceOfTheSameWordsInOrdersTheRepositoryNeverWritesBelowItsBar() {
        final PhraseBar other = barsOver(List.of(ITS_ORDERS, OTHER_ORDERS)).getLast();

        assertAll(
                () -> assertThat(other.observed()).isZero(),
                () -> assertThat(other.exceedsChance()).isFalse());
    }

    @Test
    void statesTheFieldAsTheNumberOfSourcesCompeting() {
        assertThat(barsOver(List.of(ITS_ORDERS, OTHER_ORDERS))).extracting(PhraseBar::field)
                .containsExactly(2, 2);
    }

    @Test
    void readsTheSameTreeTheSameWayAtOneSeed() {
        assertThat(barsOver(List.of(ITS_ORDERS)))
                .isEqualTo(barsOver(List.of(ITS_ORDERS)));
    }
}
