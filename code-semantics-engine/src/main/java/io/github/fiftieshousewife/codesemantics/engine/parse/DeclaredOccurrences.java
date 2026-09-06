package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.RecordDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.expr.TypePatternExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithSimpleName;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.LabeledStmt;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.TypeParameter;

/**
 * The declarations one compilation unit holds, each under the form {@link DeclaredNameForms} reads it as.
 * Comments are the author's prose rather than declarations and are read by {@link JavaSource} beside this.
 */
final class DeclaredOccurrences {

    private final DeclaredTypeWords typeWords;
    private final DeclaredNameForms forms;
    private final EnclosingDeclarations enclosing = new EnclosingDeclarations();

    DeclaredOccurrences(final DeclaredTypeWords typeWords) {
        this.typeWords = typeWords;
        this.forms = new DeclaredNameForms(typeWords);
    }

    List<NameOccurrence> in(final CompilationUnit unit) {
        final List<NameOccurrence> occurrences = new ArrayList<>();
        declared(unit, TypeDeclaration.class, NameForm.TYPE, occurrences);
        // A method writes its return type beside its name, so `List<Foo> getFooList()` says `list` twice.
        // The initials rule is not asked of it: a method named for the whole of its type is not the pattern
        // that rule was measured on, and claiming one here would change what it means without measuring it.
        unit.findAll(MethodDeclaration.class).forEach(method ->
                add(method.getNameAsString(), forms.ofMethod(method), method, occurrences,
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
        unit.findAll(TypePatternExpr.class).forEach(pattern ->
                addNamed(pattern.getNameAsString(), pattern.getType(), NameForm.LOCAL, pattern,
                        occurrences));
        unit.findAll(LabeledStmt.class).forEach(labelled ->
                add(labelled.getLabel().asString(), NameForm.LABEL, labelled, occurrences));
        unit.getImports().forEach(imported ->
                add(imported.getNameAsString(), NameForm.IMPORT, imported, occurrences));
        return occurrences;
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
     * A declaration that writes its type beside its name. Where the name is the initials of that type's own
     * words it stands for the type rather than naming anything, and is recorded as what it is.
     */
    private void addNamed(final String name, final Type type, final NameForm form, final Node node,
                          final List<NameOccurrence> occurrences) {
        add(name, forms.of(name, type, form), node, occurrences, typeWords.of(type));
    }

    void add(final String text, final NameForm form, final Node node,
             final List<NameOccurrence> occurrences) {
        add(text, form, node, occurrences, List.of());
    }

    private void add(final String text, final NameForm form, final Node node,
                     final List<NameOccurrence> occurrences, final List<String> stated) {
        if (text.isBlank()) {
            return;
        }
        occurrences.add(new NameOccurrence(text, form, lineOf(node), 1.0, stated,
                enclosing.around(node)));
    }

    private static int lineOf(final Node node) {
        return Optional.of(node).flatMap(Node::getRange).map(range -> range.begin.line).orElse(1);
    }
}
