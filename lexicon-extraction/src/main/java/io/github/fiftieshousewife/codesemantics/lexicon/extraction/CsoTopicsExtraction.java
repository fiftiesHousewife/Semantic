package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads the Computer Science Ontology's published CSV into the bundled TSV.
 *
 * <p>CSO's download states no revision, so there is no commit to pin and the archive itself is the
 * citation: whatever is read is accepted only if it digests to the recorded value, so a copy that is not
 * the archive this file cites fails instead of being bundled. The CSV is read from a local copy —
 * {@code -Psource=<path to CSO.3.5.csv>} — because the publisher serves it inside a zip archive.
 */
public final class CsoTopicsExtraction {

    private static final String CSV = "CSO.3.5.csv";

    private final CsoConcepts concepts = new CsoConcepts();

    private final CsoTopicsTsv tsv = new CsoTopicsTsv();

    private final PinnedSet source = new PinnedSet(
            "CSO 3.5, https://cso.kmi.open.ac.uk/download (CSO.3.5.csv)", "CSV",
            "1fa427ecb26a92d6077a54b5da41833e3eea6a194567091e336e8425f4cc11d4");

    public void extract(final Path csv, final Path output) throws IOException {
        final byte[] read = pinned(Files.readAllBytes(csv));
        new BundledResource(output).written(rendered(concepts.in(new String(read, StandardCharsets.UTF_8))));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read) {
        return tsv.render(read, source.citation(), source.digest());
    }

    PinnedSet source() {
        return source;
    }

    /** What was read is the cited archive's CSV only if it digests to the recorded value. */
    byte[] pinned(final byte[] read) {
        return source.pinned(List.of(new ContentDigest.Member(CSV, read))).getFirst().bytes();
    }
}
