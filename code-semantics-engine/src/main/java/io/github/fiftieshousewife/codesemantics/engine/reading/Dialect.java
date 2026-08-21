package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.behaviour.PropertyAccessors;

/**
 * What one programming language's own specification states about the names written in it.
 *
 * <p>Every other rule in the reading is a fact about English or about a published dictionary and holds
 * wherever the code was written. These do not. {@code getName} is the noun {@code name} with a convention in
 * front of it <em>because the JavaBeans specification says so</em>, and a language with no such statement
 * has no such rule — reading Python's {@code get_name} the same way would be applying Java's grammar to
 * somebody else's code with nothing to cite for it.
 *
 * <p>So the language arrives as a parameter. A reading of another language supplies its own dialect or
 * supplies {@link #none()}, and the rest of the pipeline is untouched.
 */
public interface Dialect {

    /** The language whose specification these rules come from, named for a report to state. */
    String language();

    /**
     * Whether the language's own specification claims this clause as a naming convention rather than as a
     * description of what the code does.
     */
    boolean namesAConvention(List<String> clause);

    /** Java, whose JavaBeans specification claims {@code get}, {@code set} and {@code is} (1.01, §8.3). */
    static Dialect java() {
        final PropertyAccessors accessors = new PropertyAccessors();
        return new Dialect() {
            @Override
            public String language() {
                return "Java";
            }

            @Override
            public boolean namesAConvention(final List<String> clause) {
                return accessors.claims(clause);
            }
        };
    }

    /**
     * A language whose specification this project can cite nothing from, which claims nothing.
     *
     * <p>It is the correct reading for an unknown language rather than a degraded one: a convention nobody
     * published is a convention nobody can be shown to have followed.
     */
    static Dialect none() {
        return new Dialect() {
            @Override
            public String language() {
                return "no stated dialect";
            }

            @Override
            public boolean namesAConvention(final List<String> clause) {
                return false;
            }
        };
    }
}
