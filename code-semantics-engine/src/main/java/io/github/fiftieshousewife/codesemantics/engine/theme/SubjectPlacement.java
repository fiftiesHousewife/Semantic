package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;

/**
 * Where a scope stands against each published subject area: the same divergence used between two scopes,
 * turned on a scope and a subject.
 *
 * <p>Nearest first, because here the question is which subject a body of code reads <em>like</em> rather
 * than what makes it unlike its neighbours. The number is still a divergence — bounded at one bit by its own
 * definition — so a ranking of subjects and a ranking of scopes are read on one scale, and a placement can
 * be compared with a divergence elsewhere in the report without conversion.
 *
 * <p>A ranking alone settles nothing: something is always nearest. {@link SubjectNull} is what says whether
 * the nearest subject stands apart from a taxonomy of chance, and a reading of this class without that one
 * is a horoscope.
 */
public final class SubjectPlacement {

    /**
     * How far a scope stands from one subject area, and the topics the two actually meet on.
     *
     * <p>{@code carriedBy} keeps each meeting topic's two shares rather than its name alone. A placement is
     * only arguable with if a reader can see how much of the repository and how much of the subject sat in
     * the topic they met on, and both figures are computed to rank the placement in the first place.
     */
    public record Placement(String concept, String label, String group, double bits,
            List<SharedMass.Shared> carriedBy) {
    }

    /** Enough of them to see what a placement rests on, few enough to read across a row. */
    private static final int WITNESSES = 4;

    private final TopicComparison comparison;

    private final SharedMass shared = new SharedMass();

    public SubjectPlacement(final TopicComparison comparison) {
        this.comparison = comparison;
    }

    /** Placed by how far the two readings stand apart, which counts every topic either one holds. */
    public static SubjectPlacement byDivergence() {
        return new SubjectPlacement(new JensenShannon()::divergence);
    }

    /** Placed by the mass the two put in the same topics, which does not punish a subject for being narrow. */
    public static SubjectPlacement bySharedMass() {
        return new SubjectPlacement(new SharedMass());
    }

    public List<Placement> of(final TopicDistribution scope, final List<SubjectTopics> subjects) {
        return subjects.stream()
                .map(subject -> new Placement(subject.concept(), subject.label(), subject.group(),
                        comparison.between(scope, subject.distribution()),
                        carriedBy(scope, subject.distribution())))
                .sorted(Comparator.comparingDouble(Placement::bits).thenComparing(Placement::concept))
                .toList();
    }

    /**
     * The topics a placement rests on, whichever statistic ranked it: two readings are near because of the
     * mass they put in the same places, so that is what a row has to show to be arguable with.
     */
    private List<SharedMass.Shared> carriedBy(final TopicDistribution scope,
                                              final TopicDistribution subject) {
        return shared.contributions(scope, subject).stream().limit(WITNESSES).toList();
    }
}
