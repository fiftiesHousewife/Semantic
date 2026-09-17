package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;

import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;

/**
 * The methods a tree declares as tests, which is the methods carrying the annotation that says so.
 *
 * <p>The name is {@code Test}, which is what JUnit 4, JUnit Jupiter and TestNG each call the annotation
 * marking one test method. It is read as written, so a file naming it under its package —
 * {@code @org.junit.jupiter.api.Test} — is read the same as one importing it.
 *
 * <p>Nothing else is counted. Jupiter also runs a method annotated {@code ParameterizedTest},
 * {@code RepeatedTest}, {@code TestFactory} or {@code TestTemplate}, each of which carries Jupiter's own
 * {@code Testable} meta-annotation; resolving a meta-annotation needs the classpath, which this parse does
 * not have, and naming the four here would be a list of names rather than something a publisher states.
 */
public final class DeclaredTests {

    /** What each of the three frameworks calls the annotation on one test method. */
    private static final String TEST = "Test";

    private static final String JAVA_SUFFIX = ".java";

    private final JavaParser parser;

    private final EnclosingDeclarations enclosing = new EnclosingDeclarations();

    public DeclaredTests(final ParserConfiguration configuration) {
        this.parser = new JavaParser(configuration);
    }

    public static DeclaredTests newInstance() {
        return new DeclaredTests(new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21));
    }

    /** Every test method the Java files of these scopes declare, each pathed relative to the tree's root. */
    public List<Declaration> under(final Path root, final List<SourceScope> scopes) {
        return scopes.stream()
                .flatMap(scope -> scope.files().stream())
                .filter(file -> file.getFileName().toString().endsWith(JAVA_SUFFIX))
                .distinct()
                .sorted()
                .flatMap(file -> in(root.relativize(file).toString(), FileText.of(file)).stream())
                .toList();
    }

    /** The test methods one file declares, and none where the parser could make nothing of it. */
    public List<Declaration> in(final String path, final String source) {
        return parser.parse(source).getResult().stream()
                .flatMap(unit -> unit.findAll(MethodDeclaration.class).stream())
                .filter(DeclaredTests::annotatedAsATest)
                .map(method -> new Declaration(path, enclosing.around(method), DeclarationKind.METHOD,
                        method.getNameAsString()))
                .toList();
    }

    private static boolean annotatedAsATest(final MethodDeclaration method) {
        return method.getAnnotations().stream()
                .map(AnnotationExpr::getName)
                .anyMatch(name -> TEST.equals(name.getIdentifier()));
    }
}
