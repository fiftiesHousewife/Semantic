package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.assertj.core.api.Assertions.assertThat;

class ScrambledTermsTest {

    private static final TermIndex PUBLISHED =
            publishing("a taxonomy", "interest rate", "maturity date", "trade date", "ledger");

    private static ScrambledTerms dealt() {
        return ScrambledTerms.of(PUBLISHED, new Random(3));
    }

    private static List<String> wordsOf(final TermIndex index) {
        return index.terms().stream().flatMap(List::stream).sorted().toList();
    }

    @Test
    void dealsEveryWordThePublisherStatesAndNoOther() {
        assertThat(wordsOf(dealt())).isEqualTo(wordsOf(PUBLISHED));
    }

    @Test
    void keepsEachTermAtTheLengthThePublisherWroteIt() {
        assertThat(dealt().terms().stream().map(List::size).sorted().toList())
                .isEqualTo(PUBLISHED.terms().stream().map(List::size).sorted().toList());
    }

    @Test
    void carriesTheConceptsOfTheTermEachDealtRunTookThePlaceOf() {
        assertThat(dealt().terms().stream().mapToInt(term -> dealt().conceptsOf(term).size()).sum())
                .isEqualTo(PUBLISHED.terms().size());
    }

    @Test
    void statesNothingForARunItWasNotDealt() {
        assertThat(dealt().conceptsOf(List.of("photosynthetic", "pathway"))).isEmpty();
    }

    @Test
    void speaksAsThePublisherItWasDealtFrom() {
        assertThat(dealt().source()).isEqualTo(PUBLISHED.source());
    }

    @Test
    void asksAboutRunsNoLongerThanThePublishersOwnLongestTerm() {
        assertThat(dealt().longestTerm()).isEqualTo(PUBLISHED.longestTerm());
    }

    @Test
    void dealsTheSameWayTwiceAtOneSeed() {
        assertThat(dealt().terms()).isEqualTo(ScrambledTerms.of(PUBLISHED, new Random(3)).terms());
    }
}
