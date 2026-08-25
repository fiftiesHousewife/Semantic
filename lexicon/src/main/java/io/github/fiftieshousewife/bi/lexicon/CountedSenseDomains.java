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
 */
public record CountedSenseDomains(Set<String> domains, int uses) {

    public CountedSenseDomains {
        Objects.requireNonNull(domains, "domains");
        domains = Set.copyOf(domains);
        if (uses < 0) {
            throw new IllegalArgumentException("a tagged corpus counts occurrences, never owes them: " + uses);
        }
    }
}
