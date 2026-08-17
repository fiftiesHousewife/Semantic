package io.github.fiftieshousewife.codesemantics.engine.pipeline;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.Thresholds;

/**
 * Resolves one value out of an <em>open</em> space — a topical domain, a synset — from the mass its readings
 * committed to each candidate. The sibling of {@link AxisEvidenceAccumulator}, and the difference between
 * them is the partition.
 *
 * <p>A closed axis can sum over its enum's constants, so a value nothing voted for sits at the neutral prior
 * and contributes to the denominator; over a handful of constants that is the honest reading. An open space
 * cannot. WordNet has on the order of 10⁵ synsets and the bundled topic vocabularies carry hundreds of
 * labels, so a partition over every candidate would be almost entirely made of values no resource mentioned,
 * and the resulting confidence would measure the size of the vocabulary rather than the strength of the
 * evidence.
 *
 * <p>So the partition here runs over the <b>voted values plus one explicit abstention mass</b>. Confidence
 * reads as the winner's share among the things that were actually said, and what nothing could read is
 * represented as a term in the denominator rather than implied by a vocabulary's size. A scope whose words
 * are mostly unreadable therefore resolves at low confidence even when one label leads its rivals easily,
 * which is the reading a consumer needs and the one an enum-shaped partition cannot give.
 */
public final class OpenSpaceAccumulator<V> {

    private final double minimumEvidenceMass;

    public OpenSpaceAccumulator(final Thresholds thresholds) {
        this.minimumEvidenceMass = thresholds.minimumEvidenceMass();
    }

    /**
     * The leading value and its share of the total mass, or empty when the readings carried too little to
     * say anything at all. Abstention is a correct outcome and is reported as the absence of a resolution
     * rather than as a resolution to nothing.
     *
     * @param massByValue what each voted-for value was committed, all non-negative
     * @param abstentionMass what was observed and could not be read at all
     */
    public Optional<ValueShare<V>> resolve(final Map<V, Double> massByValue, final double abstentionMass) {
        final double voted = massByValue.values().stream().mapToDouble(Double::doubleValue).sum();
        if (voted < minimumEvidenceMass) {
            return Optional.empty();
        }
        return massByValue.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(winner -> new ValueShare<>(winner.getKey(),
                        winner.getValue() / (voted + Math.max(0.0, abstentionMass)), winner.getValue()));
    }
}
