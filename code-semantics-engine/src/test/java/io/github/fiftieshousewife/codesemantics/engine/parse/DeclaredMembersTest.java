package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DeclaredMembersTest {

    private final DeclaredMembers members = DeclaredMembers.newInstance();

    @Test
    void readsATypeItsMethodsAndItsFields() {
        final List<Declaration> declared = members.in("Engine.java", """
                package inference;
                class Engine {
                    private final String model = "";
                    void load() {
                    }
                }
                """);
        assertAll(
                () -> assertThat(written(declared, DeclarationKind.TYPE)).containsExactly("Engine"),
                () -> assertThat(written(declared, DeclarationKind.METHOD)).containsExactly("Engine.load"),
                () -> assertThat(written(declared, DeclarationKind.FIELD)).containsExactly("Engine.model"));
    }

    @Test
    void readsAConstructorAsAMethodWhereTheVocabularyReadingLeavesItOut() {
        final List<Declaration> declared = members.in("Engine.java", """
                class Engine {
                    Engine(final String model) {
                    }
                }
                """);
        assertThat(written(declared, DeclarationKind.METHOD)).containsExactly("Engine.Engine");
    }

    @Test
    void readsARecordsComponentsAsItsFields() {
        final List<Declaration> declared = members.in("Loaded.java", """
                record Loaded(String name, int size) {
                }
                """);
        assertThat(written(declared, DeclarationKind.FIELD))
                .containsExactly("Loaded.name", "Loaded.size");
    }

    @Test
    void readsAnEnumsConstantsAsItsFields() {
        final List<Declaration> declared = members.in("Kind.java", """
                enum Kind {
                    LOCAL, REMOTE
                }
                """);
        assertThat(written(declared, DeclarationKind.FIELD)).containsExactly("Kind.LOCAL", "Kind.REMOTE");
    }

    @Test
    void keepsBothOverloadsOfOneName() {
        final List<Declaration> declared = members.in("Engine.java", """
                class Engine {
                    void load(String name) {
                    }
                    void load(int size) {
                    }
                }
                """);
        assertThat(written(declared, DeclarationKind.METHOD))
                .containsExactly("Engine.load", "Engine.load");
    }

    @Test
    void statesNoDeclarationWhereTheParserCanMakeNothingOfTheFile() {
        assertThat(members.in("Broken.java", "this is not Java at all {{{")).isEmpty();
    }

    @Test
    void namesTheDeclarationsAMemberWasWrittenInside() {
        final List<Declaration> declared = members.in("Engine.java", """
                class Engine {
                    static final class Loader {
                        void load() {
                        }
                    }
                }
                """);
        assertThat(written(declared, DeclarationKind.METHOD)).containsExactly("Engine.Loader.load");
    }

    private static List<String> written(final List<Declaration> declared, final DeclarationKind kind) {
        return declared.stream()
                .filter(declaration -> declaration.kind() == kind)
                .map(Declaration::written)
                .toList();
    }
}
