package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * The Java source directories of a working tree, one scope per {@code <module>/src/<sourceSet>/java}, named
 * by the path that found it. Anchoring on that path rather than on a file extension sweep is what keeps
 * generated output and build directories out of the reading without any list of directories to ignore: a
 * source set is where a build declares its sources are, and nothing else is claimed to be a scope.
 *
 * <p>A repository may still state that some of its own source is not part of what it is — vendored code, a
 * fixture corpus, a module kept for compatibility — and {@link StatedExclusions} is where it says so. Nothing
 * is excluded unless the tree under reading asks for it.
 */
public final class JavaSourceScopes {

    private static final String SOURCE_DIRECTORY = "java";
    private static final String SOURCE_SET_ROOT = "src";
    private static final String JAVA_SUFFIX = ".java";

    public List<SourceScope> under(final Path root) {
        final StatedExclusions excluded = StatedExclusions.statedUnder(root);
        return directories(root).stream()
                .filter(directory -> !excluded.excludes(root.relativize(directory)))
                .map(directory -> new SourceScope(root.relativize(directory).toString(),
                        filesIn(directory).stream()
                                .filter(file -> !excluded.excludes(root.relativize(file)))
                                .toList()))
                .filter(scope -> !scope.files().isEmpty())
                .toList();
    }

    private List<Path> directories(final Path root) {
        try (Stream<Path> tree = Files.walk(root)) {
            return tree.filter(Files::isDirectory)
                    .filter(JavaSourceScopes::isASourceSetsJavaDirectory)
                    .sorted()
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + root, e);
        }
    }

    private static boolean isASourceSetsJavaDirectory(final Path directory) {
        final int depth = directory.getNameCount();
        return depth > 2
                && SOURCE_DIRECTORY.equals(directory.getFileName().toString())
                && SOURCE_SET_ROOT.equals(directory.getName(depth - 3).toString());
    }

    private static List<Path> filesIn(final Path directory) {
        try (Stream<Path> tree = Files.walk(directory)) {
            return tree.filter(Files::isRegularFile)
                    .filter(file -> file.getFileName().toString().endsWith(JAVA_SUFFIX))
                    .sorted(Comparator.naturalOrder())
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + directory, e);
        }
    }
}
