package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * How far this parser recovers from a file that does not compile, pinned as a measurement rather than left
 * as an assumption. Error tolerance is a requirement and not a nicety — the commits that most need reading
 * are the ones that do not compile — and the plan chose a different parser partly on this question, so what
 * the chosen one actually does belongs in the suite.
 */
class JavaSourceErrorToleranceTest {

    private final JavaSource parser = JavaSource.newInstance();

    @Test
    void keepsTheDeclarationsAroundAnErrorInsideAMethodBody() {
        final ParsedSource unsound = parser.read(Path.of("Sample.java"), """
                package example;
                class Page {
                    int cursor;
                    void read() { int offset = ; }
                }
                """);

        assertAll(
                () -> assertThat(unsound.outcome())
                        .as("a file that does not compile must not read as cleanly parsed")
                        .isEqualTo(ParseOutcome.RECOVERED),
                () -> assertThat(unsound.occurrences())
                        .as("the commits that most need reading are the ones that do not compile")
                        .extracting(NameOccurrence::text)
                        .contains("Page", "cursor"));
    }

    /**
     * The limit of this parser's tolerance, pinned so that it is a known quantity rather than an assumption.
     * An error in a body is recovered from; an error in the structure that holds the bodies is not, and the
     * file reads as nothing at all. The plan's own choice of a parser generator with error recovery as a
     * documented strength is still owed a measurement against this.
     */
    @Test
    void recoversNothingFromAnErrorInTheStructureRatherThanInABody() {
        assertAll(
                () -> assertThat(parser.read(Path.of("Sample.java"), "package a;\nclass Page { void read( { } }\n").occurrences())
                        .isEmpty(),
                () -> assertThat(parser.read(Path.of("Sample.java"), "package a;\nclass Page { int cursor;\n").occurrences())
                        .as("an unclosed type takes its declarations with it")
                        .isEmpty(),
                () -> assertThat(parser.read(Path.of("Sample.java"), "(((").outcome())
                        .as("the parser yields an empty unit around the wreckage rather than refusing "
                                + "the file, so even this reads as recovered")
                        .isEqualTo(ParseOutcome.RECOVERED));
    }
}
