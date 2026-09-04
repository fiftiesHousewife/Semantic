package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;
import java.util.Locale;

/**
 * One published set of files pinned by a digest over its members: the sibling of {@link PinnedSource} for a
 * source that is not one git blob.
 *
 * <p>A revision names a blob, so a single file can be shown to be the one a permalink holds. A source
 * published as a hundred files has no such id, and {@link ContentDigest} covers the whole set with one
 * recorded value instead. What was read is bundled only if it digests to that value, so a checkout of
 * another revision, a member edited underneath the pin, and a member added or removed each fail rather
 * than being bundled.
 *
 * <p>The digest is this library's rather than the publisher's, which is the weaker claim {@code
 * ContentDigest} states, and the provenance header a caller writes has to say so.
 */
final class PinnedSet {

    private final String source;

    private final String members;

    private final String digest;

    private final ContentDigest content = new ContentDigest();

    /**
     * @param source  the citation a header renders — a tree URL at a revision, or the publisher's own
     *                naming of a download that states no revision
     * @param members what the set is a set of, as the plural noun the refusal reads with
     * @param digest  the digest recorded for that set
     */
    PinnedSet(final String source, final String members, final String digest) {
        this.source = source;
        this.members = members;
        this.digest = digest;
    }

    /** The citation a provenance header renders as its source. */
    String citation() {
        return source;
    }

    String digest() {
        return digest;
    }

    /** The members, only if together they digest to the recorded value. */
    List<ContentDigest.Member> pinned(final List<ContentDigest.Member> read) {
        final String found = content.of(read);
        if (!digest.equals(found)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "%s read as %s %s digesting to %s, where it holds digest %s",
                    source, read.size(), members, found, digest));
        }
        return read;
    }
}
