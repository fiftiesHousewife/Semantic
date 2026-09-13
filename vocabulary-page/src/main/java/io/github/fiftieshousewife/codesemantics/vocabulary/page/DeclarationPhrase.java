package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;

/**
 * Declaration counts as an English phrase: {@code 5 types, 41 methods and 22 fields}. A kind the change
 * does not touch is left out of the phrase, and a change touching no kind reads {@code nothing}.
 */
final class DeclarationPhrase {

    private DeclarationPhrase() {
    }

    static final String NOTHING = "nothing";

    static String of(final ExportedWork.Declarations declarations) {
        return joined(List.of(
                counted(declarations.types(), "type"),
                counted(declarations.methods(), "method"),
                counted(declarations.fields(), "field")));
    }

    private static String counted(final int count, final String kind) {
        return count == 0 ? "" : Counted.of(count, kind);
    }

    /** The Oxford-free list English writes: {@code a}, {@code a and b}, {@code a, b and c}. */
    private static String joined(final List<String> parts) {
        final List<String> written = parts.stream()
                .filter(part -> !part.isEmpty())
                .toList();
        if (written.isEmpty()) {
            return NOTHING;
        }
        if (written.size() == 1) {
            return written.getFirst();
        }
        return String.join(", ", written.subList(0, written.size() - 1)) + " and " + written.getLast();
    }
}
