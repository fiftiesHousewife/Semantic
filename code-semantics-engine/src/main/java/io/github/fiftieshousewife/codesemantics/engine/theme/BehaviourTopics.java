package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.behaviour.Behaviour;

/**
 * What a repository states it does, read as a distribution over the same topics its names are read as.
 *
 * <p>Each clause a method name states — {@code read declaration}, {@code refuse a line range} — goes through
 * the reading a subject description goes through, so a repository's verbs and a subject's prose end up on one
 * scale.
 *
 * <p><b>This is not independent of the vocabulary reading and nothing here pretends otherwise.</b> The clauses
 * are the repository's own words, so this arm reads a subset of what the words arm read, through a
 * grammatical filter rather than a second source. What it can say that the words arm cannot is what the
 * repository <em>does</em> rather than what it is named after, and whether the two agree is a measurement
 * reported beside them.
 *
 * <p>A clause stating no object is read as its verb alone. A bare {@code read} carries whatever the
 * dictionary says {@code read} is about, which is little, and it is not thrown away for being little.
 */
public final class BehaviourTopics {

    private final SubjectAreas areas;

    public BehaviourTopics(final SubjectAreas areas) {
        this.areas = areas;
    }

    public static BehaviourTopics fromClasspath() {
        return new BehaviourTopics(SubjectAreas.fromClasspath());
    }

    /** Every clause pooled, each weighted by how many declarations state it. */
    public TopicDistribution of(final List<Behaviour> stated) {
        final Map<String, Integer> byClause = new HashMap<>();
        stated.forEach(behaviour -> byClause.merge(behaviour.sentence(), 1, Integer::sum));
        final Map<String, Double> massByTopic = new HashMap<>();
        byClause.forEach((clause, said) -> add(massByTopic, clause, said));
        return TopicDistribution.ofCitedMass(massByTopic);
    }

    private void add(final Map<String, Double> massByTopic, final String clause, final int said) {
        final TopicDistribution read = areas.topicsIn(clause, clause)
                .distribution()
                .amongWhatWasPlaced();
        read.shareByTopic().forEach((topic, share) -> massByTopic.merge(topic, share * said, Double::sum));
    }
}
