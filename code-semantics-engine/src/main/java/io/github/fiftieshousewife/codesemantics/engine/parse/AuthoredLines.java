package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The lines of a statement its author wrote, with the lines the host's own template supplied left out.
 *
 * <p>A pull request description opens as a copy of the repository's template, and a line the author left
 * untouched is the host's prose, not a statement about the change — reading it would find every pull
 * request of the repository to be about the template. The template is the repository's own published file
 * at a pinned commit, so the subtraction is cited to it: a line is dropped only where the template states
 * that exact line, and every line the author wrote or edited stays.
 *
 * <p>Lines are compared trimmed, because a template line survives the copy with its indentation moved.
 */
public final class AuthoredLines {

    private AuthoredLines() {
    }

    /** The statement without the lines the template states. Blank lines stay; nothing reads them. */
    public static String of(final String statement, final String template) {
        final Set<String> supplied = Arrays.stream(template.split("\n", -1))
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .collect(Collectors.toUnmodifiableSet());
        return Arrays.stream(statement.split("\n", -1))
                .filter(line -> !supplied.contains(line.trim()))
                .collect(Collectors.joining("\n"));
    }
}
