package org.fifties.housewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The sense a word is most often written in, read from the counts WordNet's own tagged corpus publishes.
 *
 * <p>Every part of speech is asked and the largest count wins, so a word the corpus reads as an adjective far
 * more often than as a noun is normalised to the adjective — {@code first} is counted 232 times as one and
 * nine times as the other, and nothing here had to say which. Where the corpus counted nothing at all the
 * counts are equal at zero and the dictionary's own listing order stands, which is a weaker reading and is
 * stated as such: WordNet orders an uncounted word's senses arbitrarily.
 *
 * <p><b>A collocation is looked up exactly.</b> WordNet's morphology resolves an unknown phrase to its head
 * word — {@code base form} would come back as {@code base} — and a sense arrived at that way is one this
 * library manufactured rather than one the dictionary wrote for the phrase. So a run of words containing a
 * space is either an entry the dictionary holds or nothing at all, and a single word keeps the morphology that
 * takes {@code phrases} to {@code phrase}.
 */
final class WordNetSenses {

    private final Dictionary dictionary;

    WordNetSenses(final Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Optional<WordSense> commonestSense(final String word) {
        final String written = written(word);
        return Stream.of(POS.values())
                .map(partOfSpeech -> entry(partOfSpeech, written))
                .flatMap(Optional::stream)
                .flatMap(entry -> entry.getSenses().stream()
                        .map(sense -> new CountedSense(entry.getLemma(), sense)))
                .max(Comparator.comparingInt(CountedSense::uses))
                .map(CountedSense::named);
    }

    private Optional<IndexWord> entry(final POS partOfSpeech, final String written) {
        return Optional.ofNullable(isCollocation(written)
                ? exactEntry(partOfSpeech, written)
                : inflectedEntry(partOfSpeech, written));
    }

    private static boolean isCollocation(final String written) {
        return written.indexOf(' ') >= 0;
    }

    private IndexWord exactEntry(final POS partOfSpeech, final String written) {
        try {
            return dictionary.getIndexWord(partOfSpeech, written);
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet sense lookup failed for \"" + written + "\"", e);
        }
    }

    private IndexWord inflectedEntry(final POS partOfSpeech, final String written) {
        try {
            return dictionary.lookupIndexWord(partOfSpeech, written);
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet sense lookup failed for \"" + written + "\"", e);
        }
    }

    /** WordNet writes collocations with spaces where a schema and an identifier write underscores. */
    private static String written(final String word) {
        return word.toLowerCase(Locale.ROOT).replace('_', ' ');
    }
}
