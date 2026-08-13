package org.fifties.housewife.codesemantics.engine.reading;

import java.util.Objects;
import java.util.function.Predicate;

import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * A {@link WordCitation} over one bundled resource: the source it would be attributed to, and the resource's
 * own lookup. Pairing the two in a record is what keeps a reading from citing a resource it did not consult —
 * the attribution and the lookup are declared in the same place or not at all.
 */
public record ResourceCitation(EvidenceSource source, Predicate<String> lookup) implements WordCitation {

    public ResourceCitation {
        Objects.requireNonNull(source, "source");
        Objects.requireNonNull(lookup, "lookup");
    }

    @Override
    public boolean cites(final String word) {
        return lookup.test(word);
    }
}
