package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * One line parsed under the Conventional Commits grammar: a type of lowercase letters, an optional scope
 * in parentheses, an optional {@code !}, then the required colon, space and description.
 *
 * <p>The shape is the specification's own (v1.0.0, Specification items 1, 4 and 5) and parsing under it is
 * grammar; whether the parsed type is a word the standard states is the bundled vocabulary's question and
 * not this one's. A line of any other shape — a Jira key, a merge line, a sentence — yields nothing.
 *
 * @param type        the token before the colon, exactly as written
 * @param scope       the noun inside the parentheses, or empty where the line states none
 * @param breaking    whether the line appends {@code !} after the type or scope
 * @param description the summary after the colon and space
 */
public record ConventionalCommitLine(String type, String scope, boolean breaking, String description) {

    private static final Pattern LINE =
            Pattern.compile("^([a-z]+)(?:\\(([^()]+)\\))?(!)?: (\\S.*)$");

    /** The line under the grammar, or empty where the grammar does not parse it. */
    public static Optional<ConventionalCommitLine> parsed(final String line) {
        final Matcher matcher = LINE.matcher(line.strip());
        if (!matcher.matches()) {
            return Optional.empty();
        }
        return Optional.of(new ConventionalCommitLine(matcher.group(1),
                matcher.group(2) == null ? "" : matcher.group(2),
                matcher.group(3) != null,
                matcher.group(4)));
    }
}
