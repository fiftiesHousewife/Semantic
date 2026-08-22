package io.github.fiftieshousewife.codesemantics.engine.parse;

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
import com.github.javaparser.ast.nodeTypes.NodeWithName;
import com.github.javaparser.ast.nodeTypes.NodeWithSimpleName;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.type.Type;
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
 * as {@link ParseOutcome#RECOVERED}; only a file it could make nothing at all of reads as
 * {@link ParsedSource#unreadable()}. Neither throws, and neither is silently dropped.
 */
public final class JavaSource implements SourceReader {

    private final JavaParser parser;
    private final TypeInitials initials;
    private final DeclaredTypeWords typeWords;
    private final EnclosingDeclarations enclosing = new EnclosingDeclarations();
    private final JavadocProse javadoc = new JavadocProse();
    private final SpecifiedNames specified = new SpecifiedNames();
    private final io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords names =
            io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords.fromClasspath();

    public JavaSource(final ParserConfiguration configuration, final DeclaredTypeWords typeWords) {
        this.parser = new JavaParser(configuration);
        this.typeWords = typeWords;
        this.initials = new TypeInitials(typeWords);
    }

    public static JavaSource newInstance() {
        return new JavaSource(new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21),
                DeclaredTypeWords.fromClasspath());
    }

    private static final String JAVA_SUFFIX = ".java";

    @Override
    public boolean reads(final Path file) {
        return file.getFileName().toString().endsWith(JAVA_SUFFIX);
    }

    @Override
    public ParsedSource read(final Path file, final String source) {
        final ParseResult<CompilationUnit> result = parser.parse(source);
        return result.getResult()
                .map(unit -> occurrencesIn(unit,
                        result.getProblems().isEmpty() ? ParseOutcome.CLEAN : ParseOutcome.RECOVERED))
                .orElseGet(ParsedSource::unreadable);
    }

    private ParsedSource occurrencesIn(final CompilationUnit unit, final ParseOutcome outcome) {
        final List<NameOccurrence> occurrences = new ArrayList<>();
        declared(unit, TypeDeclaration.class, NameForm.TYPE, occurrences);
        // A method writes its return type beside its name, so `List<Foo> getFooList()` says `list` twice.
        // The initials rule is not asked of it: a method named for the whole of its type is not the pattern
        // that rule was measured on, and claiming one here would change what it means without measuring it.
        unit.findAll(MethodDeclaration.class).forEach(method ->
                add(method.getNameAsString(), formOf(method), method, occurrences,
                        typeWords.of(method.getType())));
        unit.findAll(CatchClause.class).forEach(caught ->
                add(caught.getParameter().getNameAsString(), NameForm.CAUGHT, caught, occurrences));
        // Parameter covers a lambda's parameters as well as a method's, so neither needs a pass of its own.
        // A catch clause's is read above instead: the language requires the type beside it, and the name
        // stands for that type. A record's components are Parameter nodes too and are read as constants
        // below, so reading them here as well would count each one twice.
        unit.findAll(Parameter.class).stream()
                .filter(parameter -> !isCaught(parameter) && !isRecordComponent(parameter))
                .forEach(parameter -> addNamed(parameter.getNameAsString(), parameter.getType(),
                        NameForm.PARAMETER, parameter, occurrences));
        declared(unit, EnumConstantDeclaration.class, NameForm.CONSTANT, occurrences);
        unit.findAll(TypeParameter.class).stream()
                .filter(parameter -> !spellsThePlaceholderConvention(parameter.getNameAsString()))
                .forEach(parameter -> add(parameter.getNameAsString(), NameForm.TYPE_PARAMETER, parameter,
                        occurrences));
        unit.findAll(RecordDeclaration.class).forEach(record ->
                record.getParameters().forEach(component -> addNamed(component.getNameAsString(),
                        component.getType(), NameForm.CONSTANT, component, occurrences)));
        unit.findAll(FieldDeclaration.class).forEach(field ->
                field.getVariables().forEach(variable -> addNamed(variable.getNameAsString(),
                        variable.getType(), NameForm.FIELD, variable, occurrences)));
        unit.findAll(VariableDeclarationExpr.class).forEach(local ->
                local.getVariables().forEach(variable -> addNamed(variable.getNameAsString(),
                        variable.getType(), NameForm.LOCAL, variable, occurrences)));
        unit.findAll(com.github.javaparser.ast.expr.TypePatternExpr.class).forEach(pattern ->
                addNamed(pattern.getNameAsString(), pattern.getType(), NameForm.LOCAL, pattern, occurrences));
        unit.findAll(com.github.javaparser.ast.stmt.LabeledStmt.class).forEach(labelled ->
                add(labelled.getLabel().asString(), NameForm.LABEL, labelled, occurrences));
        unit.getImports().forEach(imported ->
                add(imported.getNameAsString(), NameForm.IMPORT, imported, occurrences));
        unit.getAllComments().forEach(comment -> prose(comment, occurrences));
        return new ParsedSource(unit.getPackageDeclaration()
                .map(NodeWithName::getNameAsString).orElse(""), occurrences, outcome);
    }

    /**
     * Whether a type parameter is the placeholder the language's own convention spells, which is a single
     * letter. Oracle's Java tutorial states it — {@code E}, {@code K}, {@code N}, {@code T}, {@code V},
     * {@code S}, {@code U} — so the letter belongs to Java rather than to whoever wrote the file, exactly as
     * a catch clause's binding stands for the type the language requires beside it.
     *
     * <p>It is a rule about one declaration and not about length. A field named {@code a} is still a name its
     * author chose and is read; only a type parameter is claimed here, because only a type parameter has a
     * published convention saying the letter is not a word. A parameter written out — {@code REQUEST} — is a
     * name somebody chose and is read.
     */
    private static boolean spellsThePlaceholderConvention(final String name) {
        return name.codePointCount(0, name.length()) == 1;
    }

    private static boolean isCaught(final Parameter parameter) {
        return parameter.getParentNode().filter(CatchClause.class::isInstance).isPresent();
    }

    private static boolean isRecordComponent(final Parameter parameter) {
        return parameter.getParentNode().filter(RecordDeclaration.class::isInstance).isPresent();
    }

    /**
     * A constructor is not collected as a method: its name is its type's name, already read at the type's own
     * declaration, and counting it again would make every class say its own name twice.
     */
    private <T extends Node & NodeWithSimpleName<?>> void declared(
            final CompilationUnit unit, final Class<T> declaration, final NameForm form,
            final List<NameOccurrence> occurrences) {
        unit.findAll(declaration).stream()
                .filter(node -> !(node instanceof CallableDeclaration<?> callable) || callable.isMethodDeclaration())
                .forEach(node -> add(node.getNameAsString(), form, node, occurrences));
    }

    /**
     * A comment as the author's own sentences. A javadoc is read through {@link JavadocProse}, which leaves
     * out Javadoc's tag names and the names its inline tags point at; any other comment is the text it is.
     */
    private void prose(final Comment comment, final List<NameOccurrence> occurrences) {
        if (comment instanceof JavadocComment written) {
            add(javadoc.in(written), NameForm.JAVADOC, comment, occurrences);
            return;
        }
        add(comment.getContent(), NameForm.COMMENT, comment, occurrences);
    }

    /**
     * A declaration that writes its type beside its name. Where the name is the initials of that type's own
     * words it stands for the type rather than naming anything, and is recorded as what it is.
     */
    private void addNamed(final String name, final Type type, final NameForm form, final Node node,
                          final List<NameOccurrence> occurrences) {
        add(name, formOf(name, type, form), node, occurrences, typeWords.of(type));
    }

    /** What a declaration beside a type reads as: initials of it, the whole of it, a specified name, or its own. */
    private NameForm formOf(final String name, final Type type, final NameForm form) {
        if (initials.spell(name, type)) {
            return NameForm.ABBREVIATED_TYPE;
        }
        if (restatesTheWholeType(name, type)) {
            return NameForm.RESTATED_TYPE;
        }
        return specified.claims(name, form) ? NameForm.SPECIFIED : form;
    }

    /** Whether every word of the name is one its declared type writes, so the name is the type restated. */
    private boolean restatesTheWholeType(final String name, final Type type) {
        final List<String> stated = typeWords.of(type).stream()
                .map(word -> word.toLowerCase(java.util.Locale.ROOT))
                .toList();
        final List<String> written = names.of(name).words().stream()
                .map(word -> word.toLowerCase(java.util.Locale.ROOT))
                .toList();
        return !stated.isEmpty() && !written.isEmpty() && stated.containsAll(written);
    }

    /** Which form a method declaration is: the author's own name, or somebody else's requirement restated. */
    private NameForm formOf(final MethodDeclaration method) {
        if (method.isAnnotationPresent(Override.class)) {
            return NameForm.OVERRIDDEN;
        }
        if (restatesTheWholeType(method.getNameAsString(), method.getType())) {
            return NameForm.RESTATED_TYPE;
        }
        return specified.claims(method.getNameAsString(), NameForm.METHOD) ? NameForm.SPECIFIED
                : NameForm.METHOD;
    }

    private void add(final String text, final NameForm form, final Node node,
                     final List<NameOccurrence> occurrences) {
        add(text, form, node, occurrences, List.of());
    }

    private void add(final String text, final NameForm form, final Node node,
                     final List<NameOccurrence> occurrences, final List<String> typeWords) {
        if (text.isBlank()) {
            return;
        }
        occurrences.add(new NameOccurrence(text, form, lineOf(node), 1.0, typeWords,
                enclosing.around(node)));
    }

    private static int lineOf(final Node node) {
        return Optional.of(node).flatMap(Node::getRange).map(range -> range.begin.line).orElse(1);
    }
}
