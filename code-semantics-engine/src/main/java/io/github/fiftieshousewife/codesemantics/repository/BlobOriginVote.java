package io.github.fiftieshousewife.codesemantics.repository;

import java.util.Objects;

import io.github.fiftieshousewife.codesemantics.model.AxisVote;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

/** One weighted vote about where a blob's content came from. */
public record BlobOriginVote(BlobOrigin value, double weight, EvidenceSource source, SourceAnchor anchor)
        implements AxisVote<BlobOrigin> {

    public BlobOriginVote {
        Objects.requireNonNull(value, "value");
        Objects.requireNonNull(source, "source");
        Objects.requireNonNull(anchor, "anchor");
    }
}
