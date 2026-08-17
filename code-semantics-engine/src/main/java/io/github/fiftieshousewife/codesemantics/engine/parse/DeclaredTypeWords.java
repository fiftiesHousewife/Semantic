package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.stream.Stream;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.Type;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The words of every type a declaration writes beside its name, in the order it wrote them — {@code tika},
 * {@code input}, {@code stream} for a {@code TikaInputStream}, {@code list} and {@code foo} for a
 * {@code List<Foo>}.
 *
 * <p>A type argument counts as written and the package a type lives in does not: {@code java.io.InputStream}
 * names {@code InputStream}, and an array is its component. The type's words are read by the same splitter a
 * declared name's words are, so anything comparing the two compares things made the same way.
 */
public final class DeclaredTypeWords {

    private final IdentifierWords words;

    public DeclaredTypeWords(final IdentifierWords words) {
        this.words = words;
    }

    public static DeclaredTypeWords fromClasspath() {
        return new DeclaredTypeWords(IdentifierWords.fromClasspath());
    }

    public List<String> of(final Type type) {
        return simpleNamesIn(type)
                .flatMap(simple -> words.of(simple).words().stream())
                .toList();
    }

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
