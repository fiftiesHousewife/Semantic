package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TreeMetricsTest {

    private final TreeMetrics metrics = TreeMetrics.newInstance();

    @TempDir
    Path tree;

    @Test
    void sumsTheStatementsAndTopsEveryFigureAcrossTheFilesItReads() throws IOException {
        wrote("Engine.java", """
                class Engine {
                    private String model;
                    void load(String name, int size) {
                        if (size > 0 && size < 9) {
                            run();
                        }
                    }
                }
                """);
        wrote("Loader.java", """
                class Loader {
                    void load() {
                        run();
                    }
                }
                """);

        final TreeMetrics.Measured measured = metrics.under(tree, scopes());

        assertAll(
                () -> assertThat(measured.types()).isEqualTo(2),
                () -> assertThat(measured.methods()).isEqualTo(2),
                () -> assertThat(measured.statements())
                        .as("the if, the condition it guards and the one call in the other method")
                        .isEqualTo(3),
                () -> assertThat(measured.largestType())
                        .as("a type is measured by the members it declares")
                        .isEqualTo(2),
                () -> assertThat(measured.longestMethod()).isEqualTo(2),
                () -> assertThat(measured.totalComplexity()).isEqualTo(4),
                () -> assertThat(measured.highestComplexity()).isEqualTo(3),
                () -> assertThat(measured.deepestNesting()).isEqualTo(2),
                () -> assertThat(measured.mostParameters()).isEqualTo(2));
    }

    @Test
    void measuresNothingWhereTheScopesReachNoJavaFile() {
        assertAll(
                () -> assertThat(metrics.under(tree, List.of()).types()).isZero(),
                () -> assertThat(metrics.under(tree, List.of()).longestMethod()).isZero(),
                () -> assertThat(metrics.under(tree, List.of()).totalComplexity()).isZero());
    }

    @Test
    void readsWhatItCanOfAFileTheParserCannotFinish() throws IOException {
        wrote("Broken.java", "this is not Java at all {{{");

        assertThat(metrics.under(tree, scopes()).types())
                .as("the commits that most need reading are the ones that do not compile")
                .isZero();
    }

    private List<SourceScope> scopes() throws IOException {
        try (var files = Files.list(sources())) {
            return List.of(new SourceScope("engine/src/main/java", files.sorted().toList()));
        }
    }

    private Path sources() {
        return tree.resolve("engine").resolve("src").resolve("main").resolve("java");
    }

    private void wrote(final String name, final String source) throws IOException {
        Files.createDirectories(sources());
        Files.writeString(sources().resolve(name), source);
    }
}
