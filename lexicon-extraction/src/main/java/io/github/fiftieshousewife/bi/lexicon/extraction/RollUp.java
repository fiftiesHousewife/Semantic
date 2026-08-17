package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The top of a source's own nesting: the concept a nested one belongs to when it is followed all the way
 * up. NIST's six functions and arXiv's ten groups are both that level — the one the publisher reports at —
 * and a reading that reports at any other level has chosen a grouping the source never made.
 *
 * <p>A concept nested inside one the source never states is refused rather than rolled up to whatever was
 * reachable, because a broken tree read as a shallow one is a wrong answer wearing a right answer's shape.
 * A cycle of concepts is refused the same way — a walk up it would never reach a top.
 */
public class RollUp {

    public <T extends Nested> T topOf(final T nested, final Map<String, T> byId) {
        final Set<String> walked = new LinkedHashSet<>();
        T current = nested;
        while (!current.broader().isEmpty()) {
            if (!walked.add(current.id())) {
                throw new IllegalArgumentException("The source nests " + nested.id()
                        + " inside a cycle of concepts: " + String.join(" -> ", walked));
            }
            final T at = current;
            current = Objects.requireNonNull(byId.get(at.broader()),
                    () -> "The source nests " + at.id() + " inside a concept it never states: "
                            + at.broader());
        }
        return current;
    }
}
