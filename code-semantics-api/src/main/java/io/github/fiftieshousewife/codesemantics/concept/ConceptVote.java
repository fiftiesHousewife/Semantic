package io.github.fiftieshousewife.codesemantics.concept;

import java.util.Objects;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import io.github.fiftieshousewife.codesemantics.repository.SourceAnchor;

/**
 * One signed log-odds vote that a token reads as a concept, together with what said so and the lines that
 * said it. Because the anchor is required, an unattributed vote cannot be constructed: the attribution
 * guarantee is a type rather than a convention.
 */
public record ConceptVote(ConceptId value, double weight, EvidenceSource source, SourceAnchor anchor) {

    public ConceptVote {
        Objects.requireNonNull(value, "value");
        Objects.requireNonNull(source, "source");
        Objects.requireNonNull(anchor, "anchor");
    }
}
