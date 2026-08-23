package io.github.fiftieshousewife.codesemantics.clones;

import java.util.List;

/**
 * The paths a reading opens, as git sparse-checkout patterns.
 *
 * <p>A clone fetched with these carries every file the reading walks and nothing else. Most of a repository
 * is images, archives and compiled output that no reading opens, and on a slow connection those bytes are
 * the whole of the wait.
 *
 * <p><b>These must match what the source scopes walk.</b> Java source, prose, Maven modules, the file names
 * of a test fixture corpus, and the stated exclusions a tree carries at its root.
 * {@code ReadPathsCoverEveryScopeTest} builds a tree of each and fails where a scope reads something no
 * pattern here keeps.
 */
public final class ReadPaths {

    private static final List<String> PATTERNS = List.of(
            "/**/*.java",
            "/**/*.md",
            "/**/*.adoc",
            "/**/pom.xml",
            "/.readingignore",
            "/**/src/test/resources/**");

    private ReadPaths() {
    }

    /** The patterns, in the order git is given them. */
    public static List<String> patterns() {
        return PATTERNS;
    }
}
