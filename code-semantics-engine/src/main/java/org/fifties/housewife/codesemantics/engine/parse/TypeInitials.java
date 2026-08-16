package org.fifties.housewife.codesemantics.engine.parse;

import java.util.Locale;
import java.util.stream.Collectors;

import com.github.javaparser.ast.type.Type;

/**
 * The first letter of each word of a declared type, in the order the type was written — {@code tis} for a
 * {@code TikaInputStream}, {@code sb} for a {@code StringBuilder}, {@code is} for an {@code InputStream}.
 *
 * <p>A name spelled exactly that way is the type quoted, and a type is a use: already read wherever it was
 * declared. It is the rule {@link NameForm#CAUGHT} applies to a catch clause, generalised to every
 * declaration that writes its type beside its name.
 *
 * <p><b>It is a rule about the parse and not about length.</b> A length rule would take {@code id} with it,
 * which is a name an author meant; {@code String id} spells {@code s}, so {@code id} is untouched, while
 * {@code StringBuilder sb} spells {@code sb} and is claimed. A type nothing was written for — a
 * {@code var} declaration, a lambda's parameter — spells nothing, and nothing is what no name can equal.
 */
public final class TypeInitials {

    private final DeclaredTypeWords typeWords;

    public TypeInitials(final DeclaredTypeWords typeWords) {
        this.typeWords = typeWords;
    }

    public static TypeInitials fromClasspath() {
        return new TypeInitials(DeclaredTypeWords.fromClasspath());
    }

    /** Whether the name is the initials of its own type and nothing else. */
    public boolean spell(final String name, final Type type) {
        final String initials = of(type);
        return !initials.isEmpty() && initials.equals(name.toLowerCase(Locale.ROOT));
    }

    /** The initials themselves, which is what a report shows beside the name it claimed. */
    public String of(final Type type) {
        return typeWords.of(type).stream()
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining());
    }
}
