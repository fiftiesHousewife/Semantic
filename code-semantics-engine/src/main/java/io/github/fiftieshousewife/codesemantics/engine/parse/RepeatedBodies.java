package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;

import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;

/**
 * The method bodies a set of files writes more than once, and the statements those repeats carry.
 *
 * <p>Two bodies are the same where the parse prints them alike. The printing is JavaParser's own, so a
 * body wrapped across three lines and the same body on one read alike, and no rule about layout is stated
 * here. Nothing weaker than equality is admitted: a body differing by one identifier is a different body.
 *
 * <p>A body carrying no statement is not counted however often it is written. Two empty bodies repeat
 * nothing, and an abstract or interface method declares no body at all.
 *
 * <p>The count of methods and the count of statements are published together because neither alone says
 * what a repeat is worth: twelve repeated bodies of one statement and three of thirty-two are different
 * findings, and no threshold is stated here to tell them apart.
 */
public final class RepeatedBodies {

    private static final String JAVA_SUFFIX = ".java";

    private final JavaParser parser;

    private final EnclosingDeclarations enclosing = new EnclosingDeclarations();

    public RepeatedBodies(final ParserConfiguration configuration) {
        this.parser = new JavaParser(configuration);
    }

    public static RepeatedBodies newInstance() {
        return new RepeatedBodies(new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21));
    }

    /**
     * The methods repeating a body, and what those repeats carry.
     *
     * @param methods    every method whose body another method of this set also writes, in the order the
     *                   files were read, and empty where each body stands once
     * @param statements how many statements those methods carry together, which is what the repeats
     *                   amount to
     * @param largest    the statements the biggest repeated body carries, which is what separates a
     *                   copied algorithm from thirty accessors returning a field
     */
    public record Repeated(List<Declaration> methods, int statements, int largest) {

        public Repeated {
            methods = List.copyOf(methods);
        }
    }

    /** Every Java file of these scopes, read together, so a body copied between two of them is found. */
    public Repeated under(final Path root, final List<SourceScope> scopes) {
        final List<Written> written = new ArrayList<>();
        scopes.stream()
                .flatMap(scope -> scope.files().stream())
                .filter(file -> file.getFileName().toString().endsWith(JAVA_SUFFIX))
                .distinct()
                .sorted()
                .forEach(file -> written.addAll(bodiesIn(root.relativize(file).toString(),
                        contentOf(file))));
        return repeatedAmong(written);
    }

    /** The same over one file, which is where a body is most often copied. */
    public Repeated in(final String path, final String source) {
        return repeatedAmong(bodiesIn(path, source));
    }

    private List<Written> bodiesIn(final String path, final String source) {
        return parser.parse(source).getResult().stream()
                .flatMap(unit -> unit.findAll(CallableDeclaration.class).stream())
                .flatMap(method -> bodyOf(method).stream()
                        .map(body -> new Written(declarationOf(path, method), body,
                                MethodMetrics.of(method).statements())))
                .filter(body -> body.statements() > 0)
                .toList();
    }

    /** The body as the parse prints it, and nothing where the method declares none. */
    private static Optional<String> bodyOf(final CallableDeclaration<?> method) {
        return method.findFirst(BlockStmt.class)
                .filter(block -> block.getParentNode().filter(method::equals).isPresent())
                .map(BlockStmt::toString);
    }

    private Declaration declarationOf(final String path, final CallableDeclaration<?> method) {
        return new Declaration(path, enclosing.around(method), DeclarationKind.METHOD,
                method.getNameAsString());
    }

    private static Repeated repeatedAmong(final List<Written> written) {
        final Map<String, List<Written>> byBody = new LinkedHashMap<>();
        written.forEach(body -> byBody.computeIfAbsent(body.body(), text -> new ArrayList<>())
                .add(body));
        final List<Written> repeated = byBody.values().stream()
                .filter(sharing -> sharing.size() > 1)
                .flatMap(List::stream)
                .toList();
        return new Repeated(repeated.stream()
                .map(Written::declaration)
                .toList(),
                repeated.stream()
                        .mapToInt(Written::statements)
                        .sum(),
                repeated.stream()
                        .mapToInt(Written::statements)
                        .max()
                        .orElse(0));
    }

    /** One method's body as the parse prints it, with what the method is and how much it carries. */
    private record Written(Declaration declaration, String body, int statements) {
    }

    private static String contentOf(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT, "Failed to read %s", file), e);
        }
    }
}
