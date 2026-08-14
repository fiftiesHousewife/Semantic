package org.fifties.housewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.List;

/**
 * A SHA-256 over bytes, the sibling of {@link GitBlobId} for a source that is not one git blob.
 *
 * <p>{@code GitBlobId} pins a source by asking whether git would give the bytes the id the pinned revision
 * holds, which is the strongest form of the citation this library makes: the publisher's own content
 * address. It only answers for one file. A source published as a hundred files has no single such id, and
 * pinning one of them would pin the manifest while leaving the vocabulary free to move underneath it.
 *
 * <p>So a set is pinned by a digest over the digests: each member's own blob id, in a fixed order, hashed
 * together. Every member is then covered by one recorded constant, and a member added, removed or edited
 * moves it. The digest is <em>ours</em> rather than the publisher's, which is a weaker claim than a blob id
 * and the provenance header has to say so.
 */
public final class ContentDigest {

    private static final String ALGORITHM = "SHA-256";

    private static final String SEPARATOR = "\n";

    private final GitBlobId blobId = new GitBlobId();

    /** The digest of one member set: each member's blob id under its own name, in the order given. */
    public String of(final List<Member> members) {
        return hexOf(members.stream()
                .map(member -> member.name() + " " + blobId.of(member.bytes()))
                .reduce("", (all, line) -> all + line + SEPARATOR)
                .getBytes(StandardCharsets.UTF_8));
    }

    String hexOf(final byte[] bytes) {
        return HexFormat.of().formatHex(digest().digest(bytes));
    }

    private static MessageDigest digest() {
        try {
            return MessageDigest.getInstance(ALGORITHM);
        } catch (final NoSuchAlgorithmException e) {
            throw new IllegalStateException("The platform states no " + ALGORITHM, e);
        }
    }

    /** One member of a set: what it is called, and what it holds. */
    public static final class Member {

        private final String name;

        private final byte[] bytes;

        public Member(final String name, final byte[] bytes) {
            this.name = name;
            this.bytes = bytes.clone();
        }

        public String name() {
            return name;
        }

        public byte[] bytes() {
            return bytes.clone();
        }
    }
}
