package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * How much topical mass two intensities put in the same places: per topic the part both hold, summed.
 *
 * <p>It exists because of what {@link JensenShannon} does to a comparison of unequal breadths. A subject
 * described in thirty words lands on a handful of topics; a repository is spread over hundreds. Divergence
 * counts every topic one holds and the other does not, so most of the distance between them is the
 * difference in <em>breadth</em>, and the nearest subject is whichever description was vaguest. Shared mass
 * asks the other question — of what this subject is about, how much is this repository also about — and a
 * narrow subject is not punished for being narrow, only for being elsewhere.
 *
 * <p>It decomposes per topic exactly as the divergence does, and it is bounded by its own definition: each
 * intensity's shares sum to 1, so the shared part cannot exceed 1 and reaches it only where the two are the
 * same distribution. Reported as {@code 1 - shared} so that it runs the way every other comparison here
 * runs, smaller being nearer; that complement is the total variation distance, which is where the bound
 * comes from and not a normalisation chosen to produce one.
 */
public final class SharedMass implements TopicComparison {

    /** One topic's part of the agreement: what each side put there, and what both did. */
    public record Shared(String topic, double mass, double scopeShare, double subjectShare) {
    }

    /** The mass one holds where the other does not — bounded at 1, and 0 only for identical readings. */
    @Override
    public double between(final TopicDistribution scope, final TopicDistribution subject) {
        return 1.0 - sharedBy(scope, subject);
    }

    /** The mass both put in the same topics. */
    public double sharedBy(final TopicDistribution scope, final TopicDistribution subject) {
        return TopicDistribution.support(scope, subject).stream()
                .mapToDouble(topic -> massOf(topic, scope, subject))
                .sum();
    }

    /** Which topics the agreement is made of, largest first — the reading behind the number. */
    public List<Shared> contributions(final TopicDistribution scope, final TopicDistribution subject) {
        return TopicDistribution.support(scope, subject).stream()
                .map(topic -> new Shared(topic, massOf(topic, scope, subject), scope.shareOf(topic),
                        subject.shareOf(topic)))
                .filter(shared -> shared.mass() > 0.0)
                .sorted(Comparator.comparingDouble(Shared::mass).reversed().thenComparing(Shared::topic))
                .toList();
    }

    /** The agreement as shares of itself, so the topics accounting for a placement sum to one. */
    public Map<String, Double> sharesOf(final TopicDistribution scope, final TopicDistribution subject) {
        final double shared = sharedBy(scope, subject);
        if (shared <= 0.0) {
            return Map.of();
        }
        return contributions(scope, subject).stream()
                .collect(Collectors.toUnmodifiableMap(Shared::topic, each -> each.mass() / shared));
    }

    private static double massOf(final String topic, final TopicDistribution scope,
                                 final TopicDistribution subject) {
        return Math.min(scope.shareOf(topic), subject.shareOf(topic));
    }
}
