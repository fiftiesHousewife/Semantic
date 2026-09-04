package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads the IANA media type registry's published CSVs into the bundled TSV.
 *
 * <p>The registry states no revision, so the file set itself is the citation: whatever is read is accepted
 * only if it digests to the recorded value, so a copy that is not the file set this class cites fails
 * instead of being bundled. The CSVs are read from a local directory — {@code -Psource=<path>} — one
 * file per registry as IANA serves them at
 * {@code https://www.iana.org/assignments/media-types/<registry>.csv}.
 */
public final class MediaTypeExtraction {

    private static final String SOURCE =
            "IANA media types, https://www.iana.org/assignments/media-types/ (application.csv, audio.csv, "
                    + "font.csv, haptics.csv, image.csv, message.csv, model.csv, multipart.csv, text.csv, "
                    + "video.csv), retrieved 2026-08-19";

    /** The registries with published CSVs, in the order the digest covers them. */
    static final List<String> REGISTRIES = List.of("application", "audio", "font", "haptics", "image",
            "message", "model", "multipart", "text", "video");

    private final MediaTypeConcepts concepts = new MediaTypeConcepts();

    private final MediaTypesTsv tsv = new MediaTypesTsv();

    private final PinnedSet source = new PinnedSet(SOURCE, "registry CSVs",
            "fd3eea02e8610628e4a3b6eb0b66a415fdbf973ce1e73e667be24b12cd505aeb");

    public void extract(final Path directory, final Path output) throws IOException {
        final List<ContentDigest.Member> read = source.pinned(readAll(directory));
        final List<SkosConcept> types = read.stream()
                .flatMap(member -> concepts
                        .in(member.name().replace(".csv", ""),
                                new String(member.bytes(), StandardCharsets.UTF_8))
                        .stream())
                .toList();
        new BundledResource(output).written(tsv.render(types, source.citation(), source.digest()));
    }

    PinnedSet source() {
        return source;
    }

    private static List<ContentDigest.Member> readAll(final Path directory) throws IOException {
        return REGISTRIES.stream()
                .map(registry -> registry + ".csv")
                .map(file -> {
                    try {
                        return new ContentDigest.Member(file, Files.readAllBytes(directory.resolve(file)));
                    } catch (final IOException e) {
                        throw new IllegalArgumentException(String.format(Locale.ROOT,
                                "The registry directory is missing %s",
                                file), e);
                    }
                })
                .toList();
    }
}
