package org.fifties.housewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

/**
 * The identifier git gives a file's contents: SHA-1 over the blob header and the bytes.
 *
 * <p>A revision names a blob, so this is what lets a copy on disk be <em>shown</em> to be the file a pinned
 * revision holds rather than asserted to be. An extraction that reads a local copy can then cite the
 * permalink it was pinned to, which is the only honest thing for a bundled resource's header to say.
 */
final class GitBlobId {

    private static final String ALGORITHM = "SHA-1";

    private static final String BLOB = "blob ";

    String of(final byte[] content) {
        final MessageDigest digest = sha1();
        digest.update((BLOB + content.length + '\0').getBytes(StandardCharsets.UTF_8));
        digest.update(content);
        return HexFormat.of().formatHex(digest.digest());
    }

    private static MessageDigest sha1() {
        try {
            return MessageDigest.getInstance(ALGORITHM);
        } catch (final NoSuchAlgorithmException e) {
            throw new IllegalStateException("The platform states no " + ALGORITHM + " implementation", e);
        }
    }
}
