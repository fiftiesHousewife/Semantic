package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

import lombok.Builder;

/**
 * One thing the repository states it does, read out of a declared method name.
 *
 * <p>A method name is a clause — a verb and what it acts on — and WordNet says which of its words is the
 * verb. It is evidence of a different kind from a word or a concept: those say what the code is named after,
 * and this says what it does. The two are never summed.
 *
 * @param phrase        the clause as a reader would say it aloud — {@code resolve dependencies}
 * @param verb          the dictionary form of the leading verb, which WordNet states
 * @param object        the words the verb acts on, in the order they were written; empty where it acts on
 *                      nothing the name states
 * @param occurrences   how many declared method names state this clause
 * @param firstWrittenAt the file and line one of them sits at
 */
@Builder
public record ExportedBehaviour(String phrase, String verb, List<String> object, int occurrences,
                                SightingSite firstWrittenAt) {

    public ExportedBehaviour {
        Objects.requireNonNull(phrase, "phrase");
        Objects.requireNonNull(verb, "verb");
        object = List.copyOf(object);
        Objects.requireNonNull(firstWrittenAt, "firstWrittenAt");
        if (occurrences < 1) {
            throw new IllegalArgumentException("a clause nothing states is not a behaviour: " + occurrences);
        }
    }
}
