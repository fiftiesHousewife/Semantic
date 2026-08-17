package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Reads NIST's OSCAL edition of the Cybersecurity Framework into the bundled TSV. The catalogue is taken at
 * a pinned revision rather than at a branch, for the same reason every citation this library renders is a
 * permalink: a reading that cannot be reproduced is not a citation.
 *
 * <p>Whatever it reads — the published catalogue or the copy {@code -Pcatalog=<path>} names — is accepted
 * only if git would give it the blob id that revision holds. So an extraction run without a network route
 * still writes the permalink as its source, having shown rather than assumed that it read what the
 * permalink holds, and a fetch answered by something other than the catalogue fails instead of being
 * bundled.
 */
public final class NistCsfExtraction {

    private static final String REVISION = "78650f02ad9321bb7b817846f8fbd4f2bcd620de";

    private static final URI CATALOG = URI.create("https://raw.githubusercontent.com/usnistgov/oscal-content/"
            + REVISION + "/nist.gov/CSF/v2.0/json/NIST_CSF_v2.0_catalog.json");

    private static final String CATALOG_BLOB = "7b8b2d8b45cbf6fca093fcc5ae9f17ca9938b425";

    private final CsfConcepts concepts = new CsfConcepts();

    private final NistCsfTsv tsv = new NistCsfTsv();

    private final GitBlobId blobId = new GitBlobId();

    public static void main(final String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: NistCsfExtraction <catalog or blank> <tsv>");
        }
        new NistCsfExtraction().extract(args[0], Path.of(args[1]));
    }

    public void extract(final String catalog, final Path output) throws IOException {
        final byte[] read = catalog.isBlank() ? published() : Files.readAllBytes(Path.of(catalog));
        final OscalCatalog document = new OscalCatalog(pinned(read));
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(concepts.in(document.controls()), document.version(),
                CATALOG.toString()));
    }

    /** What was read is the pinned revision's catalogue only if git would give it that revision's blob id. */
    String pinned(final byte[] catalog) {
        final String read = blobId.of(catalog);
        if (!CATALOG_BLOB.equals(read)) {
            throw new IllegalArgumentException("The catalogue read is blob " + read + ", where revision "
                    + REVISION + " holds blob " + CATALOG_BLOB);
        }
        return new String(catalog, StandardCharsets.UTF_8);
    }

    private static byte[] published() throws IOException {
        try (HttpClient client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.NORMAL).build()) {
            final HttpResponse<byte[]> response = client.send(HttpRequest.newBuilder(CATALOG).build(),
                    HttpResponse.BodyHandlers.ofByteArray());
            if (response.statusCode() != 200) {
                throw new IOException("Fetch failed with HTTP " + response.statusCode() + ": " + CATALOG);
            }
            return response.body();
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Fetch interrupted: " + CATALOG, e);
        }
    }
}
