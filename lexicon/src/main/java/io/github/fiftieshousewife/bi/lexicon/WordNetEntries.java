package io.github.fiftieshousewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.Optional;

/**
 * The dictionary's entries as optionals: a word WordNet does not carry is an empty answer, never a null to
 * check. Exact lookup asks for the written form the dictionary is keyed by; inflected lookup lets the
 * dictionary's own morphology resolve an inflection to its entry first. A lookup that throws is a broken
 * database, not a missing word, and fails.
 */
final class WordNetEntries {

    private final Dictionary dictionary;

    WordNetEntries(final Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Optional<IndexWord> exact(final POS partOfSpeech, final String written) {
        try {
            return Optional.ofNullable(dictionary.getIndexWord(partOfSpeech, written));
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet lookup failed for \"" + written + "\"", e);
        }
    }

    Optional<IndexWord> inflected(final POS partOfSpeech, final String written) {
        try {
            return Optional.ofNullable(dictionary.lookupIndexWord(partOfSpeech, written));
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet lookup failed for \"" + written + "\"", e);
        }
    }
}
