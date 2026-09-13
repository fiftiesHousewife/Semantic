package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.Arrays;
import java.util.Locale;

/**
 * What a scope holds, read from the position the build states it at: {@code <module>/src/<set>/<directory>}
 * in the layout Maven states and Gradle's Java plugin follows, and the scope's own name where the layout
 * states none.
 *
 * <p>It is a position in the build's own layout and never a list of directory names. A repository that
 * puts its tests somewhere else states so by where its build looks for them, and that is what is read.
 */
public enum SourceKind {

    /** A source set the build publishes — what the repository is, as anyone else receives it. */
    PRODUCTION("production"),

    /** A source set that checks the published ones, holding source. */
    TESTS("tests"),

    /** A source set that checks the published ones, holding resources — the fixture corpus. */
    FIXTURES("fixtures"),

    /** The repository's own prose. */
    DOCUMENTATION("documentation"),

    /** The files the build itself is declared in. */
    BUILD("build"),

    /** A scope the layout places nowhere above. */
    OTHER("other");

    private static final String RESOURCES = "resources";

    private static final String DOCUMENTATION_SCOPE = "documentation";

    private static final String MODULE_SCOPE = "modules";

    private final String published;

    SourceKind(final String published) {
        this.published = published;
    }

    /** The word the export writes for it. */
    public String published() {
        return published;
    }

    /** The kind the named scope holds. */
    public static SourceKind of(final String scope) {
        if (DOCUMENTATION_SCOPE.equals(scope)) {
            return DOCUMENTATION;
        }
        if (MODULE_SCOPE.equals(scope)) {
            return BUILD;
        }
        if (new PublishedSourceSets().publishes(scope)) {
            return PRODUCTION;
        }
        if (PublishedSourceSets.sourceSetOf(scope).equals(scope)) {
            return OTHER;
        }
        return scope.endsWith("/" + RESOURCES) ? FIXTURES : TESTS;
    }

    /** The kind the export's own word names, for a consumer reading a published figure back. */
    public static SourceKind named(final String word) {
        return Arrays.stream(values())
                .filter(kind -> kind.published.equals(word.toLowerCase(Locale.ROOT)))
                .findFirst()
                .orElse(OTHER);
    }
}
