package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A probability distribution over topics — the plan's intensity ι — and, beside it, the share of what was
 * observed that no topic took. Within one file it is the share of that file's observed mass each topic holds;
 * over a scope it is the mean of its files' shares under a uniform weighting, so a 400-line file and a 30-line
 * file are one observation each.
 *
 * <p><b>The denominator is everything that was observed, not everything that was placed.</b> Each phrase the
 * reading meets is worth what its form is worth, and the resources take as much of that as they can settle a
 * subject for; the rest is {@link #unplaced()}. Without that term a file half of whose words nothing could
 * label produces shares indistinguishable from a file every word of which was read, because the mass nothing
 * spoke for silently leaves the denominator and inflates every label that did fire. It is the same partition
 * {@link io.github.fiftieshousewife.codesemantics.engine.pipeline.OpenSpaceAccumulator} resolves a single value
 * over — the voted values plus one explicit abstention — applied to the distribution the whole reading rests
 * on rather than to the dominant topic alone.
 *
 * <p>A comparison between two readings runs over {@link #amongWhatWasPlaced()} instead. A divergence asks what
 * two bodies of text are about, and how much of one of them nobody could read is not a subject the other is
 * far from; putting it in the comparison would make a scope distinctive for being illegible and would hand
 * the answer "which topics account for the departure" something that is not a topic. So the reading carries
 * what it could not place and the comparison sets it aside, and each says which it is doing.
 *
 * <p><b>A scope has two compositions, and which one is asked for decides what a file is worth.</b>
 * {@link #meanOf} is the intensity; {@link #meanOfWhatEachPlaced} is what a comparison runs over, and it is
 * not that mean renormalised. They agree only where every file was placed throughout — true of a reading of
 * a published list, and of nothing read off a working tree.
 *
 * <p>A file whose words carry no topical mass has no distribution and is <em>removed</em> from its scope
 * rather than entered as a uniform one — nothing was read there, and a uniform guess would be evidence the
 * resources never gave.
 */
public record TopicDistribution(Map<String, Double> shareByTopic, double unplaced) {

    /** A reading of nothing at all: no topic, and nothing observed for a topic to have missed either. */
    public static final TopicDistribution NOTHING = new TopicDistribution(Map.of(), 0.0);

    public TopicDistribution {
        if (unplaced < 0.0 || unplaced > 1.0) {
            throw new IllegalArgumentException("an unplaced share outside [0, 1]: " + unplaced);
        }
        shareByTopic = Map.copyOf(shareByTopic);
    }

    /**
     * The distribution of one reading's mass over everything it observed.
     *
     * @param massByTopic what each topic was committed
     * @param unplacedMass what was observed and no topic took, on the same scale as the mass beside it
     */
    public static TopicDistribution of(final Map<String, Double> massByTopic, final double unplacedMass) {
        final double placed = massByTopic.values().stream().mapToDouble(Double::doubleValue).sum();
        final double observed = placed + unplacedMass;
        if (observed <= 0.0) {
            return NOTHING;
        }
        if (placed <= 0.0) {
            return new TopicDistribution(Map.of(), 1.0);
        }
        return new TopicDistribution(massByTopic.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, topic -> topic.getValue() / observed)),
                unplacedMass / observed);
    }

    /**
     * A reading of what the resources themselves said — about one word, or about a published list of them.
     *
     * <p>Nothing here was observed and passed over. The mass is the resources' own and there is no phrase
     * that could have gone unread, so there is nothing to hold out of the denominator and this states so
     * rather than defaulting to it. A comparison between a reading of this kind and a reading of a body of
     * text runs over {@link #amongWhatWasPlaced()}, which is what puts the two on one scale.
     */
    public static TopicDistribution ofCitedMass(final Map<String, Double> massByTopic) {
        return of(massByTopic, 0.0);
    }

    /** The uniform mean of several distributions — a scope's intensity over the files that carry a reading. */
    public static TopicDistribution meanOf(final Collection<TopicDistribution> distributions) {
        final Collection<TopicDistribution> reading = distributions.stream()
                .filter(distribution -> !distribution.isEmpty())
                .toList();
        if (reading.isEmpty()) {
            return NOTHING;
        }
        return new TopicDistribution(reading.stream()
                .flatMap(distribution -> distribution.shareByTopic().entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.summingDouble(topic -> topic.getValue() / reading.size()))),
                reading.stream().mapToDouble(TopicDistribution::unplaced).average().orElseThrow());
    }

    /**
     * The uniform mean of what each reading placed — the composition a comparison runs over.
     *
     * <p>Each reading is taken {@link #amongWhatWasPlaced()} <em>before</em> the mean, and the order is the
     * whole of it. Averaging first and renormalising after gives {@code Σ(1 − u) · r ⁄ Σ(1 − u)}, which
     * weights each file by the share of itself the resources could read while refusing to weight it by its
     * length — a weighting that would have to justify both or neither.
     */
    public static TopicDistribution meanOfWhatEachPlaced(final Collection<TopicDistribution> distributions) {
        return meanOf(distributions.stream()
                .map(TopicDistribution::amongWhatWasPlaced)
                .toList());
    }

    /**
     * The same reading among the mass a topic actually took, summing to one — what a comparison is between,
     * and the reading this class held before what nothing could place was given a term of its own.
     */
    public TopicDistribution amongWhatWasPlaced() {
        if (isEmpty()) {
            return NOTHING;
        }
        if (unplaced <= 0.0) {
            return this;
        }
        final double placed = 1.0 - unplaced;
        return new TopicDistribution(shareByTopic.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, topic -> topic.getValue() / placed)),
                0.0);
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
