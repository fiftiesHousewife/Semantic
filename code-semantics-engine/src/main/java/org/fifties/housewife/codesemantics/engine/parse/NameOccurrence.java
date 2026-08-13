package org.fifties.housewife.codesemantics.engine.parse;

import java.util.Objects;

/**
 * One piece of text this repository wrote, what it is in the syntax, and the line it sits on. The line is
 * carried because a reading that cannot say where it read something can be neither checked nor cited.
 */
public record NameOccurrence(String text, NameForm form, int line) {

    public NameOccurrence {
        Objects.requireNonNull(text, "text");
        Objects.requireNonNull(form, "form");
        if (line < 1) {
            throw new IllegalArgumentException("line numbers are 1-based: " + line);
        }
    }
}
