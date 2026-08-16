package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.util.Map;

/**
 * A body of words somebody else wrote, as a distribution over them — what a repository's own vocabulary is
 * read against.
 *
 * <p>A count on its own says a repository writes {@code list} often, which is true of every repository ever
 * written in Java. What it does not say is whether the repository chose the word. A reference answers that:
 * a word written here at the rate something else writes it has told the reading nothing, and a word written
 * far more densely here than there is a choice somebody made.
 *
 * <p>Every implementation must state its own source, because a reference decides what survives a ranking and
 * an unattributed one is a hand-written vocabulary in another shape.
 */
public interface ReferenceVocabulary {

    /** What this reference is, as a reader would say it — it names a column of the report. */
    String name();

    /** What it is written in, as shares over words summing to one. */
    Map<String, Double> shareByWord();

    default double shareOf(final String word) {
        return shareByWord().getOrDefault(word, 0.0);
    }
}
