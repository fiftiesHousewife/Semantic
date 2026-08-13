package org.fifties.housewife.bi.lexicon.extraction;

import java.util.Map;
import java.util.Objects;

/**
 * The top of a source's own nesting: the concept a nested one belongs to when it is followed all the way
 * up. NIST's six functions and arXiv's ten groups are both that level — the one the publisher reports at —
 * and a reading that reports at any other level has chosen a grouping the source never made.
 *
 * <p>A concept nested inside one the source never states is refused rather than rolled up to whatever was
 * reachable, because a broken tree read as a shallow one is a wrong answer wearing a right answer's shape.
 */
public class RollUp {

    public <T extends Nested> T topOf(final T nested, final Map<String, T> byId) {
        if (nested.broader().isEmpty()) {
            return nested;
        }
        return topOf(Objects.requireNonNull(byId.get(nested.broader()),
                () -> "The source nests " + nested.id() + " inside a concept it never states: "
                        + nested.broader()), byId);
    }
}
