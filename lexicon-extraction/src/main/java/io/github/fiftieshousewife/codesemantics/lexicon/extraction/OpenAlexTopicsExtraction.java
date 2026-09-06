package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads an OpenAlex topics snapshot into the two TSVs the lexicon bundles: the taxonomy, and the counts
 * OpenAlex sizes each topic by.
 *
 * <p>One pass writes both, from one snapshot, under one digest. A count cannot go in the taxonomy file —
 * its eight columns are SKOS's own text properties and SKOS states no property for the size of a concept's
 * corpus — and two files written by two runs could pin two snapshots, so they are written together.
 *
 * <p>OpenAlex states no revision for a snapshot beyond the day it was taken, so the download itself is the
 * citation: the manifest and the parts it names are accepted only if together they digest to the value
 * recorded here, and any other download fails instead of being bundled. The snapshot is read from a local
 * directory — {@code -Psource=<path>} — because the publisher serves it from S3 rather than over HTTP
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

    private final OpenAlexTopicSizesTsv sizes = new OpenAlexTopicSizesTsv();

    private final PinnedSet source;

    public OpenAlexTopicsExtraction() {
        this(SET_DIGEST);
    }

    /**
     * The same reading against a snapshot a test builds, so the whole pipeline is exercised and not the
     * refusal alone.
     */
    OpenAlexTopicsExtraction(final String setDigest) {
        this.source = new PinnedSet(SNAPSHOT, "snapshot members", setDigest);
    }

    public void extract(final Path directory, final Path taxonomyOutput, final Path sizesOutput)
            throws IOException {
        final byte[] stated = Files.readAllBytes(manifestIn(directory));
        final OpenAlexManifest manifest = OpenAlexManifest.of(stated);
        final List<ContentDigest.Member> parts = snapshot.in(directory, manifest);
        source.pinned(
                Stream.concat(Stream.of(new ContentDigest.Member(MANIFEST, stated)), parts.stream()).toList());
        final List<String> records = recordsIn(parts);
        final List<SkosConcept> read = concepts.in(records);
        final String cited = cited(manifest);
        new BundledResource(taxonomyOutput).written(rendered(read, cited));
        new BundledResource(sizesOutput)
                .written(sizes.render(concepts.topicsIn(records), cited, source.digest()));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read, final String cited) {
        return tsv.render(read, cited, source.digest());
    }

    PinnedSet source() {
        return source;
    }

    private List<String> recordsIn(final List<ContentDigest.Member> parts) throws IOException {
        final List<String> records = new ArrayList<>();
        for (final ContentDigest.Member part : parts) {
            records.addAll(lines.in(part.bytes()));
        }
        return records;
    }

    private static String cited(final OpenAlexManifest manifest) {
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
