package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Objects;

/**
 * The phrase a word was read in, and where it was written.
 *
 * <p>The unit of the reading is the phrase and never the word: {@code string} alone is music, jewellery and
 * computing, and {@code stringBuilder} is what settled it. A quotation of the word by itself would show the
 * one thing that was never enough to decide anything.
 *
 * @param phrase the phrase the word was read in
 * @param site   the file and line that phrase was written at
 */
public record ExportedQuotation(String phrase, SightingSite site) {

    public ExportedQuotation {
        Objects.requireNonNull(phrase, "phrase");
        Objects.requireNonNull(site, "site");
    }
}
