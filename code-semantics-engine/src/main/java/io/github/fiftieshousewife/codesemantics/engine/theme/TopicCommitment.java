package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * How much of itself a word commits to each subject it is placed in — and therefore how much its appearance
 * is evidence for any of them.
 *
 * <p>A word the resources place in one subject has said that subject. A word they place in five has named
 * five things it might be about, and its appearance in a class name is weak evidence for every one of them.
 * {@code file} is law, computing, tools and records; {@code cite}, {@code evidence}, {@code answer} and
 * {@code claim} each point at law and at three other places. A reading that let each of them commit a full
 * share to law would find a library about citation to be a library about the law, on the strength of words
 * not one of which committed to it.
 *
 * <p>So a vote is its share of the word's own reading, weighted by that same share. A subject holding
 * {@code p} of a word receives {@code p²} of it, and the word's whole contribution comes to {@code Σp²} —
 * Simpson's concentration index, which is 1 for a word meaning one thing and {@code 1/n} for one spread
 * evenly across {@code n}. Both properties are wanted and neither is chosen: an ambiguous word says less in
 * total <em>and</em> less about each subject in particular, and the bound follows from what a share is.
 *
 * <p>It is not a filter. An ambiguous word still votes for everything it names; it votes quietly, and a
 * hundred quiet votes still add up, which is right for a word a codebase really does write a hundred times.
 */
public final class TopicCommitment {

    /**
     * What each subject holds of the word, as a share of everything the resources said about it.
     *
     * <p>The votes are put in an order this states — subject, then the resource that cast it, then the mass
     * — before either the total or any subject's share is summed. Double addition is not associative, and a
     * resource that hands its labels over as a set hands them over in whatever order that run's JVM holds
     * them, so two runs otherwise differ in the last bit of every share a word commits. A bit is enough: the
     * share is what a phrase's score is built from, and the score has a bar to clear.
     */
    public Map<String, Double> of(final Collection<TopicVote> votes) {
        final List<TopicVote> stated = votes.stream()
                .sorted(Comparator.comparing(TopicVote::topic)
                        .thenComparing(vote -> vote.source().name())
                        .thenComparingDouble(TopicVote::mass))
                .toList();
        final double total = stated.stream().mapToDouble(TopicVote::mass).sum();
        if (total <= 0.0) {
            return Map.of();
        }
        return stated.stream()
                .collect(Collectors.groupingBy(TopicVote::topic, TreeMap::new,
                        Collectors.summingDouble(vote -> vote.mass() / total)));
    }
}
