package io.github.fiftieshousewife.codesemantics.engine.parse;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.UnknownType;
import com.github.javaparser.ast.type.VarType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TypeInitialsTest {

    private final TypeInitials initials = TypeInitials.fromClasspath();

    private Type type(final String written) {
        return StaticJavaParser.parseType(written);
    }

    @Test
    void spellsATypeByTheFirstLetterOfEachWordOfIt() {
        assertAll(
                () -> assertThat(initials.of(type("TikaInputStream"))).isEqualTo("tis"),
                () -> assertThat(initials.of(type("StringBuilder"))).isEqualTo("sb"),
                () -> assertThat(initials.of(type("InputStream"))).isEqualTo("is"),
                () -> assertThat(initials.of(type("byte"))).isEqualTo("b"));
    }

    @Test
    void claimsANameThatIsThoseInitialsAndNothingElse() {
        assertAll(
                () -> assertThat(initials.spell("tis", type("TikaInputStream"))).isTrue(),
                () -> assertThat(initials.spell("sb", type("StringBuilder"))).isTrue(),
                () -> assertThat(initials.spell("stream", type("InputStream"))).isFalse(),
                () -> assertThat(initials.spell("tikaStream", type("TikaInputStream"))).isFalse());
    }

    @Test
    void leavesAlonATwoLetterNameItsOwnTypeDoesNotSpell() {
        assertAll(
                () -> assertThat(initials.spell("id", type("String")))
                        .as("any rule about length that removes sb removes id with it")
                        .isFalse(),
                () -> assertThat(initials.spell("at", type("int"))).isFalse(),
                () -> assertThat(initials.spell("to", type("Path"))).isFalse());
    }

    @Test
    void countsATypeArgumentAsWritten() {
        assertAll(
                () -> assertThat(initials.of(type("List<Foo>"))).isEqualTo("lf"),
                () -> assertThat(initials.spell("lf", type("List<Foo>"))).isTrue(),
                () -> assertThat(initials.spell("foos", type("List<Foo>"))).isFalse());
    }

    @Test
    void spellsNothingForATypeNobodyWrote() {
        assertAll(
                () -> assertThat(initials.of(new VarType())).isEmpty(),
                () -> assertThat(initials.spell("v", new VarType())).isFalse(),
                () -> assertThat(initials.spell("r", new UnknownType())).isFalse());
    }

    @Test
    void readsAQualifiedTypeAsTheTypeItNames() {
        assertAll(
                () -> assertThat(initials.of(type("java.io.InputStream"))).isEqualTo("is"),
                () -> assertThat(initials.spell("is", type("java.io.InputStream"))).isTrue());
    }
}
