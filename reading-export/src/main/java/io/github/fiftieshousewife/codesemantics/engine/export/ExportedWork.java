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
 * <p>{@code written} is what the changed files do to the declarations that stood before them: the pull
 * request's own tree read against the same files at its base commit, both pinned by the fetch step. It is
 * the parse's answer and not a standard's — a declaration added is a fact of the text — so no change class
 * is named from it, and a renamed declaration reads as one removed and one added.
 *
 * <p>{@code inferred} is the word a published standard's own definition covers the measured shape with —
 * a change that only adds declarations is the thing the specification defines {@code feat} as. It is the
 * definition applied to a count, never a word mapped to another word, and where no definition covers the
 * shape there is no entry.
 *
 * @param stated   the classes the statement states for its own change
 * @param issues   the tracker's statements about the issues the statement references, empty where it
 *                 references none or no tracker is stated
 * @param written  what the changed files add to and remove from the declarations at the base commit, absent
 *                 where the fetch step pinned no base tree
 * @param inferred the standard's word for the shape the counts have, absent where no definition covers it
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record ExportedWork(Stated stated, List<Issue> issues, Written written, Inferred inferred) {

    public ExportedWork {
        Objects.requireNonNull(stated, "stated");
        issues = List.copyOf(issues);
    }

    /** The work of a pull request whose base tree was not pinned, so only what it says is read. */
    public ExportedWork(final Stated stated, final List<Issue> issues) {
        this(stated, issues, null, null);
    }

    /** The work of a pull request read against its base, before any definition has been asked about it. */
    public ExportedWork(final Stated stated, final List<Issue> issues, final Written written) {
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
     * What the changed files write, as declarations: the pull request's tree at its head read against the
     * same files at its base.
     *
     * @param filesRead    how many files of the pull request the reading's own scopes reach
     * @param filesAdded   how many of those files stand at the head and not at the base
     * @param added        the declarations standing at the head that did not stand at the base
     * @param removed      the declarations standing at the base that do not stand at the head
     * @param kept         how many of the head's declarations stood at the base under the same name in the
     *                     same enclosing declarations
     * @param typesAdded   every type the change adds, named and pathed, and empty where it adds none
     * @param typesRemoved every type the change removes, named and pathed, and empty where it removes none
     * @param filesUnread  how many of the files the pull request changed no scope reaches, so that
     *                     {@code filesRead} and this account for every one of them. A changelog sits in
     *                     no source set, no documentation directory and on no module chain, and is
     *                     changed without being read. The tree's own {@code .readingignore} travels with
     *                     the copy and is counted as neither
     * @param filesByKind  how many of the files read are of each kind the build's own layout states,
     *                     summing to {@code filesRead}
     * @param atHead       what the changed files measure as the pull request leaves them
     * @param atBase       what the same files measured as it found them
     * @param typesAddedWithoutATest the types it adds to what the build publishes for which it adds no
     *                     test of the name Surefire would run — which says no test arrived with them,
     *                     never that nothing covers them
     */
    public record Written(int filesRead, int filesUnread, int filesAdded, Declarations added,
                          Declarations removed, int kept, List<NamedDeclaration> typesAdded,
                          List<NamedDeclaration> typesRemoved, List<KindFiles> filesByKind,
                          MeasuredCode atHead, MeasuredCode atBase,
                          List<NamedDeclaration> typesAddedWithoutATest) {

        public Written {
            Objects.requireNonNull(added, "added");
            Objects.requireNonNull(removed, "removed");
            Objects.requireNonNull(atHead, "atHead");
            Objects.requireNonNull(atBase, "atBase");
            typesAdded = List.copyOf(typesAdded);
            typesRemoved = List.copyOf(typesRemoved);
            filesByKind = List.copyOf(filesByKind);
            typesAddedWithoutATest = List.copyOf(typesAddedWithoutATest);
        }

        /** Whether every file the reading covers is of one of these kinds. */
        public boolean everyFileAmong(final List<String> kinds) {
            return !filesByKind.isEmpty() && filesByKind.stream()
                    .allMatch(kind -> kinds.contains(kind.kind()));
        }
    }

    /**
     * Declarations counted by what they are in the syntax. A zero is a count and not an abstention: the
     * parse read the files and found none of that kind changed.
     *
     * @param types   classes, interfaces, enums, records and annotations
     * @param methods methods and constructors
     * @param fields  fields, enum constants and record components
     */
    public record Declarations(int types, int methods, int fields) {

        public int total() {
            return types + methods + fields;
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
     * How many of a change's files are of one kind, as the build's own layout states it.
     *
     * @param kind  {@code production}, {@code tests}, {@code fixtures}, {@code documentation} or
     *              {@code build}
     * @param files how many of the files read are of that kind
     */
    public record KindFiles(String kind, int files) {
    }

    /**
     * One declaration this change states, and the file it stands in.
     *
     * @param path the file, relative to the pull request's own directory
     * @param name the name under the declarations it sits inside
     */
    public record NamedDeclaration(String path, String name) {
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
