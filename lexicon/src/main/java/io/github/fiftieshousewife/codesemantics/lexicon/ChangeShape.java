package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.Objects;

/**
 * One measured change shape and the Conventional Commits type it falls under.
 *
 * @param shape       the token the reading names this shape by
 * @param measurement what is measured to decide it, as a clause completing "it …"
 * @param type        the Conventional Commits token, and empty where no definition covers the shape
 * @param definition  the publisher's own sentence for that token, quoted, and empty with the type
 * @param note        why the reading names nothing, on the shapes where it does not
 */
public record ChangeShape(String shape, String measurement, String type, String definition, String note) {

    public ChangeShape {
        Objects.requireNonNull(shape, "shape");
        Objects.requireNonNull(measurement, "measurement");
    }

    /** Whether a published definition covers this shape, which is what lets the reading name it. */
    public boolean isNamed() {
        return !type.isEmpty();
    }
}
