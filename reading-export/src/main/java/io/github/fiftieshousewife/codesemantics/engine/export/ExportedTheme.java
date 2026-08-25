package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

/**
 * One topic the reading reports, in the scope whose departure from the repository it accounts for.
 *
 * <p>A topic appears once per such scope. Two scopes departing on the same topic are two findings about two
 * parts of the repository, and pooling them into one row would state neither.
 *
 * @param topic             the label the topic resource states
 * @param scope             the scope that departs from the repository on it
 * @param shareOfRepository the topic's share of everything the repository placed
 * @param divergenceBits    the topic's term of that scope's divergence from the repository
 * @param carriedBy         the words that produced its score with the evidence for each, most first
 */
public record ExportedTheme(String topic, String scope, double shareOfRepository, double divergenceBits,
                            List<ExportedWitness> carriedBy) {

    public ExportedTheme {
        Objects.requireNonNull(topic, "topic");
        Objects.requireNonNull(scope, "scope");
        carriedBy = List.copyOf(carriedBy);
    }
}
