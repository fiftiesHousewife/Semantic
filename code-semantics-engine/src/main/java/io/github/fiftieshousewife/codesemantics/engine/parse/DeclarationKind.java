package io.github.fiftieshousewife.codesemantics.engine.parse;

/**
 * What a declaration is in the syntax.
 *
 * <p>{@link NameForm} states what a name is <em>and</em> who chose it, so a field whose name restates its
 * type reads there as quoted rather than as a field. A diff of two trees asks only the first question, and
 * this answers it.
 */
public enum DeclarationKind {

    /** A class, interface, enum, record or annotation. */
    TYPE,

    /**
     * A method or a constructor. The vocabulary reading leaves a constructor out because its name is its
     * type's name written twice; that is a reason about words. A constructor a change adds is a declaration
     * added, so this reads it.
     */
    METHOD,

    /** A field, an enum constant or a record component. */
    FIELD
}
