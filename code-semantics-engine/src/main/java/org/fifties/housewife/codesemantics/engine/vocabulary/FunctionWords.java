package org.fifties.housewife.codesemantics.engine.vocabulary;

import org.fifties.housewife.bi.lexicon.Lexicon;
import org.fifties.housewife.bi.lexicon.WordNetLexicon;
import org.fifties.housewife.codesemantics.name.WordRanks;

/**
 * Whether English supplied the word rather than this repository choosing it.
 *
 * <p>A name written in English carries English's own words inside it. {@code massByTopic} is a name about
 * mass and about topics, and {@code by} is what the language puts between the two. Against a reference drawn
 * from prose such a word looks specialist, because prose is not where a program's prepositions are written.
 *
 * <p>Two bundled resources answer it between them and neither is a list written here. <b>A name names a
 * thing, an action, or a property of one</b>, which is the noun, the verb and the adjective; the dictionary
 * states which of the three a word can be. The frequency list states which words English is written in at
 * all. A word the dictionary places in none of the three and the frequency list carries is one the language
 * supplied.
 *
 * <p>The conjunction is what makes it safe. The dictionary refuses {@code tsv}, {@code skos} and
 * {@code synset} exactly as it refuses {@code by}, and the frequency list carries {@code class},
 * {@code part} and {@code first}, which a program may well be about. Only a word placed outside the
 * dictionary and inside the language is one its author had no choice about.
 *
 * <p>The adjective is asked because a topical vote does not ask it: {@code broader}, {@code nearest} and
 * {@code canonical} are properties this repository named things for, and a reading that saw only nouns and
 * verbs would hand all three to the language. The dictionary carries {@code e} and {@code s} as nouns, so a
 * single letter written as a catch parameter or left behind by a possessive is not answered here.
 */
public final class FunctionWords {

    private final Lexicon dictionary;
    private final WordRanks english;

    public FunctionWords(final Lexicon dictionary, final WordRanks english) {
        this.dictionary = dictionary;
        this.english = english;
    }

    public static FunctionWords fromClasspath() {
        return new FunctionWords(WordNetLexicon.fromClasspath(), WordRanks.fromClasspath());
    }

    /** Whether the language supplied the word, so that writing it was not a choice about a subject. */
    public boolean includes(final String word) {
        return namesNothing(word) && english.knows(word);
    }

    private boolean namesNothing(final String word) {
        return dictionary.nounBase(word).isEmpty()
                && dictionary.verbBase(word).isEmpty()
                && dictionary.adjectiveBase(word).isEmpty();
    }
}
