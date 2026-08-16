package org.fifties.housewife.codesemantics.engine.export;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.summary.ReadingSummary;
import org.fifties.housewife.codesemantics.engine.theme.JensenShannon.Contribution;
import org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes;
import org.fifties.housewife.codesemantics.engine.theme.ScopeDivergence;
import org.fifties.housewife.codesemantics.engine.theme.TopicWitnesses.Witness;

/**
 * The topics the reading reports, taken from the same filtering the summary applies rather than from a second
 * one written here. A file that disagreed with the summary about what cleared a bar would be two readings of
 * one run.
 *
 * <p>What this adds to the summary's topic names is what a consumer cannot compute: the topic's share of the
 * repository, its term of the scope's divergence, and the words that carried it.
 */
public final class ExportedThemes {

    private final int witnessesHeld;

    public ExportedThemes(final int witnessesHeld) {
        this.witnessesHeld = witnessesHeld;
    }

    /** One row per topic per scope that departs on it, the largest term of a divergence first. */
    public List<ExportedTheme> in(final ReadingSummary summary, final RepositoryThemes themes) {
        return summary.distinctive().stream()
                .flatMap(scope -> rows(scope, themes))
                .sorted(Comparator.comparingDouble(ExportedTheme::divergenceBits).reversed()
                        .thenComparing(ExportedTheme::topic))
                .toList();
    }

    private Stream<ExportedTheme> rows(final ReadingSummary.Distinctive scope, final RepositoryThemes themes) {
        final ScopeDivergence divergence = divergenceOf(scope.scope(), themes);
        return scope.topics().stream()
                .map(topic -> new ExportedTheme(topic, scope.scope(), shareOf(topic, themes),
                        contribution(topic, divergence).bits(), carriedBy(topic, themes)));
    }

    private static double shareOf(final String topic, final RepositoryThemes themes) {
        return themes.repository().intensity().shareByTopic().getOrDefault(topic, 0.0);
    }

    private List<String> carriedBy(final String topic, final RepositoryThemes themes) {
        return themes.witnesses().forTopic(topic, witnessesHeld).stream().map(Witness::word).toList();
    }

    private static ScopeDivergence divergenceOf(final String scope, final RepositoryThemes themes) {
        return themes.divergences().stream()
                .filter(measured -> measured.scope().equals(scope))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("no divergence was measured for " + scope));
    }

    /**
     * The topic's own term of that scope's divergence. The summary reported the scope because that
     * divergence beat its null, and reported the topic because it accounts for part of it, so a topic
     * contributing nothing to the scope it was reported under is a defect rather than a zero.
     */
    private static Contribution contribution(final String topic, final ScopeDivergence divergence) {
        return divergence.contributions().stream()
                .filter(carried -> carried.topic().equals(topic))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(
                        topic + " carries none of " + divergence.scope() + "'s divergence"));
    }
}
