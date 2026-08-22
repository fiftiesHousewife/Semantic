package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;

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

    private static final String MANIFEST_PROPERTY = "cs.corpus.manifest";
    private static final String DIRECTORY_PROPERTY = "cs.corpus.dir";

    private ReferenceCorpus() {
    }

    /** The manifest the run names, or the draw this repository bundles where the run names none. */
    public static RepositoryManifest manifest() {
        final String named = System.getProperty(MANIFEST_PROPERTY, "");
        if (named.isBlank()) {
            return RepositoryManifest.bundledCorpus();
        }
        return RepositoryManifest.at(Path.of(named));
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
