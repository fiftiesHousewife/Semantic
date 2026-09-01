package io.github.fiftieshousewife.codesemantics.vocabulary.page;

/**
 * One concept the repository wrote, with what its publisher says about it.
 *
 * <p><b>The label alone says nothing.</b> {@code PresentValue}, {@code MsgSeqNum} and
 * {@code ExchangeId} are identifiers, not English, and a page naming one has matched a name — which
 * is the whole failure a taxonomy is matched rather than a word list to avoid. The description is the
 * meaning and travels with the label wherever the label goes.
 *
 * @param concept     the label the publisher states
 * @param description the nearest prose the publisher states at or above it, empty where no level of
 *                    it states any
 * @param descriptionStatedFor the concept that prose is stated for — this concept, or the level the
 *                    walk climbed to. A summary of <em>public key cryptography</em> is not a
 *                    definition of {@code public keys}, so a page printing the one prints the other
 * @param normalisation the level the two sides were compared at. A match at anything but
 *                    {@code words} is one the chance bar did not count, and the page says so rather
 *                    than showing every row against a count that covers some of them
 * @param occurrences how often the repository wrote it
 */
public record WrittenConcept(String concept, String description, String descriptionStatedFor,
                             String normalisation, int occurrences) {
}
