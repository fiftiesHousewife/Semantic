package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

/**
 * The work a pull request does, classified against the published change standards.
 *
 * <p>{@code stated} is what the pull request says it is: every line of its statement offered to the
 * Conventional Commits grammar, and a parsed type kept only where the bundled standard states it. A
 * statement no standard's grammar parses yields no class rather than a guess, and the counts state that
 * outcome — {@code linesRead} were looked at, {@code linesParsed} fit the grammar, and {@code classes}
 * carries only the types the standard states.
 *
 * @param stated the classes the statement states for its own change
 */
public record ExportedWork(Stated stated) {

    public ExportedWork {
        Objects.requireNonNull(stated, "stated");
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
}
