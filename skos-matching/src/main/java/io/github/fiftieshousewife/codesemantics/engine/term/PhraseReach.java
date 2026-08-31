package io.github.fiftieshousewife.codesemantics.engine.term;

/**
 * How far a published source's terms of more than one word reached a repository's declared names, in both
 * the units they can be counted in.
 *
 * @param terms       how many distinct terms stand in the names, each counted once however often it is
 *                    written
 * @param occurrences how often those terms stand, counting every name each one stands in
 */
public record PhraseReach(int terms, int occurrences) {
}
