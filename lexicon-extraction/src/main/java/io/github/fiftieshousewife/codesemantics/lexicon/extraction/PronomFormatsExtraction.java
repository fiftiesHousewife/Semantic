package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads a DROID signature file into the bundled TSV, from a local copy:
 * {@code -Psource=<path to DROID_SignatureFile_V125.xml>}.
 *
 * <p>PRONOM numbers its signature-file releases but states no content address for them, so the release
 * itself is the citation: whatever is read is accepted only if it digests to the recorded value, so a copy
 * that is not the release this file cites fails instead of being bundled.
 */
public final class PronomFormatsExtraction {

    private static final String SIGNATURE_FILE = "DROID_SignatureFile_V125.xml";

    private final PronomFormats formats = new PronomFormats();

    private final PronomFormatsTsv tsv = new PronomFormatsTsv();

    private final PinnedSet source = new PinnedSet(
            "PRONOM's DROID signature file V125, "
                    + "https://cdn.nationalarchives.gov.uk/documents/DROID_SignatureFile_V125.xml",
            "signature file",
            "d06f26aeb0f153013449bd2a2f912c8d480247c056fd9bfd3facdc39bff7a586");

    public void extract(final Path signatureFile, final Path output) throws IOException {
        final byte[] read = pinned(Files.readAllBytes(signatureFile));
        new BundledResource(output).written(rendered(formats.in(read)));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read) {
        return tsv.render(read, source.citation(), source.digest());
    }

    PinnedSet source() {
        return source;
    }

    /** What was read is the cited release only if it digests to the recorded value. */
    byte[] pinned(final byte[] read) {
        return source.pinned(List.of(new ContentDigest.Member(SIGNATURE_FILE, read))).getFirst().bytes();
    }
}
