package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

/**
 * What a pull request's changed files write, as declarations: its tree at the head commit read against
 * the same files at the base commit, both pinned by the fetch step.
 *
 * <p>It is the parse's answer and not a standard's — a declaration added is a fact of the text — so no
 * change class is named from it, and a renamed declaration reads as one removed and one added.
 *
 * @param filesRead    how many files of the pull request the reading's own scopes reach
 * @param filesAdded   how many of those files stand at the head and not at the base
 * @param added        the declarations standing at the head that did not stand at the base
 * @param removed      the declarations standing at the base that do not stand at the head
 * @param kept         how many of the head's declarations stood at the base under the same name in the
 *                     same enclosing declarations
 * @param typesAdded   every type the change adds, named and pathed, and empty where it adds none
 * @param typesRemoved every type the change removes, named and pathed, and empty where it removes none
 * @param filesByKind  how many of the files the pull request changed are of each kind, accounting for
 *                     all of them: the kinds the build's own layout states, and {@code other} for a file
 *                     it declares nowhere — a changelog, a licence
 * @param atHead       what the changed files measure as the pull request leaves them
 * @param atBase       what the same files measured as it found them
 * @param typesAddedWithoutATest the types it adds to what the build publishes for which it adds no test
 *                     of the name Surefire would run, each with the name such a test would carry — which
 *                     says no test arrived with them, never that nothing covers them
 */
public record ChangedCode(int filesRead, int filesAdded, Declarations added, Declarations removed,
                          int kept, List<NamedDeclaration> typesAdded,
                          List<NamedDeclaration> typesRemoved, List<KindFiles> filesByKind,
                          MeasuredCode atHead, MeasuredCode atBase,
                          List<TypeWithoutATest> typesAddedWithoutATest) {

    public ChangedCode {
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
     * One type the change adds to what the build publishes with no test of its own name, and what such a
     * test would be called.
     *
     * @param path the file, relative to the pull request's own directory
     * @param name the name under the declarations it sits inside
     * @param test the class name the first of Surefire's default patterns gives for a test of it, and
     *             empty where that pattern would not read the name back as a test of this type
     */
    public record TypeWithoutATest(String path, String name, String test) {
    }
}
