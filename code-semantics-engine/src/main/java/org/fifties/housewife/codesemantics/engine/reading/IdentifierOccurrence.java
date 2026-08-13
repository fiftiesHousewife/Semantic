package org.fifties.housewife.codesemantics.engine.reading;

import java.util.Objects;

/**
 * One identifier-shaped run of characters where a scan found it. The line is carried because a reading that
 * cannot say where it read something can be neither checked nor cited, and because the tokens nothing reads
 * are only actionable when the report can name a place to look at one.
 */
public record IdentifierOccurrence(String identifier, int line) {

    public IdentifierOccurrence {
        Objects.requireNonNull(identifier, "identifier");
        if (line < 1) {
            throw new IllegalArgumentException("line numbers are 1-based: " + line);
        }
    }
}
