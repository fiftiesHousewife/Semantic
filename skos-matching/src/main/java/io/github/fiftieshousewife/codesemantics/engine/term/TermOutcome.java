package io.github.fiftieshousewife.codesemantics.engine.term;

/** What became of a term the index found in a declared name. */
public enum TermOutcome {

    /** Admitted, and reported as a concept the repository writes. */
    REPORTED,

    /**
     * Found, and removed because it is one word and the publisher's own branch holds no other concept this
     * repository wrote. It is recorded rather than dropped: a reading that kept only what it admitted could
     * not be asked why a term the repository plainly writes is absent from the answer.
     */
    REFUSED_BY_BRANCH_RULE
}
