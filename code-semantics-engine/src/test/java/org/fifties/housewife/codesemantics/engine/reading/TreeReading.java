package org.fifties.housewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes;
import org.fifties.housewife.codesemantics.engine.theme.ThemeReading;

/**
 * The parse and the topical reading of one working tree, computed once per JVM and shared.
 *
 * <p>Sound only because the reading is deterministic over an unchanged tree. The memo is keyed on the
 * resolved root, so each member of an evaluation-set run gets its own entry, and where
 * {@code -Dcs.clone.dir} is unset the host tree and the clone resolve to one path and one reading.
 *
 * <p>The seed lives here rather than in each caller, so there is one copy to keep in step.
 */
public final class TreeReading {

    /** The seed the null is drawn with, so two runs of one tree agree rather than placing it differently. */
    public static final long SEED = 20260813L;

    private static final Map<Path, ParsedRepository> PARSED = new ConcurrentHashMap<>();
    private static final Map<Path, RepositoryThemes> THEMES = new ConcurrentHashMap<>();

    private final Path root;

    private TreeReading(final Path root) {
        this.root = root;
    }

    /** The tree {@code -Dcs.clone.dir} names, or the one the test is running inside where it does not. */
    public static TreeReading ofTheCloneUnderReading() {
        return new TreeReading(new CloneUnderReading().root());
    }

    /**
     * The tree the test is running inside, whatever {@code -Dcs.clone.dir} says. A claim about one named
     * repository has to be checked against that repository and not against whichever clone was passed in.
     */
    public static TreeReading ofTheHostTree() {
        return new TreeReading(new HostTree().root());
    }

    public Path root() {
        return root;
    }

    /** Every Java source set and the markdown beside it, filtered by whatever {@code .readingignore} states. */
    public static List<SourceScope> scopesUnder(final Path root) {
        return Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
    }

    public ParsedRepository parsed() {
        return PARSED.computeIfAbsent(root, tree -> ParsedRepository.of(tree, scopesUnder(tree)));
    }

    public RepositoryThemes themes() {
        return THEMES.computeIfAbsent(root, tree -> ThemeReading.fromClasspath(SEED).of(parsed()));
    }
}
