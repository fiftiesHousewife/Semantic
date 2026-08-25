package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.theme.CorpusSpecificity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClassFileMethodsTest {

    private final ClassFileMethods methods = new ClassFileMethods();

    @Test
    void readsTheMethodNamesACallerOfTheClassCouldWrite() throws IOException {
        assertThat(namesDeclaredBy(CorpusSpecificity.class)).contains("of", "fromClasspath");
    }

    @Test
    void refusesWhatOnlyTheClassItselfCanCall() throws IOException {
        assertThat(namesDeclaredBy(CorpusSpecificity.class))
                .as("a private method's name is not vocabulary a programmer ever meets")
                .doesNotContain("ranked");
    }

    @Test
    void namesAConstructorAsTheClassFileSpellsIt() throws IOException {
        assertThat(namesDeclaredBy(String.class))
                .as("the format spells a constructor <init>, which no Java identifier could hold, so what "
                        + "removes it is the same rule that removes an anonymous class's number")
                .contains("<init>");
    }

    @Test
    void walksAConstantPoolCarryingEveryWidthTheFormatStates() throws IOException {
        assertThat(namesDeclaredBy(Long.class))
                .as("a long and a double each fill two places of the pool, and one miscounted place "
                        + "loses every name after it")
                .contains("longValue", "parseLong", "toBinaryString", "compareTo");
    }

    @Test
    void readsAnInterfaceWhoseMethodsCarryNoBody() throws IOException {
        assertThat(namesDeclaredBy(ReferenceVocabulary.class)).contains("name", "shareByWord", "shareOf");
    }

    private List<String> namesDeclaredBy(final Class<?> type) throws IOException {
        try (InputStream bytes = type.getResourceAsStream(type.getSimpleName() + ".class")) {
            return methods.declaredBy(bytes);
        }
    }
}
