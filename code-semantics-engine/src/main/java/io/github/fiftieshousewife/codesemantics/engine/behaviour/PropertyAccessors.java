package io.github.fiftieshousewife.codesemantics.engine.behaviour;

import java.util.List;
import java.util.Set;

/**
 * The method names the JavaBeans specification claims as property accessors: {@code get}, {@code set} or
 * {@code is} in front of the property's name (JavaBeans 1.01, section 8.3, design patterns for properties).
 * An accessor names a property rather than an action — {@code getName} is the noun {@code name} with the
 * language's convention in front of it — and read as a clause it would report every Java repository as
 * mostly getting and setting.
 *
 * <p><b>This is Java's idiom and no other language's.</b> Refusing it cites the specification that states
 * the pattern, which is what keeps it from being a stop list; a reading of another language has no such
 * citation and must not apply it.
 */
public final class PropertyAccessors {

    /** The three prefixes section 8.3 states, and nothing beyond them. */
    private static final Set<String> STATED_PREFIXES = Set.of("get", "set", "is");

    /**
     * Whether the specification claims this clause: a stated prefix with the property's name after it. A
     * name that merely begins with an accessor's letters — {@code settleBalance} — splits as its own word
     * and is not claimed.
     */
    public boolean claims(final List<String> clause) {
        return clause.size() > 1 && STATED_PREFIXES.contains(clause.getFirst());
    }
}
