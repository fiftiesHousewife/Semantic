package org.fifties.housewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes;
import org.fifties.housewife.codesemantics.engine.theme.ThemeReading;

/**
 * One directory of source, parsed and read. This is where a caller of this library starts.
 *
 * <p>It takes the directory rather than finding one. Nothing here reads a system property, asks which tree
 * a test is running inside, or memoises across a JVM — a library that resolved its own input would be
 * unusable from a program that already knows what it wants read, and the diagnostics that do want those
 * things wrap this rather than the other way round.
 *
 * <p>The reading is computed once per instance and shared by every accessor, so asking for the themes after
 * the parse costs nothing twice. It is deterministic over an unchanged tree at a given seed, which is what
 * makes the sharing sound.
 */
public final class RepositoryReading {

    /** The seed the nulls are drawn with, so two runs over one tree agree rather than placing it differently. */
    public static final long SEED = 20260813L;

    private final Path root;
    private final long seed;

    private ParsedRepository parsed;
    private RepositoryThemes themes;

    private RepositoryReading(final Path root, final long seed) {
        this.root = Objects.requireNonNull(root, "root");
        this.seed = seed;
    }

    /** The tree at this path, read at the seed every report in this library uses. */
    public static RepositoryReading of(final Path root) {
        return new RepositoryReading(root, SEED);
    }

    /** The same, at a seed the caller chooses — two seeds are two draws of the null and not two readings. */
    public static RepositoryReading of(final Path root, final long seed) {
        return new RepositoryReading(root, seed);
    }

    public Path root() {
        return root;
    }

    public long seed() {
        return seed;
    }

    /** Every Java source set and the markdown beside it, filtered by whatever {@code .readingignore} states. */
    public static List<SourceScope> scopesUnder(final Path root) {
        return Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
    }

    public synchronized ParsedRepository parsed() {
        if (parsed == null) {
            parsed = ParsedRepository.of(root, scopesUnder(root));
        }
        return parsed;
    }

    public synchronized RepositoryThemes themes() {
        if (themes == null) {
            themes = ThemeReading.fromClasspath(seed).of(parsed());
        }
        return themes;
    }
}
