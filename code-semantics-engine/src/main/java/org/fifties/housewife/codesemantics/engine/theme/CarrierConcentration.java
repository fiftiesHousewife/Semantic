package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Map;

/**
 * How much of a topic its own carrying words actually committed to it, as opposed to how many of them
 * touched it.
 *
 * <p>{@link TopicWitnesses#restsOnOneWord} already refuses the topic one word holds a majority of. This is
 * the opposite failure and nothing tests for it: a topic that no word holds much of, arriving as a thin
 * share from each of dozens of ordinary words. Neither shape is a reading anybody chose, and only one of
 * them is currently caught.
 *
 * <p>The statistic is Simpson's concentration index over the carriers' shares, which is the same index
 * {@link TopicCommitment} states over a word's labels — one for a topic a single word carries, {@code 1/n}
 * for one spread evenly across {@code n} carriers. That floor moves with the number of carriers, so the raw
 * index cannot be compared between a topic with three of them and one with three hundred. It is reported
 * against its own floor: {@code (S − 1/n) ⁄ (1 − 1/n)}, which is zero for a perfectly even spread and one
 * for a single carrier. <b>Both ends follow from what a share is</b>, and no threshold is set here — this
 * class states the figure and nothing votes on it.
 */
public final class CarrierConcentration {

    /** Simpson's index over the carriers, rebased on the even spread its own carrier count implies. */
    public double of(final Map<String, Double> massByWord) {
        final double total = massByWord.values().stream().mapToDouble(Double::doubleValue).sum();
        if (total <= 0.0) {
            return 0.0;
        }
        final int carriers = massByWord.size();
        if (carriers == 1) {
            return 1.0;
        }
        final double evenSpread = 1.0 / carriers;
        return (simpson(massByWord, total) - evenSpread) / (1.0 - evenSpread);
    }

    /**
     * How many carriers a topic would need to be spread this thinly, which is the reciprocal of the raw
     * index and the figure a reader can hold beside the count of words that touched the topic.
     */
    public double effectiveCarriers(final Map<String, Double> massByWord) {
        final double total = massByWord.values().stream().mapToDouble(Double::doubleValue).sum();
        return total <= 0.0 ? 0.0 : 1.0 / simpson(massByWord, total);
    }

    private double simpson(final Map<String, Double> massByWord, final double total) {
        return massByWord.values().stream().mapToDouble(mass -> {
            final double share = mass / total;
            return share * share;
        }).sum();
    }
}
