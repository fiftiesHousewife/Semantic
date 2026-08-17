package io.github.fiftieshousewife.codesemantics.engine.reading;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

/**
 * One resource's answer to whether it can be cited for a word. It answers only that — never what the word
 * means here, which is a vote's business and needs an anchor to be cast at all. A resource that does not
 * carry the word says so, and a word no resource carries is read by nothing, which the reading records as
 * an abstention rather than as a reading of nothing.
 */
public interface WordCitation {

    EvidenceSource source();

    boolean cites(String word);
}
