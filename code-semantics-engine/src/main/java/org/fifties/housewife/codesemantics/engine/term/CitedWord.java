package org.fifties.housewife.codesemantics.engine.term;

import java.util.Locale;

import org.fifties.housewife.bi.lexicon.WikidataInitialisms;
import org.fifties.housewife.codesemantics.engine.reading.DictionaryWords;
import org.fifties.housewife.codesemantics.name.WholeWords;
import org.fifties.housewife.codesemantics.name.WordRanks;

/**
 * Whether a published resource states a run of letters as a word at all.
 *
 * <p>A taxonomy may publish anything as a concept. The Computer Science Ontology states {@code n},
 * {@code c} and {@code p} among its topics, and matching them against declared names produced 1,574 spans
 * on a text-extraction toolkit from three letters a splitter had produced. Nothing about those spans is
 * evidence: no resource says the letter is a word, so the reading cannot cite one and must abstain.
 *
 * <p><b>No sense-based rule can refuse them, and that was measured rather than assumed.</b> WordNet does
 * state that these are letters: {@code n}, {@code c} and {@code p} each carry a noun sense whose direct
 * hypernym is the synset {@code letter, letter_of_the_alphabet, alphabetic_character}. Asking that question
 * looks like the citable way to refuse them and it is not, because they carry other senses that are
 * ordinary words — {@code n} is nitrogen, {@code c} is carbon, centigrade, one hundred and a programming
 * language, {@code p} is phosphorus. Every one of those is a real entry, so a reading that refused a word
 * for having a letter sense would refuse nitrogen too.
 *
 * <p>What separates the artefact from the word is the parse rather than the dictionary. The identifier
 * splitter emits a single letter at a camel-case boundary, so {@code parseN} yields {@code n} because of
 * where the capital fell and not because an author wrote a word. That is a statement about the grammar this
 * library already applies, and it is why the length is asked before the dictionary is.
 *
 * <p><b>The registry is what keeps the real terms.</b> A dictionary refuses {@code xml}, {@code html} and
 * {@code http}, and those three are exactly what a document toolkit should match. The published initialism
 * registry states them, so they survive on a citation rather than on their length.
 *
 * <p>This admits nothing on its own. A term still has to be one the taxonomy published, and a one-word term
 * still has to be corroborated by its branch; this only refuses a run neither resource calls a word.
 */
public final class CitedWord {

    /**
     * The share of the frequency list at which a word is one English itself is written in rather than one an
     * author reached for. It is a share of the list's own length rather than a count, so it moves with the
     * resource; the list holds 20,000 words, so this is its first 200.
     *
     * <p><b>It is a stated expectation and not a derived bound</b>, which is the honest description. What
     * would derive it is the vocabulary reading's own null — a word counts where this repository writes it
     * more than English and the platform do, judged against a field of chance draws — and that reading is
     * computed elsewhere in the tree and not yet joined to this one. {@link CitedWordTest} pins what the
     * share keeps and refuses, so moving it is a deliberate change to a stated figure.
     */
    private static final double WRITTEN_BY_THE_LANGUAGE = 0.01;

    private final WholeWords dictionary;
    private final WikidataInitialisms initialisms;
    private final WordRanks english;

    public CitedWord(final WholeWords dictionary, final WikidataInitialisms initialisms,
                     final WordRanks english) {
        this.dictionary = dictionary;
        this.initialisms = initialisms;
        this.english = english;
    }

    public static CitedWord fromClasspath() {
        return new CitedWord(DictionaryWords.fromClasspath(), WikidataInitialisms.fromClasspath(),
                WordRanks.fromClasspath());
    }

    /** Whether the dictionary carries it as a word, or the registry states it as a published initialism. */
    public boolean states(final String word) {
        if (isASplitterArtefact(word) || isWrittenByTheLanguage(word)) {
            return false;
        }
        return dictionary.carries(word.toLowerCase(Locale.ROOT))
                || !initialisms.readingsOf(word.toUpperCase(Locale.ROOT)).isEmpty();
    }

    /**
     * Whether English itself is written in this word, which is a different question from whether it is a
     * word. {@code it} is rank 32 of the frequency list and {@code its} is 63; every term a field actually
     * publishes sits far below — {@code email} 1,107, {@code server} 2,631, {@code encoding} 8,093,
     * {@code semantics} 10,602 — or is not ranked at all, as {@code parse} is not. A taxonomy publishing
     * {@code it} as a topic, which the Computer Science Ontology does, otherwise matches every repository
     * ever written.
     */
    private boolean isWrittenByTheLanguage(final String word) {
        final int rank = english.rank(word);
        return rank > 0 && rank <= WRITTEN_BY_THE_LANGUAGE * english.size();
    }

    /**
     * A run of one letter, which the splitter produces at a camel-case boundary rather than reading out of
     * what an author wrote. WordNet carries the letters of the alphabet, so this is asked before it.
     */
    private boolean isASplitterArtefact(final String word) {
        return word.strip().length() < 2;
    }
}
