package io.github.fiftieshousewife.bi.lexicon;

import java.util.Objects;
import java.util.Set;

/**
 * One of a word's senses: the topical domains the bundled resource labels it with — empty where it labels
 * none — and the count WordNet's own tagged corpus read the word at in that sense.
 *
 * <p>The pair is what a weighted reading of a polysemous word needs. The counts say how much of the word
 * each meaning is, so a rare courtroom sense cannot carry a common word's whole weight into {@code law};
 * and the unlabelled senses keep their counts, so the share of a word that means nothing topical is a
 * share on no domain rather than one redistributed among the labelled remainder.
 *
 * @param labelStrength how much of the sense's weight its labels carry, in {@code [0, 1]} because it is a
 *                      share of full strength. A resource stating how confidently it labels the sense
 *                      states it here; a resource stating labels alone leaves the default {@code 1}, and
 *                      the shortfall {@code 1 − labelStrength} reaches no domain.
 */
public record CountedSenseDomains(Set<String> domains, int uses, double labelStrength) {

    private static final double FULL_STRENGTH = 1.0;

    public CountedSenseDomains {
        Objects.requireNonNull(domains, "domains");
        domains = Set.copyOf(domains);
        if (uses < 0) {
            throw new IllegalArgumentException("a tagged corpus counts occurrences, never owes them: " + uses);
        }
        if (labelStrength < 0.0 || labelStrength > FULL_STRENGTH) {
            throw new IllegalArgumentException(
                    "a label's strength is a share of full strength: " + labelStrength);
        }
    }

    public CountedSenseDomains(final Set<String> domains, final int uses) {
        this(domains, uses, FULL_STRENGTH);
    }
}
