package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The work a pull request does, classified against the published change standards.
 *
 * <p>{@code stated} is what the pull request says it is: every line of its statement offered to the
 * Conventional Commits grammar, and a parsed type kept only where the bundled standard states it. A
 * statement no standard's grammar parses yields no class rather than a guess, and the counts state that
 * outcome — {@code linesRead} were looked at, {@code linesParsed} fit the grammar, and {@code classes}
 * carries only the types the standard states.
 *
 * <p>{@code issues} is what the repository's own tracker says: the fetch step reads each issue the
 * statement references — of the project the repository's pom names in {@code issueManagement} — and pins
 * the tracker's answer, and the type here is the tracker's word verbatim, never mapped onto another
 * standard's vocabulary.
 *
 * @param stated the classes the statement states for its own change
 * @param issues the tracker's statements about the issues the statement references, empty where it
 *               references none or no tracker is stated
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record ExportedWork(Stated stated, List<Issue> issues) {

    public ExportedWork {
        Objects.requireNonNull(stated, "stated");
        issues = List.copyOf(issues);
    }

    /**
     * What the statement says its change is.
     *
     * @param linesRead   how many non-blank lines of the authored statement were offered to the grammar
     * @param linesParsed how many of them the grammar parsed, whatever their type
     * @param classes     the types the standard states, most-written first
     */
    public record Stated(int linesRead, int linesParsed, List<StatedClass> classes) {

        public Stated {
            classes = List.copyOf(classes);
        }
    }

    /**
     * One class the standard states, with how much of the statement states it.
     *
     * @param type   the token as the standard writes it
     * @param module which source defines it — {@code specification} or {@code angular-convention}, as
     *               the bundled resource's own column states
     * @param lines  how many statement lines state it
     */
    public record StatedClass(String type, String module, int lines) {
    }

    /**
     * One issue as the tracker states it.
     *
     * @param key  the issue key, as the statement writes it
     * @param type the issue type the tracker states, verbatim
     * @param url  the tracker's own page for the issue
     */
    public record Issue(String key, String type, String url) {
    }
}
