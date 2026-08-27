package io.github.fiftieshousewife.codesemantics.vocabulary.page;

/**
 * The document shell every page shares. The charset is stated in the markup because a page served over
 * HTTP without a charset header is decoded as Latin-1, and an em dash decoded as Latin-1 is three wrong
 * characters.
 */
final class PageDocument {

    private PageDocument() {
    }

    static String of(final String title, final String body) {
        return "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"utf-8\"><title>"
                + title
                + "</title></head>"
                + body
                + "</html>";
    }
}
