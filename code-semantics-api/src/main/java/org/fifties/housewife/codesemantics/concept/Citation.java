package org.fifties.housewife.codesemantics.concept;

import java.util.Objects;

import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.fifties.housewife.codesemantics.repository.SourceAnchor;

/**
 * What a resource said about a token, before any concept was resolved from it. A citation is the row behind
 * a {@code CITES} edge: the sense key as its own source names it, so that a reading can be interrogated back
 * to the published entry it rests on rather than only to the concept it produced.
 */
public record Citation(String surface, EvidenceSource source, String senseKey, String gloss,
                       double weight, SourceAnchor anchor) {

    public Citation {
        Objects.requireNonNull(surface, "surface");
        Objects.requireNonNull(source, "source");
        Objects.requireNonNull(senseKey, "senseKey");
        Objects.requireNonNull(anchor, "anchor");
    }
}
