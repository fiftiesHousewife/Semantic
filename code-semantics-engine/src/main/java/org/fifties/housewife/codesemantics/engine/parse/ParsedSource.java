package org.fifties.housewife.codesemantics.engine.parse;

import java.util.List;
import java.util.Objects;

/**
 * One source file as the parser read it: the package it declares, every name and every piece of prose it
 * holds, and whether the parse was clean.
 *
 * <p>{@code sound} is not the same question as whether anything was read. A file with a syntax error still
 * yields the declarations the parser recovered around it, and those are kept — a pull request's head commit
 * does not always compile, and a reading that dropped what it could not parse perfectly would report a
 * smaller corpus without saying so. What it must not do is claim the file was read cleanly, so it says.
 */
public record ParsedSource(String packageName, List<NameOccurrence> occurrences, boolean sound) {

    public ParsedSource {
        Objects.requireNonNull(packageName, "packageName");
        occurrences = List.copyOf(occurrences);
    }

    /** What a file the parser could make nothing at all of reads as: no package, no names, not sound. */
    public static ParsedSource unreadable() {
        return new ParsedSource("", List.of(), false);
    }
}
