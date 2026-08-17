package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

/**
 * A whole working tree's reading: one scope reading per source directory, the same reading over all of them
 * at once, and how long it took. The cost is carried rather than estimated, because a library that reports a
 * measurement should report what the measurement cost to take.
 *
 * <p>The repository figure is accumulated in the same pass as the scopes rather than summed from them: a word
 * written in two scopes is one distinct surface and two occurrences, and only a tally that saw both can say
 * so.
 */
public record RepositoryLegibility(List<ScopeLegibility> scopes, ScopeLegibility repository, Duration elapsed) {

    public RepositoryLegibility {
        scopes = List.copyOf(scopes);
        Objects.requireNonNull(repository, "repository");
        Objects.requireNonNull(elapsed, "elapsed");
    }
}
