package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Optional;

import j2html.tags.specialized.TdTag;

import static j2html.TagCreator.td;

/**
 * One figure in a table cell, and what stands where a reading took none.
 *
 * <p>A dash is not a zero. A pull request whose base tree was never fetched has no declaration count at
 * all, and writing nought there would state a measurement nobody took.
 */
final class Figure {

    /** What stands where a figure was not taken. */
    static final String ABSENT = "—";

    private Figure() {
    }

    /** A counted figure, right-aligned with the other numerals. */
    static TdTag counted(final Optional<Integer> figure) {
        return shown(figure.map(String::valueOf));
    }

    /** A figure already written out — a share, a ratio — in the same column of numerals. */
    static TdTag shown(final Optional<String> figure) {
        return td(figure.orElse(ABSENT)).withClass("number");
    }

    /** A word rather than a number, so it reads from the left with the other words. */
    static TdTag named(final Optional<String> word) {
        return td(word.filter(stated -> !stated.isEmpty()).orElse(ABSENT));
    }
}
