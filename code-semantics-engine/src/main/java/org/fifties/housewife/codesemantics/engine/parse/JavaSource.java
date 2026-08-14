package org.fifties.housewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.RecordDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithSimpleName;
import com.github.javaparser.ast.type.TypeParameter;

/**
 * Reads one Java file into the names its author declared and the prose they wrote, and nothing else.
 *
 * <p>Every occurrence here is a <em>declaration</em> or a comment. A type mentioned in a signature, a method
 * invoked, a field read — none of those are collected, because none of them is a word this repository chose:
 * they are the vocabulary of whatever declared them, quoted. That single rule is what removes {@code String},
 * {@code List}, {@code assertThat} and the rest of the platform and framework surface from the reading
 * without naming any of them, and it is available only to a parse.
 *
 * <p>Error tolerance is a requirement and not a nicety, because the commits that most need reading are the
 * ones that do not compile. A file the parser had problems with keeps whatever it recovered and is reported
 * as unsound; only a file it could make nothing at all of reads as {@link ParsedSource#unreadable()}. Neither
 * throws, and neither is silently dropped.
 */
public final class JavaSource implements SourceReader {

    private final JavaParser parser;

    public JavaSource(final ParserConfiguration configuration) {
        this.parser = new JavaParser(configuration);
    }

    public static JavaSource newInstance() {
        return new JavaSource(new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21));
    }

    private static final String JAVA_SUFFIX = ".java";

    @Override
    public boolean reads(final Path file) {
        return file.getFileName().toString().endsWith(JAVA_SUFFIX);
    }

    @Override
    public ParsedSource read(final String source) {
        final ParseResult<CompilationUnit> result = parser.parse(source);
        return result.getResult()
                .map(unit -> occurrencesIn(unit, result.getProblems().isEmpty()))
                .orElseGet(ParsedSource::unreadable);
    }

    private static ParsedSource occurrencesIn(final CompilationUnit unit, final boolean sound) {
        final List<NameOccurrence> occurrences = new ArrayList<>();
        declared(unit, TypeDeclaration.class, NameForm.TYPE, occurrences);
        declared(unit, MethodDeclaration.class, NameForm.METHOD, occurrences);
        declared(unit, Parameter.class, NameForm.PARAMETER, occurrences);
        // Parameter covers a lambda's parameters as well as a method's, so neither needs a pass of its own.
        declared(unit, EnumConstantDeclaration.class, NameForm.CONSTANT, occurrences);
        declared(unit, TypeParameter.class, NameForm.TYPE_PARAMETER, occurrences);
        unit.findAll(RecordDeclaration.class).forEach(record ->
                record.getParameters().forEach(component ->
                        add(component.getNameAsString(), NameForm.CONSTANT, component, occurrences)));
        unit.findAll(FieldDeclaration.class).forEach(field ->
                field.getVariables().forEach(variable ->
                        add(variable.getNameAsString(), NameForm.FIELD, variable, occurrences)));
        unit.findAll(VariableDeclarationExpr.class).forEach(local ->
                local.getVariables().forEach(variable ->
                        add(variable.getNameAsString(), NameForm.LOCAL, variable, occurrences)));
        unit.findAll(com.github.javaparser.ast.expr.TypePatternExpr.class).forEach(pattern ->
                add(pattern.getNameAsString(), NameForm.LOCAL, pattern, occurrences));
        unit.findAll(com.github.javaparser.ast.stmt.LabeledStmt.class).forEach(labelled ->
                add(labelled.getLabel().asString(), NameForm.LABEL, labelled, occurrences));
        unit.getImports().forEach(imported ->
                add(imported.getNameAsString(), NameForm.IMPORT, imported, occurrences));
        unit.getAllComments().forEach(comment -> prose(comment, occurrences));
        return new ParsedSource(unit.getPackageDeclaration()
                .map(declaration -> declaration.getNameAsString()).orElse(""), occurrences, sound);
    }

    /**
     * A constructor is not collected as a method: its name is its type's name, already read at the type's own
     * declaration, and counting it again would make every class say its own name twice.
     */
    private static <T extends Node & NodeWithSimpleName<?>> void declared(
            final CompilationUnit unit, final Class<T> declaration, final NameForm form,
            final List<NameOccurrence> occurrences) {
        unit.findAll(declaration).stream()
                .filter(node -> !(node instanceof CallableDeclaration<?> callable) || callable.isMethodDeclaration())
                .forEach(node -> add(node.getNameAsString(), form, node, occurrences));
    }

    private static void prose(final Comment comment, final List<NameOccurrence> occurrences) {
        add(comment.getContent(), comment instanceof JavadocComment ? NameForm.JAVADOC : NameForm.COMMENT,
                comment, occurrences);
    }

    private static void add(final String text, final NameForm form, final Node node,
                            final List<NameOccurrence> occurrences) {
        if (text.isBlank()) {
            return;
        }
        occurrences.add(new NameOccurrence(text, form, lineOf(node)));
    }

    private static int lineOf(final Node node) {
        return Optional.of(node).flatMap(Node::getRange).map(range -> range.begin.line).orElse(1);
    }
}
