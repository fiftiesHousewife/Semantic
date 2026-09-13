package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Locale;

/** A count and the thing counted, in the number English writes it in: {@code 1 file}, {@code 35 files}. */
final class Counted {

    private Counted() {
    }

    static String of(final int count, final String noun) {
        return String.format(Locale.ROOT, "%d %s%s", count, noun, count == 1 ? "" : "s");
    }
}
