package io.github.fiftieshousewife.codesemantics.engine.reading;

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
import com.github.javaparser.ast.expr.TypePatternExpr;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.type.Type;

import io.github.fiftieshousewife.codesemantics.engine.parse.TypeInitials;

/**
 * Every declared name the initials of its own type spell, with the type that spelled it and how often.
 *
 * <p>It is what the rule has to be judged on: a name whose letters are its type's initials by accident is
 * the failure mode, and the only way to see one is to print the pair. {@code id} is the case that decides
 * it — a name an author meant, which any rule about length would take with {@code sb}.
 */
public final class AbbreviatedTypesProbe {

    private static final TypeInitials INITIALS = TypeInitials.fromClasspath();

    private AbbreviatedTypesProbe() {
    }

    public static void main(final String[] args) {
        final Path root = new CloneUnderReading().root();
        final Map<String, Integer> claimed = new HashMap<>();
        TreeReading.scopesUnder(root).stream()
                .flatMap(scope -> scope.files().stream())
                .filter(file -> file.getFileName().toString().endsWith(".java"))
                .forEach(file -> countIn(parse(file), claimed));

        final int occurrences = claimed.values().stream().mapToInt(Integer::intValue).sum();
        System.out.printf("%n%s — %d declarations over %d distinct names are their own type's initials%n",
                root.getFileName(), occurrences, claimed.size());
        claimed.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(name -> System.out.printf("  %-46s %6d%n", name.getKey(), name.getValue()));
    }

    private static void countIn(final CompilationUnit unit, final Map<String, Integer> claimed) {
        unit.findAll(Parameter.class).stream()
                .filter(parameter -> parameter.getParentNode()
                        .filter(CatchClause.class::isInstance).isEmpty())
                .forEach(parameter -> count(parameter.getNameAsString(), parameter.getType(), claimed));
        unit.findAll(VariableDeclarator.class).forEach(variable ->
                count(variable.getNameAsString(), variable.getType(), claimed));
        unit.findAll(TypePatternExpr.class).forEach(pattern ->
                count(pattern.getNameAsString(), pattern.getType(), claimed));
    }

    private static void count(final String name, final Type type, final Map<String, Integer> claimed) {
        if (!INITIALS.spell(name, type)) {
            return;
        }
        claimed.merge(name + "  (" + type.asString() + ")", 1, Integer::sum);
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
