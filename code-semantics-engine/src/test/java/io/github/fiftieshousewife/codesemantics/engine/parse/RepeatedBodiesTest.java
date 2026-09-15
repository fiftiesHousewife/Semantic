package io.github.fiftieshousewife.codesemantics.engine.parse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RepeatedBodiesTest {

    private final RepeatedBodies bodies = RepeatedBodies.newInstance();

    @Test
    void namesBothMethodsWritingOneBodyTwice() {
        assertThat(bodies.in("Engine.java", """
                class Engine {
                    int started() {
                        final int count = load();
                        return count + 1;
                    }

                    int stopped() {
                        final int count = load();
                        return count + 1;
                    }
                }
                """).methods())
                .extracting(Declaration::name)
                .containsExactly("started", "stopped");
    }

    @Test
    void countsTheStatementsTheRepeatedBodiesCarry() {
        final RepeatedBodies.Repeated repeated = bodies.in("Engine.java", """
                class Engine {
                    int started() {
                        final int count = load();
                        return count + 1;
                    }

                    int stopped() {
                        final int count = load();
                        return count + 1;
                    }
                }
                """);

        assertAll(
                () -> assertThat(repeated.methods()).hasSize(2),
                () -> assertThat(repeated.statements())
                        .as("two statements, written twice")
                        .isEqualTo(4),
                () -> assertThat(repeated.largest())
                        .as("the body itself carries two")
                        .isEqualTo(2));
    }

    @Test
    void namesNoMethodWhereEveryBodyDiffers() {
        assertThat(bodies.in("Engine.java", """
                class Engine {
                    int started() {
                        return 1;
                    }

                    int stopped() {
                        return 2;
                    }
                }
                """).methods()).isEmpty();
    }

    @Test
    void readsPastABodyLaidOutDifferentlyButWritingTheSameStatements() {
        assertThat(bodies.in("Engine.java", """
                class Engine {
                    int started() {
                        return load()
                                + 1;
                    }

                    int stopped() { return load() + 1; }
                }
                """).methods())
                .as("the parse prints both bodies its own way, so layout is not a difference")
                .hasSize(2);
    }

    @Test
    void namesNoMethodForAnEmptyBodyHoweverOftenItIsWritten() {
        assertThat(bodies.in("Engine.java", """
                class Engine {
                    void started() {
                    }

                    void stopped() {
                    }

                    void paused() {
                    }
                }
                """).methods())
                .as("an empty body writes nothing, so two of them repeat nothing")
                .isEmpty();
    }

    @Test
    void namesTheBiggestRepeatedBodyRatherThanTheirTotal() {
        final RepeatedBodies.Repeated repeated = bodies.in("Engine.java", """
                class Engine {
                    int started() {
                        return 1;
                    }

                    int stopped() {
                        return 1;
                    }

                    int paused() {
                        final int count = load();
                        final int next = count + 1;
                        return next;
                    }

                    int resumed() {
                        final int count = load();
                        final int next = count + 1;
                        return next;
                    }
                }
                """);

        assertAll(
                () -> assertThat(repeated.statements())
                        .as("one statement twice and three statements twice")
                        .isEqualTo(8),
                () -> assertThat(repeated.largest())
                        .as("which the total alone cannot separate from eight accessors")
                        .isEqualTo(3));
    }

    @Test
    void namesNoMethodWhereABodyStandsInOneMethodAlone() {
        assertThat(bodies.in("Engine.java", """
                class Engine {
                    int started() {
                        final int count = load();
                        return count + 1;
                    }
                }
                """).methods()).isEmpty();
    }

    @Test
    void namesNothingWhereTheParserCanMakeNothingOfTheFile() {
        assertThat(bodies.in("Engine.java", "class Engine {").methods()).isEmpty();
    }

    @Test
    void countsAbstractAndInterfaceMethodsAsNoBodyAtAll() {
        assertThat(bodies.in("Engine.java", """
                interface Engine {
                    int started();

                    int stopped();
                }
                """).methods()).isEmpty();
    }
}
