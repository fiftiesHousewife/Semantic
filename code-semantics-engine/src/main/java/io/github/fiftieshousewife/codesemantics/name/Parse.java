package io.github.fiftieshousewife.codesemantics.name;

import java.util.ArrayList;
import java.util.List;

/**
 * One way of reading a compound, and what it costs.
 *
 * @param pieces the pieces in the order they are written
 * @param cost   the sum of what each piece costs to read, so two parses of one compound compare
 */
record Parse(List<String> pieces, double cost) {

    Parse {
        pieces = List.copyOf(pieces);
    }

    /** The same parse with an unread run in front of it, at what a residual costs. */
    Parse prepend(final String residual, final double residualCost) {
        final List<String> extended = new ArrayList<>();
        extended.add(residual);
        extended.addAll(pieces);
        return new Parse(extended, cost + residualCost);
    }
}
