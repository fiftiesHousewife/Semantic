package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Any list of pinned repositories, read from a named file rather than from the classpath.
 *
 * <p>Named rather than bundled so that one sample can be exchanged for another without a rebuild: a
 * reference drawn from ten repositories is a denominator, and whether ten is enough is answered by reading a
 * second draw and comparing, not by arguing about it.
 *
 * <p>Columns beyond the fourth are the manifest's own business and are ignored here. A row stating fewer than
 * four fails, because a repository with no commit named is a moving target.
 */
public final class RepositoryManifest {

    private static final String BUNDLED_CORPUS = "/reference-corpus.tsv";
    private static final String COMMENT = "#";
    private static final String COLUMN = "\t";
    private static final int PINNED_COLUMNS = 4;

    private final List<PinnedRepository> repositories;

    private RepositoryManifest(final List<PinnedRepository> repositories) {
        this.repositories = List.copyOf(repositories);
    }

    /** The manifest the named file states. */
    public static RepositoryManifest at(final Path manifest) {
        try (Stream<String> lines = Files.lines(manifest, StandardCharsets.UTF_8)) {
            return of(lines);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read the repository manifest " + manifest, e);
        }
    }

    /**
     * The reference corpus this repository bundles: the draw as it was recorded, before anything was read.
     * A run that names no manifest reads this one, so the ordinary case states no path and a perturbation
     * states one.
     */
    public static RepositoryManifest bundledCorpus() {
        final InputStream stream = Objects.requireNonNull(
                RepositoryManifest.class.getResourceAsStream(BUNDLED_CORPUS), BUNDLED_CORPUS);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            return of(reader.lines());
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + BUNDLED_CORPUS, e);
        }
    }

    private static RepositoryManifest of(final Stream<String> lines) {
        return new RepositoryManifest(lines.filter(RepositoryManifest::isRow)
                .map(RepositoryManifest::repository)
                .toList());
    }

    public List<PinnedRepository> repositories() {
        return repositories;
    }

    static boolean isRow(final String line) {
        return !line.isBlank() && !line.startsWith(COMMENT);
    }

    static PinnedRepository repository(final String line) {
        final String[] fields = line.split(COLUMN, -1);
        if (fields.length < PINNED_COLUMNS) {
            throw new IllegalStateException("A row of a repository manifest states " + fields.length
                    + " columns where cloning needs " + PINNED_COLUMNS
                    + " — name, origin, sha, licence: " + line);
        }
        return new PinnedRepository(fields[0], fields[1], fields[2], fields[3]);
    }
}
