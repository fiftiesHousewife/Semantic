package io.github.fiftieshousewife.codesemantics.engine.parse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DeclaredTestsTest {

    private final DeclaredTests tests = DeclaredTests.newInstance();

    @Test
    void namesEveryMethodTheFileAnnotatesAsATest() {
        assertThat(tests.in("EngineTest.java", """
                class EngineTest {
                    @Test
                    void starts() {
                    }

                    @Test
                    void stops() {
                    }

                    void neitherOfThose() {
                    }
                }
                """))
                .extracting(Declaration::name)
                .containsExactly("starts", "stops");
    }

    @Test
    void readsTheAnnotationWhereTheFileWritesItUnderItsPackage() {
        assertThat(tests.in("EngineTest.java", """
                class EngineTest {
                    @org.junit.jupiter.api.Test
                    void starts() {
                    }
                }
                """))
                .extracting(Declaration::name)
                .containsExactly("starts");
    }

    @Test
    void namesNothingWhereNoMethodCarriesTheAnnotation() {
        assertAll(
                () -> assertThat(tests.in("Engine.java", """
                        class Engine {
                            @Override
                            public String toString() {
                                return "";
                            }
                        }
                        """)).isEmpty(),
                () -> assertThat(tests.in("Engine.java", "@Test class Engine {\n}\n"))
                        .as("a type carrying the annotation is not a test method")
                        .isEmpty());
    }

    @Test
    void namesNothingWhereTheParserCanMakeNothingOfTheFile() {
        assertThat(tests.in("Engine.java", "class Engine {")).isEmpty();
    }

    @Test
    void writesEachTestUnderTheDeclarationsItSitsInside() {
        assertThat(tests.in("EngineTest.java", """
                class EngineTest {
                    @Test
                    void starts() {
                    }
                }
                """))
                .extracting(Declaration::written)
                .containsExactly("EngineTest.starts");
    }
}
