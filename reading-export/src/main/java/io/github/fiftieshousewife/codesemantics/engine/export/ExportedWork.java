package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

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
 * <p>{@code written} is what the changed files do to the declarations that stood before them, which
 * {@link ChangedCode} holds.
 *
 * <p>{@code inferred} is the word a published standard's own definition covers the measured shape with —
 * a change that only adds declarations is the thing the specification defines {@code feat} as. It is the
 * definition applied to a count, never a word mapped to another word, and where no definition covers the
 * shape there is no entry.
 *
 * @param stated   the classes the statement states for its own change
 * @param issues   the tracker's statements about the issues the statement references, empty where it
 *                 references none or no tracker is stated. It is left out of the document when empty
 *                 and read back as empty, so a round trip returns the object that was written
 * @param written  what the changed files add to and remove from the declarations at the base commit, absent
 *                 where the fetch step pinned no base tree
 * @param inferred the standard's word for the shape the counts have, absent where no definition covers it
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record ExportedWork(Stated stated,
                           @JsonSetter(nulls = Nulls.AS_EMPTY) List<Issue> issues,
                           ChangedCode written, Inferred inferred) {

    public ExportedWork {
        Objects.requireNonNull(stated, "stated");
        issues = List.copyOf(issues);
    }

    /** The work of a pull request whose base tree was not pinned, so only what it says is read. */
    public ExportedWork(final Stated stated, final List<Issue> issues) {
        this(stated, issues, null, null);
    }

    /** The work of a pull request read against its base, before any definition has been asked about it. */
    public ExportedWork(final Stated stated, final List<Issue> issues, final ChangedCode written) {
        this(stated, issues, written, null);
    }

    /** The same work with the word a definition covers its shape with. Nothing already read moves. */
    public ExportedWork withInferred(final Inferred covered) {
        return new ExportedWork(stated, issues, written, covered);
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

        /** No statement was fetched, so no line was read and no class is stated. */
        public static Stated noStatement() {
            return new Stated(0, 0, List.of());
        }
    }

    /**
     * The word a published standard's own definition covers a measured shape with.
     *
     * @param type       the token as the standard writes it
     * @param definition the publisher's own sentence, so the reader can check the word against the shape
     * @param shape      what was measured that the definition covers, as a clause completing
     *                   "it …" — {@code adds declarations and removes none}
     */
    public record Inferred(String type, String definition, String shape) {
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
