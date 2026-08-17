package io.github.fiftieshousewife.codesemantics.engine.behaviour;

import java.util.List;
import java.util.Objects;

/**
 * One thing this repository says it does, read out of the name of the thing that does it.
 *
 * <p>A method name in most codebases is already a clause: a verb and what it acts on. {@code resolveNextPage}
 * is resolve applied to a next page; {@code refusesALineRangeThatRunsBackwards} is refuse applied to a line
 * range that runs backwards. Splitting the name and asking a dictionary which of its words is a verb recovers
 * the clause the author wrote without any grammar of this library's own, and a set of those clauses is a
 * description of behaviour in the codebase's own words.
 *
 * @param verb    the dictionary form of the leading verb — resolve, refuse, read
 * @param object  the words it acts on, in the order they were written
 * @param subject the declaration the clause was read from, which is what performs it
 * @param site    where to go and look
 */
public record Behaviour(String verb, List<String> object, String subject, String site) {

    public Behaviour {
        Objects.requireNonNull(verb, "verb");
        object = List.copyOf(object);
        Objects.requireNonNull(subject, "subject");
        Objects.requireNonNull(site, "site");
    }

    /** The clause as a reader would say it aloud. */
    public String sentence() {
        return object.isEmpty() ? verb : verb + " " + String.join(" ", object);
    }
}
