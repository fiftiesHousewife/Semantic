package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.Objects;

/**
 * One source file as the parser read it: the package it declares, every name and every piece of prose it
 * holds, and how the parse went. {@link ParseOutcome} states why a recovered file is still read.
 */
public record ParsedSource(String packageName, List<NameOccurrence> occurrences, ParseOutcome outcome) {

    public ParsedSource {
        Objects.requireNonNull(packageName, "packageName");
        occurrences = List.copyOf(occurrences);
    }

    /** What a file the parser could make nothing at all of reads as: no package, no names. */
    public static ParsedSource unreadable() {
        return new ParsedSource("", List.of(), ParseOutcome.UNREADABLE);
    }
}
