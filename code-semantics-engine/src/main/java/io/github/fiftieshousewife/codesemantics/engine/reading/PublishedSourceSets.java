package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Whether a scope is a source set the build publishes — {@code src/main/java} in the layout Maven states and
 * Gradle's Java plugin follows, which is the same layout {@link JavaSourceScopes} finds a scope by at all.
 *
 * <p>It settles one thing: whose dependencies are read. An import names an artefact somebody chose, and in a
 * published source set that artefact is part of what the thing is built out of. In a test source set it is
 * the toolchain the thing is checked with — a test runner, an assertion library, a serialiser used to write
 * a report — and a repository is not about the tools that test it.
 *
 * <p>It is a position in the build's own layout and not a list of libraries, which is the same kind of rule
 * as reading a declaration rather than a use. A name is set aside for where it stands, never for what it is.
 */
public final class PublishedSourceSets {

    private static final String PUBLISHED = "main";

    private static final String SOURCE_SET_ROOT = "src";

    private static final Pattern SEPARATOR = Pattern.compile("/");

    public boolean publishes(final String scope) {
        return PUBLISHED.equals(sourceSetOf(scope));
    }

    /**
     * The rung after {@code src} in {@code <module>/src/<set>/java}, or the scope's own name where the layout
     * states none — a scope that is not a source set names itself, and nothing is published from it.
     */
    private static String sourceSetOf(final String scope) {
        final List<String> rungs = SEPARATOR.splitAsStream(scope).toList();
        return IntStream.range(0, Math.max(rungs.size() - 1, 0))
                .filter(rung -> SOURCE_SET_ROOT.equals(rungs.get(rung)))
                .mapToObj(rung -> rungs.get(rung + 1))
                .findFirst()
                .orElse(scope);
    }
}
