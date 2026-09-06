package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;
import java.util.function.Function;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.reading.Dialect;

/**
 * How each word of a phrase in a given position is to be read. An identifier is a noun phrase, so its words
 * are nouns; a method name is a clause, so its first word is what the method does; a sentence is neither,
 * so the corpus's own counts decide. It is grammar read off the parse, which is what makes it permitted
 * where a list of words would not be.
 *
 * <p>A word the surrounding file <em>declared</em> is one the file has already committed to a meaning for,
 * so it is read as a noun even in prose. The word the file's source set is named by restates the layout —
 * Maven's, not the author's — so it votes nothing while staying in the phrase it was written in.
 */
final class PhraseGrammar {

    private final TopicCitations citations;
    private final Set<String> declaredHere;
    private final String layoutWord;

    /**
     * The language whose naming conventions this reading may cite. It arrives from the pipeline rather than
     * being built here, so the one place that states what a convention is states it for every reading.
     */
    private final Dialect dialect = Dialect.java();

    PhraseGrammar(final TopicCitations citations, final Set<String> declaredHere, final String layoutWord) {
        this.citations = citations;
        this.declaredHere = declaredHere;
        this.layoutWord = layoutWord;
    }

    Function<String, List<TopicVote>> citing(final NameForm form, final List<String> words) {
        if (form.isProse()) {
            return word -> declaredHere.contains(word) ? citations.of(word) : citations.inProse(word);
        }
        final boolean accessor = form == NameForm.METHOD && dialect.namesAConvention(words);
        final Set<String> verbs = form == NameForm.METHOD && !accessor ? Set.of(words.getFirst()) : Set.of();
        final String prefix = accessor ? words.getFirst() : "";
        final String head = words.getLast();
        return word -> {
            if (word.equals(prefix) || word.equals(layoutWord)) {
                return List.of();
            }
            if (verbs.contains(word)) {
                return citations.ofVerb(word);
            }
            return word.equals(head) ? citations.of(word) : citations.inProse(word);
        };
    }
}
