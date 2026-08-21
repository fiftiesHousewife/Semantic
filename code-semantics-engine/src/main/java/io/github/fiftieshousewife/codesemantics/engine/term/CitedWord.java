package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Locale;

import io.github.fiftieshousewife.bi.lexicon.WikidataInitialisms;
import io.github.fiftieshousewife.codesemantics.engine.reading.DictionaryWords;
import io.github.fiftieshousewife.codesemantics.name.WholeWords;
import io.github.fiftieshousewife.codesemantics.name.WordRanks;

/**
 * Whether a published resource states a run of letters as a word at all.
 *
 * <p>A taxonomy may publish anything as a concept — the Computer Science Ontology states {@code n},
 * {@code c} and {@code p} among its topics — and a run no resource calls a word is one the reading cannot
 * cite, so it abstains.
 *
 * <p>No sense-based rule can refuse them. WordNet does state that these are letters, but each also carries
 * ordinary-word senses — {@code n} is nitrogen, {@code c} is carbon — so refusing a word for having a
 * letter sense would refuse nitrogen too. What separates the artefact from the word is the parse: the
 * splitter emits a single letter at a camel-case boundary, so the length is asked before the dictionary is.
 *
 * <p>The initialism registry is what keeps the real terms. A dictionary refuses {@code xml}, {@code html}
 * and {@code http}, and the registry states them, so they survive on a citation rather than on length.
 *
 * <p>This admits nothing on its own: a term still has to be one the taxonomy published, and a one-word
 * term still has to be corroborated by its branch.
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
     * word. The commonest words of the frequency list hold sentences together, and the terms a field
     * publishes sit far down the list or off it. A taxonomy publishing {@code it} as a topic, which the
     * Computer Science Ontology does, otherwise matches every repository ever written.
     */
    private boolean isWrittenByTheLanguage(final String word) {
        final int rank = english.rank(word);
        return rank > 0 && rank <= WRITTEN_BY_THE_LANGUAGE * english.size();
    }

    /**
     * A run the pipeline removes on its spelling alone — a single letter the splitter produced at a
     * camel-case boundary, or somebody's shorthand. WordNet carries the letters of the alphabet, so this is
     * asked before it.
     *
     * <p><b>Only that stage.</b> A term reading asks the pipeline the question it needs and not every
     * question the pipeline can answer: a form the dictionaries cite for several things is still a term
     * where a published registry names it, which is what this reading exists to find.
     */
    private boolean isASplitterArtefact(final String word) {
        return PIPELINE.leavesAt(word.strip())
                .filter(io.github.fiftieshousewife.codesemantics.engine.reading.WordStage.SYMBOL::equals)
                .isPresent();
    }

    /** The one pipeline that states what a word of a repository is. */
    private static final io.github.fiftieshousewife.codesemantics.engine.reading.WordPipeline PIPELINE =
            io.github.fiftieshousewife.codesemantics.engine.reading.WordPipelines.overJava(
                    io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords.fromClasspath());
}
