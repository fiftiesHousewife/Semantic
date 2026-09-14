package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class UntestedTypesTest {

    private final WrittenWork work = new WrittenWork();

    @TempDir
    Path base;

    @TempDir
    Path head;

    @Test
    void namesAProductionTypeAddedWithNoTestOfItsOwnName() throws IOException {
        production(head, "Engine.java", "public class Engine {\n}\n");

        assertThat(work.between(base, head).typesAddedWithoutATest())
                .extracting(ChangedCode.TypeWithoutATest::name)
                .containsExactly("Engine");
    }

    @Test
    void namesTheTestSurefiresFirstDefaultPatternWouldRunForIt() throws IOException {
        production(head, "Engine.java", "public class Engine {\n}\n");

        assertThat(work.between(base, head).typesAddedWithoutATest())
                .extracting(ChangedCode.TypeWithoutATest::test)
                .containsExactly("TestEngine");
    }

    @Test
    void namesTheTestOfANestedTypeAfterTheNameItIsDeclaredUnder() throws IOException {
        production(head, "Engine.java", "public class Engine {\n  class Piston {\n  }\n}\n");

        assertThat(work.between(base, head).typesAddedWithoutATest())
                .extracting(ChangedCode.TypeWithoutATest::name,
                        ChangedCode.TypeWithoutATest::test)
                .containsExactly(tuple("Engine", "TestEngine"),
                        tuple("Engine.Piston", "TestPiston"));
    }

    @Test
    void namesNoTypeWhereTheChangeAddsATestForIt() throws IOException {
        production(head, "Engine.java", "public class Engine {\n}\n");
        checking(head, "EngineTest.java", "class EngineTest {\n}\n");

        assertThat(work.between(base, head).typesAddedWithoutATest()).isEmpty();
    }

    @Test
    void countsNoTestTypeAsUntestedItself() throws IOException {
        checking(head, "EngineTest.java", "class EngineTest {\n}\n");

        final ChangedCode written = work.between(base, head);

        assertAll(
                () -> assertThat(written.typesAddedWithoutATest()).isEmpty(),
                () -> assertThat(written.filesByKind())
                        .extracting(ChangedCode.KindFiles::kind)
                        .containsExactly("tests"));
    }

    @Test
    void countsTheMethodsTheChangeAddsCarryingTheAnnotationThatNamesATest() throws IOException {
        checking(head, "EngineTest.java", """
                class EngineTest {
                    @Test
                    void starts() {
                    }

                    @Test
                    void stops() {
                    }

                    private void neitherOfThose() {
                    }
                }
                """);

        assertThat(work.between(base, head).testMethodsAdded()).isEqualTo(2);
    }

    @Test
    void countsNoTestMethodWhereTheChangeAddsNone() throws IOException {
        production(head, "Engine.java", "public class Engine {\n  void starts() {\n  }\n}\n");

        assertThat(work.between(base, head).testMethodsAdded()).isZero();
    }

    @Test
    void countsATestMethodTheChangeAddsToATestClassThatAlreadyStood() throws IOException {
        checking(base, "EngineTest.java", """
                class EngineTest {
                    @Test
                    void starts() {
                    }
                }
                """);
        checking(head, "EngineTest.java", """
                class EngineTest {
                    @Test
                    void starts() {
                    }

                    @Test
                    void stops() {
                    }
                }
                """);

        assertThat(work.between(base, head).testMethodsAdded()).isEqualTo(1);
    }

    @Test
    void namesNoTypeWhereNothingWasAdded() throws IOException {
        production(base, "Engine.java", "public class Engine {\n}\n");
        production(head, "Engine.java", "public class Engine {\n}\n");

        assertThat(work.between(base, head).typesAddedWithoutATest()).isEmpty();
    }

    private static void production(final Path tree, final String name, final String source)
            throws IOException {
        wrote(tree.resolve("engine").resolve("src").resolve("main").resolve("java"), name, source);
    }

    private static void checking(final Path tree, final String name, final String source)
            throws IOException {
        wrote(tree.resolve("engine").resolve("src").resolve("test").resolve("java"), name, source);
    }

    private static void wrote(final Path directory, final String name, final String source)
            throws IOException {
        Files.createDirectories(directory);
        Files.writeString(directory.resolve(name), source);
    }
}
