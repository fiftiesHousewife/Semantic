package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.ToIntFunction;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;

import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;

/**
 * Every method and type of a tree, measured. What a reader of two trees wants from it is the largest and
 * the total, so the aggregate carries both rather than a distribution nothing would read.
 */
public final class TreeMetrics {

    private static final String JAVA_SUFFIX = ".java";

    private final JavaParser parser;

    public TreeMetrics(final ParserConfiguration configuration) {
        this.parser = new JavaParser(configuration);
    }

    public static TreeMetrics newInstance() {
        return new TreeMetrics(new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21));
    }

    /**
     * One tree's methods and types, summed and topped.
     *
     * @param types             how many types the tree declares
     * @param methods           how many methods and constructors it declares
     * @param statements        how many statements those methods carry in total
     * @param largestType       the most members any one type declares, which is what says how large a
     *                          type is: a type declares members and carries no statements of its own
     * @param longestMethod     the most statements any one method carries
     * @param totalComplexity   McCabe's complexity summed over every method
     * @param highestComplexity the largest any one method reaches
     * @param deepestNesting    the deepest block any method holds
     * @param mostParameters    the most parameters any one method declares
     */
    public record Measured(int types, int methods, int statements, int largestType, int longestMethod,
                           int totalComplexity, int highestComplexity, int deepestNesting,
                           int mostParameters) {

        static Measured of(final List<Integer> membersPerType, final List<MethodMetrics> methods) {
            return new Measured(membersPerType.size(), methods.size(),
                    methods.stream().mapToInt(MethodMetrics::statements).sum(),
                    membersPerType.stream().mapToInt(Integer::intValue).max().orElse(0),
                    top(methods, MethodMetrics::statements),
                    methods.stream().mapToInt(MethodMetrics::complexity).sum(),
                    top(methods, MethodMetrics::complexity),
                    top(methods, MethodMetrics::nesting),
                    top(methods, MethodMetrics::parameters));
        }

        private static int top(final List<MethodMetrics> measured,
                               final ToIntFunction<MethodMetrics> figure) {
            return measured.stream().mapToInt(figure).max().orElse(0);
        }
    }

    /** Every Java file of these scopes, measured together. */
    public Measured under(final Path root, final List<SourceScope> scopes) {
        final List<Integer> membersPerType = new ArrayList<>();
        final List<MethodMetrics> methods = new ArrayList<>();
        scopes.stream()
                .flatMap(scope -> scope.files().stream())
                .filter(file -> file.getFileName().toString().endsWith(JAVA_SUFFIX))
                .distinct()
                .sorted()
                .forEach(file -> measure(contentOf(file), membersPerType, methods));
        return Measured.of(membersPerType, methods);
    }

    /** A type is measured by the members it declares; a method by the statements it carries. */
    private void measure(final String source, final List<Integer> membersPerType,
                         final List<MethodMetrics> methods) {
        parser.parse(source).getResult().ifPresent(unit -> {
            unit.findAll(TypeDeclaration.class)
                    .forEach(type -> membersPerType.add(type.getMembers().size()));
            methods.addAll(callables(unit));
        });
    }

    private static List<MethodMetrics> callables(final CompilationUnit unit) {
        return unit.findAll(CallableDeclaration.class).stream()
                .map(MethodMetrics::of)
                .toList();
    }

    private static String contentOf(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT, "Failed to read %s", file), e);
        }
    }
}
