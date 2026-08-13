package org.fifties.housewife.codesemantics.repository;

import java.util.Objects;

import org.fifties.housewife.codesemantics.model.AxisVote;
import org.fifties.housewife.codesemantics.model.EvidenceSource;

/** One weighted vote about where a blob's content came from. */
public record BlobOriginVote(BlobOrigin value, double weight, EvidenceSource source, SourceAnchor anchor)
        implements AxisVote<BlobOrigin> {

    public BlobOriginVote {
        Objects.requireNonNull(value, "value");
        Objects.requireNonNull(source, "source");
        Objects.requireNonNull(anchor, "anchor");
    }
}
