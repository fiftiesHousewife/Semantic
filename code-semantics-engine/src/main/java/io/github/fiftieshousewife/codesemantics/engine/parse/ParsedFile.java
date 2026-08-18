package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.Objects;

/**
 * One file of a repository as the reading will use it: where it is, how long it is, and the names and prose
 * it declared — imports already sorted, so what remains is what this repository chose to say.
 */
public record ParsedFile(String scope, String path, int lines, List<NameOccurrence> occurrences,
                         ParseOutcome outcome) {

    public ParsedFile {
        Objects.requireNonNull(scope, "scope");
        Objects.requireNonNull(path, "path");
        occurrences = List.copyOf(occurrences);
    }

    public long occurrencesOf(final NameForm form) {
        return occurrences.stream().filter(occurrence -> occurrence.form() == form).count();
    }
}
