package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.type.TypeParameter;

/**
 * Every declared name short enough that a dictionary entry for it can only be a symbol reading, tallied by
 * the kind of declaration it is.
 *
 * <p>{@code e} stands thirteenth in this tree's vocabulary ranking on 43 occurrences, and the ranking has no
 * way to say what it is: the dictionary carries {@code e} as a noun, so nothing refuses it. The question the
 * plan asks is whether such names are almost all catch parameters, loop indices and type parameters — in
 * which case the parse can report them apart on the same grounds it already reads declarations rather than
 * uses — or whether they are names an author meant, in which case they stay where they are.
 *
 * <p>It parses the tree itself rather than reading the pipeline's occurrences, because the pipeline's
 * {@code PARAMETER} covers a method's, a lambda's and a catch clause's alike, and which of the three a name
 * is standing in is the whole question.
 */
public final class ShortNamesProbe {

    /** The length below which a dictionary entry is a symbol reading — the same figure the prose rule uses. */
    private static final int SHORT = 3;

    private ShortNamesProbe() {
    }

    public static void main(final String[] args) {
        final Path root = new CloneUnderReading().root();
        final Map<String, Integer> byKind = new HashMap<>();
        final Map<String, Integer> byName = new HashMap<>();
        TreeReading.scopesUnder(root).stream()
                .flatMap(scope -> scope.files().stream())
                .filter(file -> file.getFileName().toString().endsWith(".java"))
                .forEach(file -> countIn(parse(file), byKind, byName));

        System.out.printf("%n%s — declared names under %d letters, by the kind of declaration%n",
                root.getFileName(), SHORT);
        byKind.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(kind -> System.out.printf("  %-22s %6d%n", kind.getKey(), kind.getValue()));
        System.out.printf("%n  the names themselves%n");
        byName.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(name -> System.out.printf("  %-22s %6d%n", name.getKey(), name.getValue()));
    }

    private static void countIn(final CompilationUnit unit, final Map<String, Integer> byKind,
                                final Map<String, Integer> byName) {
        unit.findAll(CatchClause.class).forEach(caught ->
                count(caught.getParameter().getNameAsString(), "catch parameter", byKind, byName));
        unit.findAll(LambdaExpr.class).forEach(lambda -> lambda.getParameters().forEach(parameter ->
                count(parameter.getNameAsString(), "lambda parameter", byKind, byName)));
        unit.findAll(Parameter.class).stream()
                .filter(parameter -> parameter.getParentNode()
                        .filter(parent -> parent instanceof CatchClause || parent instanceof LambdaExpr)
                        .isEmpty())
                .forEach(parameter -> count(parameter.getNameAsString(), "method parameter", byKind, byName));
        unit.findAll(TypeParameter.class).forEach(parameter ->
                count(parameter.getNameAsString(), "type parameter", byKind, byName));
        unit.findAll(VariableDeclarationExpr.class).forEach(local -> local.getVariables().forEach(variable ->
                count(variable.getNameAsString(), "local", byKind, byName)));
        unit.findAll(VariableDeclarator.class).stream()
                .filter(variable -> variable.getParentNode()
                        .filter(parent -> parent instanceof VariableDeclarationExpr).isEmpty())
                .forEach(variable -> count(variable.getNameAsString(), "field", byKind, byName));
    }

    private static void count(final String name, final String kind, final Map<String, Integer> byKind,
                              final Map<String, Integer> byName) {
        if (name.length() >= SHORT) {
            return;
        }
        byKind.merge(kind, 1, Integer::sum);
        byName.merge(name + " (" + kind + ")", 1, Integer::sum);
    }

    private static CompilationUnit parse(final Path file) {
        try {
            return new JavaParser(new ParserConfiguration()
                    .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21))
                    .parse(Files.readString(file)).getResult().orElseGet(CompilationUnit::new);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }
}
