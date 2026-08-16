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

    @Test
    void doesNotBreakAWordAtAnApostropheBetweenLetters() {
        assertAll(
                () -> assertThat(Tokeniser.words("the resource's own header"))
                        .containsExactly("the", "resource's", "own", "header"),
                () -> assertThat(Tokeniser.words("what it doesn't carry"))
                        .containsExactly("what", "it", "doesn't", "carry"),
                () -> assertThat(Tokeniser.words("the resource’s own header"))
                        .containsExactly("the", "resource’s", "own", "header")
        );
    }

    @Test
    void breaksAtAnApostropheThatIsNotBetweenLetters() {
        assertAll(
                () -> assertThat(Tokeniser.words("the authors' names"))
                        .containsExactly("the", "authors", "names"),
                () -> assertThat(Tokeniser.words("'quoted'")).containsExactly("quoted"),
                () -> assertThat(Tokeniser.words("the 90's")).containsExactly("the", "90", "s")
        );
    }

    @Test
    void namesTheLastTokenOfACompoundNameAndNothingForASingleWord() {
        assertAll(
                () -> assertThat(Tokeniser.lastToken("resolveNextPageCursor")).contains("cursor"),
                () -> assertThat(Tokeniser.lastToken("life_expectancy")).contains("expectancy"),
                () -> assertThat(Tokeniser.lastToken("cursor")).isEmpty(),
                () -> assertThat(Tokeniser.lastToken("")).isEmpty());
    }

    @Test
    void splitsTheIdentifiersItsGrammarAlreadyReads() {
        assertAll(
                () -> assertThat(Tokeniser.tokenise("AxisEvidenceAccumulator"))
                        .containsExactly("axis", "evidence", "accumulator"),
                () -> assertThat(Tokeniser.tokenise("co2_per_capita")).containsExactly("co2", "per", "capita"),
                () -> assertThat(Tokeniser.tokenise("ft_1")).containsExactly("ft", "1"));
    }

    /**
     * The narrow grammar's known mis-splits, pinned so that widening it is a measured change rather than an
     * accident: an acronym run has no boundary rule here, and {@code IdentifierWords} is where one was added.
     *
     * <p>The letter/digit edges in the last two are a different case and are <em>not</em> mis-splits. UAX #29
     * states no boundary between a letter and a digit (WB9, WB10), so {@code ipv6address} and
     * {@code utf8decode} are what Unicode's own grammar reads there, and only the missing acronym rule is a
     * defect. Overriding the standard for a particular run is what a catalogue of cited tokens would buy.
     */
    @Test
    void readsTheAcronymRunsAndDigitEdgesItIsKnownNotToSplit() {
        assertAll(
                () -> assertThat(Tokeniser.tokenise("XMLHttpRequest")).containsExactly("xmlhttp", "request"),
                () -> assertThat(Tokeniser.tokenise("parseHTTPResponse")).containsExactly("parse", "httpresponse"),
                () -> assertThat(Tokeniser.tokenise("toJSONString")).containsExactly("to", "jsonstring"),
                () -> assertThat(Tokeniser.tokenise("getDSLContext")).containsExactly("get", "dslcontext"),
                () -> assertThat(Tokeniser.tokenise("IPv6Address")).containsExactly("ipv6address"),
                () -> assertThat(Tokeniser.tokenise("utf8Decode")).containsExactly("utf8decode"));
    }
}
