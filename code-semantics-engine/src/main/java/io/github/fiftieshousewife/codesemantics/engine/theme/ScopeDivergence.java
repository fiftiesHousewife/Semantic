package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Objects;

import io.github.fiftieshousewife.codesemantics.engine.theme.JensenShannon.Contribution;
import io.github.fiftieshousewife.codesemantics.engine.theme.PermutationNull.Chance;

/**
 * How far one scope stands from its reference, which topics account for the distance, and whether a scope of
 * that size would have shown as much by chance.
 *
 * <p>The three travel together on purpose. A divergence without its null is a number a reader will treat as
 * a finding, and for a small scope it usually is not one; a divergence without its contributions is a number
 * nobody can act on. Reporting the first alone is how a plausible-looking statistic gets shipped.
 */
public record ScopeDivergence(String scope, double bits, List<Contribution> contributions, Chance chance) {

    public ScopeDivergence {
        Objects.requireNonNull(scope, "scope");
        contributions = List.copyOf(contributions);
        Objects.requireNonNull(chance, "chance");
    }

    /**
     * The contributions worth reading: those from a scope whose divergence beat its own null. A scope that
     * did not is reported as having no topical content beyond its size, and its ranking is withheld rather
     * than printed with a caveat nobody reads.
     */
    public List<Contribution> qualified(final int limit) {
        return chance.exceedsChance() ? contributions.stream().limit(limit).toList() : List.of();
    }
}
