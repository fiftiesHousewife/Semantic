package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * How many Java files a tree holds that no scope reached, which is what tells a tree with nothing to say
 * from a tree laid out where {@link JavaSourceScopes} does not look.
 *
 * <p>A scope is {@code <module>/src/<sourceSet>/java}, and a repository laid out any other way yields no
 * scope: {@code handcoded/fpml-toolkit-java} holds 195 Java files under {@code src-core}, {@code src-fpml}
 * and {@code src-dsig}, and every reading of it was empty. An empty reading of a configuration repository
 * is the same document, and this count is the figure that separates them.
 *
 * <p><b>It votes nothing and nothing reads it as evidence.</b> It states coverage, which is the reading
 * recording that something was seen and not read. The anchor stays where it is, and the sweep here is what
 * says how much the anchor missed rather than what is read in its place.
 *
 * <p>What the tree states about itself in {@code .readingignore} is not counted: a file the repository
 * excluded was refused on the repository's own statement, which is a different outcome from one the layout
 * hid.
 */
public final class UnreadJavaFiles {

    private static final String JAVA_SUFFIX = ".java";

    /** How many Java files under this root none of these scopes holds, and none of which the tree excludes. */
    public int under(final Path root, final List<SourceScope> scopes) {
        final Set<Path> read = scopes.stream()
                .flatMap(scope -> scope.files().stream())
                .collect(Collectors.toUnmodifiableSet());
        final StatedExclusions excluded = StatedExclusions.statedUnder(root);
        return (int) javaFilesUnder(root)
                .filter(file -> !read.contains(file))
                .filter(file -> !excluded.excludes(root.relativize(file)))
                .count();
    }

    private static Stream<Path> javaFilesUnder(final Path root) {
        try (Stream<Path> tree = Files.walk(root)) {
            return tree.filter(Files::isRegularFile)
                    .filter(file -> file.getFileName().toString().endsWith(JAVA_SUFFIX))
                    .toList()
                    .stream();
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT, "Failed to walk %s", root), e);
        }
    }
}
