package org.fifties.housewife.codesemantics.engine.parse;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.Type;

import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

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
 *
 * <p>The type's words are read by the same splitter the declared name's words are, so both sides of the
 * comparison are made the same way. A type argument counts as written: {@code List<Foo> lf} names the type
 * twice as much as {@code List<Foo> foos} does.
 */
public final class TypeInitials {

    private final IdentifierWords words;

    public TypeInitials(final IdentifierWords words) {
        this.words = words;
    }

    public static TypeInitials fromClasspath() {
        return new TypeInitials(IdentifierWords.fromClasspath());
    }

    /** Whether the name is the initials of its own type and nothing else. */
    public boolean spell(final String name, final Type type) {
        final String initials = of(type);
        return !initials.isEmpty() && initials.equals(name.toLowerCase(Locale.ROOT));
    }

    /** The initials themselves, which is what a report shows beside the name it claimed. */
    public String of(final Type type) {
        return simpleNamesIn(type)
                .flatMap(simple -> words.of(simple).words().stream())
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining());
    }

    /**
     * The types the declaration names, in the order they were written. The package a type lives in is not
     * one of them — {@code java.io.InputStream} names {@code InputStream} — and an array is its component.
     */
    private Stream<String> simpleNamesIn(final Type type) {
        return Stream.of(
                        type.toClassOrInterfaceType().stream().flatMap(this::namesWrittenBy),
                        type.toPrimitiveType().stream().map(PrimitiveType::asString),
                        type.toArrayType().stream().flatMap(array -> simpleNamesIn(array.getComponentType())))
                .flatMap(names -> names);
    }

    private Stream<String> namesWrittenBy(final ClassOrInterfaceType named) {
        return Stream.concat(Stream.of(named.getNameAsString()),
                named.getTypeArguments().stream().flatMap(NodeList::stream).flatMap(this::simpleNamesIn));
    }
}
