package io.github.fiftieshousewife.codesemantics.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.Exc;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * A word's dictionary base form, resolved through WordNet's own morphology so plural forms reach their
 * lemma without any inflection rules here.
 *
 * <p>WordNet reads separators as collocation joiners ({@code hot_dog}), so a compound like
 * {@code title_basics} would resolve through phrase lookup to its head word. Base forms answer for single
 * words only.
 */
final class WordNetBaseForms {

    private final Dictionary dictionary;

    WordNetBaseForms(final Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Optional<String> baseForm(final POS partOfSpeech, final String word) {
        final String lower = word.toLowerCase(Locale.ROOT);
        if (!isSingleWord(lower)) {
            return Optional.empty();
        }
        try {
            final IndexWord base = dictionary.getMorphologicalProcessor()
                    .lookupBaseForm(partOfSpeech, lower);
            return Optional.ofNullable(base).map(IndexWord::getLemma);
        } catch (final JWNLException e) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "WordNet base-form lookup failed for \"%s\"",
                    word), e);
        }
    }

    /** The first inflected form WordNet's verb exception list states for the word, where it states any. */
    Optional<String> statedVerbInflection(final String word) {
        final String lower = word.toLowerCase(Locale.ROOT);
        if (!isSingleWord(lower)) {
            return Optional.empty();
        }
        try {
            return Optional.ofNullable(dictionary.getException(POS.VERB, lower))
                    .map(Exc::getExceptions)
                    .filter(stated -> !stated.isEmpty())
                    .map(List::getFirst);
        } catch (final JWNLException e) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "WordNet exception lookup failed for \"%s\"",
                    word), e);
        }
    }

    private static boolean isSingleWord(final String lower) {
        return lower.chars().allMatch(letter -> letter >= 'a' && letter <= 'z');
    }
}
