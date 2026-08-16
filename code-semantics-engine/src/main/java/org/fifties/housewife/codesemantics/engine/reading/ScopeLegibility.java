package org.fifties.housewife.codesemantics.engine.reading;

import java.util.Map;
import java.util.Objects;

import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * One scope's finished reading: what was counted, which resources carried it, what nothing could read, and
 * every word it wrote.
 *
 * <p>{@code occurrencesBySource} overlaps by construction — a word both WordNet and the frequency list carry
 * is counted under each — so the shares do not sum to one and are not presented as if they did. Overlap is
 * the honest shape of pooled evidence: several resources speaking about the same word is corroboration, and a
 * table that hid it would be reporting an attribution rather than the evidence.
 */
public record ScopeLegibility(String name, int files, OccurrenceCounts counts,
                              Map<EvidenceSource, Integer> occurrencesBySource,
                              Map<EvidenceSource, Integer> soleOccurrencesBySource, UnreadWords unread,
                              WrittenWords written) {

    public ScopeLegibility {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(written, "written");
        occurrencesBySource = Map.copyOf(occurrencesBySource);
        soleOccurrencesBySource = Map.copyOf(soleOccurrencesBySource);
    }

    /** The share of word occurrences one resource can be cited for, bounded at 1 by what a share means. */
    public double shareCitedBy(final EvidenceSource source) {
        return share(occurrencesBySource.getOrDefault(source, 0));
    }

    /**
     * The word occurrences resting on this resource <em>alone</em> — what the reading would lose if the
     * resource were withdrawn. It is the figure that says whether a broad reading is carrying a legibility
     * number or merely corroborating one, and no per-resource share can answer that on its own.
     */
    public int occurrencesRestingOn(final EvidenceSource source) {
        return soleOccurrencesBySource.getOrDefault(source, 0);
    }

    private double share(final int occurrences) {
        return counts.words() == 0 ? 0.0 : (double) occurrences / counts.words();
    }
}
