package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.theme.WordSpecificity;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PhraseSpecificityTest {

    private final PhraseSpecificity specificity = PhraseSpecificity.fromClasspath();

    @Test
    void weighsOneWordExactlyAsTheWordItselfIsWeighed() {
        assertThat(specificity.of(List.of("name")))
                .isEqualTo(WordSpecificity.fromClasspath().of("name"));
    }

    @Test
    void weighsAnEverydayWordAtLittleAndAPublishedTermAtNearlyAll() {
        assertAll(
                () -> assertThat(specificity.of(List.of("name"))).isLessThan(0.6),
                () -> assertThat(specificity.of(List.of("interest", "rate", "swap"))).isGreaterThan(0.98),
                () -> assertThat(specificity.of(List.of("adjective", "phrase"))).isGreaterThan(0.99));
    }

    @Test
    void weighsARunTheListDoesNotCarryAtAllAtTheCeiling() {
        assertThat(specificity.of(List.of("determiner"))).isEqualTo(1.0);
    }

    @Test
    void isMoreSpecificForCarryingTheCommonestWordInEnglishThanForNotCarryingIt() {
        assertThat(specificity.of(List.of("the", "name")))
                .as("a run is ordinary exactly to the extent that every word in it is, so a second word "
                        + "makes it less ordinary however common that word is. WordSpecificity weighs "
                        + "rank 1 at log(2) / log(size + 1) and not at zero, because a weight of exactly "
                        + "zero is the gate its javadoc says it is not")
                .isGreaterThan(specificity.of(List.of("name")));
    }

    @Test
    void growsWithEveryWordAddedBecauseARunIsOrdinaryOnlyWhereAllOfItIs() {
        assertThat(specificity.of(List.of("common")))
                .isLessThan(specificity.of(List.of("common", "noun")));
    }

    @Test
    void staysWithinTheBoundTheFrequencyListItselfSets() {
        assertThat(specificity.of(List.of("word", "sense", "disambiguation", "over", "a", "corpus")))
                .isBetween(0.0, 1.0);
    }

    @Test
    void saysNothingAboutARunOfNoWords() {
        assertThat(specificity.of(List.of())).isEqualTo(0.0);
    }
}
