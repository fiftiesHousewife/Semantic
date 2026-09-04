package io.github.fiftieshousewife.codesemantics.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * The dictionary's entries as optionals: a word WordNet does not carry is an empty answer, never a null to
 * check. Exact lookup asks for the written form the dictionary is keyed by; inflected lookup lets the
 * dictionary's own morphology resolve an inflection to its entry first. A lookup that throws is a broken
 * database, not a missing word, and fails.
 */
class WordNetEntries {

    private final Dictionary dictionary;

    WordNetEntries(final Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Optional<IndexWord> exact(final POS partOfSpeech, final String written) {
        try {
            return Optional.ofNullable(dictionary.getIndexWord(partOfSpeech, written));
        } catch (final JWNLException e) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "WordNet lookup failed for \"%s\"",
                    written), e);
        }
    }

    Optional<IndexWord> inflected(final POS partOfSpeech, final String written) {
        try {
            return Optional.ofNullable(dictionary.lookupIndexWord(partOfSpeech, written));
        } catch (final JWNLException e) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "WordNet lookup failed for \"%s\"",
                    written), e);
        }
    }

    /**
     * The entry's senses, taken once and detached from the entry.
     *
     * <p><b>Read them through here and never from the entry directly.</b> The list an entry hands back
     * loads each sense the first time it is asked for and rewrites the entry while it does, and the
     * dictionary hands every reader the same entry object. Two readings resolving one word at once
     * therefore see the list change under them, and a caller that read its size and then indexed into it
     * indexes past the end. The lock is on the entry rather than on the dictionary so that two readers
     * asking about different words never wait for each other.
     */
    List<Synset> senses(final IndexWord entry) {
        synchronized (entry) {
            return List.copyOf(entry.getSenses());
        }
    }
}
