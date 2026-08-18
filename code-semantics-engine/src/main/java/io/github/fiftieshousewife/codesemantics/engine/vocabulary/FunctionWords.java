package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Optional;

import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.Thresholds;
import io.github.fiftieshousewife.codesemantics.name.WordRanks;

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
 * <p>The adjective is asked because {@code broader}, {@code nearest} and {@code canonical} name properties,
 * and a reading of nouns and verbs alone would hand all three to the language. The dictionary carries
 * {@code e} and {@code s} as nouns, so a single letter left by a catch parameter or a possessive is not
 * answered here.
 */
public final class FunctionWords {

    private final Lexicon dictionary;
    private final WordRanks english;
    private final int shortestProseWord;

    public FunctionWords(final Lexicon dictionary, final WordRanks english, final Thresholds thresholds) {
        this.dictionary = dictionary;
        this.english = english;
        this.shortestProseWord = thresholds.shortestProseWord();
    }

    public static FunctionWords fromClasspath() {
        return new FunctionWords(WordNetLexicon.fromClasspath(), WordRanks.fromClasspath(),
                Thresholds.defaults());
    }

    /** Whether the language supplied the word, so that writing it was not a choice about a subject. */
    public boolean includes(final String word) {
        return namesNothing(word) && english.knows(word);
    }

    private boolean namesNothing(final String word) {
        return placesNothing(word, dictionary.nounBase(word))
                && placesNothing(word, dictionary.verbBase(word))
                && placesNothing(word, dictionary.adjectiveBase(word));
    }

    /**
     * Whether the entry fails to place the word. A base the surface's own entry states always places it; one
     * reached by a suffix rule that lands on an entry too short to be about more than a symbol places
     * nothing — {@code its} detaches to {@code it}, and reading a possessive as that noun sets an inference
     * over the absence of a statement.
     */
    private boolean placesNothing(final String word, final Optional<String> base) {
        return base.filter(stated -> stated.equals(word) || stated.length() >= shortestProseWord).isEmpty();
    }
}
