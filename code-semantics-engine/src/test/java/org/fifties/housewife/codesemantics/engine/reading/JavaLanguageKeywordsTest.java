package org.fifties.housewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class JavaLanguageKeywordsTest {

    private final JavaLanguageKeywords keywords = new JavaLanguageKeywords();

    @Test
    void namesTheSpecificationsOwnWords() {
        assertAll(
                () -> assertThat(keywords.names("final")).isTrue(),
                () -> assertThat(keywords.names("return")).isTrue(),
                () -> assertThat(keywords.names("class")).isTrue(),
                () -> assertThat(keywords.names("int")).isTrue());
    }

    @Test
    void namesTheThreeLiteralsTheSpecificationReserves() {
        assertAll(
                () -> assertThat(keywords.names("true")).isTrue(),
                () -> assertThat(keywords.names("false")).isTrue(),
                () -> assertThat(keywords.names("null")).isTrue());
    }

    @Test
    void leavesTheAuthorsOwnNamesAlone() {
        assertAll(
                () -> assertThat(keywords.names("pageCursor")).isFalse(),
                () -> assertThat(keywords.names("Finally")).isFalse(),
                () -> assertThat(keywords.names("")).isFalse());
    }

    @Test
    void leavesAContextualKeywordToTheParseThatCouldTellWhereItSits() {
        assertAll(
                () -> assertThat(keywords.names("var")).isFalse(),
                () -> assertThat(keywords.names("record")).isFalse(),
                () -> assertThat(keywords.names("yield")).isFalse());
    }
}
