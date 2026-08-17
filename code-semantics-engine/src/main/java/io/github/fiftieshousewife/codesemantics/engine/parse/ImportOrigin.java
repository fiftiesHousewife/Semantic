package io.github.fiftieshousewife.codesemantics.engine.parse;

/**
 * Whose vocabulary an import names. Only one of the three is a choice this repository made about what it is
 * for, and it is the one the reading keeps.
 */
public enum ImportOrigin {

    /** A package the running platform itself exports — the standard library, quoted rather than chosen. */
    PLATFORM,
    /** A package declared inside this repository — its own coordinates, already read where they are declared. */
    INTERNAL,
    /** Everything else: the dependencies this repository chose, which is a fact about what it is for. */
    EXTERNAL
}
