package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Objects;

/** One scope's topical intensity, with how many files and lines it was read over. */
public record ScopeThemes(String name, int files, int filesCarryingAReading, int lines,
                          TopicDistribution intensity) {

    public ScopeThemes {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(intensity, "intensity");
    }
}
