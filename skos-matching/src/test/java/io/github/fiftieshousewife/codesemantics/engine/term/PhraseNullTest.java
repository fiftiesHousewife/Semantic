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

class PhraseNullTest {

    private static final int DEALS = 99;

    private static final List<String> PHRASES = List.of("interest rate", "maturity date", "trade date",
            "settlement instruction", "collateral management", "order allocation");

    private static final TermIndex STATED = publishing("stated", PHRASES.toArray(String[]::new));

    private static final TermIndex UNSTATED = publishing("unstated", "photosynthetic pathway");

    private static WrittenRun run(final List<String> words) {
        return new WrittenRun(words, new NameOccurrence(String.join("", words), NameForm.TYPE, 1));
    }

    /**
     * Each of the publisher's phrases written once, among names of words it never states — so a deal has
     * enough of the repository's own vocabulary to scatter the published orders into.
     */
    private static List<WrittenRun> aRepositoryWriting(final int otherNames) {
        return Stream.concat(
                        PHRASES.stream().map(phrase -> run(List.of(phrase.split(" ")))),
                        IntStream.range(0, otherNames)
                                .mapToObj(name -> run(List.of("held" + name, "value" + name))))
                .toList();
    }

    private static List<PhraseNull.Bar> barsOver(final List<WrittenRun> written) {
        return new PhraseNull(DEALS, 7L).over(written, List.of(STATED, UNSTATED));
    }

    @Test
    void namesEveryVocabularyItWasAskedAbout() {
        assertThat(barsOver(aRepositoryWriting(200))).extracting(PhraseNull.Bar::vocabulary)
                .containsExactly("stated", "unstated");
    }

    @Test
    void countsHowOftenThePublishersPhrasesStandInTheNamesAsTheObservedFigure() {
        assertAll(
                () -> assertThat(barsOver(aRepositoryWriting(200)).getFirst().observed()).isEqualTo(6),
                () -> assertThat(barsOver(aRepositoryWriting(200)).getLast().observed()).isZero());
    }

    @Test
    void putsAVocabularyTheRepositoryWritesAboveTheBarItsOwnWordsSet() {
        assertThat(barsOver(aRepositoryWriting(200)).getFirst().exceedsChance()).isTrue();
    }

    @Test
    void leavesAVocabularyTheRepositoryNeverWritesBelowItsBar() {
        assertThat(barsOver(aRepositoryWriting(200)).getLast().exceedsChance()).isFalse();
    }

    @Test
    void statesTheFieldAsTheNumberOfVocabulariesCompeting() {
        assertThat(barsOver(aRepositoryWriting(200))).extracting(PhraseNull.Bar::field)
                .containsExactly(2, 2);
    }

    @Test
    void boundsTheChanceRateBelowByOneOverOneMoreThanTheDeals() {
        assertThat(barsOver(aRepositoryWriting(200)))
                .allSatisfy(bar -> assertThat(bar.chanceRate())
                        .isBetween(1.0 / (DEALS + 1), 1.0));
    }

    @Test
    void readsTheSameTreeTheSameWayAtOneSeed() {
        assertThat(barsOver(aRepositoryWriting(200))).isEqualTo(barsOver(aRepositoryWriting(200)));
    }

    @Test
    void refusesToClearTheBarWhereEveryNameIsOneWordAndNoPhraseCanExist() {
        final List<WrittenRun> single = List.of(run(List.of("interest")), run(List.of("rate")));

        assertThat(barsOver(single)).allSatisfy(bar -> assertAll(
                () -> assertThat(bar.observed()).isZero(),
                () -> assertThat(bar.exceedsChance()).isFalse()));
    }
}
