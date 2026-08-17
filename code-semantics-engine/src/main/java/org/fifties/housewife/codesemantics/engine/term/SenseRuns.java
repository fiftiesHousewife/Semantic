package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;

import org.fifties.housewife.bi.lexicon.Lexicon;
import org.fifties.housewife.bi.lexicon.WordNetLexicon;
import org.fifties.housewife.bi.lexicon.WordSense;

/**
 * A run of words as the meanings behind it: the sense the dictionary carries each word in, in the order the
 * run states them.
 *
 * <p>It is the normal form both sides of a term match are put into so that they can be compared as meanings
 * rather than as strings. {@code nominal phrase} and {@code noun phrase} are two spellings the dictionary
 * wrote into one entry, and a reading that compares the words can only say they differ.
 *
 * <p><b>The whole run is offered to the dictionary before its words are.</b> WordNet holds {@code noun phrase}
 * and {@code part of speech} as entries in their own right, so a run it knows collapses to a single sense and
 * may then meet a run of a different length — which is the one thing a comparison of words can never do.
 *
 * <p><b>A run with a word the dictionary does not know normalises to nothing.</b> Not to itself, and not to
 * the words it could read: a reading that cannot cite abstains, and half a run of senses would be a comparison
 * this library invented for the half it could read.
 */
public final class SenseRuns implements TermNormalisation<List<WordSense>> {

    private final Lexicon lexicon;

    public SenseRuns(final Lexicon lexicon) {
        this.lexicon = lexicon;
    }

    public static SenseRuns fromClasspath() {
        return new SenseRuns(WordNetLexicon.fromClasspath());
    }

    /** The senses this run of words reads as, or nothing where any part of it cannot be read at all. */
    @Override
    public Optional<List<WordSense>> of(final List<String> words) {
        return words.isEmpty() ? Optional.empty()
                : asOneEntry(words).map(List::of).or(() -> wordByWord(words));
    }

    @Override
    public TermRung rung() {
        return TermRung.SENSES;
    }

    private Optional<WordSense> asOneEntry(final List<String> words) {
        return lexicon.commonestSense(String.join(" ", words));
    }

    private Optional<List<WordSense>> wordByWord(final List<String> words) {
        final List<WordSense> read = words.stream()
                .map(lexicon::commonestSense)
                .flatMap(Optional::stream)
                .toList();
        return Optional.of(read).filter(senses -> senses.size() == words.size());
    }
}
