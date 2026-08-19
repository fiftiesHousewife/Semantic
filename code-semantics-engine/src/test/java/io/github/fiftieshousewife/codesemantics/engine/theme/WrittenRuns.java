package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import io.github.fiftieshousewife.codesemantics.engine.parse.DeclarationWords;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The runs of words a repository wrote, as the two populations a reach census counts against: each name on
 * its own, and each declaration as a whole.
 */
final class WrittenRuns {

    private final IdentifierWords identifiers;
    private final DeclarationWords declarations;

    WrittenRuns(final IdentifierWords identifiers, final DeclarationWords declarations) {
        this.identifiers = identifiers;
        this.declarations = declarations;
    }

    static WrittenRuns fromClasspath() {
        return new WrittenRuns(IdentifierWords.fromClasspath(), DeclarationWords.fromClasspath());
    }

    /** The words of every name written in one of these positions, each name read on its own. */
    List<List<String>> ofNames(final ParsedRepository parsed, final Predicate<NameForm> wanted) {
        return distinct(parsed, wanted, occurrence -> identifiers.of(occurrence.text()).words());
    }

    /** The words of every declaration, its enclosing names first and its own name last. */
    List<List<String>> ofDeclarations(final ParsedRepository parsed) {
        return distinct(parsed, form -> !form.isProse(), declarations::of);
    }

    private static List<List<String>> distinct(final ParsedRepository parsed,
                                              final Predicate<NameForm> wanted,
                                              final Function<NameOccurrence, List<String>> words) {
        return parsed.files().stream()
                .flatMap(file -> file.occurrences().stream())
                .filter(occurrence -> wanted.test(occurrence.form()))
                .map(words)
                .filter(run -> !run.isEmpty())
                .distinct()
                .toList();
    }
}
