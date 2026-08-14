package org.fifties.housewife.bi.lexicon;

/**
 * One meaning as the dictionary identifies it: the part of speech that carries it, the offset the database
 * holds it at, and the first of the words written into it.
 *
 * <p>It is the normal form two different words can be compared at. {@code topic}, {@code theme} and
 * {@code subject} are three spellings of one sense, and a reading that compares strings can only say they
 * differ; a reading that compares senses can say the dictionary wrote them into the same entry. The offset is
 * the identity — a name is what a reader needs and several senses share their first word, so nothing is keyed
 * by it.
 *
 * <p>{@code posKey} and {@code senseNumber} are how the published sense-labelled resources name a sense —
 * {@code cite#v#2} — so they are what a reading joins on. The offset identifies it inside the bundled
 * database; the pair identifies it across publications.
 *
 * <p>The offset belongs to the bundled database's version and to no other. That is the same standing every
 * other citation in this library has: a resource is pinned, and a figure derived from it is a reading of that
 * pinning rather than a fact about English.
 */
public record WordSense(String partOfSpeech, long offset, String name, String posKey, int senseNumber) {
}
