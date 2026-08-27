package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;

/**
 * One run of words a repository wrote, and the declaration it was written at.
 *
 * <p>The declaration is carried because one rule of the term reading is a fact about the site rather than
 * about the words: a run whose every word is the type written beside it is that type spelled again. A null
 * that deals the repository's words into other names deals them into the same sites, so the rule answers for
 * a shuffle exactly as it answers for what was written.
 *
 * @param words      the run as the identifier splitter read it
 * @param declaredAt where it stands, which is what says what type was written beside it
 */
public record WrittenRun(List<String> words, NameOccurrence declaredAt) {

    public WrittenRun {
        words = List.copyOf(words);
    }

    /** The same site holding a different run of words, which is what one deal of a shuffle produces. */
    public WrittenRun holding(final List<String> dealt) {
        return new WrittenRun(dealt, declaredAt);
    }
}
