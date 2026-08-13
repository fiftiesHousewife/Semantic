package org.fifties.housewife.bi.lexicon.extraction;

/**
 * A concept a source states inside another one. Nesting is the source's own statement of what is broader
 * than what, and it is the only kind of hierarchy this library will read: a taxonomy that publishes its
 * tree is cited, where one whose tree has to be recovered from the punctuation in an identifier is guessed
 * at.
 */
public interface Nested {

    String id();

    /** The concept this one is stated inside, or empty where the source states it at the top. */
    String broader();
}
