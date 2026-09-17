package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * What each subject of a scheme states that the scheme does not state everywhere.
 *
 * <p>A subject's description is read into domain labels the same way a repository is, and a label nearly
 * every subject carries separates none of them. On OpenAlex every one of 4,498 topics reads as
 * {@code music}, {@code chemistry}, {@code military}, {@code phonetics}, {@code astronomy} and
 * {@code finance}, at fifty labels a topic, which leaves two subjects drawn at random 0.66 bits apart on a
 * scale bounded at one. A repository compared against that scheme is compared against one subject wearing
 * 4,498 names.
 *
 * <p>The denominator is the scheme's own mean, which is the same thing the reference corpus is for words:
 * a share is worth what it exceeds what every other subject states. Nothing is chosen here — no threshold,
 * no list of labels to drop — and a scheme whose subjects genuinely differ loses nothing, because the mean
 * of distinct subjects is small everywhere.
 *
 * <p>A subject reading exactly as the scheme reads states nothing of its own and is left empty rather than
 * spread evenly, because an even spread is a claim about every label and empty is the absence of one.
 */
public final class DistinctiveSubjects {

    /** Each subject's share of each label less the scheme's mean share of it, renormalised. */
    public List<TopicDistribution> over(final List<TopicDistribution> scheme) {
        if (scheme.isEmpty()) {
            return List.of();
        }
        final TopicDistribution mean = TopicDistribution.meanOf(scheme);
        return scheme.stream()
                .map(subject -> exceeding(subject, mean))
                .toList();
    }

    private static TopicDistribution exceeding(final TopicDistribution subject,
                                               final TopicDistribution mean) {
        final Map<String, Double> above = new LinkedHashMap<>();
        subject.topics().forEach(topic -> {
            final double over = subject.shareOf(topic) - mean.shareOf(topic);
            if (over > 0.0) {
                above.put(topic, over);
            }
        });
        return TopicDistribution.ofCitedMass(above);
    }
}
