package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.RecordDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.nodeTypes.NodeWithSimpleName;

import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;

/**
 * The declarations the Java files of a tree state — types, methods and fields, each with the declarations it
 * was written inside.
 *
 * <p>This is a parse of its own and not a second reading. {@link ParsedRepository} answers which words a
 * repository chose, and weighs, sets aside and re-forms names to do it; the question here is only which
 * declarations stand in a tree, so that two trees of the same changed files can be differenced. Nothing here
 * reaches the vocabulary, and no figure of a reading moves with it.
 *
 * <p>A file the parser can make nothing of states no declarations rather than failing the walk: the commits
 * that most need reading are the ones that do not compile.
 */
public final class DeclaredMembers {

    private static final String JAVA_SUFFIX = ".java";

    private final JavaParser parser;

    private final EnclosingDeclarations enclosing = new EnclosingDeclarations();

    public DeclaredMembers(final ParserConfiguration configuration) {
        this.parser = new JavaParser(configuration);
    }

    public static DeclaredMembers newInstance() {
        return new DeclaredMembers(new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21));
    }

    /** Every declaration the Java files of these scopes state, each pathed relative to the tree's root. */
    public List<Declaration> under(final Path root, final List<SourceScope> scopes) {
        return scopes.stream()
                .flatMap(scope -> scope.files().stream())
                .filter(file -> file.getFileName().toString().endsWith(JAVA_SUFFIX))
                .distinct()
                .sorted()
                .flatMap(file -> in(root.relativize(file).toString(), FileText.of(file)).stream())
                .toList();
    }

    /** The declarations one file states, and none where the parser could make nothing of it. */
    public List<Declaration> in(final String path, final String source) {
        final List<Declaration> declared = new ArrayList<>();
        parser.parse(source).getResult().ifPresent(unit -> {
            declared(path, unit, TypeDeclaration.class, DeclarationKind.TYPE, declared);
            declared(path, unit, CallableDeclaration.class, DeclarationKind.METHOD, declared);
            declared(path, unit, EnumConstantDeclaration.class, DeclarationKind.FIELD, declared);
            fields(path, unit, declared);
            components(path, unit, declared);
        });
        return List.copyOf(declared);
    }

    private <T extends Node & NodeWithSimpleName<?>> void declared(
            final String path, final CompilationUnit unit, final Class<T> declaration,
            final DeclarationKind kind, final List<Declaration> declared) {
        unit.findAll(declaration).forEach(node -> add(path, node, kind, node.getNameAsString(), declared));
    }

    /** A field declaration names one variable per name it declares, so each is its own declaration. */
    private void fields(final String path, final CompilationUnit unit, final List<Declaration> declared) {
        unit.findAll(FieldDeclaration.class).forEach(field -> field.getVariables().forEach(variable ->
                add(path, variable, DeclarationKind.FIELD, variable.getNameAsString(), declared)));
    }

    /** A record's components are its state, declared where the record is. */
    private void components(final String path, final CompilationUnit unit,
                            final List<Declaration> declared) {
        unit.findAll(RecordDeclaration.class).forEach(record -> record.getParameters().forEach(component ->
                add(path, component, DeclarationKind.FIELD, component.getNameAsString(), declared)));
    }

    private void add(final String path, final Node node, final DeclarationKind kind, final String name,
                     final List<Declaration> declared) {
        if (!name.isBlank()) {
            declared.add(new Declaration(path, enclosing.around(node), kind, name));
        }
    }
}
