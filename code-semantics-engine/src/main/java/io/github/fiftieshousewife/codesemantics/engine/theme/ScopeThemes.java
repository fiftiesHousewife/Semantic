package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Objects;

/**
 * One scope's topical intensity, with how many files and lines it was read over, and beside it the
 * composition a comparison against this scope runs over.
 *
 * <p>Separate components because neither follows from the other. {@code intensity} is each topic's share of
 * everything observed, with what nothing could place beside it; {@code comparison} is the uniform mean of
 * what each file placed. Renormalising the intensity gives neither — see
 * {@link TopicDistribution#meanOfWhatEachPlaced}.
 */
public record ScopeThemes(String name, int files, int filesCarryingAReading, int lines,
                          TopicDistribution intensity, TopicDistribution comparison) {

    public ScopeThemes {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(intensity, "intensity");
        Objects.requireNonNull(comparison, "comparison");
    }
}
