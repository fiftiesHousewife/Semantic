package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * The test resource directories of a working tree, one scope per {@code <module>/src/test/resources}, named
 * by the path that found it — the same anchor {@link JavaSourceScopes} uses, because a source set is where a
 * build declares its files are. These directories hold the fixture corpus, whose file names are read and
 * whose contents never are; {@code META-INF} is left out here as it is in the reader, because the JAR File
 * Specification reserves it for the format's own metadata.
 */
public final class TestResourceScope {

    private static final String RESOURCES_DIRECTORY = "resources";
    private static final String TEST_SOURCE_SET = "test";
    private static final String SOURCE_SET_ROOT = "src";
    private static final String RESERVED_BY_THE_JAR_SPECIFICATION = "META-INF";

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

    private static List<Path> directories(final Path root) {
        try (Stream<Path> tree = Files.walk(root)) {
            return tree.filter(Files::isDirectory)
                    .filter(TestResourceScope::isATestResourcesDirectory)
                    .sorted()
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + root, e);
        }
    }

    private static boolean isATestResourcesDirectory(final Path directory) {
        final int depth = directory.getNameCount();
        return depth > 2
                && RESOURCES_DIRECTORY.equals(directory.getFileName().toString())
                && TEST_SOURCE_SET.equals(directory.getName(depth - 2).toString())
                && SOURCE_SET_ROOT.equals(directory.getName(depth - 3).toString());
    }

    private static List<Path> filesIn(final Path directory) {
        try (Stream<Path> tree = Files.walk(directory)) {
            return tree.filter(Files::isRegularFile)
                    .filter(file -> notReserved(directory.relativize(file)))
                    .sorted(Comparator.naturalOrder())
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + directory, e);
        }
    }

    private static boolean notReserved(final Path withinResources) {
        return Stream.iterate(0, index -> index + 1)
                .limit(withinResources.getNameCount())
                .noneMatch(index -> RESERVED_BY_THE_JAR_SPECIFICATION
                        .equals(withinResources.getName(index).toString()));
    }
}
