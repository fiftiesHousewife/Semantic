package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.Locale;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.type.Type;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * Which {@link NameForm} a declaration reads as, given the name its author wrote and the type beside it.
 *
 * <p>A name that is the initials of its declared type's words, or the whole of them restated, stands for
 * the type rather than naming anything; a name a specification requires is the specification's word rather
 * than the author's; a method overriding another restates its contract. Each is recorded as what it is,
 * and only a name none of those rules claim reads under its own declaration's form.
 */
final class DeclaredNameForms {

    private final TypeInitials initials;
    private final DeclaredTypeWords typeWords;
    private final SpecifiedNames specified = new SpecifiedNames();
    private final IdentifierWords names = IdentifierWords.fromClasspath();

    DeclaredNameForms(final DeclaredTypeWords typeWords) {
        this.typeWords = typeWords;
        this.initials = new TypeInitials(typeWords);
    }

    /** What a declaration beside a type reads as: initials of it, the whole of it, a specified name, or its own. */
    NameForm of(final String name, final Type type, final NameForm form) {
        if (initials.spell(name, type)) {
            return NameForm.ABBREVIATED_TYPE;
        }
        if (restatesTheWholeType(name, type)) {
            return NameForm.RESTATED_TYPE;
        }
        return specified.claims(name, form) ? NameForm.SPECIFIED : form;
    }

    /** Which form a method declaration is: the author's own name, or somebody else's requirement restated. */
    NameForm ofMethod(final MethodDeclaration method) {
        if (method.isAnnotationPresent(Override.class)) {
            return NameForm.OVERRIDDEN;
        }
        if (restatesTheWholeType(method.getNameAsString(), method.getType())) {
            return NameForm.RESTATED_TYPE;
        }
        return specified.claims(method.getNameAsString(), NameForm.METHOD) ? NameForm.SPECIFIED
                : NameForm.METHOD;
    }

    /** Whether every word of the name is one its declared type writes, so the name is the type restated. */
    private boolean restatesTheWholeType(final String name, final Type type) {
        final List<String> stated = typeWords.of(type).stream()
                .map(word -> word.toLowerCase(Locale.ROOT))
                .toList();
        final List<String> written = names.of(name).words().stream()
                .map(word -> word.toLowerCase(Locale.ROOT))
                .toList();
        return !stated.isEmpty() && !written.isEmpty() && stated.containsAll(written);
    }
}
