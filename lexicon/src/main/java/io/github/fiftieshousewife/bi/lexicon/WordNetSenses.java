package io.github.fiftieshousewife.bi.lexicon;

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

    /**
     * The commonest sense among the word's <b>noun</b> senses, falling to every part of speech only where
     * the dictionary knows no noun reading at all.
     *
     * <p>The preference is grammar and it is already stated elsewhere in this library for the same reason:
     * a topical resource labels what a word is <em>about</em>, and English names its subjects with nouns.
     * Without it {@code file} reads as its verb — to file a legal document, which WordNet Domains labels
     * {@code law} — and a repository of parsed files becomes a repository about litigation. An identifier is
     * a noun phrase, so its words are being used as nouns wherever the dictionary offers one.
     */
    Optional<WordSense> commonestSenseAsNoun(final String word) {
        final String written = written(word);
        return commonestAmong(Stream.of(POS.NOUN), written).or(() -> commonestSense(word));
    }

    /**
     * The commonest of the word's verb senses, and <b>nothing at all</b> where the dictionary knows no verb
     * by that name.
     *
     * <p>It falls back to the commonest sense in any part of speech where the dictionary knows no verb.
     * Refusing instead was measured: it is the rule {@code Behaviours} states for the same position, and
     * applying it here cost {@code computing} its place in the reading while making {@code music} larger,
     * because most method heads that are not dictionary verbs are perfectly good nouns.
     */
    Optional<WordSense> commonestSenseAsVerb(final String word) {
        return commonestAmong(Stream.of(POS.VERB), written(word)).or(() -> commonestSense(word));
    }

    Optional<WordSense> commonestSense(final String word) {
        return commonestAmong(Stream.of(POS.values()), written(word));
    }

    /**
     * How many senses the dictionary carries for the word across every part of speech, and none for a form
     * it does not hold. A collocation is counted from its own entry or not at all, by the same rule the
     * sense readings obey: the count is the denominator a claim about the word speaks against, and counting
     * {@code base form} through {@code base} would give it a denominator belonging to another word.
     */
    int senseCount(final String word) {
        final String written = written(word);
        if (!isWritten(written)) {
            return 0;
        }
        return Stream.of(POS.values())
                .mapToInt(partOfSpeech -> entry(partOfSpeech, written)
                        .map(entry -> entry.getSenses().size())
                        .orElse(0))
                .sum();
    }

    /** Letters, and the spaces between the words of a collocation: the forms the dictionary is keyed by. */
    private static boolean isWritten(final String written) {
        return !written.isEmpty()
                && written.chars().allMatch(letter -> letter == ' ' || (letter >= 'a' && letter <= 'z'));
    }

    private Optional<WordSense> commonestAmong(final Stream<POS> parts, final String written) {
        return parts
                .map(partOfSpeech -> entry(partOfSpeech, written))
                .flatMap(Optional::stream)
                .flatMap(entry -> java.util.stream.IntStream.range(0, entry.getSenses().size())
                        .mapToObj(at -> new CountedSense(entry.getLemma(), entry.getSenses().get(at),
                                at + 1)))
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
