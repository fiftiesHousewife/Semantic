package org.fifties.housewife.bi.lexicon.extraction;

/**
 * One entry of the query language's own function catalogue: the name the engine answers to and the
 * description it publishes for it. The description is the citation — it is the standard stating, in
 * words, what the name is short for.
 */
public record SqlFunction(String name, String description) {
}
