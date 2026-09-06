package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Reads the NIST CSRC glossary export into the bundled TSV, from a local copy of the JSON the published
 * archive holds: {@code -Psource=<path to glossary-export.json, unzipped>}.
 *
 * <p>The glossary is rebuilt continuously and states no version, so the export itself is the citation:
 * whatever is read is accepted only if it digests to the recorded value, so a copy that is not the export
 * this file cites fails instead of being bundled.
 */
public final class CsrcGlossaryExtraction {

    private static final String EXPORT = "glossary-export.json";

    private final CsrcConcepts concepts = new CsrcConcepts();

    private final CsrcGlossaryTsv tsv = new CsrcGlossaryTsv();

    private final PinnedSet source = new PinnedSet(
            "NIST CSRC glossary export, https://csrc.nist.gov/csrc/media/glossary/glossary-export.zip "
                    + "(glossary-export.json, unzipped), retrieved 2026-09-06",
            "glossary export",
            "631fa8bc22025a45cb289002083905746a7c43c09ead23e4689ff9970e149591");

    public void extract(final Path export, final Path output) throws IOException {
        final byte[] read = pinned(Files.readAllBytes(export));
        new BundledResource(output).written(rendered(concepts.in(read)));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final CsrcConcepts.Read read) {
        return tsv.render(read, source.citation(), source.digest());
    }

    PinnedSet source() {
        return source;
    }

    /** What was read is the cited export only if it digests to the recorded value. */
    byte[] pinned(final byte[] read) {
        return source.pinned(List.of(new ContentDigest.Member(EXPORT, read))).getFirst().bytes();
    }
}
