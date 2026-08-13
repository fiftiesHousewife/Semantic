package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Set;

import org.fifties.housewife.bi.lexicon.WiktionaryTopics;

/**
 * The subjects a resource claims a headword for, with no sense structure to read. A dictionary that
 * publishes one label set per word is saying less than one that labels each sense, and a reading over it
 * must divide the word's mass evenly rather than pretend to a sense ordering it was never given.
 */
@FunctionalInterface
public interface HeadwordTopics {

    /** Every subject claiming the word, or empty when the resource does not carry it. */
    Set<String> of(String word);

    /** The bundled Wiktionary topic vocabulary. */
    static HeadwordTopics fromClasspath() {
        final WiktionaryTopics topics = WiktionaryTopics.fromClasspath();
        return topics::topicsOf;
    }
}
