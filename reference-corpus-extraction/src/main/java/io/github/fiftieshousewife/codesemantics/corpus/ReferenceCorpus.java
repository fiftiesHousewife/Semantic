package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Objects;

import io.github.fiftieshousewife.codesemantics.clones.RepositoryManifest;

/**
 * The repositories the reading is read <em>against</em>, and where their clones are.
 *
 * <p>Distinct from the evaluation set in what it is for. An evaluation-set member supplies an answer the
 * reading is scored on; a corpus member supplies a denominator — how densely working Java writes a word,
 * so that a word this repository writes more densely than working Java does ranks above one it does not.
 * Nothing here is scored and nothing here states a subject.
 *
 * <p>The manifest is named rather than fixed. Ten repositories are a small sample, and whether a word sank
 * because every repository writes it or because one drawn repository happened to be about it is answered by
 * reading a second draw, which needs no more than a second file.
 */
public final class ReferenceCorpus {

    /** The uniform draw, which is what a run reads where it names no manifest of its own. */
    public static final String UNIFORM_DRAW = "/reference-corpus.tsv";
    /** The draw with a fifty-star floor, and the draw of repositories that publish an artefact. */
    public static final String STARRED_DRAW = "/reference-corpus-starred.tsv";
    public static final String PUBLISHED_DRAW = "/reference-corpus-published.tsv";

    private static final String MANIFEST_PROPERTY = "cs.corpus.manifest";
    private static final String DIRECTORY_PROPERTY = "cs.corpus.dir";

    private ReferenceCorpus() {
    }

    /** The manifest the run names, or the uniform draw this module bundles where the run names none. */
    public static RepositoryManifest manifest() {
        final String named = System.getProperty(MANIFEST_PROPERTY, "");
        if (named.isBlank()) {
            return drawn(UNIFORM_DRAW);
        }
        return RepositoryManifest.at(Path.of(named));
    }

    /** One of the draws this module records, read from the classpath by name. */
    public static RepositoryManifest drawn(final String draw) {
        final InputStream stream = Objects.requireNonNull(
                ReferenceCorpus.class.getResourceAsStream(draw), draw);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            return RepositoryManifest.of(reader.lines());
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + draw, e);
        }
    }

    /**
     * Where the clones are, or nothing where the caller has not said. A corpus run without a corpus is not a
     * run against an empty one: an empty denominator demotes nothing and looks exactly like a reference that
     * found nothing to demote.
     */
    public static Path directory() {
        final String supplied = System.getProperty(DIRECTORY_PROPERTY, "");
        if (supplied.isBlank()) {
            throw new IllegalStateException("No " + DIRECTORY_PROPERTY
                    + ". A corpus run reads clones the caller has made; point it at the directory holding them.");
        }
        return Path.of(supplied).toAbsolutePath().normalize();
    }
}
