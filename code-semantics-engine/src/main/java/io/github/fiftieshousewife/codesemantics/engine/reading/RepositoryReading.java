package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.theme.ThemeReading;

import lombok.extern.slf4j.Slf4j;

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
 *
 * <p><b>It takes minutes on a large tree and says so.</b> Each stage logs what it is about to do and what it
 * found at {@code INFO} on this class's logger, because a caller watching four silent minutes cannot tell a
 * slow parse from a hung one. A consumer wanting silence turns the logger down; one wanting more turns it
 * up, and nothing here prints to a stream nobody can redirect.
 */
@Slf4j
public final class RepositoryReading {

    /** The seed the nulls are drawn with, so two runs over one tree agree rather than placing it differently. */
    public static final long SEED = 20260813L;

    private final Path root;
    private final long seed;

    private ParsedRepository parsed;
    private RepositoryLegibility legibility;
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
        return Stream.of(new JavaSourceScopes().under(root), new DocumentationScope().under(root),
                new MavenModuleScope().under(root))
                .flatMap(List::stream)
                .toList();
    }

    public synchronized ParsedRepository parsed() {
        if (parsed == null) {
            final List<SourceScope> scopes = scopesUnder(root);
            log.info("Parsing {} — {} source sets", root, scopes.size());
            final long started = System.nanoTime();
            parsed = ParsedRepository.of(root, scopes);
            log.info("Parsed {} in {}s", root, seconds(started));
        }
        return parsed;
    }

    public synchronized RepositoryLegibility legibility() {
        if (legibility == null) {
            log.info("Citing the words of {}", root);
            final long started = System.nanoTime();
            legibility = LegibilityReading.fromClasspath().of(parsed());
            log.info("Cited {} in {}s", root, seconds(started));
        }
        return legibility;
    }

    public synchronized RepositoryThemes themes() {
        if (themes == null) {
            log.info("Reading subjects over {} — this is the slow stage, and it resamples 999 times", root);
            final long started = System.nanoTime();
            themes = ThemeReading.fromClasspath(seed).of(parsed());
            log.info("Read {} topics over {} files in {}s", themes.rankings().size(),
                    themes.files().size(), seconds(started));
        }
        return themes;
    }

    /** Wall clock, because a caller watching a long stage wants the figure a stopwatch would give. */
    private static String seconds(final long startedAt) {
        return String.format(java.util.Locale.ROOT, "%.1f", (System.nanoTime() - startedAt) / 1e9);
    }
}
