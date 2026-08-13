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
     * accident: an acronym run has no boundary rule, and neither has a letter/digit edge. Each of these
     * assertions is expected to be rewritten by the identifier splitter, and none of them silently.
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
