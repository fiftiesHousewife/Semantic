package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A probability distribution over topics — the plan's intensity ι. Within one file it is the share of that
 * file's topical mass each topic holds; over a scope it is the mean of its files' shares under a uniform
 * weighting, so a 400-line file and a 30-line file are one observation each.
 *
 * <p>That the shares sum to 1 is what makes two scopes comparable at all: a divergence between distributions
 * is defined, where a ratio of raw masses is a ratio of incommensurables. A file whose words carry no topical
 * mass has no distribution and is <em>removed</em> from its scope rather than entered as a uniform one —
 * nothing was read there, and a uniform guess would be evidence the resources never gave.
 */
public record TopicDistribution(Map<String, Double> shareByTopic) {

    public TopicDistribution {
        shareByTopic = Map.copyOf(shareByTopic);
    }

    /** The distribution of one file's mass, or empty when nothing in the file carried topical mass. */
    public static TopicDistribution of(final Map<String, Double> massByTopic) {
        final double total = massByTopic.values().stream().mapToDouble(Double::doubleValue).sum();
        if (total <= 0.0) {
            return new TopicDistribution(Map.of());
        }
        return new TopicDistribution(massByTopic.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, topic -> topic.getValue() / total)));
    }

    /** The uniform mean of several distributions — a scope's intensity over the files that carry a reading. */
    public static TopicDistribution meanOf(final Collection<TopicDistribution> distributions) {
        final Collection<TopicDistribution> reading = distributions.stream()
                .filter(distribution -> !distribution.isEmpty())
                .toList();
        if (reading.isEmpty()) {
            return new TopicDistribution(Map.of());
        }
        return new TopicDistribution(reading.stream()
                .flatMap(distribution -> distribution.shareByTopic().entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.summingDouble(topic -> topic.getValue() / reading.size()))));
    }

    public boolean isEmpty() {
        return shareByTopic.isEmpty();
    }

    public double shareOf(final String topic) {
        return shareByTopic.getOrDefault(topic, 0.0);
    }

    public Set<String> topics() {
        return shareByTopic.keySet();
    }

    /** The topics either distribution names — the support a comparison between them runs over. */
    public static Set<String> support(final TopicDistribution first, final TopicDistribution second) {
        return Stream.concat(first.topics().stream(), second.topics().stream())
                .collect(Collectors.toUnmodifiableSet());
    }
}
