package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class MethodMetricsTest {

    private final JavaParser parser = new JavaParser(new ParserConfiguration()
            .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21));

    @Test
    void measuresAStraightLineMethodAsComplexityOne() {
        assertThat(measured("""
                class Engine {
                    void load() {
                        run();
                    }
                }
                """).complexity()).isEqualTo(1);
    }

    @Test
    void countsOnePointOfBranchingForEachPlaceControlCanBranch() {
        assertThat(measured("""
                class Engine {
                    void load(int size) {
                        if (size > 0 && size < 9) {
                            for (int each = 0; each < size; each++) {
                                run();
                            }
                        }
                    }
                }
                """).complexity())
                .as("one, the if, the condition joined by &&, and the loop")
                .isEqualTo(4);
    }

    @Test
    void countsTheBlocksTheDeepestStatementSitsInside() {
        assertAll(
                () -> assertThat(measured("""
                        class Engine {
                            void load() {
                                run();
                            }
                        }
                        """).nesting()).isEqualTo(1),
                () -> assertThat(measured("""
                        class Engine {
                            void load(int size) {
                                if (size > 0) {
                                    while (size > 1) {
                                        run();
                                    }
                                }
                            }
                        }
                        """).nesting()).isEqualTo(3));
    }

    @Test
    void countsTheParametersAndTheStatementsTheDeclarationCarries() {
        final MethodMetrics measured = measured("""
                class Engine {
                    void load(String name, int size) {
                        run();
                        run();
                    }
                }
                """);
        assertAll(
                () -> assertThat(measured.parameters()).isEqualTo(2),
                () -> assertThat(measured.statements()).isEqualTo(2));
    }

    @Test
    void countsNoBlockAsAStatementOfItsOwn() {
        assertThat(measured("""
                class Engine {
                    void load(int size) {
                        if (size > 0) {
                            run();
                        }
                    }
                }
                """).statements())
                .as("the if and the call it guards, and neither of the two blocks around them")
                .isEqualTo(2);
    }

    private MethodMetrics measured(final String source) {
        final CompilationUnit unit = parser.parse(source).getResult().orElseThrow();
        final List<MethodDeclaration> methods = unit.findAll(MethodDeclaration.class);
        return MethodMetrics.of(methods.getFirst());
    }
}
