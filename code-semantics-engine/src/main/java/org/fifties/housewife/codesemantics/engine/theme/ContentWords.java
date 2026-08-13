package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Optional;

import org.fifties.housewife.bi.lexicon.Lexicon;
import org.fifties.housewife.bi.lexicon.WordNetLexicon;
import org.fifties.housewife.codesemantics.engine.Thresholds;

/**
 * Whether a word carries subject matter at all, and what its dictionary form is — one question, because the
 * dictionary answers both at once.
 *
 * <p>WordNet is a dictionary of <em>open-class</em> words by construction: nouns, verbs, adjectives and
 * adverbs. The words English uses to hold a sentence together — {@code and}, {@code of}, {@code that},
 * {@code which} — are not in it as nouns or verbs, and asking it for their lemma is how a reading finds that
 * out without anyone writing a list of words to ignore. A part of speech is a fact about the language, and
 * the dictionary states it.
 *
 * <p>The same lookup lemmatises, which is the other half of the same problem. {@code words} and {@code word}
 * are one subject and were being counted as two; {@code declares}, {@code declared} and {@code declaring} are
 * one verb. Merging them before anything is tallied means a word's evidence is not split across its
 * inflections, and the tail of surfaces seen exactly once shortens for a real reason rather than a tuned one.
 *
 * <p>The noun form is preferred where a word is both, because a topical resource labels what a word is about
 * and English names its subjects with nouns.
 *
 * <p>One- and two-letter forms are refused, and that is a rule about length rather than a list of words. The
 * dictionary's entries for them are symbol readings — {@code a} the ampere, {@code be} beryllium, {@code em}
 * a printer's measure — so reading the article in a sentence as a unit of current is not a judgement call but
 * a certainty. The threshold is declared beside every other calibration.
 */
public final class ContentWords {

    private final Lexicon lexicon;
    private final int shortestProseWord;

    public ContentWords(final Lexicon lexicon, final Thresholds thresholds) {
        this.lexicon = lexicon;
        this.shortestProseWord = thresholds.shortestProseWord();
    }

    public static ContentWords fromClasspath() {
        return new ContentWords(WordNetLexicon.fromClasspath(), Thresholds.defaults());
    }

    /**
     * The word's dictionary form, or empty when no open-class entry carries it — or when it is too short for
     * the entry that does to be about anything but a symbol.
     */
    public Optional<String> lemmaOf(final String word) {
        if (word.length() < shortestProseWord) {
            return Optional.empty();
        }
        final Optional<String> noun = lexicon.nounBase(word);
        return noun.isPresent() ? noun : lexicon.verbBase(word);
    }

    /** The word's dictionary form where there is one, and the word as written where there is not. */
    public String lemmaOrSurface(final String word) {
        return lemmaOf(word).orElse(word);
    }

    /**
     * Whether the word is too short for any entry about it to be about more than a symbol. It applies to a
     * name as well as to a sentence, because a name can be a sentence: splitting {@code carriesAPrefix}
     * correctly yields the article {@code a}, and an article is a form of the language wherever it is
     * written. A name's own words are otherwise kept whether or not a dictionary carries them.
     */
    public boolean tooShortToMean(final String word) {
        return word.length() < shortestProseWord;
    }
}
