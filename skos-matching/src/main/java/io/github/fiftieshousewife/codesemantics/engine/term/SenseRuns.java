package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.lexicon.Lexicon;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.lexicon.WordSense;

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
 *
 * <p><b>Only a run the dictionary holds whole is read as senses.</b> Reading a run word by word — each word
 * as the sense the dictionary carries it in — was tried and produced false matches, because two different
 * words sharing a commonest sense then became the same word. English synonymy is not the synonymy of a
 * technical vocabulary: {@code set} and {@code put} share a sense and FIBO's {@code PutWindow} is not a
 * window anything is set in, {@code packet} and {@code package} share one and FpML's {@code PackageHeader}
 * is not a packet header, and {@code scheme} read as {@code Strategy} named a FIBO strategy for an XML
 * scheme. Where the two runs carry the same words this path only repeats what {@link LemmaRuns} already
 * matched; where they do not, everything it adds is a substitution no publisher stated.
 */
public final class SenseRuns implements TermNormalisation<List<WordSense>> {

    private final Lexicon lexicon;

    public SenseRuns(final Lexicon lexicon) {
        this.lexicon = lexicon;
    }

    public static SenseRuns fromClasspath() {
        return new SenseRuns(WordNetLexicon.fromClasspath());
    }

    /** The sense this run reads as where the dictionary holds the whole of it, and nothing otherwise. */
    @Override
    public Optional<List<WordSense>> of(final List<String> words) {
        return words.isEmpty() ? Optional.empty() : asOneEntry(words).map(List::of);
    }

    @Override
    public TermRung rung() {
        return TermRung.SENSES;
    }

    private Optional<WordSense> asOneEntry(final List<String> words) {
        return lexicon.commonestSense(String.join(" ", words));
    }
}
