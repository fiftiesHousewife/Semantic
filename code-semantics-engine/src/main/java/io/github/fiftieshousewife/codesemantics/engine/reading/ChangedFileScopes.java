package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * The scopes of a directory holding one pull request's changed files rather than a whole working tree.
 *
 * <p>A tree's scopes are the places its build declares its sources are, and {@link MavenModuleScope}
 * follows the module chain from the root pom to find which directories are modules. A copy of changed
 * files carries no root pom and therefore no chain, so a pull request that changes only a module's
 * {@code pom.xml} — a dependency bump is nothing else — reads as empty.
 *
 * <p>Every file in such a copy is one the host stated the pull request changed, so there is no sweep to
 * guard against: a {@code pom.xml} standing here is a build file because Maven's own POM reference gives
 * that name to the file a project is declared in. The rule holds only for a copy, and a whole tree still
 * reads its poms off the chain its root pom states.
 */
public final class ChangedFileScopes {

    private static final String NAME = "modules";

    private static final String POM_FILE = "pom.xml";

    /**
     * The tree's own scopes, and the poms of the copy where its root states no chain to follow. A copy
     * whose root pom is present is read exactly as a tree is.
     */
    public List<SourceScope> under(final Path root) {
        final List<SourceScope> stated = RepositoryReading.scopesUnder(root);
        if (Files.isRegularFile(root.resolve(POM_FILE))) {
            return stated;
        }
        final List<Path> poms = pomsUnder(root);
        return poms.isEmpty() ? stated
                : Stream.concat(stated.stream(), Stream.of(new SourceScope(NAME, poms))).toList();
    }

    private static List<Path> pomsUnder(final Path root) {
        final StatedExclusions excluded = StatedExclusions.statedUnder(root);
        try (Stream<Path> tree = Files.walk(root)) {
            return tree.filter(Files::isRegularFile)
                    .filter(file -> POM_FILE.equals(file.getFileName().toString()))
                    .filter(file -> !excluded.excludes(root.relativize(file)))
                    .sorted()
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + root, e);
        }
    }
}
