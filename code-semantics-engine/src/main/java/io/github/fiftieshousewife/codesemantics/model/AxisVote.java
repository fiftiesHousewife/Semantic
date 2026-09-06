package io.github.fiftieshousewife.codesemantics.model;

import io.github.fiftieshousewife.codesemantics.repository.SourceAnchor;

/**
 * A single weighted vote for one value of a closed axis {@code A}, so that one generic accumulator can
 * resolve any such axis from its own votes. A concept assignment is <em>not</em> one of these: concepts are
 * an open value space and vote through
 * {@link io.github.fiftieshousewife.codesemantics.concept.ConceptVote} instead.
 */
public interface AxisVote<A extends Enum<A>> {

    A value();

    double weight();

    EvidenceSource source();

    SourceAnchor anchor();
}
