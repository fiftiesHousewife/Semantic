package org.fifties.housewife.codesemantics.name;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TokeniserTest {

    @Test
    void splitsIdentifiersAtTheirOwnBoundaries() {
        assertAll(
                () -> assertThat(Tokeniser.tokenise("lifeExpectancy")).containsExactly("life", "expectancy"),
                () -> assertThat(Tokeniser.tokenise("life_expectancy")).containsExactly("life", "expectancy"),
                () -> assertThat(Tokeniser.tokenise("life-expectancy")).containsExactly("life", "expectancy")
        );
    }

    @Test
    void readsAPhraseAsItsWords() {
        assertThat(Tokeniser.words("Life expectancy at birth, total (years)"))
                .containsExactly("life", "expectancy", "at", "birth", "total", "years");
    }

    @Test
    void readsIdentifierBoundariesInsideEachWordOfAPhrase() {
        assertThat(Tokeniser.words("Net migration, lifeExpectancy"))
                .containsExactly("net", "migration", "life", "expectancy");
    }

    @Test
    void keepsAnIdentifiersWordsWhenItCarriesNoSeparators() {
        assertThat(Tokeniser.words("sucrose_100g")).containsExactly("sucrose", "100g");
    }

    @Test
    void readsNoWordsFromPunctuationAlone() {
        assertThat(Tokeniser.words("(%)")).isEmpty();
    }
}
