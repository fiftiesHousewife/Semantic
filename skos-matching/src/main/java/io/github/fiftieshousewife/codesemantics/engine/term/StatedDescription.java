package io.github.fiftieshousewife.codesemantics.engine.term;

/**
 * What a publisher says about a matched concept, and the concept it says it about.
 *
 * <p>The two travel together because they are often not the same node. Wikipedia's summary of
 * {@code public key cryptography} is not a definition of {@code public keys}, and a report printing one
 * under the other states something the publisher did not.
 *
 * @param prose     what the publisher states
 * @param statedFor the concept it is stated for, which is the matched concept where it describes itself
 */
public record StatedDescription(String prose, String statedFor) {
}
