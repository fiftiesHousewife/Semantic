package io.github.fiftieshousewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Word;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * Resolves an initialism through the dictionary's own entry for its letter-dotted spelling: a short
 * token WordNet does not know as a word, whose dotted form it does carry ({@code aka} → {@code a.k.a.}),
 * stands in for the synonym in that entry's sense that is a noun in its own right ({@code alias}). A
 * token the dictionary already knows as a word is not an abbreviation, and a token with no dotted entry
 * resolves to nothing, so a caller never receives a guessed expansion.
 */
final class WordNetAbbreviations {

    private static final int LONGEST_INITIALISM = 4;

    private final Dictionary dictionary;

    WordNetAbbreviations(final Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Optional<String> abbreviationNoun(final String token) {
        final String lower = token.toLowerCase(Locale.ROOT);
        if (!isSingleWord(lower) || lower.length() > LONGEST_INITIALISM || isKnownWord(lower)) {
            return Optional.empty();
        }
        final String dotted = lower.chars()
                .collect(StringBuilder::new, (dots, letter) -> dots.append((char) letter).append('.'),
                        StringBuilder::append)
                .toString();
        return senseWords(dotted).stream()
                .map(Word::getLemma)
                .filter(lemma -> !lemma.equals(dotted) && exactNounEntry(lemma) != null)
                .findFirst();
    }

    private static boolean isSingleWord(final String lower) {
        return lower.chars().allMatch(letter -> letter >= 'a' && letter <= 'z');
    }

    /** A word any part of speech knows is a word, not an abbreviation, however it is used in a schema. */
    private boolean isKnownWord(final String lower) {
        try {
            for (final POS partOfSpeech : POS.values()) {
                if (dictionary.lookupIndexWord(partOfSpeech, lower) != null) {
                    return true;
                }
            }
            return false;
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet lookup failed for \"" + lower + "\"", e);
        }
    }

    /**
     * The words of every sense the dotted form carries in any part of speech, by exact entry — the
     * morphological lookup would resolve a dotted unknown to an unrelated word through its detachment
     * rules ({@code a.k.a.} to Alaska), where an exact miss honestly says the dictionary has no entry.
     */
    private List<Word> senseWords(final String dotted) {
        try {
            final List<Word> words = new ArrayList<>();
            for (final POS partOfSpeech : POS.values()) {
                final IndexWord entry = dictionary.getIndexWord(partOfSpeech, dotted);
                if (entry != null) {
                    // The senses list loads its synsets lazily in iterator()/spliterator() but not in
                    // forEach() or toArray(), which walk the still-empty backing array — traverse it
                    // only through a stream.
                    entry.getSenses().stream()
                            .flatMap(sense -> sense.getWords().stream())
                            .forEach(words::add);
                }
            }
            return words;
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet lookup failed for \"" + dotted + "\"", e);
        }
    }

    private IndexWord exactNounEntry(final String lemma) {
        try {
            return dictionary.getIndexWord(POS.NOUN, lemma);
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet lookup failed for \"" + lemma + "\"", e);
        }
    }
}
