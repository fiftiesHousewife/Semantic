package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
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
     * @param statements       how many statements those methods carry in total
     * @param largestType      the most members any one type declares, which is what says how large a
     *                         type is: a type declares members and carries no statements of its own
     * @param methodStatements how the statements per method are spread
     * @param complexity       how McCabe's complexity is spread over those methods
     * @param nesting          how the deepest block per method is spread
     * @param parameters       how the parameters per method are spread
     */
    public record Measured(int types, int methods, int statements, int largestType,
                           Spread methodStatements, Spread complexity, Spread nesting,
                           Spread parameters) {

        static Measured of(final List<Integer> membersPerType, final List<MethodMetrics> methods) {
            return new Measured(membersPerType.size(), methods.size(),
                    methods.stream().mapToInt(MethodMetrics::statements).sum(),
                    membersPerType.stream().mapToInt(Integer::intValue).max().orElse(0),
                    Spread.over(methods, MethodMetrics::statements),
                    Spread.over(methods, MethodMetrics::complexity),
                    Spread.over(methods, MethodMetrics::nesting),
                    Spread.over(methods, MethodMetrics::parameters));
        }
    }

    /**
     * How one figure is spread over the methods measured, at the nearest rank: the value at the smallest
     * rank covering that share of them, sorted. It needs no interpolation and lands on a figure some
     * method actually has.
     *
     * @param median        the value at the middle of the sorted methods
     * @param upperQuartile the value three quarters of the way up them
     * @param highest       the largest any one method reaches
     */
    public record Spread(int median, int upperQuartile, int highest) {

        private static final double MIDDLE = 0.5;

        private static final double UPPER_QUARTILE = 0.75;

        static Spread over(final List<MethodMetrics> methods,
                           final ToIntFunction<MethodMetrics> figure) {
            final List<Integer> sorted = methods.stream()
                    .map(figure::applyAsInt)
                    .sorted()
                    .toList();
            return new Spread(at(sorted, MIDDLE), at(sorted, UPPER_QUARTILE),
                    sorted.isEmpty() ? 0 : sorted.getLast());
        }

        /** The value at the smallest rank covering this share, and nought where nothing was measured. */
        private static int at(final List<Integer> sorted, final double share) {
            if (sorted.isEmpty()) {
                return 0;
            }
            return sorted.get(Math.min(sorted.size() - 1, (int) Math.ceil(share * sorted.size()) - 1));
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
                .forEach(file -> measure(FileText.of(file), membersPerType, methods));
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
}
