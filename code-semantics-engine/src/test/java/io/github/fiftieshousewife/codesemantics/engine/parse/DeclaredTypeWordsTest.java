package io.github.fiftieshousewife.codesemantics.engine.parse;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.type.Type;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DeclaredTypeWordsTest {

    private final DeclaredTypeWords words = DeclaredTypeWords.fromClasspath();

    private Type type(final String written) {
        return StaticJavaParser.parseType(written);
    }

    @Test
    void readsTheWordsOfATypeInTheOrderItWroteThem() {
        assertThat(words.of(type("TikaInputStream"))).containsExactly("tika", "input", "stream");
    }

    @Test
    void countsATypeArgumentAsWritten() {
        assertAll(
                () -> assertThat(words.of(type("List<Foo>"))).containsExactly("list", "foo"),
                () -> assertThat(words.of(type("Map<String, List<Foo>>")))
                        .containsExactly("map", "string", "list", "foo"));
    }

    @Test
    void dropsThePackageATypeLivesIn() {
        assertThat(words.of(type("java.io.InputStream"))).containsExactly("input", "stream");
    }

    @Test
    void readsAnArrayAsItsComponent() {
        assertAll(
                () -> assertThat(words.of(type("int[]"))).containsExactly("int"),
                () -> assertThat(words.of(type("String[][]"))).containsExactly("string"));
    }

    @Test
    void readsAPrimitiveAsItsOwnWord() {
        assertThat(words.of(type("boolean"))).containsExactly("boolean");
    }

    @Test
    void aWildcardArgumentWritesNoWord() {
        assertThat(words.of(type("List<?>"))).containsExactly("list");
    }
}
