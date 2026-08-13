package org.fifties.housewife.codesemantics.symbol;

/** What a declaration is, at the granularity the containment tree is built over. */
public enum SymbolKind {
    PACKAGE,
    TYPE,
    METHOD,
    FIELD,
    PARAMETER,
    LOCAL
}
