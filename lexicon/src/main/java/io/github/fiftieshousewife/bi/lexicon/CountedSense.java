package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Optional;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.data.Word;

/**
 * One of a word's senses beside what WordNet's own tagged corpus counted that word at in it. The count is what
 * makes a most-frequent-sense reading a citation rather than a guess: it is the number the dictionary
 * publishes, and where it publishes nothing the count is zero and the caller learns that it was never counted.
 */
record CountedSense(String lemma, Synset sense, int senseNumber) {

    /** How often the tagged corpus read this word in this sense, and zero where it never did. */
    int uses() {
        return sense.getWords().stream()
                .filter(word -> word.getLemma().equalsIgnoreCase(lemma))
                .mapToInt(Word::getUseCount)
                .max()
                .orElse(0);
    }

    /** WordNet's own version-stable identifier of this word in this sense, where extjwnl states one. */
    Optional<String> senseKey() {
        return sense.getWords().stream()
                .filter(word -> word.getLemma().equalsIgnoreCase(lemma))
                .findFirst()
                .map(CountedSense::keyOf);
    }

    private static String keyOf(final Word word) {
        try {
            return word.getSenseKey();
        } catch (final JWNLException e) {
            throw new IllegalStateException("The dictionary could not state a sense key for " + word, e);
        }
    }

    /** The synset's own lemmas in WordNet's order, which are the publisher's names for this sense. */
    List<String> synsetLemmas() {
        return sense.getWords().stream()
                .map(Word::getLemma)
                .toList();
    }

    WordSense named() {
        return new WordSense(sense.getPOS().getLabel(), sense.getOffset(),
                sense.getWords().getFirst().getLemma(), sense.getPOS().getKey(), senseNumber);
    }
}
