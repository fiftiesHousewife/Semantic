package io.github.fiftieshousewife.codesemantics.repository;

/**
 * Where a blob's content came from — the one closed axis the pipeline resolves per file revision. It is a
 * closed enum, so it resolves through the pooled accumulator exactly as a classification axis does: a
 * generator marker or a {@code .gitattributes} line is a heavy vote, never a gate, so a hand-edited file
 * carrying a stale marker is demoted rather than erased.
 */
public enum BlobOrigin {
    /** Written by the people whose repository this is. */
    HAND_WRITTEN,
    /** Emitted by a tool from some other input. */
    GENERATED,
    /** A dependency's source dropped into the tree rather than developed in it. */
    VENDORED,
    /** The sentinel: the votes carried too little evidence to say. */
    UNKNOWN
}
