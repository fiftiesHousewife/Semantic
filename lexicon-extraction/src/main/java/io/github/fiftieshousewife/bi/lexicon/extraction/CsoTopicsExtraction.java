package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Reads the Computer Science Ontology's published CSV into the bundled TSV.
 *
 * <p>CSO's download states no revision, so there is no commit to pin and the archive itself is the
 * citation: whatever is read is accepted only if it digests to the recorded value, so a copy that is not
 * the archive this file cites fails instead of being bundled. The CSV is read from a local copy —
 * {@code -Pcso=<path to CSO.3.5.csv>} — because the publisher serves it inside a zip archive.
 */
public final class CsoTopicsExtraction {

    private static final String SOURCE = "CSO 3.5, https://cso.kmi.open.ac.uk/download (CSO.3.5.csv)";

    private static final String CSV = "CSO.3.5.csv";

    private static final String CSV_DIGEST =
            "1fa427ecb26a92d6077a54b5da41833e3eea6a194567091e336e8425f4cc11d4";

    private final CsoConcepts concepts = new CsoConcepts();

    private final CsoTopicsTsv tsv = new CsoTopicsTsv();

    private final ContentDigest digest = new ContentDigest();

    public static void main(final String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: CsoTopicsExtraction <CSO.3.5.csv> <tsv>");
        }
        new CsoTopicsExtraction().extract(Path.of(args[0]), Path.of(args[1]));
    }

    public void extract(final Path csv, final Path output) throws IOException {
        final byte[] read = pinned(Files.readAllBytes(csv));
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(concepts.in(new String(read, StandardCharsets.UTF_8)),
                SOURCE, CSV_DIGEST));
    }

    /** What was read is the cited archive's CSV only if it digests to the recorded value. */
    byte[] pinned(final byte[] read) {
        final String found = digest.of(List.of(new ContentDigest.Member(CSV, read)));
        if (!CSV_DIGEST.equals(found)) {
            throw new IllegalArgumentException("The CSV read digests to " + found + ", where the archive "
                    + "this file cites digests to " + CSV_DIGEST);
        }
        return read;
    }
}
