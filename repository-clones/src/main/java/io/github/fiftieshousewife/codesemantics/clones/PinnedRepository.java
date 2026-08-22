package io.github.fiftieshousewife.codesemantics.clones;

import java.nio.file.Path;

/**
 * A repository at a named commit, with the licence verified at that commit rather than at its head.
 *
 * <p>These four columns are what every manifest of repositories states, whatever else it states beside them.
 * The evaluation set adds the subject area and who stated it; a reference corpus adds the rank it was drawn
 * at. Cloning needs none of that, so cloning reads only these.
 */
public record PinnedRepository(String name, String origin, String sha, String licence, long rank) {

    /** A repository named without a rank, which is every manifest that was not drawn. */
    public PinnedRepository(final String name, final String origin, final String sha, final String licence) {
        this(name, origin, sha, licence, UNDRAWN);
    }

    /** What a manifest states where its rows were chosen rather than drawn. */
    public static final long UNDRAWN = -1L;

    /** Where the clone of this repository is expected, beneath the directory a run names. */
    public Path under(final Path directory) {
        return directory.resolve(name);
    }
}
