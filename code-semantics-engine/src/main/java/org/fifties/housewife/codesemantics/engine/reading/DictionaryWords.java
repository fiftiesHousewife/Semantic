package org.fifties.housewife.codesemantics.engine.reading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.fifties.housewife.bi.lexicon.Lexicon;
import org.fifties.housewife.bi.lexicon.WordNetLexicon;
import org.fifties.housewife.codesemantics.name.WholeWords;

/**
 * The runs the bundled dictionary carries as one word, which is what stops the segmenter dividing them.
 *
 * <p>It asks the noun, the verb and the adjective — a word names a thing, an action or a property of one,
 * which is the same three open classes {@link org.fifties.housewife.codesemantics.engine.vocabulary.FunctionWords}
 * asks and for the same reason. WordNet applies its own morphology, so an inflection resolves to its lemma
 * and {@code abstains} is carried through {@code abstain} without any inflection rule here.
 *
 * <p>It is the same citation the reading already stands on at every other step, so a run refused here is
 * refused on evidence the library already publishes rather than on a new resource.
 *
 * <p>The answers are held, because the segmenter asks once per occurrence of a name and a repository writes
 * the same name many times.
 */
public final class DictionaryWords implements WholeWords {

    private final Lexicon dictionary;
    private final Map<String, Boolean> asked = new ConcurrentHashMap<>();

    public DictionaryWords(final Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public static DictionaryWords fromClasspath() {
        return new DictionaryWords(WordNetLexicon.fromClasspath());
    }

    @Override
    public boolean carries(final String word) {
        return asked.computeIfAbsent(word, this::inAnOpenClass);
    }

    private boolean inAnOpenClass(final String word) {
        return dictionary.nounBase(word).isPresent()
                || dictionary.verbBase(word).isPresent()
                || dictionary.adjectiveBase(word).isPresent();
    }
}
