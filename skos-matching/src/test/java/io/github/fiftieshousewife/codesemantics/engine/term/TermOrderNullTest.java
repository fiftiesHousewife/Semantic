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
    void statesTheFieldAsTheSourcesCompeting() {
        assertThat(barsOver(List.of(ITS_ORDERS, OTHER_ORDERS))).extracting(PhraseBar::field)
                .containsExactly(List.of("its orders", "other orders"),
                        List.of("its orders", "other orders"));
    }

    @Test
    void readsTheSameTreeTheSameWayAtOneSeed() {
        assertThat(barsOver(List.of(ITS_ORDERS)))
                .isEqualTo(barsOver(List.of(ITS_ORDERS)));
    }

    @Test
    void countsHowManyTermsWereWrittenUnlessItIsAskedForHowOften() {
        final List<WrittenRun> written = aRepositoryWriting(20);

        assertAll(
                () -> assertThat(new TermOrderNull(DEALS, 11L).over(written, List.of(ITS_ORDERS))
                        .getFirst().observed())
                        .as("each of the six published orders, counted once")
                        .isEqualTo(ITS_ORDERS.terms().size()),
                () -> assertThat(new TermOrderNull(DEALS, 11L, CountedPhrases.HOW_OFTEN)
                        .over(written, List.of(ITS_ORDERS)).getFirst().observed())
                        .as("the same six, counted once for every name each stands in")
                        .isEqualTo(ITS_ORDERS.terms().size() * 20));
    }

    @Test
    void countsATermOfOneWordOnlyWhereEveryTermIsReported() {
        final List<WrittenRun> written = List.of(run(List.of("interest", "rate")),
                run(List.of("collateral")));
        final TermIndex published = publishing("a taxonomy", "interest rate", "collateral");

        assertAll(
                () -> assertThat(new TermOrderNull(DEALS, 11L).over(written, List.of(published))
                        .getFirst().observed())
                        .as("the walk the reading publishes counts the phrase alone")
                        .isEqualTo(1),
                () -> assertThat(new TermOrderNull(DEALS, 11L, CountedPhrases.HOW_MANY,
                        ReportedSpans.EVERY_TERM).over(written, List.of(published))
                        .getFirst().observed())
                        .as("the every-term walk counts the phrase and the single word")
                        .isEqualTo(2));
    }

    @Test
    void neverPutsASourceOfOnlySingleWordsAboveItsBar() {
        final TermIndex oneWorders = publishing("one worders", "collateral", "ledger", "account");
        final List<WrittenRun> written = List.of(run(List.of("collateral")),
                run(List.of("ledger")), run(List.of("account")));

        final PhraseBar bar = new TermOrderNull(DEALS, 11L, CountedPhrases.HOW_MANY,
                ReportedSpans.EVERY_TERM).over(written, List.of(oneWorders)).getFirst();

        assertAll(
                () -> assertThat(bar.observed()).isEqualTo(3),
                () -> assertThat(bar.exceedsChance())
                        .as("a deal of terms of one word states the same terms, so a single word has "
                                + "no published order for a deal to destroy")
                        .isFalse());
    }

    @Test
    void drawsItsBarInWhicheverUnitItCounts() {
        final List<WrittenRun> written = aRepositoryWriting(20);
        final PhraseBar many = new TermOrderNull(DEALS, 11L).over(written, List.of(ITS_ORDERS)).getFirst();
        final PhraseBar often = new TermOrderNull(DEALS, 11L, CountedPhrases.HOW_OFTEN)
                .over(written, List.of(ITS_ORDERS)).getFirst();

        assertAll(
                () -> assertThat(often.observed()).isGreaterThan(many.observed()),
                () -> assertThat(often.exceedsChance())
                        .as("a source whose orders the repository writes stands above either bar")
                        .isTrue());
    }
}
