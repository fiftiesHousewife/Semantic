package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * One published file pinned to a revision: the copy a caller names, or the permalink's own bytes where the
 * caller names none, accepted either way only if git would give the bytes the blob id that revision holds.
 *
 * <p>An extraction run without a network route still writes the permalink as its source, having shown
 * rather than assumed that it read what the permalink holds, and a fetch answered by anything else fails
 * instead of being bundled.
 */
final class PinnedSource {

    private final URI permalink;
    private final String revision;
    private final String blob;
    private final GitBlobId blobId = new GitBlobId();

    PinnedSource(final URI permalink, final String revision, final String blob) {
        this.permalink = permalink;
        this.revision = revision;
        this.blob = blob;
    }

    String permalink() {
        return permalink.toString();
    }

    /** The named copy, or the permalink where the caller names none — pinned either way. */
    byte[] read(final String copy) throws IOException {
        return pinned(copy.isBlank() ? published() : Files.readAllBytes(Path.of(copy)));
    }

    /** The bytes, only if git would give them the blob id the pinned revision holds. */
    byte[] pinned(final byte[] read) {
        final String found = blobId.of(read);
        if (!blob.equals(found)) {
            throw new IllegalArgumentException(permalink + " read as blob " + found + ", where revision "
                    + revision + " holds blob " + blob);
        }
        return read;
    }

    private byte[] published() throws IOException {
        try (HttpClient client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.NORMAL).build()) {
            final HttpResponse<byte[]> response = client.send(HttpRequest.newBuilder(permalink).build(),
                    HttpResponse.BodyHandlers.ofByteArray());
            if (response.statusCode() != 200) {
                throw new IOException("Fetch failed with HTTP " + response.statusCode() + ": " + permalink);
            }
            return response.body();
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Fetch interrupted: " + permalink, e);
        }
    }
}
