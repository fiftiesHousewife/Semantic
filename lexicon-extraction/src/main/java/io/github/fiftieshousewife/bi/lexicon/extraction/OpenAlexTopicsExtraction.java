package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * Reads an OpenAlex topics snapshot into the bundled TSV.
 *
 * <p>OpenAlex states no revision for a snapshot beyond the day it was taken, so the download itself is the
 * citation: the manifest and the parts it names are accepted only if together they digest to the value
 * recorded here, and any other download fails instead of being bundled. The snapshot is read from a local
 * directory — {@code -Popenalex=<path>} — because the publisher serves it from S3 rather than over HTTP
 * from a permalink.
 */
public final class OpenAlexTopicsExtraction {

    private static final String SNAPSHOT = "s3://openalex/data/jsonl/topics/";

    private static final String MANIFEST = SNAPSHOT + "manifest";

    /** What a download may call the manifest: the publisher serves it unsuffixed, a browser suffixes it. */
    private static final List<String> MANIFEST_NAMES = List.of("manifest.json", "manifest");

    private static final String SET_DIGEST =
            "1536cbda3cc11838aaa67ef9c9c5f2b327a8ac8875ad07f306f4da44c16e8048";

    private final OpenAlexSnapshot snapshot = new OpenAlexSnapshot();

    private final GzippedLines lines = new GzippedLines();

    private final OpenAlexConcepts concepts = new OpenAlexConcepts();

    private final OpenAlexTopicsTsv tsv = new OpenAlexTopicsTsv();

    private final ContentDigest digest = new ContentDigest();

    private final String setDigest;

    public OpenAlexTopicsExtraction() {
        this(SET_DIGEST);
    }

    /** The same reading against a snapshot a test builds, so the whole pipeline is exercised and not the refusal alone. */
    OpenAlexTopicsExtraction(final String setDigest) {
        this.setDigest = setDigest;
    }

    public static void main(final String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: OpenAlexTopicsExtraction <snapshot directory> <tsv>");
        }
        new OpenAlexTopicsExtraction().extract(Path.of(args[0]), Path.of(args[1]));
    }

    public void extract(final Path directory, final Path output) throws IOException {
        final byte[] stated = Files.readAllBytes(manifestIn(directory));
        final OpenAlexManifest manifest = OpenAlexManifest.of(stated);
        final List<ContentDigest.Member> parts = snapshot.in(directory, manifest);
        pinned(Stream.concat(Stream.of(new ContentDigest.Member(MANIFEST, stated)), parts.stream()).toList());
        final List<SkosConcept> read = concepts.in(recordsIn(parts));
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(read, source(manifest), setDigest));
    }

    /** What was read is the cited snapshot only if the manifest and its parts digest to the recorded value. */
    List<ContentDigest.Member> pinned(final List<ContentDigest.Member> read) {
        final String found = digest.of(read);
        if (!setDigest.equals(found)) {
            throw new IllegalArgumentException("The manifest and the " + (read.size() - 1) + " parts read "
                    + "digest to " + found + ", where the snapshot this class cites digests to " + setDigest);
        }
        return read;
    }

    private List<String> recordsIn(final List<ContentDigest.Member> parts) throws IOException {
        final List<String> records = new ArrayList<>();
        for (final ContentDigest.Member part : parts) {
            records.addAll(lines.in(part.bytes()));
        }
        return records;
    }

    private static String source(final OpenAlexManifest manifest) {
        return "OpenAlex's own topics snapshot, " + SNAPSHOT + " at " + manifest.date() + ", the manifest "
                + "and the " + manifest.parts().size() + " parts it names, stating "
                + manifest.recordCount() + " records";
    }

    private static Path manifestIn(final Path directory) {
        return MANIFEST_NAMES.stream().map(directory::resolve).filter(Files::isRegularFile).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("The snapshot directory names no manifest "
                        + "(" + String.join(" or ", MANIFEST_NAMES) + "): " + directory));
    }
}
